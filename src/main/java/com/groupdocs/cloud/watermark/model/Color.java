/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Color.java">
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
 * Class representing a color.
 */
@ApiModel(description = "Class representing a color.")
public class Color {
  @SerializedName("A")
  private Integer A = null;

  @SerializedName("R")
  private Integer R = null;

  @SerializedName("G")
  private Integer G = null;

  @SerializedName("B")
  private Integer B = null;

  @SerializedName("ARGB")
  private Integer ARGB = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("isEmpty")
  private Boolean isEmpty = null;

  public Color A(Integer A) {
    this.A = A;
    return this;
  }

   /**
   * Gets or sets the alpha component value of the color.
   * @return A
  **/
  @ApiModelProperty(value = "Gets or sets the alpha component value of the color.")
  public Integer getA() {
    return A;
  }

  public void setA(Integer A) {
    this.A = A;
  }

  public Color R(Integer R) {
    this.R = R;
    return this;
  }

   /**
   * Gets or sets the red component value of the color.
   * @return R
  **/
  @ApiModelProperty(value = "Gets or sets the red component value of the color.")
  public Integer getR() {
    return R;
  }

  public void setR(Integer R) {
    this.R = R;
  }

  public Color G(Integer G) {
    this.G = G;
    return this;
  }

   /**
   * Gets or sets the green component value of the color.
   * @return G
  **/
  @ApiModelProperty(value = "Gets or sets the green component value of the color.")
  public Integer getG() {
    return G;
  }

  public void setG(Integer G) {
    this.G = G;
  }

  public Color B(Integer B) {
    this.B = B;
    return this;
  }

   /**
   * Gets or sets the blue component value of the color.
   * @return B
  **/
  @ApiModelProperty(value = "Gets or sets the blue component value of the color.")
  public Integer getB() {
    return B;
  }

  public void setB(Integer B) {
    this.B = B;
  }

  public Color ARGB(Integer ARGB) {
    this.ARGB = ARGB;
    return this;
  }

   /**
   * Gets or sets the 32-bit ARGB value.
   * @return ARGB
  **/
  @ApiModelProperty(value = "Gets or sets the 32-bit ARGB value.")
  public Integer getARGB() {
    return ARGB;
  }

  public void setARGB(Integer ARGB) {
    this.ARGB = ARGB;
  }

  public Color name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Gets or sets a system-defined color.
   * @return name
  **/
  @ApiModelProperty(value = "Gets or sets a system-defined color.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Color isEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
    return this;
  }

   /**
   * Gets or sets a value indicating whether Color is uninitialized.
   * @return isEmpty
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether Color is uninitialized.")
  public Boolean getIsEmpty() {
    return isEmpty;
  }

  public void setIsEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Color color = (Color) o;
    return Objects.equals(this.A, color.A) &&
        Objects.equals(this.R, color.R) &&
        Objects.equals(this.G, color.G) &&
        Objects.equals(this.B, color.B) &&
        Objects.equals(this.ARGB, color.ARGB) &&
        Objects.equals(this.name, color.name) &&
        Objects.equals(this.isEmpty, color.isEmpty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(A, R, G, B, ARGB, name, isEmpty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Color {\n");
    
    sb.append("    A: ").append(toIndentedString(A)).append("\n");
    sb.append("    R: ").append(toIndentedString(R)).append("\n");
    sb.append("    G: ").append(toIndentedString(G)).append("\n");
    sb.append("    B: ").append(toIndentedString(B)).append("\n");
    sb.append("    ARGB: ").append(toIndentedString(ARGB)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isEmpty: ").append(toIndentedString(isEmpty)).append("\n");
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

