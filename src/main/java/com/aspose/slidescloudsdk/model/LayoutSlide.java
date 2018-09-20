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
import com.aspose.slidescloudsdk.model.LayoutSlideType;
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
import java.util.ArrayList;
import java.util.List;

/**
 * LayoutSlide
 */
public class LayoutSlide extends ResourceBase {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("Type")
  private LayoutSlideType type = null;

  @SerializedName("MasterSlide")
  private ResourceUriElement masterSlide = null;

  @SerializedName("DependingSlides")
  private List<ResourceUriElement> dependingSlides = null;

  public LayoutSlide name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LayoutSlide type(LayoutSlideType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public LayoutSlideType getType() {
    return type;
  }

  public void setType(LayoutSlideType type) {
    this.type = type;
  }

  public LayoutSlide masterSlide(ResourceUriElement masterSlide) {
    this.masterSlide = masterSlide;
    return this;
  }

   /**
   * Get masterSlide
   * @return masterSlide
  **/
  @ApiModelProperty(value = "")
  public ResourceUriElement getMasterSlide() {
    return masterSlide;
  }

  public void setMasterSlide(ResourceUriElement masterSlide) {
    this.masterSlide = masterSlide;
  }

  public LayoutSlide dependingSlides(List<ResourceUriElement> dependingSlides) {
    this.dependingSlides = dependingSlides;
    return this;
  }

  public LayoutSlide addDependingSlidesItem(ResourceUriElement dependingSlidesItem) {
    if (this.dependingSlides == null) {
      this.dependingSlides = new ArrayList<ResourceUriElement>();
    }
    this.dependingSlides.add(dependingSlidesItem);
    return this;
  }

   /**
   * Get dependingSlides
   * @return dependingSlides
  **/
  @ApiModelProperty(value = "")
  public List<ResourceUriElement> getDependingSlides() {
    return dependingSlides;
  }

  public void setDependingSlides(List<ResourceUriElement> dependingSlides) {
    this.dependingSlides = dependingSlides;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayoutSlide layoutSlide = (LayoutSlide) o;
    return true && Objects.equals(this.name, layoutSlide.name) && Objects.equals(this.type, layoutSlide.type) && Objects.equals(this.masterSlide, layoutSlide.masterSlide) && Objects.equals(this.dependingSlides, layoutSlide.dependingSlides) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, masterSlide, dependingSlides, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayoutSlide {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    masterSlide: ").append(toIndentedString(masterSlide)).append("\n");
    sb.append("    dependingSlides: ").append(toIndentedString(dependingSlides)).append("\n");
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

