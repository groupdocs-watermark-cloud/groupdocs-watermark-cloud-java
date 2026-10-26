/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="TileOptions.java">
 *   Copyright (c) Aspose Pty Ltd
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
import com.groupdocs.cloud.watermark.model.MeasureValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Options for repeating the watermark across the whole page (tile mode).
 */
@ApiModel(description = "Options for repeating the watermark across the whole page (tile mode).")
public class TileOptions {
  @SerializedName("tileType")
  private String tileType = null;

  @SerializedName("lineSpacing")
  private MeasureValue lineSpacing = null;

  @SerializedName("watermarkSpacing")
  private MeasureValue watermarkSpacing = null;

  @SerializedName("rotateAroundOrigin")
  private Boolean rotateAroundOrigin = null;

  public TileOptions tileType(String tileType) {
    this.tileType = tileType;
    return this;
  }

   /**
   * Gets or sets the tile template: Straight, Offset, OneThirdOffset or BasketWeave. Default is Straight.
   * @return tileType
  **/
  @ApiModelProperty(value = "Gets or sets the tile template: Straight, Offset, OneThirdOffset or BasketWeave. Default is Straight.")
  public String getTileType() {
    return tileType;
  }

  public void setTileType(String tileType) {
    this.tileType = tileType;
  }

  public TileOptions lineSpacing(MeasureValue lineSpacing) {
    this.lineSpacing = lineSpacing;
    return this;
  }

   /**
   * Gets or sets the spacing between lines of watermarks.
   * @return lineSpacing
  **/
  @ApiModelProperty(value = "Gets or sets the spacing between lines of watermarks.")
  public MeasureValue getLineSpacing() {
    return lineSpacing;
  }

  public void setLineSpacing(MeasureValue lineSpacing) {
    this.lineSpacing = lineSpacing;
  }

  public TileOptions watermarkSpacing(MeasureValue watermarkSpacing) {
    this.watermarkSpacing = watermarkSpacing;
    return this;
  }

   /**
   * Gets or sets the spacing between watermarks in a line.
   * @return watermarkSpacing
  **/
  @ApiModelProperty(value = "Gets or sets the spacing between watermarks in a line.")
  public MeasureValue getWatermarkSpacing() {
    return watermarkSpacing;
  }

  public void setWatermarkSpacing(MeasureValue watermarkSpacing) {
    this.watermarkSpacing = watermarkSpacing;
  }

  public TileOptions rotateAroundOrigin(Boolean rotateAroundOrigin) {
    this.rotateAroundOrigin = rotateAroundOrigin;
    return this;
  }

   /**
   * Gets or sets a value indicating whether the repeated watermarks should be rotated around the center of the document.
   * @return rotateAroundOrigin
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether the repeated watermarks should be rotated around the center of the document.")
  public Boolean getRotateAroundOrigin() {
    return rotateAroundOrigin;
  }

  public void setRotateAroundOrigin(Boolean rotateAroundOrigin) {
    this.rotateAroundOrigin = rotateAroundOrigin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TileOptions tileOptions = (TileOptions) o;
    return Objects.equals(this.tileType, tileOptions.tileType) &&
        Objects.equals(this.lineSpacing, tileOptions.lineSpacing) &&
        Objects.equals(this.watermarkSpacing, tileOptions.watermarkSpacing) &&
        Objects.equals(this.rotateAroundOrigin, tileOptions.rotateAroundOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tileType, lineSpacing, watermarkSpacing, rotateAroundOrigin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TileOptions {\n");
    
    sb.append("    tileType: ").append(toIndentedString(tileType)).append("\n");
    sb.append("    lineSpacing: ").append(toIndentedString(lineSpacing)).append("\n");
    sb.append("    watermarkSpacing: ").append(toIndentedString(watermarkSpacing)).append("\n");
    sb.append("    rotateAroundOrigin: ").append(toIndentedString(rotateAroundOrigin)).append("\n");
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

