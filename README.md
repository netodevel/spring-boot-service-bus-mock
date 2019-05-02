![](https://jitpack.io/v/NetoDevel/spring-boot-service-bus-mock.svg)

# Spring Boot Azure Service Bus Mock
A mock to use the azure bus service in spring boot applications

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
azure.mock = true
```


