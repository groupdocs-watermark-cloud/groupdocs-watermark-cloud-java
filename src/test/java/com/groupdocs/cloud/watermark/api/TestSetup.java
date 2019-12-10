package com.groupdocs.cloud.watermark.api;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    AuthApiTests.class,
    FormatsApiTests.class,
    StorageApiTests.class,
    FolderApiTests.class,
    FileApiTests.class,
    WatermarkAddApiTests.class,
    WatermarkRemoveApiTests.class,
    WatermarkReplaceApiTests.class,
    WatermarkSearchApiTests.class
})

public class TestSetup {
    

}
