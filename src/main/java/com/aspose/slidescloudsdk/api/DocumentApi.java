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


import com.aspose.slidescloudsdk.model.ApiInfoResponse;
import com.aspose.slidescloudsdk.model.DocumentResponse;
import com.aspose.slidescloudsdk.model.ExportOptions;
import java.io.File;
import com.aspose.slidescloudsdk.model.Pipeline;
import com.aspose.slidescloudsdk.model.SplitDocumentResponse;
import com.aspose.slidescloudsdk.model.Stream;
import com.aspose.slidescloudsdk.model.request.GetSlidesApiInfoRequest;
import com.aspose.slidescloudsdk.model.request.GetSlidesDocumentRequest;
import com.aspose.slidescloudsdk.model.request.GetSlidesDocumentWithFormatRequest;
import com.aspose.slidescloudsdk.model.request.PostSlidesDocumentRequest;
import com.aspose.slidescloudsdk.model.request.PostSlidesPipelineRequest;
import com.aspose.slidescloudsdk.model.request.PostSlidesSaveAsRequest;
import com.aspose.slidescloudsdk.model.request.PostSlidesSplitRequest;
import com.aspose.slidescloudsdk.model.request.PutNewPresentationRequest;
import com.aspose.slidescloudsdk.model.request.PutSlidesConvertRequest;
import com.aspose.slidescloudsdk.model.request.PutSlidesDocumentFromHtmlRequest;
import com.aspose.slidescloudsdk.model.request.PutSlidesSlideSizeRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentApi extends ApiBase {
    public DocumentApi(Configuration configuration) {
        super(configuration);
    }

    public DocumentApi(String appSid, String appKey) {
        super(appSid, appKey);
    }

    /**
     * Build call for getSlidesApiInfo
     * @param request Request for getSlidesApiInfo. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesApiInfoCall(GetSlidesApiInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/info";

        List<Pair> queryParams = new ArrayList<Pair>();

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
     * Get API info.
     * 
     * @param request Request for getSlidesApiInfo. (required)
     * @return ApiInfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiInfoResponse getSlidesApiInfo(GetSlidesApiInfoRequest request) throws ApiException {
        try {
            ApiResponse<ApiInfoResponse> resp = getSlidesApiInfoWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ApiInfoResponse> resp = getSlidesApiInfoWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Get API info.
     * 
     * @param request Request for getSlidesApiInfo. (required)
     * @return ApiResponse&lt;ApiInfoResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApiInfoResponse> getSlidesApiInfoWithHttpInfo(GetSlidesApiInfoRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesApiInfoCall(request, null, null);
        Type returnType = new TypeToken<ApiInfoResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Get API info. (asynchronously)
     * 
     * @param request Request for getSlidesApiInfo. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesApiInfoAsync(GetSlidesApiInfoRequest request, final ApiCallback<ApiInfoResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesApiInfoCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ApiInfoResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesDocument
     * @param request Request for getSlidesDocument. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentCall(GetSlidesDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesDocument(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());

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
     * Read presentation info.
     * 
     * @param request Request for getSlidesDocument. (required)
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse getSlidesDocument(GetSlidesDocumentRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = getSlidesDocumentWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentResponse> resp = getSlidesDocumentWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation info.
     * 
     * @param request Request for getSlidesDocument. (required)
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResponse> getSlidesDocumentWithHttpInfo(GetSlidesDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesDocumentCall(request, null, null);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read presentation info. (asynchronously)
     * 
     * @param request Request for getSlidesDocument. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentAsync(GetSlidesDocumentRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesDocumentCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesDocumentWithFormat
     * @param request Request for getSlidesDocumentWithFormat. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentWithFormatCall(GetSlidesDocumentWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesDocumentWithFormat(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling getSlidesDocumentWithFormat(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/saveAs/{format}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "format" + "\\}", getApiClient().escapeString(request.getFormat().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "jpegQuality", request.getJpegQuality());
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
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
     * Export presentation to some format.
     * 
     * @param request Request for getSlidesDocumentWithFormat. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getSlidesDocumentWithFormat(GetSlidesDocumentWithFormatRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getSlidesDocumentWithFormatWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = getSlidesDocumentWithFormatWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Export presentation to some format.
     * 
     * @param request Request for getSlidesDocumentWithFormat. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getSlidesDocumentWithFormatWithHttpInfo(GetSlidesDocumentWithFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesDocumentWithFormatCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Export presentation to some format. (asynchronously)
     * 
     * @param request Request for getSlidesDocumentWithFormat. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesDocumentWithFormatAsync(GetSlidesDocumentWithFormatRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesDocumentWithFormatCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesDocument
     * @param request Request for postSlidesDocument. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesDocumentCall(PostSlidesDocumentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesDocument(Async)");
        }
        
        // verify the required parameter 'data' is set
        if (request.getData() == null) {
            throw new ApiException("Missing the required parameter 'data' when calling postSlidesDocument(Async)");
        }
        
        // verify the required parameter 'templatePath' is set
        if (request.getTemplatePath() == null) {
            throw new ApiException("Missing the required parameter 'templatePath' when calling postSlidesDocument(Async)");
        }
        
        Object postBody = request.getData();

        // create path and map variables
        String path = "/slides/{name}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "templatePath", request.getTemplatePath());
        getApiClient().addQueryParameter(queryParams, "templateStorage", request.getTemplateStorage());
        getApiClient().addQueryParameter(queryParams, "isImageDataEmbeeded", request.getIsImageDataEmbeeded());
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
     * Create presentation 
     * 
     * @param request Request for postSlidesDocument. (required)
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse postSlidesDocument(PostSlidesDocumentRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = postSlidesDocumentWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentResponse> resp = postSlidesDocumentWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Create presentation 
     * 
     * @param request Request for postSlidesDocument. (required)
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResponse> postSlidesDocumentWithHttpInfo(PostSlidesDocumentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesDocumentCall(request, null, null);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Create presentation  (asynchronously)
     * 
     * @param request Request for postSlidesDocument. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesDocumentAsync(PostSlidesDocumentRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postSlidesDocumentCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesPipeline
     * @param request Request for postSlidesPipeline. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesPipelineCall(PostSlidesPipelineRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        Object postBody = request.getPipeline();

        // create path and map variables
        String path = "/slides/pipeline";

        List<Pair> queryParams = new ArrayList<Pair>();

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
        List<FileInfo> files = new ArrayList<FileInfo>();
        if (request.getFiles() != null) {
            files.addAll(request.getFiles());
        }
        return getApiClient().buildCall(path, "POST", queryParams, postBody, headerParams, formParams, files, progressRequestListener);
    }

    /**
     * Performs slides pipeline. Http-request contains pipeline DTO.
     * 
     * @param request Request for postSlidesPipeline. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postSlidesPipeline(PostSlidesPipelineRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postSlidesPipelineWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = postSlidesPipelineWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Performs slides pipeline. Http-request contains pipeline DTO.
     * 
     * @param request Request for postSlidesPipeline. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> postSlidesPipelineWithHttpInfo(PostSlidesPipelineRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesPipelineCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Performs slides pipeline. Http-request contains pipeline DTO. (asynchronously)
     * 
     * @param request Request for postSlidesPipeline. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesPipelineAsync(PostSlidesPipelineRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postSlidesPipelineCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesSaveAs
     * @param request Request for postSlidesSaveAs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesSaveAsCall(PostSlidesSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesSaveAs(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling postSlidesSaveAs(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/saveAs/{format}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "format" + "\\}", getApiClient().escapeString(request.getFormat().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
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
     * Saves presentation with options
     * 
     * @param request Request for postSlidesSaveAs. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postSlidesSaveAs(PostSlidesSaveAsRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postSlidesSaveAsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = postSlidesSaveAsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Saves presentation with options
     * 
     * @param request Request for postSlidesSaveAs. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> postSlidesSaveAsWithHttpInfo(PostSlidesSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesSaveAsCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Saves presentation with options (asynchronously)
     * 
     * @param request Request for postSlidesSaveAs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesSaveAsAsync(PostSlidesSaveAsRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postSlidesSaveAsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesSplit
     * @param request Request for postSlidesSplit. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesSplitCall(PostSlidesSplitRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesSplit(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/split"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "format", request.getFormat());
        getApiClient().addQueryParameter(queryParams, "width", request.getWidth());
        getApiClient().addQueryParameter(queryParams, "height", request.getHeight());
        getApiClient().addQueryParameter(queryParams, "to", request.getTo());
        getApiClient().addQueryParameter(queryParams, "from", request.getFrom());
        getApiClient().addQueryParameter(queryParams, "destFolder", request.getDestFolder());
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
     * Splitting presentations. Create one image per slide.
     * 
     * @param request Request for postSlidesSplit. (required)
     * @return SplitDocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SplitDocumentResponse postSlidesSplit(PostSlidesSplitRequest request) throws ApiException {
        try {
            ApiResponse<SplitDocumentResponse> resp = postSlidesSplitWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SplitDocumentResponse> resp = postSlidesSplitWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Splitting presentations. Create one image per slide.
     * 
     * @param request Request for postSlidesSplit. (required)
     * @return ApiResponse&lt;SplitDocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SplitDocumentResponse> postSlidesSplitWithHttpInfo(PostSlidesSplitRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesSplitCall(request, null, null);
        Type returnType = new TypeToken<SplitDocumentResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Splitting presentations. Create one image per slide. (asynchronously)
     * 
     * @param request Request for postSlidesSplit. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesSplitAsync(PostSlidesSplitRequest request, final ApiCallback<SplitDocumentResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = postSlidesSplitCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SplitDocumentResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putNewPresentation
     * @param request Request for putNewPresentation. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putNewPresentationCall(PutNewPresentationRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putNewPresentation(Async)");
        }
        
        Object postBody = request.getStream();

        // create path and map variables
        String path = "/slides/{name}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "templatePath", request.getTemplatePath());
        getApiClient().addQueryParameter(queryParams, "templatePassword", request.getTemplatePassword());
        getApiClient().addQueryParameter(queryParams, "templateStorage", request.getTemplateStorage());
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
     * Create presentation 
     * 
     * @param request Request for putNewPresentation. (required)
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse putNewPresentation(PutNewPresentationRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = putNewPresentationWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentResponse> resp = putNewPresentationWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Create presentation 
     * 
     * @param request Request for putNewPresentation. (required)
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResponse> putNewPresentationWithHttpInfo(PutNewPresentationRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putNewPresentationCall(request, null, null);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Create presentation  (asynchronously)
     * 
     * @param request Request for putNewPresentation. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putNewPresentationAsync(PutNewPresentationRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putNewPresentationCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlidesConvert
     * @param request Request for putSlidesConvert. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesConvertCall(PutSlidesConvertRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling putSlidesConvert(Async)");
        }
        
        Object postBody = request.getDocument();

        // create path and map variables
        String path = "/slides/convert";

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "format", request.getFormat());
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
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
        return getApiClient().buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Convert presentation from request content to format specified.
     * 
     * @param request Request for putSlidesConvert. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File putSlidesConvert(PutSlidesConvertRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = putSlidesConvertWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = putSlidesConvertWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Convert presentation from request content to format specified.
     * 
     * @param request Request for putSlidesConvert. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> putSlidesConvertWithHttpInfo(PutSlidesConvertRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesConvertCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Convert presentation from request content to format specified. (asynchronously)
     * 
     * @param request Request for putSlidesConvert. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesConvertAsync(PutSlidesConvertRequest request, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putSlidesConvertCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlidesDocumentFromHtml
     * @param request Request for putSlidesDocumentFromHtml. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesDocumentFromHtmlCall(PutSlidesDocumentFromHtmlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlidesDocumentFromHtml(Async)");
        }
        
        // verify the required parameter 'html' is set
        if (request.getHtml() == null) {
            throw new ApiException("Missing the required parameter 'html' when calling putSlidesDocumentFromHtml(Async)");
        }
        
        Object postBody = request.getHtml();

        // create path and map variables
        String path = "/slides/{name}/fromHtml"
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
     * Create presentation document from html
     * 
     * @param request Request for putSlidesDocumentFromHtml. (required)
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse putSlidesDocumentFromHtml(PutSlidesDocumentFromHtmlRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = putSlidesDocumentFromHtmlWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentResponse> resp = putSlidesDocumentFromHtmlWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Create presentation document from html
     * 
     * @param request Request for putSlidesDocumentFromHtml. (required)
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResponse> putSlidesDocumentFromHtmlWithHttpInfo(PutSlidesDocumentFromHtmlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesDocumentFromHtmlCall(request, null, null);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Create presentation document from html (asynchronously)
     * 
     * @param request Request for putSlidesDocumentFromHtml. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesDocumentFromHtmlAsync(PutSlidesDocumentFromHtmlRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putSlidesDocumentFromHtmlCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlidesSlideSize
     * @param request Request for putSlidesSlideSize. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideSizeCall(PutSlidesSlideSizeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlidesSlideSize(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slidesize"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "width", request.getWidth());
        getApiClient().addQueryParameter(queryParams, "height", request.getHeight());
        getApiClient().addQueryParameter(queryParams, "sizeType", request.getSizeType());
        getApiClient().addQueryParameter(queryParams, "scaleType", request.getScaleType());

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
     * Set slide size for the presentation.
     * 
     * @param request Request for putSlidesSlideSize. (required)
     * @return DocumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentResponse putSlidesSlideSize(PutSlidesSlideSizeRequest request) throws ApiException {
        try {
            ApiResponse<DocumentResponse> resp = putSlidesSlideSizeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<DocumentResponse> resp = putSlidesSlideSizeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Set slide size for the presentation.
     * 
     * @param request Request for putSlidesSlideSize. (required)
     * @return ApiResponse&lt;DocumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentResponse> putSlidesSlideSizeWithHttpInfo(PutSlidesSlideSizeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesSlideSizeCall(request, null, null);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Set slide size for the presentation. (asynchronously)
     * 
     * @param request Request for putSlidesSlideSize. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideSizeAsync(PutSlidesSlideSizeRequest request, final ApiCallback<DocumentResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = putSlidesSlideSizeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DocumentResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
}
