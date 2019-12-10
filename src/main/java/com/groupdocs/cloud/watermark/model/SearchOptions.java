/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="SearchOptions.java">
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
import com.groupdocs.cloud.watermark.model.ObjectsToSearch;
import com.groupdocs.cloud.watermark.model.RotateAngleSearchCriteria;
import com.groupdocs.cloud.watermark.model.SearchCriteriaOptions;
import com.groupdocs.cloud.watermark.model.SizeSearchCriteria;
import com.groupdocs.cloud.watermark.model.TextFormattingSearchCriteria;
import com.groupdocs.cloud.watermark.model.TextSearchCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Class for search watermark options.
 */
@ApiModel(description = "Class for search watermark options.")
public class SearchOptions extends SearchCriteriaOptions {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  @SerializedName("outputFolder")
  private String outputFolder = null;

  @SerializedName("saveFoundImages")
  private Boolean saveFoundImages = null;

  @SerializedName("objectsToSearch")
  private ObjectsToSearch objectsToSearch = null;

  public SearchOptions fileInfo(FileInfo fileInfo) {
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

  public SearchOptions outputFolder(String outputFolder) {
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

  public SearchOptions saveFoundImages(Boolean saveFoundImages) {
    this.saveFoundImages = saveFoundImages;
    return this;
  }

   /**
   * Gets or sets a value indicating whether found images should be saved.
   * @return saveFoundImages
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether found images should be saved.")
  public Boolean getSaveFoundImages() {
    return saveFoundImages;
  }

  public void setSaveFoundImages(Boolean saveFoundImages) {
    this.saveFoundImages = saveFoundImages;
  }

  public SearchOptions objectsToSearch(ObjectsToSearch objectsToSearch) {
    this.objectsToSearch = objectsToSearch;
    return this;
  }

   /**
   * Gets or sets the objects to search.
   * @return objectsToSearch
  **/
  @ApiModelProperty(value = "Gets or sets the objects to search.")
  public ObjectsToSearch getObjectsToSearch() {
    return objectsToSearch;
  }

  public void setObjectsToSearch(ObjectsToSearch objectsToSearch) {
    this.objectsToSearch = objectsToSearch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchOptions searchOptions = (SearchOptions) o;
    return Objects.equals(this.fileInfo, searchOptions.fileInfo) &&
        Objects.equals(this.outputFolder, searchOptions.outputFolder) &&
        Objects.equals(this.saveFoundImages, searchOptions.saveFoundImages) &&
        Objects.equals(this.objectsToSearch, searchOptions.objectsToSearch) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, outputFolder, saveFoundImages, objectsToSearch, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    outputFolder: ").append(toIndentedString(outputFolder)).append("\n");
    sb.append("    saveFoundImages: ").append(toIndentedString(saveFoundImages)).append("\n");
    sb.append("    objectsToSearch: ").append(toIndentedString(objectsToSearch)).append("\n");
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

