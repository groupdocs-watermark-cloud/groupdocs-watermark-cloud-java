/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ReplaceOptions.java">
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
import com.groupdocs.cloud.watermark.model.ReplaceImageOptions;
import com.groupdocs.cloud.watermark.model.ReplaceTextOptions;
import com.groupdocs.cloud.watermark.model.RotateAngleSearchCriteria;
import com.groupdocs.cloud.watermark.model.SearchCriteriaOptions;
import com.groupdocs.cloud.watermark.model.SizeSearchCriteria;
import com.groupdocs.cloud.watermark.model.TextFormattingSearchCriteria;
import com.groupdocs.cloud.watermark.model.TextSearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Replace watermark options.
 */
@ApiModel(description = "Replace watermark options.")
public class ReplaceOptions extends SearchCriteriaOptions {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  @SerializedName("outputFolder")
  private String outputFolder = null;

  @SerializedName("replaceTextOptions")
  private ReplaceTextOptions replaceTextOptions = null;

  @SerializedName("replaceImageOptions")
  private ReplaceImageOptions replaceImageOptions = null;

  public ReplaceOptions fileInfo(FileInfo fileInfo) {
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

  public ReplaceOptions outputFolder(String outputFolder) {
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

  public ReplaceOptions replaceTextOptions(ReplaceTextOptions replaceTextOptions) {
    this.replaceTextOptions = replaceTextOptions;
    return this;
  }

   /**
   * Gets or sets the replace text options.
   * @return replaceTextOptions
  **/
  @ApiModelProperty(value = "Gets or sets the replace text options.")
  public ReplaceTextOptions getReplaceTextOptions() {
    return replaceTextOptions;
  }

  public void setReplaceTextOptions(ReplaceTextOptions replaceTextOptions) {
    this.replaceTextOptions = replaceTextOptions;
  }

  public ReplaceOptions replaceImageOptions(ReplaceImageOptions replaceImageOptions) {
    this.replaceImageOptions = replaceImageOptions;
    return this;
  }

   /**
   * Gets or sets the replace image options.
   * @return replaceImageOptions
  **/
  @ApiModelProperty(value = "Gets or sets the replace image options.")
  public ReplaceImageOptions getReplaceImageOptions() {
    return replaceImageOptions;
  }

  public void setReplaceImageOptions(ReplaceImageOptions replaceImageOptions) {
    this.replaceImageOptions = replaceImageOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceOptions replaceOptions = (ReplaceOptions) o;
    return Objects.equals(this.fileInfo, replaceOptions.fileInfo) &&
        Objects.equals(this.outputFolder, replaceOptions.outputFolder) &&
        Objects.equals(this.replaceTextOptions, replaceOptions.replaceTextOptions) &&
        Objects.equals(this.replaceImageOptions, replaceOptions.replaceImageOptions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, outputFolder, replaceTextOptions, replaceImageOptions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    outputFolder: ").append(toIndentedString(outputFolder)).append("\n");
    sb.append("    replaceTextOptions: ").append(toIndentedString(replaceTextOptions)).append("\n");
    sb.append("    replaceImageOptions: ").append(toIndentedString(replaceImageOptions)).append("\n");
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

