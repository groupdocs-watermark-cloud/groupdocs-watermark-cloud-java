![](https://img.shields.io/badge/api-v1.0-lightgrey) [![GitHub license](https://img.shields.io/github/license/groupdocs-watermark-cloud/groupdocs-watermark-cloud-dotnet)](https://github.com/groupdocs-watermark-cloud/groupdocs-watermark-cloud-dotnet/blob/master/LICENSE)

# GroupDocs.Watermark Cloud SDK for Java

GroupDocs.Watermark Cloud is a REST API for managing watermarks in the documents. It provides the effective watermarking methods to add image and text watermarks. Furthermore, API works to search and remove the watermarks which were already added to the documents by other third-party software. Microsoft Word, Excel, PowerPoint, Visio, PDF, raster images, multi-page TIFF and animated GIF formats are supported.

This repository contains GroupDocs.Watermark Cloud SDK for Java source code. This SDK allows you to work with GroupDocs.Watermark Cloud REST APIs in your Java applications.


## Cloud Document Watermarking Features

- Add text or image watermarks to documents of supported formats.
- Create watermarks for specific pages only.
- Specify the physical attributes of the watermark, e.g., size, font, color, etc.
- Search for the collection of the image or text-based watermarks inside a document.
- Edit properties of the existing editable watermarks.
- Remove watermarks from specific pages or remove specific watermarks from the document.

## New features & Enhacements Version 19.12

- This is the first release of a completely new version of the GroupDocs.Watermark.Cloud API.

## Supported File Formats
The following file formats support the adding, removing, searching, and replacing watermark:

- **Microsoft Word**: DOC, DOT, DOCX, DOCM, DOTX, DOTM, RTF
- **Microsoft Excel**: XLSX, XLSM, XLTM, XLT, XLTX, XLS
- **Microsoft PowerPoint**: PPTX, PPTM, PPSX, PPSM, POTX, POTM, PPT, PPS
- **Microsoft Visio**: VSD, VDX, VSDX, VSTX, VSS, VSSX, VSDM, VSSM, VSTM, VTX, VSX
- **OpenOffice**: ODT
- **Image**: BMP, GIF, JPG, JPEG, JPE, JP2, PNG, TIFF, WEBP
- **Portable**: PDF

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

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
    <version>19.12</version>
    <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/groupdocs-watermark-cloud-19.12.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.groupdocs.cloud.watermark.client.*;
import com.groupdocs.cloud.watermark.model.*;
import com.groupdocs.cloud.watermark.api.WatermarkApi;

import java.util.*;

public class ApiExample {

    public static void main(String[] args) {
        //TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).
        String appSid = "XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX";
        String appKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

        Configuration configuration = new Configuration(appSid, appKey);

        WatermarkApi watermarkApi = new WatermarkApi(configuration);

        try {
            FormatsResult response = watermarkApi.getSupportedFileFormats();
            for (Format format : response.getFormats()) {
                System.out.println(format.getFileFormat());
            }
        } catch (ApiException e) {
            System.err.println("Failed to get supported file formats");
            e.printStackTrace();
        }
    }
}
```

## Licensing
All GroupDocs.Watermark Cloud SDKs are licensed under [MIT License](LICENSE).

[Home](https://www.groupdocs.cloud/) | [Product Page](https://products.groupdocs.cloud/watermark/java) | [Docs](https://docs.groupdocs.cloud/watermark/) | [Demos](https://products.groupdocs.app/watermark/family) | [API Reference](https://apireference.groupdocs.cloud/watermark/) | [Examples](https://github.com/groupdocs-watermark-cloud/groupdocs-watermark-cloud-java-samples) | [Blog](https://blog.groupdocs.cloud/category/watermark/) | [Free Support](https://forum.groupdocs.cloud/c/watermark) | [Free Trial](https://purchase.groupdocs.cloud/trial)
