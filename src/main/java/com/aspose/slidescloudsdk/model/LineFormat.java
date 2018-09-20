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
import com.aspose.slidescloudsdk.model.ArrowHeadProperties;
import com.aspose.slidescloudsdk.model.CustomDashPattern;
import com.aspose.slidescloudsdk.model.FillFormat;
import com.aspose.slidescloudsdk.model.LineAlignment;
import com.aspose.slidescloudsdk.model.LineCapStyle;
import com.aspose.slidescloudsdk.model.LineDashStyle;
import com.aspose.slidescloudsdk.model.LineJoinStyle;
import com.aspose.slidescloudsdk.model.LineStyle;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LineFormat
 */
public class LineFormat {
  @SerializedName("Alignment")
  private LineAlignment alignment = null;

  @SerializedName("CapStyle")
  private LineCapStyle capStyle = null;

  @SerializedName("DashStyle")
  private LineDashStyle dashStyle = null;

  @SerializedName("JoinStyle")
  private LineJoinStyle joinStyle = null;

  @SerializedName("Style")
  private LineStyle style = null;

  @SerializedName("BeginArrowHead")
  private ArrowHeadProperties beginArrowHead = null;

  @SerializedName("EndArrowHead")
  private ArrowHeadProperties endArrowHead = null;

  @SerializedName("CustomDashPattern")
  private CustomDashPattern customDashPattern = null;

  @SerializedName("FillFormat")
  private FillFormat fillFormat = null;

  @SerializedName("MiterLimit")
  private Double miterLimit = null;

  @SerializedName("Width")
  private Double width = null;

  public LineFormat alignment(LineAlignment alignment) {
    this.alignment = alignment;
    return this;
  }

   /**
   * Get alignment
   * @return alignment
  **/
  @ApiModelProperty(required = true, value = "")
  public LineAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(LineAlignment alignment) {
    this.alignment = alignment;
  }

  public LineFormat capStyle(LineCapStyle capStyle) {
    this.capStyle = capStyle;
    return this;
  }

   /**
   * Get capStyle
   * @return capStyle
  **/
  @ApiModelProperty(required = true, value = "")
  public LineCapStyle getCapStyle() {
    return capStyle;
  }

  public void setCapStyle(LineCapStyle capStyle) {
    this.capStyle = capStyle;
  }

  public LineFormat dashStyle(LineDashStyle dashStyle) {
    this.dashStyle = dashStyle;
    return this;
  }

   /**
   * Get dashStyle
   * @return dashStyle
  **/
  @ApiModelProperty(required = true, value = "")
  public LineDashStyle getDashStyle() {
    return dashStyle;
  }

  public void setDashStyle(LineDashStyle dashStyle) {
    this.dashStyle = dashStyle;
  }

  public LineFormat joinStyle(LineJoinStyle joinStyle) {
    this.joinStyle = joinStyle;
    return this;
  }

   /**
   * Get joinStyle
   * @return joinStyle
  **/
  @ApiModelProperty(required = true, value = "")
  public LineJoinStyle getJoinStyle() {
    return joinStyle;
  }

  public void setJoinStyle(LineJoinStyle joinStyle) {
    this.joinStyle = joinStyle;
  }

  public LineFormat style(LineStyle style) {
    this.style = style;
    return this;
  }

   /**
   * Get style
   * @return style
  **/
  @ApiModelProperty(required = true, value = "")
  public LineStyle getStyle() {
    return style;
  }

  public void setStyle(LineStyle style) {
    this.style = style;
  }

  public LineFormat beginArrowHead(ArrowHeadProperties beginArrowHead) {
    this.beginArrowHead = beginArrowHead;
    return this;
  }

   /**
   * Get beginArrowHead
   * @return beginArrowHead
  **/
  @ApiModelProperty(value = "")
  public ArrowHeadProperties getBeginArrowHead() {
    return beginArrowHead;
  }

  public void setBeginArrowHead(ArrowHeadProperties beginArrowHead) {
    this.beginArrowHead = beginArrowHead;
  }

  public LineFormat endArrowHead(ArrowHeadProperties endArrowHead) {
    this.endArrowHead = endArrowHead;
    return this;
  }

   /**
   * Get endArrowHead
   * @return endArrowHead
  **/
  @ApiModelProperty(value = "")
  public ArrowHeadProperties getEndArrowHead() {
    return endArrowHead;
  }

  public void setEndArrowHead(ArrowHeadProperties endArrowHead) {
    this.endArrowHead = endArrowHead;
  }

  public LineFormat customDashPattern(CustomDashPattern customDashPattern) {
    this.customDashPattern = customDashPattern;
    return this;
  }

   /**
   * Get customDashPattern
   * @return customDashPattern
  **/
  @ApiModelProperty(value = "")
  public CustomDashPattern getCustomDashPattern() {
    return customDashPattern;
  }

  public void setCustomDashPattern(CustomDashPattern customDashPattern) {
    this.customDashPattern = customDashPattern;
  }

  public LineFormat fillFormat(FillFormat fillFormat) {
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

  public LineFormat miterLimit(Double miterLimit) {
    this.miterLimit = miterLimit;
    return this;
  }

   /**
   * Get miterLimit
   * @return miterLimit
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getMiterLimit() {
    return miterLimit;
  }

  public void setMiterLimit(Double miterLimit) {
    this.miterLimit = miterLimit;
  }

  public LineFormat width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LineFormat lineFormat = (LineFormat) o;
    return true && Objects.equals(this.alignment, lineFormat.alignment) && Objects.equals(this.capStyle, lineFormat.capStyle) && Objects.equals(this.dashStyle, lineFormat.dashStyle) && Objects.equals(this.joinStyle, lineFormat.joinStyle) && Objects.equals(this.style, lineFormat.style) && Objects.equals(this.beginArrowHead, lineFormat.beginArrowHead) && Objects.equals(this.endArrowHead, lineFormat.endArrowHead) && Objects.equals(this.customDashPattern, lineFormat.customDashPattern) && Objects.equals(this.fillFormat, lineFormat.fillFormat) && Objects.equals(this.miterLimit, lineFormat.miterLimit) && Objects.equals(this.width, lineFormat.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, capStyle, dashStyle, joinStyle, style, beginArrowHead, endArrowHead, customDashPattern, fillFormat, miterLimit, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineFormat {\n");
    
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    capStyle: ").append(toIndentedString(capStyle)).append("\n");
    sb.append("    dashStyle: ").append(toIndentedString(dashStyle)).append("\n");
    sb.append("    joinStyle: ").append(toIndentedString(joinStyle)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    beginArrowHead: ").append(toIndentedString(beginArrowHead)).append("\n");
    sb.append("    endArrowHead: ").append(toIndentedString(endArrowHead)).append("\n");
    sb.append("    customDashPattern: ").append(toIndentedString(customDashPattern)).append("\n");
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    miterLimit: ").append(toIndentedString(miterLimit)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

