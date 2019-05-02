package br.com.azure.publisher.azurespringboot;

import com.microsoft.azure.servicebus.*;
import com.microsoft.azure.servicebus.primitives.ServiceBusException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

@SpringBootApplication
public class AzureSpringBootApplication implements CommandLineRunner {

    @Autowired
    private IQueueClient queuClient;

    public static void main(String[] args) {
        SpringApplication.run(AzureSpringBootApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        receiveSubscriptionMessage();
    }

    private void receiveSubscriptionMessage() throws ServiceBusException, InterruptedException {
        queuClient.registerMessageHandler(new MessageHandler(queuClient),
                new MessageHandlerOptions(1, false, Duration.ofMinutes(5)));
    }

    @Component
    static class MessageHandler implements IMessageHandler {

        private IQueueClient queuClient;

        public MessageHandler(IQueueClient queuClient) {
            this.queuClient = queuClient;
        }

        public CompletableFuture<Void> onMessageAsync(IMessage message) {
            final String messageString = new String(message.getBody(), StandardCharsets.UTF_8);
            System.out.println("----------------------------------------");
            System.out.println("message body -------->: " + messageString);
            System.out.println("message label -------->: " + message.getLabel());
            System.out.println("----------------------------------------");
            queuClient.completeAsync(message.getLockToken());
            return CompletableFuture.completedFuture(null);
        }

        public void notifyException(Throwable exception, ExceptionPhase phase) {
            System.out.println(phase + " encountered exception:" + exception.getMessage());
        }
    }

}
