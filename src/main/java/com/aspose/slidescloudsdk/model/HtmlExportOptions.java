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
import com.aspose.slidescloudsdk.model.CommentsPositions;
import com.aspose.slidescloudsdk.model.ExportOptions;
import com.aspose.slidescloudsdk.model.NotesPositions;
import com.aspose.slidescloudsdk.model.PicturesCompression;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Provides options that control how a presentation is saved in Html format.
 */
@ApiModel(description = "Provides options that control how a presentation is saved in Html format.")
public class HtmlExportOptions extends ExportOptions {
  @SerializedName("SaveAsZip")
  private Boolean saveAsZip = null;

  @SerializedName("SubDirectoryName")
  private String subDirectoryName = null;

  @SerializedName("ShowHiddenSlides")
  private Boolean showHiddenSlides = null;

  @SerializedName("JpegQuality")
  private Integer jpegQuality = null;

  @SerializedName("PicturesCompression")
  private PicturesCompression picturesCompression = null;

  @SerializedName("DeletePicturesCroppedAreas")
  private Boolean deletePicturesCroppedAreas = null;

  @SerializedName("NotesPosition")
  private NotesPositions notesPosition = null;

  @SerializedName("CommentsPosition")
  private CommentsPositions commentsPosition = null;

  @SerializedName("CommentsAreaWidth")
  private Integer commentsAreaWidth = null;

  @SerializedName("CommentsAreaColor")
  private String commentsAreaColor = null;

  public HtmlExportOptions saveAsZip(Boolean saveAsZip) {
    this.saveAsZip = saveAsZip;
    return this;
  }

   /**
   * Get or sets flag for save presentation as zip file
   * @return saveAsZip
  **/
  @ApiModelProperty(value = "Get or sets flag for save presentation as zip file")
  public Boolean isSaveAsZip() {
    return saveAsZip;
  }

  public void setSaveAsZip(Boolean saveAsZip) {
    this.saveAsZip = saveAsZip;
  }

  public HtmlExportOptions subDirectoryName(String subDirectoryName) {
    this.subDirectoryName = subDirectoryName;
    return this;
  }

   /**
   * Get or set name of subdirectory in zip-file for store external files
   * @return subDirectoryName
  **/
  @ApiModelProperty(value = "Get or set name of subdirectory in zip-file for store external files")
  public String getSubDirectoryName() {
    return subDirectoryName;
  }

  public void setSubDirectoryName(String subDirectoryName) {
    this.subDirectoryName = subDirectoryName;
  }

  public HtmlExportOptions showHiddenSlides(Boolean showHiddenSlides) {
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

  public HtmlExportOptions jpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
    return this;
  }

   /**
   * Returns or sets a value determining the quality of the JPEG images inside PDF document.
   * @return jpegQuality
  **/
  @ApiModelProperty(value = "Returns or sets a value determining the quality of the JPEG images inside PDF document.")
  public Integer getJpegQuality() {
    return jpegQuality;
  }

  public void setJpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
  }

  public HtmlExportOptions picturesCompression(PicturesCompression picturesCompression) {
    this.picturesCompression = picturesCompression;
    return this;
  }

   /**
   * Represents the pictures compression level
   * @return picturesCompression
  **/
  @ApiModelProperty(value = "Represents the pictures compression level")
  public PicturesCompression getPicturesCompression() {
    return picturesCompression;
  }

  public void setPicturesCompression(PicturesCompression picturesCompression) {
    this.picturesCompression = picturesCompression;
  }

  public HtmlExportOptions deletePicturesCroppedAreas(Boolean deletePicturesCroppedAreas) {
    this.deletePicturesCroppedAreas = deletePicturesCroppedAreas;
    return this;
  }

   /**
   * A boolean flag indicates if the cropped parts remain as part of the document. If true the cropped  parts will removed, if false they will be serialized in the document (which can possible lead to a  larger file)
   * @return deletePicturesCroppedAreas
  **/
  @ApiModelProperty(value = "A boolean flag indicates if the cropped parts remain as part of the document. If true the cropped  parts will removed, if false they will be serialized in the document (which can possible lead to a  larger file)")
  public Boolean isDeletePicturesCroppedAreas() {
    return deletePicturesCroppedAreas;
  }

  public void setDeletePicturesCroppedAreas(Boolean deletePicturesCroppedAreas) {
    this.deletePicturesCroppedAreas = deletePicturesCroppedAreas;
  }

  public HtmlExportOptions notesPosition(NotesPositions notesPosition) {
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

  public HtmlExportOptions commentsPosition(CommentsPositions commentsPosition) {
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

  public HtmlExportOptions commentsAreaWidth(Integer commentsAreaWidth) {
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

  public HtmlExportOptions commentsAreaColor(String commentsAreaColor) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlExportOptions htmlExportOptions = (HtmlExportOptions) o;
    return true && Objects.equals(this.saveAsZip, htmlExportOptions.saveAsZip) && Objects.equals(this.subDirectoryName, htmlExportOptions.subDirectoryName) && Objects.equals(this.showHiddenSlides, htmlExportOptions.showHiddenSlides) && Objects.equals(this.jpegQuality, htmlExportOptions.jpegQuality) && Objects.equals(this.picturesCompression, htmlExportOptions.picturesCompression) && Objects.equals(this.deletePicturesCroppedAreas, htmlExportOptions.deletePicturesCroppedAreas) && Objects.equals(this.notesPosition, htmlExportOptions.notesPosition) && Objects.equals(this.commentsPosition, htmlExportOptions.commentsPosition) && Objects.equals(this.commentsAreaWidth, htmlExportOptions.commentsAreaWidth) && Objects.equals(this.commentsAreaColor, htmlExportOptions.commentsAreaColor) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(saveAsZip, subDirectoryName, showHiddenSlides, jpegQuality, picturesCompression, deletePicturesCroppedAreas, notesPosition, commentsPosition, commentsAreaWidth, commentsAreaColor, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlExportOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    saveAsZip: ").append(toIndentedString(saveAsZip)).append("\n");
    sb.append("    subDirectoryName: ").append(toIndentedString(subDirectoryName)).append("\n");
    sb.append("    showHiddenSlides: ").append(toIndentedString(showHiddenSlides)).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(jpegQuality)).append("\n");
    sb.append("    picturesCompression: ").append(toIndentedString(picturesCompression)).append("\n");
    sb.append("    deletePicturesCroppedAreas: ").append(toIndentedString(deletePicturesCroppedAreas)).append("\n");
    sb.append("    notesPosition: ").append(toIndentedString(notesPosition)).append("\n");
    sb.append("    commentsPosition: ").append(toIndentedString(commentsPosition)).append("\n");
    sb.append("    commentsAreaWidth: ").append(toIndentedString(commentsAreaWidth)).append("\n");
    sb.append("    commentsAreaColor: ").append(toIndentedString(commentsAreaColor)).append("\n");
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

