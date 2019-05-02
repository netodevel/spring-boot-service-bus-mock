package br.com.netodevel.springservicebusmock;

import com.microsoft.azure.servicebus.IQueueClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Slf4j
@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE)
@Configuration
@EnableConfigurationProperties(ServiceBusMockProperties.class)
@ConditionalOnProperty(prefix = "azure", value = "mock", havingValue = "true")
public class ServiceBusMockAutoConfiguration {

    @Autowired
    private ServiceBusMockProperties serviceBusMockProperties;

//    public ServiceBusMockAutoConfiguration(ServiceBusMockProperties serviceBusMockProperties) {
//        this.serviceBusMockProperties = serviceBusMockProperties;
//    }

    @Bean
    public IQueueClient queueClient() {
        log.info("Azure Service Bus Mock enable = {}. Intercepted QueueClient Bean", serviceBusMockProperties.isMock());
        return new QueueClientMock();
    }
}
