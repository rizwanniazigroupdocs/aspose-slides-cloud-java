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
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.NullableBool;
import com.aspose.slides.model.ResourceBase;
import com.aspose.slides.model.ResourceUri;
import com.aspose.slides.model.TextCapType;
import com.aspose.slides.model.TextStrikethroughType;
import com.aspose.slides.model.TextUnderlineType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents portion resource
 */
@ApiModel(description = "Represents portion resource")
public class Portion extends ResourceBase {
  @SerializedName("Text")
  private String text;

  @SerializedName("FontBold")
  private NullableBool fontBold;

  @SerializedName("FontItalic")
  private NullableBool fontItalic;

  @SerializedName("FontUnderline")
  private TextUnderlineType fontUnderline;

  @SerializedName("StrikethroughType")
  private TextStrikethroughType strikethroughType;

  @SerializedName("TextCapType")
  private TextCapType textCapType;

  @SerializedName("Escapement")
  private Double escapement;

  @SerializedName("Spacing")
  private Double spacing;

  @SerializedName("FontColor")
  private String fontColor;

  @SerializedName("HighlightColor")
  private String highlightColor;

  @SerializedName("FontHeight")
  private Double fontHeight;

  @SerializedName("NormaliseHeight")
  private NullableBool normaliseHeight;

  @SerializedName("ProofDisabled")
  private NullableBool proofDisabled;

  @SerializedName("SmartTagClean")
  private Boolean smartTagClean;

  @SerializedName("KerningMinimalSize")
  private Double kerningMinimalSize;

  @SerializedName("Kumimoji")
  private NullableBool kumimoji;

  @SerializedName("LanguageId")
  private String languageId;

  @SerializedName("AlternativeLanguageId")
  private String alternativeLanguageId;

  @SerializedName("IsHardUnderlineFill")
  private NullableBool isHardUnderlineFill;

  @SerializedName("IsHardUnderlineLine")
  private NullableBool isHardUnderlineLine;

  @SerializedName("FillFormat")
  private FillFormat fillFormat;

  @SerializedName("EffectFormat")
  private EffectFormat effectFormat;

  @SerializedName("LineFormat")
  private LineFormat lineFormat;

  @SerializedName("UnderlineFillFormat")
  private FillFormat underlineFillFormat;

  @SerializedName("UnderlineLineFormat")
  private LineFormat underlineLineFormat;


  public Portion() {
    super();
    setAlternateLinks(new ArrayList<ResourceUri>());
    setLinks(new ArrayList<ResourceUri>());
  }

  public Portion text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(value = "")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Portion fontBold(NullableBool fontBold) {
    this.fontBold = fontBold;
    return this;
  }

   /**
   * Get fontBold
   * @return fontBold
  **/
  @ApiModelProperty(value = "")
  public NullableBool getFontBold() {
    return fontBold;
  }

  public void setFontBold(NullableBool fontBold) {
    this.fontBold = fontBold;
  }

  public Portion fontItalic(NullableBool fontItalic) {
    this.fontItalic = fontItalic;
    return this;
  }

   /**
   * Get fontItalic
   * @return fontItalic
  **/
  @ApiModelProperty(value = "")
  public NullableBool getFontItalic() {
    return fontItalic;
  }

  public void setFontItalic(NullableBool fontItalic) {
    this.fontItalic = fontItalic;
  }

  public Portion fontUnderline(TextUnderlineType fontUnderline) {
    this.fontUnderline = fontUnderline;
    return this;
  }

   /**
   * Get fontUnderline
   * @return fontUnderline
  **/
  @ApiModelProperty(value = "")
  public TextUnderlineType getFontUnderline() {
    return fontUnderline;
  }

  public void setFontUnderline(TextUnderlineType fontUnderline) {
    this.fontUnderline = fontUnderline;
  }

  public Portion strikethroughType(TextStrikethroughType strikethroughType) {
    this.strikethroughType = strikethroughType;
    return this;
  }

