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

import com.aspose.slidescloudsdk.Pair;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class AppKeyAuth extends Authentication {
    private final String appSid;
    private final String appKey;

    public AppKeyAuth(String appSid, String appKey) {
        this.appSid = appSid;
        this.appKey = appKey;
    }

    @Override
    public void updateQueryParams(List<Pair> queryParams) {
        queryParams.add(new Pair("appSid", appSid));
    }

    @Override
    public String updateUrl(String url) {
        return url + "&signature=" + sign(url);
    }

    private String sign(String url) {
        try {
            String algorithm = "HmacSHA1";
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(appKey.getBytes(), algorithm));
            String signature = new String(Base64.encodeBase64(mac.doFinal(url.getBytes())));
            if(signature.endsWith("=")){
                signature = signature.substring(0, signature.length() - 1);
            }
            return URLEncoder.encode(signature, "UTF-8");
        } catch (UnsupportedEncodingException e) {
        } catch (NoSuchAlgorithmException e) {
        } catch (InvalidKeyException e) {
        }
        return null;
    }
}
