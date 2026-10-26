package com.groupdocs.cloud.watermark.model;

import java.util.Arrays;
import com.groupdocs.cloud.watermark.client.JSON;
import org.junit.Assert;
import org.junit.Test;

public class TextSearchCriteriaTest {
    @Test
    public void testSearchOptionsSerialization() {
        TextSearchCriteria criteria = new TextSearchCriteria();
        criteria.setSearchText("^watermark\\s+text$");
        criteria.setMatchCase(false);
        criteria.setUseRegularExpression(true);
        criteria.setSkipUnreadableCharacters(true);
        criteria.setPages(Arrays.asList(1, 2));
        JSON json = new JSON();
        TextSearchCriteria deserialized = json.deserialize(json.serialize(criteria), TextSearchCriteria.class);
        Assert.assertEquals(criteria, deserialized);
    }
}
