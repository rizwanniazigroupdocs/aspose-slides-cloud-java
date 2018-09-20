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
import com.aspose.slidescloudsdk.model.FillFormat;
import com.aspose.slidescloudsdk.model.PatternStyle;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents Pattern Fill
 */
@ApiModel(description = "Represents Pattern Fill")
public class PatternFill extends FillFormat {
  @SerializedName("BackColor")
  private String backColor = null;

  @SerializedName("ForeColor")
  private String foreColor = null;

  @SerializedName("Style")
  private PatternStyle style = null;

  public PatternFill backColor(String backColor) {
    this.backColor = backColor;
    return this;
  }

   /**
   * Gets or sets the back color of the pattern fill.
   * @return backColor
  **/
  @ApiModelProperty(value = "Gets or sets the back color of the pattern fill.")
  public String getBackColor() {
    return backColor;
  }

  public void setBackColor(String backColor) {
    this.backColor = backColor;
  }

  public PatternFill foreColor(String foreColor) {
    this.foreColor = foreColor;
    return this;
  }

   /**
   * Gets or sets the fore color of the pattern fill.
   * @return foreColor
  **/
  @ApiModelProperty(value = "Gets or sets the fore color of the pattern fill.")
  public String getForeColor() {
    return foreColor;
  }

  public void setForeColor(String foreColor) {
    this.foreColor = foreColor;
  }

  public PatternFill style(PatternStyle style) {
    this.style = style;
    return this;
  }

   /**
   * Gets or sets the style of pattern fill.
   * @return style
  **/
  @ApiModelProperty(value = "Gets or sets the style of pattern fill.")
  public PatternStyle getStyle() {
    return style;
  }

  public void setStyle(PatternStyle style) {
    this.style = style;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatternFill patternFill = (PatternFill) o;
    return true && Objects.equals(this.backColor, patternFill.backColor) && Objects.equals(this.foreColor, patternFill.foreColor) && Objects.equals(this.style, patternFill.style) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backColor, foreColor, style, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatternFill {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    backColor: ").append(toIndentedString(backColor)).append("\n");
    sb.append("    foreColor: ").append(toIndentedString(foreColor)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

