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

import com.aspose.slidescloudsdk.model.ExportOptions;
import java.io.File;
import com.aspose.slidescloudsdk.model.Slide;
import com.aspose.slidescloudsdk.model.SlideBackground;
import com.aspose.slidescloudsdk.model.SlideBackgroundResponse;
import com.aspose.slidescloudsdk.model.SlideCommentsResponse;
import com.aspose.slidescloudsdk.model.SlideListResponse;
import com.aspose.slidescloudsdk.model.SlideResponse;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slidescloudsdk.model.request.DeleteSlideByIndexRequest;
import com.aspose.slidescloudsdk.model.request.DeleteSlidesCleanSlidesListRequest;
import com.aspose.slidescloudsdk.model.request.DeleteSlidesSlideBackgroundRequest;
import com.aspose.slidescloudsdk.model.request.GetSlideWithFormatRequest;
import com.aspose.slidescloudsdk.model.request.GetSlidesSlideRequest;
import com.aspose.slidescloudsdk.model.request.GetSlidesSlideBackgroundRequest;
import com.aspose.slidescloudsdk.model.request.GetSlidesSlideCommentsRequest;
import com.aspose.slidescloudsdk.model.request.GetSlidesSlidesListRequest;
import com.aspose.slidescloudsdk.model.request.PostSlideSaveAsRequest;
import com.aspose.slidescloudsdk.model.request.PostSlidesReorderPositionRequest;
import com.aspose.slidescloudsdk.model.request.PutSlidesSlideRequest;
import com.aspose.slidescloudsdk.model.request.PutSlidesSlideBackgroundRequest;

/**
 * API tests for SlidesApi
 */
public class SlidesApiTest extends ApiTest {

    private final SlidesApi api = new SlidesApi(getConfiguration());

    
    /**
     * Delete presentation slide by its index.
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
     * Delete presentation slide by its index.
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
     * Delete presentation slide by its index.
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
     * Delete presentation slide by its index.
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
     * Delete presentation slide by its index.
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
     * Delete presentation slide by its index.
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
     * Remove presentation slide background color.
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
     * Remove presentation slide background color.
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
     * Remove presentation slide background color.
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
     * Remove presentation slide background color.
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
     * Remove presentation slide background color.
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
     * Remove presentation slide background color.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Read slide info.
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
     * Read slide info.
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
     * Read slide info.
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
     * Read slide info.
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
     * Read slide info.
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
     * Read slide info.
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
     * Read presentation slide background color type.
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
     * Read presentation slide background color type.
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
     * Read presentation slide background color type.
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
     * Read presentation slide background color type.
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
     * Read presentation slide background color type.
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
     * Read presentation slide background color type.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Convert slide to some format.
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
     * Reorder presentation slide position
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
     * Reorder presentation slide position
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
     * Reorder presentation slide position
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
     * Reorder presentation slide position
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
     * Reorder presentation slide position
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
     * Reorder presentation slide position
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
     * Reorder presentation slide position
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
     * Reorder presentation slide position
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
     * Reorder presentation slide position
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
     * Reorder presentation slide position
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
     * Reorder presentation slide position
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
     * Reorder presentation slide position
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
     * Update slide properties.
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
     * Update slide properties.
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
     * Update slide properties.
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
     * Update slide properties.
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
     * Update slide properties.
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
     * Update slide properties.
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
     * Update slide properties.
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
     * Set presentation slide background color.
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
     * Set presentation slide background color.
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
     * Set presentation slide background color.
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
     * Set presentation slide background color.
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
     * Set presentation slide background color.
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
     * Set presentation slide background color.
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
     * Set presentation slide background color.
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
     * Set presentation slide background color.
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
