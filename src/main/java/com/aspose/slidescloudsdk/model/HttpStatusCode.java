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

package com.aspose.slidescloudsdk.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(HttpStatusCode.Adapter.class)
public enum HttpStatusCode {
  
  Continue(100),
  
  SwitchingProtocols(101),
  
  OK(200),
  
  Created(201),
  
  Accepted(202),
  
  NonAuthoritativeInformation(203),
  
  NoContent(204),
  
  ResetContent(205),
  
  PartialContent(206),
  
  MultipleChoices(300),
  
  Ambiguous(300),
  
  MovedPermanently(301),
  
  Moved(301),
  
  Found(302),
  
  Redirect(302),
  
  SeeOther(303),
  
  RedirectMethod(303),
  
  NotModified(304),
  
  UseProxy(305),
  
  Unused(306),
  
  TemporaryRedirect(307),
  
  RedirectKeepVerb(307),
  
  BadRequest(400),
  
  Unauthorized(401),
  
  PaymentRequired(402),
  
  Forbidden(403),
  
  NotFound(404),
  
  MethodNotAllowed(405),
  
  NotAcceptable(406),
  
  ProxyAuthenticationRequired(407),
  
  RequestTimeout(408),
  
  Conflict(409),
  
  Gone(410),
  
  LengthRequired(411),
  
  PreconditionFailed(412),
  
  RequestEntityTooLarge(413),
  
  RequestUriTooLong(414),
  
  UnsupportedMediaType(415),
  
  RequestedRangeNotSatisfiable(416),
  
  ExpectationFailed(417),
  
  UpgradeRequired(426),
  
  InternalServerError(500),
  
  NotImplemented(501),
  
  BadGateway(502),
  
  ServiceUnavailable(503),
  
  GatewayTimeout(504),
  
  HttpVersionNotSupported(505);

  private Integer value;

  HttpStatusCode(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  public static HttpStatusCode fromValue(String text) {
    for (HttpStatusCode b : HttpStatusCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<HttpStatusCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final HttpStatusCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public HttpStatusCode read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return HttpStatusCode.fromValue(String.valueOf(value));
    }
  }
}

