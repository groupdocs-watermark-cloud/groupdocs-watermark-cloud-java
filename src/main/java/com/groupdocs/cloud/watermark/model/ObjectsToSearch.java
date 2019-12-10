/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ObjectsToSearch.java">
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
 * Class for searchable objects options.
 */
@ApiModel(description = "Class for searchable objects options.")
public class ObjectsToSearch {
  @SerializedName("wordProcessingObjects")
  private String wordProcessingObjects = null;

  @SerializedName("spreadsheetObjects")
  private String spreadsheetObjects = null;

  @SerializedName("presentationObjects")
  private String presentationObjects = null;

  @SerializedName("diagramObjects")
  private String diagramObjects = null;

  @SerializedName("pdfObjects")
  private String pdfObjects = null;

  @SerializedName("emailObjects")
  private String emailObjects = null;

  public ObjectsToSearch wordProcessingObjects(String wordProcessingObjects) {
    this.wordProcessingObjects = wordProcessingObjects;
    return this;
  }

   /**
   * Gets or sets the word processing searchable objects.
   * @return wordProcessingObjects
  **/
  @ApiModelProperty(value = "Gets or sets the word processing searchable objects.")
  public String getWordProcessingObjects() {
    return wordProcessingObjects;
  }

  public void setWordProcessingObjects(String wordProcessingObjects) {
    this.wordProcessingObjects = wordProcessingObjects;
  }

  public ObjectsToSearch spreadsheetObjects(String spreadsheetObjects) {
    this.spreadsheetObjects = spreadsheetObjects;
    return this;
  }

   /**
   * Gets or sets the spreadsheet searchable objects.
   * @return spreadsheetObjects
  **/
  @ApiModelProperty(value = "Gets or sets the spreadsheet searchable objects.")
  public String getSpreadsheetObjects() {
    return spreadsheetObjects;
  }

  public void setSpreadsheetObjects(String spreadsheetObjects) {
    this.spreadsheetObjects = spreadsheetObjects;
  }

  public ObjectsToSearch presentationObjects(String presentationObjects) {
    this.presentationObjects = presentationObjects;
    return this;
  }

   /**
   * Gets or sets the presentation searchable objects.
   * @return presentationObjects
  **/
  @ApiModelProperty(value = "Gets or sets the presentation searchable objects.")
  public String getPresentationObjects() {
    return presentationObjects;
  }

  public void setPresentationObjects(String presentationObjects) {
    this.presentationObjects = presentationObjects;
  }

  public ObjectsToSearch diagramObjects(String diagramObjects) {
    this.diagramObjects = diagramObjects;
    return this;
  }

   /**
   * Gets or sets the diagram searchable objects.
   * @return diagramObjects
  **/
  @ApiModelProperty(value = "Gets or sets the diagram searchable objects.")
  public String getDiagramObjects() {
    return diagramObjects;
  }

  public void setDiagramObjects(String diagramObjects) {
    this.diagramObjects = diagramObjects;
  }

  public ObjectsToSearch pdfObjects(String pdfObjects) {
    this.pdfObjects = pdfObjects;
    return this;
  }

   /**
   * Gets or sets the PDF searchable objects.
   * @return pdfObjects
  **/
  @ApiModelProperty(value = "Gets or sets the PDF searchable objects.")
  public String getPdfObjects() {
    return pdfObjects;
  }

  public void setPdfObjects(String pdfObjects) {
    this.pdfObjects = pdfObjects;
  }

  public ObjectsToSearch emailObjects(String emailObjects) {
    this.emailObjects = emailObjects;
    return this;
  }

   /**
   * Gets or sets the email searchable objects.
   * @return emailObjects
  **/
  @ApiModelProperty(value = "Gets or sets the email searchable objects.")
  public String getEmailObjects() {
    return emailObjects;
  }

  public void setEmailObjects(String emailObjects) {
    this.emailObjects = emailObjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectsToSearch objectsToSearch = (ObjectsToSearch) o;
    return Objects.equals(this.wordProcessingObjects, objectsToSearch.wordProcessingObjects) &&
        Objects.equals(this.spreadsheetObjects, objectsToSearch.spreadsheetObjects) &&
        Objects.equals(this.presentationObjects, objectsToSearch.presentationObjects) &&
        Objects.equals(this.diagramObjects, objectsToSearch.diagramObjects) &&
        Objects.equals(this.pdfObjects, objectsToSearch.pdfObjects) &&
        Objects.equals(this.emailObjects, objectsToSearch.emailObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wordProcessingObjects, spreadsheetObjects, presentationObjects, diagramObjects, pdfObjects, emailObjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectsToSearch {\n");
    
    sb.append("    wordProcessingObjects: ").append(toIndentedString(wordProcessingObjects)).append("\n");
    sb.append("    spreadsheetObjects: ").append(toIndentedString(spreadsheetObjects)).append("\n");
    sb.append("    presentationObjects: ").append(toIndentedString(presentationObjects)).append("\n");
    sb.append("    diagramObjects: ").append(toIndentedString(diagramObjects)).append("\n");
    sb.append("    pdfObjects: ").append(toIndentedString(pdfObjects)).append("\n");
    sb.append("    emailObjects: ").append(toIndentedString(emailObjects)).append("\n");
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

