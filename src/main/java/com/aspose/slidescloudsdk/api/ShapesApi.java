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

import com.aspose.slidescloudsdk.ApiCallback;
import com.aspose.slidescloudsdk.ApiClient;
import com.aspose.slidescloudsdk.ApiException;
import com.aspose.slidescloudsdk.ApiResponse;
import com.aspose.slidescloudsdk.Configuration;
import com.aspose.slidescloudsdk.FileInfo;
import com.aspose.slidescloudsdk.Pair;
import com.aspose.slidescloudsdk.ProgressRequestBody;
import com.aspose.slidescloudsdk.ProgressResponseBody;
import com.aspose.slidescloudsdk.auth.NeedRepeatRequestException;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


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
import com.aspose.slidescloudsdk.model.request.DeleteParagraphRequest;
import com.aspose.slidescloudsdk.model.request.DeleteParagraphsRequest;
import com.aspose.slidescloudsdk.model.request.DeletePortionRequest;
import com.aspose.slidescloudsdk.model.request.DeletePortionsRequest;
import com.aspose.slidescloudsdk.model.request.DeleteSlideShapeRequest;
import com.aspose.slidescloudsdk.model.request.DeleteSlideShapesRequest;
import com.aspose.slidescloudsdk.model.request.GetParagraphPortionRequest;
import com.aspose.slidescloudsdk.model.request.GetParagraphPortionsRequest;
import com.aspose.slidescloudsdk.model.request.GetShapeParagraphRequest;
import com.aspose.slidescloudsdk.model.request.GetShapeWithFormatRequest;
import com.aspose.slidescloudsdk.model.request.GetSlideShapeRequest;
import com.aspose.slidescloudsdk.model.request.GetSlideShapeParagraphsRequest;
import com.aspose.slidescloudsdk.model.request.GetSlideShapesRequest;
import com.aspose.slidescloudsdk.model.request.PostAddNewParagraphRequest;
import com.aspose.slidescloudsdk.model.request.PostAddNewPortionRequest;
import com.aspose.slidescloudsdk.model.request.PostAddNewShapeRequest;
import com.aspose.slidescloudsdk.model.request.PostShapeSaveAsRequest;
import com.aspose.slidescloudsdk.model.request.PutSetParagraphPortionPropertiesRequest;
import com.aspose.slidescloudsdk.model.request.PutSetParagraphPropertiesRequest;
import com.aspose.slidescloudsdk.model.request.PutSlideShapeInfoRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShapesApi extends ApiBase {
    public ShapesApi(Configuration configuration) {
        super(configuration);
    }

    public ShapesApi(String appSid, String appKey) {
        super(appSid, appKey);
    }

    /**
     * Build call for deleteParagraph
     * @param request Request for deleteParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteParagraphCall(DeleteParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteParagraph(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling deleteParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteParagraph(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling deleteParagraph(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}"
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
     * @param request Request for deleteParagraph. (required)
     * @return ParagraphListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphListResponse deleteParagraph(DeleteParagraphRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphListResponse> resp = deleteParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ParagraphListResponse> resp = deleteParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteParagraph. (required)
     * @return ApiResponse&lt;ParagraphListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ParagraphListResponse> deleteParagraphWithHttpInfo(DeleteParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteParagraphCall(request, null, null);
        Type returnType = new TypeToken<ParagraphListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Removes a shape, specified shapes or all shapes. (asynchronously)
     * 
     * @param request Request for deleteParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteParagraphAsync(DeleteParagraphRequest request, final ApiCallback<ParagraphListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ParagraphListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteParagraphs
     * @param request Request for deleteParagraphs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteParagraphsCall(DeleteParagraphsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteParagraphs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteParagraphs(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling deleteParagraphs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteParagraphs(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "paragraphs", request.getParagraphs());

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
     * @param request Request for deleteParagraphs. (required)
     * @return ParagraphListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphListResponse deleteParagraphs(DeleteParagraphsRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphListResponse> resp = deleteParagraphsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ParagraphListResponse> resp = deleteParagraphsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteParagraphs. (required)
     * @return ApiResponse&lt;ParagraphListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ParagraphListResponse> deleteParagraphsWithHttpInfo(DeleteParagraphsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteParagraphsCall(request, null, null);
        Type returnType = new TypeToken<ParagraphListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Removes a shape, specified shapes or all shapes. (asynchronously)
     * 
     * @param request Request for deleteParagraphs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteParagraphsAsync(DeleteParagraphsRequest request, final ApiCallback<ParagraphListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteParagraphsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ParagraphListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deletePortion
     * @param request Request for deletePortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePortionCall(DeletePortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deletePortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deletePortion(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling deletePortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deletePortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling deletePortion(Async)");
        }
        
        // verify the required parameter 'portionIndex' is set
        if (request.getPortionIndex() == null) {
            throw new ApiException("Missing the required parameter 'portionIndex' when calling deletePortion(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}"
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
     * @param request Request for deletePortion. (required)
     * @return PortionListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortionListResponse deletePortion(DeletePortionRequest request) throws ApiException {
        try {
            ApiResponse<PortionListResponse> resp = deletePortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<PortionListResponse> resp = deletePortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deletePortion. (required)
     * @return ApiResponse&lt;PortionListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortionListResponse> deletePortionWithHttpInfo(DeletePortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deletePortionCall(request, null, null);
        Type returnType = new TypeToken<PortionListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Removes a shape, specified shapes or all shapes. (asynchronously)
     * 
     * @param request Request for deletePortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePortionAsync(DeletePortionRequest request, final ApiCallback<PortionListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deletePortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<PortionListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deletePortions
     * @param request Request for deletePortions. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePortionsCall(DeletePortionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deletePortions(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deletePortions(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling deletePortions(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deletePortions(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling deletePortions(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()))
            .replaceAll("\\{" + "shapeIndex" + "\\}", getApiClient().escapeString(request.getShapeIndex().toString()))
            .replaceAll("\\{" + "paragraphIndex" + "\\}", getApiClient().escapeString(request.getParagraphIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "portions", request.getPortions());

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
     * @param request Request for deletePortions. (required)
     * @return PortionListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortionListResponse deletePortions(DeletePortionsRequest request) throws ApiException {
        try {
            ApiResponse<PortionListResponse> resp = deletePortionsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<PortionListResponse> resp = deletePortionsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deletePortions. (required)
     * @return ApiResponse&lt;PortionListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortionListResponse> deletePortionsWithHttpInfo(DeletePortionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deletePortionsCall(request, null, null);
        Type returnType = new TypeToken<PortionListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Removes a shape, specified shapes or all shapes. (asynchronously)
     * 
     * @param request Request for deletePortions. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePortionsAsync(DeletePortionsRequest request, final ApiCallback<PortionListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deletePortionsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<PortionListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlideShape
     * @param request Request for deleteSlideShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlideShapeCall(DeleteSlideShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlideShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlideShape(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling deleteSlideShape(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling deleteSlideShape(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}"
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
     * @param request Request for deleteSlideShape. (required)
     * @return ShapeListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeListResponse deleteSlideShape(DeleteSlideShapeRequest request) throws ApiException {
        try {
            ApiResponse<ShapeListResponse> resp = deleteSlideShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeListResponse> resp = deleteSlideShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteSlideShape. (required)
     * @return ApiResponse&lt;ShapeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeListResponse> deleteSlideShapeWithHttpInfo(DeleteSlideShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlideShapeCall(request, null, null);
        Type returnType = new TypeToken<ShapeListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Removes a shape, specified shapes or all shapes. (asynchronously)
     * 
     * @param request Request for deleteSlideShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlideShapeAsync(DeleteSlideShapeRequest request, final ApiCallback<ShapeListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteSlideShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlideShapes
     * @param request Request for deleteSlideShapes. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlideShapesCall(DeleteSlideShapesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlideShapes(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlideShapes(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling deleteSlideShapes(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "path" + "\\}", getApiClient().escapeString(request.getPath().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "shapes", request.getShapes());

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
     * @param request Request for deleteSlideShapes. (required)
     * @return ShapeListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeListResponse deleteSlideShapes(DeleteSlideShapesRequest request) throws ApiException {
        try {
            ApiResponse<ShapeListResponse> resp = deleteSlideShapesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeListResponse> resp = deleteSlideShapesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Removes a shape, specified shapes or all shapes.
     * 
     * @param request Request for deleteSlideShapes. (required)
     * @return ApiResponse&lt;ShapeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeListResponse> deleteSlideShapesWithHttpInfo(DeleteSlideShapesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlideShapesCall(request, null, null);
        Type returnType = new TypeToken<ShapeListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Removes a shape, specified shapes or all shapes. (asynchronously)
     * 
     * @param request Request for deleteSlideShapes. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlideShapesAsync(DeleteSlideShapesRequest request, final ApiCallback<ShapeListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteSlideShapesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getParagraphPortion
     * @param request Request for getParagraphPortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getParagraphPortionCall(GetParagraphPortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getParagraphPortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getParagraphPortion(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getParagraphPortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getParagraphPortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling getParagraphPortion(Async)");
        }
        
        // verify the required parameter 'portionIndex' is set
        if (request.getPortionIndex() == null) {
            throw new ApiException("Missing the required parameter 'portionIndex' when calling getParagraphPortion(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}"
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
     * @param request Request for getParagraphPortion. (required)
     * @return PortionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortionResponse getParagraphPortion(GetParagraphPortionRequest request) throws ApiException {
        try {
            ApiResponse<PortionResponse> resp = getParagraphPortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<PortionResponse> resp = getParagraphPortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getParagraphPortion. (required)
     * @return ApiResponse&lt;PortionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortionResponse> getParagraphPortionWithHttpInfo(GetParagraphPortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getParagraphPortionCall(request, null, null);
        Type returnType = new TypeToken<PortionResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide shapes or shape info. (asynchronously)
     * 
     * @param request Request for getParagraphPortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getParagraphPortionAsync(GetParagraphPortionRequest request, final ApiCallback<PortionResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getParagraphPortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<PortionResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getParagraphPortions
     * @param request Request for getParagraphPortions. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getParagraphPortionsCall(GetParagraphPortionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getParagraphPortions(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getParagraphPortions(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getParagraphPortions(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getParagraphPortions(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling getParagraphPortions(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions"
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
     * @param request Request for getParagraphPortions. (required)
     * @return PortionListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortionListResponse getParagraphPortions(GetParagraphPortionsRequest request) throws ApiException {
        try {
            ApiResponse<PortionListResponse> resp = getParagraphPortionsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<PortionListResponse> resp = getParagraphPortionsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getParagraphPortions. (required)
     * @return ApiResponse&lt;PortionListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortionListResponse> getParagraphPortionsWithHttpInfo(GetParagraphPortionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getParagraphPortionsCall(request, null, null);
        Type returnType = new TypeToken<PortionListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide shapes or shape info. (asynchronously)
     * 
     * @param request Request for getParagraphPortions. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getParagraphPortionsAsync(GetParagraphPortionsRequest request, final ApiCallback<PortionListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getParagraphPortionsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<PortionListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getShapeParagraph
     * @param request Request for getShapeParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getShapeParagraphCall(GetShapeParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getShapeParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getShapeParagraph(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getShapeParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getShapeParagraph(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling getShapeParagraph(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}"
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
     * @param request Request for getShapeParagraph. (required)
     * @return ParagraphResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphResponse getShapeParagraph(GetShapeParagraphRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphResponse> resp = getShapeParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ParagraphResponse> resp = getShapeParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getShapeParagraph. (required)
     * @return ApiResponse&lt;ParagraphResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ParagraphResponse> getShapeParagraphWithHttpInfo(GetShapeParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getShapeParagraphCall(request, null, null);
        Type returnType = new TypeToken<ParagraphResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide shapes or shape info. (asynchronously)
     * 
     * @param request Request for getShapeParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getShapeParagraphAsync(GetShapeParagraphRequest request, final ApiCallback<ParagraphResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getShapeParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ParagraphResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getShapeWithFormat
     * @param request Request for getShapeWithFormat. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getShapeWithFormatCall(GetShapeWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getShapeWithFormat(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getShapeWithFormat(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getShapeWithFormat(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling getShapeWithFormat(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{shapeIndex}/saveAs/{format}"
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
     * @param request Request for getShapeWithFormat. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getShapeWithFormat(GetShapeWithFormatRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getShapeWithFormatWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = getShapeWithFormatWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for getShapeWithFormat. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getShapeWithFormatWithHttpInfo(GetShapeWithFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getShapeWithFormatCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Render shape to specified picture format. (asynchronously)
     * 
     * @param request Request for getShapeWithFormat. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getShapeWithFormatAsync(GetShapeWithFormatRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getShapeWithFormatCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlideShape
     * @param request Request for getSlideShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlideShapeCall(GetSlideShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlideShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlideShape(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getSlideShape(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getSlideShape(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}"
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
     * @param request Request for getSlideShape. (required)
     * @return ShapeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeResponse getSlideShape(GetSlideShapeRequest request) throws ApiException {
        try {
            ApiResponse<ShapeResponse> resp = getSlideShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeResponse> resp = getSlideShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getSlideShape. (required)
     * @return ApiResponse&lt;ShapeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeResponse> getSlideShapeWithHttpInfo(GetSlideShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlideShapeCall(request, null, null);
        Type returnType = new TypeToken<ShapeResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide shapes or shape info. (asynchronously)
     * 
     * @param request Request for getSlideShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlideShapeAsync(GetSlideShapeRequest request, final ApiCallback<ShapeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlideShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlideShapeParagraphs
     * @param request Request for getSlideShapeParagraphs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlideShapeParagraphsCall(GetSlideShapeParagraphsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlideShapeParagraphs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlideShapeParagraphs(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getSlideShapeParagraphs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling getSlideShapeParagraphs(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs"
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
     * @param request Request for getSlideShapeParagraphs. (required)
     * @return ParagraphListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphListResponse getSlideShapeParagraphs(GetSlideShapeParagraphsRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphListResponse> resp = getSlideShapeParagraphsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ParagraphListResponse> resp = getSlideShapeParagraphsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getSlideShapeParagraphs. (required)
     * @return ApiResponse&lt;ParagraphListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ParagraphListResponse> getSlideShapeParagraphsWithHttpInfo(GetSlideShapeParagraphsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlideShapeParagraphsCall(request, null, null);
        Type returnType = new TypeToken<ParagraphListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide shapes or shape info. (asynchronously)
     * 
     * @param request Request for getSlideShapeParagraphs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlideShapeParagraphsAsync(GetSlideShapeParagraphsRequest request, final ApiCallback<ParagraphListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlideShapeParagraphsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ParagraphListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlideShapes
     * @param request Request for getSlideShapes. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlideShapesCall(GetSlideShapesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlideShapes(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlideShapes(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling getSlideShapes(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}"
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
     * @param request Request for getSlideShapes. (required)
     * @return ShapeListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeListResponse getSlideShapes(GetSlideShapesRequest request) throws ApiException {
        try {
            ApiResponse<ShapeListResponse> resp = getSlideShapesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeListResponse> resp = getSlideShapesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide shapes or shape info.
     * 
     * @param request Request for getSlideShapes. (required)
     * @return ApiResponse&lt;ShapeListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeListResponse> getSlideShapesWithHttpInfo(GetSlideShapesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlideShapesCall(request, null, null);
        Type returnType = new TypeToken<ShapeListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide shapes or shape info. (asynchronously)
     * 
     * @param request Request for getSlideShapes. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlideShapesAsync(GetSlideShapesRequest request, final ApiCallback<ShapeListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlideShapesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postAddNewParagraph
     * @param request Request for postAddNewParagraph. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postAddNewParagraphCall(PostAddNewParagraphRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postAddNewParagraph(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postAddNewParagraph(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling postAddNewParagraph(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling postAddNewParagraph(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs"
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
     * Creates new shape.
     * 
     * @param request Request for postAddNewParagraph. (required)
     * @return ParagraphResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphResponse postAddNewParagraph(PostAddNewParagraphRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphResponse> resp = postAddNewParagraphWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ParagraphResponse> resp = postAddNewParagraphWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Creates new shape.
     * 
     * @param request Request for postAddNewParagraph. (required)
     * @return ApiResponse&lt;ParagraphResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ParagraphResponse> postAddNewParagraphWithHttpInfo(PostAddNewParagraphRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postAddNewParagraphCall(request, null, null);
        Type returnType = new TypeToken<ParagraphResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Creates new shape. (asynchronously)
     * 
     * @param request Request for postAddNewParagraph. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAddNewParagraphAsync(PostAddNewParagraphRequest request, final ApiCallback<ParagraphResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postAddNewParagraphCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ParagraphResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postAddNewPortion
     * @param request Request for postAddNewPortion. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postAddNewPortionCall(PostAddNewPortionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postAddNewPortion(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postAddNewPortion(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling postAddNewPortion(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling postAddNewPortion(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling postAddNewPortion(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions"
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
     * Creates new shape.
     * 
     * @param request Request for postAddNewPortion. (required)
     * @return PortionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortionResponse postAddNewPortion(PostAddNewPortionRequest request) throws ApiException {
        try {
            ApiResponse<PortionResponse> resp = postAddNewPortionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<PortionResponse> resp = postAddNewPortionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Creates new shape.
     * 
     * @param request Request for postAddNewPortion. (required)
     * @return ApiResponse&lt;PortionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortionResponse> postAddNewPortionWithHttpInfo(PostAddNewPortionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postAddNewPortionCall(request, null, null);
        Type returnType = new TypeToken<PortionResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Creates new shape. (asynchronously)
     * 
     * @param request Request for postAddNewPortion. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAddNewPortionAsync(PostAddNewPortionRequest request, final ApiCallback<PortionResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postAddNewPortionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<PortionResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postAddNewShape
     * @param request Request for postAddNewShape. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postAddNewShapeCall(PostAddNewShapeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postAddNewShape(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postAddNewShape(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling postAddNewShape(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}"
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
     * @param request Request for postAddNewShape. (required)
     * @return ShapeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeResponse postAddNewShape(PostAddNewShapeRequest request) throws ApiException {
        try {
            ApiResponse<ShapeResponse> resp = postAddNewShapeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeResponse> resp = postAddNewShapeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Creates new shape.
     * 
     * @param request Request for postAddNewShape. (required)
     * @return ApiResponse&lt;ShapeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeResponse> postAddNewShapeWithHttpInfo(PostAddNewShapeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postAddNewShapeCall(request, null, null);
        Type returnType = new TypeToken<ShapeResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Creates new shape. (asynchronously)
     * 
     * @param request Request for postAddNewShape. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAddNewShapeAsync(PostAddNewShapeRequest request, final ApiCallback<ShapeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postAddNewShapeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postShapeSaveAs
     * @param request Request for postShapeSaveAs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postShapeSaveAsCall(PostShapeSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling postShapeSaveAs(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling postShapeSaveAs(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{shapeIndex}/saveAs/{format}"
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
     * @param request Request for postShapeSaveAs. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postShapeSaveAs(PostShapeSaveAsRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postShapeSaveAsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = postShapeSaveAsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Render shape to specified picture format.
     * 
     * @param request Request for postShapeSaveAs. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> postShapeSaveAsWithHttpInfo(PostShapeSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postShapeSaveAsCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Render shape to specified picture format. (asynchronously)
     * 
     * @param request Request for postShapeSaveAs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postShapeSaveAsAsync(PostShapeSaveAsRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postShapeSaveAsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSetParagraphPortionProperties
     * @param request Request for putSetParagraphPortionProperties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSetParagraphPortionPropertiesCall(PutSetParagraphPortionPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSetParagraphPortionProperties(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSetParagraphPortionProperties(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling putSetParagraphPortionProperties(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putSetParagraphPortionProperties(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling putSetParagraphPortionProperties(Async)");
        }
        
        // verify the required parameter 'portionIndex' is set
        if (request.getPortionIndex() == null) {
            throw new ApiException("Missing the required parameter 'portionIndex' when calling putSetParagraphPortionProperties(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}/portions/{portionIndex}"
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
     * @param request Request for putSetParagraphPortionProperties. (required)
     * @return PortionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortionResponse putSetParagraphPortionProperties(PutSetParagraphPortionPropertiesRequest request) throws ApiException {
        try {
            ApiResponse<PortionResponse> resp = putSetParagraphPortionPropertiesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<PortionResponse> resp = putSetParagraphPortionPropertiesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Updates shape properties.
     * 
     * @param request Request for putSetParagraphPortionProperties. (required)
     * @return ApiResponse&lt;PortionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortionResponse> putSetParagraphPortionPropertiesWithHttpInfo(PutSetParagraphPortionPropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSetParagraphPortionPropertiesCall(request, null, null);
        Type returnType = new TypeToken<PortionResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Updates shape properties. (asynchronously)
     * 
     * @param request Request for putSetParagraphPortionProperties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSetParagraphPortionPropertiesAsync(PutSetParagraphPortionPropertiesRequest request, final ApiCallback<PortionResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putSetParagraphPortionPropertiesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<PortionResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSetParagraphProperties
     * @param request Request for putSetParagraphProperties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSetParagraphPropertiesCall(PutSetParagraphPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSetParagraphProperties(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSetParagraphProperties(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling putSetParagraphProperties(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putSetParagraphProperties(Async)");
        }
        
        // verify the required parameter 'paragraphIndex' is set
        if (request.getParagraphIndex() == null) {
            throw new ApiException("Missing the required parameter 'paragraphIndex' when calling putSetParagraphProperties(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}/paragraphs/{paragraphIndex}"
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
     * @param request Request for putSetParagraphProperties. (required)
     * @return ParagraphResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParagraphResponse putSetParagraphProperties(PutSetParagraphPropertiesRequest request) throws ApiException {
        try {
            ApiResponse<ParagraphResponse> resp = putSetParagraphPropertiesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ParagraphResponse> resp = putSetParagraphPropertiesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Updates shape properties.
     * 
     * @param request Request for putSetParagraphProperties. (required)
     * @return ApiResponse&lt;ParagraphResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ParagraphResponse> putSetParagraphPropertiesWithHttpInfo(PutSetParagraphPropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSetParagraphPropertiesCall(request, null, null);
        Type returnType = new TypeToken<ParagraphResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Updates shape properties. (asynchronously)
     * 
     * @param request Request for putSetParagraphProperties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSetParagraphPropertiesAsync(PutSetParagraphPropertiesRequest request, final ApiCallback<ParagraphResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putSetParagraphPropertiesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ParagraphResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlideShapeInfo
     * @param request Request for putSlideShapeInfo. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlideShapeInfoCall(PutSlideShapeInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlideShapeInfo(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSlideShapeInfo(Async)");
        }
        
        // verify the required parameter 'path' is set
        if (request.getPath() == null) {
            throw new ApiException("Missing the required parameter 'path' when calling putSlideShapeInfo(Async)");
        }
        
        // verify the required parameter 'shapeIndex' is set
        if (request.getShapeIndex() == null) {
            throw new ApiException("Missing the required parameter 'shapeIndex' when calling putSlideShapeInfo(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/shapes/{path}/{shapeIndex}"
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
     * @param request Request for putSlideShapeInfo. (required)
     * @return ShapeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ShapeResponse putSlideShapeInfo(PutSlideShapeInfoRequest request) throws ApiException {
        try {
            ApiResponse<ShapeResponse> resp = putSlideShapeInfoWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ShapeResponse> resp = putSlideShapeInfoWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Updates shape properties.
     * 
     * @param request Request for putSlideShapeInfo. (required)
     * @return ApiResponse&lt;ShapeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ShapeResponse> putSlideShapeInfoWithHttpInfo(PutSlideShapeInfoRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlideShapeInfoCall(request, null, null);
        Type returnType = new TypeToken<ShapeResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Updates shape properties. (asynchronously)
     * 
     * @param request Request for putSlideShapeInfo. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlideShapeInfoAsync(PutSlideShapeInfoRequest request, final ApiCallback<ShapeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putSlideShapeInfoCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ShapeResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
}
