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
import com.aspose.slides.model.AxisPositionType;
import com.aspose.slides.model.CategoryAxisType;
import com.aspose.slides.model.CrossesType;
import com.aspose.slides.model.DisplayUnitType;
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.TickLabelPositionType;
import com.aspose.slides.model.TickMarkType;
import com.aspose.slides.model.TimeUnitType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Represents a chart axis
 */
@ApiModel(description = "Represents a chart axis")
public class Axis {
  @SerializedName("IsVisible")
  private Boolean isVisible;

  @SerializedName("HasTitle")
  private Boolean hasTitle;

  @SerializedName("Position")
  private AxisPositionType position;

  @SerializedName("DisplayUnit")
  private DisplayUnitType displayUnit;

  @SerializedName("BaseUnitScale")
  private TimeUnitType baseUnitScale;

  @SerializedName("IsAutomaticMajorUnit")
  private Boolean isAutomaticMajorUnit;

  @SerializedName("MajorUnit")
  private Double majorUnit;

  @SerializedName("MajorUnitScale")
  private TimeUnitType majorUnitScale;

  @SerializedName("MajorTickMark")
  private TickMarkType majorTickMark;

  @SerializedName("IsAutomaticMinorUnit")
  private Boolean isAutomaticMinorUnit;

  @SerializedName("MinorUnit")
  private Double minorUnit;

  @SerializedName("MinorUnitScale")
  private TimeUnitType minorUnitScale;

  @SerializedName("MinorTickMark")
  private TickMarkType minorTickMark;

  @SerializedName("IsAutomaticMaxValue")
  private Boolean isAutomaticMaxValue;

  @SerializedName("MaxValue")
  private Double maxValue;

  @SerializedName("IsAutomaticMinValue")
  private Boolean isAutomaticMinValue;

  @SerializedName("MinValue")
  private Double minValue;

  @SerializedName("IsLogarithmic")
  private Boolean isLogarithmic;

  @SerializedName("LogBase")
  private Double logBase;

  @SerializedName("CategoryAxisType")
  private CategoryAxisType categoryAxisType;

  @SerializedName("AxisBetweenCategories")
  private Boolean axisBetweenCategories;

  @SerializedName("LabelOffset")
  private Integer labelOffset;

  @SerializedName("IsPlotOrderReversed")
  private Boolean isPlotOrderReversed;

  @SerializedName("IsNumberFormatLinkedToSource")
  private Boolean isNumberFormatLinkedToSource;

  @SerializedName("NumberFormat")
  private String numberFormat;

  @SerializedName("CrossType")
  private CrossesType crossType;

  @SerializedName("CrossAt")
  private Double crossAt;

  @SerializedName("IsAutomaticTickMarksSpacing")
  private Boolean isAutomaticTickMarksSpacing;

  @SerializedName("TickMarksSpacing")
  private Integer tickMarksSpacing;

  @SerializedName("IsAutomaticTickLabelSpacing")
  private Boolean isAutomaticTickLabelSpacing;

  @SerializedName("TickLabelSpacing")
  private Integer tickLabelSpacing;

  @SerializedName("TickLabelPosition")
  private TickLabelPositionType tickLabelPosition;

  @SerializedName("TickLabelRotationAngle")
  private Double tickLabelRotationAngle;

  @SerializedName("FillFormat")
  private FillFormat fillFormat;

  @SerializedName("EffectFormat")
  private EffectFormat effectFormat;

  @SerializedName("LineFormat")
  private LineFormat lineFormat;


  public Axis() {
    super();
  }

  public Axis isVisible(Boolean isVisible) {
    this.isVisible = isVisible;
    return this;
  }

   /**
   * True if the axis is visible
   * @return isVisible
  **/
  @ApiModelProperty(required = true, value = "True if the axis is visible")
  public Boolean isIsVisible() {
    return isVisible;
  }

  public void setIsVisible(Boolean isVisible) {
    this.isVisible = isVisible;
  }

  public Axis hasTitle(Boolean hasTitle) {
    this.hasTitle = hasTitle;
    return this;
  }

