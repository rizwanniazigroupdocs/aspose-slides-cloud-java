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

package com.aspose.slidescloudsdk.api;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aspose.slidescloudsdk.ApiException;
import com.aspose.slidescloudsdk.FileInfo;
import com.aspose.slidescloudsdk.ApiTest;
import com.aspose.slidescloudsdk.model.*;

import com.aspose.slidescloudsdk.model.ApiInfoResponse;
import com.aspose.slidescloudsdk.model.DocumentResponse;
import com.aspose.slidescloudsdk.model.ExportOptions;
import java.io.File;
import com.aspose.slidescloudsdk.model.Pipeline;
import com.aspose.slidescloudsdk.model.SplitDocumentResponse;
import com.aspose.slidescloudsdk.model.Stream;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slidescloudsdk.model.request.GetSlidesApiInfoRequest;
import com.aspose.slidescloudsdk.model.request.GetSlidesDocumentRequest;
import com.aspose.slidescloudsdk.model.request.GetSlidesDocumentWithFormatRequest;
import com.aspose.slidescloudsdk.model.request.PostSlidesDocumentRequest;
import com.aspose.slidescloudsdk.model.request.PostSlidesPipelineRequest;
import com.aspose.slidescloudsdk.model.request.PostSlidesSaveAsRequest;
import com.aspose.slidescloudsdk.model.request.PostSlidesSplitRequest;
import com.aspose.slidescloudsdk.model.request.PutNewPresentationRequest;
import com.aspose.slidescloudsdk.model.request.PutSlidesConvertRequest;
import com.aspose.slidescloudsdk.model.request.PutSlidesDocumentFromHtmlRequest;
import com.aspose.slidescloudsdk.model.request.PutSlidesSlideSizeRequest;

/**
 * API tests for DocumentApi
 */
public class DocumentApiTest extends ApiTest {

