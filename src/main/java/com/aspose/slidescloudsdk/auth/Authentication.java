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

package com.aspose.slidescloudsdk.auth;

import com.aspose.slidescloudsdk.ApiException;
import com.aspose.slidescloudsdk.Pair;
import com.squareup.okhttp.Response;

import java.util.Map;
import java.util.List;

/**
 * Base class for authentication. Can be used as void authentication.
 */
public class Authentication {
    /**
     * Apply authentication settings to query params.
     *
     * @param queryParams List of query parameters
     */
    public void updateQueryParams(List<Pair> queryParams)
    {
    }

    /**
     * Apply authentication settings to header params.
     *
     * @param headerParams Map of header parameters
     */
    public void updateHeaderParams(Map<String, String> headerParams) throws ApiException
    {
    }

    /**
     * Apply authentication settings to url.
     *
     * @param url URL
     * @return Updated URL
     */
    public String updateUrl(String url)
    {
        return url;
    }

    /**
     * Handle error response.
     *
     * @param response Response
     */
    public void handleBadResponse(Response response) throws ApiException
    {
    }
}
