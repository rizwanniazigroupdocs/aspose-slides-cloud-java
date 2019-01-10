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


import com.aspose.slides.model.DocumentResponse;
import com.aspose.slides.model.OrderedMergeRequest;
import com.aspose.slides.model.PresentationsMergeRequest;
import com.aspose.slides.model.request.PostPresentationMergeRequest;
import com.aspose.slides.model.request.PutPresentationMergeRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeDocumentApi extends ApiBase {
    public MergeDocumentApi(Configuration configuration) {
        super(configuration);
    }

    public MergeDocumentApi(String appSid, String appKey) {
        super(appSid, appKey);
    }

    /**
     * Build call for postPresentationMerge
     * @param request Request for postPresentationMerge. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postPresentationMergeCall(PostPresentationMergeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postPresentationMerge(Async)");
        }
        
        Object postBody = request.getRequest();

        // create path and map variables
        String path = "/slides/{name}/merge"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());

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
     * Merge the presentation with other presentations specified in the request parameter.
     * 
     * @param request Request for postPresentationMerge. (required)
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse postPresentationMerge(PostPresentationMergeRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = postPresentationMergeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentResponse> resp = postPresentationMergeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Merge the presentation with other presentations specified in the request parameter.
     * 
     * @param request Request for postPresentationMerge. (required)
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResponse> postPresentationMergeWithHttpInfo(PostPresentationMergeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postPresentationMergeCall(request, null, null);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Merge the presentation with other presentations specified in the request parameter. (asynchronously)
     * 
     * @param request Request for postPresentationMerge. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postPresentationMergeAsync(PostPresentationMergeRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postPresentationMergeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putPresentationMerge
     * @param request Request for putPresentationMerge. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putPresentationMergeCall(PutPresentationMergeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putPresentationMerge(Async)");
        }
        
        Object postBody = request.getRequest();

        // create path and map variables
        String path = "/slides/{name}/merge"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());

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
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     * 
     * @param request Request for putPresentationMerge. (required)
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse putPresentationMerge(PutPresentationMergeRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = putPresentationMergeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentResponse> resp = putPresentationMergeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter.
     * 
     * @param request Request for putPresentationMerge. (required)
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResponse> putPresentationMergeWithHttpInfo(PutPresentationMergeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putPresentationMergeCall(request, null, null);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Merge the presentation with other presentations or some of their slides specified in the request parameter. (asynchronously)
     * 
     * @param request Request for putPresentationMerge. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putPresentationMergeAsync(PutPresentationMergeRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putPresentationMergeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
}