   /**
   * True if the axis has a visible title
   * @return hasTitle
  **/
  @ApiModelProperty(required = true, value = "True if the axis has a visible title")
  public Boolean isHasTitle() {
    return hasTitle;
  }

  public void setHasTitle(Boolean hasTitle) {
    this.hasTitle = hasTitle;
  }

  public Axis position(AxisPositionType position) {
    this.position = position;
    return this;
  }

   /**
   * Axis position
   * @return position
  **/
  @ApiModelProperty(required = true, value = "Axis position")
  public AxisPositionType getPosition() {
    return position;
  }

  public void setPosition(AxisPositionType position) {
    this.position = position;
  }

  public Axis displayUnit(DisplayUnitType displayUnit) {
    this.displayUnit = displayUnit;
    return this;
  }

   /**
   * The scaling value of the display units for the value axis
   * @return displayUnit
  **/
  @ApiModelProperty(required = true, value = "The scaling value of the display units for the value axis")
  public DisplayUnitType getDisplayUnit() {
    return displayUnit;
  }

  public void setDisplayUnit(DisplayUnitType displayUnit) {
    this.displayUnit = displayUnit;
  }

  public Axis baseUnitScale(TimeUnitType baseUnitScale) {
    this.baseUnitScale = baseUnitScale;
    return this;
  }

   /**
   * The smallest time unit that is represented on the date axis
   * @return baseUnitScale
  **/
  @ApiModelProperty(required = true, value = "The smallest time unit that is represented on the date axis")
  public TimeUnitType getBaseUnitScale() {
    return baseUnitScale;
  }

  public void setBaseUnitScale(TimeUnitType baseUnitScale) {
    this.baseUnitScale = baseUnitScale;
  }

  public Axis isAutomaticMajorUnit(Boolean isAutomaticMajorUnit) {
    this.isAutomaticMajorUnit = isAutomaticMajorUnit;
    return this;
  }

   /**
   * True the major unit of the axis is automatically assigned
   * @return isAutomaticMajorUnit
  **/
  @ApiModelProperty(required = true, value = "True the major unit of the axis is automatically assigned")
  public Boolean isIsAutomaticMajorUnit() {
    return isAutomaticMajorUnit;
  }

  public void setIsAutomaticMajorUnit(Boolean isAutomaticMajorUnit) {
    this.isAutomaticMajorUnit = isAutomaticMajorUnit;
  }

  public Axis majorUnit(Double majorUnit) {
    this.majorUnit = majorUnit;
    return this;
  }

   /**
   * The major units for the date or value axis
   * @return majorUnit
  **/
  @ApiModelProperty(required = true, value = "The major units for the date or value axis")
  public Double getMajorUnit() {
    return majorUnit;
  }

  public void setMajorUnit(Double majorUnit) {
    this.majorUnit = majorUnit;
  }

  public Axis majorUnitScale(TimeUnitType majorUnitScale) {
    this.majorUnitScale = majorUnitScale;
    return this;
  }

   /**
   * The major unit scale for the date axis
   * @return majorUnitScale
  **/
  @ApiModelProperty(required = true, value = "The major unit scale for the date axis")
  public TimeUnitType getMajorUnitScale() {
    return majorUnitScale;
  }

  public void setMajorUnitScale(TimeUnitType majorUnitScale) {
    this.majorUnitScale = majorUnitScale;
  }

  public Axis majorTickMark(TickMarkType majorTickMark) {
    this.majorTickMark = majorTickMark;
    return this;
  }

   /**
   * The type of major tick mark for the specified axis
   * @return majorTickMark
  **/
  @ApiModelProperty(required = true, value = "The type of major tick mark for the specified axis")
  public TickMarkType getMajorTickMark() {
    return majorTickMark;
  }

  public void setMajorTickMark(TickMarkType majorTickMark) {
    this.majorTickMark = majorTickMark;
  }

  public Axis isAutomaticMinorUnit(Boolean isAutomaticMinorUnit) {
    this.isAutomaticMinorUnit = isAutomaticMinorUnit;
    return this;
  }