   /**
   * Get strikethroughType
   * @return strikethroughType
  **/
  @ApiModelProperty(value = "")
  public TextStrikethroughType getStrikethroughType() {
    return strikethroughType;
  }

  public void setStrikethroughType(TextStrikethroughType strikethroughType) {
    this.strikethroughType = strikethroughType;
  }

  public Portion textCapType(TextCapType textCapType) {
    this.textCapType = textCapType;
    return this;
  }

   /**
   * Get textCapType
   * @return textCapType
  **/
  @ApiModelProperty(value = "")
  public TextCapType getTextCapType() {
    return textCapType;
  }

  public void setTextCapType(TextCapType textCapType) {
    this.textCapType = textCapType;
  }

  public Portion escapement(Double escapement) {
    this.escapement = escapement;
    return this;
  }

   /**
   * Get escapement
   * @return escapement
  **/
  @ApiModelProperty(value = "")
  public Double getEscapement() {
    return escapement;
  }

  public void setEscapement(Double escapement) {
    this.escapement = escapement;
  }

  public Portion spacing(Double spacing) {
    this.spacing = spacing;
    return this;
  }

   /**
   * Get spacing
   * @return spacing
  **/
  @ApiModelProperty(value = "")
  public Double getSpacing() {
    return spacing;
  }

  public void setSpacing(Double spacing) {
    this.spacing = spacing;
  }

  public Portion fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

   /**
   * Get fontColor
   * @return fontColor
  **/
  @ApiModelProperty(value = "")
  public String getFontColor() {
    return fontColor;
  }

  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  public Portion highlightColor(String highlightColor) {
    this.highlightColor = highlightColor;
    return this;
  }

   /**
   * Get highlightColor
   * @return highlightColor
  **/
  @ApiModelProperty(value = "")
  public String getHighlightColor() {
    return highlightColor;
  }

  public void setHighlightColor(String highlightColor) {
    this.highlightColor = highlightColor;
  }

  public Portion fontHeight(Double fontHeight) {
    this.fontHeight = fontHeight;
    return this;
  }

   /**
   * Get fontHeight
   * @return fontHeight
  **/
  @ApiModelProperty(value = "")
  public Double getFontHeight() {
    return fontHeight;
  }

  public void setFontHeight(Double fontHeight) {
    this.fontHeight = fontHeight;
  }

  public Portion normaliseHeight(NullableBool normaliseHeight) {
    this.normaliseHeight = normaliseHeight;
    return this;
  }

   /**
   * Get normaliseHeight
   * @return normaliseHeight
  **/
  @ApiModelProperty(value = "")
  public NullableBool getNormaliseHeight() {
    return normaliseHeight;
  }

  public void setNormaliseHeight(NullableBool normaliseHeight) {
    this.normaliseHeight = normaliseHeight;
  }

  public Portion proofDisabled(NullableBool proofDisabled) {
    this.proofDisabled = proofDisabled;
    return this;
  }

   /**
   * Get proofDisabled
   * @return proofDisabled
  **/
  @ApiModelProperty(value = "")
  public NullableBool getProofDisabled() {
    return proofDisabled;
  }

  public void setProofDisabled(NullableBool proofDisabled) {
    this.proofDisabled = proofDisabled;
  }

  public Portion smartTagClean(Boolean smartTagClean) {
    this.smartTagClean = smartTagClean;
    return this;
  }

   /**
   * Get smartTagClean
   * @return smartTagClean
  **/
  @ApiModelProperty(value = "")
  public Boolean isSmartTagClean() {
    return smartTagClean;
  }

  public void setSmartTagClean(Boolean smartTagClean) {
    this.smartTagClean = smartTagClean;
  }

  public Portion kerningMinimalSize(Double kerningMinimalSize) {
    this.kerningMinimalSize = kerningMinimalSize;
    return this;
  }

   /**
   * Get kerningMinimalSize
   * @return kerningMinimalSize
  **/
  @ApiModelProperty(value = "")
  public Double getKerningMinimalSize() {
    return kerningMinimalSize;
  }

