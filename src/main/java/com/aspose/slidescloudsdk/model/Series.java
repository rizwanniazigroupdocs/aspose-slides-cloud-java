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
import com.aspose.slidescloudsdk.model.ChartDataPointType;
import com.aspose.slidescloudsdk.model.ChartType;
import com.aspose.slidescloudsdk.model.EffectFormat;
import com.aspose.slidescloudsdk.model.FillFormat;
import com.aspose.slidescloudsdk.model.LineFormat;
import com.aspose.slidescloudsdk.model.SeriesMarker;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A chart series.
 */
@ApiModel(description = "A chart series.")
public class Series {
  @SerializedName("DataPointType")
  private ChartDataPointType dataPointType = null;

  @SerializedName("Type")
  private ChartType type = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("IsColorVaried")
  private Boolean isColorVaried = null;

  @SerializedName("InvertedSolidFillColor")
  private String invertedSolidFillColor = null;

  @SerializedName("Smooth")
  private Boolean smooth = null;

  @SerializedName("PlotOnSecondAxis")
  private Boolean plotOnSecondAxis = null;

  @SerializedName("Order")
  private Integer order = null;

  @SerializedName("NumberFormatOfYValues")
  private String numberFormatOfYValues = null;

  @SerializedName("NumberFormatOfXValues")
  private String numberFormatOfXValues = null;

  @SerializedName("NumberFormatOfValues")
  private String numberFormatOfValues = null;

  @SerializedName("NumberFormatOfBubbleSizes")
  private String numberFormatOfBubbleSizes = null;

  @SerializedName("InvertIfNegative")
  private Boolean invertIfNegative = null;

  @SerializedName("Explosion")
  private Integer explosion = null;

  @SerializedName("Marker")
  private SeriesMarker marker = null;

  @SerializedName("FillFormat")
  private FillFormat fillFormat = null;

  @SerializedName("EffectFormat")
  private EffectFormat effectFormat = null;

  @SerializedName("LineFormat")
  private LineFormat lineFormat = null;

  public Series dataPointType(ChartDataPointType dataPointType) {
    this.dataPointType = dataPointType;
    return this;
  }

   /**
   * Data point type.
   * @return dataPointType
  **/
  @ApiModelProperty(required = true, value = "Data point type.")
  public ChartDataPointType getDataPointType() {
    return dataPointType;
  }

  public void setDataPointType(ChartDataPointType dataPointType) {
    this.dataPointType = dataPointType;
  }

  public Series type(ChartType type) {
    this.type = type;
    return this;
  }

   /**
   * Series type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Series type.")
  public ChartType getType() {
    return type;
  }

  public void setType(ChartType type) {
    this.type = type;
  }

  public Series name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Series name.
   * @return name
  **/
  @ApiModelProperty(value = "Series name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Series isColorVaried(Boolean isColorVaried) {
    this.isColorVaried = isColorVaried;
    return this;
  }

   /**
   * True if each data marker in the series has a different color.
   * @return isColorVaried
  **/
  @ApiModelProperty(required = true, value = "True if each data marker in the series has a different color.")
  public Boolean isIsColorVaried() {
    return isColorVaried;
  }

  public void setIsColorVaried(Boolean isColorVaried) {
    this.isColorVaried = isColorVaried;
  }

  public Series invertedSolidFillColor(String invertedSolidFillColor) {
    this.invertedSolidFillColor = invertedSolidFillColor;
    return this;
  }

   /**
   * Invert solid color for the series.
   * @return invertedSolidFillColor
  **/
  @ApiModelProperty(value = "Invert solid color for the series.")
  public String getInvertedSolidFillColor() {
    return invertedSolidFillColor;
  }

  public void setInvertedSolidFillColor(String invertedSolidFillColor) {
    this.invertedSolidFillColor = invertedSolidFillColor;
  }

  public Series smooth(Boolean smooth) {
    this.smooth = smooth;
    return this;
  }

