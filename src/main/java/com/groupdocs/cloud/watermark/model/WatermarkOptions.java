/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="WatermarkOptions.java">
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
import com.groupdocs.cloud.watermark.model.DiagramOptions;
import com.groupdocs.cloud.watermark.model.FileInfo;
import com.groupdocs.cloud.watermark.model.ImageOptions;
import com.groupdocs.cloud.watermark.model.PdfOptions;
import com.groupdocs.cloud.watermark.model.PresentationOptions;
import com.groupdocs.cloud.watermark.model.SpreadsheetOptions;
import com.groupdocs.cloud.watermark.model.WatermarkDetails;
import com.groupdocs.cloud.watermark.model.WordProcessingOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Watermark options
 */
@ApiModel(description = "Watermark options")
public class WatermarkOptions {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  @SerializedName("outputFolder")
  private String outputFolder = null;

  @SerializedName("watermarkDetails")
  private List<WatermarkDetails> watermarkDetails = null;

  /**
   * Gets or sets the protect level.
   */
  @JsonAdapter(ProtectLevelEnum.Adapter.class)
  public enum ProtectLevelEnum {
    DOCUMENT("Document"),
    
    IMAGES("Images"),
    
    DOCUMENTANDIMAGES("DocumentAndImages");

    private String value;

    ProtectLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProtectLevelEnum fromValue(String text) {
      for (ProtectLevelEnum b : ProtectLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProtectLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProtectLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProtectLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProtectLevelEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("protectLevel")
  private ProtectLevelEnum protectLevel = null;

  @SerializedName("pdfOptions")
  private PdfOptions pdfOptions = null;

  @SerializedName("imageOptions")
  private ImageOptions imageOptions = null;

  @SerializedName("presentationOptions")
  private PresentationOptions presentationOptions = null;

  @SerializedName("wordProcessingOptions")
  private WordProcessingOptions wordProcessingOptions = null;

  @SerializedName("spreadsheetOptions")
  private SpreadsheetOptions spreadsheetOptions = null;

  @SerializedName("diagramOptions")
  private DiagramOptions diagramOptions = null;

  public WatermarkOptions fileInfo(FileInfo fileInfo) {
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

  public WatermarkOptions outputFolder(String outputFolder) {
    this.outputFolder = outputFolder;
    return this;
  }

   /**
   * The folder for the resultant file.
   * @return outputFolder
  **/
  @ApiModelProperty(value = "The folder for the resultant file.")
  public String getOutputFolder() {
    return outputFolder;
  }

  public void setOutputFolder(String outputFolder) {
    this.outputFolder = outputFolder;
  }

  public WatermarkOptions watermarkDetails(List<WatermarkDetails> watermarkDetails) {
    this.watermarkDetails = watermarkDetails;
    return this;
  }

  public WatermarkOptions addWatermarkDetailsItem(WatermarkDetails watermarkDetailsItem) {
    if (this.watermarkDetails == null) {
      this.watermarkDetails = new ArrayList<WatermarkDetails>();
    }
    this.watermarkDetails.add(watermarkDetailsItem);
    return this;
  }

   /**
   * Gets or sets the watermark details.
   * @return watermarkDetails
  **/
  @ApiModelProperty(value = "Gets or sets the watermark details.")
  public List<WatermarkDetails> getWatermarkDetails() {
    return watermarkDetails;
  }

  public void setWatermarkDetails(List<WatermarkDetails> watermarkDetails) {
    this.watermarkDetails = watermarkDetails;
  }

  public WatermarkOptions protectLevel(ProtectLevelEnum protectLevel) {
    this.protectLevel = protectLevel;
    return this;
  }

   /**
   * Gets or sets the protect level.
   * @return protectLevel
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the protect level.")
  public ProtectLevelEnum getProtectLevel() {
    return protectLevel;
  }

  public void setProtectLevel(ProtectLevelEnum protectLevel) {
    this.protectLevel = protectLevel;
  }

  public WatermarkOptions pdfOptions(PdfOptions pdfOptions) {
    this.pdfOptions = pdfOptions;
    return this;
  }

   /**
   * Gets or sets the PDF options.
   * @return pdfOptions
  **/
  @ApiModelProperty(value = "Gets or sets the PDF options.")
  public PdfOptions getPdfOptions() {
    return pdfOptions;
  }

  public void setPdfOptions(PdfOptions pdfOptions) {
    this.pdfOptions = pdfOptions;
  }

  public WatermarkOptions imageOptions(ImageOptions imageOptions) {
    this.imageOptions = imageOptions;
    return this;
  }

   /**
   * Gets or sets the image options.
   * @return imageOptions
  **/
  @ApiModelProperty(value = "Gets or sets the image options.")
  public ImageOptions getImageOptions() {
    return imageOptions;
  }

  public void setImageOptions(ImageOptions imageOptions) {
    this.imageOptions = imageOptions;
  }

  public WatermarkOptions presentationOptions(PresentationOptions presentationOptions) {
    this.presentationOptions = presentationOptions;
    return this;
  }

   /**
   * Gets or sets the presentation options.
   * @return presentationOptions
  **/
  @ApiModelProperty(value = "Gets or sets the presentation options.")
  public PresentationOptions getPresentationOptions() {
    return presentationOptions;
  }

  public void setPresentationOptions(PresentationOptions presentationOptions) {
    this.presentationOptions = presentationOptions;
  }

  public WatermarkOptions wordProcessingOptions(WordProcessingOptions wordProcessingOptions) {
    this.wordProcessingOptions = wordProcessingOptions;
    return this;
  }

   /**
   * Gets or sets the word processing options.
   * @return wordProcessingOptions
  **/
  @ApiModelProperty(value = "Gets or sets the word processing options.")
  public WordProcessingOptions getWordProcessingOptions() {
    return wordProcessingOptions;
  }

  public void setWordProcessingOptions(WordProcessingOptions wordProcessingOptions) {
    this.wordProcessingOptions = wordProcessingOptions;
  }

  public WatermarkOptions spreadsheetOptions(SpreadsheetOptions spreadsheetOptions) {
    this.spreadsheetOptions = spreadsheetOptions;
    return this;
  }

   /**
   * Gets or sets the spreadsheet options.
   * @return spreadsheetOptions
  **/
  @ApiModelProperty(value = "Gets or sets the spreadsheet options.")
  public SpreadsheetOptions getSpreadsheetOptions() {
    return spreadsheetOptions;
  }

  public void setSpreadsheetOptions(SpreadsheetOptions spreadsheetOptions) {
    this.spreadsheetOptions = spreadsheetOptions;
  }

  public WatermarkOptions diagramOptions(DiagramOptions diagramOptions) {
    this.diagramOptions = diagramOptions;
    return this;
  }

   /**
   * Gets or sets the diagram options.
   * @return diagramOptions
  **/
  @ApiModelProperty(value = "Gets or sets the diagram options.")
  public DiagramOptions getDiagramOptions() {
    return diagramOptions;
  }

  public void setDiagramOptions(DiagramOptions diagramOptions) {
    this.diagramOptions = diagramOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatermarkOptions watermarkOptions = (WatermarkOptions) o;
    return Objects.equals(this.fileInfo, watermarkOptions.fileInfo) &&
        Objects.equals(this.outputFolder, watermarkOptions.outputFolder) &&
        Objects.equals(this.watermarkDetails, watermarkOptions.watermarkDetails) &&
        Objects.equals(this.protectLevel, watermarkOptions.protectLevel) &&
        Objects.equals(this.pdfOptions, watermarkOptions.pdfOptions) &&
        Objects.equals(this.imageOptions, watermarkOptions.imageOptions) &&
        Objects.equals(this.presentationOptions, watermarkOptions.presentationOptions) &&
        Objects.equals(this.wordProcessingOptions, watermarkOptions.wordProcessingOptions) &&
        Objects.equals(this.spreadsheetOptions, watermarkOptions.spreadsheetOptions) &&
        Objects.equals(this.diagramOptions, watermarkOptions.diagramOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, outputFolder, watermarkDetails, protectLevel, pdfOptions, imageOptions, presentationOptions, wordProcessingOptions, spreadsheetOptions, diagramOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatermarkOptions {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    outputFolder: ").append(toIndentedString(outputFolder)).append("\n");
    sb.append("    watermarkDetails: ").append(toIndentedString(watermarkDetails)).append("\n");
    sb.append("    protectLevel: ").append(toIndentedString(protectLevel)).append("\n");
    sb.append("    pdfOptions: ").append(toIndentedString(pdfOptions)).append("\n");
    sb.append("    imageOptions: ").append(toIndentedString(imageOptions)).append("\n");
    sb.append("    presentationOptions: ").append(toIndentedString(presentationOptions)).append("\n");
    sb.append("    wordProcessingOptions: ").append(toIndentedString(wordProcessingOptions)).append("\n");
    sb.append("    spreadsheetOptions: ").append(toIndentedString(spreadsheetOptions)).append("\n");
    sb.append("    diagramOptions: ").append(toIndentedString(diagramOptions)).append("\n");
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

