package com.groupdocs.cloud.watermark.model;

import com.groupdocs.cloud.watermark.client.JSON;
import org.junit.Assert;
import org.junit.Test;

public class PreviewResultTest {
    @Test
    public void testPagesDeserialization() {
        JSON json = new JSON();
        PreviewResult result = json.deserialize("{\"pages\":[{\"pageNumber\":2,\"path\":\"watermark/sample_pdf/page_2.png\",\"downloadUrl\":\"url\",\"size\":1024}]}", PreviewResult.class);
        Assert.assertEquals(1, result.getPages().size());
        PreviewPage page = result.getPages().get(0);
        Assert.assertEquals(Integer.valueOf(2), page.getPageNumber());
        Assert.assertEquals("watermark/sample_pdf/page_2.png", page.getPath());
        Assert.assertEquals("url", page.getDownloadUrl());
        Assert.assertEquals(Long.valueOf(1024), page.getSize());
    }
}
