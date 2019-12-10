/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Margin.java">
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
 * Class for margin options.
 */
@ApiModel(description = "Class for margin options.")
public class Margin {
  @SerializedName("marginType")
  private String marginType = null;

  @SerializedName("right")
  private Double right = null;

  @SerializedName("left")
  private Double left = null;

  @SerializedName("top")
  private Double top = null;

  @SerializedName("bottom")
  private Double bottom = null;

  public Margin marginType(String marginType) {
    this.marginType = marginType;
    return this;
  }

   /**
   * Gets or sets the type of the margin.
   * @return marginType
  **/
  @ApiModelProperty(value = "Gets or sets the type of the margin.")
  public String getMarginType() {
    return marginType;
  }

  public void setMarginType(String marginType) {
    this.marginType = marginType;
  }

  public Margin right(Double right) {
    this.right = right;
    return this;
  }

   /**
   * Gets or sets the right margin.
   * @return right
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the right margin.")
  public Double getRight() {
    return right;
  }

  public void setRight(Double right) {
    this.right = right;
  }

  public Margin left(Double left) {
    this.left = left;
    return this;
  }

   /**
   * Gets or sets the left margin.
   * @return left
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the left margin.")
  public Double getLeft() {
    return left;
  }

  public void setLeft(Double left) {
    this.left = left;
  }

  public Margin top(Double top) {
    this.top = top;
    return this;
  }

   /**
   * Gets or sets the top margin.
   * @return top
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the top margin.")
  public Double getTop() {
    return top;
  }

  public void setTop(Double top) {
    this.top = top;
  }

  public Margin bottom(Double bottom) {
    this.bottom = bottom;
    return this;
  }

   /**
   * Gets or sets the bottom margin.
   * @return bottom
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the bottom margin.")
  public Double getBottom() {
    return bottom;
  }

  public void setBottom(Double bottom) {
    this.bottom = bottom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Margin margin = (Margin) o;
    return Objects.equals(this.marginType, margin.marginType) &&
        Objects.equals(this.right, margin.right) &&
        Objects.equals(this.left, margin.left) &&
        Objects.equals(this.top, margin.top) &&
        Objects.equals(this.bottom, margin.bottom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marginType, right, left, top, bottom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Margin {\n");
    
    sb.append("    marginType: ").append(toIndentedString(marginType)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
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

