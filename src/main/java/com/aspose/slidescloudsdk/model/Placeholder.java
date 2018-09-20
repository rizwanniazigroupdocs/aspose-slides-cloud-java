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
import com.aspose.slidescloudsdk.model.PlaceholderOrientation;
import com.aspose.slidescloudsdk.model.PlaceholderSize;
import com.aspose.slidescloudsdk.model.PlaceholderType;
import com.aspose.slidescloudsdk.model.ResourceBase;
import com.aspose.slidescloudsdk.model.ResourceUri;
import com.aspose.slidescloudsdk.model.ResourceUriElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Represents placeholder
 */
@ApiModel(description = "Represents placeholder")
public class Placeholder extends ResourceBase {
  @SerializedName("Index")
  private Integer index = null;

  @SerializedName("Orientation")
  private PlaceholderOrientation orientation = null;

  @SerializedName("Size")
  private PlaceholderSize size = null;

  @SerializedName("Type")
  private PlaceholderType type = null;

  @SerializedName("Shape")
  private ResourceUriElement shape = null;

  public Placeholder index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public Placeholder orientation(PlaceholderOrientation orientation) {
    this.orientation = orientation;
    return this;
  }

   /**
   * Get orientation
   * @return orientation
  **/
  @ApiModelProperty(value = "")
  public PlaceholderOrientation getOrientation() {
    return orientation;
  }

  public void setOrientation(PlaceholderOrientation orientation) {
    this.orientation = orientation;
  }

  public Placeholder size(PlaceholderSize size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public PlaceholderSize getSize() {
    return size;
  }

  public void setSize(PlaceholderSize size) {
    this.size = size;
  }

  public Placeholder type(PlaceholderType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public PlaceholderType getType() {
    return type;
  }

  public void setType(PlaceholderType type) {
    this.type = type;
  }

  public Placeholder shape(ResourceUriElement shape) {
    this.shape = shape;
    return this;
  }

   /**
   * Get shape
   * @return shape
  **/
  @ApiModelProperty(value = "")
  public ResourceUriElement getShape() {
    return shape;
  }

  public void setShape(ResourceUriElement shape) {
    this.shape = shape;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Placeholder placeholder = (Placeholder) o;
    return true && Objects.equals(this.index, placeholder.index) && Objects.equals(this.orientation, placeholder.orientation) && Objects.equals(this.size, placeholder.size) && Objects.equals(this.type, placeholder.type) && Objects.equals(this.shape, placeholder.shape) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, orientation, size, type, shape, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Placeholder {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
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