    private final DocumentApi api = new DocumentApi(getConfiguration());

    
    /**
     * Get API info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesApiInfoTest() throws ApiException, Exception {
        initialize("getSlidesApiInfo", null, null);
        Boolean needAssertResponse = false;
        ApiInfoResponse response = null;;
        try {
            GetSlidesApiInfoRequest request = createGetSlidesApiInfoRequest();
            response = api.getSlidesApiInfo(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesApiInfo");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }


    private GetSlidesApiInfoRequest createGetSlidesApiInfoRequest() {
        GetSlidesApiInfoRequest request = new GetSlidesApiInfoRequest();
        return request;
    }
    
    /**
     * Read presentation info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentTest() throws ApiException, Exception {
        initialize("getSlidesDocument", null, null);
        Boolean needAssertResponse = false;
        DocumentResponse response = null;;
        try {
            GetSlidesDocumentRequest request = createGetSlidesDocumentRequest();
            response = api.getSlidesDocument(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesDocument");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read presentation info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentRequest request = createGetSlidesDocumentRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesDocument", "name", request.getName());
            DocumentResponse response = api.getSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesDocument");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesDocument");
        }
    }
    /**
     * Read presentation info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentRequest request = createGetSlidesDocumentRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesDocument", "password", request.getPassword());
            DocumentResponse response = api.getSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesDocument");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesDocument");
        }
    }
    /**
     * Read presentation info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentRequest request = createGetSlidesDocumentRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesDocument", "storage", request.getStorage());
            DocumentResponse response = api.getSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesDocument");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesDocument");
        }
    }
    /**
     * Read presentation info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentRequest request = createGetSlidesDocumentRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesDocument", "folder", request.getFolder());
            DocumentResponse response = api.getSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesDocument");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesDocument");
        }
    }

    private GetSlidesDocumentRequest createGetSlidesDocumentRequest() {
        GetSlidesDocumentRequest request = new GetSlidesDocumentRequest();
        request.setName((String)getTestValue("getSlidesDocument", "name", "String"));
        request.setPassword((String)getTestValue("getSlidesDocument", "password", "String"));
        request.setStorage((String)getTestValue("getSlidesDocument", "storage", "String"));
        request.setFolder((String)getTestValue("getSlidesDocument", "folder", "String"));
        return request;
    }
    
    /**
     * Export presentation to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentWithFormatTest() throws ApiException, Exception {
        initialize("getSlidesDocumentWithFormat", null, null);
        Boolean needAssertResponse = false;
        File response = null;;
        try {
            GetSlidesDocumentWithFormatRequest request = createGetSlidesDocumentWithFormatRequest();
            response = api.getSlidesDocumentWithFormat(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesDocumentWithFormat");
        }
        if (needAssertResponse) {
            assertTrue(response.isFile());
        }
    }

    /**
     * Export presentation to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentWithFormatInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentWithFormatRequest request = createGetSlidesDocumentWithFormatRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesDocumentWithFormat", "name", request.getName());
            File response = api.getSlidesDocumentWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesDocumentWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesDocumentWithFormat");
        }
    }
    /**
     * Export presentation to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentWithFormatInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentWithFormatRequest request = createGetSlidesDocumentWithFormatRequest();
            request.setFormat((ExportFormat)invalidizeTestValue(request.getFormat(), "format", "ExportFormat"));
            initialize("getSlidesDocumentWithFormat", "format", request.getFormat());
            File response = api.getSlidesDocumentWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "getSlidesDocumentWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("format", "getSlidesDocumentWithFormat");
        }
    }
    /**
     * Export presentation to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentWithFormatInvalidJpegQualityTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentWithFormatRequest request = createGetSlidesDocumentWithFormatRequest();
            request.setJpegQuality((Integer)invalidizeTestValue(request.getJpegQuality(), "jpegQuality", "Integer"));
            initialize("getSlidesDocumentWithFormat", "jpegQuality", request.getJpegQuality());
            File response = api.getSlidesDocumentWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "jpegQuality", "getSlidesDocumentWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("jpegQuality", "getSlidesDocumentWithFormat");
        }
    }
    /**
     * Export presentation to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentWithFormatInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentWithFormatRequest request = createGetSlidesDocumentWithFormatRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesDocumentWithFormat", "password", request.getPassword());
            File response = api.getSlidesDocumentWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesDocumentWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesDocumentWithFormat");
        }
    }
    /**
     * Export presentation to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentWithFormatInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentWithFormatRequest request = createGetSlidesDocumentWithFormatRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesDocumentWithFormat", "storage", request.getStorage());
            File response = api.getSlidesDocumentWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesDocumentWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesDocumentWithFormat");
        }
    }
    /**
     * Export presentation to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentWithFormatInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentWithFormatRequest request = createGetSlidesDocumentWithFormatRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesDocumentWithFormat", "folder", request.getFolder());
            File response = api.getSlidesDocumentWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesDocumentWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesDocumentWithFormat");
        }
    }
    /**
     * Export presentation to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentWithFormatInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentWithFormatRequest request = createGetSlidesDocumentWithFormatRequest();
            request.setOutPath((String)invalidizeTestValue(request.getOutPath(), "outPath", "String"));
            initialize("getSlidesDocumentWithFormat", "outPath", request.getOutPath());
            File response = api.getSlidesDocumentWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "getSlidesDocumentWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("outPath", "getSlidesDocumentWithFormat");
        }
    }
    /**
     * Export presentation to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentWithFormatInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentWithFormatRequest request = createGetSlidesDocumentWithFormatRequest();
            request.setFontsFolder((String)invalidizeTestValue(request.getFontsFolder(), "fontsFolder", "String"));
            initialize("getSlidesDocumentWithFormat", "fontsFolder", request.getFontsFolder());
            File response = api.getSlidesDocumentWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "getSlidesDocumentWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "getSlidesDocumentWithFormat");
        }
    }

    private GetSlidesDocumentWithFormatRequest createGetSlidesDocumentWithFormatRequest() {
        GetSlidesDocumentWithFormatRequest request = new GetSlidesDocumentWithFormatRequest();
        request.setName((String)getTestValue("getSlidesDocumentWithFormat", "name", "String"));
        request.setFormat((ExportFormat)getTestValue("getSlidesDocumentWithFormat", "format", "ExportFormat"));
        request.setJpegQuality((Integer)getTestValue("getSlidesDocumentWithFormat", "jpegQuality", "Integer"));
        request.setPassword((String)getTestValue("getSlidesDocumentWithFormat", "password", "String"));
        request.setStorage((String)getTestValue("getSlidesDocumentWithFormat", "storage", "String"));
        request.setFolder((String)getTestValue("getSlidesDocumentWithFormat", "folder", "String"));
        request.setOutPath((String)getTestValue("getSlidesDocumentWithFormat", "outPath", "String"));
        request.setFontsFolder((String)getTestValue("getSlidesDocumentWithFormat", "fontsFolder", "String"));
        return request;
    }
    
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentTest() throws ApiException, Exception {
        initialize("postSlidesDocument", null, null);
        Boolean needAssertResponse = false;
        DocumentResponse response = null;;
        try {
            PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
            response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postSlidesDocument");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postSlidesDocument", "name", request.getName());
            DocumentResponse response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesDocument");
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesDocument");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidDataTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
            request.setData((String)invalidizeTestValue(request.getData(), "data", "String"));
            initialize("postSlidesDocument", "data", request.getData());
            DocumentResponse response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "data", "postSlidesDocument");
        }
        if (needAssertResponse) {
            assertResponse("data", "postSlidesDocument");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidTemplatePathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
            request.setTemplatePath((String)invalidizeTestValue(request.getTemplatePath(), "templatePath", "String"));
            initialize("postSlidesDocument", "templatePath", request.getTemplatePath());
            DocumentResponse response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "templatePath", "postSlidesDocument");
        }
        if (needAssertResponse) {
            assertResponse("templatePath", "postSlidesDocument");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidTemplateStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
            request.setTemplateStorage((String)invalidizeTestValue(request.getTemplateStorage(), "templateStorage", "String"));
            initialize("postSlidesDocument", "templateStorage", request.getTemplateStorage());
            DocumentResponse response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "templateStorage", "postSlidesDocument");
        }
        if (needAssertResponse) {
            assertResponse("templateStorage", "postSlidesDocument");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidIsImageDataEmbeddedTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
            request.setIsImageDataEmbedded((Boolean)invalidizeTestValue(request.getIsImageDataEmbedded(), "isImageDataEmbedded", "Boolean"));
            initialize("postSlidesDocument", "isImageDataEmbedded", request.getIsImageDataEmbedded());
            DocumentResponse response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "isImageDataEmbedded", "postSlidesDocument");
        }
        if (needAssertResponse) {
            assertResponse("isImageDataEmbedded", "postSlidesDocument");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postSlidesDocument", "password", request.getPassword());
            DocumentResponse response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesDocument");
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesDocument");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postSlidesDocument", "storage", request.getStorage());
            DocumentResponse response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesDocument");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesDocument");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesDocumentInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesDocumentRequest request = createPostSlidesDocumentRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postSlidesDocument", "folder", request.getFolder());
            DocumentResponse response = api.postSlidesDocument(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesDocument");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesDocument");
        }
    }

    private PostSlidesDocumentRequest createPostSlidesDocumentRequest() {
        PostSlidesDocumentRequest request = new PostSlidesDocumentRequest();
        request.setName((String)getTestValue("postSlidesDocument", "name", "String"));
        request.setData((String)getTestValue("postSlidesDocument", "data", "String"));
        request.setTemplatePath((String)getTestValue("postSlidesDocument", "templatePath", "String"));
        request.setTemplateStorage((String)getTestValue("postSlidesDocument", "templateStorage", "String"));
        request.setIsImageDataEmbedded((Boolean)getTestValue("postSlidesDocument", "isImageDataEmbedded", "Boolean"));
        request.setPassword((String)getTestValue("postSlidesDocument", "password", "String"));
        request.setStorage((String)getTestValue("postSlidesDocument", "storage", "String"));
        request.setFolder((String)getTestValue("postSlidesDocument", "folder", "String"));
        return request;
    }
    
    /**
     * Performs slides pipeline. Http-request contains pipeline DTO.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPipelineTest() throws ApiException, Exception {
        initialize("postSlidesPipeline", null, null);
        Boolean needAssertResponse = false;
        File response = null;;
        try {
            PostSlidesPipelineRequest request = createPostSlidesPipelineRequest();
            response = api.postSlidesPipeline(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postSlidesPipeline");
        }
        if (needAssertResponse) {
            assertTrue(response.isFile());
        }
    }

    /**
     * Performs slides pipeline. Http-request contains pipeline DTO.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPipelineInvalidPipelineTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesPipelineRequest request = createPostSlidesPipelineRequest();
            request.setPipeline((Pipeline)invalidizeTestValue(request.getPipeline(), "pipeline", "Pipeline"));
            initialize("postSlidesPipeline", "pipeline", request.getPipeline());
            File response = api.postSlidesPipeline(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "pipeline", "postSlidesPipeline");
        }
        if (needAssertResponse) {
            assertResponse("pipeline", "postSlidesPipeline");
        }
    }
    /**
     * Performs slides pipeline. Http-request contains pipeline DTO.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPipelineInvalidFilesTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesPipelineRequest request = createPostSlidesPipelineRequest();
            request.setFiles((List<FileInfo>)invalidizeTestValue(request.getFiles(), "files", "List<FileInfo>"));
            initialize("postSlidesPipeline", "files", request.getFiles());
            File response = api.postSlidesPipeline(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "files", "postSlidesPipeline");
        }
        if (needAssertResponse) {
            assertResponse("files", "postSlidesPipeline");
        }
    }

    private PostSlidesPipelineRequest createPostSlidesPipelineRequest() {
        PostSlidesPipelineRequest request = new PostSlidesPipelineRequest();
        request.setPipeline((Pipeline)getTestValue("postSlidesPipeline", "pipeline", "Pipeline"));
        request.setFiles((List<FileInfo>)getTestValue("postSlidesPipeline", "files", "List<FileInfo>"));
        return request;
    }
    
    /**
     * Saves presentation with options
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsTest() throws ApiException, Exception {
        initialize("postSlidesSaveAs", null, null);
        Boolean needAssertResponse = false;
        File response = null;;
        try {
            PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
            response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postSlidesSaveAs");
        }
        if (needAssertResponse) {
            assertTrue(response.isFile());
        }
    }

    /**
     * Saves presentation with options
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postSlidesSaveAs", "name", request.getName());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesSaveAs");
        }
    }
    /**
     * Saves presentation with options
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
            request.setFormat((ExportFormat)invalidizeTestValue(request.getFormat(), "format", "ExportFormat"));
            initialize("postSlidesSaveAs", "format", request.getFormat());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "postSlidesSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("format", "postSlidesSaveAs");
        }
    }
    /**
     * Saves presentation with options
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
            request.setOptions((ExportOptions)invalidizeTestValue(request.getOptions(), "options", "ExportOptions"));
            initialize("postSlidesSaveAs", "options", request.getOptions());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "postSlidesSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("options", "postSlidesSaveAs");
        }
    }
    /**
     * Saves presentation with options
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postSlidesSaveAs", "password", request.getPassword());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesSaveAs");
        }
    }
    /**
     * Saves presentation with options
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postSlidesSaveAs", "storage", request.getStorage());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesSaveAs");
        }
    }
    /**
     * Saves presentation with options
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postSlidesSaveAs", "folder", request.getFolder());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesSaveAs");
        }
    }
    /**
     * Saves presentation with options
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
            request.setOutPath((String)invalidizeTestValue(request.getOutPath(), "outPath", "String"));
            initialize("postSlidesSaveAs", "outPath", request.getOutPath());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "postSlidesSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("outPath", "postSlidesSaveAs");
        }
    }
    /**
     * Saves presentation with options
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSaveAsInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSaveAsRequest request = createPostSlidesSaveAsRequest();
            request.setFontsFolder((String)invalidizeTestValue(request.getFontsFolder(), "fontsFolder", "String"));
            initialize("postSlidesSaveAs", "fontsFolder", request.getFontsFolder());
            File response = api.postSlidesSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "postSlidesSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "postSlidesSaveAs");
        }
    }

    private PostSlidesSaveAsRequest createPostSlidesSaveAsRequest() {
        PostSlidesSaveAsRequest request = new PostSlidesSaveAsRequest();
        request.setName((String)getTestValue("postSlidesSaveAs", "name", "String"));
        request.setFormat((ExportFormat)getTestValue("postSlidesSaveAs", "format", "ExportFormat"));
        request.setOptions((ExportOptions)getTestValue("postSlidesSaveAs", "options", "ExportOptions"));
        request.setPassword((String)getTestValue("postSlidesSaveAs", "password", "String"));
        request.setStorage((String)getTestValue("postSlidesSaveAs", "storage", "String"));
        request.setFolder((String)getTestValue("postSlidesSaveAs", "folder", "String"));
        request.setOutPath((String)getTestValue("postSlidesSaveAs", "outPath", "String"));
        request.setFontsFolder((String)getTestValue("postSlidesSaveAs", "fontsFolder", "String"));
        return request;
    }
    
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitTest() throws ApiException, Exception {
        initialize("postSlidesSplit", null, null);
        Boolean needAssertResponse = false;
        SplitDocumentResponse response = null;;
        try {
            PostSlidesSplitRequest request = createPostSlidesSplitRequest();
            response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postSlidesSplit");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSplitRequest request = createPostSlidesSplitRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postSlidesSplit", "name", request.getName());
            SplitDocumentResponse response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesSplit");
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSplitRequest request = createPostSlidesSplitRequest();
            request.setOptions((ExportOptions)invalidizeTestValue(request.getOptions(), "options", "ExportOptions"));
            initialize("postSlidesSplit", "options", request.getOptions());
            SplitDocumentResponse response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "postSlidesSplit");
        }
        if (needAssertResponse) {
            assertResponse("options", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSplitRequest request = createPostSlidesSplitRequest();
            request.setFormat((SlideExportFormat)invalidizeTestValue(request.getFormat(), "format", "SlideExportFormat"));
            initialize("postSlidesSplit", "format", request.getFormat());
            SplitDocumentResponse response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "postSlidesSplit");
        }
        if (needAssertResponse) {
            assertResponse("format", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidWidthTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSplitRequest request = createPostSlidesSplitRequest();
            request.setWidth((Integer)invalidizeTestValue(request.getWidth(), "width", "Integer"));
            initialize("postSlidesSplit", "width", request.getWidth());
            SplitDocumentResponse response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "width", "postSlidesSplit");
        }
        if (needAssertResponse) {
            assertResponse("width", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidHeightTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSplitRequest request = createPostSlidesSplitRequest();
            request.setHeight((Integer)invalidizeTestValue(request.getHeight(), "height", "Integer"));
            initialize("postSlidesSplit", "height", request.getHeight());
            SplitDocumentResponse response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "height", "postSlidesSplit");
        }
        if (needAssertResponse) {
            assertResponse("height", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidToTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSplitRequest request = createPostSlidesSplitRequest();
            request.setTo((Integer)invalidizeTestValue(request.getTo(), "to", "Integer"));
            initialize("postSlidesSplit", "to", request.getTo());
            SplitDocumentResponse response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "to", "postSlidesSplit");
        }
        if (needAssertResponse) {
            assertResponse("to", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidFromTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSplitRequest request = createPostSlidesSplitRequest();
            request.setFrom((Integer)invalidizeTestValue(request.getFrom(), "from", "Integer"));
            initialize("postSlidesSplit", "from", request.getFrom());
            SplitDocumentResponse response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "from", "postSlidesSplit");
        }
        if (needAssertResponse) {
            assertResponse("from", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidDestFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSplitRequest request = createPostSlidesSplitRequest();
            request.setDestFolder((String)invalidizeTestValue(request.getDestFolder(), "destFolder", "String"));
            initialize("postSlidesSplit", "destFolder", request.getDestFolder());
            SplitDocumentResponse response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "destFolder", "postSlidesSplit");
        }
        if (needAssertResponse) {
            assertResponse("destFolder", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSplitRequest request = createPostSlidesSplitRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postSlidesSplit", "password", request.getPassword());
            SplitDocumentResponse response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesSplit");
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSplitRequest request = createPostSlidesSplitRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postSlidesSplit", "storage", request.getStorage());
            SplitDocumentResponse response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesSplit");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesSplit");
        }
    }
    /**
     * Splitting presentations. Create one image per slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSplitInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSplitRequest request = createPostSlidesSplitRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postSlidesSplit", "folder", request.getFolder());
            SplitDocumentResponse response = api.postSlidesSplit(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesSplit");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesSplit");
        }
    }

    private PostSlidesSplitRequest createPostSlidesSplitRequest() {
        PostSlidesSplitRequest request = new PostSlidesSplitRequest();
        request.setName((String)getTestValue("postSlidesSplit", "name", "String"));
        request.setOptions((ExportOptions)getTestValue("postSlidesSplit", "options", "ExportOptions"));
        request.setFormat((SlideExportFormat)getTestValue("postSlidesSplit", "format", "SlideExportFormat"));
        request.setWidth((Integer)getTestValue("postSlidesSplit", "width", "Integer"));
        request.setHeight((Integer)getTestValue("postSlidesSplit", "height", "Integer"));
        request.setTo((Integer)getTestValue("postSlidesSplit", "to", "Integer"));
        request.setFrom((Integer)getTestValue("postSlidesSplit", "from", "Integer"));
        request.setDestFolder((String)getTestValue("postSlidesSplit", "destFolder", "String"));
        request.setPassword((String)getTestValue("postSlidesSplit", "password", "String"));
        request.setStorage((String)getTestValue("postSlidesSplit", "storage", "String"));
        request.setFolder((String)getTestValue("postSlidesSplit", "folder", "String"));
        return request;
    }
    
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNewPresentationTest() throws ApiException, Exception {
        initialize("putNewPresentation", null, null);
        Boolean needAssertResponse = false;
        DocumentResponse response = null;;
        try {
            PutNewPresentationRequest request = createPutNewPresentationRequest();
            response = api.putNewPresentation(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putNewPresentation");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNewPresentationInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutNewPresentationRequest request = createPutNewPresentationRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putNewPresentation", "name", request.getName());
            DocumentResponse response = api.putNewPresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putNewPresentation");
        }
        if (needAssertResponse) {
            assertResponse("name", "putNewPresentation");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNewPresentationInvalidStreamTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutNewPresentationRequest request = createPutNewPresentationRequest();
            request.setStream((byte[])invalidizeTestValue(request.getStream(), "stream", "byte[]"));
            initialize("putNewPresentation", "stream", request.getStream());
            DocumentResponse response = api.putNewPresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "stream", "putNewPresentation");
        }
        if (needAssertResponse) {
            assertResponse("stream", "putNewPresentation");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNewPresentationInvalidTemplatePathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutNewPresentationRequest request = createPutNewPresentationRequest();
            request.setTemplatePath((String)invalidizeTestValue(request.getTemplatePath(), "templatePath", "String"));
            initialize("putNewPresentation", "templatePath", request.getTemplatePath());
            DocumentResponse response = api.putNewPresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "templatePath", "putNewPresentation");
        }
        if (needAssertResponse) {
            assertResponse("templatePath", "putNewPresentation");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNewPresentationInvalidTemplatePasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutNewPresentationRequest request = createPutNewPresentationRequest();
            request.setTemplatePassword((String)invalidizeTestValue(request.getTemplatePassword(), "templatePassword", "String"));
            initialize("putNewPresentation", "templatePassword", request.getTemplatePassword());
            DocumentResponse response = api.putNewPresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "templatePassword", "putNewPresentation");
        }
        if (needAssertResponse) {
            assertResponse("templatePassword", "putNewPresentation");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNewPresentationInvalidTemplateStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutNewPresentationRequest request = createPutNewPresentationRequest();
            request.setTemplateStorage((String)invalidizeTestValue(request.getTemplateStorage(), "templateStorage", "String"));
            initialize("putNewPresentation", "templateStorage", request.getTemplateStorage());
            DocumentResponse response = api.putNewPresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "templateStorage", "putNewPresentation");
        }
        if (needAssertResponse) {
            assertResponse("templateStorage", "putNewPresentation");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNewPresentationInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutNewPresentationRequest request = createPutNewPresentationRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putNewPresentation", "password", request.getPassword());
            DocumentResponse response = api.putNewPresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putNewPresentation");
        }
        if (needAssertResponse) {
            assertResponse("password", "putNewPresentation");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNewPresentationInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutNewPresentationRequest request = createPutNewPresentationRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putNewPresentation", "storage", request.getStorage());
            DocumentResponse response = api.putNewPresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putNewPresentation");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putNewPresentation");
        }
    }
    /**
     * Create presentation 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putNewPresentationInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutNewPresentationRequest request = createPutNewPresentationRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putNewPresentation", "folder", request.getFolder());
            DocumentResponse response = api.putNewPresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putNewPresentation");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putNewPresentation");
        }
    }

    private PutNewPresentationRequest createPutNewPresentationRequest() {
        PutNewPresentationRequest request = new PutNewPresentationRequest();
        request.setName((String)getTestValue("putNewPresentation", "name", "String"));
        request.setStream((byte[])getTestValue("putNewPresentation", "stream", "byte[]"));
        request.setTemplatePath((String)getTestValue("putNewPresentation", "templatePath", "String"));
        request.setTemplatePassword((String)getTestValue("putNewPresentation", "templatePassword", "String"));
        request.setTemplateStorage((String)getTestValue("putNewPresentation", "templateStorage", "String"));
        request.setPassword((String)getTestValue("putNewPresentation", "password", "String"));
        request.setStorage((String)getTestValue("putNewPresentation", "storage", "String"));
        request.setFolder((String)getTestValue("putNewPresentation", "folder", "String"));
        return request;
    }
    
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesConvertTest() throws ApiException, Exception {
        initialize("putSlidesConvert", null, null);
        Boolean needAssertResponse = false;
        File response = null;;
        try {
            PutSlidesConvertRequest request = createPutSlidesConvertRequest();
            response = api.putSlidesConvert(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putSlidesConvert");
        }
        if (needAssertResponse) {
            assertTrue(response.isFile());
        }
    }

    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesConvertInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesConvertRequest request = createPutSlidesConvertRequest();
            request.setFormat((ExportFormat)invalidizeTestValue(request.getFormat(), "format", "ExportFormat"));
            initialize("putSlidesConvert", "format", request.getFormat());
            File response = api.putSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "putSlidesConvert");
        }
        if (needAssertResponse) {
            assertResponse("format", "putSlidesConvert");
        }
    }
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesConvertInvalidDocumentTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesConvertRequest request = createPutSlidesConvertRequest();
            request.setDocument((byte[])invalidizeTestValue(request.getDocument(), "document", "byte[]"));
            initialize("putSlidesConvert", "document", request.getDocument());
            File response = api.putSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "document", "putSlidesConvert");
        }
        if (needAssertResponse) {
            assertResponse("document", "putSlidesConvert");
        }
    }
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesConvertInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesConvertRequest request = createPutSlidesConvertRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putSlidesConvert", "password", request.getPassword());
            File response = api.putSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesConvert");
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesConvert");
        }
    }
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesConvertInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesConvertRequest request = createPutSlidesConvertRequest();
            request.setOutPath((String)invalidizeTestValue(request.getOutPath(), "outPath", "String"));
            initialize("putSlidesConvert", "outPath", request.getOutPath());
            File response = api.putSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "putSlidesConvert");
        }
        if (needAssertResponse) {
            assertResponse("outPath", "putSlidesConvert");
        }
    }
    /**
     * Convert presentation from request content to format specified.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesConvertInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesConvertRequest request = createPutSlidesConvertRequest();
            request.setFontsFolder((String)invalidizeTestValue(request.getFontsFolder(), "fontsFolder", "String"));
            initialize("putSlidesConvert", "fontsFolder", request.getFontsFolder());
            File response = api.putSlidesConvert(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "putSlidesConvert");
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "putSlidesConvert");
        }
    }

    private PutSlidesConvertRequest createPutSlidesConvertRequest() {
        PutSlidesConvertRequest request = new PutSlidesConvertRequest();
        request.setFormat((ExportFormat)getTestValue("putSlidesConvert", "format", "ExportFormat"));
        request.setDocument((byte[])getTestValue("putSlidesConvert", "document", "byte[]"));
        request.setPassword((String)getTestValue("putSlidesConvert", "password", "String"));
        request.setOutPath((String)getTestValue("putSlidesConvert", "outPath", "String"));
        request.setFontsFolder((String)getTestValue("putSlidesConvert", "fontsFolder", "String"));
        return request;
    }
    
    /**
     * Create presentation document from html
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesDocumentFromHtmlTest() throws ApiException, Exception {
        initialize("putSlidesDocumentFromHtml", null, null);
        Boolean needAssertResponse = false;
        DocumentResponse response = null;;
        try {
            PutSlidesDocumentFromHtmlRequest request = createPutSlidesDocumentFromHtmlRequest();
            response = api.putSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putSlidesDocumentFromHtml");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Create presentation document from html
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesDocumentFromHtmlInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesDocumentFromHtmlRequest request = createPutSlidesDocumentFromHtmlRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putSlidesDocumentFromHtml", "name", request.getName());
            DocumentResponse response = api.putSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlidesDocumentFromHtml");
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlidesDocumentFromHtml");
        }
    }
    /**
     * Create presentation document from html
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesDocumentFromHtmlInvalidHtmlTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesDocumentFromHtmlRequest request = createPutSlidesDocumentFromHtmlRequest();
            request.setHtml((String)invalidizeTestValue(request.getHtml(), "html", "String"));
            initialize("putSlidesDocumentFromHtml", "html", request.getHtml());
            DocumentResponse response = api.putSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "html", "putSlidesDocumentFromHtml");
        }
        if (needAssertResponse) {
            assertResponse("html", "putSlidesDocumentFromHtml");
        }
    }
    /**
     * Create presentation document from html
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesDocumentFromHtmlInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesDocumentFromHtmlRequest request = createPutSlidesDocumentFromHtmlRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putSlidesDocumentFromHtml", "password", request.getPassword());
            DocumentResponse response = api.putSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesDocumentFromHtml");
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesDocumentFromHtml");
        }
    }
    /**
     * Create presentation document from html
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesDocumentFromHtmlInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesDocumentFromHtmlRequest request = createPutSlidesDocumentFromHtmlRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putSlidesDocumentFromHtml", "storage", request.getStorage());
            DocumentResponse response = api.putSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlidesDocumentFromHtml");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlidesDocumentFromHtml");
        }
    }
    /**
     * Create presentation document from html
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesDocumentFromHtmlInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesDocumentFromHtmlRequest request = createPutSlidesDocumentFromHtmlRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putSlidesDocumentFromHtml", "folder", request.getFolder());
            DocumentResponse response = api.putSlidesDocumentFromHtml(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlidesDocumentFromHtml");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlidesDocumentFromHtml");
        }
    }

    private PutSlidesDocumentFromHtmlRequest createPutSlidesDocumentFromHtmlRequest() {
        PutSlidesDocumentFromHtmlRequest request = new PutSlidesDocumentFromHtmlRequest();
        request.setName((String)getTestValue("putSlidesDocumentFromHtml", "name", "String"));
        request.setHtml((String)getTestValue("putSlidesDocumentFromHtml", "html", "String"));
        request.setPassword((String)getTestValue("putSlidesDocumentFromHtml", "password", "String"));
        request.setStorage((String)getTestValue("putSlidesDocumentFromHtml", "storage", "String"));
        request.setFolder((String)getTestValue("putSlidesDocumentFromHtml", "folder", "String"));
        return request;
    }
    
    /**
     * Set slide size for the presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeTest() throws ApiException, Exception {
        initialize("putSlidesSlideSize", null, null);
        Boolean needAssertResponse = false;
        DocumentResponse response = null;;
        try {
            PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
            response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putSlidesSlideSize");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Set slide size for the presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putSlidesSlideSize", "name", request.getName());
            DocumentResponse response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlidesSlideSize");
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for the presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putSlidesSlideSize", "password", request.getPassword());
            DocumentResponse response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesSlideSize");
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for the presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putSlidesSlideSize", "storage", request.getStorage());
            DocumentResponse response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlidesSlideSize");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for the presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putSlidesSlideSize", "folder", request.getFolder());
            DocumentResponse response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlidesSlideSize");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for the presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidWidthTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
            request.setWidth((Integer)invalidizeTestValue(request.getWidth(), "width", "Integer"));
            initialize("putSlidesSlideSize", "width", request.getWidth());
            DocumentResponse response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "width", "putSlidesSlideSize");
        }
        if (needAssertResponse) {
            assertResponse("width", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for the presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidHeightTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
            request.setHeight((Integer)invalidizeTestValue(request.getHeight(), "height", "Integer"));
            initialize("putSlidesSlideSize", "height", request.getHeight());
            DocumentResponse response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "height", "putSlidesSlideSize");
        }
        if (needAssertResponse) {
            assertResponse("height", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for the presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidSizeTypeTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
            request.setSizeType((SizeType)invalidizeTestValue(request.getSizeType(), "sizeType", "SizeType"));
            initialize("putSlidesSlideSize", "sizeType", request.getSizeType());
            DocumentResponse response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "sizeType", "putSlidesSlideSize");
        }
        if (needAssertResponse) {
            assertResponse("sizeType", "putSlidesSlideSize");
        }
    }
    /**
     * Set slide size for the presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideSizeInvalidScaleTypeTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideSizeRequest request = createPutSlidesSlideSizeRequest();
            request.setScaleType((ScaleType)invalidizeTestValue(request.getScaleType(), "scaleType", "ScaleType"));
            initialize("putSlidesSlideSize", "scaleType", request.getScaleType());
            DocumentResponse response = api.putSlidesSlideSize(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleType", "putSlidesSlideSize");
        }
        if (needAssertResponse) {
            assertResponse("scaleType", "putSlidesSlideSize");
        }
    }

    private PutSlidesSlideSizeRequest createPutSlidesSlideSizeRequest() {
        PutSlidesSlideSizeRequest request = new PutSlidesSlideSizeRequest();
        request.setName((String)getTestValue("putSlidesSlideSize", "name", "String"));
        request.setPassword((String)getTestValue("putSlidesSlideSize", "password", "String"));
        request.setStorage((String)getTestValue("putSlidesSlideSize", "storage", "String"));
        request.setFolder((String)getTestValue("putSlidesSlideSize", "folder", "String"));
        request.setWidth((Integer)getTestValue("putSlidesSlideSize", "width", "Integer"));
        request.setHeight((Integer)getTestValue("putSlidesSlideSize", "height", "Integer"));
        request.setSizeType((SizeType)getTestValue("putSlidesSlideSize", "sizeType", "SizeType"));
        request.setScaleType((ScaleType)getTestValue("putSlidesSlideSize", "scaleType", "ScaleType"));
        return request;
    }
    
}
