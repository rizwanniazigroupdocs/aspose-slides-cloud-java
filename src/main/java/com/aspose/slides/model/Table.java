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
import com.aspose.slides.model.EffectFormat;
import com.aspose.slides.model.FillFormat;
import com.aspose.slides.model.LineFormat;
import com.aspose.slides.model.ResourceUri;
import com.aspose.slides.model.ResourceUriElement;
import com.aspose.slides.model.ShapeBase;
import com.aspose.slides.model.TableColumn;
import com.aspose.slides.model.TableRow;
import com.aspose.slides.model.TableStylePreset;
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
 * Represents Table shape resource.
 */
@ApiModel(description = "Represents Table shape resource.")
public class Table extends ShapeBase {
  @SerializedName("Style")
  private TableStylePreset style;

  @SerializedName("Rows")
  private List<TableRow> rows = null;

  @SerializedName("Columns")
  private List<TableColumn> columns = null;

  @SerializedName("FirstCol")
  private Boolean firstCol;

  @SerializedName("FirstRow")
  private Boolean firstRow;

  @SerializedName("HorizontalBanding")
  private Boolean horizontalBanding;

  @SerializedName("LastCol")
  private Boolean lastCol;

  @SerializedName("LastRow")
  private Boolean lastRow;

  @SerializedName("RightToLeft")
  private Boolean rightToLeft;

  @SerializedName("VerticalBanding")
  private Boolean verticalBanding;


  public Table() {
    super();
    setAlternateLinks(new ArrayList<ResourceUri>());
    setLinks(new ArrayList<ResourceUri>());
    setType(com.aspose.slides.model.ShapeType.TABLE);
    setShapeType(com.aspose.slides.model.CombinedShapeType.TABLE);
    setRows(new ArrayList<TableRow>());
    setColumns(new ArrayList<TableColumn>());
  }

  public Table style(TableStylePreset style) {
    this.style = style;
    return this;
  }

   /**
   * Builtin table style.
   * @return style
  **/
  @ApiModelProperty(value = "Builtin table style.")
  public TableStylePreset getStyle() {
    return style;
  }

  public void setStyle(TableStylePreset style) {
    this.style = style;
  }

  public Table rows(List<TableRow> rows) {
    this.rows = rows;
    return this;
  }

  public Table addRowsItem(TableRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<TableRow>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Rows.
   * @return rows
  **/
  @ApiModelProperty(value = "Rows.")
  public List<TableRow> getRows() {
    return rows;
  }

  public void setRows(List<TableRow> rows) {
    this.rows = rows;
  }

  public Table columns(List<TableColumn> columns) {
    this.columns = columns;
    return this;
  }

  public Table addColumnsItem(TableColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<TableColumn>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Columns.
   * @return columns
  **/
  @ApiModelProperty(value = "Columns.")
  public List<TableColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<TableColumn> columns) {
    this.columns = columns;
  }

  public Table firstCol(Boolean firstCol) {
    this.firstCol = firstCol;
    return this;
  }

   /**
   * Determines whether the first column of a table has to be drawn with a special formatting.
   * @return firstCol
  **/
  @ApiModelProperty(value = "Determines whether the first column of a table has to be drawn with a special formatting.")
  public Boolean isFirstCol() {
    return firstCol;
  }

  public void setFirstCol(Boolean firstCol) {
    this.firstCol = firstCol;
  }

  public Table firstRow(Boolean firstRow) {
    this.firstRow = firstRow;
    return this;
  }

   /**
   * Determines whether the first row of a table has to be drawn with a special formatting.
   * @return firstRow
  **/
  @ApiModelProperty(value = "Determines whether the first row of a table has to be drawn with a special formatting.")
  public Boolean isFirstRow() {
    return firstRow;
  }

  public void setFirstRow(Boolean firstRow) {
    this.firstRow = firstRow;
  }

  public Table horizontalBanding(Boolean horizontalBanding) {
    this.horizontalBanding = horizontalBanding;
    return this;
  }

   /**
   * Determines whether the even rows has to be drawn with a different formatting.
   * @return horizontalBanding
  **/
  @ApiModelProperty(value = "Determines whether the even rows has to be drawn with a different formatting.")
  public Boolean isHorizontalBanding() {
    return horizontalBanding;
  }

  public void setHorizontalBanding(Boolean horizontalBanding) {
    this.horizontalBanding = horizontalBanding;
  }

  public Table lastCol(Boolean lastCol) {
    this.lastCol = lastCol;
    return this;
  }

   /**
   * Determines whether the last column of a table has to be drawn with a special formatting.
   * @return lastCol
  **/
  @ApiModelProperty(value = "Determines whether the last column of a table has to be drawn with a special formatting.")
  public Boolean isLastCol() {
    return lastCol;
  }

  public void setLastCol(Boolean lastCol) {
    this.lastCol = lastCol;
  }

  public Table lastRow(Boolean lastRow) {
    this.lastRow = lastRow;
    return this;
  }

   /**
   * Determines whether the last row of a table has to be drawn with a special formatting.
   * @return lastRow
  **/
  @ApiModelProperty(value = "Determines whether the last row of a table has to be drawn with a special formatting.")
  public Boolean isLastRow() {
    return lastRow;
  }

  public void setLastRow(Boolean lastRow) {
    this.lastRow = lastRow;
  }

  public Table rightToLeft(Boolean rightToLeft) {
    this.rightToLeft = rightToLeft;
    return this;
  }

   /**
   * Determines whether the table has right to left reading order.
   * @return rightToLeft
  **/
  @ApiModelProperty(value = "Determines whether the table has right to left reading order.")
  public Boolean isRightToLeft() {
    return rightToLeft;
  }

  public void setRightToLeft(Boolean rightToLeft) {
    this.rightToLeft = rightToLeft;
  }

  public Table verticalBanding(Boolean verticalBanding) {
    this.verticalBanding = verticalBanding;
    return this;
  }

   /**
   * Determines whether the even columns has to be drawn with a different formatting.
   * @return verticalBanding
  **/
  @ApiModelProperty(value = "Determines whether the even columns has to be drawn with a different formatting.")
  public Boolean isVerticalBanding() {
    return verticalBanding;
  }

  public void setVerticalBanding(Boolean verticalBanding) {
    this.verticalBanding = verticalBanding;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Table table = (Table) o;
    return true && Objects.equals(this.style, table.style) && Objects.equals(this.rows, table.rows) && Objects.equals(this.columns, table.columns) && Objects.equals(this.firstCol, table.firstCol) && Objects.equals(this.firstRow, table.firstRow) && Objects.equals(this.horizontalBanding, table.horizontalBanding) && Objects.equals(this.lastCol, table.lastCol) && Objects.equals(this.lastRow, table.lastRow) && Objects.equals(this.rightToLeft, table.rightToLeft) && Objects.equals(this.verticalBanding, table.verticalBanding) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(style, rows, columns, firstCol, firstRow, horizontalBanding, lastCol, lastRow, rightToLeft, verticalBanding, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Table {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    firstCol: ").append(toIndentedString(firstCol)).append("\n");
    sb.append("    firstRow: ").append(toIndentedString(firstRow)).append("\n");
    sb.append("    horizontalBanding: ").append(toIndentedString(horizontalBanding)).append("\n");
    sb.append("    lastCol: ").append(toIndentedString(lastCol)).append("\n");
    sb.append("    lastRow: ").append(toIndentedString(lastRow)).append("\n");
    sb.append("    rightToLeft: ").append(toIndentedString(rightToLeft)).append("\n");
    sb.append("    verticalBanding: ").append(toIndentedString(verticalBanding)).append("\n");
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

