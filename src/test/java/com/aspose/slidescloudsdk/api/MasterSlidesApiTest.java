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

import com.aspose.slidescloudsdk.model.MasterSlideListResponse;
import com.aspose.slidescloudsdk.model.MasterSlideResponse;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slidescloudsdk.model.request.GetMasterSlideRequest;
import com.aspose.slidescloudsdk.model.request.GetMasterSlidesListRequest;
import com.aspose.slidescloudsdk.model.request.PostCopyMasterSlideFromSourcePresentationRequest;

/**
 * API tests for MasterSlidesApi
 */
public class MasterSlidesApiTest extends ApiTest {

    private final MasterSlidesApi api = new MasterSlidesApi(getConfiguration());

    
    /**
     * Read presentation masterSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlideTest() throws ApiException, Exception {
        initialize("getMasterSlide", null, null);
        Boolean needAssertResponse = false;
        MasterSlideResponse response = null;;
        try {
            GetMasterSlideRequest request = createGetMasterSlideRequest();
            response = api.getMasterSlide(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getMasterSlide");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read presentation masterSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetMasterSlideRequest request = createGetMasterSlideRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getMasterSlide", "name", request.getName());
            MasterSlideResponse response = api.getMasterSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getMasterSlide");
        }
        if (needAssertResponse) {
            assertResponse("name", "getMasterSlide");
        }
    }
    /**
     * Read presentation masterSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetMasterSlideRequest request = createGetMasterSlideRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getMasterSlide", "slideIndex", request.getSlideIndex());
            MasterSlideResponse response = api.getMasterSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getMasterSlide");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getMasterSlide");
        }
    }
    /**
     * Read presentation masterSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetMasterSlideRequest request = createGetMasterSlideRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getMasterSlide", "password", request.getPassword());
            MasterSlideResponse response = api.getMasterSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getMasterSlide");
        }
        if (needAssertResponse) {
            assertResponse("password", "getMasterSlide");
        }
    }
    /**
     * Read presentation masterSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetMasterSlideRequest request = createGetMasterSlideRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getMasterSlide", "folder", request.getFolder());
            MasterSlideResponse response = api.getMasterSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getMasterSlide");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getMasterSlide");
        }
    }
    /**
     * Read presentation masterSlide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetMasterSlideRequest request = createGetMasterSlideRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getMasterSlide", "storage", request.getStorage());
            MasterSlideResponse response = api.getMasterSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getMasterSlide");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getMasterSlide");
        }
    }

    private GetMasterSlideRequest createGetMasterSlideRequest() {
        GetMasterSlideRequest request = new GetMasterSlideRequest();
        request.setName((String)getTestValue("getMasterSlide", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getMasterSlide", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("getMasterSlide", "password", "String"));
        request.setFolder((String)getTestValue("getMasterSlide", "folder", "String"));
        request.setStorage((String)getTestValue("getMasterSlide", "storage", "String"));
        return request;
    }
    
    /**
     * Read presentation masterSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlidesListTest() throws ApiException, Exception {
        initialize("getMasterSlidesList", null, null);
        Boolean needAssertResponse = false;
        MasterSlideListResponse response = null;;
        try {
            GetMasterSlidesListRequest request = createGetMasterSlidesListRequest();
            response = api.getMasterSlidesList(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getMasterSlidesList");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read presentation masterSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlidesListInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetMasterSlidesListRequest request = createGetMasterSlidesListRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getMasterSlidesList", "name", request.getName());
            MasterSlideListResponse response = api.getMasterSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getMasterSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("name", "getMasterSlidesList");
        }
    }
    /**
     * Read presentation masterSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlidesListInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetMasterSlidesListRequest request = createGetMasterSlidesListRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getMasterSlidesList", "password", request.getPassword());
            MasterSlideListResponse response = api.getMasterSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getMasterSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("password", "getMasterSlidesList");
        }
    }
    /**
     * Read presentation masterSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlidesListInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetMasterSlidesListRequest request = createGetMasterSlidesListRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getMasterSlidesList", "folder", request.getFolder());
            MasterSlideListResponse response = api.getMasterSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getMasterSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getMasterSlidesList");
        }
    }
    /**
     * Read presentation masterSlides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMasterSlidesListInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetMasterSlidesListRequest request = createGetMasterSlidesListRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getMasterSlidesList", "storage", request.getStorage());
            MasterSlideListResponse response = api.getMasterSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getMasterSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getMasterSlidesList");
        }
    }

    private GetMasterSlidesListRequest createGetMasterSlidesListRequest() {
        GetMasterSlidesListRequest request = new GetMasterSlidesListRequest();
        request.setName((String)getTestValue("getMasterSlidesList", "name", "String"));
        request.setPassword((String)getTestValue("getMasterSlidesList", "password", "String"));
        request.setFolder((String)getTestValue("getMasterSlidesList", "folder", "String"));
        request.setStorage((String)getTestValue("getMasterSlidesList", "storage", "String"));
        return request;
    }
    
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationTest() throws ApiException, Exception {
        initialize("postCopyMasterSlideFromSourcePresentation", null, null);
        Boolean needAssertResponse = false;
        MasterSlideResponse response = null;;
        try {
            PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
            response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postCopyMasterSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postCopyMasterSlideFromSourcePresentation", "name", request.getName());
            MasterSlideResponse response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postCopyMasterSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("name", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidCloneFromTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
            request.setCloneFrom((String)invalidizeTestValue(request.getCloneFrom(), "cloneFrom", "String"));
            initialize("postCopyMasterSlideFromSourcePresentation", "cloneFrom", request.getCloneFrom());
            MasterSlideResponse response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFrom", "postCopyMasterSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("cloneFrom", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidCloneFromPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
            request.setCloneFromPosition((Integer)invalidizeTestValue(request.getCloneFromPosition(), "cloneFromPosition", "Integer"));
            initialize("postCopyMasterSlideFromSourcePresentation", "cloneFromPosition", request.getCloneFromPosition());
            MasterSlideResponse response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFromPosition", "postCopyMasterSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("cloneFromPosition", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidCloneFromPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
            request.setCloneFromPassword((String)invalidizeTestValue(request.getCloneFromPassword(), "cloneFromPassword", "String"));
            initialize("postCopyMasterSlideFromSourcePresentation", "cloneFromPassword", request.getCloneFromPassword());
            MasterSlideResponse response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFromPassword", "postCopyMasterSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("cloneFromPassword", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidCloneFromStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
            request.setCloneFromStorage((String)invalidizeTestValue(request.getCloneFromStorage(), "cloneFromStorage", "String"));
            initialize("postCopyMasterSlideFromSourcePresentation", "cloneFromStorage", request.getCloneFromStorage());
            MasterSlideResponse response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "cloneFromStorage", "postCopyMasterSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("cloneFromStorage", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidApplyToAllTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
            request.setApplyToAll((Boolean)invalidizeTestValue(request.getApplyToAll(), "applyToAll", "Boolean"));
            initialize("postCopyMasterSlideFromSourcePresentation", "applyToAll", request.getApplyToAll());
            MasterSlideResponse response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "applyToAll", "postCopyMasterSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("applyToAll", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postCopyMasterSlideFromSourcePresentation", "password", request.getPassword());
            MasterSlideResponse response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postCopyMasterSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("password", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postCopyMasterSlideFromSourcePresentation", "folder", request.getFolder());
            MasterSlideResponse response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postCopyMasterSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postCopyMasterSlideFromSourcePresentation");
        }
    }
    /**
     * Copy masterSlide from source presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCopyMasterSlideFromSourcePresentationInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostCopyMasterSlideFromSourcePresentationRequest request = createPostCopyMasterSlideFromSourcePresentationRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postCopyMasterSlideFromSourcePresentation", "storage", request.getStorage());
            MasterSlideResponse response = api.postCopyMasterSlideFromSourcePresentation(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postCopyMasterSlideFromSourcePresentation");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postCopyMasterSlideFromSourcePresentation");
        }
    }

    private PostCopyMasterSlideFromSourcePresentationRequest createPostCopyMasterSlideFromSourcePresentationRequest() {
        PostCopyMasterSlideFromSourcePresentationRequest request = new PostCopyMasterSlideFromSourcePresentationRequest();
        request.setName((String)getTestValue("postCopyMasterSlideFromSourcePresentation", "name", "String"));
        request.setCloneFrom((String)getTestValue("postCopyMasterSlideFromSourcePresentation", "cloneFrom", "String"));
        request.setCloneFromPosition((Integer)getTestValue("postCopyMasterSlideFromSourcePresentation", "cloneFromPosition", "Integer"));
        request.setCloneFromPassword((String)getTestValue("postCopyMasterSlideFromSourcePresentation", "cloneFromPassword", "String"));
        request.setCloneFromStorage((String)getTestValue("postCopyMasterSlideFromSourcePresentation", "cloneFromStorage", "String"));
        request.setApplyToAll((Boolean)getTestValue("postCopyMasterSlideFromSourcePresentation", "applyToAll", "Boolean"));
        request.setPassword((String)getTestValue("postCopyMasterSlideFromSourcePresentation", "password", "String"));
        request.setFolder((String)getTestValue("postCopyMasterSlideFromSourcePresentation", "folder", "String"));
        request.setStorage((String)getTestValue("postCopyMasterSlideFromSourcePresentation", "storage", "String"));
        return request;
    }
    
}
