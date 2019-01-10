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

import com.aspose.slides.model.PlaceholderResponse;
import com.aspose.slides.model.PlaceholdersResponse;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slides.model.request.GetSlidesPlaceholderRequest;
import com.aspose.slides.model.request.GetSlidesPlaceholdersRequest;

/**
 * API tests for PlaceholdersApi
 */
public class PlaceholdersApiTest extends ApiTest {

    private final PlaceholdersApi api = new PlaceholdersApi(getConfiguration());

    
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderTest() throws ApiException, Exception {
        initialize("getSlidesPlaceholder", null, null);
        Boolean needAssertResponse = false;
        PlaceholderResponse response = null;;
        try {
            GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
            response = api.getSlidesPlaceholder(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesPlaceholder");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesPlaceholder", "name", request.getName());
            PlaceholderResponse response = api.getSlidesPlaceholder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesPlaceholder");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesPlaceholder");
        }
    }
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlidesPlaceholder", "slideIndex", request.getSlideIndex());
            PlaceholderResponse response = api.getSlidesPlaceholder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesPlaceholder");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesPlaceholder");
        }
    }
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderInvalidPlaceholderIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
            request.setPlaceholderIndex((Integer)invalidizeTestValue(request.getPlaceholderIndex(), "placeholderIndex", "Integer"));
            initialize("getSlidesPlaceholder", "placeholderIndex", request.getPlaceholderIndex());
            PlaceholderResponse response = api.getSlidesPlaceholder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "placeholderIndex", "getSlidesPlaceholder");
        }
        if (needAssertResponse) {
            assertResponse("placeholderIndex", "getSlidesPlaceholder");
        }
    }
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesPlaceholder", "password", request.getPassword());
            PlaceholderResponse response = api.getSlidesPlaceholder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesPlaceholder");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesPlaceholder");
        }
    }
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesPlaceholder", "folder", request.getFolder());
            PlaceholderResponse response = api.getSlidesPlaceholder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesPlaceholder");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesPlaceholder");
        }
    }
    /**
     * Read slide placeholder info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholderInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPlaceholderRequest request = createGetSlidesPlaceholderRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesPlaceholder", "storage", request.getStorage());
            PlaceholderResponse response = api.getSlidesPlaceholder(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesPlaceholder");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesPlaceholder");
        }
    }

    private GetSlidesPlaceholderRequest createGetSlidesPlaceholderRequest() {
        GetSlidesPlaceholderRequest request = new GetSlidesPlaceholderRequest();
        request.setName((String)getTestValue("getSlidesPlaceholder", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlidesPlaceholder", "slideIndex", "Integer"));
        request.setPlaceholderIndex((Integer)getTestValue("getSlidesPlaceholder", "placeholderIndex", "Integer"));
        request.setPassword((String)getTestValue("getSlidesPlaceholder", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesPlaceholder", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesPlaceholder", "storage", "String"));
        return request;
    }
    
    /**
     * Read slide placeholders info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholdersTest() throws ApiException, Exception {
        initialize("getSlidesPlaceholders", null, null);
        Boolean needAssertResponse = false;
        PlaceholdersResponse response = null;;
        try {
            GetSlidesPlaceholdersRequest request = createGetSlidesPlaceholdersRequest();
            response = api.getSlidesPlaceholders(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesPlaceholders");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read slide placeholders info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholdersInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPlaceholdersRequest request = createGetSlidesPlaceholdersRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesPlaceholders", "name", request.getName());
            PlaceholdersResponse response = api.getSlidesPlaceholders(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesPlaceholders");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesPlaceholders");
        }
    }
    /**
     * Read slide placeholders info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholdersInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPlaceholdersRequest request = createGetSlidesPlaceholdersRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlidesPlaceholders", "slideIndex", request.getSlideIndex());
            PlaceholdersResponse response = api.getSlidesPlaceholders(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesPlaceholders");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesPlaceholders");
        }
    }
    /**
     * Read slide placeholders info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholdersInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPlaceholdersRequest request = createGetSlidesPlaceholdersRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesPlaceholders", "password", request.getPassword());
            PlaceholdersResponse response = api.getSlidesPlaceholders(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesPlaceholders");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesPlaceholders");
        }
    }
    /**
     * Read slide placeholders info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholdersInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPlaceholdersRequest request = createGetSlidesPlaceholdersRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesPlaceholders", "folder", request.getFolder());
            PlaceholdersResponse response = api.getSlidesPlaceholders(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesPlaceholders");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesPlaceholders");
        }
    }
    /**
     * Read slide placeholders info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesPlaceholdersInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesPlaceholdersRequest request = createGetSlidesPlaceholdersRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesPlaceholders", "storage", request.getStorage());
            PlaceholdersResponse response = api.getSlidesPlaceholders(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesPlaceholders");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesPlaceholders");
        }
    }

    private GetSlidesPlaceholdersRequest createGetSlidesPlaceholdersRequest() {
        GetSlidesPlaceholdersRequest request = new GetSlidesPlaceholdersRequest();
        request.setName((String)getTestValue("getSlidesPlaceholders", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlidesPlaceholders", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("getSlidesPlaceholders", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesPlaceholders", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesPlaceholders", "storage", "String"));
        return request;
    }
    
}
