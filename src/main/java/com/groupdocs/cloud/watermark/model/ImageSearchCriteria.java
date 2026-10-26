/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImageSearchCriteria.java">
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
import com.groupdocs.cloud.watermark.model.FileInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for image search criteria options.
 */
@ApiModel(description = "Class for image search criteria options.")
public class ImageSearchCriteria {
  @SerializedName("imageFileInfo")
  private FileInfo imageFileInfo = null;

  @SerializedName("pages")
  private List<Integer> pages = null;

  public ImageSearchCriteria imageFileInfo(FileInfo imageFileInfo) {
    this.imageFileInfo = imageFileInfo;
    return this;
  }

   /**
   * Gets or sets the image file information.
   * @return imageFileInfo
  **/
  @ApiModelProperty(value = "Gets or sets the image file information.")
  public FileInfo getImageFileInfo() {
    return imageFileInfo;
  }

  public void setImageFileInfo(FileInfo imageFileInfo) {
    this.imageFileInfo = imageFileInfo;
  }

  public ImageSearchCriteria pages(List<Integer> pages) {
    this.pages = pages;
    return this;
  }

  public ImageSearchCriteria addPagesItem(Integer pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<Integer>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Gets or sets the page numbers to search on, starting from 1. When empty, all pages are searched.
   * @return pages
  **/
  @ApiModelProperty(value = "Gets or sets the page numbers to search on, starting from 1. When empty, all pages are searched.")
  public List<Integer> getPages() {
    return pages;
  }

  public void setPages(List<Integer> pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSearchCriteria imageSearchCriteria = (ImageSearchCriteria) o;
    return Objects.equals(this.imageFileInfo, imageSearchCriteria.imageFileInfo) &&
        Objects.equals(this.pages, imageSearchCriteria.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageFileInfo, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSearchCriteria {\n");
    
    sb.append("    imageFileInfo: ").append(toIndentedString(imageFileInfo)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

