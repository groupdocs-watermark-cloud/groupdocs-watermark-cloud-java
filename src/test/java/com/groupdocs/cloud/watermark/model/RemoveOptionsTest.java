package com.groupdocs.cloud.watermark.model;

import java.util.Arrays;
import com.groupdocs.cloud.watermark.client.JSON;
import org.junit.Assert;
import org.junit.Test;

public class RemoveOptionsTest {
    @Test
    public void testImageInpaintingOptionsSerialization() {
        Point point = new Point();
        point.setX(1);
        point.setY(2);
        Polygon polygon = new Polygon();
        polygon.setPoints(Arrays.asList(point, point, point));
        Rectangle rectangle = new Rectangle();
        rectangle.setX(10);
        rectangle.setY(10);
        rectangle.setWidth(50);
        rectangle.setHeight(20);
        ImageInpaintingOptions inpainting = new ImageInpaintingOptions();
        inpainting.setRectangles(Arrays.asList(rectangle));
        inpainting.setPolygons(Arrays.asList(polygon));
        inpainting.setMethod("Telea");
        inpainting.setPatchSize(7);
        RemoveOptions options = new RemoveOptions();
        options.setImageInpaintingOptions(inpainting);
        JSON json = new JSON();
        String serialized = json.serialize(options);
        Assert.assertTrue(serialized.contains("\"imageInpaintingOptions\":"));
        RemoveOptions deserialized = json.deserialize(serialized, RemoveOptions.class);
        Assert.assertEquals(options, deserialized);
    }
}
