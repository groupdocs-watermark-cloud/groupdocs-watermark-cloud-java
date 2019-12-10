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

public class WatermarkReplaceApiTests extends BaseApiTest {

    @Test
    public void Replace_Watermark_Test() throws ApiException {
        // Arrange
        ReplaceOptions options = new ReplaceOptions();
        options.setFileInfo(TestFiles.PdfWithWatermarks.ToFileInfo());
        TextSearchCriteria textSearchCriteria = new TextSearchCriteria();
        textSearchCriteria.setSearchText("Watermark text");
        ImageSearchCriteria imageSearchCriteria = new ImageSearchCriteria();
        imageSearchCriteria.setImageFileInfo(TestFiles.SampleWatermarkTransparent.ToFileInfo());
        ReplaceTextOptions replaceTextOptions = new ReplaceTextOptions();
        replaceTextOptions.setText("New watermark text");
        ReplaceImageOptions replaceImageOptions = new ReplaceImageOptions();
        replaceImageOptions.setImage(TestFiles.Jpg.ToFileInfo());
        options.setReplaceTextOptions(replaceTextOptions);
        options.setReplaceImageOptions(replaceImageOptions);
        options.setTextSearchCriteria(textSearchCriteria);
        options.setImageSearchCriteria(imageSearchCriteria);

        ReplaceRequest request = new ReplaceRequest(options);
        WatermarkResult result = watermarkApi.replace(request);

        // Act & Assert
        assertNotNull(result);
        CheckIfWatermarkExist(result.getPath(), "New watermark text", TestFiles.Jpg.ToFileInfo());
    }

    @Test
    public void Replace_Watermark_File_Not_Found() {
        // Arrange
        ReplaceOptions options = new ReplaceOptions();
        options.setFileInfo(TestFiles.NotExist.ToFileInfo());
        TextSearchCriteria textSearchCriteria = new TextSearchCriteria();
        textSearchCriteria.setSearchText("Watermark text");
        ImageSearchCriteria imageSearchCriteria = new ImageSearchCriteria();
        imageSearchCriteria.setImageFileInfo(TestFiles.SampleWatermarkTransparent.ToFileInfo());
        ReplaceTextOptions replaceTextOptions = new ReplaceTextOptions();
        replaceTextOptions.setText("New watermark text");
        ReplaceImageOptions replaceImageOptions = new ReplaceImageOptions();
        replaceImageOptions.setImage(TestFiles.Jpg.ToFileInfo());
        options.setReplaceTextOptions(replaceTextOptions);
        options.setReplaceImageOptions(replaceImageOptions);
        options.setTextSearchCriteria(textSearchCriteria);
        options.setImageSearchCriteria(imageSearchCriteria);

        ReplaceRequest request = new ReplaceRequest(options);
        // Act & Assert
        try {
            watermarkApi.replace(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'folder\\file-not-exist.pdf'.", ex.getMessage());
        }
    }

    @Test
    public void Replace_Watermark_Incorrect_Password() {
        // Arrange
        ReplaceOptions options = new ReplaceOptions();
        FileInfo fileInfo = TestFiles.PasswordProtected.ToFileInfo();
        fileInfo.setPassword("123");
        options.setFileInfo(fileInfo);
        TextSearchCriteria textSearchCriteria = new TextSearchCriteria();
        textSearchCriteria.setSearchText("Watermark text");
        ImageSearchCriteria imageSearchCriteria = new ImageSearchCriteria();
        imageSearchCriteria.setImageFileInfo(TestFiles.SampleWatermarkTransparent.ToFileInfo());
        ReplaceTextOptions replaceTextOptions = new ReplaceTextOptions();
        replaceTextOptions.setText("New watermark text");
        ReplaceImageOptions replaceImageOptions = new ReplaceImageOptions();
        replaceImageOptions.setImage(TestFiles.Jpg.ToFileInfo());
        options.setReplaceTextOptions(replaceTextOptions);
        options.setReplaceImageOptions(replaceImageOptions);
        options.setTextSearchCriteria(textSearchCriteria);
        options.setImageSearchCriteria(imageSearchCriteria);

        ReplaceRequest request = new ReplaceRequest(options);

        // Act & Assert
        try {
            watermarkApi.replace(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Password provided for file 'documents\\password-protected.docx' is incorrect.",
                    ex.getMessage());
        }
    }

    @Test
    public void Replace_Watermark_File_Not_Supported() {
        // Arrange
        ReplaceOptions options = new ReplaceOptions();
        options.setFileInfo(TestFiles.Zip.ToFileInfo());
        TextSearchCriteria textSearchCriteria = new TextSearchCriteria();
        textSearchCriteria.setSearchText("Watermark text");
        ImageSearchCriteria imageSearchCriteria = new ImageSearchCriteria();
        imageSearchCriteria.setImageFileInfo(TestFiles.SampleWatermarkTransparent.ToFileInfo());
        ReplaceTextOptions replaceTextOptions = new ReplaceTextOptions();
        replaceTextOptions.setText("New watermark text");
        ReplaceImageOptions replaceImageOptions = new ReplaceImageOptions();
        replaceImageOptions.setImage(TestFiles.Jpg.ToFileInfo());
        options.setReplaceTextOptions(replaceTextOptions);
        options.setReplaceImageOptions(replaceImageOptions);
        options.setTextSearchCriteria(textSearchCriteria);
        options.setImageSearchCriteria(imageSearchCriteria);
        
        ReplaceRequest request = new ReplaceRequest(options);

        // Act & Assert
        try {
            watermarkApi.replace(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("The specified file 'documents\\sample.zip' has type which is not currently supported.",
                    ex.getMessage());
        }
    }

    @Test
    public void Replace_Watermark_Without_Options() {
        // Arrange
        ReplaceRequest request = new ReplaceRequest(null);

        // Act & Assert
        try {
            watermarkApi.replace(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Missing the required parameter 'options' when calling replace(Async)", ex.getMessage());
        }
    }

    @Test
    public void Replace_Watermark_No_Search_Criteria() {
        // Arrange
        ReplaceOptions options = new ReplaceOptions();
        options.setFileInfo(TestFiles.Xlsx.ToFileInfo());
        options.setOutputFolder("found_image_watermarks");
        ReplaceRequest request = new ReplaceRequest(options);

        // Act & Assert
        try {
            watermarkApi.replace(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Request parameters missing or have incorrect format", ex.getMessage());
        }
    }

    private void CheckIfWatermarkExist(String path, String watermarkText, FileInfo watermarkImage) throws ApiException {
        ObjectExistsRequest existRequest = new ObjectExistsRequest();
        existRequest.setpath(path);
        assertTrue(storageApi.objectExists(existRequest).getExists());

        SearchOptions searchOptions = new SearchOptions();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath(path);
        searchOptions.setFileInfo(fileInfo);

        if (watermarkText != null) {
            TextSearchCriteria textSearchCriteria = new TextSearchCriteria();
            textSearchCriteria.setSearchText(watermarkText);
            searchOptions.setTextSearchCriteria(textSearchCriteria);
        }

        if (watermarkImage != null) {
            ImageSearchCriteria imageSearchCriteria = new ImageSearchCriteria();
            imageSearchCriteria.setImageFileInfo(watermarkImage);
            searchOptions.setImageSearchCriteria(imageSearchCriteria);
        }

        SearchRequest searchRequest = new SearchRequest(searchOptions);
        SearchResult searchResult = watermarkApi.search(searchRequest);

        assertNotNull(searchResult.getWatermarks());
    }
}
