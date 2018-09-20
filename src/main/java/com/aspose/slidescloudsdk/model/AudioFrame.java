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
import com.aspose.slidescloudsdk.model.AudioPlayModePreset;
import com.aspose.slidescloudsdk.model.AudioVolumeMode;
import com.aspose.slidescloudsdk.model.EffectFormat;
import com.aspose.slidescloudsdk.model.FillFormat;
import com.aspose.slidescloudsdk.model.GeometryShape;
import com.aspose.slidescloudsdk.model.GeometryShapeType;
import com.aspose.slidescloudsdk.model.LineFormat;
import com.aspose.slidescloudsdk.model.ResourceUri;
import com.aspose.slidescloudsdk.model.ResourceUriElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Represents AudioFrame resource.
 */
@ApiModel(description = "Represents AudioFrame resource.")
public class AudioFrame extends GeometryShape {
  @SerializedName("AudioCdEndTrack")
  private Integer audioCdEndTrack = null;

  @SerializedName("AudioCdEndTrackTime")
  private Integer audioCdEndTrackTime = null;

  @SerializedName("AudioCdStartTrack")
  private Integer audioCdStartTrack = null;

  @SerializedName("AudioCdStartTrackTime")
  private Integer audioCdStartTrackTime = null;

  @SerializedName("Embedded")
  private Boolean embedded = null;

  @SerializedName("HideAtShowing")
  private Boolean hideAtShowing = null;

  @SerializedName("PlayLoopMode")
  private Boolean playLoopMode = null;

  @SerializedName("PlayMode")
  private AudioPlayModePreset playMode = null;

  @SerializedName("Volume")
  private AudioVolumeMode volume = null;

  @SerializedName("Base64Data")
  private String base64Data = null;

  public AudioFrame audioCdEndTrack(Integer audioCdEndTrack) {
    this.audioCdEndTrack = audioCdEndTrack;
    return this;
  }

   /**
   * Returns or sets a last track index.
   * @return audioCdEndTrack
  **/
  @ApiModelProperty(value = "Returns or sets a last track index.")
  public Integer getAudioCdEndTrack() {
    return audioCdEndTrack;
  }

  public void setAudioCdEndTrack(Integer audioCdEndTrack) {
    this.audioCdEndTrack = audioCdEndTrack;
  }

  public AudioFrame audioCdEndTrackTime(Integer audioCdEndTrackTime) {
    this.audioCdEndTrackTime = audioCdEndTrackTime;
    return this;
  }

   /**
   * Returns or sets a last track time.
   * @return audioCdEndTrackTime
  **/
  @ApiModelProperty(value = "Returns or sets a last track time.")
  public Integer getAudioCdEndTrackTime() {
    return audioCdEndTrackTime;
  }

  public void setAudioCdEndTrackTime(Integer audioCdEndTrackTime) {
    this.audioCdEndTrackTime = audioCdEndTrackTime;
  }

  public AudioFrame audioCdStartTrack(Integer audioCdStartTrack) {
    this.audioCdStartTrack = audioCdStartTrack;
    return this;
  }

   /**
   * Returns or sets a start track index.
   * @return audioCdStartTrack
  **/
  @ApiModelProperty(value = "Returns or sets a start track index.")
  public Integer getAudioCdStartTrack() {
    return audioCdStartTrack;
  }

  public void setAudioCdStartTrack(Integer audioCdStartTrack) {
    this.audioCdStartTrack = audioCdStartTrack;
  }

  public AudioFrame audioCdStartTrackTime(Integer audioCdStartTrackTime) {
    this.audioCdStartTrackTime = audioCdStartTrackTime;
    return this;
  }

   /**
   * Returns or sets a start track time. 
   * @return audioCdStartTrackTime
  **/
  @ApiModelProperty(value = "Returns or sets a start track time. ")
  public Integer getAudioCdStartTrackTime() {
    return audioCdStartTrackTime;
  }

  public void setAudioCdStartTrackTime(Integer audioCdStartTrackTime) {
    this.audioCdStartTrackTime = audioCdStartTrackTime;
  }