  public void setKerningMinimalSize(Double kerningMinimalSize) {
    this.kerningMinimalSize = kerningMinimalSize;
  }

  public Portion kumimoji(NullableBool kumimoji) {
    this.kumimoji = kumimoji;
    return this;
  }

   /**
   * Get kumimoji
   * @return kumimoji
  **/
  @ApiModelProperty(value = "")
  public NullableBool getKumimoji() {
    return kumimoji;
  }

  public void setKumimoji(NullableBool kumimoji) {
    this.kumimoji = kumimoji;
  }

  public Portion languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }

   /**
   * Get languageId
   * @return languageId
  **/
  @ApiModelProperty(value = "")
  public String getLanguageId() {
    return languageId;
  }

  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }

  public Portion alternativeLanguageId(String alternativeLanguageId) {
    this.alternativeLanguageId = alternativeLanguageId;
    return this;
  }

   /**
   * Get alternativeLanguageId
   * @return alternativeLanguageId
  **/
  @ApiModelProperty(value = "")
  public String getAlternativeLanguageId() {
    return alternativeLanguageId;
  }

  public void setAlternativeLanguageId(String alternativeLanguageId) {
    this.alternativeLanguageId = alternativeLanguageId;
  }

  public Portion isHardUnderlineFill(NullableBool isHardUnderlineFill) {
    this.isHardUnderlineFill = isHardUnderlineFill;
    return this;
  }

   /**
   * Get isHardUnderlineFill
   * @return isHardUnderlineFill
  **/
  @ApiModelProperty(value = "")
  public NullableBool getIsHardUnderlineFill() {
    return isHardUnderlineFill;
  }

  public void setIsHardUnderlineFill(NullableBool isHardUnderlineFill) {
    this.isHardUnderlineFill = isHardUnderlineFill;
  }

  public Portion isHardUnderlineLine(NullableBool isHardUnderlineLine) {
    this.isHardUnderlineLine = isHardUnderlineLine;
    return this;
  }

   /**
   * Get isHardUnderlineLine
   * @return isHardUnderlineLine
  **/
  @ApiModelProperty(value = "")
  public NullableBool getIsHardUnderlineLine() {
    return isHardUnderlineLine;
  }

  public void setIsHardUnderlineLine(NullableBool isHardUnderlineLine) {
    this.isHardUnderlineLine = isHardUnderlineLine;
  }

  public Portion fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Get fillFormat
   * @return fillFormat
  **/
  @ApiModelProperty(value = "")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public Portion effectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
    return this;
  }

   /**
   * Get effectFormat
   * @return effectFormat
  **/
  @ApiModelProperty(value = "")
  public EffectFormat getEffectFormat() {
    return effectFormat;
  }

  public void setEffectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
  }

  public Portion lineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
    return this;
  }

   /**
   * Get lineFormat
   * @return lineFormat
  **/
  @ApiModelProperty(value = "")
  public LineFormat getLineFormat() {
    return lineFormat;
  }

  public void setLineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
  }

  public Portion underlineFillFormat(FillFormat underlineFillFormat) {
    this.underlineFillFormat = underlineFillFormat;
    return this;
  }

   /**
   * Get underlineFillFormat
   * @return underlineFillFormat
  **/
  @ApiModelProperty(value = "")
  public FillFormat getUnderlineFillFormat() {
    return underlineFillFormat;
  }

  public void setUnderlineFillFormat(FillFormat underlineFillFormat) {
    this.underlineFillFormat = underlineFillFormat;
  }

  public Portion underlineLineFormat(LineFormat underlineLineFormat) {
    this.underlineLineFormat = underlineLineFormat;
    return this;
  }

   /**
   * Get underlineLineFormat
   * @return underlineLineFormat
  **/
  @ApiModelProperty(value = "")
  public LineFormat getUnderlineLineFormat() {
    return underlineLineFormat;
  }

  public void setUnderlineLineFormat(LineFormat underlineLineFormat) {
    this.underlineLineFormat = underlineLineFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Portion portion = (Portion) o;
    return true && Objects.equals(this.text, portion.text) && Objects.equals(this.fontBold, portion.fontBold) && Objects.equals(this.fontItalic, portion.fontItalic) && Objects.equals(this.fontUnderline, portion.fontUnderline) && Objects.equals(this.strikethroughType, portion.strikethroughType) && Objects.equals(this.textCapType, portion.textCapType) && Objects.equals(this.escapement, portion.escapement) && Objects.equals(this.spacing, portion.spacing) && Objects.equals(this.fontColor, portion.fontColor) && Objects.equals(this.highlightColor, portion.highlightColor) && Objects.equals(this.fontHeight, portion.fontHeight) && Objects.equals(this.normaliseHeight, portion.normaliseHeight) && Objects.equals(this.proofDisabled, portion.proofDisabled) && Objects.equals(this.smartTagClean, portion.smartTagClean) && Objects.equals(this.kerningMinimalSize, portion.kerningMinimalSize) && Objects.equals(this.kumimoji, portion.kumimoji) && Objects.equals(this.languageId, portion.languageId) && Objects.equals(this.alternativeLanguageId, portion.alternativeLanguageId) && Objects.equals(this.isHardUnderlineFill, portion.isHardUnderlineFill) && Objects.equals(this.isHardUnderlineLine, portion.isHardUnderlineLine) && Objects.equals(this.fillFormat, portion.fillFormat) && Objects.equals(this.effectFormat, portion.effectFormat) && Objects.equals(this.lineFormat, portion.lineFormat) && Objects.equals(this.underlineFillFormat, portion.underlineFillFormat) && Objects.equals(this.underlineLineFormat, portion.underlineLineFormat) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, fontBold, fontItalic, fontUnderline, strikethroughType, textCapType, escapement, spacing, fontColor, highlightColor, fontHeight, normaliseHeight, proofDisabled, smartTagClean, kerningMinimalSize, kumimoji, languageId, alternativeLanguageId, isHardUnderlineFill, isHardUnderlineLine, fillFormat, effectFormat, lineFormat, underlineFillFormat, underlineLineFormat, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Portion {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fontBold: ").append(toIndentedString(fontBold)).append("\n");
    sb.append("    fontItalic: ").append(toIndentedString(fontItalic)).append("\n");
    sb.append("    fontUnderline: ").append(toIndentedString(fontUnderline)).append("\n");
    sb.append("    strikethroughType: ").append(toIndentedString(strikethroughType)).append("\n");
    sb.append("    textCapType: ").append(toIndentedString(textCapType)).append("\n");
    sb.append("    escapement: ").append(toIndentedString(escapement)).append("\n");
    sb.append("    spacing: ").append(toIndentedString(spacing)).append("\n");
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    highlightColor: ").append(toIndentedString(highlightColor)).append("\n");
    sb.append("    fontHeight: ").append(toIndentedString(fontHeight)).append("\n");
    sb.append("    normaliseHeight: ").append(toIndentedString(normaliseHeight)).append("\n");
    sb.append("    proofDisabled: ").append(toIndentedString(proofDisabled)).append("\n");
    sb.append("    smartTagClean: ").append(toIndentedString(smartTagClean)).append("\n");
    sb.append("    kerningMinimalSize: ").append(toIndentedString(kerningMinimalSize)).append("\n");
    sb.append("    kumimoji: ").append(toIndentedString(kumimoji)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    alternativeLanguageId: ").append(toIndentedString(alternativeLanguageId)).append("\n");
    sb.append("    isHardUnderlineFill: ").append(toIndentedString(isHardUnderlineFill)).append("\n");
    sb.append("    isHardUnderlineLine: ").append(toIndentedString(isHardUnderlineLine)).append("\n");
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    effectFormat: ").append(toIndentedString(effectFormat)).append("\n");
    sb.append("    lineFormat: ").append(toIndentedString(lineFormat)).append("\n");
    sb.append("    underlineFillFormat: ").append(toIndentedString(underlineFillFormat)).append("\n");
    sb.append("    underlineLineFormat: ").append(toIndentedString(underlineLineFormat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

