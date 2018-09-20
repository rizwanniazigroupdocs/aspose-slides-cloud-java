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

import com.aspose.slidescloudsdk.model.PresentationStringReplaceResponse;
import com.aspose.slidescloudsdk.model.SlideStringReplaceResponse;
import com.aspose.slidescloudsdk.model.TextItemsResponse;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slidescloudsdk.model.request.GetSlidesPresentationTextItemsRequest;
import com.aspose.slidescloudsdk.model.request.GetSlidesSlideTextItemsRequest;
import com.aspose.slidescloudsdk.model.request.PostSlidesPresentationReplaceTextRequest;
import com.aspose.slidescloudsdk.model.request.PostSlidesSlideReplaceTextRequest;

/**
 * API tests for TextApi
 */
public class TextApiTest extends ApiTest {

    private final TextApi api = new TextApi(getConfiguration());

    
    /**
     * Extract presentation text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPresentationTextItemsTest() throws ApiException, Exception {
        initialize("getSlidesPresentationTextItems", null, null);
        Boolean needAssertResponse = false;
        TextItemsResponse response = null;;
        try {
            GetSlidesPresentationTextItemsRequest request = createGetSlidesPresentationTextItemsRequest();
            response = api.getSlidesPresentationTextItems(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesPresentationTextItems");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Extract presentation text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPresentationTextItemsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPresentationTextItemsRequest request = createGetSlidesPresentationTextItemsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesPresentationTextItems", "name", request.getName());
            TextItemsResponse response = api.getSlidesPresentationTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesPresentationTextItems");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesPresentationTextItems");
        }
    }
    /**
     * Extract presentation text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPresentationTextItemsInvalidWithEmptyTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPresentationTextItemsRequest request = createGetSlidesPresentationTextItemsRequest();
            request.setWithEmpty((Boolean)invalidizeTestValue(request.getWithEmpty(), "withEmpty", "Boolean"));
            initialize("getSlidesPresentationTextItems", "withEmpty", request.getWithEmpty());
            TextItemsResponse response = api.getSlidesPresentationTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "withEmpty", "getSlidesPresentationTextItems");
        }
        if (needAssertResponse) {
            assertResponse("withEmpty", "getSlidesPresentationTextItems");
        }
    }
    /**
     * Extract presentation text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPresentationTextItemsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPresentationTextItemsRequest request = createGetSlidesPresentationTextItemsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesPresentationTextItems", "password", request.getPassword());
            TextItemsResponse response = api.getSlidesPresentationTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesPresentationTextItems");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesPresentationTextItems");
        }
    }
    /**
     * Extract presentation text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPresentationTextItemsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPresentationTextItemsRequest request = createGetSlidesPresentationTextItemsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesPresentationTextItems", "folder", request.getFolder());
            TextItemsResponse response = api.getSlidesPresentationTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesPresentationTextItems");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesPresentationTextItems");
        }
    }
    /**
     * Extract presentation text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPresentationTextItemsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPresentationTextItemsRequest request = createGetSlidesPresentationTextItemsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesPresentationTextItems", "storage", request.getStorage());
            TextItemsResponse response = api.getSlidesPresentationTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesPresentationTextItems");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesPresentationTextItems");
        }
    }

    private GetSlidesPresentationTextItemsRequest createGetSlidesPresentationTextItemsRequest() {
        GetSlidesPresentationTextItemsRequest request = new GetSlidesPresentationTextItemsRequest();
        request.setName((String)getTestValue("getSlidesPresentationTextItems", "name", "String"));
        request.setWithEmpty((Boolean)getTestValue("getSlidesPresentationTextItems", "withEmpty", "Boolean"));
        request.setPassword((String)getTestValue("getSlidesPresentationTextItems", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesPresentationTextItems", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesPresentationTextItems", "storage", "String"));
        return request;
    }
    
    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsTest() throws ApiException, Exception {
        initialize("getSlidesSlideTextItems", null, null);
        Boolean needAssertResponse = false;
        TextItemsResponse response = null;;
        try {
            GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
            response = api.getSlidesSlideTextItems(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesSlideTextItems");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesSlideTextItems", "name", request.getName());
            TextItemsResponse response = api.getSlidesSlideTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesSlideTextItems");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesSlideTextItems");
        }
    }
    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlidesSlideTextItems", "slideIndex", request.getSlideIndex());
            TextItemsResponse response = api.getSlidesSlideTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesSlideTextItems");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesSlideTextItems");
        }
    }
    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsInvalidWithEmptyTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
            request.setWithEmpty((Boolean)invalidizeTestValue(request.getWithEmpty(), "withEmpty", "Boolean"));
            initialize("getSlidesSlideTextItems", "withEmpty", request.getWithEmpty());
            TextItemsResponse response = api.getSlidesSlideTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "withEmpty", "getSlidesSlideTextItems");
        }
        if (needAssertResponse) {
            assertResponse("withEmpty", "getSlidesSlideTextItems");
        }
    }
    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesSlideTextItems", "password", request.getPassword());
            TextItemsResponse response = api.getSlidesSlideTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesSlideTextItems");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesSlideTextItems");
        }
    }
    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesSlideTextItems", "folder", request.getFolder());
            TextItemsResponse response = api.getSlidesSlideTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesSlideTextItems");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesSlideTextItems");
        }
    }
    /**
     * Extract slide text items.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTextItemsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideTextItemsRequest request = createGetSlidesSlideTextItemsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesSlideTextItems", "storage", request.getStorage());
            TextItemsResponse response = api.getSlidesSlideTextItems(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesSlideTextItems");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesSlideTextItems");
        }
    }

    private GetSlidesSlideTextItemsRequest createGetSlidesSlideTextItemsRequest() {
        GetSlidesSlideTextItemsRequest request = new GetSlidesSlideTextItemsRequest();
        request.setName((String)getTestValue("getSlidesSlideTextItems", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlidesSlideTextItems", "slideIndex", "Integer"));
        request.setWithEmpty((Boolean)getTestValue("getSlidesSlideTextItems", "withEmpty", "Boolean"));
        request.setPassword((String)getTestValue("getSlidesSlideTextItems", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesSlideTextItems", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesSlideTextItems", "storage", "String"));
        return request;
    }
    
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextTest() throws ApiException, Exception {
        initialize("postSlidesPresentationReplaceText", null, null);
        Boolean needAssertResponse = false;
        PresentationStringReplaceResponse response = null;;
        try {
            PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
            response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postSlidesPresentationReplaceText");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postSlidesPresentationReplaceText", "name", request.getName());
            PresentationStringReplaceResponse response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesPresentationReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesPresentationReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidOldValueTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
            request.setOldValue((String)invalidizeTestValue(request.getOldValue(), "oldValue", "String"));
            initialize("postSlidesPresentationReplaceText", "oldValue", request.getOldValue());
            PresentationStringReplaceResponse response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "oldValue", "postSlidesPresentationReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("oldValue", "postSlidesPresentationReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidNewValueTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
            request.setNewValue((String)invalidizeTestValue(request.getNewValue(), "newValue", "String"));
            initialize("postSlidesPresentationReplaceText", "newValue", request.getNewValue());
            PresentationStringReplaceResponse response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "newValue", "postSlidesPresentationReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("newValue", "postSlidesPresentationReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidIgnoreCaseTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
            request.setIgnoreCase((Boolean)invalidizeTestValue(request.getIgnoreCase(), "ignoreCase", "Boolean"));
            initialize("postSlidesPresentationReplaceText", "ignoreCase", request.getIgnoreCase());
            PresentationStringReplaceResponse response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "ignoreCase", "postSlidesPresentationReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("ignoreCase", "postSlidesPresentationReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postSlidesPresentationReplaceText", "password", request.getPassword());
            PresentationStringReplaceResponse response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesPresentationReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesPresentationReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postSlidesPresentationReplaceText", "folder", request.getFolder());
            PresentationStringReplaceResponse response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesPresentationReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesPresentationReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesPresentationReplaceTextInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesPresentationReplaceTextRequest request = createPostSlidesPresentationReplaceTextRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postSlidesPresentationReplaceText", "storage", request.getStorage());
            PresentationStringReplaceResponse response = api.postSlidesPresentationReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesPresentationReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesPresentationReplaceText");
        }
    }

    private PostSlidesPresentationReplaceTextRequest createPostSlidesPresentationReplaceTextRequest() {
        PostSlidesPresentationReplaceTextRequest request = new PostSlidesPresentationReplaceTextRequest();
        request.setName((String)getTestValue("postSlidesPresentationReplaceText", "name", "String"));
        request.setOldValue((String)getTestValue("postSlidesPresentationReplaceText", "oldValue", "String"));
        request.setNewValue((String)getTestValue("postSlidesPresentationReplaceText", "newValue", "String"));
        request.setIgnoreCase((Boolean)getTestValue("postSlidesPresentationReplaceText", "ignoreCase", "Boolean"));
        request.setPassword((String)getTestValue("postSlidesPresentationReplaceText", "password", "String"));
        request.setFolder((String)getTestValue("postSlidesPresentationReplaceText", "folder", "String"));
        request.setStorage((String)getTestValue("postSlidesPresentationReplaceText", "storage", "String"));
        return request;
    }
    
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextTest() throws ApiException, Exception {
        initialize("postSlidesSlideReplaceText", null, null);
        Boolean needAssertResponse = false;
        SlideStringReplaceResponse response = null;;
        try {
            PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
            response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postSlidesSlideReplaceText");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postSlidesSlideReplaceText", "name", request.getName());
            SlideStringReplaceResponse response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesSlideReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("postSlidesSlideReplaceText", "slideIndex", request.getSlideIndex());
            SlideStringReplaceResponse response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postSlidesSlideReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidOldValueTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
            request.setOldValue((String)invalidizeTestValue(request.getOldValue(), "oldValue", "String"));
            initialize("postSlidesSlideReplaceText", "oldValue", request.getOldValue());
            SlideStringReplaceResponse response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "oldValue", "postSlidesSlideReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("oldValue", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidNewValueTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
            request.setNewValue((String)invalidizeTestValue(request.getNewValue(), "newValue", "String"));
            initialize("postSlidesSlideReplaceText", "newValue", request.getNewValue());
            SlideStringReplaceResponse response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "newValue", "postSlidesSlideReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("newValue", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidIgnoreCaseTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
            request.setIgnoreCase((Boolean)invalidizeTestValue(request.getIgnoreCase(), "ignoreCase", "Boolean"));
            initialize("postSlidesSlideReplaceText", "ignoreCase", request.getIgnoreCase());
            SlideStringReplaceResponse response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "ignoreCase", "postSlidesSlideReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("ignoreCase", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postSlidesSlideReplaceText", "password", request.getPassword());
            SlideStringReplaceResponse response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesSlideReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postSlidesSlideReplaceText", "folder", request.getFolder());
            SlideStringReplaceResponse response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesSlideReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesSlideReplaceText");
        }
    }
    /**
     * Replace text with a new value.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSlideReplaceTextInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSlideReplaceTextRequest request = createPostSlidesSlideReplaceTextRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postSlidesSlideReplaceText", "storage", request.getStorage());
            SlideStringReplaceResponse response = api.postSlidesSlideReplaceText(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesSlideReplaceText");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesSlideReplaceText");
        }
    }

    private PostSlidesSlideReplaceTextRequest createPostSlidesSlideReplaceTextRequest() {
        PostSlidesSlideReplaceTextRequest request = new PostSlidesSlideReplaceTextRequest();
        request.setName((String)getTestValue("postSlidesSlideReplaceText", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("postSlidesSlideReplaceText", "slideIndex", "Integer"));
        request.setOldValue((String)getTestValue("postSlidesSlideReplaceText", "oldValue", "String"));
        request.setNewValue((String)getTestValue("postSlidesSlideReplaceText", "newValue", "String"));
        request.setIgnoreCase((Boolean)getTestValue("postSlidesSlideReplaceText", "ignoreCase", "Boolean"));
        request.setPassword((String)getTestValue("postSlidesSlideReplaceText", "password", "String"));
        request.setFolder((String)getTestValue("postSlidesSlideReplaceText", "folder", "String"));
        request.setStorage((String)getTestValue("postSlidesSlideReplaceText", "storage", "String"));
        return request;
    }
    
}
