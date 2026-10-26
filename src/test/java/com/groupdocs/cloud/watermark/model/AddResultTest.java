package com.groupdocs.cloud.watermark.model;

import com.groupdocs.cloud.watermark.client.JSON;
import org.junit.Assert;
import org.junit.Test;

public class AddResultTest {
    @Test
    public void testAppliedWatermarksCountDeserialization() {
        JSON json = new JSON();
        AddResult result = json.deserialize("{\"downloadUrl\":\"url\",\"path\":\"watermark/sample.pdf\",\"appliedWatermarksCount\":3}", AddResult.class);
        Assert.assertEquals(Integer.valueOf(3), result.getAppliedWatermarksCount());
        Assert.assertEquals("watermark/sample.pdf", result.getPath());
        Assert.assertEquals("url", result.getDownloadUrl());
    }
}
