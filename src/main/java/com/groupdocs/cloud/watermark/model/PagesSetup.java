/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PagesSetup.java">
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
import java.util.ArrayList;
import java.util.List;

/**
 * Pages (slides, worksheets, frames) the watermark should be added to. Works for all document types. When set, it takes precedence over the page lists of the document-specific options.
 */
@ApiModel(description = "Pages (slides, worksheets, frames) the watermark should be added to. Works for all document types. When set, it takes precedence over the page lists of the document-specific options.")
public class PagesSetup {
  @SerializedName("allPages")
  private Boolean allPages = null;

  @SerializedName("firstPage")
  private Boolean firstPage = null;

  @SerializedName("lastPage")
  private Boolean lastPage = null;

  @SerializedName("oddPages")
  private Boolean oddPages = null;

  @SerializedName("evenPages")
  private Boolean evenPages = null;

  @SerializedName("pages")
  private List<Integer> pages = null;

  public PagesSetup allPages(Boolean allPages) {
    this.allPages = allPages;
    return this;
  }

   /**
   * Gets or sets a value indicating whether to include all pages.
   * @return allPages
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether to include all pages.")
  public Boolean getAllPages() {
    return allPages;
  }

  public void setAllPages(Boolean allPages) {
    this.allPages = allPages;
  }

  public PagesSetup firstPage(Boolean firstPage) {
    this.firstPage = firstPage;
    return this;
  }

   /**
   * Gets or sets a value indicating whether to include the first page.
   * @return firstPage
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether to include the first page.")
  public Boolean getFirstPage() {
    return firstPage;
  }

  public void setFirstPage(Boolean firstPage) {
    this.firstPage = firstPage;
  }

  public PagesSetup lastPage(Boolean lastPage) {
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Gets or sets a value indicating whether to include the last page.
   * @return lastPage
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether to include the last page.")
  public Boolean getLastPage() {
    return lastPage;
  }

  public void setLastPage(Boolean lastPage) {
    this.lastPage = lastPage;
  }

  public PagesSetup oddPages(Boolean oddPages) {
    this.oddPages = oddPages;
    return this;
  }

   /**
   * Gets or sets a value indicating whether to include odd pages.
   * @return oddPages
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether to include odd pages.")
  public Boolean getOddPages() {
    return oddPages;
  }

  public void setOddPages(Boolean oddPages) {
    this.oddPages = oddPages;
  }

  public PagesSetup evenPages(Boolean evenPages) {
    this.evenPages = evenPages;
    return this;
  }

   /**
   * Gets or sets a value indicating whether to include even pages.
   * @return evenPages
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether to include even pages.")
  public Boolean getEvenPages() {
    return evenPages;
  }

  public void setEvenPages(Boolean evenPages) {
    this.evenPages = evenPages;
  }

  public PagesSetup pages(List<Integer> pages) {
    this.pages = pages;
    return this;
  }

  public PagesSetup addPagesItem(Integer pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<Integer>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Gets or sets the specific page numbers to include, starting from 1.
   * @return pages
  **/
  @ApiModelProperty(value = "Gets or sets the specific page numbers to include, starting from 1.")
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
    PagesSetup pagesSetup = (PagesSetup) o;
    return Objects.equals(this.allPages, pagesSetup.allPages) &&
        Objects.equals(this.firstPage, pagesSetup.firstPage) &&
        Objects.equals(this.lastPage, pagesSetup.lastPage) &&
        Objects.equals(this.oddPages, pagesSetup.oddPages) &&
        Objects.equals(this.evenPages, pagesSetup.evenPages) &&
        Objects.equals(this.pages, pagesSetup.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allPages, firstPage, lastPage, oddPages, evenPages, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagesSetup {\n");
    
    sb.append("    allPages: ").append(toIndentedString(allPages)).append("\n");
    sb.append("    firstPage: ").append(toIndentedString(firstPage)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    oddPages: ").append(toIndentedString(oddPages)).append("\n");
    sb.append("    evenPages: ").append(toIndentedString(evenPages)).append("\n");
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

