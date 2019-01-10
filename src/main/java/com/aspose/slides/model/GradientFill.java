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
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.GradientDirection;
import com.aspose.slides.model.GradientFillStop;
import com.aspose.slides.model.GradientShapeType;
import com.aspose.slides.model.GradientTileFlip;
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
 * Represents gradient fill format
 */
@ApiModel(description = "Represents gradient fill format")
public class GradientFill extends FillFormat {
  @SerializedName("Direction")
  private GradientDirection direction;

  @SerializedName("Shape")
  private GradientShapeType shape;

  @SerializedName("Stops")
  private List<GradientFillStop> stops = null;

  @SerializedName("LinearAngle")
  private Double linearAngle;

  @SerializedName("IsScaled")
  private Boolean isScaled;

  @SerializedName("TileFlip")
  private GradientTileFlip tileFlip;


  public GradientFill() {
    super();
    setType(com.aspose.slides.model.FillType.GRADIENT);
    setStops(new ArrayList<GradientFillStop>());
  }

  public GradientFill direction(GradientDirection direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(value = "")
  public GradientDirection getDirection() {
    return direction;
  }

  public void setDirection(GradientDirection direction) {
    this.direction = direction;
  }

  public GradientFill shape(GradientShapeType shape) {
    this.shape = shape;
    return this;
  }

   /**
   * Get shape
   * @return shape
  **/
  @ApiModelProperty(value = "")
  public GradientShapeType getShape() {
    return shape;
  }

  public void setShape(GradientShapeType shape) {
    this.shape = shape;
  }

  public GradientFill stops(List<GradientFillStop> stops) {
    this.stops = stops;
    return this;
  }

  public GradientFill addStopsItem(GradientFillStop stopsItem) {
    if (this.stops == null) {
      this.stops = new ArrayList<GradientFillStop>();
    }
    this.stops.add(stopsItem);
    return this;
  }

   /**
   * Get stops
   * @return stops
  **/
  @ApiModelProperty(value = "")
  public List<GradientFillStop> getStops() {
    return stops;
  }

  public void setStops(List<GradientFillStop> stops) {
    this.stops = stops;
  }

  public GradientFill linearAngle(Double linearAngle) {
    this.linearAngle = linearAngle;
    return this;
  }

   /**
   * Get linearAngle
   * @return linearAngle
  **/
  @ApiModelProperty(value = "")
  public Double getLinearAngle() {
    return linearAngle;
  }

  public void setLinearAngle(Double linearAngle) {
    this.linearAngle = linearAngle;
  }

  public GradientFill isScaled(Boolean isScaled) {
    this.isScaled = isScaled;
    return this;
  }

   /**
   * Get isScaled
   * @return isScaled
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsScaled() {
    return isScaled;
  }

  public void setIsScaled(Boolean isScaled) {
    this.isScaled = isScaled;
  }

  public GradientFill tileFlip(GradientTileFlip tileFlip) {
    this.tileFlip = tileFlip;
    return this;
  }

   /**
   * Get tileFlip
   * @return tileFlip
  **/
  @ApiModelProperty(value = "")
  public GradientTileFlip getTileFlip() {
    return tileFlip;
  }

  public void setTileFlip(GradientTileFlip tileFlip) {
    this.tileFlip = tileFlip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradientFill gradientFill = (GradientFill) o;
    return true && Objects.equals(this.direction, gradientFill.direction) && Objects.equals(this.shape, gradientFill.shape) && Objects.equals(this.stops, gradientFill.stops) && Objects.equals(this.linearAngle, gradientFill.linearAngle) && Objects.equals(this.isScaled, gradientFill.isScaled) && Objects.equals(this.tileFlip, gradientFill.tileFlip) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, shape, stops, linearAngle, isScaled, tileFlip, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradientFill {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    stops: ").append(toIndentedString(stops)).append("\n");
    sb.append("    linearAngle: ").append(toIndentedString(linearAngle)).append("\n");
    sb.append("    isScaled: ").append(toIndentedString(isScaled)).append("\n");
    sb.append("    tileFlip: ").append(toIndentedString(tileFlip)).append("\n");
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

