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


import com.aspose.slidescloudsdk.model.LayoutSlide;
import com.aspose.slidescloudsdk.model.LayoutSlideListResponse;
import com.aspose.slidescloudsdk.model.LayoutSlideResponse;
import com.aspose.slidescloudsdk.model.request.GetLayoutSlideRequest;
import com.aspose.slidescloudsdk.model.request.GetLayoutSlidesListRequest;
import com.aspose.slidescloudsdk.model.request.PostCopyLayoutSlideFromSourcePresentationRequest;
import com.aspose.slidescloudsdk.model.request.PutLayoutSlideRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LayoutSlidesApi extends ApiBase {
    public LayoutSlidesApi(Configuration configuration) {
        super(configuration);
    }

    public LayoutSlidesApi(String appSid, String appKey) {
        super(appSid, appKey);
    }

    /**
     * Build call for getLayoutSlide
     * @param request Request for getLayoutSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLayoutSlideCall(GetLayoutSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getLayoutSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getLayoutSlide(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/layoutSlides/{slideIndex}"
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
     * Read presentation layoutSlide info.
     * 
     * @param request Request for getLayoutSlide. (required)
     * @return LayoutSlideResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LayoutSlideResponse getLayoutSlide(GetLayoutSlideRequest request) throws ApiException {
        try {
            ApiResponse<LayoutSlideResponse> resp = getLayoutSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<LayoutSlideResponse> resp = getLayoutSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation layoutSlide info.
     * 
     * @param request Request for getLayoutSlide. (required)
     * @return ApiResponse&lt;LayoutSlideResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LayoutSlideResponse> getLayoutSlideWithHttpInfo(GetLayoutSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getLayoutSlideCall(request, null, null);
        Type returnType = new TypeToken<LayoutSlideResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read presentation layoutSlide info. (asynchronously)
     * 
     * @param request Request for getLayoutSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLayoutSlideAsync(GetLayoutSlideRequest request, final ApiCallback<LayoutSlideResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLayoutSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<LayoutSlideResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getLayoutSlidesList
     * @param request Request for getLayoutSlidesList. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLayoutSlidesListCall(GetLayoutSlidesListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getLayoutSlidesList(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/layoutSlides"
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
     * Read presentation layoutSlides info.
     * 
     * @param request Request for getLayoutSlidesList. (required)
     * @return LayoutSlideListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LayoutSlideListResponse getLayoutSlidesList(GetLayoutSlidesListRequest request) throws ApiException {
        try {
            ApiResponse<LayoutSlideListResponse> resp = getLayoutSlidesListWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<LayoutSlideListResponse> resp = getLayoutSlidesListWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation layoutSlides info.
     * 
     * @param request Request for getLayoutSlidesList. (required)
     * @return ApiResponse&lt;LayoutSlideListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LayoutSlideListResponse> getLayoutSlidesListWithHttpInfo(GetLayoutSlidesListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getLayoutSlidesListCall(request, null, null);
        Type returnType = new TypeToken<LayoutSlideListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read presentation layoutSlides info. (asynchronously)
     * 
     * @param request Request for getLayoutSlidesList. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLayoutSlidesListAsync(GetLayoutSlidesListRequest request, final ApiCallback<LayoutSlideListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLayoutSlidesListCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<LayoutSlideListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postCopyLayoutSlideFromSourcePresentation
     * @param request Request for postCopyLayoutSlideFromSourcePresentation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postCopyLayoutSlideFromSourcePresentationCall(PostCopyLayoutSlideFromSourcePresentationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postCopyLayoutSlideFromSourcePresentation(Async)");
        }
        
        // verify the required parameter 'cloneFrom' is set
        if (request.getCloneFrom() == null) {
            throw new ApiException("Missing the required parameter 'cloneFrom' when calling postCopyLayoutSlideFromSourcePresentation(Async)");
        }
        
        // verify the required parameter 'cloneFromPosition' is set
        if (request.getCloneFromPosition() == null) {
            throw new ApiException("Missing the required parameter 'cloneFromPosition' when calling postCopyLayoutSlideFromSourcePresentation(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/layoutSlides"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "cloneFrom", request.getCloneFrom());
        getApiClient().addQueryParameter(queryParams, "cloneFromPosition", request.getCloneFromPosition());
        getApiClient().addQueryParameter(queryParams, "cloneFromPassword", request.getCloneFromPassword());
        getApiClient().addQueryParameter(queryParams, "cloneFromStorage", request.getCloneFromStorage());
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
     * Copy layoutSlide from source presentation.
     * 
     * @param request Request for postCopyLayoutSlideFromSourcePresentation. (required)
     * @return LayoutSlideResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LayoutSlideResponse postCopyLayoutSlideFromSourcePresentation(PostCopyLayoutSlideFromSourcePresentationRequest request) throws ApiException {
        try {
            ApiResponse<LayoutSlideResponse> resp = postCopyLayoutSlideFromSourcePresentationWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<LayoutSlideResponse> resp = postCopyLayoutSlideFromSourcePresentationWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Copy layoutSlide from source presentation.
     * 
     * @param request Request for postCopyLayoutSlideFromSourcePresentation. (required)
     * @return ApiResponse&lt;LayoutSlideResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LayoutSlideResponse> postCopyLayoutSlideFromSourcePresentationWithHttpInfo(PostCopyLayoutSlideFromSourcePresentationRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postCopyLayoutSlideFromSourcePresentationCall(request, null, null);
        Type returnType = new TypeToken<LayoutSlideResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Copy layoutSlide from source presentation. (asynchronously)
     * 
     * @param request Request for postCopyLayoutSlideFromSourcePresentation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCopyLayoutSlideFromSourcePresentationAsync(PostCopyLayoutSlideFromSourcePresentationRequest request, final ApiCallback<LayoutSlideResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postCopyLayoutSlideFromSourcePresentationCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<LayoutSlideResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putLayoutSlide
     * @param request Request for putLayoutSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putLayoutSlideCall(PutLayoutSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putLayoutSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putLayoutSlide(Async)");
        }
        
        Object postBody = request.getSlideDto();

        // create path and map variables
        String path = "/slides/{name}/layoutSlides/{slideIndex}"
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
     * Read presentation layoutSlide info.
     * 
     * @param request Request for putLayoutSlide. (required)
     * @return LayoutSlideResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LayoutSlideResponse putLayoutSlide(PutLayoutSlideRequest request) throws ApiException {
        try {
            ApiResponse<LayoutSlideResponse> resp = putLayoutSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<LayoutSlideResponse> resp = putLayoutSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation layoutSlide info.
     * 
     * @param request Request for putLayoutSlide. (required)
     * @return ApiResponse&lt;LayoutSlideResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LayoutSlideResponse> putLayoutSlideWithHttpInfo(PutLayoutSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putLayoutSlideCall(request, null, null);
        Type returnType = new TypeToken<LayoutSlideResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read presentation layoutSlide info. (asynchronously)
     * 
     * @param request Request for putLayoutSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putLayoutSlideAsync(PutLayoutSlideRequest request, final ApiCallback<LayoutSlideResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putLayoutSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<LayoutSlideResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
}