   /**
   * True if curve smoothing is turned on. Applies only to line and scatter connected by lines charts.
   * @return smooth
  **/
  @ApiModelProperty(required = true, value = "True if curve smoothing is turned on. Applies only to line and scatter connected by lines charts.")
  public Boolean isSmooth() {
    return smooth;
  }

  public void setSmooth(Boolean smooth) {
    this.smooth = smooth;
  }

  public Series plotOnSecondAxis(Boolean plotOnSecondAxis) {
    this.plotOnSecondAxis = plotOnSecondAxis;
    return this;
  }

   /**
   * True if the series is plotted on second value axis.
   * @return plotOnSecondAxis
  **/
  @ApiModelProperty(required = true, value = "True if the series is plotted on second value axis.")
  public Boolean isPlotOnSecondAxis() {
    return plotOnSecondAxis;
  }

  public void setPlotOnSecondAxis(Boolean plotOnSecondAxis) {
    this.plotOnSecondAxis = plotOnSecondAxis;
  }

  public Series order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Series order.
   * @return order
  **/
  @ApiModelProperty(required = true, value = "Series order.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public Series numberFormatOfYValues(String numberFormatOfYValues) {
    this.numberFormatOfYValues = numberFormatOfYValues;
    return this;
  }

   /**
   * The number format for the series y values.
   * @return numberFormatOfYValues
  **/
  @ApiModelProperty(value = "The number format for the series y values.")
  public String getNumberFormatOfYValues() {
    return numberFormatOfYValues;
  }

  public void setNumberFormatOfYValues(String numberFormatOfYValues) {
    this.numberFormatOfYValues = numberFormatOfYValues;
  }

  public Series numberFormatOfXValues(String numberFormatOfXValues) {
    this.numberFormatOfXValues = numberFormatOfXValues;
    return this;
  }

   /**
   * The number format for the series x values.
   * @return numberFormatOfXValues
  **/
  @ApiModelProperty(value = "The number format for the series x values.")
  public String getNumberFormatOfXValues() {
    return numberFormatOfXValues;
  }

  public void setNumberFormatOfXValues(String numberFormatOfXValues) {
    this.numberFormatOfXValues = numberFormatOfXValues;
  }

  public Series numberFormatOfValues(String numberFormatOfValues) {
    this.numberFormatOfValues = numberFormatOfValues;
    return this;
  }

   /**
   * The number format for the series values.
   * @return numberFormatOfValues
  **/
  @ApiModelProperty(value = "The number format for the series values.")
  public String getNumberFormatOfValues() {
    return numberFormatOfValues;
  }

  public void setNumberFormatOfValues(String numberFormatOfValues) {
    this.numberFormatOfValues = numberFormatOfValues;
  }

  public Series numberFormatOfBubbleSizes(String numberFormatOfBubbleSizes) {
    this.numberFormatOfBubbleSizes = numberFormatOfBubbleSizes;
    return this;
  }

   /**
   * The number format for the series bubble sizes.
   * @return numberFormatOfBubbleSizes
  **/
  @ApiModelProperty(value = "The number format for the series bubble sizes.")
  public String getNumberFormatOfBubbleSizes() {
    return numberFormatOfBubbleSizes;
  }

  public void setNumberFormatOfBubbleSizes(String numberFormatOfBubbleSizes) {
    this.numberFormatOfBubbleSizes = numberFormatOfBubbleSizes;
  }

  public Series invertIfNegative(Boolean invertIfNegative) {
    this.invertIfNegative = invertIfNegative;
    return this;
  }

   /**
   * True if the series shall invert its colors if the value is negative. Applies to bar, column and bubble series.
   * @return invertIfNegative
  **/
  @ApiModelProperty(required = true, value = "True if the series shall invert its colors if the value is negative. Applies to bar, column and bubble series.")
  public Boolean isInvertIfNegative() {
    return invertIfNegative;
  }

  public void setInvertIfNegative(Boolean invertIfNegative) {
    this.invertIfNegative = invertIfNegative;
  }

  public Series explosion(Integer explosion) {
    this.explosion = explosion;
    return this;
  }

