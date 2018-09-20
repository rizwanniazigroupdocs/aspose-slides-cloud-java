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
@JsonAdapter(PlaceholderType.Adapter.class)
public enum PlaceholderType {
  
  Title(0),
  
  Body(1),
  
  CenteredTitle(2),
  
  Subtitle(3),
  
  DateAndTime(4),
  
  SlideNumber(5),
  
  Footer(6),
  
  Header(7),
  
  Object(8),
  
  Chart(9),
  
  Table(10),
  
  ClipArt(11),
  
  Diagram(12),
  
  Media(13),
  
  SlideImage(14),
  
  Picture(15);

  private Integer value;

  PlaceholderType(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  public static PlaceholderType fromValue(String text) {
    for (PlaceholderType b : PlaceholderType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PlaceholderType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlaceholderType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PlaceholderType read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return PlaceholderType.fromValue(String.valueOf(value));
    }
  }
}

