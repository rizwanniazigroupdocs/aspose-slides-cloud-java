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

import com.aspose.slides.model.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.reflect.TypeToken;
import com.aspose.storage.api.StorageApi;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.endsWith;
import org.junit.After;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

public class ApiTest {
    private Configuration configuration;
    private final StorageApi storageApi;

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
        storageApi = new StorageApi(configuration.getAppKey(), configuration.getAppSid());
        storageApi.setBasePath("http://api-dev.aspose.cloud/v1.1");
    }

    protected Object getTestValue(String functionName, String name, String type) {
        if ("String".equals(type)) {
            if (name.toLowerCase().endsWith("storage")) {
                return null;
            }
            if ("name".equals(name)) {
                if ("putNewPresentation".equals(functionName)) {
                    return getChangedFileName();
                }
                if ("deleteSlidesCleanSlidesList".equals(functionName)
                    || "putSlidesSlide".equals(functionName)
                    || "postSlidesAdd".equals(functionName)) {
                    return "test-unprotected.ppt";
                }
                return getFileName();
            }
            if ("propertyName".equals(name)) {
                return "testProperty";
            }
            if ("folder".equals(name)) {
                return getFolderName();
            }
            if ("path".equals(name)) {
                return "";
            }
            if ("templatePath".equals(name) || "cloneFrom".equals(name) || "source".equals(name)) {
                if ("postSlidesDocument".equals(functionName)) {
                    return getFolderName() + "/" + getTemplateFileName();
                }
                return getFolderName() + "/" + getFileName();
            }
            if ("data".equals(name)) {
                return "<staff><person><name>John Doe</name><address><line1>10 Downing Street</line1><line2>London</line2></address><phone>+457 123456</phone><bio>Hi, I'm John and this is my CV</bio><skills><skill><title>C#</title><level>Excellent</level></skill><skill><title>C++</title><level>Good</level></skill><skill><title>Java</title><level>Average</level></skill></skills></person></staff>";
            }
            if (name.toLowerCase().endsWith("password")) {
                if ("deleteSlidesCleanSlidesList".equals(functionName)
                    || "putSlidesSlide".equals(functionName)
                    || "postSlidesAdd".equals(functionName)) {
                    return null;
                }
                return "password";
            }
            return "test" + name;
        }
        if ("Integer".equals(type)) {
            if ("shapeToClone".equals(name)) {
                return null;
            }
            if ("shapeIndex".equals(name)) {
                return 3;
            }
            return 1;
        }
        if ("oldPositions".equals(name)) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            return list;
        }
        if ("newPositions".equals(name)) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(2);
            list.add(1);
            return list;
        }
        if ("byte[]".equals(type)) {
            try {
                return Files.readAllBytes(Paths.get(getFilePath()));
            } catch (IOException ex) {
                Logger.getLogger(ApiTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ("properties".equals(name)) {
            DocumentProperties properties = new DocumentProperties();
            properties.setList(new ArrayList<DocumentProperty>());
            return properties;
        }
        if ("property".equals(name)) {
            DocumentProperty property = new DocumentProperty();
            property.setName("testProperty001");
            property.setValue("testValue002");
            return property;
        }
        try {
            Class<?> classInfo = Class.forName("com.aspose.slides.model." + type);
            if (classInfo.isEnum()) {
                return classInfo.getEnumConstants()[0];
            } else {
                Object dto = classInfo.getConstructor().newInstance();
                if (dto instanceof Portion) {
                    ((Portion)dto).setText("test portion");
                } else if (dto instanceof NotesSlide) {
                    ((NotesSlide)dto).setText("test note");
                } else if (dto instanceof LayoutSlide) {
                    LayoutSlide layoutSlide = (LayoutSlide)dto;
                    ResourceUriElement uriElement = new ResourceUriElement();
                    ResourceUri uri = new ResourceUri();
                    uri.setHref("masterSlides/2");
                    uriElement.setUri(uri);
                    layoutSlide.setMasterSlide(uriElement);
                    return layoutSlide;
                } else if (dto instanceof Slide) {
                    Slide slide = (Slide)dto;
                    ResourceUriElement uriElement = new ResourceUriElement();
                    ResourceUri uri = new ResourceUri();
                    uri.setHref("TitleOnly");
                    uriElement.setUri(uri);
                    slide.setLayoutSlide(uriElement);
                    return slide;
                } else if (dto instanceof ShapeBase) {
                    dto = new Shape();
                    Shape shape = (Shape)dto;
                    shape.setType(ShapeType.SHAPE);
                    shape.setShapeType(CombinedShapeType.BENTARROW);
                    shape.setGeometryShapeType(GeometryShapeType.RECTANGLE);
                    shape.setText("testShape");
                }
                return dto;
            }
        } catch (Exception ex) {
            //Exception just means not a model class; ignore it
        }
        return null;
    }

    protected Object invalidizeTestValue(Object value, String name, String type) {
        if ("String".equals(type)) {
            if (value == null) {
                return "invalid";
            }
            if (name == "name") {
                return "invalid" + value;
            }
            return value + "invalid";
        }
        if ("Integer".equals(type)) {
            return 593;
        }
        if ("List<Integer>".equals(type)) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(593);
            return list;
        }
        try {
            Class<?> enumClass = Class.forName("com.aspose.slides.model." + type);
            if (enumClass.isEnum()) {
                return enumClass.getEnumConstants()[1];
            }
        } catch (Exception ex) {
            //Exception just means not a model class; ignore it
        }
        return null;
    }
    
    protected void initialize(String functionName, String invalidParameterName, Object invalidParameterValue) {
        if ("deleteSlidesCleanSlidesList".equals(functionName) || "putSlidesSlide".equals(functionName)) {
            storageApi.PutCreate("TempSlidesSDK/test-unprotected.ppt", null, null, new File(Paths.get("TestData/test-unprotected.ppt").toUri()));
        } else {
            storageApi.PutCreate(getFileUploadPath(), null, null, new File(Paths.get(getFilePath()).toUri()));
        }
        if (functionName.equals("postSlidesDocument")) {
            storageApi.PutCreate(getFolderName() + "/" + getTemplateFileName(), null, null, new File(Paths.get("TestData/templateCV.pptx").toUri()));
            storageApi.DeleteFile(getFileUploadPath(), null, null);
        }
        if ("folder".equals(invalidParameterName)) {
            storageApi.DeleteFile(invalidParameterValue + "/" + getFileName(), null, null);
        }
        if ("name".equals(invalidParameterName)) {
            storageApi.DeleteFile(getFolderName() + "/" + invalidParameterValue, null, null);
        }
        if ("putNewPresentation".equals(functionName) || "postSlidesDocument".equals(functionName)) {
            storageApi.DeleteFile(getFolderName() + "invalid/" + getChangedFileName(), null, null);
            storageApi.DeleteFile(getFolderName() + "/" + getChangedFileName(), null, null);
        }
    }
    
    protected void assertException(ApiException ex, String name, String functionName) {
        if ("path".equals(name) && functionName.endsWith("AddNewShape")) {
            assertThat(ex.getCode(), is(405));
        } else if (("propertyName".equals(name) && !functionName.startsWith("put"))
                || (("name".equals(name) || "folder".equals(name) || "cloneFrom".equals(name) || "source".equals(name))
                   && !("putSlidesDocumentFromHtml".equals(functionName)
                        || "putNewPresentation".equals(functionName)
                        || "postAddNotesSlide".equals(functionName)
                        || (functionName.startsWith("put")
                            && (functionName.contains("Shape") || functionName.contains("Paragraph") || functionName.contains("Portion"))
                            && !(functionName.startsWith("putSet")
                                || functionName.startsWith("putSlideShapeInfo")
                                || functionName.contains("NotesSlide")))))) {
            assertThat(ex.getCode(), is(404));
            if ("propertyName".equals(name)) {
                assertThat(ex.getMessage(), startsWith("Property "));
                assertThat(ex.getMessage(), endsWith("not found."));
            } else {
                assertThat(ex.getMessage(), startsWith("AmazonS3 exception: Error 'The specified key does not exist.'"));
            }
        } else {
            assertThat(ex.getCode(), is(400));
            if (name.toLowerCase().endsWith("password")) {
                if ("deleteSlidesCleanSlidesList".equals(functionName)
                    || "putSlidesSlide".equals(functionName)
                    || "postSlidesAdd".equals(functionName)) {
                    assertThat(ex.getMessage(), startsWith("An attempt was made to move the position before the beginning of the stream."));
                } else if ("postAddNotesSlide".equals(functionName)
                        || "putSlidesDocumentFromHtml".equals(functionName)
                        || ("putNewPresentation".equals(functionName) && "templatePassword".equals(name))) {
                    assertThat(ex.getMessage(), startsWith("Object reference not set to an instance of an object."));
                } else {
                    assertThat(ex.getMessage(), startsWith("Invalid password."));
                }
            } else if ("putNewPresentation".equals(functionName)) {
               assertThat(ex.getMessage(), startsWith("Object reference not set to an instance of an object"));
            } else if ("storage".equals(name)) {
                if ("putSlidesDocumentFromHtml".equals(functionName) || "postAddNotesSlide".equals(functionName) || "postSlidesDocument".equals(functionName)) {
                    assertThat(ex.getMessage(), startsWith("Object reference not set to an instance of an object"));
                } else {
                    assertThat(ex.getMessage(), startsWith("The specified storage was not found or is not associated with the application"));
                }
            } else if ("path".equals(name)) {
                if (functionName.endsWith("Shapes")) {
                    assertThat(ex.getMessage(), startsWith("The request is invalid"));
                } else {
                    assertThat(ex.getMessage(), startsWith("The HTTP resource that matches the request URI"));
                }
            } else if ("slideIndex".equals(name) || "slides".equals(name)) {
                if (("slides".equals(name) && functionName.startsWith("getNotesSlide"))
                        || "getSlidesSlideComments".equals(functionName)
                        || "getNotesSlide".equals(functionName)
                        || "getNotesSlideWithFormat".equals(functionName)) {
                    assertThat(ex.getMessage(), startsWith("Invalid index"));
                } else if ("postSlidesReorder".equals(functionName)) {
                    assertThat(ex.getMessage(), startsWith("Index was out of range."));
                } else {
                    assertThat(ex.getMessage(), startsWith("Wrong slide index"));
                }
            } else if ("shapeIndex".equals(name) || "shapes".equals(name)) {
                assertThat(ex.getMessage(), startsWith("Wrong shape index"));
            } else if ("paragraphIndex".equals(name) || "paragraphs".equals(name)) {
                assertThat(ex.getMessage(), startsWith("Wrong paragraph index"));
            } else if ("portionIndex".equals(name) || "portions".equals(name)) {
                assertThat(ex.getMessage(), startsWith("Wrong portion index"));
            } else if ("placeholderIndex".equals(name)) {
                assertThat(ex.getMessage(), startsWith("Placeholder with specified index doesn't exist"));
            } else if ("index".equals(name)
                || "newPosition".equals(name)
                || "oldPositions".equals(name)
                || "newPositions".equals(name)
                || ("position".equals(name)
                    && ("postSlidesReorderPosition".equals(functionName)
                        || "postSlidesAdd".equals(functionName)
                        || "postSlidesCopy".equals(functionName)))) {
                assertThat(ex.getMessage(), startsWith("Specified argument was out of the range of valid values."));
            } else if ("position".equals(name)) {
                assertThat(ex.getMessage(), startsWith("Index must be within the bounds of the List"));
            } else if ("cloneFromPosition".equals(name) || "shapeToClone".equals(name)) {
                assertThat(ex.getMessage(), startsWith("Invalid index"));
            } else if ("oldPosition".equals(name) || "slideToCopy".equals(name)) {
                assertThat(ex.getMessage(), startsWith("Index was out of range"));
            } else if ("cloneFromStorage".equals(name)) {
                assertThat(ex.getMessage(), startsWith("The specified storage was not found or is not associated with the application."));
            } else if ("background".equals(name)) {
                assertThat(ex.getMessage(), startsWith("Color must be in format"));
            } else if ("document".equals(name)) {
                assertThat(ex.getMessage(), startsWith("The stream is empty."));
            } else if ("pipeline".equals(name) || "files".equals(name)) {
                assertThat(ex.getMessage(), startsWith("Pipeline dto expected."));
            } else if ("to".equals(name)) {
                assertThat(ex.getMessage(), startsWith("Invalid 'to' parameter"));
            } else if ("slideDto".equals(name)) {
                assertThat(ex.getMessage(), startsWith("DTO of the slide expected in request body"));
            } else if ("dto".equals(name)) {
                if (functionName.endsWith("AddNewPortion")) {
                    assertThat(ex.getMessage(), startsWith("Invalid shape's path"));
                } else if ("putUpdateNotesSlide".equals(functionName)) {
                    assertThat(ex.getMessage(), startsWith("Value cannot be null"));
                } else if ("postNotesSlideAddNewShape".equals(functionName) || "postAddNewShape".equals(functionName)) {
                    assertThat(ex.getMessage(), startsWith("Invalid shape's path."));
                } else {
                    assertThat(ex.getMessage(), startsWith("Shape dto is not specified"));
                }
            } else {
                assertThat(ex.getMessage(), startsWith("Object reference not set to an instance of an object."));
            }
        }
    }

    protected void assertSuccessfulException(Exception ex, String functionName) throws Exception
    {
        if (!"postSlidesDocument".equals(functionName)) {
            throw ex;
        }
    }
    
    protected void assertResponse(String name, String functionName) {
        if (!"format".equals(name)
                && !"sizeType".equals(name)
                && !"options".equals(name)
                && !"propertyName".equals(name)
                && !"fontsFolder".equals(name)
                && !"jpegQuality".equals(name)
                && !"stream".equals(name)
                && !"width".equals(name)
                && !"height".equals(name)
                && !"outPath".equals(name)
                && !"scaleType".equals(name)
                && !"scaleX".equals(name)
                && !"scaleY".equals(name)
                && !"bounds".equals(name)
                && !"html".equals(name)
                && !"source".equals(name)
                && !"withEmpty".equals(name)
                && !"oldValue".equals(name)
                && !"newValue".equals(name)
                && !"oldPositions".equals(name)
                && !"newPositions".equals(name)
                && !"ignoreCase".equals(name)
                && !"isImageDataEmbedded".equals(name)
                && !"slideToCopy".equals(name)
                && !"applyToAll".equals(name)
                && !"layoutAlias".equals(name)
                && !"color".equals(name)
                && !"files".equals(name)
                && !functionName.endsWith("SlidesSplit")
                && !(("postAddNewShape".equals(functionName) || "postAddNotesSlide".equals(functionName)) && "dto".equals(name))
                && !(("putNewPresentation".equals(functionName) || "postSlidesDocument".equals(functionName)) && "password".equals(name))
                && !("postSlidesReorderPosition".equals(functionName) && ("position".equals(name) || "slideToClone".equals(name)))
                && !(("putSlidesDocumentFromHtml".equals(functionName)
                        || "putNewPresentation".equals(functionName)
                        || "postSlidesDocument".equals(functionName))
                    && ("folder".equals(name) || "name".equals(name)))) {
            fail("Must have failed.");
        }
    }
}
