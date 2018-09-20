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
import com.aspose.slidescloudsdk.model.ExportOptions;
import com.aspose.slidescloudsdk.model.OutputFile;
import com.aspose.slidescloudsdk.model.SlideExportFormat;
import com.aspose.slidescloudsdk.model.Task;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Save slide task.
 */
@ApiModel(description = "Save slide task.")
public class SaveSlide extends Task {
  @SerializedName("Output")
  private OutputFile output = null;

  @SerializedName("Format")
  private SlideExportFormat format = null;

  @SerializedName("Options")
  private ExportOptions options = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("Position")
  private Integer position = null;

  public SaveSlide output(OutputFile output) {
    this.output = output;
    return this;
  }

   /**
   * Output to save the slide to.
   * @return output
  **/
  @ApiModelProperty(value = "Output to save the slide to.")
  public OutputFile getOutput() {
    return output;
  }

  public void setOutput(OutputFile output) {
    this.output = output;
  }

  public SaveSlide format(SlideExportFormat format) {
    this.format = format;
    return this;
  }

   /**
   * Save format.
   * @return format
  **/
  @ApiModelProperty(value = "Save format.")
  public SlideExportFormat getFormat() {
    return format;
  }

  public void setFormat(SlideExportFormat format) {
    this.format = format;
  }

  public SaveSlide options(ExportOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Save options.
   * @return options
  **/
  @ApiModelProperty(value = "Save options.")
  public ExportOptions getOptions() {
    return options;
  }

  public void setOptions(ExportOptions options) {
    this.options = options;
  }

  public SaveSlide width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Result width for saving to an image format.
   * @return width
  **/
  @ApiModelProperty(value = "Result width for saving to an image format.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public SaveSlide height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Result height for saving to an image format.
   * @return height
  **/
  @ApiModelProperty(value = "Result height for saving to an image format.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public SaveSlide position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Slide index.
   * @return position
  **/
  @ApiModelProperty(value = "Slide index.")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaveSlide saveSlide = (SaveSlide) o;
    return true && Objects.equals(this.output, saveSlide.output) && Objects.equals(this.format, saveSlide.format) && Objects.equals(this.options, saveSlide.options) && Objects.equals(this.width, saveSlide.width) && Objects.equals(this.height, saveSlide.height) && Objects.equals(this.position, saveSlide.position) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(output, format, options, width, height, position, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaveSlide {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