   /**
   * True the minor unit of the axis is automatically assigned
   * @return isAutomaticMinorUnit
  **/
  @ApiModelProperty(required = true, value = "True the minor unit of the axis is automatically assigned")
  public Boolean isIsAutomaticMinorUnit() {
    return isAutomaticMinorUnit;
  }

  public void setIsAutomaticMinorUnit(Boolean isAutomaticMinorUnit) {
    this.isAutomaticMinorUnit = isAutomaticMinorUnit;
  }

  public Axis minorUnit(Double minorUnit) {
    this.minorUnit = minorUnit;
    return this;
  }

   /**
   * The minor units for the date or value axis
   * @return minorUnit
  **/
  @ApiModelProperty(required = true, value = "The minor units for the date or value axis")
  public Double getMinorUnit() {
    return minorUnit;
  }

  public void setMinorUnit(Double minorUnit) {
    this.minorUnit = minorUnit;
  }

  public Axis minorUnitScale(TimeUnitType minorUnitScale) {
    this.minorUnitScale = minorUnitScale;
    return this;
  }

   /**
   * The minor unit scale for the date axis
   * @return minorUnitScale
  **/
  @ApiModelProperty(required = true, value = "The minor unit scale for the date axis")
  public TimeUnitType getMinorUnitScale() {
    return minorUnitScale;
  }

  public void setMinorUnitScale(TimeUnitType minorUnitScale) {
    this.minorUnitScale = minorUnitScale;
  }

  public Axis minorTickMark(TickMarkType minorTickMark) {
    this.minorTickMark = minorTickMark;
    return this;
  }

   /**
   * The type of minor tick mark for the specified axis
   * @return minorTickMark
  **/
  @ApiModelProperty(required = true, value = "The type of minor tick mark for the specified axis")
  public TickMarkType getMinorTickMark() {
    return minorTickMark;
  }

  public void setMinorTickMark(TickMarkType minorTickMark) {
    this.minorTickMark = minorTickMark;
  }

  public Axis isAutomaticMaxValue(Boolean isAutomaticMaxValue) {
    this.isAutomaticMaxValue = isAutomaticMaxValue;
    return this;
  }

   /**
   * True if the max value is automatically assigned
   * @return isAutomaticMaxValue
  **/
  @ApiModelProperty(required = true, value = "True if the max value is automatically assigned")
  public Boolean isIsAutomaticMaxValue() {
    return isAutomaticMaxValue;
  }

  public void setIsAutomaticMaxValue(Boolean isAutomaticMaxValue) {
    this.isAutomaticMaxValue = isAutomaticMaxValue;
  }

