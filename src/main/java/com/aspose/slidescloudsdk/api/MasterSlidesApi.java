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


import com.aspose.slidescloudsdk.model.MasterSlideListResponse;
import com.aspose.slidescloudsdk.model.MasterSlideResponse;
import com.aspose.slidescloudsdk.model.request.GetMasterSlideRequest;
import com.aspose.slidescloudsdk.model.request.GetMasterSlidesListRequest;
import com.aspose.slidescloudsdk.model.request.PostCopyMasterSlideFromSourcePresentationRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MasterSlidesApi extends ApiBase {
    public MasterSlidesApi(Configuration configuration) {
        super(configuration);
    }

    public MasterSlidesApi(String appSid, String appKey) {
        super(appSid, appKey);
    }

    /**
     * Build call for getMasterSlide
     * @param request Request for getMasterSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMasterSlideCall(GetMasterSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getMasterSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getMasterSlide(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/masterSlides/{slideIndex}"
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
     * Read presentation masterSlide info.
     * 
     * @param request Request for getMasterSlide. (required)
     * @return MasterSlideResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MasterSlideResponse getMasterSlide(GetMasterSlideRequest request) throws ApiException {
        try {
            ApiResponse<MasterSlideResponse> resp = getMasterSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<MasterSlideResponse> resp = getMasterSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation masterSlide info.
     * 
     * @param request Request for getMasterSlide. (required)
     * @return ApiResponse&lt;MasterSlideResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MasterSlideResponse> getMasterSlideWithHttpInfo(GetMasterSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getMasterSlideCall(request, null, null);
        Type returnType = new TypeToken<MasterSlideResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read presentation masterSlide info. (asynchronously)
     * 
     * @param request Request for getMasterSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMasterSlideAsync(GetMasterSlideRequest request, final ApiCallback<MasterSlideResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMasterSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<MasterSlideResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getMasterSlidesList
     * @param request Request for getMasterSlidesList. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMasterSlidesListCall(GetMasterSlidesListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getMasterSlidesList(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/masterSlides"
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
     * Read presentation masterSlides info.
     * 
     * @param request Request for getMasterSlidesList. (required)
     * @return MasterSlideListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MasterSlideListResponse getMasterSlidesList(GetMasterSlidesListRequest request) throws ApiException {
        try {
            ApiResponse<MasterSlideListResponse> resp = getMasterSlidesListWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<MasterSlideListResponse> resp = getMasterSlidesListWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation masterSlides info.
     * 
     * @param request Request for getMasterSlidesList. (required)
     * @return ApiResponse&lt;MasterSlideListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MasterSlideListResponse> getMasterSlidesListWithHttpInfo(GetMasterSlidesListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getMasterSlidesListCall(request, null, null);
        Type returnType = new TypeToken<MasterSlideListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read presentation masterSlides info. (asynchronously)
     * 
     * @param request Request for getMasterSlidesList. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMasterSlidesListAsync(GetMasterSlidesListRequest request, final ApiCallback<MasterSlideListResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMasterSlidesListCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<MasterSlideListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postCopyMasterSlideFromSourcePresentation
     * @param request Request for postCopyMasterSlideFromSourcePresentation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postCopyMasterSlideFromSourcePresentationCall(PostCopyMasterSlideFromSourcePresentationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postCopyMasterSlideFromSourcePresentation(Async)");
        }
        
        // verify the required parameter 'cloneFrom' is set
        if (request.getCloneFrom() == null) {
            throw new ApiException("Missing the required parameter 'cloneFrom' when calling postCopyMasterSlideFromSourcePresentation(Async)");
        }
        
        // verify the required parameter 'cloneFromPosition' is set
        if (request.getCloneFromPosition() == null) {
            throw new ApiException("Missing the required parameter 'cloneFromPosition' when calling postCopyMasterSlideFromSourcePresentation(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/masterSlides"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "cloneFrom", request.getCloneFrom());
        getApiClient().addQueryParameter(queryParams, "cloneFromPosition", request.getCloneFromPosition());
        getApiClient().addQueryParameter(queryParams, "cloneFromPassword", request.getCloneFromPassword());
        getApiClient().addQueryParameter(queryParams, "cloneFromStorage", request.getCloneFromStorage());
        getApiClient().addQueryParameter(queryParams, "applyToAll", request.getApplyToAll());
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
     * Copy masterSlide from source presentation.
     * 
     * @param request Request for postCopyMasterSlideFromSourcePresentation. (required)
     * @return MasterSlideResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MasterSlideResponse postCopyMasterSlideFromSourcePresentation(PostCopyMasterSlideFromSourcePresentationRequest request) throws ApiException {
        try {
            ApiResponse<MasterSlideResponse> resp = postCopyMasterSlideFromSourcePresentationWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<MasterSlideResponse> resp = postCopyMasterSlideFromSourcePresentationWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Copy masterSlide from source presentation.
     * 
     * @param request Request for postCopyMasterSlideFromSourcePresentation. (required)
     * @return ApiResponse&lt;MasterSlideResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MasterSlideResponse> postCopyMasterSlideFromSourcePresentationWithHttpInfo(PostCopyMasterSlideFromSourcePresentationRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postCopyMasterSlideFromSourcePresentationCall(request, null, null);
        Type returnType = new TypeToken<MasterSlideResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Copy masterSlide from source presentation. (asynchronously)
     * 
     * @param request Request for postCopyMasterSlideFromSourcePresentation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postCopyMasterSlideFromSourcePresentationAsync(PostCopyMasterSlideFromSourcePresentationRequest request, final ApiCallback<MasterSlideResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postCopyMasterSlideFromSourcePresentationCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<MasterSlideResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
}
