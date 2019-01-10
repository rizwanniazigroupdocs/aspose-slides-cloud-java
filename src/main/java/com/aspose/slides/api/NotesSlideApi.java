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
import com.aspose.slides.model.NotesSlide;
import com.aspose.slides.model.NotesSlideResponse;
import com.aspose.slides.model.SlideResponse;
import com.aspose.slides.model.request.DeleteNotesSlideRequest;
import com.aspose.slides.model.request.GetNotesSlideRequest;
import com.aspose.slides.model.request.GetNotesSlideWithFormatRequest;
import com.aspose.slides.model.request.PostAddNotesSlideRequest;
import com.aspose.slides.model.request.PutUpdateNotesSlideRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotesSlideApi extends ApiBase {
    public NotesSlideApi(Configuration configuration) {
        super(configuration);
    }

    public NotesSlideApi(String appSid, String appKey) {
        super(appSid, appKey);
    }

    /**
     * Build call for deleteNotesSlide
     * @param request Request for deleteNotesSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideCall(DeleteNotesSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNotesSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteNotesSlide(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()));

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
     * Remove Notes Slide.
     * 
     * @param request Request for deleteNotesSlide. (required)
     * @return SlideResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideResponse deleteNotesSlide(DeleteNotesSlideRequest request) throws ApiException {
        try {
            ApiResponse<SlideResponse> resp = deleteNotesSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideResponse> resp = deleteNotesSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove Notes Slide.
     * 
     * @param request Request for deleteNotesSlide. (required)
     * @return ApiResponse&lt;SlideResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideResponse> deleteNotesSlideWithHttpInfo(DeleteNotesSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteNotesSlideCall(request, null, null);
        Type returnType = new TypeToken<SlideResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Remove Notes Slide. (asynchronously)
     * 
     * @param request Request for deleteNotesSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNotesSlideAsync(DeleteNotesSlideRequest request, final ApiCallback<SlideResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteNotesSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlide
     * @param request Request for getNotesSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideCall(GetNotesSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlide(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()));

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
     * Read Notes slide info.
     * 
     * @param request Request for getNotesSlide. (required)
     * @return NotesSlideResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NotesSlideResponse getNotesSlide(GetNotesSlideRequest request) throws ApiException {
        try {
            ApiResponse<NotesSlideResponse> resp = getNotesSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<NotesSlideResponse> resp = getNotesSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read Notes slide info.
     * 
     * @param request Request for getNotesSlide. (required)
     * @return ApiResponse&lt;NotesSlideResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NotesSlideResponse> getNotesSlideWithHttpInfo(GetNotesSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideCall(request, null, null);
        Type returnType = new TypeToken<NotesSlideResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read Notes slide info. (asynchronously)
     * 
     * @param request Request for getNotesSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideAsync(GetNotesSlideRequest request, final ApiCallback<NotesSlideResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNotesSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<NotesSlideResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getNotesSlideWithFormat
     * @param request Request for getNotesSlideWithFormat. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideWithFormatCall(GetNotesSlideWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNotesSlideWithFormat(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getNotesSlideWithFormat(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling getNotesSlideWithFormat(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide/saveAs/{format}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "format" + "\\}", getApiClient().escapeString(request.getFormat().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "width", request.getWidth());
        getApiClient().addQueryParameter(queryParams, "height", request.getHeight());
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
     * Convert Notes Slide to the specified picture format.
     * 
     * @param request Request for getNotesSlideWithFormat. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getNotesSlideWithFormat(GetNotesSlideWithFormatRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getNotesSlideWithFormatWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = getNotesSlideWithFormatWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Convert Notes Slide to the specified picture format.
     * 
     * @param request Request for getNotesSlideWithFormat. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getNotesSlideWithFormatWithHttpInfo(GetNotesSlideWithFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getNotesSlideWithFormatCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Convert Notes Slide to the specified picture format. (asynchronously)
     * 
     * @param request Request for getNotesSlideWithFormat. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesSlideWithFormatAsync(GetNotesSlideWithFormatRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNotesSlideWithFormatCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postAddNotesSlide
     * @param request Request for postAddNotesSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postAddNotesSlideCall(PostAddNotesSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postAddNotesSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postAddNotesSlide(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()));

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
        return getApiClient().buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Add new Notes Slide.
     * 
     * @param request Request for postAddNotesSlide. (required)
     * @return NotesSlideResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NotesSlideResponse postAddNotesSlide(PostAddNotesSlideRequest request) throws ApiException {
        try {
            ApiResponse<NotesSlideResponse> resp = postAddNotesSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<NotesSlideResponse> resp = postAddNotesSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Add new Notes Slide.
     * 
     * @param request Request for postAddNotesSlide. (required)
     * @return ApiResponse&lt;NotesSlideResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NotesSlideResponse> postAddNotesSlideWithHttpInfo(PostAddNotesSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postAddNotesSlideCall(request, null, null);
        Type returnType = new TypeToken<NotesSlideResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Add new Notes Slide. (asynchronously)
     * 
     * @param request Request for postAddNotesSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postAddNotesSlideAsync(PostAddNotesSlideRequest request, final ApiCallback<NotesSlideResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postAddNotesSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<NotesSlideResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putUpdateNotesSlide
     * @param request Request for putUpdateNotesSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideCall(PutUpdateNotesSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putUpdateNotesSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putUpdateNotesSlide(Async)");
        }
        
        Object postBody = request.getDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/notesSlide"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()));

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
     * Update Notes Slide properties.
     * 
     * @param request Request for putUpdateNotesSlide. (required)
     * @return NotesSlideResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NotesSlideResponse putUpdateNotesSlide(PutUpdateNotesSlideRequest request) throws ApiException {
        try {
            ApiResponse<NotesSlideResponse> resp = putUpdateNotesSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<NotesSlideResponse> resp = putUpdateNotesSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Update Notes Slide properties.
     * 
     * @param request Request for putUpdateNotesSlide. (required)
     * @return ApiResponse&lt;NotesSlideResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NotesSlideResponse> putUpdateNotesSlideWithHttpInfo(PutUpdateNotesSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putUpdateNotesSlideCall(request, null, null);
        Type returnType = new TypeToken<NotesSlideResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Update Notes Slide properties. (asynchronously)
     * 
     * @param request Request for putUpdateNotesSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putUpdateNotesSlideAsync(PutUpdateNotesSlideRequest request, final ApiCallback<NotesSlideResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putUpdateNotesSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<NotesSlideResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
}
