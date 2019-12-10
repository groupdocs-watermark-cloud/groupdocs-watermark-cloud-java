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

import java.util.ArrayList;

public class TestFiles {

    public static TestFile PasswordProtected = new TestFile("password-protected.docx", "documents\\");
    public static TestFile Docx = new TestFile("sample.docx", "documents\\");
    public static TestFile Zip = new TestFile("sample.zip", "documents\\");
    public static TestFile Msg = new TestFile("sample.msg", "documents\\");
    public static TestFile Pdf = new TestFile("sample.pdf", "documents\\");
    public static TestFile Pptx = new TestFile("sample.pptx", "documents\\");
    public static TestFile Xlsx = new TestFile("sample.xlsx", "documents\\");
    public static TestFile Visio = new TestFile("sample.vsdx", "documents\\");
    public static TestFile MsgWithAttachments = new TestFile("samplewithattachments.msg", "documents\\");
    public static TestFile Jpg = new TestFile("sample.jpg", "images\\");
    public static TestFile Tiff = new TestFile("multipage_tiff_sample.tif", "images\\");
    public static TestFile PdfWithWatermarks = new TestFile("sample.pdf", "with_watermarks\\");
    public static TestFile SampleWatermarkTransparent = new TestFile("sample_watermark.png", "watermark_images\\");
    public static TestFile NotExist = new TestFile("folder\\file-not-exist.pdf", "");

    static {
        PasswordProtected.setPassword("password");
    }

    public static ArrayList<TestFile> GetList() {

        ArrayList<TestFile> files = new ArrayList<TestFile>();
        files.add(PasswordProtected);
        files.add(Docx);
        files.add(Zip);
        files.add(Msg);
        files.add(Pdf);
        files.add(Pptx);
        files.add(Xlsx);
        files.add(Visio);
        files.add(MsgWithAttachments);
        files.add(Jpg);
        files.add(Tiff);
        files.add(PdfWithWatermarks);
        files.add(SampleWatermarkTransparent);
        return files;
    }
}