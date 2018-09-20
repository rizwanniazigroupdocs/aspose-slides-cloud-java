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
 * Slide Export Format
 */
@JsonAdapter(SlideExportFormat.Adapter.class)
public enum SlideExportFormat {
  
  Jpeg(0),
  
  Png(1),
  
  Gif(2),
  
  Bmp(3),
  
  Tiff(4),
  
  Html(5),
  
  Pdf(6),
  
  Xps(7),
  
  Pptx(8),
  
  Odp(9),
  
  Otp(10),
  
  Ppt(11),
  
  Pps(12),
  
  Ppsx(13),
  
  Pptm(14),
  
  Ppsm(15),
  
  Potx(16),
  
  Potm(17),
  
  Svg(18);

  private Integer value;

  SlideExportFormat(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  public static SlideExportFormat fromValue(String text) {
    for (SlideExportFormat b : SlideExportFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SlideExportFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final SlideExportFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SlideExportFormat read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return SlideExportFormat.fromValue(String.valueOf(value));
    }
  }
}

