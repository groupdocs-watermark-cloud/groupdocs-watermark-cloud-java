package com.groupdocs.cloud.watermark.model;

import com.groupdocs.cloud.watermark.client.JSON;
import org.junit.Assert;
import org.junit.Test;

public class SearchOptionsTest {
    @Test
    public void testObjectsToSearchSerialization() {
        ObjectsToSearch objectsToSearch = new ObjectsToSearch();
        objectsToSearch.setPdfObjects("XObject");
        SearchOptions options = new SearchOptions();
        options.setSaveFoundImages(true);
        options.setObjectsToSearch(objectsToSearch);
        JSON json = new JSON();
        String serialized = json.serialize(options);
        Assert.assertTrue(serialized.contains("\"objectsToSearch\":{\"pdfObjects\":\"XObject\"}"));
        SearchOptions deserialized = json.deserialize(serialized, SearchOptions.class);
        Assert.assertEquals(objectsToSearch, deserialized.getObjectsToSearch());
        Assert.assertTrue(deserialized.getSaveFoundImages());
    }
}
