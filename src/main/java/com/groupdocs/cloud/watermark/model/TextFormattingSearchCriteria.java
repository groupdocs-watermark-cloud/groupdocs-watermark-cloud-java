/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="TextFormattingSearchCriteria.java">
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
import com.groupdocs.cloud.watermark.model.ColorRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Class for text formatting search criteria options.
 */
@ApiModel(description = "Class for text formatting search criteria options.")
public class TextFormattingSearchCriteria {
  @SerializedName("foregroundColorRange")
  private ColorRange foregroundColorRange = null;

  @SerializedName("backgroundColorRange")
  private ColorRange backgroundColorRange = null;

  @SerializedName("fontName")
  private String fontName = null;

  @SerializedName("minFontSize")
  private Double minFontSize = null;

  @SerializedName("maxFontSize")
  private Double maxFontSize = null;

  @SerializedName("fontBold")
  private Boolean fontBold = null;

  @SerializedName("fontUnderline")
  private Boolean fontUnderline = null;

  @SerializedName("fontStrikeout")
  private Boolean fontStrikeout = null;

  @SerializedName("fontItalic")
  private Boolean fontItalic = null;

  public TextFormattingSearchCriteria foregroundColorRange(ColorRange foregroundColorRange) {
    this.foregroundColorRange = foregroundColorRange;
    return this;
  }

   /**
   * Gets or sets the foreground color range.
   * @return foregroundColorRange
  **/
  @ApiModelProperty(value = "Gets or sets the foreground color range.")
  public ColorRange getForegroundColorRange() {
    return foregroundColorRange;
  }

  public void setForegroundColorRange(ColorRange foregroundColorRange) {
    this.foregroundColorRange = foregroundColorRange;
  }

  public TextFormattingSearchCriteria backgroundColorRange(ColorRange backgroundColorRange) {
    this.backgroundColorRange = backgroundColorRange;
    return this;
  }

   /**
   * Gets or sets the background color range.
   * @return backgroundColorRange
  **/
  @ApiModelProperty(value = "Gets or sets the background color range.")
  public ColorRange getBackgroundColorRange() {
    return backgroundColorRange;
  }

  public void setBackgroundColorRange(ColorRange backgroundColorRange) {
    this.backgroundColorRange = backgroundColorRange;
  }

  public TextFormattingSearchCriteria fontName(String fontName) {
    this.fontName = fontName;
    return this;
  }

   /**
   * Gets or sets the name of the font.
   * @return fontName
  **/
  @ApiModelProperty(value = "Gets or sets the name of the font.")
  public String getFontName() {
    return fontName;
  }

  public void setFontName(String fontName) {
    this.fontName = fontName;
  }

  public TextFormattingSearchCriteria minFontSize(Double minFontSize) {
    this.minFontSize = minFontSize;
    return this;
  }

   /**
   * Gets or sets the minimum size of the font.
   * @return minFontSize
  **/
  @ApiModelProperty(value = "Gets or sets the minimum size of the font.")
  public Double getMinFontSize() {
    return minFontSize;
  }

  public void setMinFontSize(Double minFontSize) {
    this.minFontSize = minFontSize;
  }

  public TextFormattingSearchCriteria maxFontSize(Double maxFontSize) {
    this.maxFontSize = maxFontSize;
    return this;
  }

   /**
   * Gets or sets the maximum size of the font.
   * @return maxFontSize
  **/
  @ApiModelProperty(value = "Gets or sets the maximum size of the font.")
  public Double getMaxFontSize() {
    return maxFontSize;
  }

  public void setMaxFontSize(Double maxFontSize) {
    this.maxFontSize = maxFontSize;
  }

  public TextFormattingSearchCriteria fontBold(Boolean fontBold) {
    this.fontBold = fontBold;
    return this;
  }

   /**
   * Gets or sets the font bold style.
   * @return fontBold
  **/
  @ApiModelProperty(value = "Gets or sets the font bold style.")
  public Boolean getFontBold() {
    return fontBold;
  }

  public void setFontBold(Boolean fontBold) {
    this.fontBold = fontBold;
  }

  public TextFormattingSearchCriteria fontUnderline(Boolean fontUnderline) {
    this.fontUnderline = fontUnderline;
    return this;
  }

   /**
   * Gets or sets the font underline style.
   * @return fontUnderline
  **/
  @ApiModelProperty(value = "Gets or sets the font underline style.")
  public Boolean getFontUnderline() {
    return fontUnderline;
  }

  public void setFontUnderline(Boolean fontUnderline) {
    this.fontUnderline = fontUnderline;
  }

  public TextFormattingSearchCriteria fontStrikeout(Boolean fontStrikeout) {
    this.fontStrikeout = fontStrikeout;
    return this;
  }

   /**
   * Gets or sets the font strikeout style.
   * @return fontStrikeout
  **/
  @ApiModelProperty(value = "Gets or sets the font strikeout style.")
  public Boolean getFontStrikeout() {
    return fontStrikeout;
  }

  public void setFontStrikeout(Boolean fontStrikeout) {
    this.fontStrikeout = fontStrikeout;
  }

  public TextFormattingSearchCriteria fontItalic(Boolean fontItalic) {
    this.fontItalic = fontItalic;
    return this;
  }

   /**
   * Gets or sets the font italic style.
   * @return fontItalic
  **/
  @ApiModelProperty(value = "Gets or sets the font italic style.")
  public Boolean getFontItalic() {
    return fontItalic;
  }

  public void setFontItalic(Boolean fontItalic) {
    this.fontItalic = fontItalic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextFormattingSearchCriteria textFormattingSearchCriteria = (TextFormattingSearchCriteria) o;
    return Objects.equals(this.foregroundColorRange, textFormattingSearchCriteria.foregroundColorRange) &&
        Objects.equals(this.backgroundColorRange, textFormattingSearchCriteria.backgroundColorRange) &&
        Objects.equals(this.fontName, textFormattingSearchCriteria.fontName) &&
        Objects.equals(this.minFontSize, textFormattingSearchCriteria.minFontSize) &&
        Objects.equals(this.maxFontSize, textFormattingSearchCriteria.maxFontSize) &&
        Objects.equals(this.fontBold, textFormattingSearchCriteria.fontBold) &&
        Objects.equals(this.fontUnderline, textFormattingSearchCriteria.fontUnderline) &&
        Objects.equals(this.fontStrikeout, textFormattingSearchCriteria.fontStrikeout) &&
        Objects.equals(this.fontItalic, textFormattingSearchCriteria.fontItalic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foregroundColorRange, backgroundColorRange, fontName, minFontSize, maxFontSize, fontBold, fontUnderline, fontStrikeout, fontItalic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextFormattingSearchCriteria {\n");
    
    sb.append("    foregroundColorRange: ").append(toIndentedString(foregroundColorRange)).append("\n");
    sb.append("    backgroundColorRange: ").append(toIndentedString(backgroundColorRange)).append("\n");
    sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
    sb.append("    minFontSize: ").append(toIndentedString(minFontSize)).append("\n");
    sb.append("    maxFontSize: ").append(toIndentedString(maxFontSize)).append("\n");
    sb.append("    fontBold: ").append(toIndentedString(fontBold)).append("\n");
    sb.append("    fontUnderline: ").append(toIndentedString(fontUnderline)).append("\n");
    sb.append("    fontStrikeout: ").append(toIndentedString(fontStrikeout)).append("\n");
    sb.append("    fontItalic: ").append(toIndentedString(fontItalic)).append("\n");
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

