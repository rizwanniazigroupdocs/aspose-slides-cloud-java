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
import com.aspose.slidescloudsdk.model.IShapeExportOptions;
import com.aspose.slidescloudsdk.model.Paragraph;
import com.aspose.slidescloudsdk.model.ParagraphListResponse;
import com.aspose.slidescloudsdk.model.ParagraphResponse;
import com.aspose.slidescloudsdk.model.Portion;
import com.aspose.slidescloudsdk.model.PortionListResponse;
import com.aspose.slidescloudsdk.model.PortionResponse;
import com.aspose.slidescloudsdk.model.ShapeBase;
import com.aspose.slidescloudsdk.model.ShapeListResponse;
import com.aspose.slidescloudsdk.model.ShapeResponse;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.aspose.slidescloudsdk.model.request.DeleteNotesSlideParagraphRequest;
import com.aspose.slidescloudsdk.model.request.DeleteNotesSlideParagraphsRequest;
import com.aspose.slidescloudsdk.model.request.DeleteNotesSlidePortionRequest;
import com.aspose.slidescloudsdk.model.request.DeleteNotesSlidePortionsRequest;
import com.aspose.slidescloudsdk.model.request.DeleteNotesSlideShapeRequest;
import com.aspose.slidescloudsdk.model.request.DeleteNotesSlideShapesRequest;
import com.aspose.slidescloudsdk.model.request.GetNotesSlideShapeRequest;
import com.aspose.slidescloudsdk.model.request.GetNotesSlideShapeParagraphRequest;
import com.aspose.slidescloudsdk.model.request.GetNotesSlideShapeParagraphsRequest;
import com.aspose.slidescloudsdk.model.request.GetNotesSlideShapePortionRequest;
import com.aspose.slidescloudsdk.model.request.GetNotesSlideShapePortionsRequest;
import com.aspose.slidescloudsdk.model.request.GetNotesSlideShapeWithFormatRequest;
import com.aspose.slidescloudsdk.model.request.GetNotesSlideShapesRequest;
import com.aspose.slidescloudsdk.model.request.PostNotesSlideAddNewParagraphRequest;
import com.aspose.slidescloudsdk.model.request.PostNotesSlideAddNewPortionRequest;
import com.aspose.slidescloudsdk.model.request.PostNotesSlideAddNewShapeRequest;
import com.aspose.slidescloudsdk.model.request.PostNotesSlideShapeSaveAsRequest;
import com.aspose.slidescloudsdk.model.request.PutUpdateNotesSlideShapeRequest;
import com.aspose.slidescloudsdk.model.request.PutUpdateNotesSlideShapeParagraphRequest;
import com.aspose.slidescloudsdk.model.request.PutUpdateNotesSlideShapePortionRequest;

/**
 * API tests for NotesSlideShapesApi
 */
public class NotesSlideShapesApiTest extends ApiTest {

