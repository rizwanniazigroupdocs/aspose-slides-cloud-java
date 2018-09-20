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
 * Represents list of Links to Paragraphs resources
 */
@ApiModel(description = "Represents list of Links to Paragraphs resources")
public class PortionList extends ResourceBase {
  @SerializedName("PortionLinks")
  private List<ResourceUriElement> portionLinks = null;

  public PortionList portionLinks(List<ResourceUriElement> portionLinks) {
    this.portionLinks = portionLinks;
    return this;
  }

  public PortionList addPortionLinksItem(ResourceUriElement portionLinksItem) {
    if (this.portionLinks == null) {
      this.portionLinks = new ArrayList<ResourceUriElement>();
    }
    this.portionLinks.add(portionLinksItem);
    return this;
  }

   /**
   * Get portionLinks
   * @return portionLinks
  **/
  @ApiModelProperty(value = "")
  public List<ResourceUriElement> getPortionLinks() {
    return portionLinks;
  }

  public void setPortionLinks(List<ResourceUriElement> portionLinks) {
    this.portionLinks = portionLinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortionList portionList = (PortionList) o;
    return true && Objects.equals(this.portionLinks, portionList.portionLinks) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portionLinks, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortionList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    portionLinks: ").append(toIndentedString(portionLinks)).append("\n");
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

