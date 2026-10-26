# GroupDocs.Watermark Cloud SDK for Java

[GroupDocs.Watermark Cloud API](https://products.groupdocs.cloud/watermark/java/) is a REST API for managing watermarks in documents and images from your Java applications. Add text and image watermarks, search for existing watermarks by text, image, size, rotation angle or formatting, replace or remove watermarks, including ones added by third-party software, erase watermarks from raster images by inpainting, and render document page previews. Microsoft Word, Excel, PowerPoint, Visio, PDF, email messages, raster images, multi-page TIFF and animated GIF formats are supported. Additional file and folder operations streamline cloud storage management.

## Requirements

* Java SE Development Kit 8

## Installation

### Maven

Add following repository and dependency to your project's POM

```xml
<repository>
    <id>groupdocs-artifact-repository</id>
    <name>GroupDocs Artifact Repository</name>
    <url>https://repository.groupdocs.cloud/repo</url>
</repository>
```

```xml
<dependency>
    <groupId>com.groupdocs</groupId>
    <artifactId>groupdocs-watermark-cloud</artifactId>
    <version>26.10</version>
    <scope>compile</scope>
</dependency>
```

### Gradle

Add following repository and dependency to your build.gradle:

```javascript
repositories {
    maven {
        url "https://repository.groupdocs.cloud/repo/"
    }
}

...
dependencies {
    ...
    implementation 'com.groupdocs:groupdocs-watermark-cloud:26.10'
}
```

## Getting Started

* Please follow the [installation](#installation) instruction
* Get your AppSID and AppKey at [Dashboard](https://dashboard.groupdocs.cloud) and use them in your code
* Build and execute
* Explore more samples at [GitHub](https://github.com/groupdocs-watermark-cloud/groupdocs-watermark-cloud-java-samples)

This example demonstrates how to add a text watermark to a Word document stored in your cloud storage:

```java
import java.util.Arrays;
import com.groupdocs.cloud.watermark.api.*;
import com.groupdocs.cloud.watermark.client.*;
import com.groupdocs.cloud.watermark.model.*;
import com.groupdocs.cloud.watermark.model.requests.*;

/**
 * This example demonstrates how to add a text watermark to a document.
 */
public class AddTextWatermark {

	public static void main(String[] args) {

		// Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).
		Configuration configuration = new Configuration("XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		WatermarkApi apiInstance = new WatermarkApi(configuration);

		try {
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("documents/sample.docx");

			Color color = new Color();
			color.setName("Red");

			Thickness padding = new Thickness();
			padding.setLeft(10d);
			padding.setRight(10d);
			padding.setTop(5d);
			padding.setBottom(5d);

			TextWatermarkOptions textWatermarkOptions = new TextWatermarkOptions();
			textWatermarkOptions.setText("Confidential");
			textWatermarkOptions.setFontFamilyName("Arial");
			textWatermarkOptions.setFontSize(36d);
			textWatermarkOptions.setForegroundColor(color);
			textWatermarkOptions.setPadding(padding);

			Position position = new Position();
			position.setHorizontalAlignment("Center");
			position.setVerticalAlignment("Center");
			position.setRotateAngle(45d);

			WatermarkDetails watermarkDetails = new WatermarkDetails();
			watermarkDetails.setTextWatermarkOptions(textWatermarkOptions);
			watermarkDetails.setPosition(position);
			watermarkDetails.setOpacity(0.5d);

			WatermarkOptions options = new WatermarkOptions();
			options.setFileInfo(fileInfo);
			options.setWatermarkDetails(Arrays.asList(watermarkDetails));

			AddRequest request = new AddRequest(options);

			AddResult response = apiInstance.add(request);

			System.out.println("Output file path: " + response.getPath());

		} catch (ApiException e) {

			System.err.println("Exception while calling api:");
			e.printStackTrace();
		}
	}
}
```


## Licensing

All GroupDocs.Watermark Cloud SDKs are licensed under [MIT License](LICENSE).

## Resources

* [**Website**](https://www.groupdocs.cloud)
* [**Product Home**](https://products.groupdocs.cloud/watermark)
* [**Documentation**](https://docs.groupdocs.cloud/watermark/)
* [**Free Support Forum**](https://forum.groupdocs.cloud/c/watermark)
* [**Blog**](https://blog.groupdocs.cloud/category/watermark/)

## Contact Us

Your feedback is very important to us. Please feel free to contact us using our [Support Forums](https://forum.groupdocs.cloud/c/watermark).
