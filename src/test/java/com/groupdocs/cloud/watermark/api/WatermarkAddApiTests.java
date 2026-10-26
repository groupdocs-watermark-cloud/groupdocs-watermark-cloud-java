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
import java.util.List;
import com.groupdocs.cloud.watermark.client.ApiException;
import com.groupdocs.cloud.watermark.model.requests.*;
import com.groupdocs.cloud.watermark.model.*;

import org.junit.Test;

public class WatermarkAddApiTests extends BaseApiTest {

    @Test
    public void TestAddTextWatermark() throws ApiException {
        // Arrange
        WatermarkOptions options = new WatermarkOptions();
        options.setFileInfo(TestFiles.Docx.ToFileInfo());
        TextWatermarkOptions textWatermarkOptions = new TextWatermarkOptions();
        textWatermarkOptions.setText("New watermark text");
        textWatermarkOptions.setFontFamilyName("Arial");
        textWatermarkOptions.setFontSize(12d);
        WatermarkDetails watermarkDetails = new WatermarkDetails();
        watermarkDetails.setTextWatermarkOptions(textWatermarkOptions);
        List<WatermarkDetails> deatilsList = Arrays.asList(new WatermarkDetails[] { watermarkDetails });
        options.setWatermarkDetails(deatilsList);

        AddRequest request = new AddRequest(options);
        AddResult result = watermarkApi.add(request);

        // Act & Assert
        assertNotNull(result);
        assertEquals(Integer.valueOf(1), result.getAppliedWatermarksCount());
        CheckIfWatermarkExist(result.getPath(), "New watermark text", null);
    }

    @Test
    public void TestAddTiledWatermark() throws ApiException {
        // Arrange
        WatermarkOptions options = new WatermarkOptions();
        options.setFileInfo(TestFiles.Pdf.ToFileInfo());
        options.setOutputFolder(DefaultOutputPath);
        Thickness padding = new Thickness();
        padding.setLeft(5d);
        padding.setRight(5d);
        padding.setTop(5d);
        padding.setBottom(5d);
        TextWatermarkOptions textWatermarkOptions = new TextWatermarkOptions();
        textWatermarkOptions.setText("Tiled watermark");
        textWatermarkOptions.setFontFamilyName("Arial");
        textWatermarkOptions.setFontSize(12d);
        textWatermarkOptions.setPadding(padding);
        MeasureValue lineSpacing = new MeasureValue();
        lineSpacing.setMeasureType("Percent");
        lineSpacing.setValue(10d);
        MeasureValue watermarkSpacing = new MeasureValue();
        watermarkSpacing.setMeasureType("Percent");
        watermarkSpacing.setValue(10d);
        TileOptions tileOptions = new TileOptions();
        tileOptions.setTileType("Offset");
        tileOptions.setLineSpacing(lineSpacing);
        tileOptions.setWatermarkSpacing(watermarkSpacing);
        tileOptions.setRotateAroundOrigin(false);
        WatermarkDetails watermarkDetails = new WatermarkDetails();
        watermarkDetails.setTextWatermarkOptions(textWatermarkOptions);
        watermarkDetails.setTileOptions(tileOptions);
        List<WatermarkDetails> deatilsList = Arrays.asList(new WatermarkDetails[] { watermarkDetails });
        options.setWatermarkDetails(deatilsList);

        AddRequest request = new AddRequest(options);
        AddResult result = watermarkApi.add(request);

        // Act & Assert
        assertNotNull(result);
        assertTrue(result.getAppliedWatermarksCount() > 1);
        CheckIfWatermarkExist(result.getPath(), "Tiled watermark", null);
    }

    @Test
    public void TestAddWatermarkToSelectedPages() throws ApiException {
        // Arrange
        WatermarkOptions options = new WatermarkOptions();
        options.setFileInfo(TestFiles.Pdf.ToFileInfo());
        options.setOutputFolder(DefaultOutputPath);
        TextWatermarkOptions textWatermarkOptions = new TextWatermarkOptions();
        textWatermarkOptions.setText("Last page watermark");
        textWatermarkOptions.setFontFamilyName("Arial");
        textWatermarkOptions.setFontSize(12d);
        PagesSetup pagesSetup = new PagesSetup();
        pagesSetup.setAllPages(false);
        pagesSetup.setFirstPage(false);
        pagesSetup.setLastPage(true);
        pagesSetup.setOddPages(false);
        pagesSetup.setEvenPages(false);
        WatermarkDetails watermarkDetails = new WatermarkDetails();
        watermarkDetails.setTextWatermarkOptions(textWatermarkOptions);
        watermarkDetails.setPagesSetup(pagesSetup);
        List<WatermarkDetails> deatilsList = Arrays.asList(new WatermarkDetails[] { watermarkDetails });
        options.setWatermarkDetails(deatilsList);

        AddRequest request = new AddRequest(options);
        AddResult result = watermarkApi.add(request);

        // Act & Assert
        assertEquals(Integer.valueOf(1), result.getAppliedWatermarksCount());

        SearchOptions searchOptions = new SearchOptions();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath(result.getPath());
        searchOptions.setFileInfo(fileInfo);
        TextSearchCriteria textSearchCriteria = new TextSearchCriteria();
        textSearchCriteria.setSearchText("Last page watermark");
        textSearchCriteria.setUseRegularExpression(false);
        textSearchCriteria.setSkipUnreadableCharacters(false);
        searchOptions.setTextSearchCriteria(textSearchCriteria);
        SearchResult searchResult = watermarkApi.search(new SearchRequest(searchOptions));

        int pagesFound = 0;
        for (SearchResultItem item : searchResult.getWatermarks()) {
            if (item.getPageNumber() != null) {
                assertEquals(Integer.valueOf(2), item.getPageNumber());
                pagesFound++;
            }
        }
        assertTrue(pagesFound > 0);
    }

