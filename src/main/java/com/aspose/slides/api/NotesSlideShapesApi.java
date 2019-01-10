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

import com.aspose.slides.ApiCallback;
import com.aspose.slides.ApiClient;
import com.aspose.slides.ApiException;
import com.aspose.slides.ApiResponse;
import com.aspose.slides.Configuration;
import com.aspose.slides.FileInfo;
import com.aspose.slides.Pair;
import com.aspose.slides.ProgressRequestBody;
import com.aspose.slides.ProgressResponseBody;
import com.aspose.slides.auth.NeedRepeatRequestException;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


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
import com.aspose.slides.model.request.DeleteNotesSlideParagraphRequest;
import com.aspose.slides.model.request.DeleteNotesSlideParagraphsRequest;
import com.aspose.slides.model.request.DeleteNotesSlidePortionRequest;
import com.aspose.slides.model.request.DeleteNotesSlidePortionsRequest;
import com.aspose.slides.model.request.DeleteNotesSlideShapeRequest;
import com.aspose.slides.model.request.DeleteNotesSlideShapesRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeParagraphRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeParagraphsRequest;
import com.aspose.slides.model.request.GetNotesSlideShapePortionRequest;
import com.aspose.slides.model.request.GetNotesSlideShapePortionsRequest;
import com.aspose.slides.model.request.GetNotesSlideShapeWithFormatRequest;
import com.aspose.slides.model.request.GetNotesSlideShapesRequest;
import com.aspose.slides.model.request.PostNotesSlideAddNewParagraphRequest;
import com.aspose.slides.model.request.PostNotesSlideAddNewPortionRequest;
import com.aspose.slides.model.request.PostNotesSlideAddNewShapeRequest;
import com.aspose.slides.model.request.PostNotesSlideShapeSaveAsRequest;
import com.aspose.slides.model.request.PutUpdateNotesSlideShapeRequest;
import com.aspose.slides.model.request.PutUpdateNotesSlideShapeParagraphRequest;
import com.aspose.slides.model.request.PutUpdateNotesSlideShapePortionRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotesSlideShapesApi extends ApiBase {
    public NotesSlideShapesApi(Configuration configuration) {
        super(configuration);
    }

    public NotesSlideShapesApi(String appSid, String appKey) {
        super(appSid, appKey);
    }

    /**
     * Build call for deleteNotesSlideParagraph
     * @param request Request for deleteNotesSlideParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideParagraphCall(DeleteNotesSlideParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlideParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlideParagraph(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling deleteNotesSlideParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteNotesSlideParagraph(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling deleteNotesSlideParagraph(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()))
            .replaceAll("\\{" + "paragraphIndex" + "\\}", getApiClient().escapeString(request.getParagraphIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteNotesSlideParagraph. (required)
     * @return ParagraphListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphListResponse deleteNotesSlideParagraph(DeleteNotesSlideParagraphRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphListResponse> resp = deleteNotesSlideParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ParagraphListResponse> resp = deleteNotesSlideParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteNotesSlideParagraph. (required)
     * @return ApiResponse&lt;ParagraphListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ParagraphListResponse> deleteNotesSlideParagraphWithHttpInfo(DeleteNotesSlideParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlideParagraphCall(request, null, null);
        Type returnType = new TypeToken<ParagraphListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Removes a shape, specified shapes or all shapes. (asynchronously)
     * 
     * @param request Request for deleteNotesSlideParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideParagraphAsync(DeleteNotesSlideParagraphRequest request, final ApiCallback<ParagraphListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNotesSlideParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ParagraphListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteNotesSlideParagraphs
     * @param request Request for deleteNotesSlideParagraphs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideParagraphsCall(DeleteNotesSlideParagraphsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlideParagraphs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlideParagraphs(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling deleteNotesSlideParagraphs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteNotesSlideParagraphs(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "paragraphs", request.getParagraphs());
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteNotesSlideParagraphs. (required)
     * @return ParagraphListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphListResponse deleteNotesSlideParagraphs(DeleteNotesSlideParagraphsRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphListResponse> resp = deleteNotesSlideParagraphsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ParagraphListResponse> resp = deleteNotesSlideParagraphsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteNotesSlideParagraphs. (required)
     * @return ApiResponse&lt;ParagraphListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ParagraphListResponse> deleteNotesSlideParagraphsWithHttpInfo(DeleteNotesSlideParagraphsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlideParagraphsCall(request, null, null);
        Type returnType = new TypeToken<ParagraphListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Removes a shape, specified shapes or all shapes. (asynchronously)
     * 
     * @param request Request for deleteNotesSlideParagraphs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideParagraphsAsync(DeleteNotesSlideParagraphsRequest request, final ApiCallback<ParagraphListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNotesSlideParagraphsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ParagraphListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteNotesSlidePortion
     * @param request Request for deleteNotesSlidePortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlidePortionCall(DeleteNotesSlidePortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlidePortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlidePortion(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling deleteNotesSlidePortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteNotesSlidePortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling deleteNotesSlidePortion(Async)");
        }
        
        // verify the required parameter 'portionIndex' is set
        if (request.getPortionIndex() == null) {
            throw new ApiException("Missing the required parameter 'portionIndex' when calling deleteNotesSlidePortion(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()))
            .replaceAll("\\{" + "paragraphIndex" + "\\}", getApiClient().escapeString(request.getParagraphIndex().toString()))
            .replaceAll("\\{" + "portionIndex" + "\\}", getApiClient().escapeString(request.getPortionIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteNotesSlidePortion. (required)
     * @return PortionListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortionListResponse deleteNotesSlidePortion(DeleteNotesSlidePortionRequest request) throws ApiException {
        try {
            ApiResponse<PortionListResponse> resp = deleteNotesSlidePortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<PortionListResponse> resp = deleteNotesSlidePortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteNotesSlidePortion. (required)
     * @return ApiResponse&lt;PortionListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortionListResponse> deleteNotesSlidePortionWithHttpInfo(DeleteNotesSlidePortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlidePortionCall(request, null, null);
        Type returnType = new TypeToken<PortionListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Removes a shape, specified shapes or all shapes. (asynchronously)
     * 
     * @param request Request for deleteNotesSlidePortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlidePortionAsync(DeleteNotesSlidePortionRequest request, final ApiCallback<PortionListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNotesSlidePortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<PortionListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteNotesSlidePortions
     * @param request Request for deleteNotesSlidePortions. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlidePortionsCall(DeleteNotesSlidePortionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlidePortions(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlidePortions(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling deleteNotesSlidePortions(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteNotesSlidePortions(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling deleteNotesSlidePortions(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()))
            .replaceAll("\\{" + "paragraphIndex" + "\\}", getApiClient().escapeString(request.getParagraphIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "portions", request.getPortions());
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteNotesSlidePortions. (required)
     * @return PortionListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortionListResponse deleteNotesSlidePortions(DeleteNotesSlidePortionsRequest request) throws ApiException {
        try {
            ApiResponse<PortionListResponse> resp = deleteNotesSlidePortionsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<PortionListResponse> resp = deleteNotesSlidePortionsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteNotesSlidePortions. (required)
     * @return ApiResponse&lt;PortionListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortionListResponse> deleteNotesSlidePortionsWithHttpInfo(DeleteNotesSlidePortionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlidePortionsCall(request, null, null);
        Type returnType = new TypeToken<PortionListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Removes a shape, specified shapes or all shapes. (asynchronously)
     * 
     * @param request Request for deleteNotesSlidePortions. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlidePortionsAsync(DeleteNotesSlidePortionsRequest request, final ApiCallback<PortionListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNotesSlidePortionsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<PortionListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteNotesSlideShape
     * @param request Request for deleteNotesSlideShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideShapeCall(DeleteNotesSlideShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling deleteNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteNotesSlideShape(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteNotesSlideShape. (required)
     * @return ShapeListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeListResponse deleteNotesSlideShape(DeleteNotesSlideShapeRequest request) throws ApiException {
        try {
            ApiResponse<ShapeListResponse> resp = deleteNotesSlideShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeListResponse> resp = deleteNotesSlideShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteNotesSlideShape. (required)
     * @return ApiResponse&lt;ShapeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeListResponse> deleteNotesSlideShapeWithHttpInfo(DeleteNotesSlideShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlideShapeCall(request, null, null);
        Type returnType = new TypeToken<ShapeListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Removes a shape, specified shapes or all shapes. (asynchronously)
     * 
     * @param request Request for deleteNotesSlideShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideShapeAsync(DeleteNotesSlideShapeRequest request, final ApiCallback<ShapeListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNotesSlideShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteNotesSlideShapes
     * @param request Request for deleteNotesSlideShapes. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideShapesCall(DeleteNotesSlideShapesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlideShapes(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlideShapes(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling deleteNotesSlideShapes(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "shapes", request.getShapes());
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteNotesSlideShapes. (required)
     * @return ShapeListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeListResponse deleteNotesSlideShapes(DeleteNotesSlideShapesRequest request) throws ApiException {
        try {
            ApiResponse<ShapeListResponse> resp = deleteNotesSlideShapesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeListResponse> resp = deleteNotesSlideShapesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteNotesSlideShapes. (required)
     * @return ApiResponse&lt;ShapeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeListResponse> deleteNotesSlideShapesWithHttpInfo(DeleteNotesSlideShapesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlideShapesCall(request, null, null);
        Type returnType = new TypeToken<ShapeListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Removes a shape, specified shapes or all shapes. (asynchronously)
     * 
     * @param request Request for deleteNotesSlideShapes. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideShapesAsync(DeleteNotesSlideShapesRequest request, final ApiCallback<ShapeListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteNotesSlideShapesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideShape
     * @param request Request for getNotesSlideShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeCall(GetNotesSlideShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getNotesSlideShape(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getNotesSlideShape. (required)
     * @return ShapeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeResponse getNotesSlideShape(GetNotesSlideShapeRequest request) throws ApiException {
        try {
            ApiResponse<ShapeResponse> resp = getNotesSlideShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeResponse> resp = getNotesSlideShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getNotesSlideShape. (required)
     * @return ApiResponse&lt;ShapeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeResponse> getNotesSlideShapeWithHttpInfo(GetNotesSlideShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideShapeCall(request, null, null);
        Type returnType = new TypeToken<ShapeResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide shapes or shape info. (asynchronously)
     * 
     * @param request Request for getNotesSlideShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeAsync(GetNotesSlideShapeRequest request, final ApiCallback<ShapeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideShapeParagraph
     * @param request Request for getNotesSlideShapeParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeParagraphCall(GetNotesSlideShapeParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling getNotesSlideShapeParagraph(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()))
            .replaceAll("\\{" + "paragraphIndex" + "\\}", getApiClient().escapeString(request.getParagraphIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getNotesSlideShapeParagraph. (required)
     * @return ParagraphResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphResponse getNotesSlideShapeParagraph(GetNotesSlideShapeParagraphRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphResponse> resp = getNotesSlideShapeParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ParagraphResponse> resp = getNotesSlideShapeParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getNotesSlideShapeParagraph. (required)
     * @return ApiResponse&lt;ParagraphResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ParagraphResponse> getNotesSlideShapeParagraphWithHttpInfo(GetNotesSlideShapeParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideShapeParagraphCall(request, null, null);
        Type returnType = new TypeToken<ParagraphResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide shapes or shape info. (asynchronously)
     * 
     * @param request Request for getNotesSlideShapeParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeParagraphAsync(GetNotesSlideShapeParagraphRequest request, final ApiCallback<ParagraphResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideShapeParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ParagraphResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideShapeParagraphs
     * @param request Request for getNotesSlideShapeParagraphs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeParagraphsCall(GetNotesSlideShapeParagraphsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideShapeParagraphs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideShapeParagraphs(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getNotesSlideShapeParagraphs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getNotesSlideShapeParagraphs(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getNotesSlideShapeParagraphs. (required)
     * @return ParagraphListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphListResponse getNotesSlideShapeParagraphs(GetNotesSlideShapeParagraphsRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphListResponse> resp = getNotesSlideShapeParagraphsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ParagraphListResponse> resp = getNotesSlideShapeParagraphsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getNotesSlideShapeParagraphs. (required)
     * @return ApiResponse&lt;ParagraphListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ParagraphListResponse> getNotesSlideShapeParagraphsWithHttpInfo(GetNotesSlideShapeParagraphsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideShapeParagraphsCall(request, null, null);
        Type returnType = new TypeToken<ParagraphListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide shapes or shape info. (asynchronously)
     * 
     * @param request Request for getNotesSlideShapeParagraphs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeParagraphsAsync(GetNotesSlideShapeParagraphsRequest request, final ApiCallback<ParagraphListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideShapeParagraphsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ParagraphListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideShapePortion
     * @param request Request for getNotesSlideShapePortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapePortionCall(GetNotesSlideShapePortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling getNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'portionIndex' is set
        if (request.getPortionIndex() == null) {
            throw new ApiException("Missing the required parameter 'portionIndex' when calling getNotesSlideShapePortion(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()))
            .replaceAll("\\{" + "paragraphIndex" + "\\}", getApiClient().escapeString(request.getParagraphIndex().toString()))
            .replaceAll("\\{" + "portionIndex" + "\\}", getApiClient().escapeString(request.getPortionIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getNotesSlideShapePortion. (required)
     * @return PortionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortionResponse getNotesSlideShapePortion(GetNotesSlideShapePortionRequest request) throws ApiException {
        try {
            ApiResponse<PortionResponse> resp = getNotesSlideShapePortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<PortionResponse> resp = getNotesSlideShapePortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getNotesSlideShapePortion. (required)
     * @return ApiResponse&lt;PortionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortionResponse> getNotesSlideShapePortionWithHttpInfo(GetNotesSlideShapePortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideShapePortionCall(request, null, null);
        Type returnType = new TypeToken<PortionResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide shapes or shape info. (asynchronously)
     * 
     * @param request Request for getNotesSlideShapePortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapePortionAsync(GetNotesSlideShapePortionRequest request, final ApiCallback<PortionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideShapePortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<PortionResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideShapePortions
     * @param request Request for getNotesSlideShapePortions. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapePortionsCall(GetNotesSlideShapePortionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideShapePortions(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideShapePortions(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getNotesSlideShapePortions(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getNotesSlideShapePortions(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling getNotesSlideShapePortions(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()))
            .replaceAll("\\{" + "paragraphIndex" + "\\}", getApiClient().escapeString(request.getParagraphIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getNotesSlideShapePortions. (required)
     * @return PortionListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortionListResponse getNotesSlideShapePortions(GetNotesSlideShapePortionsRequest request) throws ApiException {
        try {
            ApiResponse<PortionListResponse> resp = getNotesSlideShapePortionsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<PortionListResponse> resp = getNotesSlideShapePortionsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getNotesSlideShapePortions. (required)
     * @return ApiResponse&lt;PortionListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortionListResponse> getNotesSlideShapePortionsWithHttpInfo(GetNotesSlideShapePortionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideShapePortionsCall(request, null, null);
        Type returnType = new TypeToken<PortionListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide shapes or shape info. (asynchronously)
     * 
     * @param request Request for getNotesSlideShapePortions. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapePortionsAsync(GetNotesSlideShapePortionsRequest request, final ApiCallback<PortionListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideShapePortionsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<PortionListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideShapeWithFormat
     * @param request Request for getNotesSlideShapeWithFormat. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeWithFormatCall(GetNotesSlideShapeWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideShapeWithFormat(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideShapeWithFormat(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getNotesSlideShapeWithFormat(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling getNotesSlideShapeWithFormat(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{shapeIndex}/saveAs/{format}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()))
            .replaceAll("\\{" + "format" + "\\}", getApiClient().escapeString(request.getFormat().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "scaleX", request.getScaleX());
        getApiClient().addQueryParameter(queryParams, "scaleY", request.getScaleY());
        getApiClient().addQueryParameter(queryParams, "bounds", request.getBounds());
        getApiClient().addQueryParameter(queryParams, "outPath", request.getOutPath());
        getApiClient().addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for getNotesSlideShapeWithFormat. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getNotesSlideShapeWithFormat(GetNotesSlideShapeWithFormatRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getNotesSlideShapeWithFormatWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = getNotesSlideShapeWithFormatWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for getNotesSlideShapeWithFormat. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getNotesSlideShapeWithFormatWithHttpInfo(GetNotesSlideShapeWithFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideShapeWithFormatCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Render shape to specified picture format. (asynchronously)
     * 
     * @param request Request for getNotesSlideShapeWithFormat. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapeWithFormatAsync(GetNotesSlideShapeWithFormatRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideShapeWithFormatCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideShapes
     * @param request Request for getNotesSlideShapes. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapesCall(GetNotesSlideShapesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideShapes(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideShapes(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getNotesSlideShapes(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getNotesSlideShapes. (required)
     * @return ShapeListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeListResponse getNotesSlideShapes(GetNotesSlideShapesRequest request) throws ApiException {
        try {
            ApiResponse<ShapeListResponse> resp = getNotesSlideShapesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeListResponse> resp = getNotesSlideShapesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getNotesSlideShapes. (required)
     * @return ApiResponse&lt;ShapeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeListResponse> getNotesSlideShapesWithHttpInfo(GetNotesSlideShapesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideShapesCall(request, null, null);
        Type returnType = new TypeToken<ShapeListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide shapes or shape info. (asynchronously)
     * 
     * @param request Request for getNotesSlideShapes. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideShapesAsync(GetNotesSlideShapesRequest request, final ApiCallback<ShapeListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNotesSlideShapesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postNotesSlideAddNewParagraph
     * @param request Request for postNotesSlideAddNewParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideAddNewParagraphCall(PostNotesSlideAddNewParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postNotesSlideAddNewParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postNotesSlideAddNewParagraph(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling postNotesSlideAddNewParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling postNotesSlideAddNewParagraph(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "position", request.getPosition());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Creates new paragraph.
     * 
     * @param request Request for postNotesSlideAddNewParagraph. (required)
     * @return ParagraphResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphResponse postNotesSlideAddNewParagraph(PostNotesSlideAddNewParagraphRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphResponse> resp = postNotesSlideAddNewParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ParagraphResponse> resp = postNotesSlideAddNewParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Creates new paragraph.
     * 
     * @param request Request for postNotesSlideAddNewParagraph. (required)
     * @return ApiResponse&lt;ParagraphResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ParagraphResponse> postNotesSlideAddNewParagraphWithHttpInfo(PostNotesSlideAddNewParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postNotesSlideAddNewParagraphCall(request, null, null);
        Type returnType = new TypeToken<ParagraphResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Creates new paragraph. (asynchronously)
     * 
     * @param request Request for postNotesSlideAddNewParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideAddNewParagraphAsync(PostNotesSlideAddNewParagraphRequest request, final ApiCallback<ParagraphResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postNotesSlideAddNewParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ParagraphResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postNotesSlideAddNewPortion
     * @param request Request for postNotesSlideAddNewPortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideAddNewPortionCall(PostNotesSlideAddNewPortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postNotesSlideAddNewPortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postNotesSlideAddNewPortion(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling postNotesSlideAddNewPortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling postNotesSlideAddNewPortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling postNotesSlideAddNewPortion(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()))
            .replaceAll("\\{" + "paragraphIndex" + "\\}", getApiClient().escapeString(request.getParagraphIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "position", request.getPosition());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Creates new portion.
     * 
     * @param request Request for postNotesSlideAddNewPortion. (required)
     * @return PortionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortionResponse postNotesSlideAddNewPortion(PostNotesSlideAddNewPortionRequest request) throws ApiException {
        try {
            ApiResponse<PortionResponse> resp = postNotesSlideAddNewPortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<PortionResponse> resp = postNotesSlideAddNewPortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Creates new portion.
     * 
     * @param request Request for postNotesSlideAddNewPortion. (required)
     * @return ApiResponse&lt;PortionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortionResponse> postNotesSlideAddNewPortionWithHttpInfo(PostNotesSlideAddNewPortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postNotesSlideAddNewPortionCall(request, null, null);
        Type returnType = new TypeToken<PortionResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Creates new portion. (asynchronously)
     * 
     * @param request Request for postNotesSlideAddNewPortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideAddNewPortionAsync(PostNotesSlideAddNewPortionRequest request, final ApiCallback<PortionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postNotesSlideAddNewPortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<PortionResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postNotesSlideAddNewShape
     * @param request Request for postNotesSlideAddNewShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideAddNewShapeCall(PostNotesSlideAddNewShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postNotesSlideAddNewShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postNotesSlideAddNewShape(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling postNotesSlideAddNewShape(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "shapeToClone", request.getShapeToClone());
        getApiClient().addQueryParameter(queryParams, "position", request.getPosition());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Creates new shape.
     * 
     * @param request Request for postNotesSlideAddNewShape. (required)
     * @return ShapeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeResponse postNotesSlideAddNewShape(PostNotesSlideAddNewShapeRequest request) throws ApiException {
        try {
            ApiResponse<ShapeResponse> resp = postNotesSlideAddNewShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeResponse> resp = postNotesSlideAddNewShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Creates new shape.
     * 
     * @param request Request for postNotesSlideAddNewShape. (required)
     * @return ApiResponse&lt;ShapeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeResponse> postNotesSlideAddNewShapeWithHttpInfo(PostNotesSlideAddNewShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postNotesSlideAddNewShapeCall(request, null, null);
        Type returnType = new TypeToken<ShapeResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Creates new shape. (asynchronously)
     * 
     * @param request Request for postNotesSlideAddNewShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideAddNewShapeAsync(PostNotesSlideAddNewShapeRequest request, final ApiCallback<ShapeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postNotesSlideAddNewShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postNotesSlideShapeSaveAs
     * @param request Request for postNotesSlideShapeSaveAs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideShapeSaveAsCall(PostNotesSlideShapeSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postNotesSlideShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postNotesSlideShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling postNotesSlideShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling postNotesSlideShapeSaveAs(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{shapeIndex}/saveAs/{format}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()))
            .replaceAll("\\{" + "format" + "\\}", getApiClient().escapeString(request.getFormat().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "scaleX", request.getScaleX());
        getApiClient().addQueryParameter(queryParams, "scaleY", request.getScaleY());
        getApiClient().addQueryParameter(queryParams, "bounds", request.getBounds());
        getApiClient().addQueryParameter(queryParams, "outPath", request.getOutPath());
        getApiClient().addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for postNotesSlideShapeSaveAs. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postNotesSlideShapeSaveAs(PostNotesSlideShapeSaveAsRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postNotesSlideShapeSaveAsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = postNotesSlideShapeSaveAsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for postNotesSlideShapeSaveAs. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> postNotesSlideShapeSaveAsWithHttpInfo(PostNotesSlideShapeSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postNotesSlideShapeSaveAsCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Render shape to specified picture format. (asynchronously)
     * 
     * @param request Request for postNotesSlideShapeSaveAs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postNotesSlideShapeSaveAsAsync(PostNotesSlideShapeSaveAsRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postNotesSlideShapeSaveAsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putUpdateNotesSlideShape
     * @param request Request for putUpdateNotesSlideShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideShapeCall(PutUpdateNotesSlideShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putUpdateNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putUpdateNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling putUpdateNotesSlideShape(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putUpdateNotesSlideShape(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Updates shape properties.
     * 
     * @param request Request for putUpdateNotesSlideShape. (required)
     * @return ShapeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeResponse putUpdateNotesSlideShape(PutUpdateNotesSlideShapeRequest request) throws ApiException {
        try {
            ApiResponse<ShapeResponse> resp = putUpdateNotesSlideShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeResponse> resp = putUpdateNotesSlideShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Updates shape properties.
     * 
     * @param request Request for putUpdateNotesSlideShape. (required)
     * @return ApiResponse&lt;ShapeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeResponse> putUpdateNotesSlideShapeWithHttpInfo(PutUpdateNotesSlideShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putUpdateNotesSlideShapeCall(request, null, null);
        Type returnType = new TypeToken<ShapeResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Updates shape properties. (asynchronously)
     * 
     * @param request Request for putUpdateNotesSlideShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideShapeAsync(PutUpdateNotesSlideShapeRequest request, final ApiCallback<ShapeResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putUpdateNotesSlideShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putUpdateNotesSlideShapeParagraph
     * @param request Request for putUpdateNotesSlideShapeParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideShapeParagraphCall(PutUpdateNotesSlideShapeParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putUpdateNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putUpdateNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling putUpdateNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putUpdateNotesSlideShapeParagraph(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling putUpdateNotesSlideShapeParagraph(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()))
            .replaceAll("\\{" + "paragraphIndex" + "\\}", getApiClient().escapeString(request.getParagraphIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Updates shape properties.
     * 
     * @param request Request for putUpdateNotesSlideShapeParagraph. (required)
     * @return ParagraphResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphResponse putUpdateNotesSlideShapeParagraph(PutUpdateNotesSlideShapeParagraphRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphResponse> resp = putUpdateNotesSlideShapeParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ParagraphResponse> resp = putUpdateNotesSlideShapeParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Updates shape properties.
     * 
     * @param request Request for putUpdateNotesSlideShapeParagraph. (required)
     * @return ApiResponse&lt;ParagraphResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ParagraphResponse> putUpdateNotesSlideShapeParagraphWithHttpInfo(PutUpdateNotesSlideShapeParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putUpdateNotesSlideShapeParagraphCall(request, null, null);
        Type returnType = new TypeToken<ParagraphResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Updates shape properties. (asynchronously)
     * 
     * @param request Request for putUpdateNotesSlideShapeParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideShapeParagraphAsync(PutUpdateNotesSlideShapeParagraphRequest request, final ApiCallback<ParagraphResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putUpdateNotesSlideShapeParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ParagraphResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putUpdateNotesSlideShapePortion
     * @param request Request for putUpdateNotesSlideShapePortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideShapePortionCall(PutUpdateNotesSlideShapePortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putUpdateNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putUpdateNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling putUpdateNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putUpdateNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling putUpdateNotesSlideShapePortion(Async)");
        }
        
        // verify the required parameter 'portionIndex' is set
        if (request.getPortionIndex() == null) {
            throw new ApiException("Missing the required parameter 'portionIndex' when calling putUpdateNotesSlideShapePortion(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()))
            .replaceAll("\\{" + "paragraphIndex" + "\\}", getApiClient().escapeString(request.getParagraphIndex().toString()))
            .replaceAll("\\{" + "portionIndex" + "\\}", getApiClient().escapeString(request.getPortionIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Updates shape properties.
     * 
     * @param request Request for putUpdateNotesSlideShapePortion. (required)
     * @return PortionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortionResponse putUpdateNotesSlideShapePortion(PutUpdateNotesSlideShapePortionRequest request) throws ApiException {
        try {
            ApiResponse<PortionResponse> resp = putUpdateNotesSlideShapePortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<PortionResponse> resp = putUpdateNotesSlideShapePortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Updates shape properties.
     * 
     * @param request Request for putUpdateNotesSlideShapePortion. (required)
     * @return ApiResponse&lt;PortionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortionResponse> putUpdateNotesSlideShapePortionWithHttpInfo(PutUpdateNotesSlideShapePortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putUpdateNotesSlideShapePortionCall(request, null, null);
        Type returnType = new TypeToken<PortionResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Updates shape properties. (asynchronously)
     * 
     * @param request Request for putUpdateNotesSlideShapePortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideShapePortionAsync(PutUpdateNotesSlideShapePortionRequest request, final ApiCallback<PortionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putUpdateNotesSlideShapePortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<PortionResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
}