    private final NotesSlideShapesApi api = new NotesSlideShapesApi(getConfiguration());

    
    /**
     * Removes a shape, specified shapes or all shapes.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotesSlideParagraphTest() throws ApiException, Exception {
        initialize("deleteNotesSlideParagraph", null, null);
        Boolean needAssertResponse = false;
        ParagraphListResponse response = null;;
        try {
            DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
            response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteNotesSlideParagraph");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void deleteNotesSlideParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteNotesSlideParagraph", "name", request.getName());
            ParagraphListResponse response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlideParagraph");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlideParagraph");
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
    public void deleteNotesSlideParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deleteNotesSlideParagraph", "slideIndex", request.getSlideIndex());
            ParagraphListResponse response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlideParagraph");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlideParagraph");
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
    public void deleteNotesSlideParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("deleteNotesSlideParagraph", "path", request.getPath());
            ParagraphListResponse response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteNotesSlideParagraph");
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteNotesSlideParagraph");
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
    public void deleteNotesSlideParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("deleteNotesSlideParagraph", "shapeIndex", request.getShapeIndex());
            ParagraphListResponse response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteNotesSlideParagraph");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteNotesSlideParagraph");
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
    public void deleteNotesSlideParagraphInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("deleteNotesSlideParagraph", "paragraphIndex", request.getParagraphIndex());
            ParagraphListResponse response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "deleteNotesSlideParagraph");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "deleteNotesSlideParagraph");
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
    public void deleteNotesSlideParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteNotesSlideParagraph", "password", request.getPassword());
            ParagraphListResponse response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlideParagraph");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlideParagraph");
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
    public void deleteNotesSlideParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteNotesSlideParagraph", "folder", request.getFolder());
            ParagraphListResponse response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlideParagraph");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlideParagraph");
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
    public void deleteNotesSlideParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphRequest request = createDeleteNotesSlideParagraphRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteNotesSlideParagraph", "storage", request.getStorage());
            ParagraphListResponse response = api.deleteNotesSlideParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlideParagraph");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlideParagraph");
        }
    }

    private DeleteNotesSlideParagraphRequest createDeleteNotesSlideParagraphRequest() {
        DeleteNotesSlideParagraphRequest request = new DeleteNotesSlideParagraphRequest();
        request.setName((String)getTestValue("deleteNotesSlideParagraph", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deleteNotesSlideParagraph", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("deleteNotesSlideParagraph", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("deleteNotesSlideParagraph", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("deleteNotesSlideParagraph", "paragraphIndex", "Integer"));
        request.setPassword((String)getTestValue("deleteNotesSlideParagraph", "password", "String"));
        request.setFolder((String)getTestValue("deleteNotesSlideParagraph", "folder", "String"));
        request.setStorage((String)getTestValue("deleteNotesSlideParagraph", "storage", "String"));
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
    public void deleteNotesSlideParagraphsTest() throws ApiException, Exception {
        initialize("deleteNotesSlideParagraphs", null, null);
        Boolean needAssertResponse = false;
        ParagraphListResponse response = null;;
        try {
            DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
            response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteNotesSlideParagraphs");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void deleteNotesSlideParagraphsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteNotesSlideParagraphs", "name", request.getName());
            ParagraphListResponse response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlideParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlideParagraphs");
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
    public void deleteNotesSlideParagraphsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deleteNotesSlideParagraphs", "slideIndex", request.getSlideIndex());
            ParagraphListResponse response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlideParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlideParagraphs");
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
    public void deleteNotesSlideParagraphsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("deleteNotesSlideParagraphs", "path", request.getPath());
            ParagraphListResponse response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteNotesSlideParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteNotesSlideParagraphs");
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
    public void deleteNotesSlideParagraphsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("deleteNotesSlideParagraphs", "shapeIndex", request.getShapeIndex());
            ParagraphListResponse response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteNotesSlideParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteNotesSlideParagraphs");
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
    public void deleteNotesSlideParagraphsInvalidParagraphsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
            request.setParagraphs((List<Integer>)invalidizeTestValue(request.getParagraphs(), "paragraphs", "List<Integer>"));
            initialize("deleteNotesSlideParagraphs", "paragraphs", request.getParagraphs());
            ParagraphListResponse response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphs", "deleteNotesSlideParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("paragraphs", "deleteNotesSlideParagraphs");
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
    public void deleteNotesSlideParagraphsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteNotesSlideParagraphs", "password", request.getPassword());
            ParagraphListResponse response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlideParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlideParagraphs");
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
    public void deleteNotesSlideParagraphsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteNotesSlideParagraphs", "folder", request.getFolder());
            ParagraphListResponse response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlideParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlideParagraphs");
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
    public void deleteNotesSlideParagraphsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideParagraphsRequest request = createDeleteNotesSlideParagraphsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteNotesSlideParagraphs", "storage", request.getStorage());
            ParagraphListResponse response = api.deleteNotesSlideParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlideParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlideParagraphs");
        }
    }

    private DeleteNotesSlideParagraphsRequest createDeleteNotesSlideParagraphsRequest() {
        DeleteNotesSlideParagraphsRequest request = new DeleteNotesSlideParagraphsRequest();
        request.setName((String)getTestValue("deleteNotesSlideParagraphs", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deleteNotesSlideParagraphs", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("deleteNotesSlideParagraphs", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("deleteNotesSlideParagraphs", "shapeIndex", "Integer"));
        request.setParagraphs((List<Integer>)getTestValue("deleteNotesSlideParagraphs", "paragraphs", "List<Integer>"));
        request.setPassword((String)getTestValue("deleteNotesSlideParagraphs", "password", "String"));
        request.setFolder((String)getTestValue("deleteNotesSlideParagraphs", "folder", "String"));
        request.setStorage((String)getTestValue("deleteNotesSlideParagraphs", "storage", "String"));
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
    public void deleteNotesSlidePortionTest() throws ApiException, Exception {
        initialize("deleteNotesSlidePortion", null, null);
        Boolean needAssertResponse = false;
        PortionListResponse response = null;;
        try {
            DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
            response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteNotesSlidePortion");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void deleteNotesSlidePortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteNotesSlidePortion", "name", request.getName());
            PortionListResponse response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlidePortion");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlidePortion");
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
    public void deleteNotesSlidePortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deleteNotesSlidePortion", "slideIndex", request.getSlideIndex());
            PortionListResponse response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlidePortion");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlidePortion");
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
    public void deleteNotesSlidePortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("deleteNotesSlidePortion", "path", request.getPath());
            PortionListResponse response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteNotesSlidePortion");
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteNotesSlidePortion");
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
    public void deleteNotesSlidePortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("deleteNotesSlidePortion", "shapeIndex", request.getShapeIndex());
            PortionListResponse response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteNotesSlidePortion");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteNotesSlidePortion");
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
    public void deleteNotesSlidePortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("deleteNotesSlidePortion", "paragraphIndex", request.getParagraphIndex());
            PortionListResponse response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "deleteNotesSlidePortion");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "deleteNotesSlidePortion");
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
    public void deleteNotesSlidePortionInvalidPortionIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
            request.setPortionIndex((Integer)invalidizeTestValue(request.getPortionIndex(), "portionIndex", "Integer"));
            initialize("deleteNotesSlidePortion", "portionIndex", request.getPortionIndex());
            PortionListResponse response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portionIndex", "deleteNotesSlidePortion");
        }
        if (needAssertResponse) {
            assertResponse("portionIndex", "deleteNotesSlidePortion");
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
    public void deleteNotesSlidePortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteNotesSlidePortion", "password", request.getPassword());
            PortionListResponse response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlidePortion");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlidePortion");
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
    public void deleteNotesSlidePortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteNotesSlidePortion", "folder", request.getFolder());
            PortionListResponse response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlidePortion");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlidePortion");
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
    public void deleteNotesSlidePortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionRequest request = createDeleteNotesSlidePortionRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteNotesSlidePortion", "storage", request.getStorage());
            PortionListResponse response = api.deleteNotesSlidePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlidePortion");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlidePortion");
        }
    }

    private DeleteNotesSlidePortionRequest createDeleteNotesSlidePortionRequest() {
        DeleteNotesSlidePortionRequest request = new DeleteNotesSlidePortionRequest();
        request.setName((String)getTestValue("deleteNotesSlidePortion", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deleteNotesSlidePortion", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("deleteNotesSlidePortion", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("deleteNotesSlidePortion", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("deleteNotesSlidePortion", "paragraphIndex", "Integer"));
        request.setPortionIndex((Integer)getTestValue("deleteNotesSlidePortion", "portionIndex", "Integer"));
        request.setPassword((String)getTestValue("deleteNotesSlidePortion", "password", "String"));
        request.setFolder((String)getTestValue("deleteNotesSlidePortion", "folder", "String"));
        request.setStorage((String)getTestValue("deleteNotesSlidePortion", "storage", "String"));
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
    public void deleteNotesSlidePortionsTest() throws ApiException, Exception {
        initialize("deleteNotesSlidePortions", null, null);
        Boolean needAssertResponse = false;
        PortionListResponse response = null;;
        try {
            DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
            response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteNotesSlidePortions");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void deleteNotesSlidePortionsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteNotesSlidePortions", "name", request.getName());
            PortionListResponse response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlidePortions");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlidePortions");
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
    public void deleteNotesSlidePortionsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deleteNotesSlidePortions", "slideIndex", request.getSlideIndex());
            PortionListResponse response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlidePortions");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlidePortions");
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
    public void deleteNotesSlidePortionsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("deleteNotesSlidePortions", "path", request.getPath());
            PortionListResponse response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteNotesSlidePortions");
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteNotesSlidePortions");
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
    public void deleteNotesSlidePortionsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("deleteNotesSlidePortions", "shapeIndex", request.getShapeIndex());
            PortionListResponse response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteNotesSlidePortions");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteNotesSlidePortions");
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
    public void deleteNotesSlidePortionsInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("deleteNotesSlidePortions", "paragraphIndex", request.getParagraphIndex());
            PortionListResponse response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "deleteNotesSlidePortions");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "deleteNotesSlidePortions");
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
    public void deleteNotesSlidePortionsInvalidPortionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
            request.setPortions((List<Integer>)invalidizeTestValue(request.getPortions(), "portions", "List<Integer>"));
            initialize("deleteNotesSlidePortions", "portions", request.getPortions());
            PortionListResponse response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portions", "deleteNotesSlidePortions");
        }
        if (needAssertResponse) {
            assertResponse("portions", "deleteNotesSlidePortions");
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
    public void deleteNotesSlidePortionsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteNotesSlidePortions", "password", request.getPassword());
            PortionListResponse response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlidePortions");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlidePortions");
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
    public void deleteNotesSlidePortionsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteNotesSlidePortions", "folder", request.getFolder());
            PortionListResponse response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlidePortions");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlidePortions");
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
    public void deleteNotesSlidePortionsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlidePortionsRequest request = createDeleteNotesSlidePortionsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteNotesSlidePortions", "storage", request.getStorage());
            PortionListResponse response = api.deleteNotesSlidePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlidePortions");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlidePortions");
        }
    }

    private DeleteNotesSlidePortionsRequest createDeleteNotesSlidePortionsRequest() {
        DeleteNotesSlidePortionsRequest request = new DeleteNotesSlidePortionsRequest();
        request.setName((String)getTestValue("deleteNotesSlidePortions", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deleteNotesSlidePortions", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("deleteNotesSlidePortions", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("deleteNotesSlidePortions", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("deleteNotesSlidePortions", "paragraphIndex", "Integer"));
        request.setPortions((List<Integer>)getTestValue("deleteNotesSlidePortions", "portions", "List<Integer>"));
        request.setPassword((String)getTestValue("deleteNotesSlidePortions", "password", "String"));
        request.setFolder((String)getTestValue("deleteNotesSlidePortions", "folder", "String"));
        request.setStorage((String)getTestValue("deleteNotesSlidePortions", "storage", "String"));
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
    public void deleteNotesSlideShapeTest() throws ApiException, Exception {
        initialize("deleteNotesSlideShape", null, null);
        Boolean needAssertResponse = false;
        ShapeListResponse response = null;;
        try {
            DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
            response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteNotesSlideShape");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void deleteNotesSlideShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteNotesSlideShape", "name", request.getName());
            ShapeListResponse response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlideShape");
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
    public void deleteNotesSlideShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deleteNotesSlideShape", "slideIndex", request.getSlideIndex());
            ShapeListResponse response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlideShape");
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
    public void deleteNotesSlideShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("deleteNotesSlideShape", "path", request.getPath());
            ShapeListResponse response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteNotesSlideShape");
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
    public void deleteNotesSlideShapeInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("deleteNotesSlideShape", "shapeIndex", request.getShapeIndex());
            ShapeListResponse response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "deleteNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "deleteNotesSlideShape");
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
    public void deleteNotesSlideShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteNotesSlideShape", "password", request.getPassword());
            ShapeListResponse response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlideShape");
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
    public void deleteNotesSlideShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteNotesSlideShape", "folder", request.getFolder());
            ShapeListResponse response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlideShape");
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
    public void deleteNotesSlideShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapeRequest request = createDeleteNotesSlideShapeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteNotesSlideShape", "storage", request.getStorage());
            ShapeListResponse response = api.deleteNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlideShape");
        }
    }

    private DeleteNotesSlideShapeRequest createDeleteNotesSlideShapeRequest() {
        DeleteNotesSlideShapeRequest request = new DeleteNotesSlideShapeRequest();
        request.setName((String)getTestValue("deleteNotesSlideShape", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deleteNotesSlideShape", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("deleteNotesSlideShape", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("deleteNotesSlideShape", "shapeIndex", "Integer"));
        request.setPassword((String)getTestValue("deleteNotesSlideShape", "password", "String"));
        request.setFolder((String)getTestValue("deleteNotesSlideShape", "folder", "String"));
        request.setStorage((String)getTestValue("deleteNotesSlideShape", "storage", "String"));
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
    public void deleteNotesSlideShapesTest() throws ApiException, Exception {
        initialize("deleteNotesSlideShapes", null, null);
        Boolean needAssertResponse = false;
        ShapeListResponse response = null;;
        try {
            DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
            response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "deleteNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void deleteNotesSlideShapesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("deleteNotesSlideShapes", "name", request.getName());
            ShapeListResponse response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "deleteNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("name", "deleteNotesSlideShapes");
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
    public void deleteNotesSlideShapesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("deleteNotesSlideShapes", "slideIndex", request.getSlideIndex());
            ShapeListResponse response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "deleteNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "deleteNotesSlideShapes");
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
    public void deleteNotesSlideShapesInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("deleteNotesSlideShapes", "path", request.getPath());
            ShapeListResponse response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "deleteNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("path", "deleteNotesSlideShapes");
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
    public void deleteNotesSlideShapesInvalidShapesTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
            request.setShapes((List<Integer>)invalidizeTestValue(request.getShapes(), "shapes", "List<Integer>"));
            initialize("deleteNotesSlideShapes", "shapes", request.getShapes());
            ShapeListResponse response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapes", "deleteNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("shapes", "deleteNotesSlideShapes");
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
    public void deleteNotesSlideShapesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("deleteNotesSlideShapes", "password", request.getPassword());
            ShapeListResponse response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "deleteNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("password", "deleteNotesSlideShapes");
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
    public void deleteNotesSlideShapesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("deleteNotesSlideShapes", "folder", request.getFolder());
            ShapeListResponse response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "deleteNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("folder", "deleteNotesSlideShapes");
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
    public void deleteNotesSlideShapesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            DeleteNotesSlideShapesRequest request = createDeleteNotesSlideShapesRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("deleteNotesSlideShapes", "storage", request.getStorage());
            ShapeListResponse response = api.deleteNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "deleteNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("storage", "deleteNotesSlideShapes");
        }
    }

    private DeleteNotesSlideShapesRequest createDeleteNotesSlideShapesRequest() {
        DeleteNotesSlideShapesRequest request = new DeleteNotesSlideShapesRequest();
        request.setName((String)getTestValue("deleteNotesSlideShapes", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("deleteNotesSlideShapes", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("deleteNotesSlideShapes", "path", "String"));
        request.setShapes((List<Integer>)getTestValue("deleteNotesSlideShapes", "shapes", "List<Integer>"));
        request.setPassword((String)getTestValue("deleteNotesSlideShapes", "password", "String"));
        request.setFolder((String)getTestValue("deleteNotesSlideShapes", "folder", "String"));
        request.setStorage((String)getTestValue("deleteNotesSlideShapes", "storage", "String"));
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
    public void getNotesSlideShapeTest() throws ApiException, Exception {
        initialize("getNotesSlideShape", null, null);
        Boolean needAssertResponse = false;
        ShapeResponse response = null;;
        try {
            GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
            response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getNotesSlideShape");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void getNotesSlideShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getNotesSlideShape", "name", request.getName());
            ShapeResponse response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideShape");
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
    public void getNotesSlideShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getNotesSlideShape", "slideIndex", request.getSlideIndex());
            ShapeResponse response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideShape");
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
    public void getNotesSlideShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("getNotesSlideShape", "path", request.getPath());
            ShapeResponse response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("path", "getNotesSlideShape");
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
    public void getNotesSlideShapeInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("getNotesSlideShape", "shapeIndex", request.getShapeIndex());
            ShapeResponse response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getNotesSlideShape");
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
    public void getNotesSlideShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getNotesSlideShape", "password", request.getPassword());
            ShapeResponse response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideShape");
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
    public void getNotesSlideShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getNotesSlideShape", "folder", request.getFolder());
            ShapeResponse response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideShape");
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
    public void getNotesSlideShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeRequest request = createGetNotesSlideShapeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getNotesSlideShape", "storage", request.getStorage());
            ShapeResponse response = api.getNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideShape");
        }
    }

    private GetNotesSlideShapeRequest createGetNotesSlideShapeRequest() {
        GetNotesSlideShapeRequest request = new GetNotesSlideShapeRequest();
        request.setName((String)getTestValue("getNotesSlideShape", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getNotesSlideShape", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("getNotesSlideShape", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("getNotesSlideShape", "shapeIndex", "Integer"));
        request.setPassword((String)getTestValue("getNotesSlideShape", "password", "String"));
        request.setFolder((String)getTestValue("getNotesSlideShape", "folder", "String"));
        request.setStorage((String)getTestValue("getNotesSlideShape", "storage", "String"));
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
    public void getNotesSlideShapeParagraphTest() throws ApiException, Exception {
        initialize("getNotesSlideShapeParagraph", null, null);
        Boolean needAssertResponse = false;
        ParagraphResponse response = null;;
        try {
            GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
            response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void getNotesSlideShapeParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getNotesSlideShapeParagraph", "name", request.getName());
            ParagraphResponse response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideShapeParagraph");
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
    public void getNotesSlideShapeParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getNotesSlideShapeParagraph", "slideIndex", request.getSlideIndex());
            ParagraphResponse response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideShapeParagraph");
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
    public void getNotesSlideShapeParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("getNotesSlideShapeParagraph", "path", request.getPath());
            ParagraphResponse response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("path", "getNotesSlideShapeParagraph");
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
    public void getNotesSlideShapeParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("getNotesSlideShapeParagraph", "shapeIndex", request.getShapeIndex());
            ParagraphResponse response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getNotesSlideShapeParagraph");
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
    public void getNotesSlideShapeParagraphInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("getNotesSlideShapeParagraph", "paragraphIndex", request.getParagraphIndex());
            ParagraphResponse response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "getNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "getNotesSlideShapeParagraph");
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
    public void getNotesSlideShapeParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getNotesSlideShapeParagraph", "password", request.getPassword());
            ParagraphResponse response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideShapeParagraph");
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
    public void getNotesSlideShapeParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getNotesSlideShapeParagraph", "folder", request.getFolder());
            ParagraphResponse response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideShapeParagraph");
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
    public void getNotesSlideShapeParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphRequest request = createGetNotesSlideShapeParagraphRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getNotesSlideShapeParagraph", "storage", request.getStorage());
            ParagraphResponse response = api.getNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideShapeParagraph");
        }
    }

    private GetNotesSlideShapeParagraphRequest createGetNotesSlideShapeParagraphRequest() {
        GetNotesSlideShapeParagraphRequest request = new GetNotesSlideShapeParagraphRequest();
        request.setName((String)getTestValue("getNotesSlideShapeParagraph", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getNotesSlideShapeParagraph", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("getNotesSlideShapeParagraph", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("getNotesSlideShapeParagraph", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("getNotesSlideShapeParagraph", "paragraphIndex", "Integer"));
        request.setPassword((String)getTestValue("getNotesSlideShapeParagraph", "password", "String"));
        request.setFolder((String)getTestValue("getNotesSlideShapeParagraph", "folder", "String"));
        request.setStorage((String)getTestValue("getNotesSlideShapeParagraph", "storage", "String"));
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
    public void getNotesSlideShapeParagraphsTest() throws ApiException, Exception {
        initialize("getNotesSlideShapeParagraphs", null, null);
        Boolean needAssertResponse = false;
        ParagraphListResponse response = null;;
        try {
            GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
            response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getNotesSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void getNotesSlideShapeParagraphsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getNotesSlideShapeParagraphs", "name", request.getName());
            ParagraphListResponse response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideShapeParagraphs");
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
    public void getNotesSlideShapeParagraphsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getNotesSlideShapeParagraphs", "slideIndex", request.getSlideIndex());
            ParagraphListResponse response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideShapeParagraphs");
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
    public void getNotesSlideShapeParagraphsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("getNotesSlideShapeParagraphs", "path", request.getPath());
            ParagraphListResponse response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getNotesSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("path", "getNotesSlideShapeParagraphs");
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
    public void getNotesSlideShapeParagraphsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("getNotesSlideShapeParagraphs", "shapeIndex", request.getShapeIndex());
            ParagraphListResponse response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getNotesSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getNotesSlideShapeParagraphs");
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
    public void getNotesSlideShapeParagraphsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getNotesSlideShapeParagraphs", "password", request.getPassword());
            ParagraphListResponse response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideShapeParagraphs");
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
    public void getNotesSlideShapeParagraphsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getNotesSlideShapeParagraphs", "folder", request.getFolder());
            ParagraphListResponse response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideShapeParagraphs");
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
    public void getNotesSlideShapeParagraphsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeParagraphsRequest request = createGetNotesSlideShapeParagraphsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getNotesSlideShapeParagraphs", "storage", request.getStorage());
            ParagraphListResponse response = api.getNotesSlideShapeParagraphs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideShapeParagraphs");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideShapeParagraphs");
        }
    }

    private GetNotesSlideShapeParagraphsRequest createGetNotesSlideShapeParagraphsRequest() {
        GetNotesSlideShapeParagraphsRequest request = new GetNotesSlideShapeParagraphsRequest();
        request.setName((String)getTestValue("getNotesSlideShapeParagraphs", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getNotesSlideShapeParagraphs", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("getNotesSlideShapeParagraphs", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("getNotesSlideShapeParagraphs", "shapeIndex", "Integer"));
        request.setPassword((String)getTestValue("getNotesSlideShapeParagraphs", "password", "String"));
        request.setFolder((String)getTestValue("getNotesSlideShapeParagraphs", "folder", "String"));
        request.setStorage((String)getTestValue("getNotesSlideShapeParagraphs", "storage", "String"));
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
    public void getNotesSlideShapePortionTest() throws ApiException, Exception {
        initialize("getNotesSlideShapePortion", null, null);
        Boolean needAssertResponse = false;
        PortionResponse response = null;;
        try {
            GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
            response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void getNotesSlideShapePortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getNotesSlideShapePortion", "name", request.getName());
            PortionResponse response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideShapePortion");
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
    public void getNotesSlideShapePortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getNotesSlideShapePortion", "slideIndex", request.getSlideIndex());
            PortionResponse response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideShapePortion");
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
    public void getNotesSlideShapePortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("getNotesSlideShapePortion", "path", request.getPath());
            PortionResponse response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("path", "getNotesSlideShapePortion");
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
    public void getNotesSlideShapePortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("getNotesSlideShapePortion", "shapeIndex", request.getShapeIndex());
            PortionResponse response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getNotesSlideShapePortion");
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
    public void getNotesSlideShapePortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("getNotesSlideShapePortion", "paragraphIndex", request.getParagraphIndex());
            PortionResponse response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "getNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "getNotesSlideShapePortion");
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
    public void getNotesSlideShapePortionInvalidPortionIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
            request.setPortionIndex((Integer)invalidizeTestValue(request.getPortionIndex(), "portionIndex", "Integer"));
            initialize("getNotesSlideShapePortion", "portionIndex", request.getPortionIndex());
            PortionResponse response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portionIndex", "getNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("portionIndex", "getNotesSlideShapePortion");
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
    public void getNotesSlideShapePortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getNotesSlideShapePortion", "password", request.getPassword());
            PortionResponse response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideShapePortion");
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
    public void getNotesSlideShapePortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getNotesSlideShapePortion", "folder", request.getFolder());
            PortionResponse response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideShapePortion");
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
    public void getNotesSlideShapePortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionRequest request = createGetNotesSlideShapePortionRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getNotesSlideShapePortion", "storage", request.getStorage());
            PortionResponse response = api.getNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideShapePortion");
        }
    }

    private GetNotesSlideShapePortionRequest createGetNotesSlideShapePortionRequest() {
        GetNotesSlideShapePortionRequest request = new GetNotesSlideShapePortionRequest();
        request.setName((String)getTestValue("getNotesSlideShapePortion", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getNotesSlideShapePortion", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("getNotesSlideShapePortion", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("getNotesSlideShapePortion", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("getNotesSlideShapePortion", "paragraphIndex", "Integer"));
        request.setPortionIndex((Integer)getTestValue("getNotesSlideShapePortion", "portionIndex", "Integer"));
        request.setPassword((String)getTestValue("getNotesSlideShapePortion", "password", "String"));
        request.setFolder((String)getTestValue("getNotesSlideShapePortion", "folder", "String"));
        request.setStorage((String)getTestValue("getNotesSlideShapePortion", "storage", "String"));
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
    public void getNotesSlideShapePortionsTest() throws ApiException, Exception {
        initialize("getNotesSlideShapePortions", null, null);
        Boolean needAssertResponse = false;
        PortionListResponse response = null;;
        try {
            GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
            response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getNotesSlideShapePortions");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void getNotesSlideShapePortionsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getNotesSlideShapePortions", "name", request.getName());
            PortionListResponse response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideShapePortions");
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideShapePortions");
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
    public void getNotesSlideShapePortionsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getNotesSlideShapePortions", "slideIndex", request.getSlideIndex());
            PortionListResponse response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideShapePortions");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideShapePortions");
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
    public void getNotesSlideShapePortionsInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("getNotesSlideShapePortions", "path", request.getPath());
            PortionListResponse response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getNotesSlideShapePortions");
        }
        if (needAssertResponse) {
            assertResponse("path", "getNotesSlideShapePortions");
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
    public void getNotesSlideShapePortionsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("getNotesSlideShapePortions", "shapeIndex", request.getShapeIndex());
            PortionListResponse response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getNotesSlideShapePortions");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getNotesSlideShapePortions");
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
    public void getNotesSlideShapePortionsInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("getNotesSlideShapePortions", "paragraphIndex", request.getParagraphIndex());
            PortionListResponse response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "getNotesSlideShapePortions");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "getNotesSlideShapePortions");
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
    public void getNotesSlideShapePortionsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getNotesSlideShapePortions", "password", request.getPassword());
            PortionListResponse response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideShapePortions");
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideShapePortions");
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
    public void getNotesSlideShapePortionsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getNotesSlideShapePortions", "folder", request.getFolder());
            PortionListResponse response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideShapePortions");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideShapePortions");
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
    public void getNotesSlideShapePortionsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapePortionsRequest request = createGetNotesSlideShapePortionsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getNotesSlideShapePortions", "storage", request.getStorage());
            PortionListResponse response = api.getNotesSlideShapePortions(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideShapePortions");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideShapePortions");
        }
    }

    private GetNotesSlideShapePortionsRequest createGetNotesSlideShapePortionsRequest() {
        GetNotesSlideShapePortionsRequest request = new GetNotesSlideShapePortionsRequest();
        request.setName((String)getTestValue("getNotesSlideShapePortions", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getNotesSlideShapePortions", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("getNotesSlideShapePortions", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("getNotesSlideShapePortions", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("getNotesSlideShapePortions", "paragraphIndex", "Integer"));
        request.setPassword((String)getTestValue("getNotesSlideShapePortions", "password", "String"));
        request.setFolder((String)getTestValue("getNotesSlideShapePortions", "folder", "String"));
        request.setStorage((String)getTestValue("getNotesSlideShapePortions", "storage", "String"));
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
    public void getNotesSlideShapeWithFormatTest() throws ApiException, Exception {
        initialize("getNotesSlideShapeWithFormat", null, null);
        Boolean needAssertResponse = false;
        File response = null;;
        try {
            GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
            response = api.getNotesSlideShapeWithFormat(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getNotesSlideShapeWithFormat");
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
    public void getNotesSlideShapeWithFormatInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getNotesSlideShapeWithFormat", "name", request.getName());
            File response = api.getNotesSlideShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideShapeWithFormat");
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
    public void getNotesSlideShapeWithFormatInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getNotesSlideShapeWithFormat", "slideIndex", request.getSlideIndex());
            File response = api.getNotesSlideShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideShapeWithFormat");
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
    public void getNotesSlideShapeWithFormatInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("getNotesSlideShapeWithFormat", "shapeIndex", request.getShapeIndex());
            File response = api.getNotesSlideShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "getNotesSlideShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "getNotesSlideShapeWithFormat");
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
    public void getNotesSlideShapeWithFormatInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
            request.setFormat((ShapeExportFormat)invalidizeTestValue(request.getFormat(), "format", "ShapeExportFormat"));
            initialize("getNotesSlideShapeWithFormat", "format", request.getFormat());
            File response = api.getNotesSlideShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "getNotesSlideShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("format", "getNotesSlideShapeWithFormat");
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
    public void getNotesSlideShapeWithFormatInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getNotesSlideShapeWithFormat", "password", request.getPassword());
            File response = api.getNotesSlideShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideShapeWithFormat");
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
    public void getNotesSlideShapeWithFormatInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getNotesSlideShapeWithFormat", "folder", request.getFolder());
            File response = api.getNotesSlideShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideShapeWithFormat");
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
    public void getNotesSlideShapeWithFormatInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getNotesSlideShapeWithFormat", "storage", request.getStorage());
            File response = api.getNotesSlideShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideShapeWithFormat");
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
    public void getNotesSlideShapeWithFormatInvalidScaleXTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
            request.setScaleX((Double)invalidizeTestValue(request.getScaleX(), "scaleX", "Double"));
            initialize("getNotesSlideShapeWithFormat", "scaleX", request.getScaleX());
            File response = api.getNotesSlideShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleX", "getNotesSlideShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("scaleX", "getNotesSlideShapeWithFormat");
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
    public void getNotesSlideShapeWithFormatInvalidScaleYTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
            request.setScaleY((Double)invalidizeTestValue(request.getScaleY(), "scaleY", "Double"));
            initialize("getNotesSlideShapeWithFormat", "scaleY", request.getScaleY());
            File response = api.getNotesSlideShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleY", "getNotesSlideShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("scaleY", "getNotesSlideShapeWithFormat");
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
    public void getNotesSlideShapeWithFormatInvalidBoundsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
            request.setBounds((String)invalidizeTestValue(request.getBounds(), "bounds", "String"));
            initialize("getNotesSlideShapeWithFormat", "bounds", request.getBounds());
            File response = api.getNotesSlideShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "bounds", "getNotesSlideShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("bounds", "getNotesSlideShapeWithFormat");
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
    public void getNotesSlideShapeWithFormatInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
            request.setOutPath((String)invalidizeTestValue(request.getOutPath(), "outPath", "String"));
            initialize("getNotesSlideShapeWithFormat", "outPath", request.getOutPath());
            File response = api.getNotesSlideShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "getNotesSlideShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("outPath", "getNotesSlideShapeWithFormat");
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
    public void getNotesSlideShapeWithFormatInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapeWithFormatRequest request = createGetNotesSlideShapeWithFormatRequest();
            request.setFontsFolder((String)invalidizeTestValue(request.getFontsFolder(), "fontsFolder", "String"));
            initialize("getNotesSlideShapeWithFormat", "fontsFolder", request.getFontsFolder());
            File response = api.getNotesSlideShapeWithFormat(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "getNotesSlideShapeWithFormat");
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "getNotesSlideShapeWithFormat");
        }
    }

    private GetNotesSlideShapeWithFormatRequest createGetNotesSlideShapeWithFormatRequest() {
        GetNotesSlideShapeWithFormatRequest request = new GetNotesSlideShapeWithFormatRequest();
        request.setName((String)getTestValue("getNotesSlideShapeWithFormat", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getNotesSlideShapeWithFormat", "slideIndex", "Integer"));
        request.setShapeIndex((Integer)getTestValue("getNotesSlideShapeWithFormat", "shapeIndex", "Integer"));
        request.setFormat((ShapeExportFormat)getTestValue("getNotesSlideShapeWithFormat", "format", "ShapeExportFormat"));
        request.setPassword((String)getTestValue("getNotesSlideShapeWithFormat", "password", "String"));
        request.setFolder((String)getTestValue("getNotesSlideShapeWithFormat", "folder", "String"));
        request.setStorage((String)getTestValue("getNotesSlideShapeWithFormat", "storage", "String"));
        request.setScaleX((Double)getTestValue("getNotesSlideShapeWithFormat", "scaleX", "Double"));
        request.setScaleY((Double)getTestValue("getNotesSlideShapeWithFormat", "scaleY", "Double"));
        request.setBounds((String)getTestValue("getNotesSlideShapeWithFormat", "bounds", "String"));
        request.setOutPath((String)getTestValue("getNotesSlideShapeWithFormat", "outPath", "String"));
        request.setFontsFolder((String)getTestValue("getNotesSlideShapeWithFormat", "fontsFolder", "String"));
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
    public void getNotesSlideShapesTest() throws ApiException, Exception {
        initialize("getNotesSlideShapes", null, null);
        Boolean needAssertResponse = false;
        ShapeListResponse response = null;;
        try {
            GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
            response = api.getNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "getNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void getNotesSlideShapesInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("getNotesSlideShapes", "name", request.getName());
            ShapeListResponse response = api.getNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "getNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("name", "getNotesSlideShapes");
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
    public void getNotesSlideShapesInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("getNotesSlideShapes", "slideIndex", request.getSlideIndex());
            ShapeListResponse response = api.getNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "getNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "getNotesSlideShapes");
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
    public void getNotesSlideShapesInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("getNotesSlideShapes", "path", request.getPath());
            ShapeListResponse response = api.getNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "getNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("path", "getNotesSlideShapes");
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
    public void getNotesSlideShapesInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("getNotesSlideShapes", "password", request.getPassword());
            ShapeListResponse response = api.getNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "getNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("password", "getNotesSlideShapes");
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
    public void getNotesSlideShapesInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("getNotesSlideShapes", "folder", request.getFolder());
            ShapeListResponse response = api.getNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "getNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("folder", "getNotesSlideShapes");
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
    public void getNotesSlideShapesInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            GetNotesSlideShapesRequest request = createGetNotesSlideShapesRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("getNotesSlideShapes", "storage", request.getStorage());
            ShapeListResponse response = api.getNotesSlideShapes(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "getNotesSlideShapes");
        }
        if (needAssertResponse) {
            assertResponse("storage", "getNotesSlideShapes");
        }
    }

    private GetNotesSlideShapesRequest createGetNotesSlideShapesRequest() {
        GetNotesSlideShapesRequest request = new GetNotesSlideShapesRequest();
        request.setName((String)getTestValue("getNotesSlideShapes", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("getNotesSlideShapes", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("getNotesSlideShapes", "path", "String"));
        request.setPassword((String)getTestValue("getNotesSlideShapes", "password", "String"));
        request.setFolder((String)getTestValue("getNotesSlideShapes", "folder", "String"));
        request.setStorage((String)getTestValue("getNotesSlideShapes", "storage", "String"));
        return request;
    }
    
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphTest() throws ApiException, Exception {
        initialize("postNotesSlideAddNewParagraph", null, null);
        Boolean needAssertResponse = false;
        ParagraphResponse response = null;;
        try {
            PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
            response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postNotesSlideAddNewParagraph");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postNotesSlideAddNewParagraph", "name", request.getName());
            ParagraphResponse response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postNotesSlideAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("name", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("postNotesSlideAddNewParagraph", "slideIndex", request.getSlideIndex());
            ParagraphResponse response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postNotesSlideAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("postNotesSlideAddNewParagraph", "path", request.getPath());
            ParagraphResponse response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postNotesSlideAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("path", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("postNotesSlideAddNewParagraph", "shapeIndex", request.getShapeIndex());
            ParagraphResponse response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "postNotesSlideAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
            request.setDto((Paragraph)invalidizeTestValue(request.getDto(), "dto", "Paragraph"));
            initialize("postNotesSlideAddNewParagraph", "dto", request.getDto());
            ParagraphResponse response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postNotesSlideAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("dto", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postNotesSlideAddNewParagraph", "password", request.getPassword());
            ParagraphResponse response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postNotesSlideAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("password", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postNotesSlideAddNewParagraph", "folder", request.getFolder());
            ParagraphResponse response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postNotesSlideAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postNotesSlideAddNewParagraph", "storage", request.getStorage());
            ParagraphResponse response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postNotesSlideAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postNotesSlideAddNewParagraph");
        }
    }
    /**
     * Creates new paragraph.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewParagraphInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewParagraphRequest request = createPostNotesSlideAddNewParagraphRequest();
            request.setPosition((Integer)invalidizeTestValue(request.getPosition(), "position", "Integer"));
            initialize("postNotesSlideAddNewParagraph", "position", request.getPosition());
            ParagraphResponse response = api.postNotesSlideAddNewParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postNotesSlideAddNewParagraph");
        }
        if (needAssertResponse) {
            assertResponse("position", "postNotesSlideAddNewParagraph");
        }
    }

    private PostNotesSlideAddNewParagraphRequest createPostNotesSlideAddNewParagraphRequest() {
        PostNotesSlideAddNewParagraphRequest request = new PostNotesSlideAddNewParagraphRequest();
        request.setName((String)getTestValue("postNotesSlideAddNewParagraph", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("postNotesSlideAddNewParagraph", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("postNotesSlideAddNewParagraph", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("postNotesSlideAddNewParagraph", "shapeIndex", "Integer"));
        request.setDto((Paragraph)getTestValue("postNotesSlideAddNewParagraph", "dto", "Paragraph"));
        request.setPassword((String)getTestValue("postNotesSlideAddNewParagraph", "password", "String"));
        request.setFolder((String)getTestValue("postNotesSlideAddNewParagraph", "folder", "String"));
        request.setStorage((String)getTestValue("postNotesSlideAddNewParagraph", "storage", "String"));
        request.setPosition((Integer)getTestValue("postNotesSlideAddNewParagraph", "position", "Integer"));
        return request;
    }
    
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionTest() throws ApiException, Exception {
        initialize("postNotesSlideAddNewPortion", null, null);
        Boolean needAssertResponse = false;
        PortionResponse response = null;;
        try {
            PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
            response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postNotesSlideAddNewPortion");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
        }
    }

    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postNotesSlideAddNewPortion", "name", request.getName());
            PortionResponse response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postNotesSlideAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("name", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("postNotesSlideAddNewPortion", "slideIndex", request.getSlideIndex());
            PortionResponse response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postNotesSlideAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("postNotesSlideAddNewPortion", "path", request.getPath());
            PortionResponse response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postNotesSlideAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("path", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("postNotesSlideAddNewPortion", "shapeIndex", request.getShapeIndex());
            PortionResponse response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "postNotesSlideAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("postNotesSlideAddNewPortion", "paragraphIndex", request.getParagraphIndex());
            PortionResponse response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "postNotesSlideAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
            request.setDto((Portion)invalidizeTestValue(request.getDto(), "dto", "Portion"));
            initialize("postNotesSlideAddNewPortion", "dto", request.getDto());
            PortionResponse response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postNotesSlideAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("dto", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postNotesSlideAddNewPortion", "password", request.getPassword());
            PortionResponse response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postNotesSlideAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("password", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postNotesSlideAddNewPortion", "folder", request.getFolder());
            PortionResponse response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postNotesSlideAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postNotesSlideAddNewPortion", "storage", request.getStorage());
            PortionResponse response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postNotesSlideAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postNotesSlideAddNewPortion");
        }
    }
    /**
     * Creates new portion.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNotesSlideAddNewPortionInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewPortionRequest request = createPostNotesSlideAddNewPortionRequest();
            request.setPosition((Integer)invalidizeTestValue(request.getPosition(), "position", "Integer"));
            initialize("postNotesSlideAddNewPortion", "position", request.getPosition());
            PortionResponse response = api.postNotesSlideAddNewPortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postNotesSlideAddNewPortion");
        }
        if (needAssertResponse) {
            assertResponse("position", "postNotesSlideAddNewPortion");
        }
    }

    private PostNotesSlideAddNewPortionRequest createPostNotesSlideAddNewPortionRequest() {
        PostNotesSlideAddNewPortionRequest request = new PostNotesSlideAddNewPortionRequest();
        request.setName((String)getTestValue("postNotesSlideAddNewPortion", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("postNotesSlideAddNewPortion", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("postNotesSlideAddNewPortion", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("postNotesSlideAddNewPortion", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("postNotesSlideAddNewPortion", "paragraphIndex", "Integer"));
        request.setDto((Portion)getTestValue("postNotesSlideAddNewPortion", "dto", "Portion"));
        request.setPassword((String)getTestValue("postNotesSlideAddNewPortion", "password", "String"));
        request.setFolder((String)getTestValue("postNotesSlideAddNewPortion", "folder", "String"));
        request.setStorage((String)getTestValue("postNotesSlideAddNewPortion", "storage", "String"));
        request.setPosition((Integer)getTestValue("postNotesSlideAddNewPortion", "position", "Integer"));
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
    public void postNotesSlideAddNewShapeTest() throws ApiException, Exception {
        initialize("postNotesSlideAddNewShape", null, null);
        Boolean needAssertResponse = false;
        ShapeResponse response = null;;
        try {
            PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
            response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postNotesSlideAddNewShape");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void postNotesSlideAddNewShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postNotesSlideAddNewShape", "name", request.getName());
            ShapeResponse response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postNotesSlideAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("name", "postNotesSlideAddNewShape");
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
    public void postNotesSlideAddNewShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("postNotesSlideAddNewShape", "slideIndex", request.getSlideIndex());
            ShapeResponse response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postNotesSlideAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postNotesSlideAddNewShape");
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
    public void postNotesSlideAddNewShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("postNotesSlideAddNewShape", "path", request.getPath());
            ShapeResponse response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "postNotesSlideAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("path", "postNotesSlideAddNewShape");
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
    public void postNotesSlideAddNewShapeInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
            request.setDto((ShapeBase)invalidizeTestValue(request.getDto(), "dto", "ShapeBase"));
            initialize("postNotesSlideAddNewShape", "dto", request.getDto());
            ShapeResponse response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "postNotesSlideAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("dto", "postNotesSlideAddNewShape");
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
    public void postNotesSlideAddNewShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postNotesSlideAddNewShape", "password", request.getPassword());
            ShapeResponse response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postNotesSlideAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("password", "postNotesSlideAddNewShape");
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
    public void postNotesSlideAddNewShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postNotesSlideAddNewShape", "folder", request.getFolder());
            ShapeResponse response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postNotesSlideAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postNotesSlideAddNewShape");
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
    public void postNotesSlideAddNewShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postNotesSlideAddNewShape", "storage", request.getStorage());
            ShapeResponse response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postNotesSlideAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postNotesSlideAddNewShape");
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
    public void postNotesSlideAddNewShapeInvalidShapeToCloneTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
            request.setShapeToClone((Integer)invalidizeTestValue(request.getShapeToClone(), "shapeToClone", "Integer"));
            initialize("postNotesSlideAddNewShape", "shapeToClone", request.getShapeToClone());
            ShapeResponse response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeToClone", "postNotesSlideAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("shapeToClone", "postNotesSlideAddNewShape");
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
    public void postNotesSlideAddNewShapeInvalidPositionTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideAddNewShapeRequest request = createPostNotesSlideAddNewShapeRequest();
            request.setPosition((Integer)invalidizeTestValue(request.getPosition(), "position", "Integer"));
            initialize("postNotesSlideAddNewShape", "position", request.getPosition());
            ShapeResponse response = api.postNotesSlideAddNewShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "position", "postNotesSlideAddNewShape");
        }
        if (needAssertResponse) {
            assertResponse("position", "postNotesSlideAddNewShape");
        }
    }

    private PostNotesSlideAddNewShapeRequest createPostNotesSlideAddNewShapeRequest() {
        PostNotesSlideAddNewShapeRequest request = new PostNotesSlideAddNewShapeRequest();
        request.setName((String)getTestValue("postNotesSlideAddNewShape", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("postNotesSlideAddNewShape", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("postNotesSlideAddNewShape", "path", "String"));
        request.setDto((ShapeBase)getTestValue("postNotesSlideAddNewShape", "dto", "ShapeBase"));
        request.setPassword((String)getTestValue("postNotesSlideAddNewShape", "password", "String"));
        request.setFolder((String)getTestValue("postNotesSlideAddNewShape", "folder", "String"));
        request.setStorage((String)getTestValue("postNotesSlideAddNewShape", "storage", "String"));
        request.setShapeToClone((Integer)getTestValue("postNotesSlideAddNewShape", "shapeToClone", "Integer"));
        request.setPosition((Integer)getTestValue("postNotesSlideAddNewShape", "position", "Integer"));
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
    public void postNotesSlideShapeSaveAsTest() throws ApiException, Exception {
        initialize("postNotesSlideShapeSaveAs", null, null);
        Boolean needAssertResponse = false;
        File response = null;;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "postNotesSlideShapeSaveAs");
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
    public void postNotesSlideShapeSaveAsInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("postNotesSlideShapeSaveAs", "name", request.getName());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "postNotesSlideShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("name", "postNotesSlideShapeSaveAs");
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
    public void postNotesSlideShapeSaveAsInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("postNotesSlideShapeSaveAs", "slideIndex", request.getSlideIndex());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "postNotesSlideShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "postNotesSlideShapeSaveAs");
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
    public void postNotesSlideShapeSaveAsInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("postNotesSlideShapeSaveAs", "shapeIndex", request.getShapeIndex());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "postNotesSlideShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "postNotesSlideShapeSaveAs");
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
    public void postNotesSlideShapeSaveAsInvalidFormatTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            request.setFormat((ShapeExportFormat)invalidizeTestValue(request.getFormat(), "format", "ShapeExportFormat"));
            initialize("postNotesSlideShapeSaveAs", "format", request.getFormat());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "format", "postNotesSlideShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("format", "postNotesSlideShapeSaveAs");
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
    public void postNotesSlideShapeSaveAsInvalidOptionsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            request.setOptions((IShapeExportOptions)invalidizeTestValue(request.getOptions(), "options", "IShapeExportOptions"));
            initialize("postNotesSlideShapeSaveAs", "options", request.getOptions());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "options", "postNotesSlideShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("options", "postNotesSlideShapeSaveAs");
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
    public void postNotesSlideShapeSaveAsInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("postNotesSlideShapeSaveAs", "password", request.getPassword());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "postNotesSlideShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("password", "postNotesSlideShapeSaveAs");
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
    public void postNotesSlideShapeSaveAsInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("postNotesSlideShapeSaveAs", "folder", request.getFolder());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "postNotesSlideShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("folder", "postNotesSlideShapeSaveAs");
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
    public void postNotesSlideShapeSaveAsInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("postNotesSlideShapeSaveAs", "storage", request.getStorage());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "postNotesSlideShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("storage", "postNotesSlideShapeSaveAs");
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
    public void postNotesSlideShapeSaveAsInvalidScaleXTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            request.setScaleX((Double)invalidizeTestValue(request.getScaleX(), "scaleX", "Double"));
            initialize("postNotesSlideShapeSaveAs", "scaleX", request.getScaleX());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleX", "postNotesSlideShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("scaleX", "postNotesSlideShapeSaveAs");
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
    public void postNotesSlideShapeSaveAsInvalidScaleYTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            request.setScaleY((Double)invalidizeTestValue(request.getScaleY(), "scaleY", "Double"));
            initialize("postNotesSlideShapeSaveAs", "scaleY", request.getScaleY());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "scaleY", "postNotesSlideShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("scaleY", "postNotesSlideShapeSaveAs");
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
    public void postNotesSlideShapeSaveAsInvalidBoundsTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            request.setBounds((String)invalidizeTestValue(request.getBounds(), "bounds", "String"));
            initialize("postNotesSlideShapeSaveAs", "bounds", request.getBounds());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "bounds", "postNotesSlideShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("bounds", "postNotesSlideShapeSaveAs");
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
    public void postNotesSlideShapeSaveAsInvalidOutPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            request.setOutPath((String)invalidizeTestValue(request.getOutPath(), "outPath", "String"));
            initialize("postNotesSlideShapeSaveAs", "outPath", request.getOutPath());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "outPath", "postNotesSlideShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("outPath", "postNotesSlideShapeSaveAs");
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
    public void postNotesSlideShapeSaveAsInvalidFontsFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PostNotesSlideShapeSaveAsRequest request = createPostNotesSlideShapeSaveAsRequest();
            request.setFontsFolder((String)invalidizeTestValue(request.getFontsFolder(), "fontsFolder", "String"));
            initialize("postNotesSlideShapeSaveAs", "fontsFolder", request.getFontsFolder());
            File response = api.postNotesSlideShapeSaveAs(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "fontsFolder", "postNotesSlideShapeSaveAs");
        }
        if (needAssertResponse) {
            assertResponse("fontsFolder", "postNotesSlideShapeSaveAs");
        }
    }

    private PostNotesSlideShapeSaveAsRequest createPostNotesSlideShapeSaveAsRequest() {
        PostNotesSlideShapeSaveAsRequest request = new PostNotesSlideShapeSaveAsRequest();
        request.setName((String)getTestValue("postNotesSlideShapeSaveAs", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("postNotesSlideShapeSaveAs", "slideIndex", "Integer"));
        request.setShapeIndex((Integer)getTestValue("postNotesSlideShapeSaveAs", "shapeIndex", "Integer"));
        request.setFormat((ShapeExportFormat)getTestValue("postNotesSlideShapeSaveAs", "format", "ShapeExportFormat"));
        request.setOptions((IShapeExportOptions)getTestValue("postNotesSlideShapeSaveAs", "options", "IShapeExportOptions"));
        request.setPassword((String)getTestValue("postNotesSlideShapeSaveAs", "password", "String"));
        request.setFolder((String)getTestValue("postNotesSlideShapeSaveAs", "folder", "String"));
        request.setStorage((String)getTestValue("postNotesSlideShapeSaveAs", "storage", "String"));
        request.setScaleX((Double)getTestValue("postNotesSlideShapeSaveAs", "scaleX", "Double"));
        request.setScaleY((Double)getTestValue("postNotesSlideShapeSaveAs", "scaleY", "Double"));
        request.setBounds((String)getTestValue("postNotesSlideShapeSaveAs", "bounds", "String"));
        request.setOutPath((String)getTestValue("postNotesSlideShapeSaveAs", "outPath", "String"));
        request.setFontsFolder((String)getTestValue("postNotesSlideShapeSaveAs", "fontsFolder", "String"));
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
    public void putUpdateNotesSlideShapeTest() throws ApiException, Exception {
        initialize("putUpdateNotesSlideShape", null, null);
        Boolean needAssertResponse = false;
        ShapeResponse response = null;;
        try {
            PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
            response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putUpdateNotesSlideShape");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void putUpdateNotesSlideShapeInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putUpdateNotesSlideShape", "name", request.getName());
            ShapeResponse response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putUpdateNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("name", "putUpdateNotesSlideShape");
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
    public void putUpdateNotesSlideShapeInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("putUpdateNotesSlideShape", "slideIndex", request.getSlideIndex());
            ShapeResponse response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putUpdateNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putUpdateNotesSlideShape");
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
    public void putUpdateNotesSlideShapeInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("putUpdateNotesSlideShape", "path", request.getPath());
            ShapeResponse response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putUpdateNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("path", "putUpdateNotesSlideShape");
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
    public void putUpdateNotesSlideShapeInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("putUpdateNotesSlideShape", "shapeIndex", request.getShapeIndex());
            ShapeResponse response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putUpdateNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putUpdateNotesSlideShape");
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
    public void putUpdateNotesSlideShapeInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
            request.setDto((ShapeBase)invalidizeTestValue(request.getDto(), "dto", "ShapeBase"));
            initialize("putUpdateNotesSlideShape", "dto", request.getDto());
            ShapeResponse response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putUpdateNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("dto", "putUpdateNotesSlideShape");
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
    public void putUpdateNotesSlideShapeInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putUpdateNotesSlideShape", "password", request.getPassword());
            ShapeResponse response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putUpdateNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("password", "putUpdateNotesSlideShape");
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
    public void putUpdateNotesSlideShapeInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putUpdateNotesSlideShape", "folder", request.getFolder());
            ShapeResponse response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putUpdateNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putUpdateNotesSlideShape");
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
    public void putUpdateNotesSlideShapeInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeRequest request = createPutUpdateNotesSlideShapeRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putUpdateNotesSlideShape", "storage", request.getStorage());
            ShapeResponse response = api.putUpdateNotesSlideShape(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putUpdateNotesSlideShape");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putUpdateNotesSlideShape");
        }
    }

    private PutUpdateNotesSlideShapeRequest createPutUpdateNotesSlideShapeRequest() {
        PutUpdateNotesSlideShapeRequest request = new PutUpdateNotesSlideShapeRequest();
        request.setName((String)getTestValue("putUpdateNotesSlideShape", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("putUpdateNotesSlideShape", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("putUpdateNotesSlideShape", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("putUpdateNotesSlideShape", "shapeIndex", "Integer"));
        request.setDto((ShapeBase)getTestValue("putUpdateNotesSlideShape", "dto", "ShapeBase"));
        request.setPassword((String)getTestValue("putUpdateNotesSlideShape", "password", "String"));
        request.setFolder((String)getTestValue("putUpdateNotesSlideShape", "folder", "String"));
        request.setStorage((String)getTestValue("putUpdateNotesSlideShape", "storage", "String"));
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
    public void putUpdateNotesSlideShapeParagraphTest() throws ApiException, Exception {
        initialize("putUpdateNotesSlideShapeParagraph", null, null);
        Boolean needAssertResponse = false;
        ParagraphResponse response = null;;
        try {
            PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
            response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putUpdateNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void putUpdateNotesSlideShapeParagraphInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putUpdateNotesSlideShapeParagraph", "name", request.getName());
            ParagraphResponse response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putUpdateNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("name", "putUpdateNotesSlideShapeParagraph");
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
    public void putUpdateNotesSlideShapeParagraphInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("putUpdateNotesSlideShapeParagraph", "slideIndex", request.getSlideIndex());
            ParagraphResponse response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putUpdateNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putUpdateNotesSlideShapeParagraph");
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
    public void putUpdateNotesSlideShapeParagraphInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("putUpdateNotesSlideShapeParagraph", "path", request.getPath());
            ParagraphResponse response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putUpdateNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("path", "putUpdateNotesSlideShapeParagraph");
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
    public void putUpdateNotesSlideShapeParagraphInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("putUpdateNotesSlideShapeParagraph", "shapeIndex", request.getShapeIndex());
            ParagraphResponse response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putUpdateNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putUpdateNotesSlideShapeParagraph");
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
    public void putUpdateNotesSlideShapeParagraphInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("putUpdateNotesSlideShapeParagraph", "paragraphIndex", request.getParagraphIndex());
            ParagraphResponse response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "putUpdateNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "putUpdateNotesSlideShapeParagraph");
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
    public void putUpdateNotesSlideShapeParagraphInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
            request.setDto((Paragraph)invalidizeTestValue(request.getDto(), "dto", "Paragraph"));
            initialize("putUpdateNotesSlideShapeParagraph", "dto", request.getDto());
            ParagraphResponse response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putUpdateNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("dto", "putUpdateNotesSlideShapeParagraph");
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
    public void putUpdateNotesSlideShapeParagraphInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putUpdateNotesSlideShapeParagraph", "password", request.getPassword());
            ParagraphResponse response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putUpdateNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("password", "putUpdateNotesSlideShapeParagraph");
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
    public void putUpdateNotesSlideShapeParagraphInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putUpdateNotesSlideShapeParagraph", "folder", request.getFolder());
            ParagraphResponse response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putUpdateNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putUpdateNotesSlideShapeParagraph");
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
    public void putUpdateNotesSlideShapeParagraphInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapeParagraphRequest request = createPutUpdateNotesSlideShapeParagraphRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putUpdateNotesSlideShapeParagraph", "storage", request.getStorage());
            ParagraphResponse response = api.putUpdateNotesSlideShapeParagraph(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putUpdateNotesSlideShapeParagraph");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putUpdateNotesSlideShapeParagraph");
        }
    }

    private PutUpdateNotesSlideShapeParagraphRequest createPutUpdateNotesSlideShapeParagraphRequest() {
        PutUpdateNotesSlideShapeParagraphRequest request = new PutUpdateNotesSlideShapeParagraphRequest();
        request.setName((String)getTestValue("putUpdateNotesSlideShapeParagraph", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("putUpdateNotesSlideShapeParagraph", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("putUpdateNotesSlideShapeParagraph", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("putUpdateNotesSlideShapeParagraph", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("putUpdateNotesSlideShapeParagraph", "paragraphIndex", "Integer"));
        request.setDto((Paragraph)getTestValue("putUpdateNotesSlideShapeParagraph", "dto", "Paragraph"));
        request.setPassword((String)getTestValue("putUpdateNotesSlideShapeParagraph", "password", "String"));
        request.setFolder((String)getTestValue("putUpdateNotesSlideShapeParagraph", "folder", "String"));
        request.setStorage((String)getTestValue("putUpdateNotesSlideShapeParagraph", "storage", "String"));
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
    public void putUpdateNotesSlideShapePortionTest() throws ApiException, Exception {
        initialize("putUpdateNotesSlideShapePortion", null, null);
        Boolean needAssertResponse = false;
        PortionResponse response = null;;
        try {
            PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
            response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (Exception ex) {
            assertSuccessfulException(ex, "putUpdateNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertThat(response.getCode(), anyOf(equalTo(HttpStatusCode.OK), equalTo(HttpStatusCode.Created)));
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
    public void putUpdateNotesSlideShapePortionInvalidNameTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
            request.setName((String)invalidizeTestValue(request.getName(), "name", "String"));
            initialize("putUpdateNotesSlideShapePortion", "name", request.getName());
            PortionResponse response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "name", "putUpdateNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("name", "putUpdateNotesSlideShapePortion");
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
    public void putUpdateNotesSlideShapePortionInvalidSlideIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
            request.setSlideIndex((Integer)invalidizeTestValue(request.getSlideIndex(), "slideIndex", "Integer"));
            initialize("putUpdateNotesSlideShapePortion", "slideIndex", request.getSlideIndex());
            PortionResponse response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "slideIndex", "putUpdateNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("slideIndex", "putUpdateNotesSlideShapePortion");
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
    public void putUpdateNotesSlideShapePortionInvalidPathTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
            request.setPath((String)invalidizeTestValue(request.getPath(), "path", "String"));
            initialize("putUpdateNotesSlideShapePortion", "path", request.getPath());
            PortionResponse response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "path", "putUpdateNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("path", "putUpdateNotesSlideShapePortion");
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
    public void putUpdateNotesSlideShapePortionInvalidShapeIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
            request.setShapeIndex((Integer)invalidizeTestValue(request.getShapeIndex(), "shapeIndex", "Integer"));
            initialize("putUpdateNotesSlideShapePortion", "shapeIndex", request.getShapeIndex());
            PortionResponse response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "shapeIndex", "putUpdateNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("shapeIndex", "putUpdateNotesSlideShapePortion");
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
    public void putUpdateNotesSlideShapePortionInvalidParagraphIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
            request.setParagraphIndex((Integer)invalidizeTestValue(request.getParagraphIndex(), "paragraphIndex", "Integer"));
            initialize("putUpdateNotesSlideShapePortion", "paragraphIndex", request.getParagraphIndex());
            PortionResponse response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "paragraphIndex", "putUpdateNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("paragraphIndex", "putUpdateNotesSlideShapePortion");
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
    public void putUpdateNotesSlideShapePortionInvalidPortionIndexTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
            request.setPortionIndex((Integer)invalidizeTestValue(request.getPortionIndex(), "portionIndex", "Integer"));
            initialize("putUpdateNotesSlideShapePortion", "portionIndex", request.getPortionIndex());
            PortionResponse response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "portionIndex", "putUpdateNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("portionIndex", "putUpdateNotesSlideShapePortion");
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
    public void putUpdateNotesSlideShapePortionInvalidDtoTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
            request.setDto((Portion)invalidizeTestValue(request.getDto(), "dto", "Portion"));
            initialize("putUpdateNotesSlideShapePortion", "dto", request.getDto());
            PortionResponse response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "dto", "putUpdateNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("dto", "putUpdateNotesSlideShapePortion");
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
    public void putUpdateNotesSlideShapePortionInvalidPasswordTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
            request.setPassword((String)invalidizeTestValue(request.getPassword(), "password", "String"));
            initialize("putUpdateNotesSlideShapePortion", "password", request.getPassword());
            PortionResponse response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "password", "putUpdateNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("password", "putUpdateNotesSlideShapePortion");
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
    public void putUpdateNotesSlideShapePortionInvalidFolderTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
            request.setFolder((String)invalidizeTestValue(request.getFolder(), "folder", "String"));
            initialize("putUpdateNotesSlideShapePortion", "folder", request.getFolder());
            PortionResponse response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "folder", "putUpdateNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("folder", "putUpdateNotesSlideShapePortion");
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
    public void putUpdateNotesSlideShapePortionInvalidStorageTest() throws ApiException {
        Boolean needAssertResponse = false;
        try {
            PutUpdateNotesSlideShapePortionRequest request = createPutUpdateNotesSlideShapePortionRequest();
            request.setStorage((String)invalidizeTestValue(request.getStorage(), "storage", "String"));
            initialize("putUpdateNotesSlideShapePortion", "storage", request.getStorage());
            PortionResponse response = api.putUpdateNotesSlideShapePortion(request);
            needAssertResponse = true;
        } catch (ApiException ex) {
            assertException(ex, "storage", "putUpdateNotesSlideShapePortion");
        }
        if (needAssertResponse) {
            assertResponse("storage", "putUpdateNotesSlideShapePortion");
        }
    }

    private PutUpdateNotesSlideShapePortionRequest createPutUpdateNotesSlideShapePortionRequest() {
        PutUpdateNotesSlideShapePortionRequest request = new PutUpdateNotesSlideShapePortionRequest();
        request.setName((String)getTestValue("putUpdateNotesSlideShapePortion", "name", "String"));
        request.setSlideIndex((Integer)getTestValue("putUpdateNotesSlideShapePortion", "slideIndex", "Integer"));
        request.setPath((String)getTestValue("putUpdateNotesSlideShapePortion", "path", "String"));
        request.setShapeIndex((Integer)getTestValue("putUpdateNotesSlideShapePortion", "shapeIndex", "Integer"));
        request.setParagraphIndex((Integer)getTestValue("putUpdateNotesSlideShapePortion", "paragraphIndex", "Integer"));
        request.setPortionIndex((Integer)getTestValue("putUpdateNotesSlideShapePortion", "portionIndex", "Integer"));
        request.setDto((Portion)getTestValue("putUpdateNotesSlideShapePortion", "dto", "Portion"));
        request.setPassword((String)getTestValue("putUpdateNotesSlideShapePortion", "password", "String"));
        request.setFolder((String)getTestValue("putUpdateNotesSlideShapePortion", "folder", "String"));
        request.setStorage((String)getTestValue("putUpdateNotesSlideShapePortion", "storage", "String"));
        return request;
    }
    
}
