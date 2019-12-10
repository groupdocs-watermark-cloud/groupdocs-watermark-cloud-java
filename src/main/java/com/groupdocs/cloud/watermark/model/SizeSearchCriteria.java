/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SizeSearchCriteria.java">
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
 * Class for size search criteria options.
 */
@ApiModel(description = "Class for size search criteria options.")
public class SizeSearchCriteria {
  @SerializedName("dimension")
  private String dimension = null;

  @SerializedName("maximum")
  private Double maximum = null;

  @SerializedName("minimum")
  private Double minimum = null;

  public SizeSearchCriteria dimension(String dimension) {
    this.dimension = dimension;
    return this;
  }

   /**
   * Gets or sets the dimension.
   * @return dimension
  **/
  @ApiModelProperty(value = "Gets or sets the dimension.")
  public String getDimension() {
    return dimension;
  }

  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  public SizeSearchCriteria maximum(Double maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * Gets or sets the maximum size.
   * @return maximum
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the maximum size.")
  public Double getMaximum() {
    return maximum;
  }

  public void setMaximum(Double maximum) {
    this.maximum = maximum;
  }

  public SizeSearchCriteria minimum(Double minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * Gets or sets the minimum size.
   * @return minimum
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the minimum size.")
  public Double getMinimum() {
    return minimum;
  }

  public void setMinimum(Double minimum) {
    this.minimum = minimum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SizeSearchCriteria sizeSearchCriteria = (SizeSearchCriteria) o;
    return Objects.equals(this.dimension, sizeSearchCriteria.dimension) &&
        Objects.equals(this.maximum, sizeSearchCriteria.maximum) &&
        Objects.equals(this.minimum, sizeSearchCriteria.minimum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimension, maximum, minimum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SizeSearchCriteria {\n");
    
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
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

