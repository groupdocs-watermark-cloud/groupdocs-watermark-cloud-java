/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DiagramOptions.java">
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
 * Class for watermark options of diagram document.
 */
@ApiModel(description = "Class for watermark options of diagram document.")
public class DiagramOptions {
  @SerializedName("pages")
  private List<Integer> pages = null;

  @SerializedName("placementType")
  private String placementType = null;

  @SerializedName("lockWatermarks")
  private Boolean lockWatermarks = null;

  public DiagramOptions pages(List<Integer> pages) {
    this.pages = pages;
    return this;
  }

  public DiagramOptions addPagesItem(Integer pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<Integer>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Gets or sets the pages to add watermark to.
   * @return pages
  **/
  @ApiModelProperty(value = "Gets or sets the pages to add watermark to.")
  public List<Integer> getPages() {
    return pages;
  }

  public void setPages(List<Integer> pages) {
    this.pages = pages;
  }

  public DiagramOptions placementType(String placementType) {
    this.placementType = placementType;
    return this;
  }

   /**
   * Gets or sets a value specifying to what pages a watermark should be added.
   * @return placementType
  **/
  @ApiModelProperty(value = "Gets or sets a value specifying to what pages a watermark should be added.")
  public String getPlacementType() {
    return placementType;
  }

  public void setPlacementType(String placementType) {
    this.placementType = placementType;
  }

  public DiagramOptions lockWatermarks(Boolean lockWatermarks) {
    this.lockWatermarks = lockWatermarks;
    return this;
  }

   /**
   * Gets or sets a value indicating whether an editing of the shape in Visio is forbidden.
   * @return lockWatermarks
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether an editing of the shape in Visio is forbidden.")
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
    DiagramOptions diagramOptions = (DiagramOptions) o;
    return Objects.equals(this.pages, diagramOptions.pages) &&
        Objects.equals(this.placementType, diagramOptions.placementType) &&
        Objects.equals(this.lockWatermarks, diagramOptions.lockWatermarks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pages, placementType, lockWatermarks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagramOptions {\n");
    
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    placementType: ").append(toIndentedString(placementType)).append("\n");
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

