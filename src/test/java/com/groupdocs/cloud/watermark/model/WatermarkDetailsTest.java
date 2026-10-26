package com.groupdocs.cloud.watermark.model;

import java.util.Arrays;
import com.groupdocs.cloud.watermark.client.JSON;
import org.junit.Assert;
import org.junit.Test;

public class WatermarkDetailsTest {
    @Test
    public void testTileOptionsAndPagesSetupSerialization() {
        MeasureValue spacing = new MeasureValue();
        spacing.setMeasureType("Percent");
        spacing.setValue(10d);
        TileOptions tileOptions = new TileOptions();
        tileOptions.setTileType("Offset");
        tileOptions.setLineSpacing(spacing);
        tileOptions.setWatermarkSpacing(spacing);
        tileOptions.setRotateAroundOrigin(true);
        PagesSetup pagesSetup = new PagesSetup();
        pagesSetup.setAllPages(false);
        pagesSetup.setFirstPage(true);
        pagesSetup.setLastPage(false);
        pagesSetup.setOddPages(false);
        pagesSetup.setEvenPages(false);
        pagesSetup.setPages(Arrays.asList(3));
        WatermarkDetails details = new WatermarkDetails();
        details.setTileOptions(tileOptions);
        details.setPagesSetup(pagesSetup);
        JSON json = new JSON();
        WatermarkDetails deserialized = json.deserialize(json.serialize(details), WatermarkDetails.class);
        Assert.assertEquals(details, deserialized);
    }
}
