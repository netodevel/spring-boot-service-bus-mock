package br.com.netodevel.springservicebusmock;

import com.microsoft.azure.servicebus.IQueueClient;
import org.junit.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import static junit.framework.TestCase.assertNotNull;

public class ServiceBusMockAutoConfigurationTest {

    public static final String AZURE_SERVICEBUS_MOCK_PROPERTY = "azure.mock";

    @Configuration
    @EnableConfigurationProperties(ServiceBusMockProperties.class)
    static class Config {
    }

    @Test
    public void givenEnableMockShouldReturnIQueueClientBean() {
        System.setProperty(AZURE_SERVICEBUS_MOCK_PROPERTY, "true");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.register(ServiceBusMockAutoConfiguration.class);
        context.refresh();

        final IQueueClient iQueueClient = context.getBean(IQueueClient.class);
        assertNotNull(iQueueClient);
    }

    @Test(expected = NoSuchBeanDefinitionException.class)
    public void givenDisableMockShouldInvokeException() {
        System.setProperty(AZURE_SERVICEBUS_MOCK_PROPERTY, "false");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.register(ServiceBusMockAutoConfiguration.class);
        context.refresh();

        context.getBean(IQueueClient.class);
    }
}
