package com.groupdocs.cloud.watermark.model;

import com.groupdocs.cloud.watermark.client.JSON;
import org.junit.Assert;
import org.junit.Test;

public class TextWatermarkOptionsTest {
    @Test
    public void testPaddingSerialization() {
        Thickness padding = new Thickness();
        padding.setLeft(1d);
        padding.setRight(2d);
        padding.setTop(3d);
        padding.setBottom(4d);
        TextWatermarkOptions options = new TextWatermarkOptions();
        options.setPadding(padding);
        JSON json = new JSON();
        String serialized = json.serialize(options);
        Assert.assertTrue(serialized.contains("\"padding\":"));
        TextWatermarkOptions deserialized = json.deserialize(serialized, TextWatermarkOptions.class);
        Assert.assertEquals(padding, deserialized.getPadding());
    }
}
