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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Represents a type of chart.
 */
@JsonAdapter(ChartType.Adapter.class)
public enum ChartType {
  
  CLUSTEREDCOLUMN("ClusteredColumn"),
  
  STACKEDCOLUMN("StackedColumn"),
  
  PERCENTSSTACKEDCOLUMN("PercentsStackedColumn"),
  
  CLUSTEREDCOLUMN3D("ClusteredColumn3D"),
  
  STACKEDCOLUMN3D("StackedColumn3D"),
  
  PERCENTSSTACKEDCOLUMN3D("PercentsStackedColumn3D"),
  
  COLUMN3D("Column3D"),
  
  CLUSTEREDCYLINDER("ClusteredCylinder"),
  
  STACKEDCYLINDER("StackedCylinder"),
  
  PERCENTSSTACKEDCYLINDER("PercentsStackedCylinder"),
  
  CYLINDER3D("Cylinder3D"),
  
  CLUSTEREDCONE("ClusteredCone"),
  
  STACKEDCONE("StackedCone"),
  
  PERCENTSSTACKEDCONE("PercentsStackedCone"),
  
  CONE3D("Cone3D"),
  
  CLUSTEREDPYRAMID("ClusteredPyramid"),
  
  STACKEDPYRAMID("StackedPyramid"),
  
  PERCENTSSTACKEDPYRAMID("PercentsStackedPyramid"),
  
  PYRAMID3D("Pyramid3D"),
  
  LINE("Line"),
  
  STACKEDLINE("StackedLine"),
  
  PERCENTSSTACKEDLINE("PercentsStackedLine"),
  
  LINEWITHMARKERS("LineWithMarkers"),
  
  STACKEDLINEWITHMARKERS("StackedLineWithMarkers"),
  
  PERCENTSSTACKEDLINEWITHMARKERS("PercentsStackedLineWithMarkers"),
  
  LINE3D("Line3D"),
  
  PIE("Pie"),
  
  PIE3D("Pie3D"),
  
  PIEOFPIE("PieOfPie"),
  
  EXPLODEDPIE("ExplodedPie"),
  
  EXPLODEDPIE3D("ExplodedPie3D"),
  
  BAROFPIE("BarOfPie"),
  
  PERCENTSSTACKEDBAR("PercentsStackedBar"),
  
  CLUSTEREDBAR3D("ClusteredBar3D"),
  
  CLUSTEREDBAR("ClusteredBar"),
  
  STACKEDBAR("StackedBar"),
  
  STACKEDBAR3D("StackedBar3D"),
  
  PERCENTSSTACKEDBAR3D("PercentsStackedBar3D"),
  
  CLUSTEREDHORIZONTALCYLINDER("ClusteredHorizontalCylinder"),
  
  STACKEDHORIZONTALCYLINDER("StackedHorizontalCylinder"),
  
  PERCENTSSTACKEDHORIZONTALCYLINDER("PercentsStackedHorizontalCylinder"),
  
  CLUSTEREDHORIZONTALCONE("ClusteredHorizontalCone"),
  
  STACKEDHORIZONTALCONE("StackedHorizontalCone"),
  
  PERCENTSSTACKEDHORIZONTALCONE("PercentsStackedHorizontalCone"),
  
  CLUSTEREDHORIZONTALPYRAMID("ClusteredHorizontalPyramid"),
  
  STACKEDHORIZONTALPYRAMID("StackedHorizontalPyramid"),
  
  PERCENTSSTACKEDHORIZONTALPYRAMID("PercentsStackedHorizontalPyramid"),
  
  AREA("Area"),
  
  STACKEDAREA("StackedArea"),
  
  PERCENTSSTACKEDAREA("PercentsStackedArea"),
  
  AREA3D("Area3D"),
  
  STACKEDAREA3D("StackedArea3D"),
  
  PERCENTSSTACKEDAREA3D("PercentsStackedArea3D"),
  
  SCATTERWITHMARKERS("ScatterWithMarkers"),
  
  SCATTERWITHSMOOTHLINESANDMARKERS("ScatterWithSmoothLinesAndMarkers"),
  
  SCATTERWITHSMOOTHLINES("ScatterWithSmoothLines"),
  
  SCATTERWITHSTRAIGHTLINESANDMARKERS("ScatterWithStraightLinesAndMarkers"),
  
  SCATTERWITHSTRAIGHTLINES("ScatterWithStraightLines"),
  
  HIGHLOWCLOSE("HighLowClose"),
  
  OPENHIGHLOWCLOSE("OpenHighLowClose"),
  
  VOLUMEHIGHLOWCLOSE("VolumeHighLowClose"),
  
  VOLUMEOPENHIGHLOWCLOSE("VolumeOpenHighLowClose"),
  
  SURFACE3D("Surface3D"),
  
  WIREFRAMESURFACE3D("WireframeSurface3D"),
  
  CONTOUR("Contour"),
  
  WIREFRAMECONTOUR("WireframeContour"),
  
  DOUGHNUT("Doughnut"),
  
  EXPLODEDDOUGHNUT("ExplodedDoughnut"),
  
  BUBBLE("Bubble"),
  
  BUBBLEWITH3D("BubbleWith3D"),
  
  RADAR("Radar"),
  
  RADARWITHMARKERS("RadarWithMarkers"),
  
  FILLEDRADAR("FilledRadar"),
  
  SERIESOFMIXEDTYPES("SeriesOfMixedTypes");

  private String value;

  ChartType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static ChartType fromValue(String text) {
    for (ChartType b : ChartType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ChartType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ChartType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ChartType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ChartType.fromValue(String.valueOf(value));
    }
  }
}

