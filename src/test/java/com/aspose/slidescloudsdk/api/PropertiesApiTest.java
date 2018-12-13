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

import com.aspose.slidescloudsdk.model.DocumentProperties;
import com.aspose.slidescloudsdk.model.DocumentPropertiesResponse;
import com.aspose.slidescloudsdk.model.DocumentProperty;
import com.aspose.slidescloudsdk.model.DocumentPropertyResponse;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slidescloudsdk.model.request.DeleteSlidesDocumentPropertiesRequest;
import com.aspose.slidescloudsdk.model.request.DeleteSlidesDocumentPropertyRequest;
import com.aspose.slidescloudsdk.model.request.GetSlidesDocumentPropertiesRequest;
import com.aspose.slidescloudsdk.model.request.GetSlidesDocumentPropertyRequest;
import com.aspose.slidescloudsdk.model.request.PostSlidesSetDocumentPropertiesRequest;
import com.aspose.slidescloudsdk.model.request.PutSlidesSetDocumentPropertyRequest;

/**
 * API tests for PropertiesApi
 */
public class PropertiesApiTest extends ApiTest {

    private final PropertiesApi api = new PropertiesApi(getConfiguration());

    
    /**
     * Clean document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertiesTest() throws ApiException, Exception {
        initialize("deleteSlidesDocumentProperties", null, null);
        Boolean needAssertResponse = false;
        DocumentPropertiesResponse response = null;;
        try {
            DeleteSlidesDocumentPropertiesRequest request = createDeleteSlidesDocumentPropertiesRequest();
            response = api.deleteSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteSlidesDocumentProperties");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Clean document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertiesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesDocumentPropertiesRequest request = createDeleteSlidesDocumentPropertiesRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteSlidesDocumentProperties", "name", request.getName());
            DocumentPropertiesResponse response = api.deleteSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlidesDocumentProperties");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlidesDocumentProperties");
        }
    }
    /**
     * Clean document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertiesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesDocumentPropertiesRequest request = createDeleteSlidesDocumentPropertiesRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteSlidesDocumentProperties", "password", request.getPassword());
            DocumentPropertiesResponse response = api.deleteSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlidesDocumentProperties");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlidesDocumentProperties");
        }
    }
    /**
     * Clean document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertiesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesDocumentPropertiesRequest request = createDeleteSlidesDocumentPropertiesRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteSlidesDocumentProperties", "folder", request.getFolder());
            DocumentPropertiesResponse response = api.deleteSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlidesDocumentProperties");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlidesDocumentProperties");
        }
    }
    /**
     * Clean document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertiesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesDocumentPropertiesRequest request = createDeleteSlidesDocumentPropertiesRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteSlidesDocumentProperties", "storage", request.getStorage());
            DocumentPropertiesResponse response = api.deleteSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlidesDocumentProperties");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlidesDocumentProperties");
        }
    }

    private DeleteSlidesDocumentPropertiesRequest createDeleteSlidesDocumentPropertiesRequest() {
        DeleteSlidesDocumentPropertiesRequest request = new DeleteSlidesDocumentPropertiesRequest();
        request.setName((String)getTestValue("deleteSlidesDocumentProperties", "name", "String"));
        request.setPassword((String)getTestValue("deleteSlidesDocumentProperties", "password", "String"));
        request.setFolder((String)getTestValue("deleteSlidesDocumentProperties", "folder", "String"));
        request.setStorage((String)getTestValue("deleteSlidesDocumentProperties", "storage", "String"));
        return request;
    }
    
    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertyTest() throws ApiException, Exception {
        initialize("deleteSlidesDocumentProperty", null, null);
        Boolean needAssertResponse = false;
        DocumentPropertiesResponse response = null;;
        try {
            DeleteSlidesDocumentPropertyRequest request = createDeleteSlidesDocumentPropertyRequest();
            response = api.deleteSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteSlidesDocumentProperty");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertyInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesDocumentPropertyRequest request = createDeleteSlidesDocumentPropertyRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteSlidesDocumentProperty", "name", request.getName());
            DocumentPropertiesResponse response = api.deleteSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlidesDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlidesDocumentProperty");
        }
    }
    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertyInvalidPropertyNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesDocumentPropertyRequest request = createDeleteSlidesDocumentPropertyRequest();
            request.setPropertyName((String)invalidizeTestValue(request.getPropertyName(), "propertyName", "String"));
            initialize("deleteSlidesDocumentProperty", "propertyName", request.getPropertyName());
            DocumentPropertiesResponse response = api.deleteSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "propertyName", "deleteSlidesDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("propertyName", "deleteSlidesDocumentProperty");
        }
    }
    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertyInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesDocumentPropertyRequest request = createDeleteSlidesDocumentPropertyRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteSlidesDocumentProperty", "password", request.getPassword());
            DocumentPropertiesResponse response = api.deleteSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlidesDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlidesDocumentProperty");
        }
    }
    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertyInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesDocumentPropertyRequest request = createDeleteSlidesDocumentPropertyRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteSlidesDocumentProperty", "folder", request.getFolder());
            DocumentPropertiesResponse response = api.deleteSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlidesDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlidesDocumentProperty");
        }
    }
    /**
     * Delete document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlidesDocumentPropertyInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlidesDocumentPropertyRequest request = createDeleteSlidesDocumentPropertyRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteSlidesDocumentProperty", "storage", request.getStorage());
            DocumentPropertiesResponse response = api.deleteSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlidesDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlidesDocumentProperty");
        }
    }

    private DeleteSlidesDocumentPropertyRequest createDeleteSlidesDocumentPropertyRequest() {
        DeleteSlidesDocumentPropertyRequest request = new DeleteSlidesDocumentPropertyRequest();
        request.setName((String)getTestValue("deleteSlidesDocumentProperty", "name", "String"));
        request.setPropertyName((String)getTestValue("deleteSlidesDocumentProperty", "propertyName", "String"));
        request.setPassword((String)getTestValue("deleteSlidesDocumentProperty", "password", "String"));
        request.setFolder((String)getTestValue("deleteSlidesDocumentProperty", "folder", "String"));
        request.setStorage((String)getTestValue("deleteSlidesDocumentProperty", "storage", "String"));
        return request;
    }
    
    /**
     * Read presentation document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertiesTest() throws ApiException, Exception {
        initialize("getSlidesDocumentProperties", null, null);
        Boolean needAssertResponse = false;
        DocumentPropertiesResponse response = null;;
        try {
            GetSlidesDocumentPropertiesRequest request = createGetSlidesDocumentPropertiesRequest();
            response = api.getSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesDocumentProperties");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read presentation document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertiesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentPropertiesRequest request = createGetSlidesDocumentPropertiesRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesDocumentProperties", "name", request.getName());
            DocumentPropertiesResponse response = api.getSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesDocumentProperties");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesDocumentProperties");
        }
    }
    /**
     * Read presentation document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertiesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentPropertiesRequest request = createGetSlidesDocumentPropertiesRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesDocumentProperties", "password", request.getPassword());
            DocumentPropertiesResponse response = api.getSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesDocumentProperties");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesDocumentProperties");
        }
    }
    /**
     * Read presentation document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertiesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentPropertiesRequest request = createGetSlidesDocumentPropertiesRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesDocumentProperties", "folder", request.getFolder());
            DocumentPropertiesResponse response = api.getSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesDocumentProperties");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesDocumentProperties");
        }
    }
    /**
     * Read presentation document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertiesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentPropertiesRequest request = createGetSlidesDocumentPropertiesRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesDocumentProperties", "storage", request.getStorage());
            DocumentPropertiesResponse response = api.getSlidesDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesDocumentProperties");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesDocumentProperties");
        }
    }

    private GetSlidesDocumentPropertiesRequest createGetSlidesDocumentPropertiesRequest() {
        GetSlidesDocumentPropertiesRequest request = new GetSlidesDocumentPropertiesRequest();
        request.setName((String)getTestValue("getSlidesDocumentProperties", "name", "String"));
        request.setPassword((String)getTestValue("getSlidesDocumentProperties", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesDocumentProperties", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesDocumentProperties", "storage", "String"));
        return request;
    }
    
    /**
     * Read presentation document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertyTest() throws ApiException, Exception {
        initialize("getSlidesDocumentProperty", null, null);
        Boolean needAssertResponse = false;
        DocumentPropertyResponse response = null;;
        try {
            GetSlidesDocumentPropertyRequest request = createGetSlidesDocumentPropertyRequest();
            response = api.getSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlidesDocumentProperty");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read presentation document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertyInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentPropertyRequest request = createGetSlidesDocumentPropertyRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlidesDocumentProperty", "name", request.getName());
            DocumentPropertyResponse response = api.getSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlidesDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlidesDocumentProperty");
        }
    }
    /**
     * Read presentation document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertyInvalidPropertyNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentPropertyRequest request = createGetSlidesDocumentPropertyRequest();
            request.setPropertyName((String)invalidizeTestValue(request.getPropertyName(), "propertyName", "String"));
            initialize("getSlidesDocumentProperty", "propertyName", request.getPropertyName());
            DocumentPropertyResponse response = api.getSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "propertyName", "getSlidesDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("propertyName", "getSlidesDocumentProperty");
        }
    }
    /**
     * Read presentation document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertyInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentPropertyRequest request = createGetSlidesDocumentPropertyRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlidesDocumentProperty", "password", request.getPassword());
            DocumentPropertyResponse response = api.getSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlidesDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlidesDocumentProperty");
        }
    }
    /**
     * Read presentation document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertyInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentPropertyRequest request = createGetSlidesDocumentPropertyRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlidesDocumentProperty", "folder", request.getFolder());
            DocumentPropertyResponse response = api.getSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlidesDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlidesDocumentProperty");
        }
    }
    /**
     * Read presentation document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlidesDocumentPropertyInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlidesDocumentPropertyRequest request = createGetSlidesDocumentPropertyRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlidesDocumentProperty", "storage", request.getStorage());
            DocumentPropertyResponse response = api.getSlidesDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlidesDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlidesDocumentProperty");
        }
    }

    private GetSlidesDocumentPropertyRequest createGetSlidesDocumentPropertyRequest() {
        GetSlidesDocumentPropertyRequest request = new GetSlidesDocumentPropertyRequest();
        request.setName((String)getTestValue("getSlidesDocumentProperty", "name", "String"));
        request.setPropertyName((String)getTestValue("getSlidesDocumentProperty", "propertyName", "String"));
        request.setPassword((String)getTestValue("getSlidesDocumentProperty", "password", "String"));
        request.setFolder((String)getTestValue("getSlidesDocumentProperty", "folder", "String"));
        request.setStorage((String)getTestValue("getSlidesDocumentProperty", "storage", "String"));
        return request;
    }
    
    /**
     * Set document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSetDocumentPropertiesTest() throws ApiException, Exception {
        initialize("postSlidesSetDocumentProperties", null, null);
        Boolean needAssertResponse = false;
        DocumentPropertiesResponse response = null;;
        try {
            PostSlidesSetDocumentPropertiesRequest request = createPostSlidesSetDocumentPropertiesRequest();
            response = api.postSlidesSetDocumentProperties(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postSlidesSetDocumentProperties");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Set document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSetDocumentPropertiesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSetDocumentPropertiesRequest request = createPostSlidesSetDocumentPropertiesRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postSlidesSetDocumentProperties", "name", request.getName());
            DocumentPropertiesResponse response = api.postSlidesSetDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postSlidesSetDocumentProperties");
        }
        if (needAssertResponse) {
            assertResponse("name", "postSlidesSetDocumentProperties");
        }
    }
    /**
     * Set document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSetDocumentPropertiesInvalidPropertiesTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSetDocumentPropertiesRequest request = createPostSlidesSetDocumentPropertiesRequest();
            request.setProperties((DocumentProperties)invalidizeTestValue(request.getProperties(), "properties", "DocumentProperties"));
            initialize("postSlidesSetDocumentProperties", "properties", request.getProperties());
            DocumentPropertiesResponse response = api.postSlidesSetDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "properties", "postSlidesSetDocumentProperties");
        }
        if (needAssertResponse) {
            assertResponse("properties", "postSlidesSetDocumentProperties");
        }
    }
    /**
     * Set document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSetDocumentPropertiesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSetDocumentPropertiesRequest request = createPostSlidesSetDocumentPropertiesRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postSlidesSetDocumentProperties", "password", request.getPassword());
            DocumentPropertiesResponse response = api.postSlidesSetDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postSlidesSetDocumentProperties");
        }
        if (needAssertResponse) {
            assertResponse("password", "postSlidesSetDocumentProperties");
        }
    }
    /**
     * Set document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSetDocumentPropertiesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSetDocumentPropertiesRequest request = createPostSlidesSetDocumentPropertiesRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postSlidesSetDocumentProperties", "folder", request.getFolder());
            DocumentPropertiesResponse response = api.postSlidesSetDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postSlidesSetDocumentProperties");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postSlidesSetDocumentProperties");
        }
    }
    /**
     * Set document properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postSlidesSetDocumentPropertiesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostSlidesSetDocumentPropertiesRequest request = createPostSlidesSetDocumentPropertiesRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postSlidesSetDocumentProperties", "storage", request.getStorage());
            DocumentPropertiesResponse response = api.postSlidesSetDocumentProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postSlidesSetDocumentProperties");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postSlidesSetDocumentProperties");
        }
    }

    private PostSlidesSetDocumentPropertiesRequest createPostSlidesSetDocumentPropertiesRequest() {
        PostSlidesSetDocumentPropertiesRequest request = new PostSlidesSetDocumentPropertiesRequest();
        request.setName((String)getTestValue("postSlidesSetDocumentProperties", "name", "String"));
        request.setProperties((DocumentProperties)getTestValue("postSlidesSetDocumentProperties", "properties", "DocumentProperties"));
        request.setPassword((String)getTestValue("postSlidesSetDocumentProperties", "password", "String"));
        request.setFolder((String)getTestValue("postSlidesSetDocumentProperties", "folder", "String"));
        request.setStorage((String)getTestValue("postSlidesSetDocumentProperties", "storage", "String"));
        return request;
    }
    
    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyTest() throws ApiException, Exception {
        initialize("putSlidesSetDocumentProperty", null, null);
        Boolean needAssertResponse = false;
        DocumentPropertyResponse response = null;;
        try {
            PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
            response = api.putSlidesSetDocumentProperty(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putSlidesSetDocumentProperty");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putSlidesSetDocumentProperty", "name", request.getName());
            DocumentPropertyResponse response = api.putSlidesSetDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlidesSetDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlidesSetDocumentProperty");
        }
    }
    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyInvalidPropertyNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
            request.setPropertyName((String)invalidizeTestValue(request.getPropertyName(), "propertyName", "String"));
            initialize("putSlidesSetDocumentProperty", "propertyName", request.getPropertyName());
            DocumentPropertyResponse response = api.putSlidesSetDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "propertyName", "putSlidesSetDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("propertyName", "putSlidesSetDocumentProperty");
        }
    }
    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyInvalidPropertyTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
            request.setProperty((DocumentProperty)invalidizeTestValue(request.getProperty(), "property", "DocumentProperty"));
            initialize("putSlidesSetDocumentProperty", "property", request.getProperty());
            DocumentPropertyResponse response = api.putSlidesSetDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "property", "putSlidesSetDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("property", "putSlidesSetDocumentProperty");
        }
    }
    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putSlidesSetDocumentProperty", "password", request.getPassword());
            DocumentPropertyResponse response = api.putSlidesSetDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlidesSetDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlidesSetDocumentProperty");
        }
    }
    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putSlidesSetDocumentProperty", "folder", request.getFolder());
            DocumentPropertyResponse response = api.putSlidesSetDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlidesSetDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlidesSetDocumentProperty");
        }
    }
    /**
     * Set document property.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlidesSetDocumentPropertyInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlidesSetDocumentPropertyRequest request = createPutSlidesSetDocumentPropertyRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putSlidesSetDocumentProperty", "storage", request.getStorage());
            DocumentPropertyResponse response = api.putSlidesSetDocumentProperty(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlidesSetDocumentProperty");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlidesSetDocumentProperty");
        }
    }

    private PutSlidesSetDocumentPropertyRequest createPutSlidesSetDocumentPropertyRequest() {
        PutSlidesSetDocumentPropertyRequest request = new PutSlidesSetDocumentPropertyRequest();
        request.setName((String)getTestValue("putSlidesSetDocumentProperty", "name", "String"));
        request.setPropertyName((String)getTestValue("putSlidesSetDocumentProperty", "propertyName", "String"));
        request.setProperty((DocumentProperty)getTestValue("putSlidesSetDocumentProperty", "property", "DocumentProperty"));
        request.setPassword((String)getTestValue("putSlidesSetDocumentProperty", "password", "String"));
        request.setFolder((String)getTestValue("putSlidesSetDocumentProperty", "folder", "String"));
        request.setStorage((String)getTestValue("putSlidesSetDocumentProperty", "storage", "String"));
        return request;
    }
    
}
