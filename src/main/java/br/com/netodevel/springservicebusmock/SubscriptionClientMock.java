package br.com.netodevel.springservicebusmock;

import com.microsoft.azure.servicebus.*;
import com.microsoft.azure.servicebus.primitives.ServiceBusException;
import com.microsoft.azure.servicebus.rules.Filter;
import com.microsoft.azure.servicebus.rules.RuleDescription;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class SubscriptionClientMock implements ISubscriptionClient {

    @Override
    public ReceiveMode getReceiveMode() {
        return null;
    }

    @Override
    public void addRule(RuleDescription ruleDescription) throws InterruptedException, ServiceBusException {

    }

    @Override
    public CompletableFuture<Void> addRuleAsync(RuleDescription ruleDescription) {
        return null;
    }

    @Override
    public void addRule(String ruleName, Filter filter) throws InterruptedException, ServiceBusException {

    }

    @Override
    public CompletableFuture<Void> addRuleAsync(String ruleName, Filter filter) {
        return null;
    }

    @Override
    public CompletableFuture<Void> removeRuleAsync(String ruleName) {
        return null;
    }

    @Override
    public void removeRule(String ruleName) throws InterruptedException, ServiceBusException {

    }

    @Override
    public Collection<RuleDescription> getRules() throws ServiceBusException, InterruptedException {
        return null;
    }

    @Override
    public CompletableFuture<Collection<RuleDescription>> getRulesAsync() {
        return null;
    }

    @Override
    public String getTopicName() {
        return null;
    }

    @Override
    public String getSubscriptionName() {
        return null;
    }

    @Override
    public void registerMessageHandler(IMessageHandler handler) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void registerMessageHandler(IMessageHandler handler, MessageHandlerOptions handlerOptions) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void registerSessionHandler(ISessionHandler handler) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void registerSessionHandler(ISessionHandler handler, SessionHandlerOptions handlerOptions) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void abandon(UUID lockToken) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void abandon(UUID lockToken, Map<String, Object> propertiesToModify) throws InterruptedException, ServiceBusException {

    }

    @Override
    public CompletableFuture<Void> abandonAsync(UUID lockToken) {
        return null;
    }

    @Override
    public CompletableFuture<Void> abandonAsync(UUID lockToken, Map<String, Object> propertiesToModify) {
        return null;
    }

    @Override
    public void complete(UUID lockToken) throws InterruptedException, ServiceBusException {

    }

    @Override
    public CompletableFuture<Void> completeAsync(UUID lockToken) {
        return null;
    }

    @Override
    public CompletableFuture<Void> deferAsync(UUID lockToken) {
        return null;
    }

    @Override
    public CompletableFuture<Void> deferAsync(UUID lockToken, Map<String, Object> propertiesToModify) {
        return null;
    }

    @Override
    public void deadLetter(UUID lockToken) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void deadLetter(UUID lockToken, Map<String, Object> propertiesToModify) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void deadLetter(UUID lockToken, String deadLetterReason, String deadLetterErrorDescription) throws InterruptedException, ServiceBusException {

    }

    @Override
    public void deadLetter(UUID lockToken, String deadLetterReason, String deadLetterErrorDescription, Map<String, Object> propertiesToModify) throws InterruptedException, ServiceBusException {

    }

    @Override
    public CompletableFuture<Void> deadLetterAsync(UUID lockToken) {
        return null;
    }

    @Override
    public CompletableFuture<Void> deadLetterAsync(UUID lockToken, Map<String, Object> propertiesToModify) {
        return null;
    }

    @Override
    public CompletableFuture<Void> deadLetterAsync(UUID lockToken, String deadLetterReason, String deadLetterErrorDescription) {
        return null;
    }

    @Override
    public CompletableFuture<Void> deadLetterAsync(UUID lockToken, String deadLetterReason, String deadLetterErrorDescription, Map<String, Object> propertiesToModify) {
        return null;
    }

    @Override
    public int getPrefetchCount() {
        return 0;
    }

    @Override
    public void setPrefetchCount(int prefetchCount) throws ServiceBusException {

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
