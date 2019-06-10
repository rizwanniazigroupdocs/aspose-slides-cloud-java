/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Slides for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.aspose.slides;

import com.aspose.slides.api.SlidesApi;
import com.aspose.slides.model.request.UploadFileRequest;
import com.aspose.slides.model.request.DeleteFileRequest;
import com.aspose.slides.testrules.FileAction;
import com.aspose.slides.testrules.FileRule;
import com.aspose.slides.testrules.ResultRule;
import com.aspose.slides.testrules.TestRule;
import com.aspose.slides.testrules.TestRules;
import com.aspose.slides.testrules.ValueRule;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ApiTest {
    private Configuration configuration;
    private TestRules testRules;
    private SlidesApi api;

    private final String folderName = "TempSlidesSDK";

    public String getFolderName() {
        return folderName;
    }
 
    private final String fileName = "test.ppt";

    public String getFileName() {
        return fileName;
    }
 
    private final String changedFileName = "changedtest.ppt";

    public String getChangedFileName() {
        return changedFileName;
    }
 
    private final String templateFileName = "TemplateCV.pptx";

    public String getTemplateFileName() {
        return templateFileName;
    }
    
    protected Configuration getConfiguration() {
        return configuration;
    }

    public String getFilePath() {
        return "TestData/" + getFileName();
    }

    public String getFileUploadPath() {
        return getFolderName() + "/" + getFileName();
    }

    protected ApiTest() {
        try {
            String configContents = new String(Files.readAllBytes(Paths.get("testConfig.json")), Charset.defaultCharset());
            configuration = new JSON().deserialize(configContents, new TypeToken<Configuration>(){}.getType());
        } catch (IOException ex) {
            configuration = new Configuration();
        }
        api = new SlidesApi(getConfiguration());
        try {
            String rulesContents = new String(Files.readAllBytes(Paths.get("testRules.json")), Charset.defaultCharset());
            testRules = new JSON().deserialize(rulesContents, new TypeToken<TestRules>(){}.getType());
        } catch (IOException ex) {
            testRules = new TestRules();
        }
    }

    protected Object getTestValue(String type, String functionName, String name) {
        Object value = "test" + name;
        for (TestRule r : getRules(testRules.getValues(), functionName, name)) {
            ValueRule vr = (ValueRule)r;
            if (vr.getIsValueSet()) {
                value = vr.getValue();
            }
        }
        return getTypedTestValue(type, value);
    }

    protected Object invalidizeTestValue(String type, Object value, String functionName, String name) {
        Object invalidValue = null;
        for (TestRule r : getRules(testRules.getValues(), functionName, name)) {
            ValueRule vr = (ValueRule)r;
            if (vr.getIsInvalidValueSet()) {
                invalidValue = vr.getInvalidValue();
            }
        }
        return getTypedTestValue(type, untemplatize(invalidValue, value));
    }

    protected void initialize(String functionName, String invalidParameterName, Object invalidParameterValue) throws ApiException {
        Map<String, FileRule> files = new HashMap<String, FileRule>();
        for (TestRule r : getRules(testRules.getFiles(), functionName, invalidParameterName)) {
            FileRule fr = (FileRule)r;
            String actualName = (String)untemplatize(fr.getFile(), invalidParameterValue);
            String path = "TempSlidesSDK";
            if (fr.getFolder() != null) {
                path = (String)untemplatize(fr.getFolder(), invalidParameterValue);
            }
            path = path + "/" + actualName;
            files.put(path, fr);
            fr.setActualName(actualName);
        }
        for (String path : files.keySet()) {
            FileRule rule = files.get(path);
            if (rule.getAction() == FileAction.Put) {
                UploadFileRequest request = new UploadFileRequest();
                try {
                    request.setFile(Files.readAllBytes(Paths.get("TestData/" + rule.getActualName())));
                } catch (IOException ex) {
                    throw new ApiException(ex.getMessage());
                }
                request.setPath(path);
                api.uploadFile(request);
            }
            else if (rule.getAction() == FileAction.Delete)
            {
                DeleteFileRequest request = new DeleteFileRequest();
                request.setPath(path);
                api.deleteFile(request);
            }
        }
    }

    protected void assertException(ApiException ex, String name, String functionName, Object value) {
        Integer code = 0;
        String message = "Unexpeceted message";
        for (TestRule rule : getRules(testRules.getResults(), functionName, name)) {
            ResultRule rr = (ResultRule)rule;
            if (rr.getCode() != null) {
                code = rr.getCode();
            }
            if (rr.getMessage() != null) {
                message = rr.getMessage();
            }
        }
        if (ex.getCode() != 0) {
            assertThat(ex.getCode(), is(code));
            assertThat(ex.getMessage(), containsString((String)untemplatize(message, value)));
        }
    }

    protected void assertResponse(String name, String functionName) {
        Boolean failed = true;
        for (TestRule rule : getRules(testRules.getOKToNotFail(), functionName, name)) {
            failed = false;
        }
        if (failed) {
            fail("Must have failed.");
        }
    }
    
    private List<TestRule> getRules(List<? extends TestRule> rules, String functionName, String fieldName) {
        List<TestRule> filteredRules = new ArrayList<TestRule>();
        for (TestRule r: rules) {
            if (applies(r, functionName, fieldName)) {
                filteredRules.add(r);
            }
        }
        return filteredRules;
    }

    private Boolean applies(TestRule rule, String functionName, String fieldName) {
        return (rule.getMethod() == null || (functionName != null && rule.getMethod().equalsIgnoreCase(functionName)))
            && (rule.getInvalid() == null || ((fieldName != null) == rule.getInvalid()))
            && (rule.getParameter() == null || (fieldName != null && rule.getParameter().equalsIgnoreCase(fieldName)))
            && (rule.getLanguage() == null || "java".equals(rule.getLanguage().toLowerCase()));
    }

    private Object untemplatize(Object template, Object value) {
        if (template == null && value != null && value instanceof String) {
            return value;
        }
        if (template != null && template instanceof String) {
            return ((String)template).replace("%v", value == null ? "" : value.toString());
        }
        return template;
    }
    
    public static Object searchEnum(Class<?> enumeration, String search) {
        for (Object each : enumeration.getEnumConstants()) {
            if (((Enum)each).name().compareToIgnoreCase(search) == 0) {
                return each;
            }
        }
        return null;
    }    

    public static Integer toInteger(Object value) {
        if (value != null) {
            return Integer.decode(value.toString());
        }
        return null;
    }
    
    private Object getTypedTestValue(String type, Object value) {
        if (value == null) {
            return null;
        }
        if ("byte[]".equals(type)) {
            try {
                return Files.readAllBytes(Paths.get(getFilePath()));
            } catch (IOException ex) {
                Logger.getLogger(ApiTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ("Integer".equals(type)) {
            return Integer.decode(value.toString());
        }
        if ("Double".equals(type)) {
            return Double.parseDouble(value.toString());
        }
        if ("Boolean".equals(type)) {
            return "true".equals(value.toString().toLowerCase());
        }
        if ("List<FileInfo>".equals(type)) {
            return null;
        }
        if ("List<Integer>".equals(type)) {
            List<Integer> values = new ArrayList<Integer>();
            for (int i = 0; i < ((JsonArray)value).size(); i++) {
                values.add(((JsonArray)value).get(i).getAsInt());
            }
            return values;
        }
        try {
            Class<?> classInfo = Class.forName("com.aspose.slides.model." + type);
            if (classInfo.isEnum()) {
                return searchEnum(classInfo, value.toString());
            }
            return new Gson().fromJson((JsonObject)value, classInfo);
        } catch (Exception ex) {
            //Exception just means not a model class; ignore it
        }
        return value;
    }
}
