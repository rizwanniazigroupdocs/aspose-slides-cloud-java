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
import com.aspose.slides.model.CommentsPositions;
import com.aspose.slides.model.ExportOptions;
import com.aspose.slides.model.ImagePixelFormat;
import com.aspose.slides.model.NotesPositions;
import com.aspose.slides.model.TiffCompressionType;
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
 * TiffExportOptions
 */
public class TiffExportOptions extends ExportOptions {
  @SerializedName("Compression")
  private TiffCompressionType compression;

  @SerializedName("Width")
  private Integer width;

  @SerializedName("Height")
  private Integer height;

  @SerializedName("DpiX")
  private Integer dpiX;

  @SerializedName("DpiY")
  private Integer dpiY;

  @SerializedName("ShowHiddenSlides")
  private Boolean showHiddenSlides;

  @SerializedName("PixelFormat")
  private ImagePixelFormat pixelFormat;

  @SerializedName("NotesPosition")
  private NotesPositions notesPosition;

  @SerializedName("CommentsPosition")
  private CommentsPositions commentsPosition;

  @SerializedName("CommentsAreaWidth")
  private Integer commentsAreaWidth;

  @SerializedName("CommentsAreaColor")
  private String commentsAreaColor;

  @SerializedName("ShowCommentsByNoAuthor")
  private Boolean showCommentsByNoAuthor;


  public TiffExportOptions() {
    super();
    setFormat("tiff");
  }

  public TiffExportOptions compression(TiffCompressionType compression) {
    this.compression = compression;
    return this;
  }

   /**
   * Get compression
   * @return compression
  **/
  @ApiModelProperty(value = "")
  public TiffCompressionType getCompression() {
    return compression;
  }

  public void setCompression(TiffCompressionType compression) {
    this.compression = compression;
  }

  public TiffExportOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public TiffExportOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public TiffExportOptions dpiX(Integer dpiX) {
    this.dpiX = dpiX;
    return this;
  }

   /**
   * Get dpiX
   * @return dpiX
  **/
  @ApiModelProperty(value = "")
  public Integer getDpiX() {
    return dpiX;
  }

  public void setDpiX(Integer dpiX) {
    this.dpiX = dpiX;
  }

  public TiffExportOptions dpiY(Integer dpiY) {
    this.dpiY = dpiY;
    return this;
  }

   /**
   * Get dpiY
   * @return dpiY
  **/
  @ApiModelProperty(value = "")
  public Integer getDpiY() {
    return dpiY;
  }

  public void setDpiY(Integer dpiY) {
    this.dpiY = dpiY;
  }

