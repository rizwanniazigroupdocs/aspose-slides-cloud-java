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
import com.aspose.slides.model.PictureFillMode;
import com.aspose.slides.model.ResourceUriElement;
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
 * PictureFill
 */
public class PictureFill extends FillFormat {
  @SerializedName("CropBottom")
  private Double cropBottom;

  @SerializedName("CropLeft")
  private Double cropLeft;

  @SerializedName("CropRight")
  private Double cropRight;

  @SerializedName("CropTop")
  private Double cropTop;

  @SerializedName("Dpi")
  private Integer dpi;

  @SerializedName("Image")
  private ResourceUriElement image;

  @SerializedName("Base64Data")
  private String base64Data;

  @SerializedName("SvgData")
  private String svgData;

  @SerializedName("PictureFillMode")
  private PictureFillMode pictureFillMode;


  public PictureFill() {
    super();
    setType(com.aspose.slides.model.FillType.PICTURE);
  }

  public PictureFill cropBottom(Double cropBottom) {
    this.cropBottom = cropBottom;
    return this;
  }

   /**
   * Get cropBottom
   * @return cropBottom
  **/
  @ApiModelProperty(value = "")
  public Double getCropBottom() {
    return cropBottom;
  }

  public void setCropBottom(Double cropBottom) {
    this.cropBottom = cropBottom;
  }

  public PictureFill cropLeft(Double cropLeft) {
    this.cropLeft = cropLeft;
    return this;
  }

   /**
   * Get cropLeft
   * @return cropLeft
  **/
  @ApiModelProperty(value = "")
  public Double getCropLeft() {
    return cropLeft;
  }

  public void setCropLeft(Double cropLeft) {
    this.cropLeft = cropLeft;
  }

  public PictureFill cropRight(Double cropRight) {
    this.cropRight = cropRight;
    return this;
  }

   /**
   * Get cropRight
   * @return cropRight
  **/
  @ApiModelProperty(value = "")
  public Double getCropRight() {
    return cropRight;
  }

  public void setCropRight(Double cropRight) {
    this.cropRight = cropRight;
  }

  public PictureFill cropTop(Double cropTop) {
    this.cropTop = cropTop;
    return this;
  }

   /**
   * Get cropTop
   * @return cropTop
  **/
  @ApiModelProperty(value = "")
  public Double getCropTop() {
    return cropTop;
  }

  public void setCropTop(Double cropTop) {
    this.cropTop = cropTop;
  }

  public PictureFill dpi(Integer dpi) {
    this.dpi = dpi;
    return this;
  }

   /**
   * Get dpi
   * @return dpi
  **/
  @ApiModelProperty(value = "")
  public Integer getDpi() {
    return dpi;
  }

  public void setDpi(Integer dpi) {
    this.dpi = dpi;
  }

  public PictureFill image(ResourceUriElement image) {
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @ApiModelProperty(value = "")
  public ResourceUriElement getImage() {
    return image;
  }

  public void setImage(ResourceUriElement image) {
    this.image = image;
  }

  public PictureFill base64Data(String base64Data) {
    this.base64Data = base64Data;
    return this;
  }

   /**
   * Get base64Data
   * @return base64Data
  **/
  @ApiModelProperty(value = "")
  public String getBase64Data() {
    return base64Data;
  }

  public void setBase64Data(String base64Data) {
    this.base64Data = base64Data;
  }

  public PictureFill svgData(String svgData) {
    this.svgData = svgData;
    return this;
  }

   /**
   * Get svgData
   * @return svgData
  **/
  @ApiModelProperty(value = "")
  public String getSvgData() {
    return svgData;
  }

  public void setSvgData(String svgData) {
    this.svgData = svgData;
  }

  public PictureFill pictureFillMode(PictureFillMode pictureFillMode) {
    this.pictureFillMode = pictureFillMode;
    return this;
  }

   /**
   * Get pictureFillMode
   * @return pictureFillMode
  **/
  @ApiModelProperty(value = "")
  public PictureFillMode getPictureFillMode() {
    return pictureFillMode;
  }

  public void setPictureFillMode(PictureFillMode pictureFillMode) {
    this.pictureFillMode = pictureFillMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PictureFill pictureFill = (PictureFill) o;
    return true && Objects.equals(this.cropBottom, pictureFill.cropBottom) && Objects.equals(this.cropLeft, pictureFill.cropLeft) && Objects.equals(this.cropRight, pictureFill.cropRight) && Objects.equals(this.cropTop, pictureFill.cropTop) && Objects.equals(this.dpi, pictureFill.dpi) && Objects.equals(this.image, pictureFill.image) && Objects.equals(this.base64Data, pictureFill.base64Data) && Objects.equals(this.svgData, pictureFill.svgData) && Objects.equals(this.pictureFillMode, pictureFill.pictureFillMode) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cropBottom, cropLeft, cropRight, cropTop, dpi, image, base64Data, svgData, pictureFillMode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PictureFill {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cropBottom: ").append(toIndentedString(cropBottom)).append("\n");
    sb.append("    cropLeft: ").append(toIndentedString(cropLeft)).append("\n");
    sb.append("    cropRight: ").append(toIndentedString(cropRight)).append("\n");
    sb.append("    cropTop: ").append(toIndentedString(cropTop)).append("\n");
    sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    base64Data: ").append(toIndentedString(base64Data)).append("\n");
    sb.append("    svgData: ").append(toIndentedString(svgData)).append("\n");
    sb.append("    pictureFillMode: ").append(toIndentedString(pictureFillMode)).append("\n");
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

