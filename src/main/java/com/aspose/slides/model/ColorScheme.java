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
import com.aspose.slides.model.ResourceBase;
import com.aspose.slides.model.ResourceUri;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
 * Slide&#39;s color scheme DTO
 */
@ApiModel(description = "Slide's color scheme DTO")
public class ColorScheme extends ResourceBase {
  @SerializedName("Accent1")
  private String accent1;

  @SerializedName("Accent2")
  private String accent2;

  @SerializedName("Accent3")
  private String accent3;

  @SerializedName("Accent4")
  private String accent4;

  @SerializedName("Accent5")
  private String accent5;

  @SerializedName("Accent6")
  private String accent6;

  @SerializedName("Dark1")
  private String dark1;

  @SerializedName("Dark2")
  private String dark2;

  @SerializedName("FollowedHyperlink")
  private String followedHyperlink;

  @SerializedName("Hyperlink")
  private String hyperlink;

  @SerializedName("Light1")
  private String light1;

  @SerializedName("Light2")
  private String light2;


  public ColorScheme() {
    super();
    setAlternateLinks(new ArrayList<ResourceUri>());
  }

  public ColorScheme accent1(String accent1) {
    this.accent1 = accent1;
    return this;
  }

   /**
   * Get accent1
   * @return accent1
  **/
  @ApiModelProperty(value = "")
  public String getAccent1() {
    return accent1;
  }

  public void setAccent1(String accent1) {
    this.accent1 = accent1;
  }

  public ColorScheme accent2(String accent2) {
    this.accent2 = accent2;
    return this;
  }

   /**
   * Get accent2
   * @return accent2
  **/
  @ApiModelProperty(value = "")
  public String getAccent2() {
    return accent2;
  }

  public void setAccent2(String accent2) {
    this.accent2 = accent2;
  }

  public ColorScheme accent3(String accent3) {
    this.accent3 = accent3;
    return this;
  }

   /**
   * Get accent3
   * @return accent3
  **/
  @ApiModelProperty(value = "")
  public String getAccent3() {
    return accent3;
  }

  public void setAccent3(String accent3) {
    this.accent3 = accent3;
  }

  public ColorScheme accent4(String accent4) {
    this.accent4 = accent4;
    return this;
  }

   /**
   * Get accent4
   * @return accent4
  **/
  @ApiModelProperty(value = "")
  public String getAccent4() {
    return accent4;
  }

  public void setAccent4(String accent4) {
    this.accent4 = accent4;
  }

  public ColorScheme accent5(String accent5) {
    this.accent5 = accent5;
    return this;
  }

   /**
   * Get accent5
   * @return accent5
  **/
  @ApiModelProperty(value = "")
  public String getAccent5() {
    return accent5;
  }

  public void setAccent5(String accent5) {
    this.accent5 = accent5;
  }

  public ColorScheme accent6(String accent6) {
    this.accent6 = accent6;
    return this;
  }

   /**
   * Get accent6
   * @return accent6
  **/
  @ApiModelProperty(value = "")
  public String getAccent6() {
    return accent6;
  }

  public void setAccent6(String accent6) {
    this.accent6 = accent6;
  }

  public ColorScheme dark1(String dark1) {
    this.dark1 = dark1;
    return this;
  }

   /**
   * Get dark1
   * @return dark1
  **/
  @ApiModelProperty(value = "")
  public String getDark1() {
    return dark1;
  }

  public void setDark1(String dark1) {
    this.dark1 = dark1;
  }

  public ColorScheme dark2(String dark2) {
    this.dark2 = dark2;
    return this;
  }

   /**
   * Get dark2
   * @return dark2
  **/
  @ApiModelProperty(value = "")
  public String getDark2() {
    return dark2;
  }

  public void setDark2(String dark2) {
    this.dark2 = dark2;
  }

  public ColorScheme followedHyperlink(String followedHyperlink) {
    this.followedHyperlink = followedHyperlink;
    return this;
  }

   /**
   * Get followedHyperlink
   * @return followedHyperlink
  **/
  @ApiModelProperty(value = "")
  public String getFollowedHyperlink() {
    return followedHyperlink;
  }

  public void setFollowedHyperlink(String followedHyperlink) {
    this.followedHyperlink = followedHyperlink;
  }

  public ColorScheme hyperlink(String hyperlink) {
    this.hyperlink = hyperlink;
    return this;
  }

   /**
   * Get hyperlink
   * @return hyperlink
  **/
  @ApiModelProperty(value = "")
  public String getHyperlink() {
    return hyperlink;
  }

  public void setHyperlink(String hyperlink) {
    this.hyperlink = hyperlink;
  }

  public ColorScheme light1(String light1) {
    this.light1 = light1;
    return this;
  }

   /**
   * Get light1
   * @return light1
  **/
  @ApiModelProperty(value = "")
  public String getLight1() {
    return light1;
  }

  public void setLight1(String light1) {
    this.light1 = light1;
  }

  public ColorScheme light2(String light2) {
    this.light2 = light2;
    return this;
  }

   /**
   * Get light2
   * @return light2
  **/
  @ApiModelProperty(value = "")
  public String getLight2() {
    return light2;
  }

  public void setLight2(String light2) {
    this.light2 = light2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColorScheme colorScheme = (ColorScheme) o;
    return true && Objects.equals(this.accent1, colorScheme.accent1) && Objects.equals(this.accent2, colorScheme.accent2) && Objects.equals(this.accent3, colorScheme.accent3) && Objects.equals(this.accent4, colorScheme.accent4) && Objects.equals(this.accent5, colorScheme.accent5) && Objects.equals(this.accent6, colorScheme.accent6) && Objects.equals(this.dark1, colorScheme.dark1) && Objects.equals(this.dark2, colorScheme.dark2) && Objects.equals(this.followedHyperlink, colorScheme.followedHyperlink) && Objects.equals(this.hyperlink, colorScheme.hyperlink) && Objects.equals(this.light1, colorScheme.light1) && Objects.equals(this.light2, colorScheme.light2) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accent1, accent2, accent3, accent4, accent5, accent6, dark1, dark2, followedHyperlink, hyperlink, light1, light2, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColorScheme {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accent1: ").append(toIndentedString(accent1)).append("\n");
    sb.append("    accent2: ").append(toIndentedString(accent2)).append("\n");
    sb.append("    accent3: ").append(toIndentedString(accent3)).append("\n");
    sb.append("    accent4: ").append(toIndentedString(accent4)).append("\n");
    sb.append("    accent5: ").append(toIndentedString(accent5)).append("\n");
    sb.append("    accent6: ").append(toIndentedString(accent6)).append("\n");
    sb.append("    dark1: ").append(toIndentedString(dark1)).append("\n");
    sb.append("    dark2: ").append(toIndentedString(dark2)).append("\n");
    sb.append("    followedHyperlink: ").append(toIndentedString(followedHyperlink)).append("\n");
    sb.append("    hyperlink: ").append(toIndentedString(hyperlink)).append("\n");
    sb.append("    light1: ").append(toIndentedString(light1)).append("\n");
    sb.append("    light2: ").append(toIndentedString(light2)).append("\n");
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

