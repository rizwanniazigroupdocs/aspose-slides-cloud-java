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

import java.io.File;
import com.aspose.slides.model.ImagesResponse;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slides.model.request.GetSlidesImageWithFormatRequest;
import com.aspose.slides.model.request.GetSlidesImagesRequest;
import com.aspose.slides.model.request.GetSlidesSlideImagesRequest;

/**
 * API tests for ImagesApi
 */
public class ImagesApiTest extends ApiTest {

    private final ImagesApi api = new ImagesApi(getConfiguration());

    
    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatTest() throws ApiException, Exception {
        initialize("getSlidesImageWithFormat", null, null);
        Boolean needAssertResponse = false;
        File response = null;;
        try {
            GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
            response = api.getSlidesImageWithFormat(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesImageWithFormat");
        }
        if (needAssertResponse) {
            assertTrue(response.isFile());
        }
    }

    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesImageWithFormat", "name", request.getName());
            File response = api.getSlidesImageWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesImageWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesImageWithFormat");
        }
    }
    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatInvalidIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
            request.setIndex((Integer)invalidizeTestValue(request.getIndex(), "index", "Integer"));
            initialize("getSlidesImageWithFormat", "index", request.getIndex());
            File response = api.getSlidesImageWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "index", "getSlidesImageWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("index", "getSlidesImageWithFormat");
        }
    }
    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
            request.setFormat((ImageExportFormat)invalidizeTestValue(request.getFormat(), "format", "ImageExportFormat"));
            initialize("getSlidesImageWithFormat", "format", request.getFormat());
            File response = api.getSlidesImageWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "getSlidesImageWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("format", "getSlidesImageWithFormat");
        }
    }
    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesImageWithFormat", "password", request.getPassword());
            File response = api.getSlidesImageWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesImageWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesImageWithFormat");
        }
    }
    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesImageWithFormat", "folder", request.getFolder());
            File response = api.getSlidesImageWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesImageWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesImageWithFormat");
        }
    }
    /**
     * Get image in specified format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImageWithFormatInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesImageWithFormatRequest request = createGetSlidesImageWithFormatRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesImageWithFormat", "storage", request.getStorage());
            File response = api.getSlidesImageWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesImageWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesImageWithFormat");
        }
    }

    private GetSlidesImageWithFormatRequest createGetSlidesImageWithFormatRequest() {
        GetSlidesImageWithFormatRequest request = new GetSlidesImageWithFormatRequest();
        request.setName((String)getTestValue("getSlidesImageWithFormat", "name", "String"));
        request.setIndex((Integer)getTestValue("getSlidesImageWithFormat", "index", "Integer"));
        request.setFormat((ImageExportFormat)getTestValue("getSlidesImageWithFormat", "format", "ImageExportFormat"));
        request.setPassword((String)getTestValue("getSlidesImageWithFormat", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesImageWithFormat", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesImageWithFormat", "storage", "String"));
        return request;
    }
    
    /**
     * Read presentation images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImagesTest() throws ApiException, Exception {
        initialize("getSlidesImages", null, null);
        Boolean needAssertResponse = false;
        ImagesResponse response = null;;
        try {
            GetSlidesImagesRequest request = createGetSlidesImagesRequest();
            response = api.getSlidesImages(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesImages");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read presentation images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImagesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesImagesRequest request = createGetSlidesImagesRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesImages", "name", request.getName());
            ImagesResponse response = api.getSlidesImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesImages");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesImages");
        }
    }
    /**
     * Read presentation images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImagesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesImagesRequest request = createGetSlidesImagesRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesImages", "password", request.getPassword());
            ImagesResponse response = api.getSlidesImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesImages");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesImages");
        }
    }
    /**
     * Read presentation images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImagesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesImagesRequest request = createGetSlidesImagesRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesImages", "folder", request.getFolder());
            ImagesResponse response = api.getSlidesImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesImages");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesImages");
        }
    }
    /**
     * Read presentation images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesImagesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesImagesRequest request = createGetSlidesImagesRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesImages", "storage", request.getStorage());
            ImagesResponse response = api.getSlidesImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesImages");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesImages");
        }
    }

    private GetSlidesImagesRequest createGetSlidesImagesRequest() {
        GetSlidesImagesRequest request = new GetSlidesImagesRequest();
        request.setName((String)getTestValue("getSlidesImages", "name", "String"));
        request.setPassword((String)getTestValue("getSlidesImages", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesImages", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesImages", "storage", "String"));
        return request;
    }
    
    /**
     * Read slide images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideImagesTest() throws ApiException, Exception {
        initialize("getSlidesSlideImages", null, null);
        Boolean needAssertResponse = false;
        ImagesResponse response = null;;
        try {
            GetSlidesSlideImagesRequest request = createGetSlidesSlideImagesRequest();
            response = api.getSlidesSlideImages(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesSlideImages");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read slide images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideImagesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideImagesRequest request = createGetSlidesSlideImagesRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesSlideImages", "name", request.getName());
            ImagesResponse response = api.getSlidesSlideImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesSlideImages");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesSlideImages");
        }
    }
    /**
     * Read slide images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideImagesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideImagesRequest request = createGetSlidesSlideImagesRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlidesSlideImages", "slideIndex", request.getSlideIndex());
            ImagesResponse response = api.getSlidesSlideImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesSlideImages");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesSlideImages");
        }
    }
    /**
     * Read slide images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideImagesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideImagesRequest request = createGetSlidesSlideImagesRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesSlideImages", "password", request.getPassword());
            ImagesResponse response = api.getSlidesSlideImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesSlideImages");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesSlideImages");
        }
    }
    /**
     * Read slide images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideImagesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideImagesRequest request = createGetSlidesSlideImagesRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesSlideImages", "folder", request.getFolder());
            ImagesResponse response = api.getSlidesSlideImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesSlideImages");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesSlideImages");
        }
    }
    /**
     * Read slide images info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesSlideImagesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesSlideImagesRequest request = createGetSlidesSlideImagesRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesSlideImages", "storage", request.getStorage());
            ImagesResponse response = api.getSlidesSlideImages(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesSlideImages");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesSlideImages");
        }
    }

    private GetSlidesSlideImagesRequest createGetSlidesSlideImagesRequest() {
        GetSlidesSlideImagesRequest request = new GetSlidesSlideImagesRequest();
        request.setName((String)getTestValue("getSlidesSlideImages", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlidesSlideImages", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("getSlidesSlideImages", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesSlideImages", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesSlideImages", "storage", "String"));
        return request;
    }
    
}
