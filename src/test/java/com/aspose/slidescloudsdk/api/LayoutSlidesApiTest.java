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

import com.aspose.slidescloudsdk.model.LayoutSlide;
import com.aspose.slidescloudsdk.model.LayoutSlideListResponse;
import com.aspose.slidescloudsdk.model.LayoutSlideResponse;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slidescloudsdk.model.request.GetLayoutSlideRequest;
import com.aspose.slidescloudsdk.model.request.GetLayoutSlidesListRequest;
import com.aspose.slidescloudsdk.model.request.PostCopyLayoutSlideFromSourcePresentationRequest;
import com.aspose.slidescloudsdk.model.request.PutLayoutSlideRequest;

/**
 * API tests for LayoutSlidesApi
 */
public class LayoutSlidesApiTest extends ApiTest {

    private final LayoutSlidesApi api = new LayoutSlidesApi(getConfiguration());

    
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlideTest() throws ApiException, Exception {
        initialize("getLayoutSlide", null, null);
        Boolean needAssertResponse = false;
        LayoutSlideResponse response = null;;
        try {
            GetLayoutSlideRequest request = createGetLayoutSlideRequest();
            response = api.getLayoutSlide(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getLayoutSlide");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetLayoutSlideRequest request = createGetLayoutSlideRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getLayoutSlide", "name", request.getName());
            LayoutSlideResponse response = api.getLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getLayoutSlide");
        }
        if (needAssertResponse) {
            assertResponse("name", "getLayoutSlide");
        }
    }
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetLayoutSlideRequest request = createGetLayoutSlideRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getLayoutSlide", "slideIndex", request.getSlideIndex());
            LayoutSlideResponse response = api.getLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getLayoutSlide");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getLayoutSlide");
        }
    }
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetLayoutSlideRequest request = createGetLayoutSlideRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getLayoutSlide", "password", request.getPassword());
            LayoutSlideResponse response = api.getLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getLayoutSlide");
        }
        if (needAssertResponse) {
            assertResponse("password", "getLayoutSlide");
        }
    }
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetLayoutSlideRequest request = createGetLayoutSlideRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getLayoutSlide", "folder", request.getFolder());
            LayoutSlideResponse response = api.getLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getLayoutSlide");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getLayoutSlide");
        }
    }
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetLayoutSlideRequest request = createGetLayoutSlideRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getLayoutSlide", "storage", request.getStorage());
            LayoutSlideResponse response = api.getLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getLayoutSlide");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getLayoutSlide");
        }
    }

    private GetLayoutSlideRequest createGetLayoutSlideRequest() {
        GetLayoutSlideRequest request = new GetLayoutSlideRequest();
        request.setName((String)getTestValue("getLayoutSlide", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getLayoutSlide", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("getLayoutSlide", "password", "String"));
        request.setFolder((String)getTestValue("getLayoutSlide", "folder", "String"));
        request.setStorage((String)getTestValue("getLayoutSlide", "storage", "String"));
        return request;
    }
    
    /**
     * Read presentation layoutSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlidesListTest() throws ApiException, Exception {
        initialize("getLayoutSlidesList", null, null);
        Boolean needAssertResponse = false;
        LayoutSlideListResponse response = null;;
        try {
            GetLayoutSlidesListRequest request = createGetLayoutSlidesListRequest();
            response = api.getLayoutSlidesList(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getLayoutSlidesList");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Read presentation layoutSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlidesListInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetLayoutSlidesListRequest request = createGetLayoutSlidesListRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getLayoutSlidesList", "name", request.getName());
            LayoutSlideListResponse response = api.getLayoutSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getLayoutSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("name", "getLayoutSlidesList");
        }
    }
    /**
     * Read presentation layoutSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlidesListInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetLayoutSlidesListRequest request = createGetLayoutSlidesListRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getLayoutSlidesList", "password", request.getPassword());
            LayoutSlideListResponse response = api.getLayoutSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getLayoutSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("password", "getLayoutSlidesList");
        }
    }
    /**
     * Read presentation layoutSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlidesListInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetLayoutSlidesListRequest request = createGetLayoutSlidesListRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getLayoutSlidesList", "folder", request.getFolder());
            LayoutSlideListResponse response = api.getLayoutSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getLayoutSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getLayoutSlidesList");
        }
    }
    /**
     * Read presentation layoutSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLayoutSlidesListInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetLayoutSlidesListRequest request = createGetLayoutSlidesListRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getLayoutSlidesList", "storage", request.getStorage());
            LayoutSlideListResponse response = api.getLayoutSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getLayoutSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getLayoutSlidesList");
        }
    }

    private GetLayoutSlidesListRequest createGetLayoutSlidesListRequest() {
        GetLayoutSlidesListRequest request = new GetLayoutSlidesListRequest();
        request.setName((String)getTestValue("getLayoutSlidesList", "name", "String"));
        request.setPassword((String)getTestValue("getLayoutSlidesList", "password", "String"));
        request.setFolder((String)getTestValue("getLayoutSlidesList", "folder", "String"));
        request.setStorage((String)getTestValue("getLayoutSlidesList", "storage", "String"));
        return request;
    }
    
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationTest() throws ApiException, Exception {
        initialize("postCopyLayoutSlideFromSourcePresentation", null, null);
        Boolean needAssertResponse = false;
        LayoutSlideResponse response = null;;
        try {
            PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
            response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postCopyLayoutSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "name", request.getName());
            LayoutSlideResponse response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postCopyLayoutSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("name", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidCloneFromTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
            request.setCloneFrom((String)invalidizeTestValue(request.getCloneFrom(), "cloneFrom", "String"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "cloneFrom", request.getCloneFrom());
            LayoutSlideResponse response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFrom", "postCopyLayoutSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("cloneFrom", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidCloneFromPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
            request.setCloneFromPosition((Integer)invalidizeTestValue(request.getCloneFromPosition(), "cloneFromPosition", "Integer"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "cloneFromPosition", request.getCloneFromPosition());
            LayoutSlideResponse response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFromPosition", "postCopyLayoutSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("cloneFromPosition", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidCloneFromPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
            request.setCloneFromPassword((String)invalidizeTestValue(request.getCloneFromPassword(), "cloneFromPassword", "String"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "cloneFromPassword", request.getCloneFromPassword());
            LayoutSlideResponse response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFromPassword", "postCopyLayoutSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("cloneFromPassword", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidCloneFromStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
            request.setCloneFromStorage((String)invalidizeTestValue(request.getCloneFromStorage(), "cloneFromStorage", "String"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "cloneFromStorage", request.getCloneFromStorage());
            LayoutSlideResponse response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFromStorage", "postCopyLayoutSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("cloneFromStorage", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "password", request.getPassword());
            LayoutSlideResponse response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postCopyLayoutSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("password", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "folder", request.getFolder());
            LayoutSlideResponse response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postCopyLayoutSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postCopyLayoutSlideFromSourcePresentation");
        }
    }
    /**
     * Copy layoutSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyLayoutSlideFromSourcePresentationInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyLayoutSlideFromSourcePresentationRequest request = createPostCopyLayoutSlideFromSourcePresentationRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postCopyLayoutSlideFromSourcePresentation", "storage", request.getStorage());
            LayoutSlideResponse response = api.postCopyLayoutSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postCopyLayoutSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postCopyLayoutSlideFromSourcePresentation");
        }
    }

    private PostCopyLayoutSlideFromSourcePresentationRequest createPostCopyLayoutSlideFromSourcePresentationRequest() {
        PostCopyLayoutSlideFromSourcePresentationRequest request = new PostCopyLayoutSlideFromSourcePresentationRequest();
        request.setName((String)getTestValue("postCopyLayoutSlideFromSourcePresentation", "name", "String"));
        request.setCloneFrom((String)getTestValue("postCopyLayoutSlideFromSourcePresentation", "cloneFrom", "String"));
        request.setCloneFromPosition((Integer)getTestValue("postCopyLayoutSlideFromSourcePresentation", "cloneFromPosition", "Integer"));
        request.setCloneFromPassword((String)getTestValue("postCopyLayoutSlideFromSourcePresentation", "cloneFromPassword", "String"));
        request.setCloneFromStorage((String)getTestValue("postCopyLayoutSlideFromSourcePresentation", "cloneFromStorage", "String"));
        request.setPassword((String)getTestValue("postCopyLayoutSlideFromSourcePresentation", "password", "String"));
        request.setFolder((String)getTestValue("postCopyLayoutSlideFromSourcePresentation", "folder", "String"));
        request.setStorage((String)getTestValue("postCopyLayoutSlideFromSourcePresentation", "storage", "String"));
        return request;
    }
    
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideTest() throws ApiException, Exception {
        initialize("putLayoutSlide", null, null);
        Boolean needAssertResponse = false;
        LayoutSlideResponse response = null;;
        try {
            PutLayoutSlideRequest request = createPutLayoutSlideRequest();
            response = api.putLayoutSlide(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putLayoutSlide");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutLayoutSlideRequest request = createPutLayoutSlideRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putLayoutSlide", "name", request.getName());
            LayoutSlideResponse response = api.putLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putLayoutSlide");
        }
        if (needAssertResponse) {
            assertResponse("name", "putLayoutSlide");
        }
    }
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutLayoutSlideRequest request = createPutLayoutSlideRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("putLayoutSlide", "slideIndex", request.getSlideIndex());
            LayoutSlideResponse response = api.putLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putLayoutSlide");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putLayoutSlide");
        }
    }
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideInvalidSlideDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutLayoutSlideRequest request = createPutLayoutSlideRequest();
            request.setSlideDto((LayoutSlide)invalidizeTestValue(request.getSlideDto(), "slideDto", "LayoutSlide"));
            initialize("putLayoutSlide", "slideDto", request.getSlideDto());
            LayoutSlideResponse response = api.putLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideDto", "putLayoutSlide");
        }
        if (needAssertResponse) {
            assertResponse("slideDto", "putLayoutSlide");
        }
    }
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutLayoutSlideRequest request = createPutLayoutSlideRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putLayoutSlide", "password", request.getPassword());
            LayoutSlideResponse response = api.putLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putLayoutSlide");
        }
        if (needAssertResponse) {
            assertResponse("password", "putLayoutSlide");
        }
    }
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutLayoutSlideRequest request = createPutLayoutSlideRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putLayoutSlide", "folder", request.getFolder());
            LayoutSlideResponse response = api.putLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putLayoutSlide");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putLayoutSlide");
        }
    }
    /**
     * Read presentation layoutSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putLayoutSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutLayoutSlideRequest request = createPutLayoutSlideRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putLayoutSlide", "storage", request.getStorage());
            LayoutSlideResponse response = api.putLayoutSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putLayoutSlide");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putLayoutSlide");
        }
    }

    private PutLayoutSlideRequest createPutLayoutSlideRequest() {
        PutLayoutSlideRequest request = new PutLayoutSlideRequest();
        request.setName((String)getTestValue("putLayoutSlide", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("putLayoutSlide", "slideIndex", "Integer"));
        request.setSlideDto((LayoutSlide)getTestValue("putLayoutSlide", "slideDto", "LayoutSlide"));
        request.setPassword((String)getTestValue("putLayoutSlide", "password", "String"));
        request.setFolder((String)getTestValue("putLayoutSlide", "folder", "String"));
        request.setStorage((String)getTestValue("putLayoutSlide", "storage", "String"));
        return request;
    }
    
}
