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

public class WatermarkInfoApiTests extends BaseApiTest {

    @Test
    public void InfoApiTest_Word() throws ApiException {
        // Arrange
        InfoOptions options = new InfoOptions();
        options.setFileInfo(TestFiles.Docx.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        InfoResult result = infoApi.getInfo(request);

        assertNotNull(result);
        assertEquals("MICROSOFT WORD OPEN XML DOCUMENT", result.getFileType().getFileFormat().toUpperCase());
        assertEquals(Integer.valueOf(2), result.getPageCount());
    }

    @Test
    public void InfoApiTest_Msg() throws ApiException {
        // Arrange
        InfoOptions options = new InfoOptions();
        options.setFileInfo(TestFiles.Msg.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        InfoResult result = infoApi.getInfo(request);

        assertNotNull(result);
        assertEquals("OUTLOOK MAIL MESSAGE", result.getFileType().getFileFormat().toUpperCase());
        assertEquals(Long.valueOf(4090880), result.getSize());
    }

    @Test
    public void InfoApiTest_Pdf() throws ApiException {
        // Arrange
        InfoOptions options = new InfoOptions();
        options.setFileInfo(TestFiles.Pdf.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        InfoResult result = infoApi.getInfo(request);

        assertNotNull(result);
        assertEquals("PORTABLE DOCUMENT FORMAT FILE", result.getFileType().getFileFormat().toUpperCase());
        assertEquals(Integer.valueOf(2), result.getPageCount());
    }

    @Test
    public void InfoApiTest_Visio() throws ApiException {
        // Arrange
        InfoOptions options = new InfoOptions();
        options.setFileInfo(TestFiles.Visio.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        InfoResult result = infoApi.getInfo(request);

        assertNotNull(result);
        assertEquals("VISIO DRAWING", result.getFileType().getFileFormat().toUpperCase());
        assertEquals(Integer.valueOf(2), result.getPageCount());
    }

    @Test
    public void InfoApiTest_Pptx() throws ApiException {
        // Arrange
        InfoOptions options = new InfoOptions();
        options.setFileInfo(TestFiles.Pptx.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        InfoResult result = infoApi.getInfo(request);

        assertNotNull(result);
        assertEquals("POWERPOINT OPEN XML PRESENTATION", result.getFileType().getFileFormat().toUpperCase());
        assertEquals(Integer.valueOf(3), result.getPageCount());
    }

    @Test
    public void InfoApiTest_Xlsx() throws ApiException {
        // Arrange
        InfoOptions options = new InfoOptions();
        options.setFileInfo(TestFiles.Xlsx.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        InfoResult result = infoApi.getInfo(request);

        assertNotNull(result);
        assertEquals("MICROSOFT EXCEL OPEN XML SPREADSHEET", result.getFileType().getFileFormat().toUpperCase());
        assertEquals(Integer.valueOf(3), result.getPageCount());
    }

    @Test
    public void InfoApiTest_Jpeg() throws ApiException {
        // Arrange
        InfoOptions options = new InfoOptions();
        options.setFileInfo(TestFiles.Jpg.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        InfoResult result = infoApi.getInfo(request);

        assertNotNull(result);
        assertEquals("JPEG IMAGE", result.getFileType().getFileFormat().toUpperCase());
        assertEquals(Integer.valueOf(1), result.getPageCount());
    }

    @Test
    public void InfoApiTest_FileNotFoundResult() {
        // Arrange
        InfoOptions options = new InfoOptions();
        options.setFileInfo(TestFiles.NotExist.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        try {
            infoApi.getInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'folder\\file-not-exist.pdf'.", ex.getMessage());
        }
    }

    @Test
    public void InfoApiTest_Not_Supported() {
        // Arrange
        InfoOptions options = new InfoOptions();
        options.setFileInfo(TestFiles.Zip.ToFileInfo());
        GetInfoRequest request = new GetInfoRequest(options);

        // Act & Assert
        try {
            infoApi.getInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("The specified file 'documents\\sample.zip' has type which is not currently supported.", ex.getMessage());
        }
    }
}
