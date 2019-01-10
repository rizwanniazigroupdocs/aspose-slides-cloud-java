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
import com.aspose.slides.model.IShapeExportOptions;
import com.aspose.slides.model.Paragraph;
import com.aspose.slides.model.ParagraphListResponse;
import com.aspose.slides.model.ParagraphResponse;
import com.aspose.slides.model.Portion;
import com.aspose.slides.model.PortionListResponse;
import com.aspose.slides.model.PortionResponse;
import com.aspose.slides.model.ShapeBase;
import com.aspose.slides.model.ShapeListResponse;
import com.aspose.slides.model.ShapeResponse;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slides.model.request.DeleteParagraphRequest;
import com.aspose.slides.model.request.DeleteParagraphsRequest;
import com.aspose.slides.model.request.DeletePortionRequest;
import com.aspose.slides.model.request.DeletePortionsRequest;
import com.aspose.slides.model.request.DeleteSlideShapeRequest;
import com.aspose.slides.model.request.DeleteSlideShapesRequest;
import com.aspose.slides.model.request.GetParagraphPortionRequest;
import com.aspose.slides.model.request.GetParagraphPortionsRequest;
import com.aspose.slides.model.request.GetShapeParagraphRequest;
import com.aspose.slides.model.request.GetShapeWithFormatRequest;
import com.aspose.slides.model.request.GetSlideShapeRequest;
import com.aspose.slides.model.request.GetSlideShapeParagraphsRequest;
import com.aspose.slides.model.request.GetSlideShapesRequest;
import com.aspose.slides.model.request.PostAddNewParagraphRequest;
import com.aspose.slides.model.request.PostAddNewPortionRequest;
import com.aspose.slides.model.request.PostAddNewShapeRequest;
import com.aspose.slides.model.request.PostShapeSaveAsRequest;
import com.aspose.slides.model.request.PutSetParagraphPortionPropertiesRequest;
import com.aspose.slides.model.request.PutSetParagraphPropertiesRequest;
import com.aspose.slides.model.request.PutSlideShapeInfoRequest;

/**
 * API tests for ShapesApi
 */
public class ShapesApiTest extends ApiTest {

