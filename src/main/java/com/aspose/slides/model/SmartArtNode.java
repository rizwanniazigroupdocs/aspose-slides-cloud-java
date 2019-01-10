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
import com.aspose.slides.model.OrganizationChartLayoutType;
import com.aspose.slides.model.ResourceUriElement;
import com.aspose.slides.model.SmartArtNode;
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
 * Smart art node.
 */
@ApiModel(description = "Smart art node.")
public class SmartArtNode {
  @SerializedName("Nodes")
  private List<SmartArtNode> nodes = null;

  @SerializedName("Shapes")
  private ResourceUriElement shapes;

  @SerializedName("IsAssistant")
  private Boolean isAssistant;

  @SerializedName("Text")
  private String text;

  @SerializedName("OrgChartLayout")
  private OrganizationChartLayoutType orgChartLayout;


  public SmartArtNode() {
    super();
    setNodes(new ArrayList<SmartArtNode>());
  }

  public SmartArtNode nodes(List<SmartArtNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public SmartArtNode addNodesItem(SmartArtNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<SmartArtNode>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

   /**
   * Node list.
   * @return nodes
  **/
  @ApiModelProperty(value = "Node list.")
  public List<SmartArtNode> getNodes() {
    return nodes;
  }

  public void setNodes(List<SmartArtNode> nodes) {
    this.nodes = nodes;
  }

  public SmartArtNode shapes(ResourceUriElement shapes) {
    this.shapes = shapes;
    return this;
  }

   /**
   * Gets or sets the link to shapes.
   * @return shapes
  **/
  @ApiModelProperty(value = "Gets or sets the link to shapes.")
  public ResourceUriElement getShapes() {
    return shapes;
  }

  public void setShapes(ResourceUriElement shapes) {
    this.shapes = shapes;
  }

  public SmartArtNode isAssistant(Boolean isAssistant) {
    this.isAssistant = isAssistant;
    return this;
  }

   /**
   * True for and assistant node.
   * @return isAssistant
  **/
  @ApiModelProperty(required = true, value = "True for and assistant node.")
  public Boolean isIsAssistant() {
    return isAssistant;
  }

  public void setIsAssistant(Boolean isAssistant) {
    this.isAssistant = isAssistant;
  }

  public SmartArtNode text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Node text.
   * @return text
  **/
  @ApiModelProperty(value = "Node text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SmartArtNode orgChartLayout(OrganizationChartLayoutType orgChartLayout) {
    this.orgChartLayout = orgChartLayout;
    return this;
  }

   /**
   * Organization chart layout type associated with current node.
   * @return orgChartLayout
  **/
  @ApiModelProperty(required = true, value = "Organization chart layout type associated with current node.")
  public OrganizationChartLayoutType getOrgChartLayout() {
    return orgChartLayout;
  }

  public void setOrgChartLayout(OrganizationChartLayoutType orgChartLayout) {
    this.orgChartLayout = orgChartLayout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartArtNode smartArtNode = (SmartArtNode) o;
    return true && Objects.equals(this.nodes, smartArtNode.nodes) && Objects.equals(this.shapes, smartArtNode.shapes) && Objects.equals(this.isAssistant, smartArtNode.isAssistant) && Objects.equals(this.text, smartArtNode.text) && Objects.equals(this.orgChartLayout, smartArtNode.orgChartLayout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodes, shapes, isAssistant, text, orgChartLayout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartArtNode {\n");
    
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    shapes: ").append(toIndentedString(shapes)).append("\n");
    sb.append("    isAssistant: ").append(toIndentedString(isAssistant)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    orgChartLayout: ").append(toIndentedString(orgChartLayout)).append("\n");
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

