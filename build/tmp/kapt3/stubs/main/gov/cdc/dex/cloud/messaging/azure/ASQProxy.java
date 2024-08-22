package gov.cdc.dex.cloud.messaging.azure;

import com.azure.storage.queue.QueueClientBuilder;
import gov.cdc.dex.cloud.AzureConfig;
import gov.cdc.dex.cloud.Providers;
import gov.cdc.dex.cloud.messaging.CloudMessage;
import gov.cdc.dex.cloud.messaging.CloudMessaging;
import io.micrometer.core.instrument.MeterRegistry;
import io.micronaut.context.annotation.Requires;
import org.slf4j.LoggerFactory;
import java.time.Duration;
import java.util.*;
import javax.inject.Singleton;

@javax.inject.Singleton
@io.micronaut.context.annotation.Requires(property = "azure.asq")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0016\"\u00020\rH\u0016\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0016J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0018\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lgov/cdc/dex/cloud/messaging/azure/ASQProxy;", "Lgov/cdc/dex/cloud/messaging/CloudMessaging;", "azureConfig", "Lgov/cdc/dex/cloud/AzureConfig;", "meterRegistry", "Lio/micrometer/core/instrument/MeterRegistry;", "(Lgov/cdc/dex/cloud/AzureConfig;Lio/micrometer/core/instrument/MeterRegistry;)V", "asqClient", "Lcom/azure/storage/queue/QueueClient;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "deleteMessage", "", "message", "Lgov/cdc/dex/cloud/messaging/CloudMessage;", "getQueueUrl", "queueName", "healthCheck", "listQueues", "", "prefixes", "", "([Ljava/lang/String;)Ljava/util/List;", "provider", "Lgov/cdc/dex/cloud/Providers;", "receiveMessage", "timeoutMessage", "timeout", "", "lib-cloud-proxy"})
public final class ASQProxy implements gov.cdc.dex.cloud.messaging.CloudMessaging {
    @org.jetbrains.annotations.NotNull
    private final gov.cdc.dex.cloud.AzureConfig azureConfig = null;
    @org.jetbrains.annotations.Nullable
    private final io.micrometer.core.instrument.MeterRegistry meterRegistry = null;
    private final org.slf4j.Logger logger = null;
    private final com.azure.storage.queue.QueueClient asqClient = null;
    
    public ASQProxy(@org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.AzureConfig azureConfig, @org.jetbrains.annotations.Nullable
    io.micrometer.core.instrument.MeterRegistry meterRegistry) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public gov.cdc.dex.cloud.Providers provider() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.String> listQueues(@org.jetbrains.annotations.NotNull
    java.lang.String... prefixes) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getQueueUrl(@org.jetbrains.annotations.NotNull
    java.lang.String queueName) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getQueueUrl() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<gov.cdc.dex.cloud.messaging.CloudMessage> receiveMessage() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<gov.cdc.dex.cloud.messaging.CloudMessage> receiveMessage(@org.jetbrains.annotations.NotNull
    java.lang.String queueName) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String deleteMessage(@org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.messaging.CloudMessage message) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String timeoutMessage(@org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.messaging.CloudMessage message, int timeout) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String healthCheck() {
        return null;
    }
}