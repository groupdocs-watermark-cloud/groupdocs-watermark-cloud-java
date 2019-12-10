/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ReplaceTextOptions.java">
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
 * Class for replace text options.
 */
@ApiModel(description = "Class for replace text options.")
public class ReplaceTextOptions {
  @SerializedName("text")
  private String text = null;

  @SerializedName("fontFamily")
  private String fontFamily = null;

  @SerializedName("size")
  private Double size = null;

  @SerializedName("style")
  private String style = null;

  @SerializedName("foregroundColor")
  private Color foregroundColor = null;

  @SerializedName("backgroundColor")
  private Color backgroundColor = null;

  public ReplaceTextOptions text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Gets or sets the text.
   * @return text
  **/
  @ApiModelProperty(value = "Gets or sets the text.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ReplaceTextOptions fontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

   /**
   * Gets or sets the font family.
   * @return fontFamily
  **/
  @ApiModelProperty(value = "Gets or sets the font family.")
  public String getFontFamily() {
    return fontFamily;
  }

  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }

  public ReplaceTextOptions size(Double size) {
    this.size = size;
    return this;
  }

   /**
   * Gets or sets the size.
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the size.")
  public Double getSize() {
    return size;
  }

  public void setSize(Double size) {
    this.size = size;
  }

  public ReplaceTextOptions style(String style) {
    this.style = style;
    return this;
  }

   /**
   * Gets or sets the style.
   * @return style
  **/
  @ApiModelProperty(value = "Gets or sets the style.")
  public String getStyle() {
    return style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  public ReplaceTextOptions foregroundColor(Color foregroundColor) {
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

  public ReplaceTextOptions backgroundColor(Color backgroundColor) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReplaceTextOptions replaceTextOptions = (ReplaceTextOptions) o;
    return Objects.equals(this.text, replaceTextOptions.text) &&
        Objects.equals(this.fontFamily, replaceTextOptions.fontFamily) &&
        Objects.equals(this.size, replaceTextOptions.size) &&
        Objects.equals(this.style, replaceTextOptions.style) &&
        Objects.equals(this.foregroundColor, replaceTextOptions.foregroundColor) &&
        Objects.equals(this.backgroundColor, replaceTextOptions.backgroundColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, fontFamily, size, style, foregroundColor, backgroundColor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReplaceTextOptions {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    foregroundColor: ").append(toIndentedString(foregroundColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
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

