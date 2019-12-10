/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PresentationOptions.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
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

package com.groupdocs.cloud.watermark.model;

import java.util.Objects;
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

/**
 * Class for watermark options of presentation document.
 */
@ApiModel(description = "Class for watermark options of presentation document.")
public class PresentationOptions {
  @SerializedName("slides")
  private List<Integer> slides = null;

  @SerializedName("protectWithUnreadableCharacters")
  private Boolean protectWithUnreadableCharacters = null;

  @SerializedName("lockWatermarks")
  private Boolean lockWatermarks = null;

  public PresentationOptions slides(List<Integer> slides) {
    this.slides = slides;
    return this;
  }

  public PresentationOptions addSlidesItem(Integer slidesItem) {
    if (this.slides == null) {
      this.slides = new ArrayList<Integer>();
    }
    this.slides.add(slidesItem);
    return this;
  }

   /**
   * Gets or sets the slides to add watermark to.
   * @return slides
  **/
  @ApiModelProperty(value = "Gets or sets the slides to add watermark to.")
  public List<Integer> getSlides() {
    return slides;
  }

  public void setSlides(List<Integer> slides) {
    this.slides = slides;
  }

  public PresentationOptions protectWithUnreadableCharacters(Boolean protectWithUnreadableCharacters) {
    this.protectWithUnreadableCharacters = protectWithUnreadableCharacters;
    return this;
  }

   /**
   * Gets or sets a value indicating whether the text watermark characters are mixed with unreadable characters. This protection applies only when LockWatermarks property is true.
   * @return protectWithUnreadableCharacters
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether the text watermark characters are mixed with unreadable characters. This protection applies only when LockWatermarks property is true.")
  public Boolean getProtectWithUnreadableCharacters() {
    return protectWithUnreadableCharacters;
  }

  public void setProtectWithUnreadableCharacters(Boolean protectWithUnreadableCharacters) {
    this.protectWithUnreadableCharacters = protectWithUnreadableCharacters;
  }

  public PresentationOptions lockWatermarks(Boolean lockWatermarks) {
    this.lockWatermarks = lockWatermarks;
    return this;
  }

   /**
   * Gets or sets a value indicating whether an editing of the watermark in PowerPoint is forbidden.
   * @return lockWatermarks
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether an editing of the watermark in PowerPoint is forbidden.")
  public Boolean getLockWatermarks() {
    return lockWatermarks;
  }

  public void setLockWatermarks(Boolean lockWatermarks) {
    this.lockWatermarks = lockWatermarks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentationOptions presentationOptions = (PresentationOptions) o;
    return Objects.equals(this.slides, presentationOptions.slides) &&
        Objects.equals(this.protectWithUnreadableCharacters, presentationOptions.protectWithUnreadableCharacters) &&
        Objects.equals(this.lockWatermarks, presentationOptions.lockWatermarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slides, protectWithUnreadableCharacters, lockWatermarks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationOptions {\n");
    
    sb.append("    slides: ").append(toIndentedString(slides)).append("\n");
    sb.append("    protectWithUnreadableCharacters: ").append(toIndentedString(protectWithUnreadableCharacters)).append("\n");
    sb.append("    lockWatermarks: ").append(toIndentedString(lockWatermarks)).append("\n");
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