  public Axis maxValue(Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

   /**
   * The maximum value on the value axis
   * @return maxValue
  **/
  @ApiModelProperty(required = true, value = "The maximum value on the value axis")
  public Double getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  public Axis isAutomaticMinValue(Boolean isAutomaticMinValue) {
    this.isAutomaticMinValue = isAutomaticMinValue;
    return this;
  }

   /**
   * True if the min value is automatically assigned
   * @return isAutomaticMinValue
  **/
  @ApiModelProperty(required = true, value = "True if the min value is automatically assigned")
  public Boolean isIsAutomaticMinValue() {
    return isAutomaticMinValue;
  }

  public void setIsAutomaticMinValue(Boolean isAutomaticMinValue) {
    this.isAutomaticMinValue = isAutomaticMinValue;
  }

  public Axis minValue(Double minValue) {
    this.minValue = minValue;
    return this;
  }

   /**
   * The minimum value on the value axis
   * @return minValue
  **/
  @ApiModelProperty(required = true, value = "The minimum value on the value axis")
  public Double getMinValue() {
    return minValue;
  }

  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  public Axis isLogarithmic(Boolean isLogarithmic) {
    this.isLogarithmic = isLogarithmic;
    return this;
  }

   /**
   * True if the value axis scale type is logarithmic
   * @return isLogarithmic
  **/
  @ApiModelProperty(required = true, value = "True if the value axis scale type is logarithmic")
  public Boolean isIsLogarithmic() {
    return isLogarithmic;
  }

  public void setIsLogarithmic(Boolean isLogarithmic) {
    this.isLogarithmic = isLogarithmic;
  }

  public Axis logBase(Double logBase) {
    this.logBase = logBase;
    return this;
  }

   /**
   * The logarithmic base. Default value is 10
   * @return logBase
  **/
  @ApiModelProperty(required = true, value = "The logarithmic base. Default value is 10")
  public Double getLogBase() {
    return logBase;
  }

  public void setLogBase(Double logBase) {
    this.logBase = logBase;
  }

  public Axis categoryAxisType(CategoryAxisType categoryAxisType) {
    this.categoryAxisType = categoryAxisType;
    return this;
  }

   /**
   * The type of the category axis
   * @return categoryAxisType
  **/
  @ApiModelProperty(required = true, value = "The type of the category axis")
  public CategoryAxisType getCategoryAxisType() {
    return categoryAxisType;
  }

  public void setCategoryAxisType(CategoryAxisType categoryAxisType) {
    this.categoryAxisType = categoryAxisType;
  }

  public Axis axisBetweenCategories(Boolean axisBetweenCategories) {
    this.axisBetweenCategories = axisBetweenCategories;
    return this;
  }

   /**
   * True if the value axis crosses the category axis between categories. This property applies only to category axes, and it doesn&#39;t apply to 3-D charts
   * @return axisBetweenCategories
  **/
  @ApiModelProperty(required = true, value = "True if the value axis crosses the category axis between categories. This property applies only to category axes, and it doesn't apply to 3-D charts")
  public Boolean isAxisBetweenCategories() {
    return axisBetweenCategories;
  }

  public void setAxisBetweenCategories(Boolean axisBetweenCategories) {
    this.axisBetweenCategories = axisBetweenCategories;
  }

  public Axis labelOffset(Integer labelOffset) {
    this.labelOffset = labelOffset;
    return this;
  }

   /**
   * The distance of labels from the axis. Applied to category or date axis. Value must be between 0% and 1000%.             
   * @return labelOffset
  **/
  @ApiModelProperty(required = true, value = "The distance of labels from the axis. Applied to category or date axis. Value must be between 0% and 1000%.             ")
  public Integer getLabelOffset() {
    return labelOffset;
  }

  public void setLabelOffset(Integer labelOffset) {
    this.labelOffset = labelOffset;
  }

  public Axis isPlotOrderReversed(Boolean isPlotOrderReversed) {
    this.isPlotOrderReversed = isPlotOrderReversed;
    return this;
  }

   /**
   * True if MS PowerPoint plots data points from last to first
   * @return isPlotOrderReversed
  **/
  @ApiModelProperty(required = true, value = "True if MS PowerPoint plots data points from last to first")
  public Boolean isIsPlotOrderReversed() {
    return isPlotOrderReversed;
  }

  public void setIsPlotOrderReversed(Boolean isPlotOrderReversed) {
    this.isPlotOrderReversed = isPlotOrderReversed;
  }

  public Axis isNumberFormatLinkedToSource(Boolean isNumberFormatLinkedToSource) {
    this.isNumberFormatLinkedToSource = isNumberFormatLinkedToSource;
    return this;
  }

   /**
   * True if the format is linked to source data
   * @return isNumberFormatLinkedToSource
  **/
  @ApiModelProperty(required = true, value = "True if the format is linked to source data")
  public Boolean isIsNumberFormatLinkedToSource() {
    return isNumberFormatLinkedToSource;
  }

  public void setIsNumberFormatLinkedToSource(Boolean isNumberFormatLinkedToSource) {
    this.isNumberFormatLinkedToSource = isNumberFormatLinkedToSource;
  }

  public Axis numberFormat(String numberFormat) {
    this.numberFormat = numberFormat;
    return this;
  }

   /**
   * the format string for the Axis Labels
   * @return numberFormat
  **/
  @ApiModelProperty(value = "the format string for the Axis Labels")
  public String getNumberFormat() {
    return numberFormat;
  }

  public void setNumberFormat(String numberFormat) {
    this.numberFormat = numberFormat;
  }

  public Axis crossType(CrossesType crossType) {
    this.crossType = crossType;
    return this;
  }

   /**
   * The CrossType on the specified axis where the other axis crosses
   * @return crossType
  **/
  @ApiModelProperty(required = true, value = "The CrossType on the specified axis where the other axis crosses")
  public CrossesType getCrossType() {
    return crossType;
  }

  public void setCrossType(CrossesType crossType) {
    this.crossType = crossType;
  }

  public Axis crossAt(Double crossAt) {
    this.crossAt = crossAt;
    return this;
  }

   /**
   * The point on the axis where the perpendicular axis crosses it
   * @return crossAt
  **/
  @ApiModelProperty(required = true, value = "The point on the axis where the perpendicular axis crosses it")
  public Double getCrossAt() {
    return crossAt;
  }

  public void setCrossAt(Double crossAt) {
    this.crossAt = crossAt;
  }

  public Axis isAutomaticTickMarksSpacing(Boolean isAutomaticTickMarksSpacing) {
    this.isAutomaticTickMarksSpacing = isAutomaticTickMarksSpacing;
    return this;
  }

   /**
   * True for automatic tick marks spacing value
   * @return isAutomaticTickMarksSpacing
  **/
  @ApiModelProperty(required = true, value = "True for automatic tick marks spacing value")
  public Boolean isIsAutomaticTickMarksSpacing() {
    return isAutomaticTickMarksSpacing;
  }

  public void setIsAutomaticTickMarksSpacing(Boolean isAutomaticTickMarksSpacing) {
    this.isAutomaticTickMarksSpacing = isAutomaticTickMarksSpacing;
  }

  public Axis tickMarksSpacing(Integer tickMarksSpacing) {
    this.tickMarksSpacing = tickMarksSpacing;
    return this;
  }

   /**
   * Specifies how many tick marks shall be skipped before the next one shall be drawn. Applied to category or series axis.
   * @return tickMarksSpacing
  **/
  @ApiModelProperty(required = true, value = "Specifies how many tick marks shall be skipped before the next one shall be drawn. Applied to category or series axis.")
  public Integer getTickMarksSpacing() {
    return tickMarksSpacing;
  }

  public void setTickMarksSpacing(Integer tickMarksSpacing) {
    this.tickMarksSpacing = tickMarksSpacing;
  }

  public Axis isAutomaticTickLabelSpacing(Boolean isAutomaticTickLabelSpacing) {
    this.isAutomaticTickLabelSpacing = isAutomaticTickLabelSpacing;
    return this;
  }

   /**
   * True for automatic tick label spacing value
   * @return isAutomaticTickLabelSpacing
  **/
  @ApiModelProperty(required = true, value = "True for automatic tick label spacing value")
  public Boolean isIsAutomaticTickLabelSpacing() {
    return isAutomaticTickLabelSpacing;
  }

  public void setIsAutomaticTickLabelSpacing(Boolean isAutomaticTickLabelSpacing) {
    this.isAutomaticTickLabelSpacing = isAutomaticTickLabelSpacing;
  }

  public Axis tickLabelSpacing(Integer tickLabelSpacing) {
    this.tickLabelSpacing = tickLabelSpacing;
    return this;
  }

   /**
   * Specifies how many tick labels to skip between label that is drawn.
   * @return tickLabelSpacing
  **/
  @ApiModelProperty(required = true, value = "Specifies how many tick labels to skip between label that is drawn.")
  public Integer getTickLabelSpacing() {
    return tickLabelSpacing;
  }

  public void setTickLabelSpacing(Integer tickLabelSpacing) {
    this.tickLabelSpacing = tickLabelSpacing;
  }

  public Axis tickLabelPosition(TickLabelPositionType tickLabelPosition) {
    this.tickLabelPosition = tickLabelPosition;
    return this;
  }

   /**
   * The position of tick-mark labels on the specified axis.
   * @return tickLabelPosition
  **/
  @ApiModelProperty(required = true, value = "The position of tick-mark labels on the specified axis.")
  public TickLabelPositionType getTickLabelPosition() {
    return tickLabelPosition;
  }

  public void setTickLabelPosition(TickLabelPositionType tickLabelPosition) {
    this.tickLabelPosition = tickLabelPosition;
  }

  public Axis tickLabelRotationAngle(Double tickLabelRotationAngle) {
    this.tickLabelRotationAngle = tickLabelRotationAngle;
    return this;
  }

   /**
   * Represents the rotation angle of tick labels.
   * @return tickLabelRotationAngle
  **/
  @ApiModelProperty(required = true, value = "Represents the rotation angle of tick labels.")
  public Double getTickLabelRotationAngle() {
    return tickLabelRotationAngle;
  }

  public void setTickLabelRotationAngle(Double tickLabelRotationAngle) {
    this.tickLabelRotationAngle = tickLabelRotationAngle;
  }

  public Axis fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Get or sets the fill format.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Get or sets the fill format.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public Axis effectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
    return this;
  }

