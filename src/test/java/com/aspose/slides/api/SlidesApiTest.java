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

package com.aspose.slides.api;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aspose.slides.ApiException;
import com.aspose.slides.FileInfo;
import com.aspose.slides.ApiTest;
import com.aspose.slides.model.*;

import com.aspose.slides.model.ExportOptions;
import java.io.File;
import com.aspose.slides.model.Slide;
import com.aspose.slides.model.SlideBackground;
import com.aspose.slides.model.SlideBackgroundResponse;
import com.aspose.slides.model.SlideCommentsResponse;
import com.aspose.slides.model.SlideListResponse;
import com.aspose.slides.model.SlideResponse;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slides.model.request.DeleteSlideByIndexRequest;
import com.aspose.slides.model.request.DeleteSlidesCleanSlidesListRequest;
import com.aspose.slides.model.request.DeleteSlidesSlideBackgroundRequest;
import com.aspose.slides.model.request.GetSlideWithFormatRequest;
import com.aspose.slides.model.request.GetSlidesSlideRequest;
import com.aspose.slides.model.request.GetSlidesSlideBackgroundRequest;
import com.aspose.slides.model.request.GetSlidesSlideCommentsRequest;
import com.aspose.slides.model.request.GetSlidesSlidesListRequest;
import com.aspose.slides.model.request.PostSlideSaveAsRequest;
import com.aspose.slides.model.request.PostSlidesAddRequest;
import com.aspose.slides.model.request.PostSlidesCopyRequest;
import com.aspose.slides.model.request.PostSlidesReorderRequest;
import com.aspose.slides.model.request.PostSlidesReorderManyRequest;
import com.aspose.slides.model.request.PostSlidesReorderPositionRequest;
import com.aspose.slides.model.request.PutSlidesSlideRequest;
import com.aspose.slides.model.request.PutSlidesSlideBackgroundRequest;

/**
 * API tests for SlidesApi
 */
public class SlidesApiTest extends ApiTest {

