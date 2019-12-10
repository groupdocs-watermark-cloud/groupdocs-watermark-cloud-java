/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
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

package com.groupdocs.cloud.watermark.api;

import static org.junit.Assert.*;

import com.groupdocs.cloud.watermark.client.ApiException;
import com.groupdocs.cloud.watermark.model.requests.*;
import com.groupdocs.cloud.watermark.model.*;

import org.junit.Test;

public class WatermarkSearchApiTests extends BaseApiTest {

    @Test
    public void Search_Watermark() throws ApiException {
        // Arrange
        SearchOptions options = new SearchOptions();
        options.setFileInfo(TestFiles.PdfWithWatermarks.ToFileInfo());
        TextSearchCriteria textSearchCriteria = new TextSearchCriteria();
        textSearchCriteria.setSearchText("Watermark text");
        ImageSearchCriteria imageSearchCriteria = new ImageSearchCriteria();
        imageSearchCriteria.setImageFileInfo(TestFiles.SampleWatermarkTransparent.ToFileInfo());
        options.setTextSearchCriteria(textSearchCriteria);
        options.setImageSearchCriteria(imageSearchCriteria);
        options.setSaveFoundImages(true);
        options.setOutputFolder("found_image_watermarks");

        SearchRequest request = new SearchRequest(options);
        SearchResult result = watermarkApi.search(request);

        // Act & Assert
        assertNotNull(result);
        String urlTemplate = "watermark/storage/file/found_image_watermarks/sample_pdf/watermark_image_";
        for (SearchResultItem item : result.getWatermarks()) {
            if (item.getImageUrl() != null) {
                assertTrue(item.getImageUrl().contains(urlTemplate));
            }
            if (item.getText() != null) {
                assertTrue(item.getText().contains("Watermark text"));
            }
        }
    }

    @Test
    public void Search_Watermark_File_Not_Found() {
        // Arrange
        SearchOptions options = new SearchOptions();
        options.setFileInfo(TestFiles.NotExist.ToFileInfo());
        TextSearchCriteria textSearchCriteria = new TextSearchCriteria();
        textSearchCriteria.setSearchText("Watermark text");
        ImageSearchCriteria imageSearchCriteria = new ImageSearchCriteria();
        imageSearchCriteria.setImageFileInfo(TestFiles.SampleWatermarkTransparent.ToFileInfo());
        options.setTextSearchCriteria(textSearchCriteria);
        options.setImageSearchCriteria(imageSearchCriteria);
        options.setOutputFolder("found_image_watermarks");

        SearchRequest request = new SearchRequest(options);
        // Act & Assert
        try {
            watermarkApi.search(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'folder\\file-not-exist.pdf'.", ex.getMessage());
        }
    }

    @Test
    public void Search_Watermark_Incorrect_Password() {
        // Arrange
        SearchOptions options = new SearchOptions();
        FileInfo fileInfo = TestFiles.PasswordProtected.ToFileInfo();
        fileInfo.setPassword("123");
        options.setFileInfo(fileInfo);
        TextSearchCriteria textSearchCriteria = new TextSearchCriteria();
        textSearchCriteria.setSearchText("Watermark text");
        ImageSearchCriteria imageSearchCriteria = new ImageSearchCriteria();
        imageSearchCriteria.setImageFileInfo(TestFiles.SampleWatermarkTransparent.ToFileInfo());
        options.setTextSearchCriteria(textSearchCriteria);
        options.setImageSearchCriteria(imageSearchCriteria);
        options.setOutputFolder("found_image_watermarks");

        SearchRequest request = new SearchRequest(options);

        // Act & Assert
        try {
            watermarkApi.search(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Password provided for file 'documents\\password-protected.docx' is incorrect.",
                    ex.getMessage());
        }
    }

    @Test
    public void Search_Watermark_File_Not_Supported() {
        // Arrange
        SearchOptions options = new SearchOptions();
        options.setFileInfo(TestFiles.Zip.ToFileInfo());
        TextSearchCriteria textSearchCriteria = new TextSearchCriteria();
        textSearchCriteria.setSearchText("Watermark text");
        ImageSearchCriteria imageSearchCriteria = new ImageSearchCriteria();
        imageSearchCriteria.setImageFileInfo(TestFiles.SampleWatermarkTransparent.ToFileInfo());
        options.setTextSearchCriteria(textSearchCriteria);
        options.setImageSearchCriteria(imageSearchCriteria);
        options.setTextSearchCriteria(textSearchCriteria);
        options.setImageSearchCriteria(imageSearchCriteria);

        SearchRequest request = new SearchRequest(options);

        // Act & Assert
        try {
            watermarkApi.search(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("The specified file 'documents\\sample.zip' has type which is not currently supported.",
                    ex.getMessage());
        }
    }

    @Test
    public void Search_Watermark_Without_Options() {
        // Arrange
        SearchRequest request = new SearchRequest(null);

        // Act & Assert
        try {
            watermarkApi.search(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Missing the required parameter 'options' when calling search(Async)", ex.getMessage());
        }
    }

    @Test
    public void Search_Watermark_No_Search_Criteria() {
        // Arrange
        SearchOptions options = new SearchOptions();
        options.setFileInfo(TestFiles.Xlsx.ToFileInfo());
        options.setOutputFolder("found_image_watermarks");
        SearchRequest request = new SearchRequest(options);

        // Act & Assert
        try {
            watermarkApi.search(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Request parameters missing or have incorrect format", ex.getMessage());
        }
    }
}
