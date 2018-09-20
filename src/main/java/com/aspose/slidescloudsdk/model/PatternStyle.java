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
 * Available pattern styles
 */
@JsonAdapter(PatternStyle.Adapter.class)
public enum PatternStyle {
  
  UNKNOWN("Unknown"),
  
  PERCENT05("Percent05"),
  
  PERCENT10("Percent10"),
  
  PERCENT20("Percent20"),
  
  PERCENT25("Percent25"),
  
  PERCENT30("Percent30"),
  
  PERCENT40("Percent40"),
  
  PERCENT50("Percent50"),
  
  PERCENT60("Percent60"),
  
  PERCENT70("Percent70"),
  
  PERCENT75("Percent75"),
  
  PERCENT80("Percent80"),
  
  PERCENT90("Percent90"),
  
  DARKHORIZONTAL("DarkHorizontal"),
  
  DARKVERTICAL("DarkVertical"),
  
  DARKDOWNWARDDIAGONAL("DarkDownwardDiagonal"),
  
  DARKUPWARDDIAGONAL("DarkUpwardDiagonal"),
  
  SMALLCHECKERBOARD("SmallCheckerBoard"),
  
  TRELLIS("Trellis"),
  
  LIGHTHORIZONTAL("LightHorizontal"),
  
  LIGHTVERTICAL("LightVertical"),
  
  LIGHTDOWNWARDDIAGONAL("LightDownwardDiagonal"),
  
  LIGHTUPWARDDIAGONAL("LightUpwardDiagonal"),
  
  SMALLGRID("SmallGrid"),
  
  DOTTEDDIAMOND("DottedDiamond"),
  
  WIDEDOWNWARDDIAGONAL("WideDownwardDiagonal"),
  
  WIDEUPWARDDIAGONAL("WideUpwardDiagonal"),
  
  DASHEDUPWARDDIAGONAL("DashedUpwardDiagonal"),
  
  DASHEDDOWNWARDDIAGONAL("DashedDownwardDiagonal"),
  
  NARROWVERTICAL("NarrowVertical"),
  
  NARROWHORIZONTAL("NarrowHorizontal"),
  
  DASHEDVERTICAL("DashedVertical"),
  
  DASHEDHORIZONTAL("DashedHorizontal"),
  
  LARGECONFETTI("LargeConfetti"),
  
  LARGEGRID("LargeGrid"),
  
  HORIZONTALBRICK("HorizontalBrick"),
  
  LARGECHECKERBOARD("LargeCheckerBoard"),
  
  SMALLCONFETTI("SmallConfetti"),
  
  ZIGZAG("Zigzag"),
  
  SOLIDDIAMOND("SolidDiamond"),
  
  DIAGONALBRICK("DiagonalBrick"),
  
  OUTLINEDDIAMOND("OutlinedDiamond"),
  
  PLAID("Plaid"),
  
  SPHERE("Sphere"),
  
  WEAVE("Weave"),
  
  DOTTEDGRID("DottedGrid"),
  
  DIVOT("Divot"),
  
  SHINGLE("Shingle"),
  
  WAVE("Wave"),
  
  HORIZONTAL("Horizontal"),
  
  VERTICAL("Vertical"),
  
  CROSS("Cross"),
  
  DOWNWARDDIAGONAL("DownwardDiagonal"),
  
  UPWARDDIAGONAL("UpwardDiagonal"),
  
  DIAGONALCROSS("DiagonalCross"),
  
  NOTDEFINED("NotDefined");

  private String value;

  PatternStyle(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static PatternStyle fromValue(String text) {
    for (PatternStyle b : PatternStyle.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PatternStyle> {
    @Override
    public void write(final JsonWriter jsonWriter, final PatternStyle enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PatternStyle read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PatternStyle.fromValue(String.valueOf(value));
    }
  }
}

