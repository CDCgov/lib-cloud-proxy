package gov.cdc.dex.cloud;

import io.micronaut.context.annotation.ConfigurationBuilder;
import io.micronaut.context.annotation.ConfigurationProperties;

@io.micronaut.context.annotation.ConfigurationProperties(value = "azure")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0003\u001a\u00060\u0004R\u00020\u00008\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00060\bR\u00020\u00008\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2 = {"Lgov/cdc/dex/cloud/AzureConfig;", "", "()V", "asq", "Lgov/cdc/dex/cloud/AzureConfig$ASQConfig;", "getAsq", "()Lgov/cdc/dex/cloud/AzureConfig$ASQConfig;", "blob", "Lgov/cdc/dex/cloud/AzureConfig$BlobConfig;", "getBlob", "()Lgov/cdc/dex/cloud/AzureConfig$BlobConfig;", "blobHealth", "Lgov/cdc/dex/cloud/AzureConfig$HealthConfig;", "getBlobHealth", "()Lgov/cdc/dex/cloud/AzureConfig$HealthConfig;", "sqsHealth", "getSqsHealth", "setSqsHealth", "(Lgov/cdc/dex/cloud/AzureConfig$HealthConfig;)V", "toString", "", "ASQConfig", "BlobConfig", "HealthConfig", "lib-cloud-proxy"})
public final class AzureConfig {
    @io.micronaut.context.annotation.ConfigurationBuilder(configurationPrefix = "blob")
    @org.jetbrains.annotations.NotNull
    private final gov.cdc.dex.cloud.AzureConfig.BlobConfig blob = null;
    @io.micronaut.context.annotation.ConfigurationBuilder(configurationPrefix = "blob.health")
    @org.jetbrains.annotations.NotNull
    private final gov.cdc.dex.cloud.AzureConfig.HealthConfig blobHealth = null;
    @io.micronaut.context.annotation.ConfigurationBuilder(configurationPrefix = "asq")
    @org.jetbrains.annotations.NotNull
    private final gov.cdc.dex.cloud.AzureConfig.ASQConfig asq = null;
    @io.micronaut.context.annotation.ConfigurationBuilder(configurationPrefix = "asq.health")
    @org.jetbrains.annotations.NotNull
    private gov.cdc.dex.cloud.AzureConfig.HealthConfig sqsHealth;
    
    public AzureConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final gov.cdc.dex.cloud.AzureConfig.BlobConfig getBlob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final gov.cdc.dex.cloud.AzureConfig.HealthConfig getBlobHealth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final gov.cdc.dex.cloud.AzureConfig.ASQConfig getAsq() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final gov.cdc.dex.cloud.AzureConfig.HealthConfig getSqsHealth() {
        return null;
    }
    
    public final void setSqsHealth(@org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.AzureConfig.HealthConfig p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017\u00a8\u0006\u001f"}, d2 = {"Lgov/cdc/dex/cloud/AzureConfig$ASQConfig;", "", "(Lgov/cdc/dex/cloud/AzureConfig;)V", "apiCallAttemptTimeoutSeconds", "", "getApiCallAttemptTimeoutSeconds", "()J", "setApiCallAttemptTimeoutSeconds", "(J)V", "apiCallTimeoutSeconds", "getApiCallTimeoutSeconds", "setApiCallTimeoutSeconds", "connectionStr", "", "getConnectionStr", "()Ljava/lang/String;", "setConnectionStr", "(Ljava/lang/String;)V", "maxNumberOfMessages", "", "getMaxNumberOfMessages", "()I", "setMaxNumberOfMessages", "(I)V", "queueName", "getQueueName", "setQueueName", "waitTimeSeconds", "getWaitTimeSeconds", "setWaitTimeSeconds", "toString", "lib-cloud-proxy"})
    public final class ASQConfig {
        @org.jetbrains.annotations.Nullable
        private java.lang.String queueName;
        @org.jetbrains.annotations.Nullable
        private java.lang.String connectionStr;
        private long apiCallTimeoutSeconds = 60L;
        private long apiCallAttemptTimeoutSeconds = 20L;
        private int maxNumberOfMessages = 1;
        private int waitTimeSeconds = 5;
        
        public ASQConfig() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getQueueName() {
            return null;
        }
        
        public final void setQueueName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getConnectionStr() {
            return null;
        }
        
        public final void setConnectionStr(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        public final long getApiCallTimeoutSeconds() {
            return 0L;
        }
        
        public final void setApiCallTimeoutSeconds(long p0) {
        }
        
        public final long getApiCallAttemptTimeoutSeconds() {
            return 0L;
        }
        
        public final void setApiCallAttemptTimeoutSeconds(long p0) {
        }
        
        public final int getMaxNumberOfMessages() {
            return 0;
        }
        
        public final void setMaxNumberOfMessages(int p0) {
        }
        
        public final int getWaitTimeSeconds() {
            return 0;
        }
        
        public final void setWaitTimeSeconds(int p0) {
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\r"}, d2 = {"Lgov/cdc/dex/cloud/AzureConfig$BlobConfig;", "", "(Lgov/cdc/dex/cloud/AzureConfig;)V", "connectStr", "", "getConnectStr", "()Ljava/lang/String;", "setConnectStr", "(Ljava/lang/String;)V", "container", "getContainer", "setContainer", "toString", "lib-cloud-proxy"})
    public final class BlobConfig {
        @org.jetbrains.annotations.Nullable
        private java.lang.String container;
        @org.jetbrains.annotations.Nullable
        private java.lang.String connectStr;
        
        public BlobConfig() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getContainer() {
            return null;
        }
        
        public final void setContainer(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getConnectStr() {
            return null;
        }
        
        public final void setConnectStr(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lgov/cdc/dex/cloud/AzureConfig$HealthConfig;", "", "()V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "lib-cloud-proxy"})
    public static final class HealthConfig {
        private boolean enabled = false;
        
        public HealthConfig() {
            super();
        }
        
        public final boolean getEnabled() {
            return false;
        }
        
        public final void setEnabled(boolean p0) {
        }
    }
}