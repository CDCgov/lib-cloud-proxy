package gov.cdc.dex.cloud.storage.azure;

import gov.cdc.dex.cloud.AzureConfig;
import gov.cdc.dex.cloud.messaging.aws.SQSHealth;
import io.micronaut.context.annotation.Requires;
import io.micronaut.health.HealthStatus;
import io.micronaut.management.health.indicator.HealthIndicator;
import io.micronaut.management.health.indicator.HealthResult;
import org.reactivestreams.Publisher;
import org.slf4j.LoggerFactory;
import javax.inject.Singleton;

@javax.inject.Singleton
@io.micronaut.context.annotation.Requires(property = "azure.blob.health.enabled", value = "true", defaultValue = "false")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lgov/cdc/dex/cloud/storage/azure/BlobHealth;", "Lio/micronaut/management/health/indicator/HealthIndicator;", "blobProxy", "Lgov/cdc/dex/cloud/storage/azure/BlobProxy;", "azureConfig", "Lgov/cdc/dex/cloud/AzureConfig;", "(Lgov/cdc/dex/cloud/storage/azure/BlobProxy;Lgov/cdc/dex/cloud/AzureConfig;)V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getResult", "Lorg/reactivestreams/Publisher;", "Lio/micronaut/management/health/indicator/HealthResult;", "lib-cloud-proxy"})
public final class BlobHealth implements io.micronaut.management.health.indicator.HealthIndicator {
    @org.jetbrains.annotations.NotNull
    private final gov.cdc.dex.cloud.storage.azure.BlobProxy blobProxy = null;
    @org.jetbrains.annotations.NotNull
    private final gov.cdc.dex.cloud.AzureConfig azureConfig = null;
    private final org.slf4j.Logger logger = null;
    
    public BlobHealth(@org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.storage.azure.BlobProxy blobProxy, @org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.AzureConfig azureConfig) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.reactivestreams.Publisher<io.micronaut.management.health.indicator.HealthResult> getResult() {
        return null;
    }
}