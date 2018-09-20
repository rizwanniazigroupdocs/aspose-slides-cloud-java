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
import com.aspose.slidescloudsdk.model.FillFormat;
import com.aspose.slidescloudsdk.model.LineFormat;
import com.aspose.slidescloudsdk.model.TextAnchorType;
import com.aspose.slidescloudsdk.model.TextVerticalType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents one cell of table.
 */
@ApiModel(description = "Represents one cell of table.")
public class TableCell {
  @SerializedName("Text")
  private String text = null;

  @SerializedName("RowSpan")
  private Integer rowSpan = null;

  @SerializedName("ColSpan")
  private Integer colSpan = null;

  @SerializedName("MarginTop")
  private Double marginTop = null;

  @SerializedName("MarginRight")
  private Double marginRight = null;

  @SerializedName("MarginLeft")
  private Double marginLeft = null;

  @SerializedName("MarginBottom")
  private Double marginBottom = null;

  @SerializedName("TextAnchorType")
  private TextAnchorType textAnchorType = null;

  @SerializedName("TextVerticalType")
  private TextVerticalType textVerticalType = null;

  @SerializedName("FillFormat")
  private FillFormat fillFormat = null;

  @SerializedName("BorderTop")
  private LineFormat borderTop = null;

  @SerializedName("BorderRight")
  private LineFormat borderRight = null;

  @SerializedName("BorderLeft")
  private LineFormat borderLeft = null;

  @SerializedName("BorderBottom")
  private LineFormat borderBottom = null;

  @SerializedName("BorderDiagonalUp")
  private LineFormat borderDiagonalUp = null;

  @SerializedName("BorderDiagonalDown")
  private LineFormat borderDiagonalDown = null;

  public TableCell text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Cell text.
   * @return text
  **/
  @ApiModelProperty(value = "Cell text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public TableCell rowSpan(Integer rowSpan) {
    this.rowSpan = rowSpan;
    return this;
  }

   /**
   * The number of rows spanned by a merged cell.
   * @return rowSpan
  **/
  @ApiModelProperty(required = true, value = "The number of rows spanned by a merged cell.")
  public Integer getRowSpan() {
    return rowSpan;
  }

  public void setRowSpan(Integer rowSpan) {
    this.rowSpan = rowSpan;
  }

  public TableCell colSpan(Integer colSpan) {
    this.colSpan = colSpan;
    return this;
  }

   /**
   * The number of columns spanned by a merged cell.
   * @return colSpan
  **/
  @ApiModelProperty(required = true, value = "The number of columns spanned by a merged cell.")
  public Integer getColSpan() {
    return colSpan;
  }

  public void setColSpan(Integer colSpan) {
    this.colSpan = colSpan;
  }

  public TableCell marginTop(Double marginTop) {
    this.marginTop = marginTop;
    return this;
  }

   /**
   * The top margin of the cell.
   * @return marginTop
  **/
  @ApiModelProperty(required = true, value = "The top margin of the cell.")
  public Double getMarginTop() {
    return marginTop;
  }

  public void setMarginTop(Double marginTop) {
    this.marginTop = marginTop;
  }

  public TableCell marginRight(Double marginRight) {
    this.marginRight = marginRight;
    return this;
  }

   /**
   * The right margin of the cell.
   * @return marginRight
  **/
  @ApiModelProperty(required = true, value = "The right margin of the cell.")
  public Double getMarginRight() {
    return marginRight;
  }

  public void setMarginRight(Double marginRight) {
    this.marginRight = marginRight;
  }

