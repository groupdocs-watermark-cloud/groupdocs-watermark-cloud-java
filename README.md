# GroupDocs.Watermark Cloud SDK for Java
This repository contains GroupDocs.Watermark Cloud SDK for Java source code. This SDK allows you to work with GroupDocs.Watermark Cloud REST APIs in your Java applications.

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
