/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="RemoveOptions.java">
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
import com.groupdocs.cloud.watermark.model.FileInfo;
import com.groupdocs.cloud.watermark.model.ImageSearchCriteria;
import com.groupdocs.cloud.watermark.model.RotateAngleSearchCriteria;
import com.groupdocs.cloud.watermark.model.SearchCriteriaOptions;
import com.groupdocs.cloud.watermark.model.SizeSearchCriteria;
import com.groupdocs.cloud.watermark.model.TextFormattingSearchCriteria;
import com.groupdocs.cloud.watermark.model.TextSearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Remove watermark options.
 */
@ApiModel(description = "Remove watermark options.")
public class RemoveOptions extends SearchCriteriaOptions {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  @SerializedName("outputFolder")
  private String outputFolder = null;

  @SerializedName("removeIds")
  private List<Integer> removeIds = null;

  public RemoveOptions fileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

   /**
   * Gets or sets the file information.
   * @return fileInfo
  **/
  @ApiModelProperty(value = "Gets or sets the file information.")
  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
  }

  public RemoveOptions outputFolder(String outputFolder) {
    this.outputFolder = outputFolder;
    return this;
  }

   /**
   * Gets or sets the output folder.
   * @return outputFolder
  **/
  @ApiModelProperty(value = "Gets or sets the output folder.")
  public String getOutputFolder() {
    return outputFolder;
  }

  public void setOutputFolder(String outputFolder) {
    this.outputFolder = outputFolder;
  }

  public RemoveOptions removeIds(List<Integer> removeIds) {
    this.removeIds = removeIds;
    return this;
  }

  public RemoveOptions addRemoveIdsItem(Integer removeIdsItem) {
    if (this.removeIds == null) {
      this.removeIds = new ArrayList<Integer>();
    }
    this.removeIds.add(removeIdsItem);
    return this;
  }

   /**
   * Gets or sets the remove ids.
   * @return removeIds
  **/
  @ApiModelProperty(value = "Gets or sets the remove ids.")
  public List<Integer> getRemoveIds() {
    return removeIds;
  }

  public void setRemoveIds(List<Integer> removeIds) {
    this.removeIds = removeIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveOptions removeOptions = (RemoveOptions) o;
    return Objects.equals(this.fileInfo, removeOptions.fileInfo) &&
        Objects.equals(this.outputFolder, removeOptions.outputFolder) &&
        Objects.equals(this.removeIds, removeOptions.removeIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, outputFolder, removeIds, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    outputFolder: ").append(toIndentedString(outputFolder)).append("\n");
    sb.append("    removeIds: ").append(toIndentedString(removeIds)).append("\n");
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

