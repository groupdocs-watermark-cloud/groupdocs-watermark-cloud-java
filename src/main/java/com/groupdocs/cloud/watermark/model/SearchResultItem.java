/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SearchResultItem.java">
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

/**
 * Search result item.
 */
@ApiModel(description = "Search result item.")
public class SearchResultItem {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("imageUrl")
  private String imageUrl = null;

  @SerializedName("height")
  private Double height = null;

  @SerializedName("rotateAngle")
  private Double rotateAngle = null;

  @SerializedName("unitOfMeasurement")
  private String unitOfMeasurement = null;

  @SerializedName("width")
  private Double width = null;

  @SerializedName("X")
  private Double X = null;

  @SerializedName("Y")
  private Double Y = null;

  @SerializedName("possibleWatermarkType")
  private String possibleWatermarkType = null;

  public SearchResultItem id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Gets or sets the identifier.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the identifier.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SearchResultItem text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Gets or sets the text.
   * @return text
  **/
  @ApiModelProperty(value = "Gets or sets the text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SearchResultItem imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Gets or sets the image URL.
   * @return imageUrl
  **/
  @ApiModelProperty(value = "Gets or sets the image URL.")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public SearchResultItem height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Gets or sets the height.
   * @return height
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the height.")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public SearchResultItem rotateAngle(Double rotateAngle) {
    this.rotateAngle = rotateAngle;
    return this;
  }

   /**
   * Gets or sets the rotate angle.
   * @return rotateAngle
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the rotate angle.")
  public Double getRotateAngle() {
    return rotateAngle;
  }

  public void setRotateAngle(Double rotateAngle) {
    this.rotateAngle = rotateAngle;
  }

  public SearchResultItem unitOfMeasurement(String unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
    return this;
  }

   /**
   * Gets or sets the unit of measurement.
   * @return unitOfMeasurement
  **/
  @ApiModelProperty(value = "Gets or sets the unit of measurement.")
  public String getUnitOfMeasurement() {
    return unitOfMeasurement;
  }

  public void setUnitOfMeasurement(String unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
  }

  public SearchResultItem width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Gets or sets the width.
   * @return width
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the width.")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public SearchResultItem X(Double X) {
    this.X = X;
    return this;
  }

   /**
   * Gets or sets the x coordinate.
   * @return X
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the x coordinate.")
  public Double getX() {
    return X;
  }

  public void setX(Double X) {
    this.X = X;
  }

  public SearchResultItem Y(Double Y) {
    this.Y = Y;
    return this;
  }

   /**
   * Gets or sets the y coordinate.
   * @return Y
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the y coordinate.")
  public Double getY() {
    return Y;
  }

  public void setY(Double Y) {
    this.Y = Y;
  }

  public SearchResultItem possibleWatermarkType(String possibleWatermarkType) {
    this.possibleWatermarkType = possibleWatermarkType;
    return this;
  }

   /**
   * Gets or sets the type of the possible watermark type.
   * @return possibleWatermarkType
  **/
  @ApiModelProperty(value = "Gets or sets the type of the possible watermark type.")
  public String getPossibleWatermarkType() {
    return possibleWatermarkType;
  }

  public void setPossibleWatermarkType(String possibleWatermarkType) {
    this.possibleWatermarkType = possibleWatermarkType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultItem searchResultItem = (SearchResultItem) o;
    return Objects.equals(this.id, searchResultItem.id) &&
        Objects.equals(this.text, searchResultItem.text) &&
        Objects.equals(this.imageUrl, searchResultItem.imageUrl) &&
        Objects.equals(this.height, searchResultItem.height) &&
        Objects.equals(this.rotateAngle, searchResultItem.rotateAngle) &&
        Objects.equals(this.unitOfMeasurement, searchResultItem.unitOfMeasurement) &&
        Objects.equals(this.width, searchResultItem.width) &&
        Objects.equals(this.X, searchResultItem.X) &&
        Objects.equals(this.Y, searchResultItem.Y) &&
        Objects.equals(this.possibleWatermarkType, searchResultItem.possibleWatermarkType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, imageUrl, height, rotateAngle, unitOfMeasurement, width, X, Y, possibleWatermarkType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    rotateAngle: ").append(toIndentedString(rotateAngle)).append("\n");
    sb.append("    unitOfMeasurement: ").append(toIndentedString(unitOfMeasurement)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    possibleWatermarkType: ").append(toIndentedString(possibleWatermarkType)).append("\n");
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