    private final SlidesApi api = new SlidesApi(getConfiguration());

    
    /**
     * Delete a presentation slide by its index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideByIndexTest() throws ApiException, Exception {
        initialize("deleteSlideByIndex", null, null);
        Boolean needAssertResponse = false;
        SlideListResponse response = null;;
        try {
            DeleteSlideByIndexRequest request = createDeleteSlideByIndexRequest();
            response = api.deleteSlideByIndex(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteSlideByIndex");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Delete a presentation slide by its index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideByIndexInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideByIndexRequest request = createDeleteSlideByIndexRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteSlideByIndex", "name", request.getName());
            SlideListResponse response = api.deleteSlideByIndex(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlideByIndex");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlideByIndex");
        }
    }
    /**
     * Delete a presentation slide by its index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideByIndexInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideByIndexRequest request = createDeleteSlideByIndexRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deleteSlideByIndex", "slideIndex", request.getSlideIndex());
            SlideListResponse response = api.deleteSlideByIndex(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlideByIndex");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlideByIndex");
        }
    }
    /**
     * Delete a presentation slide by its index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideByIndexInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideByIndexRequest request = createDeleteSlideByIndexRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteSlideByIndex", "password", request.getPassword());
            SlideListResponse response = api.deleteSlideByIndex(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlideByIndex");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlideByIndex");
        }
    }
    /**
     * Delete a presentation slide by its index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideByIndexInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideByIndexRequest request = createDeleteSlideByIndexRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteSlideByIndex", "folder", request.getFolder());
            SlideListResponse response = api.deleteSlideByIndex(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlideByIndex");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlideByIndex");
        }
    }
    /**
     * Delete a presentation slide by its index.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideByIndexInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideByIndexRequest request = createDeleteSlideByIndexRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteSlideByIndex", "storage", request.getStorage());
            SlideListResponse response = api.deleteSlideByIndex(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlideByIndex");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlideByIndex");
        }
    }

    private DeleteSlideByIndexRequest createDeleteSlideByIndexRequest() {
        DeleteSlideByIndexRequest request = new DeleteSlideByIndexRequest();
        request.setName((String)getTestValue("deleteSlideByIndex", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deleteSlideByIndex", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("deleteSlideByIndex", "password", "String"));
        request.setFolder((String)getTestValue("deleteSlideByIndex", "folder", "String"));
        request.setStorage((String)getTestValue("deleteSlideByIndex", "storage", "String"));
        return request;
    }
    
    /**
     * Delete presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesCleanSlidesListTest() throws ApiException, Exception {
        initialize("deleteSlidesCleanSlidesList", null, null);
        Boolean needAssertResponse = false;
        SlideListResponse response = null;;
        try {
            DeleteSlidesCleanSlidesListRequest request = createDeleteSlidesCleanSlidesListRequest();
            response = api.deleteSlidesCleanSlidesList(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteSlidesCleanSlidesList");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Delete presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesCleanSlidesListInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesCleanSlidesListRequest request = createDeleteSlidesCleanSlidesListRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteSlidesCleanSlidesList", "name", request.getName());
            SlideListResponse response = api.deleteSlidesCleanSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlidesCleanSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlidesCleanSlidesList");
        }
    }
    /**
     * Delete presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesCleanSlidesListInvalidSlidesTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesCleanSlidesListRequest request = createDeleteSlidesCleanSlidesListRequest();
            request.setSlides((List<Integer>)invalidizeTestValue(request.getSlides(), "slides", "List<Integer>"));
            initialize("deleteSlidesCleanSlidesList", "slides", request.getSlides());
            SlideListResponse response = api.deleteSlidesCleanSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slides", "deleteSlidesCleanSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("slides", "deleteSlidesCleanSlidesList");
        }
    }
    /**
     * Delete presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesCleanSlidesListInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesCleanSlidesListRequest request = createDeleteSlidesCleanSlidesListRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteSlidesCleanSlidesList", "password", request.getPassword());
            SlideListResponse response = api.deleteSlidesCleanSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlidesCleanSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlidesCleanSlidesList");
        }
    }
    /**
     * Delete presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesCleanSlidesListInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesCleanSlidesListRequest request = createDeleteSlidesCleanSlidesListRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteSlidesCleanSlidesList", "folder", request.getFolder());
            SlideListResponse response = api.deleteSlidesCleanSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlidesCleanSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlidesCleanSlidesList");
        }
    }
    /**
     * Delete presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesCleanSlidesListInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesCleanSlidesListRequest request = createDeleteSlidesCleanSlidesListRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteSlidesCleanSlidesList", "storage", request.getStorage());
            SlideListResponse response = api.deleteSlidesCleanSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlidesCleanSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlidesCleanSlidesList");
        }
    }

    private DeleteSlidesCleanSlidesListRequest createDeleteSlidesCleanSlidesListRequest() {
        DeleteSlidesCleanSlidesListRequest request = new DeleteSlidesCleanSlidesListRequest();
        request.setName((String)getTestValue("deleteSlidesCleanSlidesList", "name", "String"));
        request.setSlides((List<Integer>)getTestValue("deleteSlidesCleanSlidesList", "slides", "List<Integer>"));
        request.setPassword((String)getTestValue("deleteSlidesCleanSlidesList", "password", "String"));
        request.setFolder((String)getTestValue("deleteSlidesCleanSlidesList", "folder", "String"));
        request.setStorage((String)getTestValue("deleteSlidesCleanSlidesList", "storage", "String"));
        return request;
    }
    
    /**
     * Remove background from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesSlideBackgroundTest() throws ApiException, Exception {
        initialize("deleteSlidesSlideBackground", null, null);
        Boolean needAssertResponse = false;
        SlideBackgroundResponse response = null;;
        try {
            DeleteSlidesSlideBackgroundRequest request = createDeleteSlidesSlideBackgroundRequest();
            response = api.deleteSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Remove background from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesSlideBackgroundInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesSlideBackgroundRequest request = createDeleteSlidesSlideBackgroundRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteSlidesSlideBackground", "name", request.getName());
            SlideBackgroundResponse response = api.deleteSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlidesSlideBackground");
        }
    }
    /**
     * Remove background from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesSlideBackgroundInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesSlideBackgroundRequest request = createDeleteSlidesSlideBackgroundRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deleteSlidesSlideBackground", "slideIndex", request.getSlideIndex());
            SlideBackgroundResponse response = api.deleteSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlidesSlideBackground");
        }
    }
    /**
     * Remove background from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesSlideBackgroundInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesSlideBackgroundRequest request = createDeleteSlidesSlideBackgroundRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteSlidesSlideBackground", "password", request.getPassword());
            SlideBackgroundResponse response = api.deleteSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlidesSlideBackground");
        }
    }
    /**
     * Remove background from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesSlideBackgroundInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesSlideBackgroundRequest request = createDeleteSlidesSlideBackgroundRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteSlidesSlideBackground", "folder", request.getFolder());
            SlideBackgroundResponse response = api.deleteSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlidesSlideBackground");
        }
    }
    /**
     * Remove background from a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesSlideBackgroundInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesSlideBackgroundRequest request = createDeleteSlidesSlideBackgroundRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteSlidesSlideBackground", "storage", request.getStorage());
            SlideBackgroundResponse response = api.deleteSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlidesSlideBackground");
        }
    }

    private DeleteSlidesSlideBackgroundRequest createDeleteSlidesSlideBackgroundRequest() {
        DeleteSlidesSlideBackgroundRequest request = new DeleteSlidesSlideBackgroundRequest();
        request.setName((String)getTestValue("deleteSlidesSlideBackground", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deleteSlidesSlideBackground", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("deleteSlidesSlideBackground", "password", "String"));
        request.setFolder((String)getTestValue("deleteSlidesSlideBackground", "folder", "String"));
        request.setStorage((String)getTestValue("deleteSlidesSlideBackground", "storage", "String"));
        return request;
    }
    
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideWithFormatTest() throws ApiException, Exception {
        initialize("getSlideWithFormat", null, null);
        Boolean needAssertResponse = false;
        File response = null;;
        try {
            GetSlideWithFormatRequest request = createGetSlideWithFormatRequest();
            response = api.getSlideWithFormat(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlideWithFormat");
        }
        if (needAssertResponse) {
            assertTrue(response.isFile());
        }
    }

    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideWithFormatInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideWithFormatRequest request = createGetSlideWithFormatRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlideWithFormat", "name", request.getName());
            File response = api.getSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlideWithFormat");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideWithFormatInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideWithFormatRequest request = createGetSlideWithFormatRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlideWithFormat", "slideIndex", request.getSlideIndex());
            File response = api.getSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlideWithFormat");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideWithFormatInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideWithFormatRequest request = createGetSlideWithFormatRequest();
            request.setFormat((SlideExportFormat)invalidizeTestValue(request.getFormat(), "format", "SlideExportFormat"));
            initialize("getSlideWithFormat", "format", request.getFormat());
            File response = api.getSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "getSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("format", "getSlideWithFormat");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideWithFormatInvalidWidthTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideWithFormatRequest request = createGetSlideWithFormatRequest();
            request.setWidth((Integer)invalidizeTestValue(request.getWidth(), "width", "Integer"));
            initialize("getSlideWithFormat", "width", request.getWidth());
            File response = api.getSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "width", "getSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("width", "getSlideWithFormat");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideWithFormatInvalidHeightTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideWithFormatRequest request = createGetSlideWithFormatRequest();
            request.setHeight((Integer)invalidizeTestValue(request.getHeight(), "height", "Integer"));
            initialize("getSlideWithFormat", "height", request.getHeight());
            File response = api.getSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "height", "getSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("height", "getSlideWithFormat");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideWithFormatInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideWithFormatRequest request = createGetSlideWithFormatRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlideWithFormat", "password", request.getPassword());
            File response = api.getSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlideWithFormat");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideWithFormatInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideWithFormatRequest request = createGetSlideWithFormatRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlideWithFormat", "folder", request.getFolder());
            File response = api.getSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlideWithFormat");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideWithFormatInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideWithFormatRequest request = createGetSlideWithFormatRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlideWithFormat", "storage", request.getStorage());
            File response = api.getSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlideWithFormat");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideWithFormatInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideWithFormatRequest request = createGetSlideWithFormatRequest();
            request.setOutPath((String)invalidizeTestValue(request.getOutPath(), "outPath", "String"));
            initialize("getSlideWithFormat", "outPath", request.getOutPath());
            File response = api.getSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "getSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("outPath", "getSlideWithFormat");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideWithFormatInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideWithFormatRequest request = createGetSlideWithFormatRequest();
            request.setFontsFolder((String)invalidizeTestValue(request.getFontsFolder(), "fontsFolder", "String"));
            initialize("getSlideWithFormat", "fontsFolder", request.getFontsFolder());
            File response = api.getSlideWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "getSlideWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "getSlideWithFormat");
        }
    }

    private GetSlideWithFormatRequest createGetSlideWithFormatRequest() {
        GetSlideWithFormatRequest request = new GetSlideWithFormatRequest();
        request.setName((String)getTestValue("getSlideWithFormat", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlideWithFormat", "slideIndex", "Integer"));
        request.setFormat((SlideExportFormat)getTestValue("getSlideWithFormat", "format", "SlideExportFormat"));
        request.setWidth((Integer)getTestValue("getSlideWithFormat", "width", "Integer"));
        request.setHeight((Integer)getTestValue("getSlideWithFormat", "height", "Integer"));
        request.setPassword((String)getTestValue("getSlideWithFormat", "password", "String"));
        request.setFolder((String)getTestValue("getSlideWithFormat", "folder", "String"));
        request.setStorage((String)getTestValue("getSlideWithFormat", "storage", "String"));
        request.setOutPath((String)getTestValue("getSlideWithFormat", "outPath", "String"));
        request.setFontsFolder((String)getTestValue("getSlideWithFormat", "fontsFolder", "String"));
        return request;
    }
    
    /**
     * Read a slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideTest() throws ApiException, Exception {
        initialize("getSlidesSlide", null, null);
        Boolean needAssertResponse = false;
        SlideResponse response = null;;
        try {
            GetSlidesSlideRequest request = createGetSlidesSlideRequest();
            response = api.getSlidesSlide(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesSlide");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read a slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideRequest request = createGetSlidesSlideRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesSlide", "name", request.getName());
            SlideResponse response = api.getSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesSlide");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesSlide");
        }
    }
    /**
     * Read a slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideRequest request = createGetSlidesSlideRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlidesSlide", "slideIndex", request.getSlideIndex());
            SlideResponse response = api.getSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesSlide");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesSlide");
        }
    }
    /**
     * Read a slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideRequest request = createGetSlidesSlideRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesSlide", "password", request.getPassword());
            SlideResponse response = api.getSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesSlide");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesSlide");
        }
    }
    /**
     * Read a slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideRequest request = createGetSlidesSlideRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesSlide", "folder", request.getFolder());
            SlideResponse response = api.getSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesSlide");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesSlide");
        }
    }
    /**
     * Read a slide info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideRequest request = createGetSlidesSlideRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesSlide", "storage", request.getStorage());
            SlideResponse response = api.getSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesSlide");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesSlide");
        }
    }

    private GetSlidesSlideRequest createGetSlidesSlideRequest() {
        GetSlidesSlideRequest request = new GetSlidesSlideRequest();
        request.setName((String)getTestValue("getSlidesSlide", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlidesSlide", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("getSlidesSlide", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesSlide", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesSlide", "storage", "String"));
        return request;
    }
    
    /**
     * Read background info for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideBackgroundTest() throws ApiException, Exception {
        initialize("getSlidesSlideBackground", null, null);
        Boolean needAssertResponse = false;
        SlideBackgroundResponse response = null;;
        try {
            GetSlidesSlideBackgroundRequest request = createGetSlidesSlideBackgroundRequest();
            response = api.getSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read background info for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideBackgroundInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideBackgroundRequest request = createGetSlidesSlideBackgroundRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesSlideBackground", "name", request.getName());
            SlideBackgroundResponse response = api.getSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesSlideBackground");
        }
    }
    /**
     * Read background info for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideBackgroundInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideBackgroundRequest request = createGetSlidesSlideBackgroundRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlidesSlideBackground", "slideIndex", request.getSlideIndex());
            SlideBackgroundResponse response = api.getSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesSlideBackground");
        }
    }
    /**
     * Read background info for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideBackgroundInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideBackgroundRequest request = createGetSlidesSlideBackgroundRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesSlideBackground", "password", request.getPassword());
            SlideBackgroundResponse response = api.getSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesSlideBackground");
        }
    }
    /**
     * Read background info for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideBackgroundInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideBackgroundRequest request = createGetSlidesSlideBackgroundRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesSlideBackground", "folder", request.getFolder());
            SlideBackgroundResponse response = api.getSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesSlideBackground");
        }
    }
    /**
     * Read background info for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideBackgroundInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideBackgroundRequest request = createGetSlidesSlideBackgroundRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesSlideBackground", "storage", request.getStorage());
            SlideBackgroundResponse response = api.getSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesSlideBackground");
        }
    }

    private GetSlidesSlideBackgroundRequest createGetSlidesSlideBackgroundRequest() {
        GetSlidesSlideBackgroundRequest request = new GetSlidesSlideBackgroundRequest();
        request.setName((String)getTestValue("getSlidesSlideBackground", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlidesSlideBackground", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("getSlidesSlideBackground", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesSlideBackground", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesSlideBackground", "storage", "String"));
        return request;
    }
    
    /**
     * Read presentation slide comments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideCommentsTest() throws ApiException, Exception {
        initialize("getSlidesSlideComments", null, null);
        Boolean needAssertResponse = false;
        SlideCommentsResponse response = null;;
        try {
            GetSlidesSlideCommentsRequest request = createGetSlidesSlideCommentsRequest();
            response = api.getSlidesSlideComments(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesSlideComments");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read presentation slide comments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideCommentsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideCommentsRequest request = createGetSlidesSlideCommentsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesSlideComments", "name", request.getName());
            SlideCommentsResponse response = api.getSlidesSlideComments(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesSlideComments");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesSlideComments");
        }
    }
    /**
     * Read presentation slide comments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideCommentsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideCommentsRequest request = createGetSlidesSlideCommentsRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlidesSlideComments", "slideIndex", request.getSlideIndex());
            SlideCommentsResponse response = api.getSlidesSlideComments(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesSlideComments");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesSlideComments");
        }
    }
    /**
     * Read presentation slide comments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideCommentsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideCommentsRequest request = createGetSlidesSlideCommentsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesSlideComments", "password", request.getPassword());
            SlideCommentsResponse response = api.getSlidesSlideComments(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesSlideComments");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesSlideComments");
        }
    }
    /**
     * Read presentation slide comments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideCommentsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideCommentsRequest request = createGetSlidesSlideCommentsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesSlideComments", "folder", request.getFolder());
            SlideCommentsResponse response = api.getSlidesSlideComments(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesSlideComments");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesSlideComments");
        }
    }
    /**
     * Read presentation slide comments.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideCommentsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideCommentsRequest request = createGetSlidesSlideCommentsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesSlideComments", "storage", request.getStorage());
            SlideCommentsResponse response = api.getSlidesSlideComments(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesSlideComments");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesSlideComments");
        }
    }

    private GetSlidesSlideCommentsRequest createGetSlidesSlideCommentsRequest() {
        GetSlidesSlideCommentsRequest request = new GetSlidesSlideCommentsRequest();
        request.setName((String)getTestValue("getSlidesSlideComments", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlidesSlideComments", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("getSlidesSlideComments", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesSlideComments", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesSlideComments", "storage", "String"));
        return request;
    }
    
    /**
     * Read presentation slides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlidesListTest() throws ApiException, Exception {
        initialize("getSlidesSlidesList", null, null);
        Boolean needAssertResponse = false;
        SlideListResponse response = null;;
        try {
            GetSlidesSlidesListRequest request = createGetSlidesSlidesListRequest();
            response = api.getSlidesSlidesList(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesSlidesList");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read presentation slides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlidesListInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlidesListRequest request = createGetSlidesSlidesListRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesSlidesList", "name", request.getName());
            SlideListResponse response = api.getSlidesSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesSlidesList");
        }
    }
    /**
     * Read presentation slides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlidesListInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlidesListRequest request = createGetSlidesSlidesListRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesSlidesList", "password", request.getPassword());
            SlideListResponse response = api.getSlidesSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesSlidesList");
        }
    }
    /**
     * Read presentation slides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlidesListInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlidesListRequest request = createGetSlidesSlidesListRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesSlidesList", "folder", request.getFolder());
            SlideListResponse response = api.getSlidesSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesSlidesList");
        }
    }
    /**
     * Read presentation slides info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlidesListInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlidesListRequest request = createGetSlidesSlidesListRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesSlidesList", "storage", request.getStorage());
            SlideListResponse response = api.getSlidesSlidesList(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesSlidesList");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesSlidesList");
        }
    }

    private GetSlidesSlidesListRequest createGetSlidesSlidesListRequest() {
        GetSlidesSlidesListRequest request = new GetSlidesSlidesListRequest();
        request.setName((String)getTestValue("getSlidesSlidesList", "name", "String"));
        request.setPassword((String)getTestValue("getSlidesSlidesList", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesSlidesList", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesSlidesList", "storage", "String"));
        return request;
    }
    
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsTest() throws ApiException, Exception {
        initialize("postSlideSaveAs", null, null);
        Boolean needAssertResponse = false;
        File response = null;;
        try {
            PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
            response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postSlideSaveAs");
        }
        if (needAssertResponse) {
            assertTrue(response.isFile());
        }
    }

    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postSlideSaveAs", "name", request.getName());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlideSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlideSaveAs");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("postSlideSaveAs", "slideIndex", request.getSlideIndex());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postSlideSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postSlideSaveAs");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
            request.setFormat((SlideExportFormat)invalidizeTestValue(request.getFormat(), "format", "SlideExportFormat"));
            initialize("postSlideSaveAs", "format", request.getFormat());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "postSlideSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("format", "postSlideSaveAs");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
            request.setOptions((ExportOptions)invalidizeTestValue(request.getOptions(), "options", "ExportOptions"));
            initialize("postSlideSaveAs", "options", request.getOptions());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "postSlideSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("options", "postSlideSaveAs");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidWidthTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
            request.setWidth((Integer)invalidizeTestValue(request.getWidth(), "width", "Integer"));
            initialize("postSlideSaveAs", "width", request.getWidth());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "width", "postSlideSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("width", "postSlideSaveAs");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidHeightTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
            request.setHeight((Integer)invalidizeTestValue(request.getHeight(), "height", "Integer"));
            initialize("postSlideSaveAs", "height", request.getHeight());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "height", "postSlideSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("height", "postSlideSaveAs");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postSlideSaveAs", "password", request.getPassword());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlideSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlideSaveAs");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postSlideSaveAs", "folder", request.getFolder());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlideSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlideSaveAs");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postSlideSaveAs", "storage", request.getStorage());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlideSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlideSaveAs");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
            request.setOutPath((String)invalidizeTestValue(request.getOutPath(), "outPath", "String"));
            initialize("postSlideSaveAs", "outPath", request.getOutPath());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "postSlideSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("outPath", "postSlideSaveAs");
        }
    }
    /**
     * Convert a slide to some format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlideSaveAsInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlideSaveAsRequest request = createPostSlideSaveAsRequest();
            request.setFontsFolder((String)invalidizeTestValue(request.getFontsFolder(), "fontsFolder", "String"));
            initialize("postSlideSaveAs", "fontsFolder", request.getFontsFolder());
            File response = api.postSlideSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "postSlideSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "postSlideSaveAs");
        }
    }

    private PostSlideSaveAsRequest createPostSlideSaveAsRequest() {
        PostSlideSaveAsRequest request = new PostSlideSaveAsRequest();
        request.setName((String)getTestValue("postSlideSaveAs", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("postSlideSaveAs", "slideIndex", "Integer"));
        request.setFormat((SlideExportFormat)getTestValue("postSlideSaveAs", "format", "SlideExportFormat"));
        request.setOptions((ExportOptions)getTestValue("postSlideSaveAs", "options", "ExportOptions"));
        request.setWidth((Integer)getTestValue("postSlideSaveAs", "width", "Integer"));
        request.setHeight((Integer)getTestValue("postSlideSaveAs", "height", "Integer"));
        request.setPassword((String)getTestValue("postSlideSaveAs", "password", "String"));
        request.setFolder((String)getTestValue("postSlideSaveAs", "folder", "String"));
        request.setStorage((String)getTestValue("postSlideSaveAs", "storage", "String"));
        request.setOutPath((String)getTestValue("postSlideSaveAs", "outPath", "String"));
        request.setFontsFolder((String)getTestValue("postSlideSaveAs", "fontsFolder", "String"));
        return request;
    }
    
    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddTest() throws ApiException, Exception {
        initialize("postSlidesAdd", null, null);
        Boolean needAssertResponse = false;
        SlideListResponse response = null;;
        try {
            PostSlidesAddRequest request = createPostSlidesAddRequest();
            response = api.postSlidesAdd(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postSlidesAdd");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesAddRequest request = createPostSlidesAddRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postSlidesAdd", "name", request.getName());
            SlideListResponse response = api.postSlidesAdd(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesAdd");
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesAdd");
        }
    }
    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesAddRequest request = createPostSlidesAddRequest();
            request.setPosition((Integer)invalidizeTestValue(request.getPosition(), "position", "Integer"));
            initialize("postSlidesAdd", "position", request.getPosition());
            SlideListResponse response = api.postSlidesAdd(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postSlidesAdd");
        }
        if (needAssertResponse) {
            assertResponse("position", "postSlidesAdd");
        }
    }
    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesAddRequest request = createPostSlidesAddRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postSlidesAdd", "password", request.getPassword());
            SlideListResponse response = api.postSlidesAdd(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesAdd");
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesAdd");
        }
    }
    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesAddRequest request = createPostSlidesAddRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postSlidesAdd", "folder", request.getFolder());
            SlideListResponse response = api.postSlidesAdd(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesAdd");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesAdd");
        }
    }
    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesAddRequest request = createPostSlidesAddRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postSlidesAdd", "storage", request.getStorage());
            SlideListResponse response = api.postSlidesAdd(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesAdd");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesAdd");
        }
    }
    /**
     * Create a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesAddInvalidLayoutAliasTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesAddRequest request = createPostSlidesAddRequest();
            request.setLayoutAlias((String)invalidizeTestValue(request.getLayoutAlias(), "layoutAlias", "String"));
            initialize("postSlidesAdd", "layoutAlias", request.getLayoutAlias());
            SlideListResponse response = api.postSlidesAdd(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "layoutAlias", "postSlidesAdd");
        }
        if (needAssertResponse) {
            assertResponse("layoutAlias", "postSlidesAdd");
        }
    }

    private PostSlidesAddRequest createPostSlidesAddRequest() {
        PostSlidesAddRequest request = new PostSlidesAddRequest();
        request.setName((String)getTestValue("postSlidesAdd", "name", "String"));
        request.setPosition((Integer)getTestValue("postSlidesAdd", "position", "Integer"));
        request.setPassword((String)getTestValue("postSlidesAdd", "password", "String"));
        request.setFolder((String)getTestValue("postSlidesAdd", "folder", "String"));
        request.setStorage((String)getTestValue("postSlidesAdd", "storage", "String"));
        request.setLayoutAlias((String)getTestValue("postSlidesAdd", "layoutAlias", "String"));
        return request;
    }
    
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyTest() throws ApiException, Exception {
        initialize("postSlidesCopy", null, null);
        Boolean needAssertResponse = false;
        SlideListResponse response = null;;
        try {
            PostSlidesCopyRequest request = createPostSlidesCopyRequest();
            response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postSlidesCopy");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesCopyRequest request = createPostSlidesCopyRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postSlidesCopy", "name", request.getName());
            SlideListResponse response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesCopy");
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidSlideToCopyTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesCopyRequest request = createPostSlidesCopyRequest();
            request.setSlideToCopy((Integer)invalidizeTestValue(request.getSlideToCopy(), "slideToCopy", "Integer"));
            initialize("postSlidesCopy", "slideToCopy", request.getSlideToCopy());
            SlideListResponse response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideToCopy", "postSlidesCopy");
        }
        if (needAssertResponse) {
            assertResponse("slideToCopy", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesCopyRequest request = createPostSlidesCopyRequest();
            request.setPosition((Integer)invalidizeTestValue(request.getPosition(), "position", "Integer"));
            initialize("postSlidesCopy", "position", request.getPosition());
            SlideListResponse response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postSlidesCopy");
        }
        if (needAssertResponse) {
            assertResponse("position", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidSourceTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesCopyRequest request = createPostSlidesCopyRequest();
            request.setSource((String)invalidizeTestValue(request.getSource(), "source", "String"));
            initialize("postSlidesCopy", "source", request.getSource());
            SlideListResponse response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "source", "postSlidesCopy");
        }
        if (needAssertResponse) {
            assertResponse("source", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidSourcePasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesCopyRequest request = createPostSlidesCopyRequest();
            request.setSourcePassword((String)invalidizeTestValue(request.getSourcePassword(), "sourcePassword", "String"));
            initialize("postSlidesCopy", "sourcePassword", request.getSourcePassword());
            SlideListResponse response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "sourcePassword", "postSlidesCopy");
        }
        if (needAssertResponse) {
            assertResponse("sourcePassword", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesCopyRequest request = createPostSlidesCopyRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postSlidesCopy", "password", request.getPassword());
            SlideListResponse response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesCopy");
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesCopyRequest request = createPostSlidesCopyRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postSlidesCopy", "folder", request.getFolder());
            SlideListResponse response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesCopy");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesCopy");
        }
    }
    /**
     * Copy a slide from the current or another presentation.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesCopyInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesCopyRequest request = createPostSlidesCopyRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postSlidesCopy", "storage", request.getStorage());
            SlideListResponse response = api.postSlidesCopy(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesCopy");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesCopy");
        }
    }

    private PostSlidesCopyRequest createPostSlidesCopyRequest() {
        PostSlidesCopyRequest request = new PostSlidesCopyRequest();
        request.setName((String)getTestValue("postSlidesCopy", "name", "String"));
        request.setSlideToCopy((Integer)getTestValue("postSlidesCopy", "slideToCopy", "Integer"));
        request.setPosition((Integer)getTestValue("postSlidesCopy", "position", "Integer"));
        request.setSource((String)getTestValue("postSlidesCopy", "source", "String"));
        request.setSourcePassword((String)getTestValue("postSlidesCopy", "sourcePassword", "String"));
        request.setPassword((String)getTestValue("postSlidesCopy", "password", "String"));
        request.setFolder((String)getTestValue("postSlidesCopy", "folder", "String"));
        request.setStorage((String)getTestValue("postSlidesCopy", "storage", "String"));
        return request;
    }
    
    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderTest() throws ApiException, Exception {
        initialize("postSlidesReorder", null, null);
        Boolean needAssertResponse = false;
        SlideListResponse response = null;;
        try {
            PostSlidesReorderRequest request = createPostSlidesReorderRequest();
            response = api.postSlidesReorder(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postSlidesReorder");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderRequest request = createPostSlidesReorderRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postSlidesReorder", "name", request.getName());
            SlideListResponse response = api.postSlidesReorder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesReorder");
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesReorder");
        }
    }
    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderRequest request = createPostSlidesReorderRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("postSlidesReorder", "slideIndex", request.getSlideIndex());
            SlideListResponse response = api.postSlidesReorder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postSlidesReorder");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postSlidesReorder");
        }
    }
    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderInvalidNewPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderRequest request = createPostSlidesReorderRequest();
            request.setNewPosition((Integer)invalidizeTestValue(request.getNewPosition(), "newPosition", "Integer"));
            initialize("postSlidesReorder", "newPosition", request.getNewPosition());
            SlideListResponse response = api.postSlidesReorder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "newPosition", "postSlidesReorder");
        }
        if (needAssertResponse) {
            assertResponse("newPosition", "postSlidesReorder");
        }
    }
    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderRequest request = createPostSlidesReorderRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postSlidesReorder", "password", request.getPassword());
            SlideListResponse response = api.postSlidesReorder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesReorder");
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesReorder");
        }
    }
    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderRequest request = createPostSlidesReorderRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postSlidesReorder", "folder", request.getFolder());
            SlideListResponse response = api.postSlidesReorder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesReorder");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesReorder");
        }
    }
    /**
     * Reorder presentation slide position.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderRequest request = createPostSlidesReorderRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postSlidesReorder", "storage", request.getStorage());
            SlideListResponse response = api.postSlidesReorder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesReorder");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesReorder");
        }
    }

    private PostSlidesReorderRequest createPostSlidesReorderRequest() {
        PostSlidesReorderRequest request = new PostSlidesReorderRequest();
        request.setName((String)getTestValue("postSlidesReorder", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("postSlidesReorder", "slideIndex", "Integer"));
        request.setNewPosition((Integer)getTestValue("postSlidesReorder", "newPosition", "Integer"));
        request.setPassword((String)getTestValue("postSlidesReorder", "password", "String"));
        request.setFolder((String)getTestValue("postSlidesReorder", "folder", "String"));
        request.setStorage((String)getTestValue("postSlidesReorder", "storage", "String"));
        return request;
    }
    
    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyTest() throws ApiException, Exception {
        initialize("postSlidesReorderMany", null, null);
        Boolean needAssertResponse = false;
        SlideListResponse response = null;;
        try {
            PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
            response = api.postSlidesReorderMany(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postSlidesReorderMany");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postSlidesReorderMany", "name", request.getName());
            SlideListResponse response = api.postSlidesReorderMany(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesReorderMany");
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesReorderMany");
        }
    }
    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyInvalidOldPositionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
            request.setOldPositions((List<Integer>)invalidizeTestValue(request.getOldPositions(), "oldPositions", "List<Integer>"));
            initialize("postSlidesReorderMany", "oldPositions", request.getOldPositions());
            SlideListResponse response = api.postSlidesReorderMany(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "oldPositions", "postSlidesReorderMany");
        }
        if (needAssertResponse) {
            assertResponse("oldPositions", "postSlidesReorderMany");
        }
    }
    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyInvalidNewPositionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
            request.setNewPositions((List<Integer>)invalidizeTestValue(request.getNewPositions(), "newPositions", "List<Integer>"));
            initialize("postSlidesReorderMany", "newPositions", request.getNewPositions());
            SlideListResponse response = api.postSlidesReorderMany(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "newPositions", "postSlidesReorderMany");
        }
        if (needAssertResponse) {
            assertResponse("newPositions", "postSlidesReorderMany");
        }
    }
    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postSlidesReorderMany", "password", request.getPassword());
            SlideListResponse response = api.postSlidesReorderMany(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesReorderMany");
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesReorderMany");
        }
    }
    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postSlidesReorderMany", "folder", request.getFolder());
            SlideListResponse response = api.postSlidesReorderMany(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesReorderMany");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesReorderMany");
        }
    }
    /**
     * Reorder presentation slides positions.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderManyInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderManyRequest request = createPostSlidesReorderManyRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postSlidesReorderMany", "storage", request.getStorage());
            SlideListResponse response = api.postSlidesReorderMany(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesReorderMany");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesReorderMany");
        }
    }

    private PostSlidesReorderManyRequest createPostSlidesReorderManyRequest() {
        PostSlidesReorderManyRequest request = new PostSlidesReorderManyRequest();
        request.setName((String)getTestValue("postSlidesReorderMany", "name", "String"));
        request.setOldPositions((List<Integer>)getTestValue("postSlidesReorderMany", "oldPositions", "List<Integer>"));
        request.setNewPositions((List<Integer>)getTestValue("postSlidesReorderMany", "newPositions", "List<Integer>"));
        request.setPassword((String)getTestValue("postSlidesReorderMany", "password", "String"));
        request.setFolder((String)getTestValue("postSlidesReorderMany", "folder", "String"));
        request.setStorage((String)getTestValue("postSlidesReorderMany", "storage", "String"));
        return request;
    }
    
    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionTest() throws ApiException, Exception {
        initialize("postSlidesReorderPosition", null, null);
        Boolean needAssertResponse = false;
        SlideListResponse response = null;;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postSlidesReorderPosition", "name", request.getName());
            SlideListResponse response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesReorderPosition");
        }
    }
    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionInvalidOldPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            request.setOldPosition((Integer)invalidizeTestValue(request.getOldPosition(), "oldPosition", "Integer"));
            initialize("postSlidesReorderPosition", "oldPosition", request.getOldPosition());
            SlideListResponse response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "oldPosition", "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertResponse("oldPosition", "postSlidesReorderPosition");
        }
    }
    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionInvalidNewPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            request.setNewPosition((Integer)invalidizeTestValue(request.getNewPosition(), "newPosition", "Integer"));
            initialize("postSlidesReorderPosition", "newPosition", request.getNewPosition());
            SlideListResponse response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "newPosition", "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertResponse("newPosition", "postSlidesReorderPosition");
        }
    }
    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionInvalidOldPositionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            request.setOldPositions((List<Integer>)invalidizeTestValue(request.getOldPositions(), "oldPositions", "List<Integer>"));
            initialize("postSlidesReorderPosition", "oldPositions", request.getOldPositions());
            SlideListResponse response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "oldPositions", "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertResponse("oldPositions", "postSlidesReorderPosition");
        }
    }
    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionInvalidNewPositionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            request.setNewPositions((List<Integer>)invalidizeTestValue(request.getNewPositions(), "newPositions", "List<Integer>"));
            initialize("postSlidesReorderPosition", "newPositions", request.getNewPositions());
            SlideListResponse response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "newPositions", "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertResponse("newPositions", "postSlidesReorderPosition");
        }
    }
    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionInvalidSlideToCopyTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            request.setSlideToCopy((Integer)invalidizeTestValue(request.getSlideToCopy(), "slideToCopy", "Integer"));
            initialize("postSlidesReorderPosition", "slideToCopy", request.getSlideToCopy());
            SlideListResponse response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideToCopy", "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertResponse("slideToCopy", "postSlidesReorderPosition");
        }
    }
    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            request.setPosition((Integer)invalidizeTestValue(request.getPosition(), "position", "Integer"));
            initialize("postSlidesReorderPosition", "position", request.getPosition());
            SlideListResponse response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertResponse("position", "postSlidesReorderPosition");
        }
    }
    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionInvalidSlideToCloneTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            request.setSlideToClone((Integer)invalidizeTestValue(request.getSlideToClone(), "slideToClone", "Integer"));
            initialize("postSlidesReorderPosition", "slideToClone", request.getSlideToClone());
            SlideListResponse response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideToClone", "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertResponse("slideToClone", "postSlidesReorderPosition");
        }
    }
    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionInvalidSourceTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            request.setSource((String)invalidizeTestValue(request.getSource(), "source", "String"));
            initialize("postSlidesReorderPosition", "source", request.getSource());
            SlideListResponse response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "source", "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertResponse("source", "postSlidesReorderPosition");
        }
    }
    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postSlidesReorderPosition", "password", request.getPassword());
            SlideListResponse response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesReorderPosition");
        }
    }
    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postSlidesReorderPosition", "folder", request.getFolder());
            SlideListResponse response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesReorderPosition");
        }
    }
    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postSlidesReorderPosition", "storage", request.getStorage());
            SlideListResponse response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesReorderPosition");
        }
    }
    /**
     * Create, copy or reorder presentation slides.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesReorderPositionInvalidLayoutAliasTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesReorderPositionRequest request = createPostSlidesReorderPositionRequest();
            request.setLayoutAlias((String)invalidizeTestValue(request.getLayoutAlias(), "layoutAlias", "String"));
            initialize("postSlidesReorderPosition", "layoutAlias", request.getLayoutAlias());
            SlideListResponse response = api.postSlidesReorderPosition(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "layoutAlias", "postSlidesReorderPosition");
        }
        if (needAssertResponse) {
            assertResponse("layoutAlias", "postSlidesReorderPosition");
        }
    }

    private PostSlidesReorderPositionRequest createPostSlidesReorderPositionRequest() {
        PostSlidesReorderPositionRequest request = new PostSlidesReorderPositionRequest();
        request.setName((String)getTestValue("postSlidesReorderPosition", "name", "String"));
        request.setOldPosition((Integer)getTestValue("postSlidesReorderPosition", "oldPosition", "Integer"));
        request.setNewPosition((Integer)getTestValue("postSlidesReorderPosition", "newPosition", "Integer"));
        request.setOldPositions((List<Integer>)getTestValue("postSlidesReorderPosition", "oldPositions", "List<Integer>"));
        request.setNewPositions((List<Integer>)getTestValue("postSlidesReorderPosition", "newPositions", "List<Integer>"));
        request.setSlideToCopy((Integer)getTestValue("postSlidesReorderPosition", "slideToCopy", "Integer"));
        request.setPosition((Integer)getTestValue("postSlidesReorderPosition", "position", "Integer"));
        request.setSlideToClone((Integer)getTestValue("postSlidesReorderPosition", "slideToClone", "Integer"));
        request.setSource((String)getTestValue("postSlidesReorderPosition", "source", "String"));
        request.setPassword((String)getTestValue("postSlidesReorderPosition", "password", "String"));
        request.setFolder((String)getTestValue("postSlidesReorderPosition", "folder", "String"));
        request.setStorage((String)getTestValue("postSlidesReorderPosition", "storage", "String"));
        request.setLayoutAlias((String)getTestValue("postSlidesReorderPosition", "layoutAlias", "String"));
        return request;
    }
    
    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideTest() throws ApiException, Exception {
        initialize("putSlidesSlide", null, null);
        Boolean needAssertResponse = false;
        SlideResponse response = null;;
        try {
            PutSlidesSlideRequest request = createPutSlidesSlideRequest();
            response = api.putSlidesSlide(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putSlidesSlide");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideRequest request = createPutSlidesSlideRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putSlidesSlide", "name", request.getName());
            SlideResponse response = api.putSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlidesSlide");
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlidesSlide");
        }
    }
    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideRequest request = createPutSlidesSlideRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("putSlidesSlide", "slideIndex", request.getSlideIndex());
            SlideResponse response = api.putSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSlidesSlide");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSlidesSlide");
        }
    }
    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideInvalidSlideDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideRequest request = createPutSlidesSlideRequest();
            request.setSlideDto((Slide)invalidizeTestValue(request.getSlideDto(), "slideDto", "Slide"));
            initialize("putSlidesSlide", "slideDto", request.getSlideDto());
            SlideResponse response = api.putSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideDto", "putSlidesSlide");
        }
        if (needAssertResponse) {
            assertResponse("slideDto", "putSlidesSlide");
        }
    }
    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideRequest request = createPutSlidesSlideRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putSlidesSlide", "password", request.getPassword());
            SlideResponse response = api.putSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesSlide");
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesSlide");
        }
    }
    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideRequest request = createPutSlidesSlideRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putSlidesSlide", "folder", request.getFolder());
            SlideResponse response = api.putSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlidesSlide");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlidesSlide");
        }
    }
    /**
     * Update a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideRequest request = createPutSlidesSlideRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putSlidesSlide", "storage", request.getStorage());
            SlideResponse response = api.putSlidesSlide(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlidesSlide");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlidesSlide");
        }
    }

    private PutSlidesSlideRequest createPutSlidesSlideRequest() {
        PutSlidesSlideRequest request = new PutSlidesSlideRequest();
        request.setName((String)getTestValue("putSlidesSlide", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("putSlidesSlide", "slideIndex", "Integer"));
        request.setSlideDto((Slide)getTestValue("putSlidesSlide", "slideDto", "Slide"));
        request.setPassword((String)getTestValue("putSlidesSlide", "password", "String"));
        request.setFolder((String)getTestValue("putSlidesSlide", "folder", "String"));
        request.setStorage((String)getTestValue("putSlidesSlide", "storage", "String"));
        return request;
    }
    
    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundTest() throws ApiException, Exception {
        initialize("putSlidesSlideBackground", null, null);
        Boolean needAssertResponse = false;
        SlideBackgroundResponse response = null;;
        try {
            PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
            response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putSlidesSlideBackground", "name", request.getName());
            SlideBackgroundResponse response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlidesSlideBackground");
        }
    }
    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("putSlidesSlideBackground", "slideIndex", request.getSlideIndex());
            SlideBackgroundResponse response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSlidesSlideBackground");
        }
    }
    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundInvalidBackgroundTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
            request.setBackground((SlideBackground)invalidizeTestValue(request.getBackground(), "background", "SlideBackground"));
            initialize("putSlidesSlideBackground", "background", request.getBackground());
            SlideBackgroundResponse response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "background", "putSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("background", "putSlidesSlideBackground");
        }
    }
    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putSlidesSlideBackground", "folder", request.getFolder());
            SlideBackgroundResponse response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlidesSlideBackground");
        }
    }
    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putSlidesSlideBackground", "password", request.getPassword());
            SlideBackgroundResponse response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesSlideBackground");
        }
    }
    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putSlidesSlideBackground", "storage", request.getStorage());
            SlideBackgroundResponse response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlidesSlideBackground");
        }
    }
    /**
     * Set background for a slide.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSlideBackgroundInvalidColorTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSlideBackgroundRequest request = createPutSlidesSlideBackgroundRequest();
            request.setColor((String)invalidizeTestValue(request.getColor(), "color", "String"));
            initialize("putSlidesSlideBackground", "color", request.getColor());
            SlideBackgroundResponse response = api.putSlidesSlideBackground(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "color", "putSlidesSlideBackground");
        }
        if (needAssertResponse) {
            assertResponse("color", "putSlidesSlideBackground");
        }
    }

    private PutSlidesSlideBackgroundRequest createPutSlidesSlideBackgroundRequest() {
        PutSlidesSlideBackgroundRequest request = new PutSlidesSlideBackgroundRequest();
        request.setName((String)getTestValue("putSlidesSlideBackground", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("putSlidesSlideBackground", "slideIndex", "Integer"));
        request.setBackground((SlideBackground)getTestValue("putSlidesSlideBackground", "background", "SlideBackground"));
        request.setFolder((String)getTestValue("putSlidesSlideBackground", "folder", "String"));
        request.setPassword((String)getTestValue("putSlidesSlideBackground", "password", "String"));
        request.setStorage((String)getTestValue("putSlidesSlideBackground", "storage", "String"));
        request.setColor((String)getTestValue("putSlidesSlideBackground", "color", "String"));
        return request;
    }
    
}
