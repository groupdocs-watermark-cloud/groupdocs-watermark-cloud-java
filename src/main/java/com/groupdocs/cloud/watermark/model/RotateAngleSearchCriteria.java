/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="RotateAngleSearchCriteria.java">
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
 * Class for rotate angle search criteria options.
 */
@ApiModel(description = "Class for rotate angle search criteria options.")
public class RotateAngleSearchCriteria {
  @SerializedName("maximumAngle")
  private Double maximumAngle = null;

  @SerializedName("minimumAngle")
  private Double minimumAngle = null;

  public RotateAngleSearchCriteria maximumAngle(Double maximumAngle) {
    this.maximumAngle = maximumAngle;
    return this;
  }

   /**
   * Gets or sets the maximum angle.
   * @return maximumAngle
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the maximum angle.")
  public Double getMaximumAngle() {
    return maximumAngle;
  }

  public void setMaximumAngle(Double maximumAngle) {
    this.maximumAngle = maximumAngle;
  }

  public RotateAngleSearchCriteria minimumAngle(Double minimumAngle) {
    this.minimumAngle = minimumAngle;
    return this;
  }

   /**
   * Gets or sets the minimum angle.
   * @return minimumAngle
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the minimum angle.")
  public Double getMinimumAngle() {
    return minimumAngle;
  }

  public void setMinimumAngle(Double minimumAngle) {
    this.minimumAngle = minimumAngle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RotateAngleSearchCriteria rotateAngleSearchCriteria = (RotateAngleSearchCriteria) o;
    return Objects.equals(this.maximumAngle, rotateAngleSearchCriteria.maximumAngle) &&
        Objects.equals(this.minimumAngle, rotateAngleSearchCriteria.minimumAngle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maximumAngle, minimumAngle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RotateAngleSearchCriteria {\n");
    
    sb.append("    maximumAngle: ").append(toIndentedString(maximumAngle)).append("\n");
    sb.append("    minimumAngle: ").append(toIndentedString(minimumAngle)).append("\n");
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

