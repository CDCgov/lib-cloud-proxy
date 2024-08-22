package gov.cdc.dex.cloud.messaging;

import gov.cdc.dex.cloud.ProviderMeta;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\f\"\u00020\u0003H&\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0007\u001a\u00020\u0003H&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&\u00a8\u0006\u0012"}, d2 = {"Lgov/cdc/dex/cloud/messaging/CloudMessaging;", "Lgov/cdc/dex/cloud/ProviderMeta;", "deleteMessage", "", "message", "Lgov/cdc/dex/cloud/messaging/CloudMessage;", "getQueueUrl", "queueName", "healthCheck", "listQueues", "", "prefixes", "", "([Ljava/lang/String;)Ljava/util/List;", "receiveMessage", "timeoutMessage", "timeout", "", "lib-cloud-proxy"})
public abstract interface CloudMessaging extends gov.cdc.dex.cloud.ProviderMeta {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.lang.String> listQueues(@org.jetbrains.annotations.NotNull
    java.lang.String... prefixes);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getQueueUrl(@org.jetbrains.annotations.NotNull
    java.lang.String queueName);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getQueueUrl();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<gov.cdc.dex.cloud.messaging.CloudMessage> receiveMessage();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<gov.cdc.dex.cloud.messaging.CloudMessage> receiveMessage(@org.jetbrains.annotations.NotNull
    java.lang.String queueName);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String deleteMessage(@org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.messaging.CloudMessage message);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String timeoutMessage(@org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.messaging.CloudMessage message, int timeout);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String healthCheck();
}