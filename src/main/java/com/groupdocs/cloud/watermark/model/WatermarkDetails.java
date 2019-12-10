/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WatermarkDetails.java">
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
import com.groupdocs.cloud.watermark.model.ImageWatermarkOptions;
import com.groupdocs.cloud.watermark.model.Position;
import com.groupdocs.cloud.watermark.model.TextWatermarkOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Watermark details.
 */
@ApiModel(description = "Watermark details.")
public class WatermarkDetails {
  @SerializedName("textWatermarkOptions")
  private TextWatermarkOptions textWatermarkOptions = null;

  @SerializedName("imageWatermarkOptions")
  private ImageWatermarkOptions imageWatermarkOptions = null;

  @SerializedName("position")
  private Position position = null;

  @SerializedName("opacity")
  private Double opacity = null;

  public WatermarkDetails textWatermarkOptions(TextWatermarkOptions textWatermarkOptions) {
    this.textWatermarkOptions = textWatermarkOptions;
    return this;
  }

   /**
   * Gets or sets the text watermark options.
   * @return textWatermarkOptions
  **/
  @ApiModelProperty(value = "Gets or sets the text watermark options.")
  public TextWatermarkOptions getTextWatermarkOptions() {
    return textWatermarkOptions;
  }

  public void setTextWatermarkOptions(TextWatermarkOptions textWatermarkOptions) {
    this.textWatermarkOptions = textWatermarkOptions;
  }

  public WatermarkDetails imageWatermarkOptions(ImageWatermarkOptions imageWatermarkOptions) {
    this.imageWatermarkOptions = imageWatermarkOptions;
    return this;
  }

   /**
   * Gets or sets the image watermark options.
   * @return imageWatermarkOptions
  **/
  @ApiModelProperty(value = "Gets or sets the image watermark options.")
  public ImageWatermarkOptions getImageWatermarkOptions() {
    return imageWatermarkOptions;
  }

  public void setImageWatermarkOptions(ImageWatermarkOptions imageWatermarkOptions) {
    this.imageWatermarkOptions = imageWatermarkOptions;
  }

  public WatermarkDetails position(Position position) {
    this.position = position;
    return this;
  }

   /**
   * Gets or sets the position.
   * @return position
  **/
  @ApiModelProperty(value = "Gets or sets the position.")
  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public WatermarkDetails opacity(Double opacity) {
    this.opacity = opacity;
    return this;
  }

   /**
   * Gets or sets the watermark opacity.
   * @return opacity
  **/
  @ApiModelProperty(value = "Gets or sets the watermark opacity.")
  public Double getOpacity() {
    return opacity;
  }

  public void setOpacity(Double opacity) {
    this.opacity = opacity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatermarkDetails watermarkDetails = (WatermarkDetails) o;
    return Objects.equals(this.textWatermarkOptions, watermarkDetails.textWatermarkOptions) &&
        Objects.equals(this.imageWatermarkOptions, watermarkDetails.imageWatermarkOptions) &&
        Objects.equals(this.position, watermarkDetails.position) &&
        Objects.equals(this.opacity, watermarkDetails.opacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textWatermarkOptions, imageWatermarkOptions, position, opacity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatermarkDetails {\n");
    
    sb.append("    textWatermarkOptions: ").append(toIndentedString(textWatermarkOptions)).append("\n");
    sb.append("    imageWatermarkOptions: ").append(toIndentedString(imageWatermarkOptions)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
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

