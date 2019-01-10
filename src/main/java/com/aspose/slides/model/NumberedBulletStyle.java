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
 * 
 */
@JsonAdapter(NumberedBulletStyle.Adapter.class)
public enum NumberedBulletStyle {
  
  BULLETALPHALCPERIOD("BulletAlphaLCPeriod"),
  
  BULLETALPHAUCPERIOD("BulletAlphaUCPeriod"),
  
  BULLETARABICPARENRIGHT("BulletArabicParenRight"),
  
  BULLETARABICPERIOD("BulletArabicPeriod"),
  
  BULLETROMANLCPARENBOTH("BulletRomanLCParenBoth"),
  
  BULLETROMANLCPARENRIGHT("BulletRomanLCParenRight"),
  
  BULLETROMANLCPERIOD("BulletRomanLCPeriod"),
  
  BULLETROMANUCPERIOD("BulletRomanUCPeriod"),
  
  BULLETALPHALCPARENBOTH("BulletAlphaLCParenBoth"),
  
  BULLETALPHALCPARENRIGHT("BulletAlphaLCParenRight"),
  
  BULLETALPHAUCPARENBOTH("BulletAlphaUCParenBoth"),
  
  BULLETALPHAUCPARENRIGHT("BulletAlphaUCParenRight"),
  
  BULLETARABICPARENBOTH("BulletArabicParenBoth"),
  
  BULLETARABICPLAIN("BulletArabicPlain"),
  
  BULLETROMANUCPARENBOTH("BulletRomanUCParenBoth"),
  
  BULLETROMANUCPARENRIGHT("BulletRomanUCParenRight"),
  
  BULLETSIMPCHINPLAIN("BulletSimpChinPlain"),
  
  BULLETSIMPCHINPERIOD("BulletSimpChinPeriod"),
  
  BULLETCIRCLENUMDBPLAIN("BulletCircleNumDBPlain"),
  
  BULLETCIRCLENUMWDWHITEPLAIN("BulletCircleNumWDWhitePlain"),
  
  BULLETCIRCLENUMWDBLACKPLAIN("BulletCircleNumWDBlackPlain"),
  
  BULLETTRADCHINPLAIN("BulletTradChinPlain"),
  
  BULLETTRADCHINPERIOD("BulletTradChinPeriod"),
  
  BULLETARABICALPHADASH("BulletArabicAlphaDash"),
  
  BULLETARABICABJADDASH("BulletArabicAbjadDash"),
  
  BULLETHEBREWALPHADASH("BulletHebrewAlphaDash"),
  
  BULLETKANJIKOREANPLAIN("BulletKanjiKoreanPlain"),
  
  BULLETKANJIKOREANPERIOD("BulletKanjiKoreanPeriod"),
  
  BULLETARABICDBPLAIN("BulletArabicDBPlain"),
  
  BULLETARABICDBPERIOD("BulletArabicDBPeriod"),
  
  BULLETTHAIALPHAPERIOD("BulletThaiAlphaPeriod"),
  
  BULLETTHAIALPHAPARENRIGHT("BulletThaiAlphaParenRight"),
  
  BULLETTHAIALPHAPARENBOTH("BulletThaiAlphaParenBoth"),
  
  BULLETTHAINUMPERIOD("BulletThaiNumPeriod"),
  
  BULLETTHAINUMPARENRIGHT("BulletThaiNumParenRight"),
  
  BULLETTHAINUMPARENBOTH("BulletThaiNumParenBoth"),
  
  BULLETHINDIALPHAPERIOD("BulletHindiAlphaPeriod"),
  
  BULLETHINDINUMPERIOD("BulletHindiNumPeriod"),
  
  BULLETKANJISIMPCHINDBPERIOD("BulletKanjiSimpChinDBPeriod"),
  
  BULLETHINDINUMPARENRIGHT("BulletHindiNumParenRight"),
  
  BULLETHINDIALPHA1PERIOD("BulletHindiAlpha1Period"),
  
  NOTDEFINED("NotDefined");

  private String value;

  NumberedBulletStyle(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static NumberedBulletStyle fromValue(String text) {
    for (NumberedBulletStyle b : NumberedBulletStyle.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<NumberedBulletStyle> {
    @Override
    public void write(final JsonWriter jsonWriter, final NumberedBulletStyle enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public NumberedBulletStyle read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return NumberedBulletStyle.fromValue(String.valueOf(value));
    }
  }
}

