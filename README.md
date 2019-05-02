![](https://jitpack.io/v/NetoDevel/spring-boot-service-bus-mock.svg)

# Spring Boot Azure Service Bus Mock
A library to mock azure service bus in spring boot applications.
With this library, you won't need to connect to a real azure-service-bus service to run your tests.

# Install
Add the following dependency to your pom.xml file.

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.NetoDevel</groupId>
    <artifactId>spring-boot-service-bus-mock</artifactId>
    <version>0.1.1</version>
    <scope>test</scope>
</dependency>
```

# Usage
Add the following option to your tests properties.

```
azure.mock=true
```

# Output
When running your tests with the `azure.mock=true` option, this log will be printed on the terminal.

```
Azure Service Bus Mock enable = true. Intercepted QueueClient Bean
```

# Sample
See this [project](https://github.com/NetoDevel/spring-boot-service-bus-mock/tree/master/azure-spring-boot-sample) mocking an Azure Service Bus.





