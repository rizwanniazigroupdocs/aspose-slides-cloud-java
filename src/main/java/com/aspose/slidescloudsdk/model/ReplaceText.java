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
import com.aspose.slidescloudsdk.model.Task;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ReplaceText
 */
public class ReplaceText extends Task {
  @SerializedName("OldText")
  private String oldText = null;

  @SerializedName("NewText")
  private String newText = null;

  @SerializedName("IgnoreCase")
  private Boolean ignoreCase = null;

  @SerializedName("SlidePosition")
  private Integer slidePosition = null;

  public ReplaceText oldText(String oldText) {
    this.oldText = oldText;
    return this;
  }

   /**
   * Get oldText
   * @return oldText
  **/
  @ApiModelProperty(value = "")
  public String getOldText() {
    return oldText;
  }

  public void setOldText(String oldText) {
    this.oldText = oldText;
  }

  public ReplaceText newText(String newText) {
    this.newText = newText;
    return this;
  }

   /**
   * Get newText
   * @return newText
  **/
  @ApiModelProperty(value = "")
  public String getNewText() {
    return newText;
  }

  public void setNewText(String newText) {
    this.newText = newText;
  }

  public ReplaceText ignoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

   /**
   * Get ignoreCase
   * @return ignoreCase
  **/
  @ApiModelProperty(value = "")
  public Boolean isIgnoreCase() {
    return ignoreCase;
  }

  public void setIgnoreCase(Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }

  public ReplaceText slidePosition(Integer slidePosition) {
    this.slidePosition = slidePosition;
    return this;
  }

   /**
   * Get slidePosition
   * @return slidePosition
  **/
  @ApiModelProperty(value = "")
  public Integer getSlidePosition() {
    return slidePosition;
  }

  public void setSlidePosition(Integer slidePosition) {
    this.slidePosition = slidePosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceText replaceText = (ReplaceText) o;
    return true && Objects.equals(this.oldText, replaceText.oldText) && Objects.equals(this.newText, replaceText.newText) && Objects.equals(this.ignoreCase, replaceText.ignoreCase) && Objects.equals(this.slidePosition, replaceText.slidePosition) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oldText, newText, ignoreCase, slidePosition, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceText {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    oldText: ").append(toIndentedString(oldText)).append("\n");
    sb.append("    newText: ").append(toIndentedString(newText)).append("\n");
    sb.append("    ignoreCase: ").append(toIndentedString(ignoreCase)).append("\n");
    sb.append("    slidePosition: ").append(toIndentedString(slidePosition)).append("\n");
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