   /**
   * Get or sets the effect format.
   * @return effectFormat
  **/
  @ApiModelProperty(value = "Get or sets the effect format.")
  public EffectFormat getEffectFormat() {
    return effectFormat;
  }

  public void setEffectFormat(EffectFormat effectFormat) {
    this.effectFormat = effectFormat;
  }

  public Axis lineFormat(LineFormat lineFormat) {
    this.lineFormat = lineFormat;
    return this;
  }

   /**
   * Get or sets the line format.
   * @return lineFormat
  **/
  @ApiModelProperty(value = "Get or sets the line format.")
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
    Axis axis = (Axis) o;
    return true && Objects.equals(this.isVisible, axis.isVisible) && Objects.equals(this.hasTitle, axis.hasTitle) && Objects.equals(this.position, axis.position) && Objects.equals(this.displayUnit, axis.displayUnit) && Objects.equals(this.baseUnitScale, axis.baseUnitScale) && Objects.equals(this.isAutomaticMajorUnit, axis.isAutomaticMajorUnit) && Objects.equals(this.majorUnit, axis.majorUnit) && Objects.equals(this.majorUnitScale, axis.majorUnitScale) && Objects.equals(this.majorTickMark, axis.majorTickMark) && Objects.equals(this.isAutomaticMinorUnit, axis.isAutomaticMinorUnit) && Objects.equals(this.minorUnit, axis.minorUnit) && Objects.equals(this.minorUnitScale, axis.minorUnitScale) && Objects.equals(this.minorTickMark, axis.minorTickMark) && Objects.equals(this.isAutomaticMaxValue, axis.isAutomaticMaxValue) && Objects.equals(this.maxValue, axis.maxValue) && Objects.equals(this.isAutomaticMinValue, axis.isAutomaticMinValue) && Objects.equals(this.minValue, axis.minValue) && Objects.equals(this.isLogarithmic, axis.isLogarithmic) && Objects.equals(this.logBase, axis.logBase) && Objects.equals(this.categoryAxisType, axis.categoryAxisType) && Objects.equals(this.axisBetweenCategories, axis.axisBetweenCategories) && Objects.equals(this.labelOffset, axis.labelOffset) && Objects.equals(this.isPlotOrderReversed, axis.isPlotOrderReversed) && Objects.equals(this.isNumberFormatLinkedToSource, axis.isNumberFormatLinkedToSource) && Objects.equals(this.numberFormat, axis.numberFormat) && Objects.equals(this.crossType, axis.crossType) && Objects.equals(this.crossAt, axis.crossAt) && Objects.equals(this.isAutomaticTickMarksSpacing, axis.isAutomaticTickMarksSpacing) && Objects.equals(this.tickMarksSpacing, axis.tickMarksSpacing) && Objects.equals(this.isAutomaticTickLabelSpacing, axis.isAutomaticTickLabelSpacing) && Objects.equals(this.tickLabelSpacing, axis.tickLabelSpacing) && Objects.equals(this.tickLabelPosition, axis.tickLabelPosition) && Objects.equals(this.tickLabelRotationAngle, axis.tickLabelRotationAngle) && Objects.equals(this.fillFormat, axis.fillFormat) && Objects.equals(this.effectFormat, axis.effectFormat) && Objects.equals(this.lineFormat, axis.lineFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isVisible, hasTitle, position, displayUnit, baseUnitScale, isAutomaticMajorUnit, majorUnit, majorUnitScale, majorTickMark, isAutomaticMinorUnit, minorUnit, minorUnitScale, minorTickMark, isAutomaticMaxValue, maxValue, isAutomaticMinValue, minValue, isLogarithmic, logBase, categoryAxisType, axisBetweenCategories, labelOffset, isPlotOrderReversed, isNumberFormatLinkedToSource, numberFormat, crossType, crossAt, isAutomaticTickMarksSpacing, tickMarksSpacing, isAutomaticTickLabelSpacing, tickLabelSpacing, tickLabelPosition, tickLabelRotationAngle, fillFormat, effectFormat, lineFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Axis {\n");
    
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    hasTitle: ").append(toIndentedString(hasTitle)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    displayUnit: ").append(toIndentedString(displayUnit)).append("\n");
    sb.append("    baseUnitScale: ").append(toIndentedString(baseUnitScale)).append("\n");
    sb.append("    isAutomaticMajorUnit: ").append(toIndentedString(isAutomaticMajorUnit)).append("\n");
    sb.append("    majorUnit: ").append(toIndentedString(majorUnit)).append("\n");
    sb.append("    majorUnitScale: ").append(toIndentedString(majorUnitScale)).append("\n");
    sb.append("    majorTickMark: ").append(toIndentedString(majorTickMark)).append("\n");
    sb.append("    isAutomaticMinorUnit: ").append(toIndentedString(isAutomaticMinorUnit)).append("\n");
    sb.append("    minorUnit: ").append(toIndentedString(minorUnit)).append("\n");
    sb.append("    minorUnitScale: ").append(toIndentedString(minorUnitScale)).append("\n");
    sb.append("    minorTickMark: ").append(toIndentedString(minorTickMark)).append("\n");
    sb.append("    isAutomaticMaxValue: ").append(toIndentedString(isAutomaticMaxValue)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    isAutomaticMinValue: ").append(toIndentedString(isAutomaticMinValue)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    isLogarithmic: ").append(toIndentedString(isLogarithmic)).append("\n");
    sb.append("    logBase: ").append(toIndentedString(logBase)).append("\n");
    sb.append("    categoryAxisType: ").append(toIndentedString(categoryAxisType)).append("\n");
    sb.append("    axisBetweenCategories: ").append(toIndentedString(axisBetweenCategories)).append("\n");
    sb.append("    labelOffset: ").append(toIndentedString(labelOffset)).append("\n");
    sb.append("    isPlotOrderReversed: ").append(toIndentedString(isPlotOrderReversed)).append("\n");
    sb.append("    isNumberFormatLinkedToSource: ").append(toIndentedString(isNumberFormatLinkedToSource)).append("\n");
    sb.append("    numberFormat: ").append(toIndentedString(numberFormat)).append("\n");
    sb.append("    crossType: ").append(toIndentedString(crossType)).append("\n");
    sb.append("    crossAt: ").append(toIndentedString(crossAt)).append("\n");
    sb.append("    isAutomaticTickMarksSpacing: ").append(toIndentedString(isAutomaticTickMarksSpacing)).append("\n");
    sb.append("    tickMarksSpacing: ").append(toIndentedString(tickMarksSpacing)).append("\n");
    sb.append("    isAutomaticTickLabelSpacing: ").append(toIndentedString(isAutomaticTickLabelSpacing)).append("\n");
    sb.append("    tickLabelSpacing: ").append(toIndentedString(tickLabelSpacing)).append("\n");
    sb.append("    tickLabelPosition: ").append(toIndentedString(tickLabelPosition)).append("\n");
    sb.append("    tickLabelRotationAngle: ").append(toIndentedString(tickLabelRotationAngle)).append("\n");
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

