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
import com.aspose.slidescloudsdk.model.EffectFormat;
import com.aspose.slidescloudsdk.model.FillFormat;
import com.aspose.slidescloudsdk.model.LineFormat;
import com.aspose.slidescloudsdk.model.ResourceUri;
import com.aspose.slidescloudsdk.model.ResourceUriElement;
import com.aspose.slidescloudsdk.model.ShapeBase;
import com.aspose.slidescloudsdk.model.SmartArtColorType;
import com.aspose.slidescloudsdk.model.SmartArtLayoutType;
import com.aspose.slidescloudsdk.model.SmartArtNode;
import com.aspose.slidescloudsdk.model.SmartArtQuickStyleType;
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
 * Represents SmartArt shape resource.
 */
@ApiModel(description = "Represents SmartArt shape resource.")
public class SmartArt extends ShapeBase {
  @SerializedName("Layout")
  private SmartArtLayoutType layout = null;

  @SerializedName("QuickStyle")
  private SmartArtQuickStyleType quickStyle = null;

  @SerializedName("ColorStyle")
  private SmartArtColorType colorStyle = null;

  @SerializedName("Nodes")
  private List<SmartArtNode> nodes = null;

  @SerializedName("IsReversed")
  private Boolean isReversed = null;

  public SmartArt layout(SmartArtLayoutType layout) {
    this.layout = layout;
    return this;
  }

   /**
   * Layout type.
   * @return layout
  **/
  @ApiModelProperty(value = "Layout type.")
  public SmartArtLayoutType getLayout() {
    return layout;
  }

  public void setLayout(SmartArtLayoutType layout) {
    this.layout = layout;
  }

  public SmartArt quickStyle(SmartArtQuickStyleType quickStyle) {
    this.quickStyle = quickStyle;
    return this;
  }

   /**
   * Quick style.
   * @return quickStyle
  **/
  @ApiModelProperty(value = "Quick style.")
  public SmartArtQuickStyleType getQuickStyle() {
    return quickStyle;
  }

  public void setQuickStyle(SmartArtQuickStyleType quickStyle) {
    this.quickStyle = quickStyle;
  }

  public SmartArt colorStyle(SmartArtColorType colorStyle) {
    this.colorStyle = colorStyle;
    return this;
  }

   /**
   * Color style.
   * @return colorStyle
  **/
  @ApiModelProperty(value = "Color style.")
  public SmartArtColorType getColorStyle() {
    return colorStyle;
  }

  public void setColorStyle(SmartArtColorType colorStyle) {
    this.colorStyle = colorStyle;
  }

  public SmartArt nodes(List<SmartArtNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public SmartArt addNodesItem(SmartArtNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<SmartArtNode>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Collection of nodes in SmartArt object.             
   * @return nodes
  **/
  @ApiModelProperty(value = "Collection of nodes in SmartArt object.             ")
  public List<SmartArtNode> getNodes() {
    return nodes;
  }

  public void setNodes(List<SmartArtNode> nodes) {
    this.nodes = nodes;
  }

  public SmartArt isReversed(Boolean isReversed) {
    this.isReversed = isReversed;
    return this;
  }

   /**
   * The state of the SmartArt diagram with regard to (left-to-right) LTR or (right-to-left) RTL, if the diagram supports reversal.
   * @return isReversed
  **/
  @ApiModelProperty(value = "The state of the SmartArt diagram with regard to (left-to-right) LTR or (right-to-left) RTL, if the diagram supports reversal.")
  public Boolean isIsReversed() {
    return isReversed;
  }

  public void setIsReversed(Boolean isReversed) {
    this.isReversed = isReversed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartArt smartArt = (SmartArt) o;
    return true && Objects.equals(this.layout, smartArt.layout) && Objects.equals(this.quickStyle, smartArt.quickStyle) && Objects.equals(this.colorStyle, smartArt.colorStyle) && Objects.equals(this.nodes, smartArt.nodes) && Objects.equals(this.isReversed, smartArt.isReversed) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layout, quickStyle, colorStyle, nodes, isReversed, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartArt {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    quickStyle: ").append(toIndentedString(quickStyle)).append("\n");
    sb.append("    colorStyle: ").append(toIndentedString(colorStyle)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    isReversed: ").append(toIndentedString(isReversed)).append("\n");
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