  public AudioFrame embedded(Boolean embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Determines whether a sound is embedded to a presentation.
   * @return embedded
  **/
  @ApiModelProperty(value = "Determines whether a sound is embedded to a presentation.")
  public Boolean isEmbedded() {
    return embedded;
  }

  public void setEmbedded(Boolean embedded) {
    this.embedded = embedded;
  }

  public AudioFrame hideAtShowing(Boolean hideAtShowing) {
    this.hideAtShowing = hideAtShowing;
    return this;
  }

   /**
   * Determines whether an AudioFrame is hidden.
   * @return hideAtShowing
  **/
  @ApiModelProperty(value = "Determines whether an AudioFrame is hidden.")
  public Boolean isHideAtShowing() {
    return hideAtShowing;
  }

  public void setHideAtShowing(Boolean hideAtShowing) {
    this.hideAtShowing = hideAtShowing;
  }

  public AudioFrame playLoopMode(Boolean playLoopMode) {
    this.playLoopMode = playLoopMode;
    return this;
  }

   /**
   * Determines whether an audio is looped. 
   * @return playLoopMode
  **/
  @ApiModelProperty(value = "Determines whether an audio is looped. ")
  public Boolean isPlayLoopMode() {
    return playLoopMode;
  }

  public void setPlayLoopMode(Boolean playLoopMode) {
    this.playLoopMode = playLoopMode;
  }

  public AudioFrame playMode(AudioPlayModePreset playMode) {
    this.playMode = playMode;
    return this;
  }

   /**
   * Returns or sets the audio play mode.
   * @return playMode
  **/
  @ApiModelProperty(value = "Returns or sets the audio play mode.")
  public AudioPlayModePreset getPlayMode() {
    return playMode;
  }

  public void setPlayMode(AudioPlayModePreset playMode) {
    this.playMode = playMode;
  }

  public AudioFrame volume(AudioVolumeMode volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Returns or sets the audio volume.
   * @return volume
  **/
  @ApiModelProperty(value = "Returns or sets the audio volume.")
  public AudioVolumeMode getVolume() {
    return volume;
  }

  public void setVolume(AudioVolumeMode volume) {
    this.volume = volume;
  }

  public AudioFrame base64Data(String base64Data) {
    this.base64Data = base64Data;
    return this;
  }

   /**
   * Audio data encoded in base64.
   * @return base64Data
  **/
  @ApiModelProperty(value = "Audio data encoded in base64.")
  public String getBase64Data() {
    return base64Data;
  }

  public void setBase64Data(String base64Data) {
    this.base64Data = base64Data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioFrame audioFrame = (AudioFrame) o;
    return true && Objects.equals(this.audioCdEndTrack, audioFrame.audioCdEndTrack) && Objects.equals(this.audioCdEndTrackTime, audioFrame.audioCdEndTrackTime) && Objects.equals(this.audioCdStartTrack, audioFrame.audioCdStartTrack) && Objects.equals(this.audioCdStartTrackTime, audioFrame.audioCdStartTrackTime) && Objects.equals(this.embedded, audioFrame.embedded) && Objects.equals(this.hideAtShowing, audioFrame.hideAtShowing) && Objects.equals(this.playLoopMode, audioFrame.playLoopMode) && Objects.equals(this.playMode, audioFrame.playMode) && Objects.equals(this.volume, audioFrame.volume) && Objects.equals(this.base64Data, audioFrame.base64Data) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioCdEndTrack, audioCdEndTrackTime, audioCdStartTrack, audioCdStartTrackTime, embedded, hideAtShowing, playLoopMode, playMode, volume, base64Data, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioFrame {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    audioCdEndTrack: ").append(toIndentedString(audioCdEndTrack)).append("\n");
    sb.append("    audioCdEndTrackTime: ").append(toIndentedString(audioCdEndTrackTime)).append("\n");
    sb.append("    audioCdStartTrack: ").append(toIndentedString(audioCdStartTrack)).append("\n");
    sb.append("    audioCdStartTrackTime: ").append(toIndentedString(audioCdStartTrackTime)).append("\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    hideAtShowing: ").append(toIndentedString(hideAtShowing)).append("\n");
    sb.append("    playLoopMode: ").append(toIndentedString(playLoopMode)).append("\n");
    sb.append("    playMode: ").append(toIndentedString(playMode)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    base64Data: ").append(toIndentedString(base64Data)).append("\n");
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