  public TableCell marginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
    return this;
  }

   /**
   * The left margin of the cell.
   * @return marginLeft
  **/
  @ApiModelProperty(required = true, value = "The left margin of the cell.")
  public Double getMarginLeft() {
    return marginLeft;
  }

  public void setMarginLeft(Double marginLeft) {
    this.marginLeft = marginLeft;
  }

  public TableCell marginBottom(Double marginBottom) {
    this.marginBottom = marginBottom;
    return this;
  }

   /**
   * The bottom margin of the cell.
   * @return marginBottom
  **/
  @ApiModelProperty(required = true, value = "The bottom margin of the cell.")
  public Double getMarginBottom() {
    return marginBottom;
  }

  public void setMarginBottom(Double marginBottom) {
    this.marginBottom = marginBottom;
  }

  public TableCell textAnchorType(TextAnchorType textAnchorType) {
    this.textAnchorType = textAnchorType;
    return this;
  }

   /**
   * Text anchor type.
   * @return textAnchorType
  **/
  @ApiModelProperty(required = true, value = "Text anchor type.")
  public TextAnchorType getTextAnchorType() {
    return textAnchorType;
  }

  public void setTextAnchorType(TextAnchorType textAnchorType) {
    this.textAnchorType = textAnchorType;
  }

  public TableCell textVerticalType(TextVerticalType textVerticalType) {
    this.textVerticalType = textVerticalType;
    return this;
  }

   /**
   * The type of vertical text.
   * @return textVerticalType
  **/
  @ApiModelProperty(required = true, value = "The type of vertical text.")
  public TextVerticalType getTextVerticalType() {
    return textVerticalType;
  }

  public void setTextVerticalType(TextVerticalType textVerticalType) {
    this.textVerticalType = textVerticalType;
  }

  public TableCell fillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
    return this;
  }

   /**
   * Fill properties set of the cell.
   * @return fillFormat
  **/
  @ApiModelProperty(value = "Fill properties set of the cell.")
  public FillFormat getFillFormat() {
    return fillFormat;
  }

  public void setFillFormat(FillFormat fillFormat) {
    this.fillFormat = fillFormat;
  }

  public TableCell borderTop(LineFormat borderTop) {
    this.borderTop = borderTop;
    return this;
  }

   /**
   * Line properties set for the top border of the cell.
   * @return borderTop
  **/
  @ApiModelProperty(value = "Line properties set for the top border of the cell.")
  public LineFormat getBorderTop() {
    return borderTop;
  }

  public void setBorderTop(LineFormat borderTop) {
    this.borderTop = borderTop;
  }

  public TableCell borderRight(LineFormat borderRight) {
    this.borderRight = borderRight;
    return this;
  }

   /**
   * Line properties set for the right border of the cell.
   * @return borderRight
  **/
  @ApiModelProperty(value = "Line properties set for the right border of the cell.")
  public LineFormat getBorderRight() {
    return borderRight;
  }

  public void setBorderRight(LineFormat borderRight) {
    this.borderRight = borderRight;
  }

  public TableCell borderLeft(LineFormat borderLeft) {
    this.borderLeft = borderLeft;
    return this;
  }

   /**
   * Line properties set for the left border of the cell.
   * @return borderLeft
  **/
  @ApiModelProperty(value = "Line properties set for the left border of the cell.")
  public LineFormat getBorderLeft() {
    return borderLeft;
  }

  public void setBorderLeft(LineFormat borderLeft) {
    this.borderLeft = borderLeft;
  }

  public TableCell borderBottom(LineFormat borderBottom) {
    this.borderBottom = borderBottom;
    return this;
  }

   /**
   * Line properties set for the bottom border of the cell.
   * @return borderBottom
  **/
  @ApiModelProperty(value = "Line properties set for the bottom border of the cell.")
  public LineFormat getBorderBottom() {
    return borderBottom;
  }

  public void setBorderBottom(LineFormat borderBottom) {
    this.borderBottom = borderBottom;
  }

  public TableCell borderDiagonalUp(LineFormat borderDiagonalUp) {
    this.borderDiagonalUp = borderDiagonalUp;
    return this;
  }

   /**
   * Line properties set for the diagonal up border of the cell.
   * @return borderDiagonalUp
  **/
  @ApiModelProperty(value = "Line properties set for the diagonal up border of the cell.")
  public LineFormat getBorderDiagonalUp() {
    return borderDiagonalUp;
  }

  public void setBorderDiagonalUp(LineFormat borderDiagonalUp) {
    this.borderDiagonalUp = borderDiagonalUp;
  }

  public TableCell borderDiagonalDown(LineFormat borderDiagonalDown) {
    this.borderDiagonalDown = borderDiagonalDown;
    return this;
  }

   /**
   * Line properties set for the diagonal down border of the cell.
   * @return borderDiagonalDown
  **/
  @ApiModelProperty(value = "Line properties set for the diagonal down border of the cell.")
  public LineFormat getBorderDiagonalDown() {
    return borderDiagonalDown;
  }

  public void setBorderDiagonalDown(LineFormat borderDiagonalDown) {
    this.borderDiagonalDown = borderDiagonalDown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableCell tableCell = (TableCell) o;
    return true && Objects.equals(this.text, tableCell.text) && Objects.equals(this.rowSpan, tableCell.rowSpan) && Objects.equals(this.colSpan, tableCell.colSpan) && Objects.equals(this.marginTop, tableCell.marginTop) && Objects.equals(this.marginRight, tableCell.marginRight) && Objects.equals(this.marginLeft, tableCell.marginLeft) && Objects.equals(this.marginBottom, tableCell.marginBottom) && Objects.equals(this.textAnchorType, tableCell.textAnchorType) && Objects.equals(this.textVerticalType, tableCell.textVerticalType) && Objects.equals(this.fillFormat, tableCell.fillFormat) && Objects.equals(this.borderTop, tableCell.borderTop) && Objects.equals(this.borderRight, tableCell.borderRight) && Objects.equals(this.borderLeft, tableCell.borderLeft) && Objects.equals(this.borderBottom, tableCell.borderBottom) && Objects.equals(this.borderDiagonalUp, tableCell.borderDiagonalUp) && Objects.equals(this.borderDiagonalDown, tableCell.borderDiagonalDown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, rowSpan, colSpan, marginTop, marginRight, marginLeft, marginBottom, textAnchorType, textVerticalType, fillFormat, borderTop, borderRight, borderLeft, borderBottom, borderDiagonalUp, borderDiagonalDown);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableCell {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    rowSpan: ").append(toIndentedString(rowSpan)).append("\n");
    sb.append("    colSpan: ").append(toIndentedString(colSpan)).append("\n");
    sb.append("    marginTop: ").append(toIndentedString(marginTop)).append("\n");
    sb.append("    marginRight: ").append(toIndentedString(marginRight)).append("\n");
    sb.append("    marginLeft: ").append(toIndentedString(marginLeft)).append("\n");
    sb.append("    marginBottom: ").append(toIndentedString(marginBottom)).append("\n");
    sb.append("    textAnchorType: ").append(toIndentedString(textAnchorType)).append("\n");
    sb.append("    textVerticalType: ").append(toIndentedString(textVerticalType)).append("\n");
    sb.append("    fillFormat: ").append(toIndentedString(fillFormat)).append("\n");
    sb.append("    borderTop: ").append(toIndentedString(borderTop)).append("\n");
    sb.append("    borderRight: ").append(toIndentedString(borderRight)).append("\n");
    sb.append("    borderLeft: ").append(toIndentedString(borderLeft)).append("\n");
    sb.append("    borderBottom: ").append(toIndentedString(borderBottom)).append("\n");
    sb.append("    borderDiagonalUp: ").append(toIndentedString(borderDiagonalUp)).append("\n");
    sb.append("    borderDiagonalDown: ").append(toIndentedString(borderDiagonalDown)).append("\n");
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

