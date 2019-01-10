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


import com.aspose.slides.model.PresentationStringReplaceResponse;
import com.aspose.slides.model.SlideStringReplaceResponse;
import com.aspose.slides.model.TextItemsResponse;
import com.aspose.slides.model.request.GetSlidesPresentationTextItemsRequest;
import com.aspose.slides.model.request.GetSlidesSlideTextItemsRequest;
import com.aspose.slides.model.request.PostSlidesPresentationReplaceTextRequest;
import com.aspose.slides.model.request.PostSlidesSlideReplaceTextRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextApi extends ApiBase {
    public TextApi(Configuration configuration) {
        super(configuration);
    }

    public TextApi(String appSid, String appKey) {
        super(appSid, appKey);
    }

    /**
     * Build call for getSlidesPresentationTextItems
     * @param request Request for getSlidesPresentationTextItems. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesPresentationTextItemsCall(GetSlidesPresentationTextItemsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesPresentationTextItems(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/textItems"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "withEmpty", request.getWithEmpty());
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
     * Extract presentation text items.
     * 
     * @param request Request for getSlidesPresentationTextItems. (required)
     * @return TextItemsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TextItemsResponse getSlidesPresentationTextItems(GetSlidesPresentationTextItemsRequest request) throws ApiException {
        try {
            ApiResponse<TextItemsResponse> resp = getSlidesPresentationTextItemsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<TextItemsResponse> resp = getSlidesPresentationTextItemsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Extract presentation text items.
     * 
     * @param request Request for getSlidesPresentationTextItems. (required)
     * @return ApiResponse&lt;TextItemsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TextItemsResponse> getSlidesPresentationTextItemsWithHttpInfo(GetSlidesPresentationTextItemsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesPresentationTextItemsCall(request, null, null);
        Type returnType = new TypeToken<TextItemsResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Extract presentation text items. (asynchronously)
     * 
     * @param request Request for getSlidesPresentationTextItems. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesPresentationTextItemsAsync(GetSlidesPresentationTextItemsRequest request, final ApiCallback<TextItemsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesPresentationTextItemsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<TextItemsResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesSlideTextItems
     * @param request Request for getSlidesSlideTextItems. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideTextItemsCall(GetSlidesSlideTextItemsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesSlideTextItems(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesSlideTextItems(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/textItems"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "withEmpty", request.getWithEmpty());
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
     * Extract slide text items.
     * 
     * @param request Request for getSlidesSlideTextItems. (required)
     * @return TextItemsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TextItemsResponse getSlidesSlideTextItems(GetSlidesSlideTextItemsRequest request) throws ApiException {
        try {
            ApiResponse<TextItemsResponse> resp = getSlidesSlideTextItemsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<TextItemsResponse> resp = getSlidesSlideTextItemsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Extract slide text items.
     * 
     * @param request Request for getSlidesSlideTextItems. (required)
     * @return ApiResponse&lt;TextItemsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TextItemsResponse> getSlidesSlideTextItemsWithHttpInfo(GetSlidesSlideTextItemsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesSlideTextItemsCall(request, null, null);
        Type returnType = new TypeToken<TextItemsResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Extract slide text items. (asynchronously)
     * 
     * @param request Request for getSlidesSlideTextItems. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideTextItemsAsync(GetSlidesSlideTextItemsRequest request, final ApiCallback<TextItemsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesSlideTextItemsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<TextItemsResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesPresentationReplaceText
     * @param request Request for postSlidesPresentationReplaceText. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesPresentationReplaceTextCall(PostSlidesPresentationReplaceTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesPresentationReplaceText(Async)");
        }
        
        // verify the required parameter 'oldValue' is set
        if (request.getOldValue() == null) {
            throw new ApiException("Missing the required parameter 'oldValue' when calling postSlidesPresentationReplaceText(Async)");
        }
        
        // verify the required parameter 'newValue' is set
        if (request.getNewValue() == null) {
            throw new ApiException("Missing the required parameter 'newValue' when calling postSlidesPresentationReplaceText(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/replaceText"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "oldValue", request.getOldValue());
        getApiClient().addQueryParameter(queryParams, "newValue", request.getNewValue());
        getApiClient().addQueryParameter(queryParams, "ignoreCase", request.getIgnoreCase());
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
     * Replace text with a new value.
     * 
     * @param request Request for postSlidesPresentationReplaceText. (required)
     * @return PresentationStringReplaceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PresentationStringReplaceResponse postSlidesPresentationReplaceText(PostSlidesPresentationReplaceTextRequest request) throws ApiException {
        try {
            ApiResponse<PresentationStringReplaceResponse> resp = postSlidesPresentationReplaceTextWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<PresentationStringReplaceResponse> resp = postSlidesPresentationReplaceTextWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Replace text with a new value.
     * 
     * @param request Request for postSlidesPresentationReplaceText. (required)
     * @return ApiResponse&lt;PresentationStringReplaceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PresentationStringReplaceResponse> postSlidesPresentationReplaceTextWithHttpInfo(PostSlidesPresentationReplaceTextRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesPresentationReplaceTextCall(request, null, null);
        Type returnType = new TypeToken<PresentationStringReplaceResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Replace text with a new value. (asynchronously)
     * 
     * @param request Request for postSlidesPresentationReplaceText. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesPresentationReplaceTextAsync(PostSlidesPresentationReplaceTextRequest request, final ApiCallback<PresentationStringReplaceResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postSlidesPresentationReplaceTextCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<PresentationStringReplaceResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesSlideReplaceText
     * @param request Request for postSlidesSlideReplaceText. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesSlideReplaceTextCall(PostSlidesSlideReplaceTextRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesSlideReplaceText(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postSlidesSlideReplaceText(Async)");
        }
        
        // verify the required parameter 'oldValue' is set
        if (request.getOldValue() == null) {
            throw new ApiException("Missing the required parameter 'oldValue' when calling postSlidesSlideReplaceText(Async)");
        }
        
        // verify the required parameter 'newValue' is set
        if (request.getNewValue() == null) {
            throw new ApiException("Missing the required parameter 'newValue' when calling postSlidesSlideReplaceText(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/replaceText"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "oldValue", request.getOldValue());
        getApiClient().addQueryParameter(queryParams, "newValue", request.getNewValue());
        getApiClient().addQueryParameter(queryParams, "ignoreCase", request.getIgnoreCase());
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
     * Replace text with a new value.
     * 
     * @param request Request for postSlidesSlideReplaceText. (required)
     * @return SlideStringReplaceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideStringReplaceResponse postSlidesSlideReplaceText(PostSlidesSlideReplaceTextRequest request) throws ApiException {
        try {
            ApiResponse<SlideStringReplaceResponse> resp = postSlidesSlideReplaceTextWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideStringReplaceResponse> resp = postSlidesSlideReplaceTextWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Replace text with a new value.
     * 
     * @param request Request for postSlidesSlideReplaceText. (required)
     * @return ApiResponse&lt;SlideStringReplaceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideStringReplaceResponse> postSlidesSlideReplaceTextWithHttpInfo(PostSlidesSlideReplaceTextRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesSlideReplaceTextCall(request, null, null);
        Type returnType = new TypeToken<SlideStringReplaceResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Replace text with a new value. (asynchronously)
     * 
     * @param request Request for postSlidesSlideReplaceText. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesSlideReplaceTextAsync(PostSlidesSlideReplaceTextRequest request, final ApiCallback<SlideStringReplaceResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postSlidesSlideReplaceTextCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideStringReplaceResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
}
