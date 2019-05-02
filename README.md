![](https://jitpack.io/v/NetoDevel/spring-boot-service-bus-mock.svg)

# Spring Boot Azure Service Bus Mock
A mock to use the azure bus service in spring boot applications, with this library you do not need to connect to an real azure-service-bus service to run your tests.

# Install
Add the dependency

```maven
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.NetoDevel</groupId>
    <artifactId>spring-boot-service-bus-mock</artifactId>
    <version>1.0.0</version>
    <scope>test</scope>
</dependency>
```

# Usage
Add the property below in your test properties.

```
azure.mock=true
```

# Output
when running your tests with the `azure.mock=true` option, this log will be printed on the terminal.

```
Azure Service Bus Mock enable = true. Intercepted QueueClient Bean
```

# Sample
See this [project](https://github.com/NetoDevel/spring-boot-service-bus-mock/tree/master/azure-spring-boot-sample) using the mock of the Azure Service Bus.





