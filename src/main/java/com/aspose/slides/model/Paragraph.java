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
import com.aspose.slides.model.BulletType;
import com.aspose.slides.model.FontAlignment;
import com.aspose.slides.model.NullableBool;
import com.aspose.slides.model.NumberedBulletStyle;
import com.aspose.slides.model.ResourceBase;
import com.aspose.slides.model.ResourceUri;
import com.aspose.slides.model.ResourceUriElement;
import com.aspose.slides.model.TextAlignment;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents paragraph resource
 */
@ApiModel(description = "Represents paragraph resource")
public class Paragraph extends ResourceBase {
  @SerializedName("MarginLeft")
  private Double marginLeft;

  @SerializedName("MarginRight")
  private Double marginRight;

  @SerializedName("SpaceBefore")
  private Double spaceBefore;

  @SerializedName("SpaceAfter")
  private Double spaceAfter;

  @SerializedName("SpaceWithin")
  private Double spaceWithin;

  @SerializedName("Indent")
  private Double indent;

  @SerializedName("Alignment")
  private TextAlignment alignment;

  @SerializedName("FontAlignment")
  private FontAlignment fontAlignment;

  @SerializedName("DefaultTabSize")
  private Double defaultTabSize;

  @SerializedName("Depth")
  private Integer depth;

  @SerializedName("BulletChar")
  private String bulletChar;

  @SerializedName("BulletHeight")
  private Double bulletHeight;

  @SerializedName("BulletType")
  private BulletType bulletType;

  @SerializedName("NumberedBulletStartWith")
  private Integer numberedBulletStartWith;

  @SerializedName("NumberedBulletStyle")
  private NumberedBulletStyle numberedBulletStyle;

  @SerializedName("HangingPunctuation")
  private NullableBool hangingPunctuation;

  @SerializedName("EastAsianLineBreak")
  private NullableBool eastAsianLineBreak;

  @SerializedName("LatinLineBreak")
  private NullableBool latinLineBreak;

  @SerializedName("RightToLeft")
  private NullableBool rightToLeft;

  @SerializedName("PortionList")
  private List<ResourceUriElement> portionList = null;


  public Paragraph() {
    super();
    setAlternateLinks(new ArrayList<ResourceUri>());
    setLinks(new ArrayList<ResourceUri>());
    setPortionList(new ArrayList<ResourceUriElement>());
  }

