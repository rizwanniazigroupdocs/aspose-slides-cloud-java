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
import com.aspose.slides.model.CombinedShapeType;
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.ResourceBase;
import com.aspose.slides.model.ResourceUri;
import com.aspose.slides.model.ResourceUriElement;
import com.aspose.slides.model.ShapeType;
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
 * ShapeBase
 */
public class ShapeBase extends ResourceBase {
  @SerializedName("Type")
  private ShapeType type;

  @SerializedName("ShapeType")
  private CombinedShapeType shapeType;

  @SerializedName("Name")
  private String name;

  @SerializedName("Width")
  private Double width;

  @SerializedName("Height")
  private Double height;

  @SerializedName("AlternativeText")
  private String alternativeText;

  @SerializedName("Hidden")
  private Boolean hidden;

  @SerializedName("X")
  private Double X;

  @SerializedName("Y")
  private Double Y;

  @SerializedName("ZOrderPosition")
  private Integer zorderPosition;

  @SerializedName("Shapes")
  private ResourceUriElement shapes;

  @SerializedName("FillFormat")
  private FillFormat fillFormat;

  @SerializedName("EffectFormat")
  private EffectFormat effectFormat;

  @SerializedName("LineFormat")
  private LineFormat lineFormat;


  public ShapeBase() {
    super();
    setAlternateLinks(new ArrayList<ResourceUri>());
    setLinks(new ArrayList<ResourceUri>());
  }

  public ShapeBase type(ShapeType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ShapeType getType() {
    return type;
  }

  public void setType(ShapeType type) {
    this.type = type;
  }

  public ShapeBase shapeType(CombinedShapeType shapeType) {
    this.shapeType = shapeType;
    return this;
  }

   /**
   * Gets or sets the type of the shape.
   * @return shapeType
  **/
  @ApiModelProperty(value = "Gets or sets the type of the shape.")
  public CombinedShapeType getShapeType() {
    return shapeType;
  }

  public void setShapeType(CombinedShapeType shapeType) {
    this.shapeType = shapeType;
  }

  public ShapeBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets the name.
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets the name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShapeBase width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Gets or sets the width.
   * @return width
  **/
  @ApiModelProperty(value = "Gets or sets the width.")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public ShapeBase height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Gets or sets the height.
   * @return height
  **/
  @ApiModelProperty(value = "Gets or sets the height.")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public ShapeBase alternativeText(String alternativeText) {
    this.alternativeText = alternativeText;
    return this;
  }

   /**
   * Gets or sets the alternative text.
   * @return alternativeText
  **/
  @ApiModelProperty(value = "Gets or sets the alternative text.")
  public String getAlternativeText() {
    return alternativeText;
  }

  public void setAlternativeText(String alternativeText) {
    this.alternativeText = alternativeText;
  }

  public ShapeBase hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Gets or sets a value indicating whether this  is hidden.
   * @return hidden
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether this  is hidden.")
  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public ShapeBase X(Double X) {
    this.X = X;
    return this;
  }

   /**
   * Gets or sets the X
   * @return X
  **/
  @ApiModelProperty(value = "Gets or sets the X")
  public Double getX() {
    return X;
  }

  public void setX(Double X) {
    this.X = X;
  }

  public ShapeBase Y(Double Y) {
    this.Y = Y;
    return this;
  }

   /**
   * Gets or sets the Y.
   * @return Y
  **/
  @ApiModelProperty(value = "Gets or sets the Y.")
  public Double getY() {
    return Y;
  }

  public void setY(Double Y) {
    this.Y = Y;
  }

  public ShapeBase zorderPosition(Integer zorderPosition) {
    this.zorderPosition = zorderPosition;
    return this;
  }

   /**
   * Gets z-order position of shape
   * @return zorderPosition
  **/
  @ApiModelProperty(value = "Gets z-order position of shape")
  public Integer getZorderPosition() {
    return zorderPosition;
  }

  public void setZorderPosition(Integer zorderPosition) {
    this.zorderPosition = zorderPosition;
  }

  public ShapeBase shapes(ResourceUriElement shapes) {
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

  public ShapeBase fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Gets or sets the fill format.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Gets or sets the fill format.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public ShapeBase effectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
    return this;
  }

   /**
   * Gets or sets the effect format.
   * @return effectFormat
  **/
  @ApiModelProperty(value = "Gets or sets the effect format.")
  public EffectFormat getEffectFormat() {
    return effectFormat;
  }

  public void setEffectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
  }

  public ShapeBase lineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
    return this;
  }

   /**
   * Gets or sets the line format.
   * @return lineFormat
  **/
  @ApiModelProperty(value = "Gets or sets the line format.")
  public LineFormat getLineFormat() {
    return lineFormat;
  }

  public void setLineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShapeBase shapeBase = (ShapeBase) o;
    return true && Objects.equals(this.type, shapeBase.type) && Objects.equals(this.shapeType, shapeBase.shapeType) && Objects.equals(this.name, shapeBase.name) && Objects.equals(this.width, shapeBase.width) && Objects.equals(this.height, shapeBase.height) && Objects.equals(this.alternativeText, shapeBase.alternativeText) && Objects.equals(this.hidden, shapeBase.hidden) && Objects.equals(this.X, shapeBase.X) && Objects.equals(this.Y, shapeBase.Y) && Objects.equals(this.zorderPosition, shapeBase.zorderPosition) && Objects.equals(this.shapes, shapeBase.shapes) && Objects.equals(this.fillFormat, shapeBase.fillFormat) && Objects.equals(this.effectFormat, shapeBase.effectFormat) && Objects.equals(this.lineFormat, shapeBase.lineFormat) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, shapeType, name, width, height, alternativeText, hidden, X, Y, zorderPosition, shapes, fillFormat, effectFormat, lineFormat, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShapeBase {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shapeType: ").append(toIndentedString(shapeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    alternativeText: ").append(toIndentedString(alternativeText)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    zorderPosition: ").append(toIndentedString(zorderPosition)).append("\n");
    sb.append("    shapes: ").append(toIndentedString(shapes)).append("\n");
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    effectFormat: ").append(toIndentedString(effectFormat)).append("\n");
    sb.append("    lineFormat: ").append(toIndentedString(lineFormat)).append("\n");
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

