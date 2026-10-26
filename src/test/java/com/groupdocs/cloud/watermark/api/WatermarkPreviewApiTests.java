/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
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

package com.groupdocs.cloud.watermark.api;

import static org.junit.Assert.*;

import java.util.Arrays;
import com.groupdocs.cloud.watermark.client.ApiException;
import com.groupdocs.cloud.watermark.model.requests.*;
import com.groupdocs.cloud.watermark.model.*;

import org.junit.Test;

public class WatermarkPreviewApiTests extends BaseApiTest {

    @Test
    public void Preview_All_Pages() throws ApiException {
        // Arrange
        PreviewOptions options = new PreviewOptions();
        options.setFileInfo(TestFiles.Pdf.ToFileInfo());
        options.setOutputFolder(DefaultOutputPath);
        PreviewRequest request = new PreviewRequest(options);

        // Act & Assert
        PreviewResult result = previewApi.preview(request);

        assertNotNull(result);
        assertEquals(2, result.getPages().size());
        for (int i = 0; i < result.getPages().size(); i++) {
            PreviewPage page = result.getPages().get(i);
            assertEquals(Integer.valueOf(i + 1), page.getPageNumber());
            assertTrue(page.getSize() > 0);
            ObjectExistsRequest existRequest = new ObjectExistsRequest();
            existRequest.setpath(page.getPath());
            assertTrue(storageApi.objectExists(existRequest).getExists());
        }
    }

    @Test
    public void Preview_Selected_Pages_With_Size_And_Format() throws ApiException {
        // Arrange
        PreviewOptions options = new PreviewOptions();
        options.setFileInfo(TestFiles.Docx.ToFileInfo());
        options.setOutputFolder(DefaultOutputPath);
        options.setFormat("JPEG");
        options.setWidth(320);
        options.setHeight(240);
        options.setPageNumbers(Arrays.asList(2, 100));
        PreviewRequest request = new PreviewRequest(options);

        // Act & Assert
        PreviewResult result = previewApi.preview(request);

        assertEquals(1, result.getPages().size());
        assertEquals(Integer.valueOf(2), result.getPages().get(0).getPageNumber());
        assertTrue(result.getPages().get(0).getPath().toLowerCase().endsWith(".jpg"));
    }

    @Test
    public void Preview_File_Not_Found() {
        // Arrange
        PreviewOptions options = new PreviewOptions();
        options.setFileInfo(TestFiles.NotExist.ToFileInfo());
        PreviewRequest request = new PreviewRequest(options);

        // Act & Assert
        try {
            previewApi.preview(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'folder/file-not-exist.pdf'.", ex.getMessage());
        }
    }

    @Test
    public void Preview_Without_Options() {
        // Arrange
        PreviewRequest request = new PreviewRequest(null);

        // Act & Assert
        try {
            previewApi.preview(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Missing the required parameter 'options' when calling preview(Async)", ex.getMessage());
        }
    }
}
