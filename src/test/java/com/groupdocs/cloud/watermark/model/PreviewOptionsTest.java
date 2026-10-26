package com.groupdocs.cloud.watermark.model;

import java.util.Arrays;
import com.groupdocs.cloud.watermark.client.JSON;
import org.junit.Assert;
import org.junit.Test;

public class PreviewOptionsTest {
    @Test
    public void testSerialization() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFilePath("documents/sample.pdf");
        PreviewOptions options = new PreviewOptions();
        options.setFileInfo(fileInfo);
        options.setOutputFolder("watermark");
        options.setFormat("JPEG");
        options.setWidth(320);
        options.setHeight(240);
        options.setPageNumbers(Arrays.asList(1, 3));
        JSON json = new JSON();
        PreviewOptions deserialized = json.deserialize(json.serialize(options), PreviewOptions.class);
        Assert.assertEquals(options, deserialized);
    }
}
