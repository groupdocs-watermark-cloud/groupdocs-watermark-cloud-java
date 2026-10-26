package com.groupdocs.cloud.watermark.model;

import com.groupdocs.cloud.watermark.client.JSON;
import org.junit.Assert;
import org.junit.Test;

public class InfoResultTest {
    @Test
    public void testPagesDeserialization() {
        JSON json = new JSON();
        InfoResult result = json.deserialize("{\"size\":100,\"pageCount\":1,\"isEncrypted\":true,\"pages\":[{\"pageNumber\":1,\"width\":595.5,\"height\":842.0}]}", InfoResult.class);
        Assert.assertTrue(result.getIsEncrypted());
        Assert.assertEquals(1, result.getPages().size());
        Assert.assertEquals(Integer.valueOf(1), result.getPages().get(0).getPageNumber());
        Assert.assertEquals(Double.valueOf(595.5), result.getPages().get(0).getWidth());
        Assert.assertEquals(Double.valueOf(842.0), result.getPages().get(0).getHeight());
    }
}
