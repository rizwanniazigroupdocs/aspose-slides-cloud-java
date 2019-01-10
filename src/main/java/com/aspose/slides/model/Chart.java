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
import com.aspose.slides.model.Axes;
import com.aspose.slides.model.ChartTitle;
import com.aspose.slides.model.ChartType;
import com.aspose.slides.model.ChartWall;
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.Legend;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.PlotArea;
import com.aspose.slides.model.ResourceUri;
import com.aspose.slides.model.ResourceUriElement;
import com.aspose.slides.model.Series;
import com.aspose.slides.model.ShapeBase;
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
 * Represents chart resource
 */
@ApiModel(description = "Represents chart resource")
public class Chart extends ShapeBase {
  @SerializedName("ChartType")
  private ChartType chartType;

  @SerializedName("Series")
  private List<Series> series = null;

  @SerializedName("Categories")
  private List<String> categories = null;

  @SerializedName("Title")
  private ChartTitle title;

  @SerializedName("BackWall")
  private ChartWall backWall;

  @SerializedName("SideWall")
  private ChartWall sideWall;

  @SerializedName("Floor")
  private ChartWall floor;

  @SerializedName("Legend")
  private Legend legend;

  @SerializedName("Axes")
  private Axes axes;

  @SerializedName("PlotArea")
  private PlotArea plotArea;


  public Chart() {
    super();
    setAlternateLinks(new ArrayList<ResourceUri>());
    setLinks(new ArrayList<ResourceUri>());
    setType(com.aspose.slides.model.ShapeType.CHART);
    setShapeType(com.aspose.slides.model.CombinedShapeType.CHART);
    setSeries(new ArrayList<Series>());
    setCategories(new ArrayList<String>());
  }

  public Chart chartType(ChartType chartType) {
    this.chartType = chartType;
    return this;
  }

   /**
   * Gets or sets the type of the chart.
   * @return chartType
  **/
  @ApiModelProperty(value = "Gets or sets the type of the chart.")
  public ChartType getChartType() {
    return chartType;
  }

  public void setChartType(ChartType chartType) {
    this.chartType = chartType;
  }

  public Chart series(List<Series> series) {
    this.series = series;
    return this;
  }

  public Chart addSeriesItem(Series seriesItem) {
    if (this.series == null) {
      this.series = new ArrayList<Series>();
    }
    this.series.add(seriesItem);
    return this;
  }

   /**
   * Gets or sets the series of chart data values.
   * @return series
  **/
  @ApiModelProperty(value = "Gets or sets the series of chart data values.")
  public List<Series> getSeries() {
    return series;
  }

  public void setSeries(List<Series> series) {
    this.series = series;
  }

  public Chart categories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public Chart addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Gets or sets the categories for chart data
   * @return categories
  **/
  @ApiModelProperty(value = "Gets or sets the categories for chart data")
  public List<String> getCategories() {
    return categories;
  }

  public void setCategories(List<String> categories) {
    this.categories = categories;
  }

  public Chart title(ChartTitle title) {
    this.title = title;
    return this;
  }

   /**
   * Gets or sets the title.
   * @return title
  **/
  @ApiModelProperty(value = "Gets or sets the title.")
  public ChartTitle getTitle() {
    return title;
  }

  public void setTitle(ChartTitle title) {
    this.title = title;
  }

  public Chart backWall(ChartWall backWall) {
    this.backWall = backWall;
    return this;
  }

   /**
   * Gets or sets the back wall.
   * @return backWall
  **/
  @ApiModelProperty(value = "Gets or sets the back wall.")
  public ChartWall getBackWall() {
    return backWall;
  }

  public void setBackWall(ChartWall backWall) {
    this.backWall = backWall;
  }

  public Chart sideWall(ChartWall sideWall) {
    this.sideWall = sideWall;
    return this;
  }

   /**
   * Gets or sets the side wall.
   * @return sideWall
  **/
  @ApiModelProperty(value = "Gets or sets the side wall.")
  public ChartWall getSideWall() {
    return sideWall;
  }

  public void setSideWall(ChartWall sideWall) {
    this.sideWall = sideWall;
  }

  public Chart floor(ChartWall floor) {
    this.floor = floor;
    return this;
  }

   /**
   * Gets or sets the floor.
   * @return floor
  **/
  @ApiModelProperty(value = "Gets or sets the floor.")
  public ChartWall getFloor() {
    return floor;
  }

  public void setFloor(ChartWall floor) {
    this.floor = floor;
  }

  public Chart legend(Legend legend) {
    this.legend = legend;
    return this;
  }

   /**
   * Gets or sets the legend.
   * @return legend
  **/
  @ApiModelProperty(value = "Gets or sets the legend.")
  public Legend getLegend() {
    return legend;
  }

  public void setLegend(Legend legend) {
    this.legend = legend;
  }

  public Chart axes(Axes axes) {
    this.axes = axes;
    return this;
  }

   /**
   * Gets or sets the axes.
   * @return axes
  **/
  @ApiModelProperty(value = "Gets or sets the axes.")
  public Axes getAxes() {
    return axes;
  }

  public void setAxes(Axes axes) {
    this.axes = axes;
  }

  public Chart plotArea(PlotArea plotArea) {
    this.plotArea = plotArea;
    return this;
  }

   /**
   * Gets or sets the plot area.
   * @return plotArea
  **/
  @ApiModelProperty(value = "Gets or sets the plot area.")
  public PlotArea getPlotArea() {
    return plotArea;
  }

  public void setPlotArea(PlotArea plotArea) {
    this.plotArea = plotArea;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chart chart = (Chart) o;
    return true && Objects.equals(this.chartType, chart.chartType) && Objects.equals(this.series, chart.series) && Objects.equals(this.categories, chart.categories) && Objects.equals(this.title, chart.title) && Objects.equals(this.backWall, chart.backWall) && Objects.equals(this.sideWall, chart.sideWall) && Objects.equals(this.floor, chart.floor) && Objects.equals(this.legend, chart.legend) && Objects.equals(this.axes, chart.axes) && Objects.equals(this.plotArea, chart.plotArea) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chartType, series, categories, title, backWall, sideWall, floor, legend, axes, plotArea, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chart {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    chartType: ").append(toIndentedString(chartType)).append("\n");
    sb.append("    series: ").append(toIndentedString(series)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    backWall: ").append(toIndentedString(backWall)).append("\n");
    sb.append("    sideWall: ").append(toIndentedString(sideWall)).append("\n");
    sb.append("    floor: ").append(toIndentedString(floor)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
    sb.append("    axes: ").append(toIndentedString(axes)).append("\n");
    sb.append("    plotArea: ").append(toIndentedString(plotArea)).append("\n");
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

