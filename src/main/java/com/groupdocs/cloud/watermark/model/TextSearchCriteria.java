/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="TextSearchCriteria.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for text search criteria options.
 */
@ApiModel(description = "Class for text search criteria options.")
public class TextSearchCriteria {
  @SerializedName("searchText")
  private String searchText = null;

  @SerializedName("matchCase")
  private Boolean matchCase = null;

  @SerializedName("useRegularExpression")
  private Boolean useRegularExpression = null;

  @SerializedName("skipUnreadableCharacters")
  private Boolean skipUnreadableCharacters = null;

  @SerializedName("pages")
  private List<Integer> pages = null;

  public TextSearchCriteria searchText(String searchText) {
    this.searchText = searchText;
    return this;
  }

   /**
   * Gets or sets the search text.
   * @return searchText
  **/
  @ApiModelProperty(value = "Gets or sets the search text.")
  public String getSearchText() {
    return searchText;
  }

  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

  public TextSearchCriteria matchCase(Boolean matchCase) {
    this.matchCase = matchCase;
    return this;
  }

   /**
   * Gets or sets a value indicating whether the search is case-sensitive. Default is true.
   * @return matchCase
  **/
  @ApiModelProperty(value = "Gets or sets a value indicating whether the search is case-sensitive. Default is true.")
  public Boolean getMatchCase() {
    return matchCase;
  }

  public void setMatchCase(Boolean matchCase) {
    this.matchCase = matchCase;
  }

  public TextSearchCriteria useRegularExpression(Boolean useRegularExpression) {
    this.useRegularExpression = useRegularExpression;
    return this;
  }

   /**
   * Gets or sets a value indicating whether SearchText is a .NET regular expression. Default is false.
   * @return useRegularExpression
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether SearchText is a .NET regular expression. Default is false.")
  public Boolean getUseRegularExpression() {
    return useRegularExpression;
  }

  public void setUseRegularExpression(Boolean useRegularExpression) {
    this.useRegularExpression = useRegularExpression;
  }

  public TextSearchCriteria skipUnreadableCharacters(Boolean skipUnreadableCharacters) {
    this.skipUnreadableCharacters = skipUnreadableCharacters;
    return this;
  }

   /**
   * Gets or sets a value indicating whether unreadable characters are skipped when comparing text. Default is false.
   * @return skipUnreadableCharacters
  **/
  @ApiModelProperty(required = true, value = "Gets or sets a value indicating whether unreadable characters are skipped when comparing text. Default is false.")
  public Boolean getSkipUnreadableCharacters() {
    return skipUnreadableCharacters;
  }

  public void setSkipUnreadableCharacters(Boolean skipUnreadableCharacters) {
    this.skipUnreadableCharacters = skipUnreadableCharacters;
  }

  public TextSearchCriteria pages(List<Integer> pages) {
    this.pages = pages;
    return this;
  }

  public TextSearchCriteria addPagesItem(Integer pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<Integer>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Gets or sets the page numbers to search on, starting from 1. When empty, all pages are searched.
   * @return pages
  **/
  @ApiModelProperty(value = "Gets or sets the page numbers to search on, starting from 1. When empty, all pages are searched.")
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
    TextSearchCriteria textSearchCriteria = (TextSearchCriteria) o;
    return Objects.equals(this.searchText, textSearchCriteria.searchText) &&
        Objects.equals(this.matchCase, textSearchCriteria.matchCase) &&
        Objects.equals(this.useRegularExpression, textSearchCriteria.useRegularExpression) &&
        Objects.equals(this.skipUnreadableCharacters, textSearchCriteria.skipUnreadableCharacters) &&
        Objects.equals(this.pages, textSearchCriteria.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchText, matchCase, useRegularExpression, skipUnreadableCharacters, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextSearchCriteria {\n");
    
    sb.append("    searchText: ").append(toIndentedString(searchText)).append("\n");
    sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
    sb.append("    useRegularExpression: ").append(toIndentedString(useRegularExpression)).append("\n");
    sb.append("    skipUnreadableCharacters: ").append(toIndentedString(skipUnreadableCharacters)).append("\n");
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