  public TiffExportOptions showHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
    return this;
  }

   /**
   * Specifies whether the generated document should include hidden slides or not. Default is false. 
   * @return showHiddenSlides
  **/
  @ApiModelProperty(value = "Specifies whether the generated document should include hidden slides or not. Default is false. ")
  public Boolean isShowHiddenSlides() {
    return showHiddenSlides;
  }

  public void setShowHiddenSlides(Boolean showHiddenSlides) {
    this.showHiddenSlides = showHiddenSlides;
  }

  public TiffExportOptions pixelFormat(ImagePixelFormat pixelFormat) {
    this.pixelFormat = pixelFormat;
    return this;
  }

   /**
   * Specifies the pixel format for the generated images. Read/write .
   * @return pixelFormat
  **/
  @ApiModelProperty(value = "Specifies the pixel format for the generated images. Read/write .")
  public ImagePixelFormat getPixelFormat() {
    return pixelFormat;
  }

  public void setPixelFormat(ImagePixelFormat pixelFormat) {
    this.pixelFormat = pixelFormat;
  }

  public TiffExportOptions notesPosition(NotesPositions notesPosition) {
    this.notesPosition = notesPosition;
    return this;
  }

   /**
   * Gets or sets the position of the notes on the page.
   * @return notesPosition
  **/
  @ApiModelProperty(value = "Gets or sets the position of the notes on the page.")
  public NotesPositions getNotesPosition() {
    return notesPosition;
  }

  public void setNotesPosition(NotesPositions notesPosition) {
    this.notesPosition = notesPosition;
  }

  public TiffExportOptions commentsPosition(CommentsPositions commentsPosition) {
    this.commentsPosition = commentsPosition;
    return this;
  }

   /**
   * Gets or sets the position of the comments on the page.
   * @return commentsPosition
  **/
  @ApiModelProperty(value = "Gets or sets the position of the comments on the page.")
  public CommentsPositions getCommentsPosition() {
    return commentsPosition;
  }

  public void setCommentsPosition(CommentsPositions commentsPosition) {
    this.commentsPosition = commentsPosition;
  }

  public TiffExportOptions commentsAreaWidth(Integer commentsAreaWidth) {
    this.commentsAreaWidth = commentsAreaWidth;
    return this;
  }

   /**
   * Gets or sets the width of the comment output area in pixels (Applies only if comments are displayed on the right).
   * @return commentsAreaWidth
  **/
  @ApiModelProperty(value = "Gets or sets the width of the comment output area in pixels (Applies only if comments are displayed on the right).")
  public Integer getCommentsAreaWidth() {
    return commentsAreaWidth;
  }

  public void setCommentsAreaWidth(Integer commentsAreaWidth) {
    this.commentsAreaWidth = commentsAreaWidth;
  }

  public TiffExportOptions commentsAreaColor(String commentsAreaColor) {
    this.commentsAreaColor = commentsAreaColor;
    return this;
  }

   /**
   * Gets or sets the color of comments area (Applies only if comments are displayed on the right).
   * @return commentsAreaColor
  **/
  @ApiModelProperty(value = "Gets or sets the color of comments area (Applies only if comments are displayed on the right).")
  public String getCommentsAreaColor() {
    return commentsAreaColor;
  }

  public void setCommentsAreaColor(String commentsAreaColor) {
    this.commentsAreaColor = commentsAreaColor;
  }

  public TiffExportOptions showCommentsByNoAuthor(Boolean showCommentsByNoAuthor) {
    this.showCommentsByNoAuthor = showCommentsByNoAuthor;
    return this;
  }

   /**
   * True if comments that have no author are displayed. (Applies only if comments are displayed).
   * @return showCommentsByNoAuthor
  **/
  @ApiModelProperty(value = "True if comments that have no author are displayed. (Applies only if comments are displayed).")
  public Boolean isShowCommentsByNoAuthor() {
    return showCommentsByNoAuthor;
  }

  public void setShowCommentsByNoAuthor(Boolean showCommentsByNoAuthor) {
    this.showCommentsByNoAuthor = showCommentsByNoAuthor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TiffExportOptions tiffExportOptions = (TiffExportOptions) o;
    return true && Objects.equals(this.compression, tiffExportOptions.compression) && Objects.equals(this.width, tiffExportOptions.width) && Objects.equals(this.height, tiffExportOptions.height) && Objects.equals(this.dpiX, tiffExportOptions.dpiX) && Objects.equals(this.dpiY, tiffExportOptions.dpiY) && Objects.equals(this.showHiddenSlides, tiffExportOptions.showHiddenSlides) && Objects.equals(this.pixelFormat, tiffExportOptions.pixelFormat) && Objects.equals(this.notesPosition, tiffExportOptions.notesPosition) && Objects.equals(this.commentsPosition, tiffExportOptions.commentsPosition) && Objects.equals(this.commentsAreaWidth, tiffExportOptions.commentsAreaWidth) && Objects.equals(this.commentsAreaColor, tiffExportOptions.commentsAreaColor) && Objects.equals(this.showCommentsByNoAuthor, tiffExportOptions.showCommentsByNoAuthor) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compression, width, height, dpiX, dpiY, showHiddenSlides, pixelFormat, notesPosition, commentsPosition, commentsAreaWidth, commentsAreaColor, showCommentsByNoAuthor, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiffExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    dpiX: ").append(toIndentedString(dpiX)).append("\n");
    sb.append("    dpiY: ").append(toIndentedString(dpiY)).append("\n");
    sb.append("    showHiddenSlides: ").append(toIndentedString(showHiddenSlides)).append("\n");
    sb.append("    pixelFormat: ").append(toIndentedString(pixelFormat)).append("\n");
    sb.append("    notesPosition: ").append(toIndentedString(notesPosition)).append("\n");
    sb.append("    commentsPosition: ").append(toIndentedString(commentsPosition)).append("\n");
    sb.append("    commentsAreaWidth: ").append(toIndentedString(commentsAreaWidth)).append("\n");
    sb.append("    commentsAreaColor: ").append(toIndentedString(commentsAreaColor)).append("\n");
    sb.append("    showCommentsByNoAuthor: ").append(toIndentedString(showCommentsByNoAuthor)).append("\n");
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

