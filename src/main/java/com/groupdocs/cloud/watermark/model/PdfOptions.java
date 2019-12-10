/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfOptions.java">
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
 * Class for watermark options of pdf document.
 */
@ApiModel(description = "Class for watermark options of pdf document.")
public class PdfOptions {
  @SerializedName("printOnlyAnnotationWatermarks")
  private Boolean printOnlyAnnotationWatermarks = null;

  @SerializedName("rasterize")
  private Boolean rasterize = null;

  @SerializedName("rasterizeImageFormat")
  private String rasterizeImageFormat = null;

  @SerializedName("pages")
  private List<Integer> pages = null;

  public PdfOptions printOnlyAnnotationWatermarks(Boolean printOnlyAnnotationWatermarks) {
    this.printOnlyAnnotationWatermarks = printOnlyAnnotationWatermarks;
    return this;
  }

   /**
   * Gets or sets a value indicating whether annotation watermarks should be added and should be visible only while printing.
   * @return printOnlyAnnotationWatermarks
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether annotation watermarks should be added and should be visible only while printing.")
  public Boolean getPrintOnlyAnnotationWatermarks() {
    return printOnlyAnnotationWatermarks;
  }

  public void setPrintOnlyAnnotationWatermarks(Boolean printOnlyAnnotationWatermarks) {
    this.printOnlyAnnotationWatermarks = printOnlyAnnotationWatermarks;
  }

  public PdfOptions rasterize(Boolean rasterize) {
    this.rasterize = rasterize;
    return this;
  }

   /**
   * Gets or sets a value indicating whether document should be rasterized.
   * @return rasterize
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether document should be rasterized.")
  public Boolean getRasterize() {
    return rasterize;
  }

  public void setRasterize(Boolean rasterize) {
    this.rasterize = rasterize;
  }

  public PdfOptions rasterizeImageFormat(String rasterizeImageFormat) {
    this.rasterizeImageFormat = rasterizeImageFormat;
    return this;
  }

   /**
   * Gets or sets the PDF image conversion format.
   * @return rasterizeImageFormat
  **/
  @ApiModelProperty(value = "Gets or sets the PDF image conversion format.")
  public String getRasterizeImageFormat() {
    return rasterizeImageFormat;
  }

  public void setRasterizeImageFormat(String rasterizeImageFormat) {
    this.rasterizeImageFormat = rasterizeImageFormat;
  }

  public PdfOptions pages(List<Integer> pages) {
    this.pages = pages;
    return this;
  }

  public PdfOptions addPagesItem(Integer pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<Integer>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Gets or sets the pages.
   * @return pages
  **/
  @ApiModelProperty(value = "Gets or sets the pages.")
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
    PdfOptions pdfOptions = (PdfOptions) o;
    return Objects.equals(this.printOnlyAnnotationWatermarks, pdfOptions.printOnlyAnnotationWatermarks) &&
        Objects.equals(this.rasterize, pdfOptions.rasterize) &&
        Objects.equals(this.rasterizeImageFormat, pdfOptions.rasterizeImageFormat) &&
        Objects.equals(this.pages, pdfOptions.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(printOnlyAnnotationWatermarks, rasterize, rasterizeImageFormat, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfOptions {\n");
    
    sb.append("    printOnlyAnnotationWatermarks: ").append(toIndentedString(printOnlyAnnotationWatermarks)).append("\n");
    sb.append("    rasterize: ").append(toIndentedString(rasterize)).append("\n");
    sb.append("    rasterizeImageFormat: ").append(toIndentedString(rasterizeImageFormat)).append("\n");
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

