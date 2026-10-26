/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImageInpaintingOptions.java">
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
import com.groupdocs.cloud.watermark.model.Polygon;
import com.groupdocs.cloud.watermark.model.Rectangle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Options for removing a watermark from a raster image by inpainting the specified regions (filling them using surrounding pixels).
 */
@ApiModel(description = "Options for removing a watermark from a raster image by inpainting the specified regions (filling them using surrounding pixels).")
public class ImageInpaintingOptions {
  @SerializedName("rectangles")
  private List<Rectangle> rectangles = null;

  @SerializedName("polygons")
  private List<Polygon> polygons = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("patchSize")
  private Integer patchSize = null;

  public ImageInpaintingOptions rectangles(List<Rectangle> rectangles) {
    this.rectangles = rectangles;
    return this;
  }

  public ImageInpaintingOptions addRectanglesItem(Rectangle rectanglesItem) {
    if (this.rectangles == null) {
      this.rectangles = new ArrayList<Rectangle>();
    }
    this.rectangles.add(rectanglesItem);
    return this;
  }

   /**
   * Gets or sets the rectangular regions to inpaint, in image pixels. Either Rectangles or Polygons must be specified, but not both.
   * @return rectangles
  **/
  @ApiModelProperty(value = "Gets or sets the rectangular regions to inpaint, in image pixels. Either Rectangles or Polygons must be specified, but not both.")
  public List<Rectangle> getRectangles() {
    return rectangles;
  }

  public void setRectangles(List<Rectangle> rectangles) {
    this.rectangles = rectangles;
  }

  public ImageInpaintingOptions polygons(List<Polygon> polygons) {
    this.polygons = polygons;
    return this;
  }

  public ImageInpaintingOptions addPolygonsItem(Polygon polygonsItem) {
    if (this.polygons == null) {
      this.polygons = new ArrayList<Polygon>();
    }
    this.polygons.add(polygonsItem);
    return this;
  }

   /**
   * Gets or sets the polygonal regions to inpaint, in image pixels. Either Rectangles or Polygons must be specified, but not both.
   * @return polygons
  **/
  @ApiModelProperty(value = "Gets or sets the polygonal regions to inpaint, in image pixels. Either Rectangles or Polygons must be specified, but not both.")
  public List<Polygon> getPolygons() {
    return polygons;
  }

  public void setPolygons(List<Polygon> polygons) {
    this.polygons = polygons;
  }

  public ImageInpaintingOptions method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Gets or sets the inpainting algorithm: PatchBased or Telea. Default is PatchBased.
   * @return method
  **/
  @ApiModelProperty(value = "Gets or sets the inpainting algorithm: PatchBased or Telea. Default is PatchBased.")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public ImageInpaintingOptions patchSize(Integer patchSize) {
    this.patchSize = patchSize;
    return this;
  }

   /**
   * Gets or sets the patch size used by the algorithm. Must be an odd number from 5 to 11. Default is 7.
   * @return patchSize
  **/
  @ApiModelProperty(value = "Gets or sets the patch size used by the algorithm. Must be an odd number from 5 to 11. Default is 7.")
  public Integer getPatchSize() {
    return patchSize;
  }

  public void setPatchSize(Integer patchSize) {
    this.patchSize = patchSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageInpaintingOptions imageInpaintingOptions = (ImageInpaintingOptions) o;
    return Objects.equals(this.rectangles, imageInpaintingOptions.rectangles) &&
        Objects.equals(this.polygons, imageInpaintingOptions.polygons) &&
        Objects.equals(this.method, imageInpaintingOptions.method) &&
        Objects.equals(this.patchSize, imageInpaintingOptions.patchSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rectangles, polygons, method, patchSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageInpaintingOptions {\n");
    
    sb.append("    rectangles: ").append(toIndentedString(rectangles)).append("\n");
    sb.append("    polygons: ").append(toIndentedString(polygons)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    patchSize: ").append(toIndentedString(patchSize)).append("\n");
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

