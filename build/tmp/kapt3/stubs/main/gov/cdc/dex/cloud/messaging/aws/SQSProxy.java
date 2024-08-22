package gov.cdc.dex.cloud.messaging.aws;

import gov.cdc.dex.cloud.AWSConfig;
import gov.cdc.dex.cloud.Providers;
import gov.cdc.dex.cloud.messaging.CloudMessage;
import gov.cdc.dex.cloud.messaging.CloudMessaging;
import io.micrometer.core.instrument.MeterRegistry;
import io.micronaut.context.annotation.Requires;
import org.slf4j.LoggerFactory;
import software.amazon.awssdk.core.retry.RetryMode;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsClient;
import java.time.Duration;
import javax.inject.Singleton;

@javax.inject.Singleton
@io.micronaut.context.annotation.Requires(property = "aws.sqs")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0017\"\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \t*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lgov/cdc/dex/cloud/messaging/aws/SQSProxy;", "Lgov/cdc/dex/cloud/messaging/CloudMessaging;", "awsConfig", "Lgov/cdc/dex/cloud/AWSConfig;", "meterRegistry", "Lio/micrometer/core/instrument/MeterRegistry;", "(Lgov/cdc/dex/cloud/AWSConfig;Lio/micrometer/core/instrument/MeterRegistry;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "queueUrl", "", "sqsClient", "Lsoftware/amazon/awssdk/services/sqs/SqsClient;", "deleteMessage", "message", "Lgov/cdc/dex/cloud/messaging/CloudMessage;", "getQueueUrl", "queueName", "healthCheck", "listQueues", "", "prefixes", "", "([Ljava/lang/String;)Ljava/util/List;", "provider", "Lgov/cdc/dex/cloud/Providers;", "receiveMessage", "timeoutMessage", "timeout", "", "toString", "lib-cloud-proxy"})
public final class SQSProxy implements gov.cdc.dex.cloud.messaging.CloudMessaging {
    @org.jetbrains.annotations.NotNull
    private final gov.cdc.dex.cloud.AWSConfig awsConfig = null;
    @org.jetbrains.annotations.Nullable
    private final io.micrometer.core.instrument.MeterRegistry meterRegistry = null;
    private final org.slf4j.Logger logger = null;
    private final software.amazon.awssdk.services.sqs.SqsClient sqsClient = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String queueUrl = null;
    
    public SQSProxy(@org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.AWSConfig awsConfig, @org.jetbrains.annotations.Nullable
    io.micrometer.core.instrument.MeterRegistry meterRegistry) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public gov.cdc.dex.cloud.Providers provider() {
        return null;
    }
    
    /**
     * This was introduced to be able to provide a 'silent' call to the aws sqs api
     */
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String healthCheck() {
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
    public java.lang.String getQueueUrl() {
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
    public java.lang.String toString() {
        return null;
    }
}