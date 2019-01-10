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

import com.aspose.slides.model.ColorSchemeResponse;
import com.aspose.slides.model.FontSchemeResponse;
import com.aspose.slides.model.FormatSchemeResponse;
import com.aspose.slides.model.ThemeResponse;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slides.model.request.GetSlidesThemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeColorSchemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeFontSchemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeFormatSchemeRequest;

/**
 * API tests for ThemeApi
 */
public class ThemeApiTest extends ApiTest {

    private final ThemeApi api = new ThemeApi(getConfiguration());

    
    /**
     * Read slide theme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeTest() throws ApiException, Exception {
        initialize("getSlidesTheme", null, null);
        Boolean needAssertResponse = false;
        ThemeResponse response = null;;
        try {
            GetSlidesThemeRequest request = createGetSlidesThemeRequest();
            response = api.getSlidesTheme(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesTheme");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read slide theme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeRequest request = createGetSlidesThemeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesTheme", "name", request.getName());
            ThemeResponse response = api.getSlidesTheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesTheme");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesTheme");
        }
    }
    /**
     * Read slide theme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeRequest request = createGetSlidesThemeRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlidesTheme", "slideIndex", request.getSlideIndex());
            ThemeResponse response = api.getSlidesTheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesTheme");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesTheme");
        }
    }
    /**
     * Read slide theme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeRequest request = createGetSlidesThemeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesTheme", "password", request.getPassword());
            ThemeResponse response = api.getSlidesTheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesTheme");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesTheme");
        }
    }
    /**
     * Read slide theme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeRequest request = createGetSlidesThemeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesTheme", "folder", request.getFolder());
            ThemeResponse response = api.getSlidesTheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesTheme");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesTheme");
        }
    }
    /**
     * Read slide theme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeRequest request = createGetSlidesThemeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesTheme", "storage", request.getStorage());
            ThemeResponse response = api.getSlidesTheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesTheme");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesTheme");
        }
    }

    private GetSlidesThemeRequest createGetSlidesThemeRequest() {
        GetSlidesThemeRequest request = new GetSlidesThemeRequest();
        request.setName((String)getTestValue("getSlidesTheme", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlidesTheme", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("getSlidesTheme", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesTheme", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesTheme", "storage", "String"));
        return request;
    }
    
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeColorSchemeTest() throws ApiException, Exception {
        initialize("getSlidesThemeColorScheme", null, null);
        Boolean needAssertResponse = false;
        ColorSchemeResponse response = null;;
        try {
            GetSlidesThemeColorSchemeRequest request = createGetSlidesThemeColorSchemeRequest();
            response = api.getSlidesThemeColorScheme(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesThemeColorScheme");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeColorSchemeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeColorSchemeRequest request = createGetSlidesThemeColorSchemeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesThemeColorScheme", "name", request.getName());
            ColorSchemeResponse response = api.getSlidesThemeColorScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesThemeColorScheme");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesThemeColorScheme");
        }
    }
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeColorSchemeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeColorSchemeRequest request = createGetSlidesThemeColorSchemeRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlidesThemeColorScheme", "slideIndex", request.getSlideIndex());
            ColorSchemeResponse response = api.getSlidesThemeColorScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesThemeColorScheme");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesThemeColorScheme");
        }
    }
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeColorSchemeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeColorSchemeRequest request = createGetSlidesThemeColorSchemeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesThemeColorScheme", "password", request.getPassword());
            ColorSchemeResponse response = api.getSlidesThemeColorScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesThemeColorScheme");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesThemeColorScheme");
        }
    }
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeColorSchemeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeColorSchemeRequest request = createGetSlidesThemeColorSchemeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesThemeColorScheme", "folder", request.getFolder());
            ColorSchemeResponse response = api.getSlidesThemeColorScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesThemeColorScheme");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesThemeColorScheme");
        }
    }
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeColorSchemeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeColorSchemeRequest request = createGetSlidesThemeColorSchemeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesThemeColorScheme", "storage", request.getStorage());
            ColorSchemeResponse response = api.getSlidesThemeColorScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesThemeColorScheme");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesThemeColorScheme");
        }
    }

    private GetSlidesThemeColorSchemeRequest createGetSlidesThemeColorSchemeRequest() {
        GetSlidesThemeColorSchemeRequest request = new GetSlidesThemeColorSchemeRequest();
        request.setName((String)getTestValue("getSlidesThemeColorScheme", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlidesThemeColorScheme", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("getSlidesThemeColorScheme", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesThemeColorScheme", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesThemeColorScheme", "storage", "String"));
        return request;
    }
    
    /**
     * Read slide theme font scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFontSchemeTest() throws ApiException, Exception {
        initialize("getSlidesThemeFontScheme", null, null);
        Boolean needAssertResponse = false;
        FontSchemeResponse response = null;;
        try {
            GetSlidesThemeFontSchemeRequest request = createGetSlidesThemeFontSchemeRequest();
            response = api.getSlidesThemeFontScheme(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesThemeFontScheme");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read slide theme font scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFontSchemeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeFontSchemeRequest request = createGetSlidesThemeFontSchemeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesThemeFontScheme", "name", request.getName());
            FontSchemeResponse response = api.getSlidesThemeFontScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesThemeFontScheme");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesThemeFontScheme");
        }
    }
    /**
     * Read slide theme font scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFontSchemeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeFontSchemeRequest request = createGetSlidesThemeFontSchemeRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlidesThemeFontScheme", "slideIndex", request.getSlideIndex());
            FontSchemeResponse response = api.getSlidesThemeFontScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesThemeFontScheme");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesThemeFontScheme");
        }
    }
    /**
     * Read slide theme font scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFontSchemeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeFontSchemeRequest request = createGetSlidesThemeFontSchemeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesThemeFontScheme", "password", request.getPassword());
            FontSchemeResponse response = api.getSlidesThemeFontScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesThemeFontScheme");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesThemeFontScheme");
        }
    }
    /**
     * Read slide theme font scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFontSchemeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeFontSchemeRequest request = createGetSlidesThemeFontSchemeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesThemeFontScheme", "folder", request.getFolder());
            FontSchemeResponse response = api.getSlidesThemeFontScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesThemeFontScheme");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesThemeFontScheme");
        }
    }
    /**
     * Read slide theme font scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFontSchemeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeFontSchemeRequest request = createGetSlidesThemeFontSchemeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesThemeFontScheme", "storage", request.getStorage());
            FontSchemeResponse response = api.getSlidesThemeFontScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesThemeFontScheme");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesThemeFontScheme");
        }
    }

    private GetSlidesThemeFontSchemeRequest createGetSlidesThemeFontSchemeRequest() {
        GetSlidesThemeFontSchemeRequest request = new GetSlidesThemeFontSchemeRequest();
        request.setName((String)getTestValue("getSlidesThemeFontScheme", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlidesThemeFontScheme", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("getSlidesThemeFontScheme", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesThemeFontScheme", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesThemeFontScheme", "storage", "String"));
        return request;
    }
    
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFormatSchemeTest() throws ApiException, Exception {
        initialize("getSlidesThemeFormatScheme", null, null);
        Boolean needAssertResponse = false;
        FormatSchemeResponse response = null;;
        try {
            GetSlidesThemeFormatSchemeRequest request = createGetSlidesThemeFormatSchemeRequest();
            response = api.getSlidesThemeFormatScheme(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesThemeFormatScheme");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFormatSchemeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeFormatSchemeRequest request = createGetSlidesThemeFormatSchemeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesThemeFormatScheme", "name", request.getName());
            FormatSchemeResponse response = api.getSlidesThemeFormatScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesThemeFormatScheme");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesThemeFormatScheme");
        }
    }
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFormatSchemeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeFormatSchemeRequest request = createGetSlidesThemeFormatSchemeRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlidesThemeFormatScheme", "slideIndex", request.getSlideIndex());
            FormatSchemeResponse response = api.getSlidesThemeFormatScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlidesThemeFormatScheme");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlidesThemeFormatScheme");
        }
    }
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFormatSchemeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeFormatSchemeRequest request = createGetSlidesThemeFormatSchemeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesThemeFormatScheme", "password", request.getPassword());
            FormatSchemeResponse response = api.getSlidesThemeFormatScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesThemeFormatScheme");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesThemeFormatScheme");
        }
    }
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFormatSchemeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeFormatSchemeRequest request = createGetSlidesThemeFormatSchemeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesThemeFormatScheme", "folder", request.getFolder());
            FormatSchemeResponse response = api.getSlidesThemeFormatScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesThemeFormatScheme");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesThemeFormatScheme");
        }
    }
    /**
     * Read slide theme color scheme info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesThemeFormatSchemeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesThemeFormatSchemeRequest request = createGetSlidesThemeFormatSchemeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesThemeFormatScheme", "storage", request.getStorage());
            FormatSchemeResponse response = api.getSlidesThemeFormatScheme(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesThemeFormatScheme");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesThemeFormatScheme");
        }
    }

    private GetSlidesThemeFormatSchemeRequest createGetSlidesThemeFormatSchemeRequest() {
        GetSlidesThemeFormatSchemeRequest request = new GetSlidesThemeFormatSchemeRequest();
        request.setName((String)getTestValue("getSlidesThemeFormatScheme", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlidesThemeFormatScheme", "slideIndex", "Integer"));
        request.setPassword((String)getTestValue("getSlidesThemeFormatScheme", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesThemeFormatScheme", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesThemeFormatScheme", "storage", "String"));
        return request;
    }
    
}