    private final ShapesApi api = new ShapesApi(getConfiguration());

    
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphTest() throws ApiException, Exception {
        initialize("deleteParagraph", null, null);
        Boolean needAssertResponse = false;
        ParagraphListResponse response = null;;
        try {
            DeleteParagraphRequest request = createDeleteParagraphRequest();
            response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteParagraph");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphRequest request = createDeleteParagraphRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteParagraph", "name", request.getName());
            ParagraphListResponse response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteParagraph");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteParagraph");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphRequest request = createDeleteParagraphRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deleteParagraph", "slideIndex", request.getSlideIndex());
            ParagraphListResponse response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteParagraph");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteParagraph");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphRequest request = createDeleteParagraphRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("deleteParagraph", "path", request.getPath());
            ParagraphListResponse response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteParagraph");
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteParagraph");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphRequest request = createDeleteParagraphRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("deleteParagraph", "shapeIndex", request.getShapeIndex());
            ParagraphListResponse response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteParagraph");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteParagraph");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphRequest request = createDeleteParagraphRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("deleteParagraph", "paragraphIndex", request.getParagraphIndex());
            ParagraphListResponse response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "deleteParagraph");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "deleteParagraph");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphRequest request = createDeleteParagraphRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteParagraph", "password", request.getPassword());
            ParagraphListResponse response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteParagraph");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteParagraph");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphRequest request = createDeleteParagraphRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteParagraph", "folder", request.getFolder());
            ParagraphListResponse response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteParagraph");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteParagraph");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphRequest request = createDeleteParagraphRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteParagraph", "storage", request.getStorage());
            ParagraphListResponse response = api.deleteParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteParagraph");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteParagraph");
        }
    }

    private DeleteParagraphRequest createDeleteParagraphRequest() {
        DeleteParagraphRequest request = new DeleteParagraphRequest();
        request.setName((String)getTestValue("deleteParagraph", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deleteParagraph", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("deleteParagraph", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("deleteParagraph", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("deleteParagraph", "paragraphIndex", "Integer"));
        request.setPassword((String)getTestValue("deleteParagraph", "password", "String"));
        request.setFolder((String)getTestValue("deleteParagraph", "folder", "String"));
        request.setStorage((String)getTestValue("deleteParagraph", "storage", "String"));
        return request;
    }
    
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsTest() throws ApiException, Exception {
        initialize("deleteParagraphs", null, null);
        Boolean needAssertResponse = false;
        ParagraphListResponse response = null;;
        try {
            DeleteParagraphsRequest request = createDeleteParagraphsRequest();
            response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteParagraphs");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphsRequest request = createDeleteParagraphsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteParagraphs", "name", request.getName());
            ParagraphListResponse response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteParagraphs");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphsRequest request = createDeleteParagraphsRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deleteParagraphs", "slideIndex", request.getSlideIndex());
            ParagraphListResponse response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteParagraphs");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphsRequest request = createDeleteParagraphsRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("deleteParagraphs", "path", request.getPath());
            ParagraphListResponse response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteParagraphs");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphsRequest request = createDeleteParagraphsRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("deleteParagraphs", "shapeIndex", request.getShapeIndex());
            ParagraphListResponse response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteParagraphs");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidParagraphsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphsRequest request = createDeleteParagraphsRequest();
            request.setParagraphs((List<Integer>)invalidizeTestValue(request.getParagraphs(), "paragraphs", "List<Integer>"));
            initialize("deleteParagraphs", "paragraphs", request.getParagraphs());
            ParagraphListResponse response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphs", "deleteParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("paragraphs", "deleteParagraphs");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphsRequest request = createDeleteParagraphsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteParagraphs", "password", request.getPassword());
            ParagraphListResponse response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteParagraphs");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphsRequest request = createDeleteParagraphsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteParagraphs", "folder", request.getFolder());
            ParagraphListResponse response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteParagraphs");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteParagraphsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteParagraphsRequest request = createDeleteParagraphsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteParagraphs", "storage", request.getStorage());
            ParagraphListResponse response = api.deleteParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteParagraphs");
        }
    }

    private DeleteParagraphsRequest createDeleteParagraphsRequest() {
        DeleteParagraphsRequest request = new DeleteParagraphsRequest();
        request.setName((String)getTestValue("deleteParagraphs", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deleteParagraphs", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("deleteParagraphs", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("deleteParagraphs", "shapeIndex", "Integer"));
        request.setParagraphs((List<Integer>)getTestValue("deleteParagraphs", "paragraphs", "List<Integer>"));
        request.setPassword((String)getTestValue("deleteParagraphs", "password", "String"));
        request.setFolder((String)getTestValue("deleteParagraphs", "folder", "String"));
        request.setStorage((String)getTestValue("deleteParagraphs", "storage", "String"));
        return request;
    }
    
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionTest() throws ApiException, Exception {
        initialize("deletePortion", null, null);
        Boolean needAssertResponse = false;
        PortionListResponse response = null;;
        try {
            DeletePortionRequest request = createDeletePortionRequest();
            response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deletePortion");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionRequest request = createDeletePortionRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deletePortion", "name", request.getName());
            PortionListResponse response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deletePortion");
        }
        if (needAssertResponse) {
            assertResponse("name", "deletePortion");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionRequest request = createDeletePortionRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deletePortion", "slideIndex", request.getSlideIndex());
            PortionListResponse response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deletePortion");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deletePortion");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionRequest request = createDeletePortionRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("deletePortion", "path", request.getPath());
            PortionListResponse response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deletePortion");
        }
        if (needAssertResponse) {
            assertResponse("path", "deletePortion");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionRequest request = createDeletePortionRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("deletePortion", "shapeIndex", request.getShapeIndex());
            PortionListResponse response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deletePortion");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deletePortion");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionRequest request = createDeletePortionRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("deletePortion", "paragraphIndex", request.getParagraphIndex());
            PortionListResponse response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "deletePortion");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "deletePortion");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidPortionIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionRequest request = createDeletePortionRequest();
            request.setPortionIndex((Integer)invalidizeTestValue(request.getPortionIndex(), "portionIndex", "Integer"));
            initialize("deletePortion", "portionIndex", request.getPortionIndex());
            PortionListResponse response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portionIndex", "deletePortion");
        }
        if (needAssertResponse) {
            assertResponse("portionIndex", "deletePortion");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionRequest request = createDeletePortionRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deletePortion", "password", request.getPassword());
            PortionListResponse response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deletePortion");
        }
        if (needAssertResponse) {
            assertResponse("password", "deletePortion");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionRequest request = createDeletePortionRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deletePortion", "folder", request.getFolder());
            PortionListResponse response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deletePortion");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deletePortion");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionRequest request = createDeletePortionRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deletePortion", "storage", request.getStorage());
            PortionListResponse response = api.deletePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deletePortion");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deletePortion");
        }
    }

    private DeletePortionRequest createDeletePortionRequest() {
        DeletePortionRequest request = new DeletePortionRequest();
        request.setName((String)getTestValue("deletePortion", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deletePortion", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("deletePortion", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("deletePortion", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("deletePortion", "paragraphIndex", "Integer"));
        request.setPortionIndex((Integer)getTestValue("deletePortion", "portionIndex", "Integer"));
        request.setPassword((String)getTestValue("deletePortion", "password", "String"));
        request.setFolder((String)getTestValue("deletePortion", "folder", "String"));
        request.setStorage((String)getTestValue("deletePortion", "storage", "String"));
        return request;
    }
    
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsTest() throws ApiException, Exception {
        initialize("deletePortions", null, null);
        Boolean needAssertResponse = false;
        PortionListResponse response = null;;
        try {
            DeletePortionsRequest request = createDeletePortionsRequest();
            response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deletePortions");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionsRequest request = createDeletePortionsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deletePortions", "name", request.getName());
            PortionListResponse response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deletePortions");
        }
        if (needAssertResponse) {
            assertResponse("name", "deletePortions");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionsRequest request = createDeletePortionsRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deletePortions", "slideIndex", request.getSlideIndex());
            PortionListResponse response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deletePortions");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deletePortions");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionsRequest request = createDeletePortionsRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("deletePortions", "path", request.getPath());
            PortionListResponse response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deletePortions");
        }
        if (needAssertResponse) {
            assertResponse("path", "deletePortions");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionsRequest request = createDeletePortionsRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("deletePortions", "shapeIndex", request.getShapeIndex());
            PortionListResponse response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deletePortions");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deletePortions");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionsRequest request = createDeletePortionsRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("deletePortions", "paragraphIndex", request.getParagraphIndex());
            PortionListResponse response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "deletePortions");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "deletePortions");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidPortionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionsRequest request = createDeletePortionsRequest();
            request.setPortions((List<Integer>)invalidizeTestValue(request.getPortions(), "portions", "List<Integer>"));
            initialize("deletePortions", "portions", request.getPortions());
            PortionListResponse response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portions", "deletePortions");
        }
        if (needAssertResponse) {
            assertResponse("portions", "deletePortions");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionsRequest request = createDeletePortionsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deletePortions", "password", request.getPassword());
            PortionListResponse response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deletePortions");
        }
        if (needAssertResponse) {
            assertResponse("password", "deletePortions");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionsRequest request = createDeletePortionsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deletePortions", "folder", request.getFolder());
            PortionListResponse response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deletePortions");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deletePortions");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePortionsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeletePortionsRequest request = createDeletePortionsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deletePortions", "storage", request.getStorage());
            PortionListResponse response = api.deletePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deletePortions");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deletePortions");
        }
    }

    private DeletePortionsRequest createDeletePortionsRequest() {
        DeletePortionsRequest request = new DeletePortionsRequest();
        request.setName((String)getTestValue("deletePortions", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deletePortions", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("deletePortions", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("deletePortions", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("deletePortions", "paragraphIndex", "Integer"));
        request.setPortions((List<Integer>)getTestValue("deletePortions", "portions", "List<Integer>"));
        request.setPassword((String)getTestValue("deletePortions", "password", "String"));
        request.setFolder((String)getTestValue("deletePortions", "folder", "String"));
        request.setStorage((String)getTestValue("deletePortions", "storage", "String"));
        return request;
    }
    
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeTest() throws ApiException, Exception {
        initialize("deleteSlideShape", null, null);
        Boolean needAssertResponse = false;
        ShapeListResponse response = null;;
        try {
            DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
            response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteSlideShape");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteSlideShape", "name", request.getName());
            ShapeListResponse response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlideShape");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deleteSlideShape", "slideIndex", request.getSlideIndex());
            ShapeListResponse response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlideShape");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("deleteSlideShape", "path", request.getPath());
            ShapeListResponse response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteSlideShape");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("deleteSlideShape", "shapeIndex", request.getShapeIndex());
            ShapeListResponse response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteSlideShape");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteSlideShape", "password", request.getPassword());
            ShapeListResponse response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlideShape");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteSlideShape", "folder", request.getFolder());
            ShapeListResponse response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlideShape");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapeRequest request = createDeleteSlideShapeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteSlideShape", "storage", request.getStorage());
            ShapeListResponse response = api.deleteSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlideShape");
        }
    }

    private DeleteSlideShapeRequest createDeleteSlideShapeRequest() {
        DeleteSlideShapeRequest request = new DeleteSlideShapeRequest();
        request.setName((String)getTestValue("deleteSlideShape", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deleteSlideShape", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("deleteSlideShape", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("deleteSlideShape", "shapeIndex", "Integer"));
        request.setPassword((String)getTestValue("deleteSlideShape", "password", "String"));
        request.setFolder((String)getTestValue("deleteSlideShape", "folder", "String"));
        request.setStorage((String)getTestValue("deleteSlideShape", "storage", "String"));
        return request;
    }
    
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesTest() throws ApiException, Exception {
        initialize("deleteSlideShapes", null, null);
        Boolean needAssertResponse = false;
        ShapeListResponse response = null;;
        try {
            DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
            response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteSlideShapes");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteSlideShapes", "name", request.getName());
            ShapeListResponse response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteSlideShapes");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deleteSlideShapes", "slideIndex", request.getSlideIndex());
            ShapeListResponse response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteSlideShapes");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("deleteSlideShapes", "path", request.getPath());
            ShapeListResponse response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteSlideShapes");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidShapesTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
            request.setShapes((List<Integer>)invalidizeTestValue(request.getShapes(), "shapes", "List<Integer>"));
            initialize("deleteSlideShapes", "shapes", request.getShapes());
            ShapeListResponse response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapes", "deleteSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("shapes", "deleteSlideShapes");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteSlideShapes", "password", request.getPassword());
            ShapeListResponse response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteSlideShapes");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteSlideShapes", "folder", request.getFolder());
            ShapeListResponse response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteSlideShapes");
        }
    }
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSlideShapesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteSlideShapesRequest request = createDeleteSlideShapesRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteSlideShapes", "storage", request.getStorage());
            ShapeListResponse response = api.deleteSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteSlideShapes");
        }
    }

    private DeleteSlideShapesRequest createDeleteSlideShapesRequest() {
        DeleteSlideShapesRequest request = new DeleteSlideShapesRequest();
        request.setName((String)getTestValue("deleteSlideShapes", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deleteSlideShapes", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("deleteSlideShapes", "path", "String"));
        request.setShapes((List<Integer>)getTestValue("deleteSlideShapes", "shapes", "List<Integer>"));
        request.setPassword((String)getTestValue("deleteSlideShapes", "password", "String"));
        request.setFolder((String)getTestValue("deleteSlideShapes", "folder", "String"));
        request.setStorage((String)getTestValue("deleteSlideShapes", "storage", "String"));
        return request;
    }
    
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionTest() throws ApiException, Exception {
        initialize("getParagraphPortion", null, null);
        Boolean needAssertResponse = false;
        PortionResponse response = null;;
        try {
            GetParagraphPortionRequest request = createGetParagraphPortionRequest();
            response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getParagraphPortion");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionRequest request = createGetParagraphPortionRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getParagraphPortion", "name", request.getName());
            PortionResponse response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getParagraphPortion");
        }
        if (needAssertResponse) {
            assertResponse("name", "getParagraphPortion");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionRequest request = createGetParagraphPortionRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getParagraphPortion", "slideIndex", request.getSlideIndex());
            PortionResponse response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getParagraphPortion");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getParagraphPortion");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionRequest request = createGetParagraphPortionRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("getParagraphPortion", "path", request.getPath());
            PortionResponse response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getParagraphPortion");
        }
        if (needAssertResponse) {
            assertResponse("path", "getParagraphPortion");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionRequest request = createGetParagraphPortionRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("getParagraphPortion", "shapeIndex", request.getShapeIndex());
            PortionResponse response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getParagraphPortion");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getParagraphPortion");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionRequest request = createGetParagraphPortionRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("getParagraphPortion", "paragraphIndex", request.getParagraphIndex());
            PortionResponse response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "getParagraphPortion");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "getParagraphPortion");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidPortionIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionRequest request = createGetParagraphPortionRequest();
            request.setPortionIndex((Integer)invalidizeTestValue(request.getPortionIndex(), "portionIndex", "Integer"));
            initialize("getParagraphPortion", "portionIndex", request.getPortionIndex());
            PortionResponse response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portionIndex", "getParagraphPortion");
        }
        if (needAssertResponse) {
            assertResponse("portionIndex", "getParagraphPortion");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionRequest request = createGetParagraphPortionRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getParagraphPortion", "password", request.getPassword());
            PortionResponse response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getParagraphPortion");
        }
        if (needAssertResponse) {
            assertResponse("password", "getParagraphPortion");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionRequest request = createGetParagraphPortionRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getParagraphPortion", "folder", request.getFolder());
            PortionResponse response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getParagraphPortion");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getParagraphPortion");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionRequest request = createGetParagraphPortionRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getParagraphPortion", "storage", request.getStorage());
            PortionResponse response = api.getParagraphPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getParagraphPortion");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getParagraphPortion");
        }
    }

    private GetParagraphPortionRequest createGetParagraphPortionRequest() {
        GetParagraphPortionRequest request = new GetParagraphPortionRequest();
        request.setName((String)getTestValue("getParagraphPortion", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getParagraphPortion", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("getParagraphPortion", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("getParagraphPortion", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("getParagraphPortion", "paragraphIndex", "Integer"));
        request.setPortionIndex((Integer)getTestValue("getParagraphPortion", "portionIndex", "Integer"));
        request.setPassword((String)getTestValue("getParagraphPortion", "password", "String"));
        request.setFolder((String)getTestValue("getParagraphPortion", "folder", "String"));
        request.setStorage((String)getTestValue("getParagraphPortion", "storage", "String"));
        return request;
    }
    
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsTest() throws ApiException, Exception {
        initialize("getParagraphPortions", null, null);
        Boolean needAssertResponse = false;
        PortionListResponse response = null;;
        try {
            GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
            response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getParagraphPortions");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getParagraphPortions", "name", request.getName());
            PortionListResponse response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getParagraphPortions");
        }
        if (needAssertResponse) {
            assertResponse("name", "getParagraphPortions");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getParagraphPortions", "slideIndex", request.getSlideIndex());
            PortionListResponse response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getParagraphPortions");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getParagraphPortions");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("getParagraphPortions", "path", request.getPath());
            PortionListResponse response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getParagraphPortions");
        }
        if (needAssertResponse) {
            assertResponse("path", "getParagraphPortions");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("getParagraphPortions", "shapeIndex", request.getShapeIndex());
            PortionListResponse response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getParagraphPortions");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getParagraphPortions");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("getParagraphPortions", "paragraphIndex", request.getParagraphIndex());
            PortionListResponse response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "getParagraphPortions");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "getParagraphPortions");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getParagraphPortions", "password", request.getPassword());
            PortionListResponse response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getParagraphPortions");
        }
        if (needAssertResponse) {
            assertResponse("password", "getParagraphPortions");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getParagraphPortions", "folder", request.getFolder());
            PortionListResponse response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getParagraphPortions");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getParagraphPortions");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParagraphPortionsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetParagraphPortionsRequest request = createGetParagraphPortionsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getParagraphPortions", "storage", request.getStorage());
            PortionListResponse response = api.getParagraphPortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getParagraphPortions");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getParagraphPortions");
        }
    }

    private GetParagraphPortionsRequest createGetParagraphPortionsRequest() {
        GetParagraphPortionsRequest request = new GetParagraphPortionsRequest();
        request.setName((String)getTestValue("getParagraphPortions", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getParagraphPortions", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("getParagraphPortions", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("getParagraphPortions", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("getParagraphPortions", "paragraphIndex", "Integer"));
        request.setPassword((String)getTestValue("getParagraphPortions", "password", "String"));
        request.setFolder((String)getTestValue("getParagraphPortions", "folder", "String"));
        request.setStorage((String)getTestValue("getParagraphPortions", "storage", "String"));
        return request;
    }
    
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeParagraphTest() throws ApiException, Exception {
        initialize("getShapeParagraph", null, null);
        Boolean needAssertResponse = false;
        ParagraphResponse response = null;;
        try {
            GetShapeParagraphRequest request = createGetShapeParagraphRequest();
            response = api.getShapeParagraph(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getShapeParagraph");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeParagraphRequest request = createGetShapeParagraphRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getShapeParagraph", "name", request.getName());
            ParagraphResponse response = api.getShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("name", "getShapeParagraph");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeParagraphRequest request = createGetShapeParagraphRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getShapeParagraph", "slideIndex", request.getSlideIndex());
            ParagraphResponse response = api.getShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getShapeParagraph");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeParagraphRequest request = createGetShapeParagraphRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("getShapeParagraph", "path", request.getPath());
            ParagraphResponse response = api.getShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("path", "getShapeParagraph");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeParagraphRequest request = createGetShapeParagraphRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("getShapeParagraph", "shapeIndex", request.getShapeIndex());
            ParagraphResponse response = api.getShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getShapeParagraph");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeParagraphInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeParagraphRequest request = createGetShapeParagraphRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("getShapeParagraph", "paragraphIndex", request.getParagraphIndex());
            ParagraphResponse response = api.getShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "getShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "getShapeParagraph");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeParagraphRequest request = createGetShapeParagraphRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getShapeParagraph", "password", request.getPassword());
            ParagraphResponse response = api.getShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("password", "getShapeParagraph");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeParagraphRequest request = createGetShapeParagraphRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getShapeParagraph", "folder", request.getFolder());
            ParagraphResponse response = api.getShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getShapeParagraph");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeParagraphRequest request = createGetShapeParagraphRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getShapeParagraph", "storage", request.getStorage());
            ParagraphResponse response = api.getShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getShapeParagraph");
        }
    }

    private GetShapeParagraphRequest createGetShapeParagraphRequest() {
        GetShapeParagraphRequest request = new GetShapeParagraphRequest();
        request.setName((String)getTestValue("getShapeParagraph", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getShapeParagraph", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("getShapeParagraph", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("getShapeParagraph", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("getShapeParagraph", "paragraphIndex", "Integer"));
        request.setPassword((String)getTestValue("getShapeParagraph", "password", "String"));
        request.setFolder((String)getTestValue("getShapeParagraph", "folder", "String"));
        request.setStorage((String)getTestValue("getShapeParagraph", "storage", "String"));
        return request;
    }
    
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeWithFormatTest() throws ApiException, Exception {
        initialize("getShapeWithFormat", null, null);
        Boolean needAssertResponse = false;
        File response = null;;
        try {
            GetShapeWithFormatRequest request = createGetShapeWithFormatRequest();
            response = api.getShapeWithFormat(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getShapeWithFormat");
        }
        if (needAssertResponse) {
            assertTrue(response.isFile());
        }
    }

    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeWithFormatInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeWithFormatRequest request = createGetShapeWithFormatRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getShapeWithFormat", "name", request.getName());
            File response = api.getShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("name", "getShapeWithFormat");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeWithFormatInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeWithFormatRequest request = createGetShapeWithFormatRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getShapeWithFormat", "slideIndex", request.getSlideIndex());
            File response = api.getShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getShapeWithFormat");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeWithFormatInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeWithFormatRequest request = createGetShapeWithFormatRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("getShapeWithFormat", "shapeIndex", request.getShapeIndex());
            File response = api.getShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getShapeWithFormat");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeWithFormatInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeWithFormatRequest request = createGetShapeWithFormatRequest();
            request.setFormat((ShapeExportFormat)invalidizeTestValue(request.getFormat(), "format", "ShapeExportFormat"));
            initialize("getShapeWithFormat", "format", request.getFormat());
            File response = api.getShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "getShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("format", "getShapeWithFormat");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeWithFormatInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeWithFormatRequest request = createGetShapeWithFormatRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getShapeWithFormat", "password", request.getPassword());
            File response = api.getShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("password", "getShapeWithFormat");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeWithFormatInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeWithFormatRequest request = createGetShapeWithFormatRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getShapeWithFormat", "folder", request.getFolder());
            File response = api.getShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getShapeWithFormat");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeWithFormatInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeWithFormatRequest request = createGetShapeWithFormatRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getShapeWithFormat", "storage", request.getStorage());
            File response = api.getShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getShapeWithFormat");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeWithFormatInvalidScaleXTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeWithFormatRequest request = createGetShapeWithFormatRequest();
            request.setScaleX((Double)invalidizeTestValue(request.getScaleX(), "scaleX", "Double"));
            initialize("getShapeWithFormat", "scaleX", request.getScaleX());
            File response = api.getShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleX", "getShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("scaleX", "getShapeWithFormat");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeWithFormatInvalidScaleYTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeWithFormatRequest request = createGetShapeWithFormatRequest();
            request.setScaleY((Double)invalidizeTestValue(request.getScaleY(), "scaleY", "Double"));
            initialize("getShapeWithFormat", "scaleY", request.getScaleY());
            File response = api.getShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleY", "getShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("scaleY", "getShapeWithFormat");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeWithFormatInvalidBoundsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeWithFormatRequest request = createGetShapeWithFormatRequest();
            request.setBounds((String)invalidizeTestValue(request.getBounds(), "bounds", "String"));
            initialize("getShapeWithFormat", "bounds", request.getBounds());
            File response = api.getShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "bounds", "getShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("bounds", "getShapeWithFormat");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeWithFormatInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeWithFormatRequest request = createGetShapeWithFormatRequest();
            request.setOutPath((String)invalidizeTestValue(request.getOutPath(), "outPath", "String"));
            initialize("getShapeWithFormat", "outPath", request.getOutPath());
            File response = api.getShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "getShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("outPath", "getShapeWithFormat");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShapeWithFormatInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetShapeWithFormatRequest request = createGetShapeWithFormatRequest();
            request.setFontsFolder((String)invalidizeTestValue(request.getFontsFolder(), "fontsFolder", "String"));
            initialize("getShapeWithFormat", "fontsFolder", request.getFontsFolder());
            File response = api.getShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "getShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "getShapeWithFormat");
        }
    }

    private GetShapeWithFormatRequest createGetShapeWithFormatRequest() {
        GetShapeWithFormatRequest request = new GetShapeWithFormatRequest();
        request.setName((String)getTestValue("getShapeWithFormat", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getShapeWithFormat", "slideIndex", "Integer"));
        request.setShapeIndex((Integer)getTestValue("getShapeWithFormat", "shapeIndex", "Integer"));
        request.setFormat((ShapeExportFormat)getTestValue("getShapeWithFormat", "format", "ShapeExportFormat"));
        request.setPassword((String)getTestValue("getShapeWithFormat", "password", "String"));
        request.setFolder((String)getTestValue("getShapeWithFormat", "folder", "String"));
        request.setStorage((String)getTestValue("getShapeWithFormat", "storage", "String"));
        request.setScaleX((Double)getTestValue("getShapeWithFormat", "scaleX", "Double"));
        request.setScaleY((Double)getTestValue("getShapeWithFormat", "scaleY", "Double"));
        request.setBounds((String)getTestValue("getShapeWithFormat", "bounds", "String"));
        request.setOutPath((String)getTestValue("getShapeWithFormat", "outPath", "String"));
        request.setFontsFolder((String)getTestValue("getShapeWithFormat", "fontsFolder", "String"));
        return request;
    }
    
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeTest() throws ApiException, Exception {
        initialize("getSlideShape", null, null);
        Boolean needAssertResponse = false;
        ShapeResponse response = null;;
        try {
            GetSlideShapeRequest request = createGetSlideShapeRequest();
            response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlideShape");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeRequest request = createGetSlideShapeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlideShape", "name", request.getName());
            ShapeResponse response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlideShape");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeRequest request = createGetSlideShapeRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlideShape", "slideIndex", request.getSlideIndex());
            ShapeResponse response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlideShape");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeRequest request = createGetSlideShapeRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("getSlideShape", "path", request.getPath());
            ShapeResponse response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("path", "getSlideShape");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeRequest request = createGetSlideShapeRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("getSlideShape", "shapeIndex", request.getShapeIndex());
            ShapeResponse response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getSlideShape");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeRequest request = createGetSlideShapeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlideShape", "password", request.getPassword());
            ShapeResponse response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlideShape");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeRequest request = createGetSlideShapeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlideShape", "folder", request.getFolder());
            ShapeResponse response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlideShape");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeRequest request = createGetSlideShapeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlideShape", "storage", request.getStorage());
            ShapeResponse response = api.getSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlideShape");
        }
    }

    private GetSlideShapeRequest createGetSlideShapeRequest() {
        GetSlideShapeRequest request = new GetSlideShapeRequest();
        request.setName((String)getTestValue("getSlideShape", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlideShape", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("getSlideShape", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("getSlideShape", "shapeIndex", "Integer"));
        request.setPassword((String)getTestValue("getSlideShape", "password", "String"));
        request.setFolder((String)getTestValue("getSlideShape", "folder", "String"));
        request.setStorage((String)getTestValue("getSlideShape", "storage", "String"));
        return request;
    }
    
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsTest() throws ApiException, Exception {
        initialize("getSlideShapeParagraphs", null, null);
        Boolean needAssertResponse = false;
        ParagraphListResponse response = null;;
        try {
            GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
            response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlideShapeParagraphs", "name", request.getName());
            ParagraphListResponse response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlideShapeParagraphs");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlideShapeParagraphs", "slideIndex", request.getSlideIndex());
            ParagraphListResponse response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlideShapeParagraphs");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("getSlideShapeParagraphs", "path", request.getPath());
            ParagraphListResponse response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("path", "getSlideShapeParagraphs");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("getSlideShapeParagraphs", "shapeIndex", request.getShapeIndex());
            ParagraphListResponse response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getSlideShapeParagraphs");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlideShapeParagraphs", "password", request.getPassword());
            ParagraphListResponse response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlideShapeParagraphs");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlideShapeParagraphs", "folder", request.getFolder());
            ParagraphListResponse response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlideShapeParagraphs");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapeParagraphsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapeParagraphsRequest request = createGetSlideShapeParagraphsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlideShapeParagraphs", "storage", request.getStorage());
            ParagraphListResponse response = api.getSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlideShapeParagraphs");
        }
    }

    private GetSlideShapeParagraphsRequest createGetSlideShapeParagraphsRequest() {
        GetSlideShapeParagraphsRequest request = new GetSlideShapeParagraphsRequest();
        request.setName((String)getTestValue("getSlideShapeParagraphs", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlideShapeParagraphs", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("getSlideShapeParagraphs", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("getSlideShapeParagraphs", "shapeIndex", "Integer"));
        request.setPassword((String)getTestValue("getSlideShapeParagraphs", "password", "String"));
        request.setFolder((String)getTestValue("getSlideShapeParagraphs", "folder", "String"));
        request.setStorage((String)getTestValue("getSlideShapeParagraphs", "storage", "String"));
        return request;
    }
    
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesTest() throws ApiException, Exception {
        initialize("getSlideShapes", null, null);
        Boolean needAssertResponse = false;
        ShapeListResponse response = null;;
        try {
            GetSlideShapesRequest request = createGetSlideShapesRequest();
            response = api.getSlideShapes(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getSlideShapes");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapesRequest request = createGetSlideShapesRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getSlideShapes", "name", request.getName());
            ShapeListResponse response = api.getSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("name", "getSlideShapes");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapesRequest request = createGetSlideShapesRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getSlideShapes", "slideIndex", request.getSlideIndex());
            ShapeListResponse response = api.getSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getSlideShapes");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapesRequest request = createGetSlideShapesRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("getSlideShapes", "path", request.getPath());
            ShapeListResponse response = api.getSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("path", "getSlideShapes");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapesRequest request = createGetSlideShapesRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getSlideShapes", "password", request.getPassword());
            ShapeListResponse response = api.getSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("password", "getSlideShapes");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapesRequest request = createGetSlideShapesRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getSlideShapes", "folder", request.getFolder());
            ShapeListResponse response = api.getSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getSlideShapes");
        }
    }
    /**
     * Read slide shapes or shape info.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSlideShapesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetSlideShapesRequest request = createGetSlideShapesRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getSlideShapes", "storage", request.getStorage());
            ShapeListResponse response = api.getSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getSlideShapes");
        }
    }

    private GetSlideShapesRequest createGetSlideShapesRequest() {
        GetSlideShapesRequest request = new GetSlideShapesRequest();
        request.setName((String)getTestValue("getSlideShapes", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getSlideShapes", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("getSlideShapes", "path", "String"));
        request.setPassword((String)getTestValue("getSlideShapes", "password", "String"));
        request.setFolder((String)getTestValue("getSlideShapes", "folder", "String"));
        request.setStorage((String)getTestValue("getSlideShapes", "storage", "String"));
        return request;
    }
    
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphTest() throws ApiException, Exception {
        initialize("postAddNewParagraph", null, null);
        Boolean needAssertResponse = false;
        ParagraphResponse response = null;;
        try {
            PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
            response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postAddNewParagraph");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postAddNewParagraph", "name", request.getName());
            ParagraphResponse response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("name", "postAddNewParagraph");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("postAddNewParagraph", "slideIndex", request.getSlideIndex());
            ParagraphResponse response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postAddNewParagraph");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("postAddNewParagraph", "path", request.getPath());
            ParagraphResponse response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("path", "postAddNewParagraph");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("postAddNewParagraph", "shapeIndex", request.getShapeIndex());
            ParagraphResponse response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "postAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "postAddNewParagraph");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
            request.setDto((Paragraph)invalidizeTestValue(request.getDto(), "dto", "Paragraph"));
            initialize("postAddNewParagraph", "dto", request.getDto());
            ParagraphResponse response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("dto", "postAddNewParagraph");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postAddNewParagraph", "password", request.getPassword());
            ParagraphResponse response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("password", "postAddNewParagraph");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postAddNewParagraph", "folder", request.getFolder());
            ParagraphResponse response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postAddNewParagraph");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postAddNewParagraph", "storage", request.getStorage());
            ParagraphResponse response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postAddNewParagraph");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewParagraphInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewParagraphRequest request = createPostAddNewParagraphRequest();
            request.setPosition((Integer)invalidizeTestValue(request.getPosition(), "position", "Integer"));
            initialize("postAddNewParagraph", "position", request.getPosition());
            ParagraphResponse response = api.postAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("position", "postAddNewParagraph");
        }
    }

    private PostAddNewParagraphRequest createPostAddNewParagraphRequest() {
        PostAddNewParagraphRequest request = new PostAddNewParagraphRequest();
        request.setName((String)getTestValue("postAddNewParagraph", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("postAddNewParagraph", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("postAddNewParagraph", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("postAddNewParagraph", "shapeIndex", "Integer"));
        request.setDto((Paragraph)getTestValue("postAddNewParagraph", "dto", "Paragraph"));
        request.setPassword((String)getTestValue("postAddNewParagraph", "password", "String"));
        request.setFolder((String)getTestValue("postAddNewParagraph", "folder", "String"));
        request.setStorage((String)getTestValue("postAddNewParagraph", "storage", "String"));
        request.setPosition((Integer)getTestValue("postAddNewParagraph", "position", "Integer"));
        return request;
    }
    
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionTest() throws ApiException, Exception {
        initialize("postAddNewPortion", null, null);
        Boolean needAssertResponse = false;
        PortionResponse response = null;;
        try {
            PostAddNewPortionRequest request = createPostAddNewPortionRequest();
            response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postAddNewPortion");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewPortionRequest request = createPostAddNewPortionRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postAddNewPortion", "name", request.getName());
            PortionResponse response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("name", "postAddNewPortion");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewPortionRequest request = createPostAddNewPortionRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("postAddNewPortion", "slideIndex", request.getSlideIndex());
            PortionResponse response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postAddNewPortion");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewPortionRequest request = createPostAddNewPortionRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("postAddNewPortion", "path", request.getPath());
            PortionResponse response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("path", "postAddNewPortion");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewPortionRequest request = createPostAddNewPortionRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("postAddNewPortion", "shapeIndex", request.getShapeIndex());
            PortionResponse response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "postAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "postAddNewPortion");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewPortionRequest request = createPostAddNewPortionRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("postAddNewPortion", "paragraphIndex", request.getParagraphIndex());
            PortionResponse response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "postAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "postAddNewPortion");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewPortionRequest request = createPostAddNewPortionRequest();
            request.setDto((Portion)invalidizeTestValue(request.getDto(), "dto", "Portion"));
            initialize("postAddNewPortion", "dto", request.getDto());
            PortionResponse response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("dto", "postAddNewPortion");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewPortionRequest request = createPostAddNewPortionRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postAddNewPortion", "password", request.getPassword());
            PortionResponse response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("password", "postAddNewPortion");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewPortionRequest request = createPostAddNewPortionRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postAddNewPortion", "folder", request.getFolder());
            PortionResponse response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postAddNewPortion");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewPortionRequest request = createPostAddNewPortionRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postAddNewPortion", "storage", request.getStorage());
            PortionResponse response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postAddNewPortion");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewPortionInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewPortionRequest request = createPostAddNewPortionRequest();
            request.setPosition((Integer)invalidizeTestValue(request.getPosition(), "position", "Integer"));
            initialize("postAddNewPortion", "position", request.getPosition());
            PortionResponse response = api.postAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("position", "postAddNewPortion");
        }
    }

    private PostAddNewPortionRequest createPostAddNewPortionRequest() {
        PostAddNewPortionRequest request = new PostAddNewPortionRequest();
        request.setName((String)getTestValue("postAddNewPortion", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("postAddNewPortion", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("postAddNewPortion", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("postAddNewPortion", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("postAddNewPortion", "paragraphIndex", "Integer"));
        request.setDto((Portion)getTestValue("postAddNewPortion", "dto", "Portion"));
        request.setPassword((String)getTestValue("postAddNewPortion", "password", "String"));
        request.setFolder((String)getTestValue("postAddNewPortion", "folder", "String"));
        request.setStorage((String)getTestValue("postAddNewPortion", "storage", "String"));
        request.setPosition((Integer)getTestValue("postAddNewPortion", "position", "Integer"));
        return request;
    }
    
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeTest() throws ApiException, Exception {
        initialize("postAddNewShape", null, null);
        Boolean needAssertResponse = false;
        ShapeResponse response = null;;
        try {
            PostAddNewShapeRequest request = createPostAddNewShapeRequest();
            response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postAddNewShape");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewShapeRequest request = createPostAddNewShapeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postAddNewShape", "name", request.getName());
            ShapeResponse response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("name", "postAddNewShape");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewShapeRequest request = createPostAddNewShapeRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("postAddNewShape", "slideIndex", request.getSlideIndex());
            ShapeResponse response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postAddNewShape");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewShapeRequest request = createPostAddNewShapeRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("postAddNewShape", "path", request.getPath());
            ShapeResponse response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("path", "postAddNewShape");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewShapeRequest request = createPostAddNewShapeRequest();
            request.setDto((ShapeBase)invalidizeTestValue(request.getDto(), "dto", "ShapeBase"));
            initialize("postAddNewShape", "dto", request.getDto());
            ShapeResponse response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("dto", "postAddNewShape");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewShapeRequest request = createPostAddNewShapeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postAddNewShape", "password", request.getPassword());
            ShapeResponse response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("password", "postAddNewShape");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewShapeRequest request = createPostAddNewShapeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postAddNewShape", "folder", request.getFolder());
            ShapeResponse response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postAddNewShape");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewShapeRequest request = createPostAddNewShapeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postAddNewShape", "storage", request.getStorage());
            ShapeResponse response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postAddNewShape");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidShapeToCloneTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewShapeRequest request = createPostAddNewShapeRequest();
            request.setShapeToClone((Integer)invalidizeTestValue(request.getShapeToClone(), "shapeToClone", "Integer"));
            initialize("postAddNewShape", "shapeToClone", request.getShapeToClone());
            ShapeResponse response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeToClone", "postAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("shapeToClone", "postAddNewShape");
        }
    }
    /**
     * Creates new shape.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAddNewShapeInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostAddNewShapeRequest request = createPostAddNewShapeRequest();
            request.setPosition((Integer)invalidizeTestValue(request.getPosition(), "position", "Integer"));
            initialize("postAddNewShape", "position", request.getPosition());
            ShapeResponse response = api.postAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("position", "postAddNewShape");
        }
    }

    private PostAddNewShapeRequest createPostAddNewShapeRequest() {
        PostAddNewShapeRequest request = new PostAddNewShapeRequest();
        request.setName((String)getTestValue("postAddNewShape", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("postAddNewShape", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("postAddNewShape", "path", "String"));
        request.setDto((ShapeBase)getTestValue("postAddNewShape", "dto", "ShapeBase"));
        request.setPassword((String)getTestValue("postAddNewShape", "password", "String"));
        request.setFolder((String)getTestValue("postAddNewShape", "folder", "String"));
        request.setStorage((String)getTestValue("postAddNewShape", "storage", "String"));
        request.setShapeToClone((Integer)getTestValue("postAddNewShape", "shapeToClone", "Integer"));
        request.setPosition((Integer)getTestValue("postAddNewShape", "position", "Integer"));
        return request;
    }
    
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsTest() throws ApiException, Exception {
        initialize("postShapeSaveAs", null, null);
        Boolean needAssertResponse = false;
        File response = null;;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertTrue(response.isFile());
        }
    }

    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postShapeSaveAs", "name", request.getName());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("name", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("postShapeSaveAs", "slideIndex", request.getSlideIndex());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("postShapeSaveAs", "shapeIndex", request.getShapeIndex());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            request.setFormat((ShapeExportFormat)invalidizeTestValue(request.getFormat(), "format", "ShapeExportFormat"));
            initialize("postShapeSaveAs", "format", request.getFormat());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("format", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            request.setOptions((IShapeExportOptions)invalidizeTestValue(request.getOptions(), "options", "IShapeExportOptions"));
            initialize("postShapeSaveAs", "options", request.getOptions());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("options", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postShapeSaveAs", "password", request.getPassword());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("password", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postShapeSaveAs", "folder", request.getFolder());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postShapeSaveAs", "storage", request.getStorage());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidScaleXTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            request.setScaleX((Double)invalidizeTestValue(request.getScaleX(), "scaleX", "Double"));
            initialize("postShapeSaveAs", "scaleX", request.getScaleX());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleX", "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("scaleX", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidScaleYTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            request.setScaleY((Double)invalidizeTestValue(request.getScaleY(), "scaleY", "Double"));
            initialize("postShapeSaveAs", "scaleY", request.getScaleY());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleY", "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("scaleY", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidBoundsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            request.setBounds((String)invalidizeTestValue(request.getBounds(), "bounds", "String"));
            initialize("postShapeSaveAs", "bounds", request.getBounds());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "bounds", "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("bounds", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            request.setOutPath((String)invalidizeTestValue(request.getOutPath(), "outPath", "String"));
            initialize("postShapeSaveAs", "outPath", request.getOutPath());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("outPath", "postShapeSaveAs");
        }
    }
    /**
     * Render shape to specified picture format.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postShapeSaveAsInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostShapeSaveAsRequest request = createPostShapeSaveAsRequest();
            request.setFontsFolder((String)invalidizeTestValue(request.getFontsFolder(), "fontsFolder", "String"));
            initialize("postShapeSaveAs", "fontsFolder", request.getFontsFolder());
            File response = api.postShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "postShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "postShapeSaveAs");
        }
    }

    private PostShapeSaveAsRequest createPostShapeSaveAsRequest() {
        PostShapeSaveAsRequest request = new PostShapeSaveAsRequest();
        request.setName((String)getTestValue("postShapeSaveAs", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("postShapeSaveAs", "slideIndex", "Integer"));
        request.setShapeIndex((Integer)getTestValue("postShapeSaveAs", "shapeIndex", "Integer"));
        request.setFormat((ShapeExportFormat)getTestValue("postShapeSaveAs", "format", "ShapeExportFormat"));
        request.setOptions((IShapeExportOptions)getTestValue("postShapeSaveAs", "options", "IShapeExportOptions"));
        request.setPassword((String)getTestValue("postShapeSaveAs", "password", "String"));
        request.setFolder((String)getTestValue("postShapeSaveAs", "folder", "String"));
        request.setStorage((String)getTestValue("postShapeSaveAs", "storage", "String"));
        request.setScaleX((Double)getTestValue("postShapeSaveAs", "scaleX", "Double"));
        request.setScaleY((Double)getTestValue("postShapeSaveAs", "scaleY", "Double"));
        request.setBounds((String)getTestValue("postShapeSaveAs", "bounds", "String"));
        request.setOutPath((String)getTestValue("postShapeSaveAs", "outPath", "String"));
        request.setFontsFolder((String)getTestValue("postShapeSaveAs", "fontsFolder", "String"));
        return request;
    }
    
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesTest() throws ApiException, Exception {
        initialize("putSetParagraphPortionProperties", null, null);
        Boolean needAssertResponse = false;
        PortionResponse response = null;;
        try {
            PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
            response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putSetParagraphPortionProperties");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putSetParagraphPortionProperties", "name", request.getName());
            PortionResponse response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSetParagraphPortionProperties");
        }
        if (needAssertResponse) {
            assertResponse("name", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("putSetParagraphPortionProperties", "slideIndex", request.getSlideIndex());
            PortionResponse response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSetParagraphPortionProperties");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("putSetParagraphPortionProperties", "path", request.getPath());
            PortionResponse response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putSetParagraphPortionProperties");
        }
        if (needAssertResponse) {
            assertResponse("path", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("putSetParagraphPortionProperties", "shapeIndex", request.getShapeIndex());
            PortionResponse response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putSetParagraphPortionProperties");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("putSetParagraphPortionProperties", "paragraphIndex", request.getParagraphIndex());
            PortionResponse response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "putSetParagraphPortionProperties");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidPortionIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
            request.setPortionIndex((Integer)invalidizeTestValue(request.getPortionIndex(), "portionIndex", "Integer"));
            initialize("putSetParagraphPortionProperties", "portionIndex", request.getPortionIndex());
            PortionResponse response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portionIndex", "putSetParagraphPortionProperties");
        }
        if (needAssertResponse) {
            assertResponse("portionIndex", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
            request.setDto((Portion)invalidizeTestValue(request.getDto(), "dto", "Portion"));
            initialize("putSetParagraphPortionProperties", "dto", request.getDto());
            PortionResponse response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putSetParagraphPortionProperties");
        }
        if (needAssertResponse) {
            assertResponse("dto", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putSetParagraphPortionProperties", "password", request.getPassword());
            PortionResponse response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSetParagraphPortionProperties");
        }
        if (needAssertResponse) {
            assertResponse("password", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putSetParagraphPortionProperties", "folder", request.getFolder());
            PortionResponse response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSetParagraphPortionProperties");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSetParagraphPortionProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPortionPropertiesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPortionPropertiesRequest request = createPutSetParagraphPortionPropertiesRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putSetParagraphPortionProperties", "storage", request.getStorage());
            PortionResponse response = api.putSetParagraphPortionProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSetParagraphPortionProperties");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSetParagraphPortionProperties");
        }
    }

    private PutSetParagraphPortionPropertiesRequest createPutSetParagraphPortionPropertiesRequest() {
        PutSetParagraphPortionPropertiesRequest request = new PutSetParagraphPortionPropertiesRequest();
        request.setName((String)getTestValue("putSetParagraphPortionProperties", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("putSetParagraphPortionProperties", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("putSetParagraphPortionProperties", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("putSetParagraphPortionProperties", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("putSetParagraphPortionProperties", "paragraphIndex", "Integer"));
        request.setPortionIndex((Integer)getTestValue("putSetParagraphPortionProperties", "portionIndex", "Integer"));
        request.setDto((Portion)getTestValue("putSetParagraphPortionProperties", "dto", "Portion"));
        request.setPassword((String)getTestValue("putSetParagraphPortionProperties", "password", "String"));
        request.setFolder((String)getTestValue("putSetParagraphPortionProperties", "folder", "String"));
        request.setStorage((String)getTestValue("putSetParagraphPortionProperties", "storage", "String"));
        return request;
    }
    
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesTest() throws ApiException, Exception {
        initialize("putSetParagraphProperties", null, null);
        Boolean needAssertResponse = false;
        ParagraphResponse response = null;;
        try {
            PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
            response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putSetParagraphProperties");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putSetParagraphProperties", "name", request.getName());
            ParagraphResponse response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSetParagraphProperties");
        }
        if (needAssertResponse) {
            assertResponse("name", "putSetParagraphProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("putSetParagraphProperties", "slideIndex", request.getSlideIndex());
            ParagraphResponse response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSetParagraphProperties");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSetParagraphProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("putSetParagraphProperties", "path", request.getPath());
            ParagraphResponse response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putSetParagraphProperties");
        }
        if (needAssertResponse) {
            assertResponse("path", "putSetParagraphProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("putSetParagraphProperties", "shapeIndex", request.getShapeIndex());
            ParagraphResponse response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putSetParagraphProperties");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putSetParagraphProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("putSetParagraphProperties", "paragraphIndex", request.getParagraphIndex());
            ParagraphResponse response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "putSetParagraphProperties");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "putSetParagraphProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
            request.setDto((Paragraph)invalidizeTestValue(request.getDto(), "dto", "Paragraph"));
            initialize("putSetParagraphProperties", "dto", request.getDto());
            ParagraphResponse response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putSetParagraphProperties");
        }
        if (needAssertResponse) {
            assertResponse("dto", "putSetParagraphProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putSetParagraphProperties", "password", request.getPassword());
            ParagraphResponse response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSetParagraphProperties");
        }
        if (needAssertResponse) {
            assertResponse("password", "putSetParagraphProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putSetParagraphProperties", "folder", request.getFolder());
            ParagraphResponse response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSetParagraphProperties");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSetParagraphProperties");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSetParagraphPropertiesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSetParagraphPropertiesRequest request = createPutSetParagraphPropertiesRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putSetParagraphProperties", "storage", request.getStorage());
            ParagraphResponse response = api.putSetParagraphProperties(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSetParagraphProperties");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSetParagraphProperties");
        }
    }

    private PutSetParagraphPropertiesRequest createPutSetParagraphPropertiesRequest() {
        PutSetParagraphPropertiesRequest request = new PutSetParagraphPropertiesRequest();
        request.setName((String)getTestValue("putSetParagraphProperties", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("putSetParagraphProperties", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("putSetParagraphProperties", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("putSetParagraphProperties", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("putSetParagraphProperties", "paragraphIndex", "Integer"));
        request.setDto((Paragraph)getTestValue("putSetParagraphProperties", "dto", "Paragraph"));
        request.setPassword((String)getTestValue("putSetParagraphProperties", "password", "String"));
        request.setFolder((String)getTestValue("putSetParagraphProperties", "folder", "String"));
        request.setStorage((String)getTestValue("putSetParagraphProperties", "storage", "String"));
        return request;
    }
    
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoTest() throws ApiException, Exception {
        initialize("putSlideShapeInfo", null, null);
        Boolean needAssertResponse = false;
        ShapeResponse response = null;;
        try {
            PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
            response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putSlideShapeInfo");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(200), equalTo(201)));
        }
    }

    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putSlideShapeInfo", "name", request.getName());
            ShapeResponse response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putSlideShapeInfo");
        }
        if (needAssertResponse) {
            assertResponse("name", "putSlideShapeInfo");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("putSlideShapeInfo", "slideIndex", request.getSlideIndex());
            ShapeResponse response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putSlideShapeInfo");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putSlideShapeInfo");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("putSlideShapeInfo", "path", request.getPath());
            ShapeResponse response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putSlideShapeInfo");
        }
        if (needAssertResponse) {
            assertResponse("path", "putSlideShapeInfo");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("putSlideShapeInfo", "shapeIndex", request.getShapeIndex());
            ShapeResponse response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putSlideShapeInfo");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putSlideShapeInfo");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
            request.setDto((ShapeBase)invalidizeTestValue(request.getDto(), "dto", "ShapeBase"));
            initialize("putSlideShapeInfo", "dto", request.getDto());
            ShapeResponse response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putSlideShapeInfo");
        }
        if (needAssertResponse) {
            assertResponse("dto", "putSlideShapeInfo");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putSlideShapeInfo", "password", request.getPassword());
            ShapeResponse response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putSlideShapeInfo");
        }
        if (needAssertResponse) {
            assertResponse("password", "putSlideShapeInfo");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putSlideShapeInfo", "folder", request.getFolder());
            ShapeResponse response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putSlideShapeInfo");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putSlideShapeInfo");
        }
    }
    /**
     * Updates shape properties.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putSlideShapeInfoInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutSlideShapeInfoRequest request = createPutSlideShapeInfoRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putSlideShapeInfo", "storage", request.getStorage());
            ShapeResponse response = api.putSlideShapeInfo(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putSlideShapeInfo");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putSlideShapeInfo");
        }
    }

    private PutSlideShapeInfoRequest createPutSlideShapeInfoRequest() {
        PutSlideShapeInfoRequest request = new PutSlideShapeInfoRequest();
        request.setName((String)getTestValue("putSlideShapeInfo", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("putSlideShapeInfo", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("putSlideShapeInfo", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("putSlideShapeInfo", "shapeIndex", "Integer"));
        request.setDto((ShapeBase)getTestValue("putSlideShapeInfo", "dto", "ShapeBase"));
        request.setPassword((String)getTestValue("putSlideShapeInfo", "password", "String"));
        request.setFolder((String)getTestValue("putSlideShapeInfo", "folder", "String"));
        request.setStorage((String)getTestValue("putSlideShapeInfo", "storage", "String"));
        return request;
    }
    
}
