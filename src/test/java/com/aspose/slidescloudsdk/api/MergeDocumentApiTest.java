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

import com.aspose.slidescloudsdk.model.DocumentResponse;
import com.aspose.slidescloudsdk.model.OrderedMergeRequest;
import com.aspose.slidescloudsdk.model.PresentationsMergeRequest;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slidescloudsdk.model.request.PostPresentationMergeRequest;
import com.aspose.slidescloudsdk.model.request.PutPresentationMergeRequest;

/**
 * API tests for MergeDocumentApi
 */
public class MergeDocumentApiTest extends ApiTest {

    private final MergeDocumentApi api = new MergeDocumentApi(getConfiguration());

    
    /**
     * Merge the presentation with other presentations specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPresentationMergeTest() throws ApiException, Exception {
        initialize("postPresentationMerge", null, null);
        Boolean needAssertResponse = false;
        DocumentResponse response = null;;
        try {
            PostPresentationMergeRequest request = createPostPresentationMergeRequest();
            response = api.postPresentationMerge(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postPresentationMerge");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Merge the presentation with other presentations specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPresentationMergeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostPresentationMergeRequest request = createPostPresentationMergeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postPresentationMerge", "name", request.getName());
            DocumentResponse response = api.postPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postPresentationMerge");
        }
        if (needAssertResponse) {
            assertResponse("name", "postPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPresentationMergeInvalidRequestTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostPresentationMergeRequest request = createPostPresentationMergeRequest();
            request.setRequest((PresentationsMergeRequest)invalidizeTestValue(request.getRequest(), "request", "PresentationsMergeRequest"));
            initialize("postPresentationMerge", "request", request.getRequest());
            DocumentResponse response = api.postPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "request", "postPresentationMerge");
        }
        if (needAssertResponse) {
            assertResponse("request", "postPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPresentationMergeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostPresentationMergeRequest request = createPostPresentationMergeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postPresentationMerge", "password", request.getPassword());
            DocumentResponse response = api.postPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postPresentationMerge");
        }
        if (needAssertResponse) {
            assertResponse("password", "postPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPresentationMergeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostPresentationMergeRequest request = createPostPresentationMergeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postPresentationMerge", "storage", request.getStorage());
            DocumentResponse response = api.postPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postPresentationMerge");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPresentationMergeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostPresentationMergeRequest request = createPostPresentationMergeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postPresentationMerge", "folder", request.getFolder());
            DocumentResponse response = api.postPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postPresentationMerge");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postPresentationMerge");
        }
    }

    private PostPresentationMergeRequest createPostPresentationMergeRequest() {
        PostPresentationMergeRequest request = new PostPresentationMergeRequest();
        request.setName((String)getTestValue("postPresentationMerge", "name", "String"));
        request.setRequest((PresentationsMergeRequest)getTestValue("postPresentationMerge", "request", "PresentationsMergeRequest"));
        request.setPassword((String)getTestValue("postPresentationMerge", "password", "String"));
        request.setStorage((String)getTestValue("postPresentationMerge", "storage", "String"));
        request.setFolder((String)getTestValue("postPresentationMerge", "folder", "String"));
        return request;
    }
    
    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPresentationMergeTest() throws ApiException, Exception {
        initialize("putPresentationMerge", null, null);
        Boolean needAssertResponse = false;
        DocumentResponse response = null;;
        try {
            PutPresentationMergeRequest request = createPutPresentationMergeRequest();
            response = api.putPresentationMerge(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putPresentationMerge");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPresentationMergeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutPresentationMergeRequest request = createPutPresentationMergeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putPresentationMerge", "name", request.getName());
            DocumentResponse response = api.putPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putPresentationMerge");
        }
        if (needAssertResponse) {
            assertResponse("name", "putPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPresentationMergeInvalidRequestTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutPresentationMergeRequest request = createPutPresentationMergeRequest();
            request.setRequest((OrderedMergeRequest)invalidizeTestValue(request.getRequest(), "request", "OrderedMergeRequest"));
            initialize("putPresentationMerge", "request", request.getRequest());
            DocumentResponse response = api.putPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "request", "putPresentationMerge");
        }
        if (needAssertResponse) {
            assertResponse("request", "putPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPresentationMergeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutPresentationMergeRequest request = createPutPresentationMergeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putPresentationMerge", "password", request.getPassword());
            DocumentResponse response = api.putPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putPresentationMerge");
        }
        if (needAssertResponse) {
            assertResponse("password", "putPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPresentationMergeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutPresentationMergeRequest request = createPutPresentationMergeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putPresentationMerge", "storage", request.getStorage());
            DocumentResponse response = api.putPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putPresentationMerge");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putPresentationMerge");
        }
    }
    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putPresentationMergeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutPresentationMergeRequest request = createPutPresentationMergeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putPresentationMerge", "folder", request.getFolder());
            DocumentResponse response = api.putPresentationMerge(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putPresentationMerge");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putPresentationMerge");
        }
    }

    private PutPresentationMergeRequest createPutPresentationMergeRequest() {
        PutPresentationMergeRequest request = new PutPresentationMergeRequest();
        request.setName((String)getTestValue("putPresentationMerge", "name", "String"));
        request.setRequest((OrderedMergeRequest)getTestValue("putPresentationMerge", "request", "OrderedMergeRequest"));
        request.setPassword((String)getTestValue("putPresentationMerge", "password", "String"));
        request.setStorage((String)getTestValue("putPresentationMerge", "storage", "String"));
        request.setFolder((String)getTestValue("putPresentationMerge", "folder", "String"));
        return request;
    }
    
}
