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

import com.aspose.slidescloudsdk.ApiClient;
import com.aspose.slidescloudsdk.auth.AppKeyAuth;
import com.aspose.slidescloudsdk.auth.Authentication;
import com.aspose.slidescloudsdk.auth.OAuth;
import com.aspose.slidescloudsdk.Configuration;

public abstract class ApiBase {
    private final ApiClient apiClient;
    
    protected ApiClient getApiClient() {
        return apiClient;
    }

    public ApiBase(Configuration configuration) {
        Authentication authentication = createAuthentication(configuration);
        apiClient = new ApiClient(configuration.getUrl(), authentication, configuration.getDebug());
    }

    public ApiBase(String appSid, String appKey) {
        this(new Configuration(appSid, appKey));
    }

    private Authentication createAuthentication(Configuration configuration) {
        switch (configuration.getAuthType())
        {
            case OAUTH: return new OAuth(configuration.getBaseUrl(), configuration.getAppSid(), configuration.getAppKey());
            case REQUESTSIGNATURE: return new AppKeyAuth(configuration.getAppSid(), configuration.getAppKey());
            default: return new Authentication();
        }
    }
}