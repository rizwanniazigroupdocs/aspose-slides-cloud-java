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
package com.aspose.slides.model.request;

import java.util.List;
import com.aspose.slides.model.*;

public class PostGetNotesSlideWithFormatRequest {
  public PostGetNotesSlideWithFormatRequest() {
  }

  private byte[] document;

  public byte[] getDocument() {
    return document;
  }

  public void setDocument(byte[] document) {
    this.document = document;
  }

  private Integer slideIndex;

  public Integer getSlideIndex() {
    return slideIndex;
  }

  public void setSlideIndex(Integer slideIndex) {
    this.slideIndex = slideIndex;
  }

  private NotesSlideExportFormat format;

  public NotesSlideExportFormat getFormat() {
    return format;
  }

  public void setFormat(NotesSlideExportFormat format) {
    this.format = format;
  }

  private Integer width;

  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  private Integer height;

  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  private String password;

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  private String fontsFolder;

  public String getFontsFolder() {
    return fontsFolder;
  }

  public void setFontsFolder(String fontsFolder) {
    this.fontsFolder = fontsFolder;
  }

}
