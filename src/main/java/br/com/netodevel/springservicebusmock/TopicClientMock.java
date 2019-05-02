package br.com.netodevel.springservicebusmock;

import com.microsoft.azure.servicebus.IMessage;
import com.microsoft.azure.servicebus.ITopicClient;
import com.microsoft.azure.servicebus.primitives.ServiceBusException;

import java.time.Instant;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

public class TopicClientMock implements ITopicClient {

    @Override
    public String getTopicName() {
        return null;
    }

    @Override
    public IMessage peek() throws InterruptedException, ServiceBusException {
        return null;
    }

    @Override
    public IMessage peek(long fromSequenceNumber) throws InterruptedException, ServiceBusException {
        return null;
    }

    @Override
    public Collection<IMessage> peekBatch(int messageCount) throws InterruptedException, ServiceBusException {
        return null;
    }

    @Override
    public Collection<IMessage> peekBatch(long fromSequenceNumber, int messageCount) throws InterruptedException, ServiceBusException {
        return null;
    }

    @Override
    public CompletableFuture<IMessage> peekAsync() {
        return null;
    }

    @Override
    public CompletableFuture<IMessage> peekAsync(long fromSequenceNumber) {
        return null;
    }

    @Override
    public CompletableFuture<Collection<IMessage>> peekBatchAsync(int messageCount) {
        return null;
    }

    @Override
    public CompletableFuture<Collection<IMessage>> peekBatchAsync(long fromSequenceNumber, int messageCount) {
        return null;
    }

    @Override
    public void send(IMessage message) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void sendBatch(Collection<? extends IMessage> messages) throws InterruptedException, ServiceBusException {

    }

    @Override
    public CompletableFuture<Void> sendAsync(IMessage message) {
        return null;
    }

    @Override
    public CompletableFuture<Void> sendBatchAsync(Collection<? extends IMessage> messages) {
        return null;
    }

    @Override
    public CompletableFuture<Long> scheduleMessageAsync(IMessage message, Instant scheduledEnqueueTimeUtc) {
        return null;
    }

    @Override
    public CompletableFuture<Void> cancelScheduledMessageAsync(long sequenceNumber) {
        return null;
    }

    @Override
    public long scheduleMessage(IMessage message, Instant scheduledEnqueueTimeUtc) throws InterruptedException, ServiceBusException {
        return 0;
    }

    @Override
    public void cancelScheduledMessage(long sequenceNumber) throws InterruptedException, ServiceBusException {

    }

    @Override
    public String getEntityPath() {
        return null;
    }

    @Override
    public CompletableFuture<Void> closeAsync() {
        return null;
    }

    @Override
    public void close() throws ServiceBusException {

    }
}