    @Test
    public void TestAddImageWatermark() throws ApiException {
        // Arrange
        WatermarkOptions options = new WatermarkOptions();
        options.setFileInfo(TestFiles.Docx.ToFileInfo());
        ImageWatermarkOptions imageWatermarkOptions = new ImageWatermarkOptions();
        imageWatermarkOptions.setImage(TestFiles.SampleWatermarkTransparent.ToFileInfo());
        WatermarkDetails watermarkDetails = new WatermarkDetails();
        watermarkDetails.setImageWatermarkOptions(imageWatermarkOptions);
        List<WatermarkDetails> deatilsList = Arrays.asList(new WatermarkDetails[] { watermarkDetails });
        options.setWatermarkDetails(deatilsList);

        AddRequest request = new AddRequest(options);
        WatermarkResult result = watermarkApi.add(request);

        // Act & Assert
        assertNotNull(result);
        CheckIfWatermarkExist(result.getPath(), null, TestFiles.SampleWatermarkTransparent.ToFileInfo());
    }

    @Test
    public void Add_Watermark_File_Not_Found() {
        // Arrange
        WatermarkOptions options = new WatermarkOptions();
        options.setFileInfo(TestFiles.NotExist.ToFileInfo());
        ImageWatermarkOptions imageWatermarkOptions = new ImageWatermarkOptions();
        imageWatermarkOptions.setImage(TestFiles.SampleWatermarkTransparent.ToFileInfo());
        WatermarkDetails watermarkDetails = new WatermarkDetails();
        watermarkDetails.setImageWatermarkOptions(imageWatermarkOptions);
        List<WatermarkDetails> deatilsList = Arrays.asList(new WatermarkDetails[] { watermarkDetails });
        options.setWatermarkDetails(deatilsList);

        AddRequest request = new AddRequest(options);

        // Act & Assert
        try {
            watermarkApi.add(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'folder/file-not-exist.pdf'.", ex.getMessage());
        }
    }

    @Test
    public void Add_Watermark_Incorrect_Password() {
        // Arrange
        WatermarkOptions options = new WatermarkOptions();
        FileInfo fileInfo = TestFiles.PasswordProtected.ToFileInfo();
        fileInfo.setPassword("123");
        options.setFileInfo(fileInfo);
        ImageWatermarkOptions imageWatermarkOptions = new ImageWatermarkOptions();
        imageWatermarkOptions.setImage(TestFiles.SampleWatermarkTransparent.ToFileInfo());
        WatermarkDetails watermarkDetails = new WatermarkDetails();
        watermarkDetails.setImageWatermarkOptions(imageWatermarkOptions);
        List<WatermarkDetails> deatilsList = Arrays.asList(new WatermarkDetails[] { watermarkDetails });
        options.setWatermarkDetails(deatilsList);

        AddRequest request = new AddRequest(options);

        // Act & Assert
        try {
            watermarkApi.add(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Password provided for file 'documents/password-protected.docx' is incorrect.",
                    ex.getMessage());
        }
    }

    @Test
    public void Add_Watermark_No_Details() {
        // Arrange
        WatermarkOptions options = new WatermarkOptions();
        options.setFileInfo(TestFiles.Docx.ToFileInfo());
        options.setWatermarkDetails(Arrays.asList(new WatermarkDetails[] {}));
        AddRequest request = new AddRequest(options);

        // Act & Assert
        try {
            watermarkApi.add(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Request parameters missing or have incorrect format", ex.getMessage());
        }
    }

    @Test
    public void Add_Watermark_No_Text_And_Image() {
        // Arrange
        WatermarkOptions options = new WatermarkOptions();
        options.setFileInfo(TestFiles.Docx.ToFileInfo());
        TextWatermarkOptions textWatermarkOptions = new TextWatermarkOptions();
        textWatermarkOptions.setFontFamilyName("Arial");
        textWatermarkOptions.setFontSize(12d);
        WatermarkDetails watermarkDetails = new WatermarkDetails();
        watermarkDetails.setTextWatermarkOptions(textWatermarkOptions);
        List<WatermarkDetails> deatilsList = Arrays.asList(new WatermarkDetails[] { watermarkDetails });
        options.setWatermarkDetails(deatilsList);
        AddRequest request = new AddRequest(options);

        // Act & Assert
        try {
            watermarkApi.add(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Request parameters missing or have incorrect format", ex.getMessage());
        }
    }

    @Test
    public void Add_Watermark_File_Not_Supported() {
        // Arrange
        WatermarkOptions options = new WatermarkOptions();
        options.setFileInfo(TestFiles.Zip.ToFileInfo());
        TextWatermarkOptions textWatermarkOptions = new TextWatermarkOptions();
        textWatermarkOptions.setText("Text");
        textWatermarkOptions.setFontFamilyName("Arial");
        textWatermarkOptions.setFontSize(12d);
        WatermarkDetails watermarkDetails = new WatermarkDetails();
        watermarkDetails.setTextWatermarkOptions(textWatermarkOptions);
        List<WatermarkDetails> deatilsList = Arrays.asList(new WatermarkDetails[] { watermarkDetails });
        options.setWatermarkDetails(deatilsList);
        AddRequest request = new AddRequest(options);

        // Act & Assert
        try {
            watermarkApi.add(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("The specified file 'documents/sample.zip' has type which is not currently supported.",
                    ex.getMessage());
        }
    }

    @Test
    public void Add_Watermark_Without_Options() {
        // Arrange
        AddRequest request = new AddRequest(null);

        // Act & Assert
        try {
            watermarkApi.add(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Missing the required parameter 'options' when calling add(Async)", ex.getMessage());
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
