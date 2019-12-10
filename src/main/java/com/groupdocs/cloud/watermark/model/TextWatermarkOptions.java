/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="TextWatermarkOptions.java">
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
import com.groupdocs.cloud.watermark.model.Color;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Class for text watermark options.
 */
@ApiModel(description = "Class for text watermark options.")
public class TextWatermarkOptions {
  @SerializedName("text")
  private String text = null;

  @SerializedName("fontFamilyName")
  private String fontFamilyName = null;

  @SerializedName("fontSize")
  private Double fontSize = null;

  @SerializedName("fontStyle")
  private String fontStyle = null;

  @SerializedName("foregroundColor")
  private Color foregroundColor = null;

  @SerializedName("backgroundColor")
  private Color backgroundColor = null;

  @SerializedName("textAlignment")
  private String textAlignment = null;

  public TextWatermarkOptions text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Gets or sets the watermark text.
   * @return text
  **/
  @ApiModelProperty(value = "Gets or sets the watermark text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public TextWatermarkOptions fontFamilyName(String fontFamilyName) {
    this.fontFamilyName = fontFamilyName;
    return this;
  }

   /**
   * Gets or sets the font.
   * @return fontFamilyName
  **/
  @ApiModelProperty(value = "Gets or sets the font.")
  public String getFontFamilyName() {
    return fontFamilyName;
  }

  public void setFontFamilyName(String fontFamilyName) {
    this.fontFamilyName = fontFamilyName;
  }

  public TextWatermarkOptions fontSize(Double fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Gets or sets the size of the font.
   * @return fontSize
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the size of the font.")
  public Double getFontSize() {
    return fontSize;
  }

  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  public TextWatermarkOptions fontStyle(String fontStyle) {
    this.fontStyle = fontStyle;
    return this;
  }

   /**
   * Gets or sets the font style.
   * @return fontStyle
  **/
  @ApiModelProperty(value = "Gets or sets the font style.")
  public String getFontStyle() {
    return fontStyle;
  }

  public void setFontStyle(String fontStyle) {
    this.fontStyle = fontStyle;
  }

  public TextWatermarkOptions foregroundColor(Color foregroundColor) {
    this.foregroundColor = foregroundColor;
    return this;
  }

   /**
   * Gets or sets the color of the foreground.
   * @return foregroundColor
  **/
  @ApiModelProperty(value = "Gets or sets the color of the foreground.")
  public Color getForegroundColor() {
    return foregroundColor;
  }

  public void setForegroundColor(Color foregroundColor) {
    this.foregroundColor = foregroundColor;
  }

  public TextWatermarkOptions backgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Gets or sets the color of the background.
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "Gets or sets the color of the background.")
  public Color getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public TextWatermarkOptions textAlignment(String textAlignment) {
    this.textAlignment = textAlignment;
    return this;
  }

   /**
   * Gets or sets the text alignment.
   * @return textAlignment
  **/
  @ApiModelProperty(value = "Gets or sets the text alignment.")
  public String getTextAlignment() {
    return textAlignment;
  }

  public void setTextAlignment(String textAlignment) {
    this.textAlignment = textAlignment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextWatermarkOptions textWatermarkOptions = (TextWatermarkOptions) o;
    return Objects.equals(this.text, textWatermarkOptions.text) &&
        Objects.equals(this.fontFamilyName, textWatermarkOptions.fontFamilyName) &&
        Objects.equals(this.fontSize, textWatermarkOptions.fontSize) &&
        Objects.equals(this.fontStyle, textWatermarkOptions.fontStyle) &&
        Objects.equals(this.foregroundColor, textWatermarkOptions.foregroundColor) &&
        Objects.equals(this.backgroundColor, textWatermarkOptions.backgroundColor) &&
        Objects.equals(this.textAlignment, textWatermarkOptions.textAlignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, fontFamilyName, fontSize, fontStyle, foregroundColor, backgroundColor, textAlignment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextWatermarkOptions {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fontFamilyName: ").append(toIndentedString(fontFamilyName)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontStyle: ").append(toIndentedString(fontStyle)).append("\n");
    sb.append("    foregroundColor: ").append(toIndentedString(foregroundColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    textAlignment: ").append(toIndentedString(textAlignment)).append("\n");
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

