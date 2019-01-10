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

package com.aspose.slides.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Specifies the pixel format for the generated images.
 */
@JsonAdapter(ImagePixelFormat.Adapter.class)
public enum ImagePixelFormat {
  
  FORMAT1BPPINDEXED("Format1bppIndexed"),
  
  FORMAT4BPPINDEXED("Format4bppIndexed"),
  
  FORMAT8BPPINDEXED("Format8bppIndexed"),
  
  FORMAT24BPPRGB("Format24bppRgb"),
  
  FORMAT32BPPARGB("Format32bppArgb");

  private String value;

  ImagePixelFormat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static ImagePixelFormat fromValue(String text) {
    for (ImagePixelFormat b : ImagePixelFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ImagePixelFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final ImagePixelFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ImagePixelFormat read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ImagePixelFormat.fromValue(String.valueOf(value));
    }
  }
}

