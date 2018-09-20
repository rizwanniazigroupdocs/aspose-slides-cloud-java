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


import com.aspose.slidescloudsdk.model.DocumentProperties;
import com.aspose.slidescloudsdk.model.DocumentPropertiesResponse;
import com.aspose.slidescloudsdk.model.DocumentProperty;
import com.aspose.slidescloudsdk.model.DocumentPropertyResponse;
import com.aspose.slidescloudsdk.model.request.DeleteSlidesDocumentPropertiesRequest;
import com.aspose.slidescloudsdk.model.request.DeleteSlidesDocumentPropertyRequest;
import com.aspose.slidescloudsdk.model.request.GetSlidesDocumentPropertiesRequest;
import com.aspose.slidescloudsdk.model.request.GetSlidesDocumentPropertyRequest;
import com.aspose.slidescloudsdk.model.request.PostSlidesSetDocumentPropertiesRequest;
import com.aspose.slidescloudsdk.model.request.PutSlidesSetDocumentPropertyRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PropertiesApi extends ApiBase {
    public PropertiesApi(Configuration configuration) {
        super(configuration);
    }

    public PropertiesApi(String appSid, String appKey) {
        super(appSid, appKey);
    }

    /**
     * Build call for deleteSlidesDocumentProperties
     * @param request Request for deleteSlidesDocumentProperties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesDocumentPropertiesCall(DeleteSlidesDocumentPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlidesDocumentProperties(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/documentproperties"
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
        return getApiClient().buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Clean document properties.
     * 
     * @param request Request for deleteSlidesDocumentProperties. (required)
     * @return DocumentPropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPropertiesResponse deleteSlidesDocumentProperties(DeleteSlidesDocumentPropertiesRequest request) throws ApiException {
        try {
            ApiResponse<DocumentPropertiesResponse> resp = deleteSlidesDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentPropertiesResponse> resp = deleteSlidesDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Clean document properties.
     * 
     * @param request Request for deleteSlidesDocumentProperties. (required)
     * @return ApiResponse&lt;DocumentPropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentPropertiesResponse> deleteSlidesDocumentPropertiesWithHttpInfo(DeleteSlidesDocumentPropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlidesDocumentPropertiesCall(request, null, null);
        Type returnType = new TypeToken<DocumentPropertiesResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Clean document properties. (asynchronously)
     * 
     * @param request Request for deleteSlidesDocumentProperties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesDocumentPropertiesAsync(DeleteSlidesDocumentPropertiesRequest request, final ApiCallback<DocumentPropertiesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteSlidesDocumentPropertiesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentPropertiesResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlidesDocumentProperty
     * @param request Request for deleteSlidesDocumentProperty. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesDocumentPropertyCall(DeleteSlidesDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlidesDocumentProperty(Async)");
        }
        
        // verify the required parameter 'propertyName' is set
        if (request.getPropertyName() == null) {
            throw new ApiException("Missing the required parameter 'propertyName' when calling deleteSlidesDocumentProperty(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/documentproperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "propertyName" + "\\}", getApiClient().escapeString(request.getPropertyName().toString()));

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
     * Delete document property.
     * 
     * @param request Request for deleteSlidesDocumentProperty. (required)
     * @return DocumentPropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPropertiesResponse deleteSlidesDocumentProperty(DeleteSlidesDocumentPropertyRequest request) throws ApiException {
        try {
            ApiResponse<DocumentPropertiesResponse> resp = deleteSlidesDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentPropertiesResponse> resp = deleteSlidesDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Delete document property.
     * 
     * @param request Request for deleteSlidesDocumentProperty. (required)
     * @return ApiResponse&lt;DocumentPropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentPropertiesResponse> deleteSlidesDocumentPropertyWithHttpInfo(DeleteSlidesDocumentPropertyRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlidesDocumentPropertyCall(request, null, null);
        Type returnType = new TypeToken<DocumentPropertiesResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Delete document property. (asynchronously)
     * 
     * @param request Request for deleteSlidesDocumentProperty. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesDocumentPropertyAsync(DeleteSlidesDocumentPropertyRequest request, final ApiCallback<DocumentPropertiesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteSlidesDocumentPropertyCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentPropertiesResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesDocumentProperties
     * @param request Request for getSlidesDocumentProperties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentPropertiesCall(GetSlidesDocumentPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesDocumentProperties(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/documentproperties"
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
     * Read presentation document properties.
     * 
     * @param request Request for getSlidesDocumentProperties. (required)
     * @return DocumentPropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPropertiesResponse getSlidesDocumentProperties(GetSlidesDocumentPropertiesRequest request) throws ApiException {
        try {
            ApiResponse<DocumentPropertiesResponse> resp = getSlidesDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentPropertiesResponse> resp = getSlidesDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation document properties.
     * 
     * @param request Request for getSlidesDocumentProperties. (required)
     * @return ApiResponse&lt;DocumentPropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentPropertiesResponse> getSlidesDocumentPropertiesWithHttpInfo(GetSlidesDocumentPropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesDocumentPropertiesCall(request, null, null);
        Type returnType = new TypeToken<DocumentPropertiesResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read presentation document properties. (asynchronously)
     * 
     * @param request Request for getSlidesDocumentProperties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentPropertiesAsync(GetSlidesDocumentPropertiesRequest request, final ApiCallback<DocumentPropertiesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesDocumentPropertiesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentPropertiesResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesDocumentProperty
     * @param request Request for getSlidesDocumentProperty. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentPropertyCall(GetSlidesDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesDocumentProperty(Async)");
        }
        
        // verify the required parameter 'propertyName' is set
        if (request.getPropertyName() == null) {
            throw new ApiException("Missing the required parameter 'propertyName' when calling getSlidesDocumentProperty(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/documentproperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "propertyName" + "\\}", getApiClient().escapeString(request.getPropertyName().toString()));

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
     * Read presentation document property.
     * 
     * @param request Request for getSlidesDocumentProperty. (required)
     * @return DocumentPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPropertyResponse getSlidesDocumentProperty(GetSlidesDocumentPropertyRequest request) throws ApiException {
        try {
            ApiResponse<DocumentPropertyResponse> resp = getSlidesDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentPropertyResponse> resp = getSlidesDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation document property.
     * 
     * @param request Request for getSlidesDocumentProperty. (required)
     * @return ApiResponse&lt;DocumentPropertyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentPropertyResponse> getSlidesDocumentPropertyWithHttpInfo(GetSlidesDocumentPropertyRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesDocumentPropertyCall(request, null, null);
        Type returnType = new TypeToken<DocumentPropertyResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read presentation document property. (asynchronously)
     * 
     * @param request Request for getSlidesDocumentProperty. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentPropertyAsync(GetSlidesDocumentPropertyRequest request, final ApiCallback<DocumentPropertyResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesDocumentPropertyCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentPropertyResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesSetDocumentProperties
     * @param request Request for postSlidesSetDocumentProperties. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesSetDocumentPropertiesCall(PostSlidesSetDocumentPropertiesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesSetDocumentProperties(Async)");
        }
        
        Object postBody = request.getProperties();

        // create path and map variables
        String path = "/slides/{name}/documentproperties"
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
        return getApiClient().buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Set document properties.
     * 
     * @param request Request for postSlidesSetDocumentProperties. (required)
     * @return DocumentPropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPropertiesResponse postSlidesSetDocumentProperties(PostSlidesSetDocumentPropertiesRequest request) throws ApiException {
        try {
            ApiResponse<DocumentPropertiesResponse> resp = postSlidesSetDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentPropertiesResponse> resp = postSlidesSetDocumentPropertiesWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Set document properties.
     * 
     * @param request Request for postSlidesSetDocumentProperties. (required)
     * @return ApiResponse&lt;DocumentPropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentPropertiesResponse> postSlidesSetDocumentPropertiesWithHttpInfo(PostSlidesSetDocumentPropertiesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesSetDocumentPropertiesCall(request, null, null);
        Type returnType = new TypeToken<DocumentPropertiesResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Set document properties. (asynchronously)
     * 
     * @param request Request for postSlidesSetDocumentProperties. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesSetDocumentPropertiesAsync(PostSlidesSetDocumentPropertiesRequest request, final ApiCallback<DocumentPropertiesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postSlidesSetDocumentPropertiesCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentPropertiesResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlidesSetDocumentProperty
     * @param request Request for putSlidesSetDocumentProperty. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesSetDocumentPropertyCall(PutSlidesSetDocumentPropertyRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlidesSetDocumentProperty(Async)");
        }
        
        // verify the required parameter 'propertyName' is set
        if (request.getPropertyName() == null) {
            throw new ApiException("Missing the required parameter 'propertyName' when calling putSlidesSetDocumentProperty(Async)");
        }
        
        Object postBody = request.getProperty();

        // create path and map variables
        String path = "/slides/{name}/documentproperties/{propertyName}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "propertyName" + "\\}", getApiClient().escapeString(request.getPropertyName().toString()));

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
     * Set document property.
     * 
     * @param request Request for putSlidesSetDocumentProperty. (required)
     * @return DocumentPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentPropertyResponse putSlidesSetDocumentProperty(PutSlidesSetDocumentPropertyRequest request) throws ApiException {
        try {
            ApiResponse<DocumentPropertyResponse> resp = putSlidesSetDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentPropertyResponse> resp = putSlidesSetDocumentPropertyWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Set document property.
     * 
     * @param request Request for putSlidesSetDocumentProperty. (required)
     * @return ApiResponse&lt;DocumentPropertyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentPropertyResponse> putSlidesSetDocumentPropertyWithHttpInfo(PutSlidesSetDocumentPropertyRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesSetDocumentPropertyCall(request, null, null);
        Type returnType = new TypeToken<DocumentPropertyResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Set document property. (asynchronously)
     * 
     * @param request Request for putSlidesSetDocumentProperty. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesSetDocumentPropertyAsync(PutSlidesSetDocumentPropertyRequest request, final ApiCallback<DocumentPropertyResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putSlidesSetDocumentPropertyCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentPropertyResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
}
