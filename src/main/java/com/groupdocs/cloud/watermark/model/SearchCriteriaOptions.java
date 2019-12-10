/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SearchCriteriaOptions.java">
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
import com.groupdocs.cloud.watermark.model.ImageSearchCriteria;
import com.groupdocs.cloud.watermark.model.RotateAngleSearchCriteria;
import com.groupdocs.cloud.watermark.model.SizeSearchCriteria;
import com.groupdocs.cloud.watermark.model.TextFormattingSearchCriteria;
import com.groupdocs.cloud.watermark.model.TextSearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Class for search criteria options.
 */
@ApiModel(description = "Class for search criteria options.")
public class SearchCriteriaOptions {
  @SerializedName("textSearchCriteria")
  private TextSearchCriteria textSearchCriteria = null;

  @SerializedName("imageSearchCriteria")
  private ImageSearchCriteria imageSearchCriteria = null;

  @SerializedName("sizeSearchCriteria")
  private SizeSearchCriteria sizeSearchCriteria = null;

  @SerializedName("rotateAngleSearchCriteria")
  private RotateAngleSearchCriteria rotateAngleSearchCriteria = null;

  @SerializedName("textFormattingSearchCriteria")
  private TextFormattingSearchCriteria textFormattingSearchCriteria = null;

  public SearchCriteriaOptions textSearchCriteria(TextSearchCriteria textSearchCriteria) {
    this.textSearchCriteria = textSearchCriteria;
    return this;
  }

   /**
   * Gets or sets the text search criteria.
   * @return textSearchCriteria
  **/
  @ApiModelProperty(value = "Gets or sets the text search criteria.")
  public TextSearchCriteria getTextSearchCriteria() {
    return textSearchCriteria;
  }

  public void setTextSearchCriteria(TextSearchCriteria textSearchCriteria) {
    this.textSearchCriteria = textSearchCriteria;
  }

  public SearchCriteriaOptions imageSearchCriteria(ImageSearchCriteria imageSearchCriteria) {
    this.imageSearchCriteria = imageSearchCriteria;
    return this;
  }

   /**
   * Gets or sets the image search criteria.
   * @return imageSearchCriteria
  **/
  @ApiModelProperty(value = "Gets or sets the image search criteria.")
  public ImageSearchCriteria getImageSearchCriteria() {
    return imageSearchCriteria;
  }

  public void setImageSearchCriteria(ImageSearchCriteria imageSearchCriteria) {
    this.imageSearchCriteria = imageSearchCriteria;
  }

  public SearchCriteriaOptions sizeSearchCriteria(SizeSearchCriteria sizeSearchCriteria) {
    this.sizeSearchCriteria = sizeSearchCriteria;
    return this;
  }

   /**
   * Gets or sets the size search criteria.
   * @return sizeSearchCriteria
  **/
  @ApiModelProperty(value = "Gets or sets the size search criteria.")
  public SizeSearchCriteria getSizeSearchCriteria() {
    return sizeSearchCriteria;
  }

  public void setSizeSearchCriteria(SizeSearchCriteria sizeSearchCriteria) {
    this.sizeSearchCriteria = sizeSearchCriteria;
  }

  public SearchCriteriaOptions rotateAngleSearchCriteria(RotateAngleSearchCriteria rotateAngleSearchCriteria) {
    this.rotateAngleSearchCriteria = rotateAngleSearchCriteria;
    return this;
  }

   /**
   * Gets or sets the rotate angle search criteria.
   * @return rotateAngleSearchCriteria
  **/
  @ApiModelProperty(value = "Gets or sets the rotate angle search criteria.")
  public RotateAngleSearchCriteria getRotateAngleSearchCriteria() {
    return rotateAngleSearchCriteria;
  }

  public void setRotateAngleSearchCriteria(RotateAngleSearchCriteria rotateAngleSearchCriteria) {
    this.rotateAngleSearchCriteria = rotateAngleSearchCriteria;
  }

  public SearchCriteriaOptions textFormattingSearchCriteria(TextFormattingSearchCriteria textFormattingSearchCriteria) {
    this.textFormattingSearchCriteria = textFormattingSearchCriteria;
    return this;
  }

   /**
   * Gets or sets the text formatting search criteria.
   * @return textFormattingSearchCriteria
  **/
  @ApiModelProperty(value = "Gets or sets the text formatting search criteria.")
  public TextFormattingSearchCriteria getTextFormattingSearchCriteria() {
    return textFormattingSearchCriteria;
  }

  public void setTextFormattingSearchCriteria(TextFormattingSearchCriteria textFormattingSearchCriteria) {
    this.textFormattingSearchCriteria = textFormattingSearchCriteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCriteriaOptions searchCriteriaOptions = (SearchCriteriaOptions) o;
    return Objects.equals(this.textSearchCriteria, searchCriteriaOptions.textSearchCriteria) &&
        Objects.equals(this.imageSearchCriteria, searchCriteriaOptions.imageSearchCriteria) &&
        Objects.equals(this.sizeSearchCriteria, searchCriteriaOptions.sizeSearchCriteria) &&
        Objects.equals(this.rotateAngleSearchCriteria, searchCriteriaOptions.rotateAngleSearchCriteria) &&
        Objects.equals(this.textFormattingSearchCriteria, searchCriteriaOptions.textFormattingSearchCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textSearchCriteria, imageSearchCriteria, sizeSearchCriteria, rotateAngleSearchCriteria, textFormattingSearchCriteria);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCriteriaOptions {\n");
    
    sb.append("    textSearchCriteria: ").append(toIndentedString(textSearchCriteria)).append("\n");
    sb.append("    imageSearchCriteria: ").append(toIndentedString(imageSearchCriteria)).append("\n");
    sb.append("    sizeSearchCriteria: ").append(toIndentedString(sizeSearchCriteria)).append("\n");
    sb.append("    rotateAngleSearchCriteria: ").append(toIndentedString(rotateAngleSearchCriteria)).append("\n");
    sb.append("    textFormattingSearchCriteria: ").append(toIndentedString(textFormattingSearchCriteria)).append("\n");
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

