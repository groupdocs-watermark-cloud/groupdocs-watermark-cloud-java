/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Position.java">
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
import com.groupdocs.cloud.watermark.model.Margin;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Class for watermark position options.
 */
@ApiModel(description = "Class for watermark position options.")
public class Position {
  @SerializedName("X")
  private Double X = null;

  @SerializedName("Y")
  private Double Y = null;

  @SerializedName("width")
  private Double width = null;

  @SerializedName("height")
  private Double height = null;

  @SerializedName("horizontalAlignment")
  private String horizontalAlignment = null;

  @SerializedName("verticalAlignment")
  private String verticalAlignment = null;

  @SerializedName("margins")
  private Margin margins = null;

  @SerializedName("sizingType")
  private String sizingType = null;

  @SerializedName("scaleFactor")
  private Double scaleFactor = null;

  @SerializedName("rotateAngle")
  private Double rotateAngle = null;

  @SerializedName("considerParentMargins")
  private Boolean considerParentMargins = null;

  @SerializedName("isBackground")
  private Boolean isBackground = null;

  public Position X(Double X) {
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

  public Position Y(Double Y) {
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

  public Position width(Double width) {
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

  public Position height(Double height) {
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

  public Position horizontalAlignment(String horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

   /**
   * Gets or sets the horizontal alignment.
   * @return horizontalAlignment
  **/
  @ApiModelProperty(value = "Gets or sets the horizontal alignment.")
  public String getHorizontalAlignment() {
    return horizontalAlignment;
  }

  public void setHorizontalAlignment(String horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
  }

  public Position verticalAlignment(String verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

   /**
   * Gets or sets the vertical alignment.
   * @return verticalAlignment
  **/
  @ApiModelProperty(value = "Gets or sets the vertical alignment.")
  public String getVerticalAlignment() {
    return verticalAlignment;
  }

  public void setVerticalAlignment(String verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }

  public Position margins(Margin margins) {
    this.margins = margins;
    return this;
  }

   /**
   * Gets or sets the margins.
   * @return margins
  **/
  @ApiModelProperty(value = "Gets or sets the margins.")
  public Margin getMargins() {
    return margins;
  }

  public void setMargins(Margin margins) {
    this.margins = margins;
  }

  public Position sizingType(String sizingType) {
    this.sizingType = sizingType;
    return this;
  }

   /**
   * Gets or sets the type of the sizing.
   * @return sizingType
  **/
  @ApiModelProperty(value = "Gets or sets the type of the sizing.")
  public String getSizingType() {
    return sizingType;
  }

  public void setSizingType(String sizingType) {
    this.sizingType = sizingType;
  }

  public Position scaleFactor(Double scaleFactor) {
    this.scaleFactor = scaleFactor;
    return this;
  }

   /**
   * Gets or sets the scale factor.
   * @return scaleFactor
  **/
  @ApiModelProperty(value = "Gets or sets the scale factor.")
  public Double getScaleFactor() {
    return scaleFactor;
  }

  public void setScaleFactor(Double scaleFactor) {
    this.scaleFactor = scaleFactor;
  }

  public Position rotateAngle(Double rotateAngle) {
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

  public Position considerParentMargins(Boolean considerParentMargins) {
    this.considerParentMargins = considerParentMargins;
    return this;
  }

   /**
   * Gets or sets a value indicating whether parent margins should be considered.
   * @return considerParentMargins
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether parent margins should be considered.")
  public Boolean getConsiderParentMargins() {
    return considerParentMargins;
  }

  public void setConsiderParentMargins(Boolean considerParentMargins) {
    this.considerParentMargins = considerParentMargins;
  }

  public Position isBackground(Boolean isBackground) {
    this.isBackground = isBackground;
    return this;
  }

   /**
   * Gets or sets a value indicating whether watermark is background.
   * @return isBackground
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether watermark is background.")
  public Boolean getIsBackground() {
    return isBackground;
  }

  public void setIsBackground(Boolean isBackground) {
    this.isBackground = isBackground;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Position position = (Position) o;
    return Objects.equals(this.X, position.X) &&
        Objects.equals(this.Y, position.Y) &&
        Objects.equals(this.width, position.width) &&
        Objects.equals(this.height, position.height) &&
        Objects.equals(this.horizontalAlignment, position.horizontalAlignment) &&
        Objects.equals(this.verticalAlignment, position.verticalAlignment) &&
        Objects.equals(this.margins, position.margins) &&
        Objects.equals(this.sizingType, position.sizingType) &&
        Objects.equals(this.scaleFactor, position.scaleFactor) &&
        Objects.equals(this.rotateAngle, position.rotateAngle) &&
        Objects.equals(this.considerParentMargins, position.considerParentMargins) &&
        Objects.equals(this.isBackground, position.isBackground);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X, Y, width, height, horizontalAlignment, verticalAlignment, margins, sizingType, scaleFactor, rotateAngle, considerParentMargins, isBackground);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    horizontalAlignment: ").append(toIndentedString(horizontalAlignment)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    margins: ").append(toIndentedString(margins)).append("\n");
    sb.append("    sizingType: ").append(toIndentedString(sizingType)).append("\n");
    sb.append("    scaleFactor: ").append(toIndentedString(scaleFactor)).append("\n");
    sb.append("    rotateAngle: ").append(toIndentedString(rotateAngle)).append("\n");
    sb.append("    considerParentMargins: ").append(toIndentedString(considerParentMargins)).append("\n");
    sb.append("    isBackground: ").append(toIndentedString(isBackground)).append("\n");
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

