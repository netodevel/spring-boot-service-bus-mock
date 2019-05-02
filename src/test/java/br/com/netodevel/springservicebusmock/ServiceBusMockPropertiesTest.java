package br.com.netodevel.springservicebusmock;


import org.junit.Test;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ServiceBusMockPropertiesTest {

    public static final String AZURE_SERVICEBUS_MOCK_PROPERTY = "azure.mock";

    @Configuration
    @EnableConfigurationProperties(ServiceBusMockProperties.class)
    static class Config {
    }

    @Test
    public void givenMockEnableShouldReturnTrue() {
        System.setProperty(AZURE_SERVICEBUS_MOCK_PROPERTY, "true");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();

        final ServiceBusMockProperties serviceBusMockProperties = context.getBean(ServiceBusMockProperties.class);
        assertTrue(serviceBusMockProperties.isMock());
    }

    @Test
    public void givenMockDisableShouldReturnFalse() {
        System.setProperty(AZURE_SERVICEBUS_MOCK_PROPERTY, "false");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();

        final ServiceBusMockProperties serviceBusMockProperties = context.getBean(ServiceBusMockProperties.class);
        assertFalse(serviceBusMockProperties.isMock());
    }

}
