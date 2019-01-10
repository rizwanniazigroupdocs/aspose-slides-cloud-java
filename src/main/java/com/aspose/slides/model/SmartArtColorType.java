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
 * Represents color scheme of a SmartArt diagram.
 */
@JsonAdapter(SmartArtColorType.Adapter.class)
public enum SmartArtColorType {
  
  DARK1OUTLINE("Dark1Outline"),
  
  DARK2OUTLINE("Dark2Outline"),
  
  DARKFILL("DarkFill"),
  
  COLORFULACCENTCOLORS("ColorfulAccentColors"),
  
  COLORFULACCENTCOLORS2TO3("ColorfulAccentColors2to3"),
  
  COLORFULACCENTCOLORS3TO4("ColorfulAccentColors3to4"),
  
  COLORFULACCENTCOLORS4TO5("ColorfulAccentColors4to5"),
  
  COLORFULACCENTCOLORS5TO6("ColorfulAccentColors5to6"),
  
  COLOREDOUTLINEACCENT1("ColoredOutlineAccent1"),
  
  COLOREDFILLACCENT1("ColoredFillAccent1"),
  
  GRADIENTRANGEACCENT1("GradientRangeAccent1"),
  
  GRADIENTLOOPACCENT1("GradientLoopAccent1"),
  
  TRANSPARENTGRADIENTRANGEACCENT1("TransparentGradientRangeAccent1"),
  
  COLOREDOUTLINEACCENT2("ColoredOutlineAccent2"),
  
  COLOREDFILLACCENT2("ColoredFillAccent2"),
  
  GRADIENTRANGEACCENT2("GradientRangeAccent2"),
  
  GRADIENTLOOPACCENT2("GradientLoopAccent2"),
  
  TRANSPARENTGRADIENTRANGEACCENT2("TransparentGradientRangeAccent2"),
  
  COLOREDOUTLINEACCENT3("ColoredOutlineAccent3"),
  
  COLOREDFILLACCENT3("ColoredFillAccent3"),
  
  GRADIENTRANGEACCENT3("GradientRangeAccent3"),
  
  GRADIENTLOOPACCENT3("GradientLoopAccent3"),
  
  TRANSPARENTGRADIENTRANGEACCENT3("TransparentGradientRangeAccent3"),
  
  COLOREDOUTLINEACCENT4("ColoredOutlineAccent4"),
  
  COLOREDFILLACCENT4("ColoredFillAccent4"),
  
  GRADIENTRANGEACCENT4("GradientRangeAccent4"),
  
  GRADIENTLOOPACCENT4("GradientLoopAccent4"),
  
  TRANSPARENTGRADIENTRANGEACCENT4("TransparentGradientRangeAccent4"),
  
  COLOREDOUTLINEACCENT5("ColoredOutlineAccent5"),
  
  COLOREDFILLACCENT5("ColoredFillAccent5"),
  
  GRADIENTRANGEACCENT5("GradientRangeAccent5"),
  
  GRADIENTLOOPACCENT5("GradientLoopAccent5"),
  
  TRANSPARENTGRADIENTRANGEACCENT5("TransparentGradientRangeAccent5"),
  
  COLOREDOUTLINEACCENT6("ColoredOutlineAccent6"),
  
  COLOREDFILLACCENT6("ColoredFillAccent6"),
  
  GRADIENTRANGEACCENT6("GradientRangeAccent6"),
  
  GRADIENTLOOPACCENT6("GradientLoopAccent6"),
  
  TRANSPARENTGRADIENTRANGEACCENT6("TransparentGradientRangeAccent6");

  private String value;

  SmartArtColorType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static SmartArtColorType fromValue(String text) {
    for (SmartArtColorType b : SmartArtColorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SmartArtColorType> {
    @Override
    public void write(final JsonWriter jsonWriter, final SmartArtColorType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SmartArtColorType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SmartArtColorType.fromValue(String.valueOf(value));
    }
  }
}