  public Paragraph marginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
    return this;
  }

   /**
   * Get marginLeft
   * @return marginLeft
  **/
  @ApiModelProperty(value = "")
  public Double getMarginLeft() {
    return marginLeft;
  }

  public void setMarginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
  }

  public Paragraph marginRight(Double marginRight) {
    this.marginRight = marginRight;
    return this;
  }

   /**
   * Get marginRight
   * @return marginRight
  **/
  @ApiModelProperty(value = "")
  public Double getMarginRight() {
    return marginRight;
  }

  public void setMarginRight(Double marginRight) {
    this.marginRight = marginRight;
  }

  public Paragraph spaceBefore(Double spaceBefore) {
    this.spaceBefore = spaceBefore;
    return this;
  }

   /**
   * Get spaceBefore
   * @return spaceBefore
  **/
  @ApiModelProperty(value = "")
  public Double getSpaceBefore() {
    return spaceBefore;
  }

  public void setSpaceBefore(Double spaceBefore) {
    this.spaceBefore = spaceBefore;
  }

  public Paragraph spaceAfter(Double spaceAfter) {
    this.spaceAfter = spaceAfter;
    return this;
  }

   /**
   * Get spaceAfter
   * @return spaceAfter
  **/
  @ApiModelProperty(value = "")
  public Double getSpaceAfter() {
    return spaceAfter;
  }

  public void setSpaceAfter(Double spaceAfter) {
    this.spaceAfter = spaceAfter;
  }

  public Paragraph spaceWithin(Double spaceWithin) {
    this.spaceWithin = spaceWithin;
    return this;
  }

   /**
   * Get spaceWithin
   * @return spaceWithin
  **/
  @ApiModelProperty(value = "")
  public Double getSpaceWithin() {
    return spaceWithin;
  }

  public void setSpaceWithin(Double spaceWithin) {
    this.spaceWithin = spaceWithin;
  }

  public Paragraph indent(Double indent) {
    this.indent = indent;
    return this;
  }

   /**
   * Get indent
   * @return indent
  **/
  @ApiModelProperty(value = "")
  public Double getIndent() {
    return indent;
  }

  public void setIndent(Double indent) {
    this.indent = indent;
  }

  public Paragraph alignment(TextAlignment alignment) {
    this.alignment = alignment;
    return this;
  }

   /**
   * Get alignment
   * @return alignment
  **/
  @ApiModelProperty(value = "")
  public TextAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(TextAlignment alignment) {
    this.alignment = alignment;
  }

  public Paragraph fontAlignment(FontAlignment fontAlignment) {
    this.fontAlignment = fontAlignment;
    return this;
  }

   /**
   * Get fontAlignment
   * @return fontAlignment
  **/
  @ApiModelProperty(value = "")
  public FontAlignment getFontAlignment() {
    return fontAlignment;
  }

  public void setFontAlignment(FontAlignment fontAlignment) {
    this.fontAlignment = fontAlignment;
  }

  public Paragraph defaultTabSize(Double defaultTabSize) {
    this.defaultTabSize = defaultTabSize;
    return this;
  }

   /**
   * Get defaultTabSize
   * @return defaultTabSize
  **/
  @ApiModelProperty(value = "")
  public Double getDefaultTabSize() {
    return defaultTabSize;
  }

  public void setDefaultTabSize(Double defaultTabSize) {
    this.defaultTabSize = defaultTabSize;
  }

  public Paragraph depth(Integer depth) {
    this.depth = depth;
    return this;
  }

   /**
   * Get depth
   * @return depth
  **/
  @ApiModelProperty(value = "")
  public Integer getDepth() {
    return depth;
  }

  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  public Paragraph bulletChar(String bulletChar) {
    this.bulletChar = bulletChar;
    return this;
  }

   /**
   * Get bulletChar
   * @return bulletChar
  **/
  @ApiModelProperty(value = "")
  public String getBulletChar() {
    return bulletChar;
  }

  public void setBulletChar(String bulletChar) {
    this.bulletChar = bulletChar;
  }

  public Paragraph bulletHeight(Double bulletHeight) {
    this.bulletHeight = bulletHeight;
    return this;
  }

   /**
   * Get bulletHeight
   * @return bulletHeight
  **/
  @ApiModelProperty(value = "")
  public Double getBulletHeight() {
    return bulletHeight;
  }

  public void setBulletHeight(Double bulletHeight) {
    this.bulletHeight = bulletHeight;
  }

  public Paragraph bulletType(BulletType bulletType) {
    this.bulletType = bulletType;
    return this;
  }

   /**
   * Get bulletType
   * @return bulletType
  **/
  @ApiModelProperty(value = "")
  public BulletType getBulletType() {
    return bulletType;
  }

  public void setBulletType(BulletType bulletType) {
    this.bulletType = bulletType;
  }

  public Paragraph numberedBulletStartWith(Integer numberedBulletStartWith) {
    this.numberedBulletStartWith = numberedBulletStartWith;
    return this;
  }

   /**
   * Get numberedBulletStartWith
   * @return numberedBulletStartWith
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberedBulletStartWith() {
    return numberedBulletStartWith;
  }

  public void setNumberedBulletStartWith(Integer numberedBulletStartWith) {
    this.numberedBulletStartWith = numberedBulletStartWith;
  }

  public Paragraph numberedBulletStyle(NumberedBulletStyle numberedBulletStyle) {
    this.numberedBulletStyle = numberedBulletStyle;
    return this;
  }

   /**
   * Get numberedBulletStyle
   * @return numberedBulletStyle
  **/
  @ApiModelProperty(value = "")
  public NumberedBulletStyle getNumberedBulletStyle() {
    return numberedBulletStyle;
  }

  public void setNumberedBulletStyle(NumberedBulletStyle numberedBulletStyle) {
    this.numberedBulletStyle = numberedBulletStyle;
  }

  public Paragraph hangingPunctuation(NullableBool hangingPunctuation) {
    this.hangingPunctuation = hangingPunctuation;
    return this;
  }

   /**
   * Get hangingPunctuation
   * @return hangingPunctuation
  **/
  @ApiModelProperty(value = "")
  public NullableBool getHangingPunctuation() {
    return hangingPunctuation;
  }

  public void setHangingPunctuation(NullableBool hangingPunctuation) {
    this.hangingPunctuation = hangingPunctuation;
  }

  public Paragraph eastAsianLineBreak(NullableBool eastAsianLineBreak) {
    this.eastAsianLineBreak = eastAsianLineBreak;
    return this;
  }

   /**
   * Get eastAsianLineBreak
   * @return eastAsianLineBreak
  **/
  @ApiModelProperty(value = "")
  public NullableBool getEastAsianLineBreak() {
    return eastAsianLineBreak;
  }

  public void setEastAsianLineBreak(NullableBool eastAsianLineBreak) {
    this.eastAsianLineBreak = eastAsianLineBreak;
  }

  public Paragraph latinLineBreak(NullableBool latinLineBreak) {
    this.latinLineBreak = latinLineBreak;
    return this;
  }

   /**
   * Get latinLineBreak
   * @return latinLineBreak
  **/
  @ApiModelProperty(value = "")
  public NullableBool getLatinLineBreak() {
    return latinLineBreak;
  }

  public void setLatinLineBreak(NullableBool latinLineBreak) {
    this.latinLineBreak = latinLineBreak;
  }

  public Paragraph rightToLeft(NullableBool rightToLeft) {
    this.rightToLeft = rightToLeft;
    return this;
  }

   /**
   * Get rightToLeft
   * @return rightToLeft
  **/
  @ApiModelProperty(value = "")
  public NullableBool getRightToLeft() {
    return rightToLeft;
  }

  public void setRightToLeft(NullableBool rightToLeft) {
    this.rightToLeft = rightToLeft;
  }

  public Paragraph portionList(List<ResourceUriElement> portionList) {
    this.portionList = portionList;
    return this;
  }

  public Paragraph addPortionListItem(ResourceUriElement portionListItem) {
    if (this.portionList == null) {
      this.portionList = new ArrayList<ResourceUriElement>();
    }
    this.portionList.add(portionListItem);
    return this;
  }

   /**
   * Get portionList
   * @return portionList
  **/
  @ApiModelProperty(value = "")
  public List<ResourceUriElement> getPortionList() {
    return portionList;
  }

  public void setPortionList(List<ResourceUriElement> portionList) {
    this.portionList = portionList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paragraph paragraph = (Paragraph) o;
    return true && Objects.equals(this.marginLeft, paragraph.marginLeft) && Objects.equals(this.marginRight, paragraph.marginRight) && Objects.equals(this.spaceBefore, paragraph.spaceBefore) && Objects.equals(this.spaceAfter, paragraph.spaceAfter) && Objects.equals(this.spaceWithin, paragraph.spaceWithin) && Objects.equals(this.indent, paragraph.indent) && Objects.equals(this.alignment, paragraph.alignment) && Objects.equals(this.fontAlignment, paragraph.fontAlignment) && Objects.equals(this.defaultTabSize, paragraph.defaultTabSize) && Objects.equals(this.depth, paragraph.depth) && Objects.equals(this.bulletChar, paragraph.bulletChar) && Objects.equals(this.bulletHeight, paragraph.bulletHeight) && Objects.equals(this.bulletType, paragraph.bulletType) && Objects.equals(this.numberedBulletStartWith, paragraph.numberedBulletStartWith) && Objects.equals(this.numberedBulletStyle, paragraph.numberedBulletStyle) && Objects.equals(this.hangingPunctuation, paragraph.hangingPunctuation) && Objects.equals(this.eastAsianLineBreak, paragraph.eastAsianLineBreak) && Objects.equals(this.latinLineBreak, paragraph.latinLineBreak) && Objects.equals(this.rightToLeft, paragraph.rightToLeft) && Objects.equals(this.portionList, paragraph.portionList) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marginLeft, marginRight, spaceBefore, spaceAfter, spaceWithin, indent, alignment, fontAlignment, defaultTabSize, depth, bulletChar, bulletHeight, bulletType, numberedBulletStartWith, numberedBulletStyle, hangingPunctuation, eastAsianLineBreak, latinLineBreak, rightToLeft, portionList, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paragraph {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    marginLeft: ").append(toIndentedString(marginLeft)).append("\n");
    sb.append("    marginRight: ").append(toIndentedString(marginRight)).append("\n");
    sb.append("    spaceBefore: ").append(toIndentedString(spaceBefore)).append("\n");
    sb.append("    spaceAfter: ").append(toIndentedString(spaceAfter)).append("\n");
    sb.append("    spaceWithin: ").append(toIndentedString(spaceWithin)).append("\n");
    sb.append("    indent: ").append(toIndentedString(indent)).append("\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    fontAlignment: ").append(toIndentedString(fontAlignment)).append("\n");
    sb.append("    defaultTabSize: ").append(toIndentedString(defaultTabSize)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    bulletChar: ").append(toIndentedString(bulletChar)).append("\n");
    sb.append("    bulletHeight: ").append(toIndentedString(bulletHeight)).append("\n");
    sb.append("    bulletType: ").append(toIndentedString(bulletType)).append("\n");
    sb.append("    numberedBulletStartWith: ").append(toIndentedString(numberedBulletStartWith)).append("\n");
    sb.append("    numberedBulletStyle: ").append(toIndentedString(numberedBulletStyle)).append("\n");
    sb.append("    hangingPunctuation: ").append(toIndentedString(hangingPunctuation)).append("\n");
    sb.append("    eastAsianLineBreak: ").append(toIndentedString(eastAsianLineBreak)).append("\n");
    sb.append("    latinLineBreak: ").append(toIndentedString(latinLineBreak)).append("\n");
    sb.append("    rightToLeft: ").append(toIndentedString(rightToLeft)).append("\n");
    sb.append("    portionList: ").append(toIndentedString(portionList)).append("\n");
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

