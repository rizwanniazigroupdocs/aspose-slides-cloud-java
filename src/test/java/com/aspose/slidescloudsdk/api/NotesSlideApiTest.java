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

import java.io.File;
import com.aspose.slidescloudsdk.model.NotesSlide;
import com.aspose.slidescloudsdk.model.NotesSlideResponse;
import com.aspose.slidescloudsdk.model.SlideResponse;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slidescloudsdk.model.request.DeleteNotesSlideRequest;
import com.aspose.slidescloudsdk.model.request.GetNotesSlideRequest;
import com.aspose.slidescloudsdk.model.request.GetNotesSlideWithFormatRequest;
import com.aspose.slidescloudsdk.model.request.PostAddNotesSlideRequest;
import com.aspose.slidescloudsdk.model.request.PutUpdateNotesSlideRequest;

/**
 * API tests for NotesSlideApi
 */
public class NotesSlideApiTest extends ApiTest {

    private final NotesSlideApi api = new NotesSlideApi(getConfiguration());

    
    /**
     * Remove Notes Slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideTest() throws ApiException, Exception {
        initialize("deleteNotesSlide", null, null);
        Boolean needAssertResponse = false;
        SlideResponse response = null;;
        try {
            DeleteNotesSlideRequest request = createDeleteNotesSlideRequest();
            response = api.deleteNotesSlide(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteNotesSlide");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Remove Notes Slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideRequest request = createDeleteNotesSlideRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteNotesSlide", "name", request.getName());
            SlideResponse response = api.deleteNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlide");
        }
    }
    /**
     * Remove Notes Slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideRequest request = createDeleteNotesSlideRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deleteNotesSlide", "slideIndex", request.getSlideIndex());
            SlideResponse response = api.deleteNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlide");
        }
    }
    /**
     * Remove Notes Slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideRequest request = createDeleteNotesSlideRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteNotesSlide", "password", request.getPassword());
            SlideResponse response = api.deleteNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlide");
        }
    }
    /**
     * Remove Notes Slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideRequest request = createDeleteNotesSlideRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteNotesSlide", "folder", request.getFolder());
            SlideResponse response = api.deleteNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlide");
        }
    }
    /**
     * Remove Notes Slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideRequest request = createDeleteNotesSlideRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteNotesSlide", "storage", request.getStorage());
            SlideResponse response = api.deleteNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlide");
        }
    }

    private DeleteNotesSlideRequest createDeleteNotesSlideRequest() {
        DeleteNotesSlideRequest request = new DeleteNotesSlideRequest();
        request.setName((String)getTestValue("deleteNotesSlide", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deleteNotesSlide", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("deleteNotesSlide", "password", "String"));
        request.setFolder((String)getTestValue("deleteNotesSlide", "folder", "String"));
        request.setStorage((String)getTestValue("deleteNotesSlide", "storage", "String"));
        return request;
    }
    
    /**
     * Read Notes slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideTest() throws ApiException, Exception {
        initialize("getNotesSlide", null, null);
        Boolean needAssertResponse = false;
        NotesSlideResponse response = null;;
        try {
            GetNotesSlideRequest request = createGetNotesSlideRequest();
            response = api.getNotesSlide(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getNotesSlide");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Read Notes slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideRequest request = createGetNotesSlideRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getNotesSlide", "name", request.getName());
            NotesSlideResponse response = api.getNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlide");
        }
    }
    /**
     * Read Notes slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideRequest request = createGetNotesSlideRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getNotesSlide", "slideIndex", request.getSlideIndex());
            NotesSlideResponse response = api.getNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlide");
        }
    }
    /**
     * Read Notes slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideRequest request = createGetNotesSlideRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getNotesSlide", "password", request.getPassword());
            NotesSlideResponse response = api.getNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlide");
        }
    }
    /**
     * Read Notes slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideRequest request = createGetNotesSlideRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getNotesSlide", "folder", request.getFolder());
            NotesSlideResponse response = api.getNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlide");
        }
    }
    /**
     * Read Notes slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideRequest request = createGetNotesSlideRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getNotesSlide", "storage", request.getStorage());
            NotesSlideResponse response = api.getNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlide");
        }
    }

    private GetNotesSlideRequest createGetNotesSlideRequest() {
        GetNotesSlideRequest request = new GetNotesSlideRequest();
        request.setName((String)getTestValue("getNotesSlide", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getNotesSlide", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("getNotesSlide", "password", "String"));
        request.setFolder((String)getTestValue("getNotesSlide", "folder", "String"));
        request.setStorage((String)getTestValue("getNotesSlide", "storage", "String"));
        return request;
    }
    
    /**
     * Convert Notes Slide to the specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatTest() throws ApiException, Exception {
        initialize("getNotesSlideWithFormat", null, null);
        Boolean needAssertResponse = false;
        File response = null;;
        try {
            GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
            response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getNotesSlideWithFormat");
        }
        if (needAssertResponse) {
            assertTrue(response.isFile());
        }
    }

    /**
     * Convert Notes Slide to the specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getNotesSlideWithFormat", "name", request.getName());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert Notes Slide to the specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getNotesSlideWithFormat", "slideIndex", request.getSlideIndex());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert Notes Slide to the specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
            request.setFormat((NotesSlideExportFormat)invalidizeTestValue(request.getFormat(), "format", "NotesSlideExportFormat"));
            initialize("getNotesSlideWithFormat", "format", request.getFormat());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "getNotesSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("format", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert Notes Slide to the specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidWidthTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
            request.setWidth((Integer)invalidizeTestValue(request.getWidth(), "width", "Integer"));
            initialize("getNotesSlideWithFormat", "width", request.getWidth());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "width", "getNotesSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("width", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert Notes Slide to the specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidHeightTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
            request.setHeight((Integer)invalidizeTestValue(request.getHeight(), "height", "Integer"));
            initialize("getNotesSlideWithFormat", "height", request.getHeight());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "height", "getNotesSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("height", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert Notes Slide to the specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getNotesSlideWithFormat", "password", request.getPassword());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert Notes Slide to the specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getNotesSlideWithFormat", "folder", request.getFolder());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideWithFormat");
        }
    }
    /**
     * Convert Notes Slide to the specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotesSlideWithFormatInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideWithFormatRequest request = createGetNotesSlideWithFormatRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getNotesSlideWithFormat", "storage", request.getStorage());
            File response = api.getNotesSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideWithFormat");
        }
    }

    private GetNotesSlideWithFormatRequest createGetNotesSlideWithFormatRequest() {
        GetNotesSlideWithFormatRequest request = new GetNotesSlideWithFormatRequest();
        request.setName((String)getTestValue("getNotesSlideWithFormat", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getNotesSlideWithFormat", "slideIndex", "Integer"));
        request.setFormat((NotesSlideExportFormat)getTestValue("getNotesSlideWithFormat", "format", "NotesSlideExportFormat"));
        request.setWidth((Integer)getTestValue("getNotesSlideWithFormat", "width", "Integer"));
        request.setHeight((Integer)getTestValue("getNotesSlideWithFormat", "height", "Integer"));
        request.setPassword((String)getTestValue("getNotesSlideWithFormat", "password", "String"));
        request.setFolder((String)getTestValue("getNotesSlideWithFormat", "folder", "String"));
        request.setStorage((String)getTestValue("getNotesSlideWithFormat", "storage", "String"));
        return request;
    }
    
    /**
     * Add new Notes Slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideTest() throws ApiException, Exception {
        initialize("postAddNotesSlide", null, null);
        Boolean needAssertResponse = false;
        NotesSlideResponse response = null;;
        try {
            PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
            response = api.postAddNotesSlide(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postAddNotesSlide");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Add new Notes Slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postAddNotesSlide", "name", request.getName());
            NotesSlideResponse response = api.postAddNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postAddNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("name", "postAddNotesSlide");
        }
    }
    /**
     * Add new Notes Slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("postAddNotesSlide", "slideIndex", request.getSlideIndex());
            NotesSlideResponse response = api.postAddNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postAddNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postAddNotesSlide");
        }
    }
    /**
     * Add new Notes Slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
            request.setDto((NotesSlide)invalidizeTestValue(request.getDto(), "dto", "NotesSlide"));
            initialize("postAddNotesSlide", "dto", request.getDto());
            NotesSlideResponse response = api.postAddNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postAddNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("dto", "postAddNotesSlide");
        }
    }
    /**
     * Add new Notes Slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postAddNotesSlide", "password", request.getPassword());
            NotesSlideResponse response = api.postAddNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postAddNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("password", "postAddNotesSlide");
        }
    }
    /**
     * Add new Notes Slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postAddNotesSlide", "folder", request.getFolder());
            NotesSlideResponse response = api.postAddNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postAddNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postAddNotesSlide");
        }
    }
    /**
     * Add new Notes Slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNotesSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNotesSlideRequest request = createPostAddNotesSlideRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postAddNotesSlide", "storage", request.getStorage());
            NotesSlideResponse response = api.postAddNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postAddNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postAddNotesSlide");
        }
    }

    private PostAddNotesSlideRequest createPostAddNotesSlideRequest() {
        PostAddNotesSlideRequest request = new PostAddNotesSlideRequest();
        request.setName((String)getTestValue("postAddNotesSlide", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("postAddNotesSlide", "slideIndex", "Integer"));
        request.setDto((NotesSlide)getTestValue("postAddNotesSlide", "dto", "NotesSlide"));
        request.setPassword((String)getTestValue("postAddNotesSlide", "password", "String"));
        request.setFolder((String)getTestValue("postAddNotesSlide", "folder", "String"));
        request.setStorage((String)getTestValue("postAddNotesSlide", "storage", "String"));
        return request;
    }
    
    /**
     * Update Notes Slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideTest() throws ApiException, Exception {
        initialize("putUpdateNotesSlide", null, null);
        Boolean needAssertResponse = false;
        NotesSlideResponse response = null;;
        try {
            PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
            response = api.putUpdateNotesSlide(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putUpdateNotesSlide");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Update Notes Slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putUpdateNotesSlide", "name", request.getName());
            NotesSlideResponse response = api.putUpdateNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putUpdateNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("name", "putUpdateNotesSlide");
        }
    }
    /**
     * Update Notes Slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("putUpdateNotesSlide", "slideIndex", request.getSlideIndex());
            NotesSlideResponse response = api.putUpdateNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putUpdateNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putUpdateNotesSlide");
        }
    }
    /**
     * Update Notes Slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
            request.setDto((NotesSlide)invalidizeTestValue(request.getDto(), "dto", "NotesSlide"));
            initialize("putUpdateNotesSlide", "dto", request.getDto());
            NotesSlideResponse response = api.putUpdateNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putUpdateNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("dto", "putUpdateNotesSlide");
        }
    }
    /**
     * Update Notes Slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putUpdateNotesSlide", "password", request.getPassword());
            NotesSlideResponse response = api.putUpdateNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putUpdateNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("password", "putUpdateNotesSlide");
        }
    }
    /**
     * Update Notes Slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putUpdateNotesSlide", "folder", request.getFolder());
            NotesSlideResponse response = api.putUpdateNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putUpdateNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putUpdateNotesSlide");
        }
    }
    /**
     * Update Notes Slide properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putUpdateNotesSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideRequest request = createPutUpdateNotesSlideRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putUpdateNotesSlide", "storage", request.getStorage());
            NotesSlideResponse response = api.putUpdateNotesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putUpdateNotesSlide");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putUpdateNotesSlide");
        }
    }

    private PutUpdateNotesSlideRequest createPutUpdateNotesSlideRequest() {
        PutUpdateNotesSlideRequest request = new PutUpdateNotesSlideRequest();
        request.setName((String)getTestValue("putUpdateNotesSlide", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("putUpdateNotesSlide", "slideIndex", "Integer"));
        request.setDto((NotesSlide)getTestValue("putUpdateNotesSlide", "dto", "NotesSlide"));
        request.setPassword((String)getTestValue("putUpdateNotesSlide", "password", "String"));
        request.setFolder((String)getTestValue("putUpdateNotesSlide", "folder", "String"));
        request.setStorage((String)getTestValue("putUpdateNotesSlide", "storage", "String"));
        return request;
    }
    
}
