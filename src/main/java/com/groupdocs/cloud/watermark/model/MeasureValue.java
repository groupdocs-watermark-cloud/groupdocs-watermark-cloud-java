/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="MeasureValue.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Measurement value with its unit.
 */
@ApiModel(description = "Measurement value with its unit.")
public class MeasureValue {
  @SerializedName("measureType")
  private String measureType = null;

  @SerializedName("value")
  private Double value = null;

  public MeasureValue measureType(String measureType) {
    this.measureType = measureType;
    return this;
  }

   /**
   * Gets or sets the unit of measurement: Pixel, Percent or Points. Default is Pixel.
   * @return measureType
  **/
  @ApiModelProperty(value = "Gets or sets the unit of measurement: Pixel, Percent or Points. Default is Pixel.")
  public String getMeasureType() {
    return measureType;
  }

  public void setMeasureType(String measureType) {
    this.measureType = measureType;
  }

  public MeasureValue value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Gets or sets the value. Must be greater than 0.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the value. Must be greater than 0.")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeasureValue measureValue = (MeasureValue) o;
    return Objects.equals(this.measureType, measureValue.measureType) &&
        Objects.equals(this.value, measureValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measureType, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeasureValue {\n");
    
    sb.append("    measureType: ").append(toIndentedString(measureType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

