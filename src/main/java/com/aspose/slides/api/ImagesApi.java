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
import com.aspose.slides.model.ImagesResponse;
import com.aspose.slides.model.request.GetSlidesImageWithFormatRequest;
import com.aspose.slides.model.request.GetSlidesImagesRequest;
import com.aspose.slides.model.request.GetSlidesSlideImagesRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImagesApi extends ApiBase {
    public ImagesApi(Configuration configuration) {
        super(configuration);
    }

    public ImagesApi(String appSid, String appKey) {
        super(appSid, appKey);
    }

    /**
     * Build call for getSlidesImageWithFormat
     * @param request Request for getSlidesImageWithFormat. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesImageWithFormatCall(GetSlidesImageWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesImageWithFormat(Async)");
        }
        
        // verify the required parameter 'index' is set
        if (request.getIndex() == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getSlidesImageWithFormat(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/images/{index}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "index" + "\\}", getApiClient().escapeString(request.getIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "format", request.getFormat());
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
     * Get image in specified format.
     * 
     * @param request Request for getSlidesImageWithFormat. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getSlidesImageWithFormat(GetSlidesImageWithFormatRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getSlidesImageWithFormatWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = getSlidesImageWithFormatWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Get image in specified format.
     * 
     * @param request Request for getSlidesImageWithFormat. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getSlidesImageWithFormatWithHttpInfo(GetSlidesImageWithFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesImageWithFormatCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Get image in specified format. (asynchronously)
     * 
     * @param request Request for getSlidesImageWithFormat. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesImageWithFormatAsync(GetSlidesImageWithFormatRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesImageWithFormatCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesImages
     * @param request Request for getSlidesImages. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesImagesCall(GetSlidesImagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesImages(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/images"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

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
     * Read presentation images info.
     * 
     * @param request Request for getSlidesImages. (required)
     * @return ImagesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImagesResponse getSlidesImages(GetSlidesImagesRequest request) throws ApiException {
        try {
            ApiResponse<ImagesResponse> resp = getSlidesImagesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ImagesResponse> resp = getSlidesImagesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation images info.
     * 
     * @param request Request for getSlidesImages. (required)
     * @return ApiResponse&lt;ImagesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImagesResponse> getSlidesImagesWithHttpInfo(GetSlidesImagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesImagesCall(request, null, null);
        Type returnType = new TypeToken<ImagesResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read presentation images info. (asynchronously)
     * 
     * @param request Request for getSlidesImages. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesImagesAsync(GetSlidesImagesRequest request, final ApiCallback<ImagesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesImagesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ImagesResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesSlideImages
     * @param request Request for getSlidesSlideImages. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideImagesCall(GetSlidesSlideImagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesSlideImages(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesSlideImages(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/images"
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
        return getApiClient().buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide images info.
     * 
     * @param request Request for getSlidesSlideImages. (required)
     * @return ImagesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImagesResponse getSlidesSlideImages(GetSlidesSlideImagesRequest request) throws ApiException {
        try {
            ApiResponse<ImagesResponse> resp = getSlidesSlideImagesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ImagesResponse> resp = getSlidesSlideImagesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide images info.
     * 
     * @param request Request for getSlidesSlideImages. (required)
     * @return ApiResponse&lt;ImagesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImagesResponse> getSlidesSlideImagesWithHttpInfo(GetSlidesSlideImagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesSlideImagesCall(request, null, null);
        Type returnType = new TypeToken<ImagesResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide images info. (asynchronously)
     * 
     * @param request Request for getSlidesSlideImages. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideImagesAsync(GetSlidesSlideImagesRequest request, final ApiCallback<ImagesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesSlideImagesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ImagesResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
}
