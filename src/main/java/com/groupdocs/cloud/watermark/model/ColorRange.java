/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ColorRange.java">
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
import com.groupdocs.cloud.watermark.model.Color;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Represents a range of colors. Specifies ranges using HSB representation of RGB color.
 */
@ApiModel(description = "Represents a range of colors. Specifies ranges using HSB representation of RGB color.")
public class ColorRange {
  @SerializedName("color")
  private Color color = null;

  @SerializedName("isEmpty")
  private Boolean isEmpty = null;

  @SerializedName("maxBrightness")
  private Double maxBrightness = null;

  @SerializedName("maxHue")
  private Double maxHue = null;

  @SerializedName("maxSaturation")
  private Double maxSaturation = null;

  @SerializedName("minBrightness")
  private Double minBrightness = null;

  @SerializedName("minHue")
  private Double minHue = null;

  @SerializedName("minSaturation")
  private Double minSaturation = null;

  public ColorRange color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * The exact color from which the range is created.
   * @return color
  **/
  @ApiModelProperty(value = "The exact color from which the range is created.")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public ColorRange isEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
    return this;
  }

   /**
   * Gets or sets a value indicating whether only the empty color is in range.
   * @return isEmpty
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether only the empty color is in range.")
  public Boolean getIsEmpty() {
    return isEmpty;
  }

  public void setIsEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
  }

  public ColorRange maxBrightness(Double maxBrightness) {
    this.maxBrightness = maxBrightness;
    return this;
  }

   /**
   * Gets or sets the ending brightness value.
   * @return maxBrightness
  **/
  @ApiModelProperty(value = "Gets or sets the ending brightness value.")
  public Double getMaxBrightness() {
    return maxBrightness;
  }

  public void setMaxBrightness(Double maxBrightness) {
    this.maxBrightness = maxBrightness;
  }

  public ColorRange maxHue(Double maxHue) {
    this.maxHue = maxHue;
    return this;
  }

   /**
   * Gets or sets the ending hue value, in degrees.
   * @return maxHue
  **/
  @ApiModelProperty(value = "Gets or sets the ending hue value, in degrees.")
  public Double getMaxHue() {
    return maxHue;
  }

  public void setMaxHue(Double maxHue) {
    this.maxHue = maxHue;
  }

  public ColorRange maxSaturation(Double maxSaturation) {
    this.maxSaturation = maxSaturation;
    return this;
  }

   /**
   * Gets or sets the ending saturation value.
   * @return maxSaturation
  **/
  @ApiModelProperty(value = "Gets or sets the ending saturation value.")
  public Double getMaxSaturation() {
    return maxSaturation;
  }

  public void setMaxSaturation(Double maxSaturation) {
    this.maxSaturation = maxSaturation;
  }

  public ColorRange minBrightness(Double minBrightness) {
    this.minBrightness = minBrightness;
    return this;
  }

   /**
   * Gets or sets the starting brightness value.
   * @return minBrightness
  **/
  @ApiModelProperty(value = "Gets or sets the starting brightness value.")
  public Double getMinBrightness() {
    return minBrightness;
  }

  public void setMinBrightness(Double minBrightness) {
    this.minBrightness = minBrightness;
  }

  public ColorRange minHue(Double minHue) {
    this.minHue = minHue;
    return this;
  }

   /**
   * Gets or sets the starting hue value, in degrees.
   * @return minHue
  **/
  @ApiModelProperty(value = "Gets or sets the starting hue value, in degrees.")
  public Double getMinHue() {
    return minHue;
  }

  public void setMinHue(Double minHue) {
    this.minHue = minHue;
  }

  public ColorRange minSaturation(Double minSaturation) {
    this.minSaturation = minSaturation;
    return this;
  }

   /**
   * Gets or sets the starting saturation value.
   * @return minSaturation
  **/
  @ApiModelProperty(value = "Gets or sets the starting saturation value.")
  public Double getMinSaturation() {
    return minSaturation;
  }

  public void setMinSaturation(Double minSaturation) {
    this.minSaturation = minSaturation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColorRange colorRange = (ColorRange) o;
    return Objects.equals(this.color, colorRange.color) &&
        Objects.equals(this.isEmpty, colorRange.isEmpty) &&
        Objects.equals(this.maxBrightness, colorRange.maxBrightness) &&
        Objects.equals(this.maxHue, colorRange.maxHue) &&
        Objects.equals(this.maxSaturation, colorRange.maxSaturation) &&
        Objects.equals(this.minBrightness, colorRange.minBrightness) &&
        Objects.equals(this.minHue, colorRange.minHue) &&
        Objects.equals(this.minSaturation, colorRange.minSaturation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, isEmpty, maxBrightness, maxHue, maxSaturation, minBrightness, minHue, minSaturation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColorRange {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    isEmpty: ").append(toIndentedString(isEmpty)).append("\n");
    sb.append("    maxBrightness: ").append(toIndentedString(maxBrightness)).append("\n");
    sb.append("    maxHue: ").append(toIndentedString(maxHue)).append("\n");
    sb.append("    maxSaturation: ").append(toIndentedString(maxSaturation)).append("\n");
    sb.append("    minBrightness: ").append(toIndentedString(minBrightness)).append("\n");
    sb.append("    minHue: ").append(toIndentedString(minHue)).append("\n");
    sb.append("    minSaturation: ").append(toIndentedString(minSaturation)).append("\n");
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

