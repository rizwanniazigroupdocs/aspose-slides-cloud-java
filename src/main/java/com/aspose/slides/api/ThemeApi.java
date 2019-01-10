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


import com.aspose.slides.model.ColorSchemeResponse;
import com.aspose.slides.model.FontSchemeResponse;
import com.aspose.slides.model.FormatSchemeResponse;
import com.aspose.slides.model.ThemeResponse;
import com.aspose.slides.model.request.GetSlidesThemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeColorSchemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeFontSchemeRequest;
import com.aspose.slides.model.request.GetSlidesThemeFormatSchemeRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThemeApi extends ApiBase {
    public ThemeApi(Configuration configuration) {
        super(configuration);
    }

    public ThemeApi(String appSid, String appKey) {
        super(appSid, appKey);
    }

    /**
     * Build call for getSlidesTheme
     * @param request Request for getSlidesTheme. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeCall(GetSlidesThemeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesTheme(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesTheme(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/theme"
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
     * Read slide theme info.
     * 
     * @param request Request for getSlidesTheme. (required)
     * @return ThemeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ThemeResponse getSlidesTheme(GetSlidesThemeRequest request) throws ApiException {
        try {
            ApiResponse<ThemeResponse> resp = getSlidesThemeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ThemeResponse> resp = getSlidesThemeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide theme info.
     * 
     * @param request Request for getSlidesTheme. (required)
     * @return ApiResponse&lt;ThemeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ThemeResponse> getSlidesThemeWithHttpInfo(GetSlidesThemeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesThemeCall(request, null, null);
        Type returnType = new TypeToken<ThemeResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide theme info. (asynchronously)
     * 
     * @param request Request for getSlidesTheme. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeAsync(GetSlidesThemeRequest request, final ApiCallback<ThemeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesThemeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ThemeResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesThemeColorScheme
     * @param request Request for getSlidesThemeColorScheme. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeColorSchemeCall(GetSlidesThemeColorSchemeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesThemeColorScheme(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesThemeColorScheme(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/theme/colorScheme"
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
     * Read slide theme color scheme info.
     * 
     * @param request Request for getSlidesThemeColorScheme. (required)
     * @return ColorSchemeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ColorSchemeResponse getSlidesThemeColorScheme(GetSlidesThemeColorSchemeRequest request) throws ApiException {
        try {
            ApiResponse<ColorSchemeResponse> resp = getSlidesThemeColorSchemeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<ColorSchemeResponse> resp = getSlidesThemeColorSchemeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide theme color scheme info.
     * 
     * @param request Request for getSlidesThemeColorScheme. (required)
     * @return ApiResponse&lt;ColorSchemeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ColorSchemeResponse> getSlidesThemeColorSchemeWithHttpInfo(GetSlidesThemeColorSchemeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesThemeColorSchemeCall(request, null, null);
        Type returnType = new TypeToken<ColorSchemeResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide theme color scheme info. (asynchronously)
     * 
     * @param request Request for getSlidesThemeColorScheme. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeColorSchemeAsync(GetSlidesThemeColorSchemeRequest request, final ApiCallback<ColorSchemeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesThemeColorSchemeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ColorSchemeResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesThemeFontScheme
     * @param request Request for getSlidesThemeFontScheme. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeFontSchemeCall(GetSlidesThemeFontSchemeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesThemeFontScheme(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesThemeFontScheme(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/theme/fontScheme"
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
     * Read slide theme font scheme info.
     * 
     * @param request Request for getSlidesThemeFontScheme. (required)
     * @return FontSchemeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FontSchemeResponse getSlidesThemeFontScheme(GetSlidesThemeFontSchemeRequest request) throws ApiException {
        try {
            ApiResponse<FontSchemeResponse> resp = getSlidesThemeFontSchemeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<FontSchemeResponse> resp = getSlidesThemeFontSchemeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide theme font scheme info.
     * 
     * @param request Request for getSlidesThemeFontScheme. (required)
     * @return ApiResponse&lt;FontSchemeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FontSchemeResponse> getSlidesThemeFontSchemeWithHttpInfo(GetSlidesThemeFontSchemeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesThemeFontSchemeCall(request, null, null);
        Type returnType = new TypeToken<FontSchemeResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide theme font scheme info. (asynchronously)
     * 
     * @param request Request for getSlidesThemeFontScheme. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeFontSchemeAsync(GetSlidesThemeFontSchemeRequest request, final ApiCallback<FontSchemeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesThemeFontSchemeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<FontSchemeResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesThemeFormatScheme
     * @param request Request for getSlidesThemeFormatScheme. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeFormatSchemeCall(GetSlidesThemeFormatSchemeRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesThemeFormatScheme(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesThemeFormatScheme(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/theme/formatScheme"
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
     * Read slide theme color scheme info.
     * 
     * @param request Request for getSlidesThemeFormatScheme. (required)
     * @return FormatSchemeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FormatSchemeResponse getSlidesThemeFormatScheme(GetSlidesThemeFormatSchemeRequest request) throws ApiException {
        try {
            ApiResponse<FormatSchemeResponse> resp = getSlidesThemeFormatSchemeWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<FormatSchemeResponse> resp = getSlidesThemeFormatSchemeWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide theme color scheme info.
     * 
     * @param request Request for getSlidesThemeFormatScheme. (required)
     * @return ApiResponse&lt;FormatSchemeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FormatSchemeResponse> getSlidesThemeFormatSchemeWithHttpInfo(GetSlidesThemeFormatSchemeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesThemeFormatSchemeCall(request, null, null);
        Type returnType = new TypeToken<FormatSchemeResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide theme color scheme info. (asynchronously)
     * 
     * @param request Request for getSlidesThemeFormatScheme. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesThemeFormatSchemeAsync(GetSlidesThemeFormatSchemeRequest request, final ApiCallback<FormatSchemeResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSlidesThemeFormatSchemeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<FormatSchemeResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
}
