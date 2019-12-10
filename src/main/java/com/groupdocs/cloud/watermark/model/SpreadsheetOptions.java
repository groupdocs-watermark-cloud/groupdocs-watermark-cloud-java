/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SpreadsheetOptions.java">
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
import java.util.ArrayList;
import java.util.List;

/**
 * Class for watermark options of spreadsheet document.
 */
@ApiModel(description = "Class for watermark options of spreadsheet document.")
public class SpreadsheetOptions {
  @SerializedName("worksheets")
  private List<Integer> worksheets = null;

  @SerializedName("lockWatermarks")
  private Boolean lockWatermarks = null;

  public SpreadsheetOptions worksheets(List<Integer> worksheets) {
    this.worksheets = worksheets;
    return this;
  }

  public SpreadsheetOptions addWorksheetsItem(Integer worksheetsItem) {
    if (this.worksheets == null) {
      this.worksheets = new ArrayList<Integer>();
    }
    this.worksheets.add(worksheetsItem);
    return this;
  }

   /**
   * Gets or sets the worksheets to add watermark to.
   * @return worksheets
  **/
  @ApiModelProperty(value = "Gets or sets the worksheets to add watermark to.")
  public List<Integer> getWorksheets() {
    return worksheets;
  }

  public void setWorksheets(List<Integer> worksheets) {
    this.worksheets = worksheets;
  }

  public SpreadsheetOptions lockWatermarks(Boolean lockWatermarks) {
    this.lockWatermarks = lockWatermarks;
    return this;
  }

   /**
   * Gets or sets a value indicating whether watermarks should be locked.
   * @return lockWatermarks
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether watermarks should be locked.")
  public Boolean getLockWatermarks() {
    return lockWatermarks;
  }

  public void setLockWatermarks(Boolean lockWatermarks) {
    this.lockWatermarks = lockWatermarks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpreadsheetOptions spreadsheetOptions = (SpreadsheetOptions) o;
    return Objects.equals(this.worksheets, spreadsheetOptions.worksheets) &&
        Objects.equals(this.lockWatermarks, spreadsheetOptions.lockWatermarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worksheets, lockWatermarks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpreadsheetOptions {\n");
    
    sb.append("    worksheets: ").append(toIndentedString(worksheets)).append("\n");
    sb.append("    lockWatermarks: ").append(toIndentedString(lockWatermarks)).append("\n");
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

