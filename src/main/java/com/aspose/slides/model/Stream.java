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
import com.aspose.slides.model.MarshalByRefObject;
import com.aspose.slides.model.Stream;
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
 * Stream
 */
public class Stream extends MarshalByRefObject {
  @SerializedName("CanRead")
  private Boolean canRead;

  @SerializedName("CanSeek")
  private Boolean canSeek;

  @SerializedName("CanTimeout")
  private Boolean canTimeout;

  @SerializedName("CanWrite")
  private Boolean canWrite;

  @SerializedName("Length")
  private Long length;

  @SerializedName("Position")
  private Long position;

  @SerializedName("ReadTimeout")
  private Integer readTimeout;

  @SerializedName("WriteTimeout")
  private Integer writeTimeout;

  @SerializedName("Null")
  private Stream _null;


  public Stream() {
    super();
  }

  public Stream canRead(Boolean canRead) {
    this.canRead = canRead;
    return this;
  }

   /**
   * Get canRead
   * @return canRead
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanRead() {
    return canRead;
  }

  public void setCanRead(Boolean canRead) {
    this.canRead = canRead;
  }

  public Stream canSeek(Boolean canSeek) {
    this.canSeek = canSeek;
    return this;
  }

   /**
   * Get canSeek
   * @return canSeek
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanSeek() {
    return canSeek;
  }

  public void setCanSeek(Boolean canSeek) {
    this.canSeek = canSeek;
  }

  public Stream canTimeout(Boolean canTimeout) {
    this.canTimeout = canTimeout;
    return this;
  }

   /**
   * Get canTimeout
   * @return canTimeout
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanTimeout() {
    return canTimeout;
  }

  public void setCanTimeout(Boolean canTimeout) {
    this.canTimeout = canTimeout;
  }

  public Stream canWrite(Boolean canWrite) {
    this.canWrite = canWrite;
    return this;
  }

   /**
   * Get canWrite
   * @return canWrite
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanWrite() {
    return canWrite;
  }

  public void setCanWrite(Boolean canWrite) {
    this.canWrite = canWrite;
  }

  public Stream length(Long length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public Long getLength() {
    return length;
  }

  public void setLength(Long length) {
    this.length = length;
  }

  public Stream position(Long position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Long getPosition() {
    return position;
  }

  public void setPosition(Long position) {
    this.position = position;
  }

  public Stream readTimeout(Integer readTimeout) {
    this.readTimeout = readTimeout;
    return this;
  }

   /**
   * Get readTimeout
   * @return readTimeout
  **/
  @ApiModelProperty(value = "")
  public Integer getReadTimeout() {
    return readTimeout;
  }

  public void setReadTimeout(Integer readTimeout) {
    this.readTimeout = readTimeout;
  }

  public Stream writeTimeout(Integer writeTimeout) {
    this.writeTimeout = writeTimeout;
    return this;
  }

   /**
   * Get writeTimeout
   * @return writeTimeout
  **/
  @ApiModelProperty(value = "")
  public Integer getWriteTimeout() {
    return writeTimeout;
  }

  public void setWriteTimeout(Integer writeTimeout) {
    this.writeTimeout = writeTimeout;
  }

  public Stream _null(Stream _null) {
    this._null = _null;
    return this;
  }

   /**
   * Get _null
   * @return _null
  **/
  @ApiModelProperty(value = "")
  public Stream getNull() {
    return _null;
  }

  public void setNull(Stream _null) {
    this._null = _null;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stream stream = (Stream) o;
    return true && Objects.equals(this.canRead, stream.canRead) && Objects.equals(this.canSeek, stream.canSeek) && Objects.equals(this.canTimeout, stream.canTimeout) && Objects.equals(this.canWrite, stream.canWrite) && Objects.equals(this.length, stream.length) && Objects.equals(this.position, stream.position) && Objects.equals(this.readTimeout, stream.readTimeout) && Objects.equals(this.writeTimeout, stream.writeTimeout) && Objects.equals(this._null, stream._null) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRead, canSeek, canTimeout, canWrite, length, position, readTimeout, writeTimeout, _null, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stream {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
    sb.append("    canSeek: ").append(toIndentedString(canSeek)).append("\n");
    sb.append("    canTimeout: ").append(toIndentedString(canTimeout)).append("\n");
    sb.append("    canWrite: ").append(toIndentedString(canWrite)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    readTimeout: ").append(toIndentedString(readTimeout)).append("\n");
    sb.append("    writeTimeout: ").append(toIndentedString(writeTimeout)).append("\n");
    sb.append("    _null: ").append(toIndentedString(_null)).append("\n");
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