   /**
   * The distance of an open pie slice from the center of the pie chart is expressed as a percentage of the pie diameter.
   * @return explosion
  **/
  @ApiModelProperty(required = true, value = "The distance of an open pie slice from the center of the pie chart is expressed as a percentage of the pie diameter.")
  public Integer getExplosion() {
    return explosion;
  }

  public void setExplosion(Integer explosion) {
    this.explosion = explosion;
  }

  public Series marker(SeriesMarker marker) {
    this.marker = marker;
    return this;
  }

   /**
   * Series marker.
   * @return marker
  **/
  @ApiModelProperty(value = "Series marker.")
  public SeriesMarker getMarker() {
    return marker;
  }

  public void setMarker(SeriesMarker marker) {
    this.marker = marker;
  }

  public Series fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Fill properties set for the series.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Fill properties set for the series.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public Series effectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
    return this;
  }

   /**
   * Effect properties set for the series.
   * @return effectFormat
  **/
  @ApiModelProperty(value = "Effect properties set for the series.")
  public EffectFormat getEffectFormat() {
    return effectFormat;
  }

  public void setEffectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
  }

  public Series lineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
    return this;
  }

   /**
   * Line properties set for the series.
   * @return lineFormat
  **/
  @ApiModelProperty(value = "Line properties set for the series.")
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
    Series series = (Series) o;
    return true && Objects.equals(this.dataPointType, series.dataPointType) && Objects.equals(this.type, series.type) && Objects.equals(this.name, series.name) && Objects.equals(this.isColorVaried, series.isColorVaried) && Objects.equals(this.invertedSolidFillColor, series.invertedSolidFillColor) && Objects.equals(this.smooth, series.smooth) && Objects.equals(this.plotOnSecondAxis, series.plotOnSecondAxis) && Objects.equals(this.order, series.order) && Objects.equals(this.numberFormatOfYValues, series.numberFormatOfYValues) && Objects.equals(this.numberFormatOfXValues, series.numberFormatOfXValues) && Objects.equals(this.numberFormatOfValues, series.numberFormatOfValues) && Objects.equals(this.numberFormatOfBubbleSizes, series.numberFormatOfBubbleSizes) && Objects.equals(this.invertIfNegative, series.invertIfNegative) && Objects.equals(this.explosion, series.explosion) && Objects.equals(this.marker, series.marker) && Objects.equals(this.fillFormat, series.fillFormat) && Objects.equals(this.effectFormat, series.effectFormat) && Objects.equals(this.lineFormat, series.lineFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataPointType, type, name, isColorVaried, invertedSolidFillColor, smooth, plotOnSecondAxis, order, numberFormatOfYValues, numberFormatOfXValues, numberFormatOfValues, numberFormatOfBubbleSizes, invertIfNegative, explosion, marker, fillFormat, effectFormat, lineFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Series {\n");
    
    sb.append("    dataPointType: ").append(toIndentedString(dataPointType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isColorVaried: ").append(toIndentedString(isColorVaried)).append("\n");
    sb.append("    invertedSolidFillColor: ").append(toIndentedString(invertedSolidFillColor)).append("\n");
    sb.append("    smooth: ").append(toIndentedString(smooth)).append("\n");
    sb.append("    plotOnSecondAxis: ").append(toIndentedString(plotOnSecondAxis)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    numberFormatOfYValues: ").append(toIndentedString(numberFormatOfYValues)).append("\n");
    sb.append("    numberFormatOfXValues: ").append(toIndentedString(numberFormatOfXValues)).append("\n");
    sb.append("    numberFormatOfValues: ").append(toIndentedString(numberFormatOfValues)).append("\n");
    sb.append("    numberFormatOfBubbleSizes: ").append(toIndentedString(numberFormatOfBubbleSizes)).append("\n");
    sb.append("    invertIfNegative: ").append(toIndentedString(invertIfNegative)).append("\n");
    sb.append("    explosion: ").append(toIndentedString(explosion)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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

