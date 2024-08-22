package gov.cdc.dex.cloud;

import io.micronaut.context.annotation.ConfigurationBuilder;
import io.micronaut.context.annotation.ConfigurationProperties;

@io.micronaut.context.annotation.ConfigurationProperties(value = "aws")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00060\nR\u00020\u00008\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00060\u000eR\u00020\u00008\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00060\u0014R\u00020\u00008\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00060\u000eR\u00020\u00008\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lgov/cdc/dex/cloud/AWSConfig;", "", "()V", "region", "", "getRegion", "()Ljava/lang/String;", "setRegion", "(Ljava/lang/String;)V", "s3", "Lgov/cdc/dex/cloud/AWSConfig$S3Config;", "getS3", "()Lgov/cdc/dex/cloud/AWSConfig$S3Config;", "s3Health", "Lgov/cdc/dex/cloud/AWSConfig$HealthConfig;", "getS3Health", "()Lgov/cdc/dex/cloud/AWSConfig$HealthConfig;", "setS3Health", "(Lgov/cdc/dex/cloud/AWSConfig$HealthConfig;)V", "sqs", "Lgov/cdc/dex/cloud/AWSConfig$SQSConfig;", "getSqs", "()Lgov/cdc/dex/cloud/AWSConfig$SQSConfig;", "sqsHealth", "getSqsHealth", "setSqsHealth", "toString", "HealthConfig", "S3Config", "SQSConfig", "lib-cloud-proxy"})
public final class AWSConfig {
    @org.jetbrains.annotations.NotNull
    private java.lang.String region = "us-east-1";
    @io.micronaut.context.annotation.ConfigurationBuilder(configurationPrefix = "s3")
    @org.jetbrains.annotations.NotNull
    private final gov.cdc.dex.cloud.AWSConfig.S3Config s3 = null;
    @io.micronaut.context.annotation.ConfigurationBuilder(configurationPrefix = "s3.health")
    @org.jetbrains.annotations.NotNull
    private gov.cdc.dex.cloud.AWSConfig.HealthConfig s3Health;
    @io.micronaut.context.annotation.ConfigurationBuilder(configurationPrefix = "sqs")
    @org.jetbrains.annotations.NotNull
    private final gov.cdc.dex.cloud.AWSConfig.SQSConfig sqs = null;
    @io.micronaut.context.annotation.ConfigurationBuilder(configurationPrefix = "sqs.health")
    @org.jetbrains.annotations.NotNull
    private gov.cdc.dex.cloud.AWSConfig.HealthConfig sqsHealth;
    
    public AWSConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRegion() {
        return null;
    }
    
    public final void setRegion(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final gov.cdc.dex.cloud.AWSConfig.S3Config getS3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final gov.cdc.dex.cloud.AWSConfig.HealthConfig getS3Health() {
        return null;
    }
    
    public final void setS3Health(@org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.AWSConfig.HealthConfig p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final gov.cdc.dex.cloud.AWSConfig.SQSConfig getSqs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final gov.cdc.dex.cloud.AWSConfig.HealthConfig getSqsHealth() {
        return null;
    }
    
    public final void setSqsHealth(@org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.AWSConfig.HealthConfig p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lgov/cdc/dex/cloud/AWSConfig$HealthConfig;", "", "(Lgov/cdc/dex/cloud/AWSConfig;)V", "enabled", "", "getEnabled", "()Z", "setEnabled", "(Z)V", "lib-cloud-proxy"})
    public final class HealthConfig {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lgov/cdc/dex/cloud/AWSConfig$S3Config;", "", "(Lgov/cdc/dex/cloud/AWSConfig;)V", "apiCallAttemptTimeoutSeconds", "", "getApiCallAttemptTimeoutSeconds", "()J", "setApiCallAttemptTimeoutSeconds", "(J)V", "apiCallTimeoutSeconds", "getApiCallTimeoutSeconds", "setApiCallTimeoutSeconds", "bucket", "", "getBucket", "()Ljava/lang/String;", "setBucket", "(Ljava/lang/String;)V", "toString", "lib-cloud-proxy"})
    public final class S3Config {
        @org.jetbrains.annotations.Nullable
        private java.lang.String bucket;
        private long apiCallTimeoutSeconds = 60L;
        private long apiCallAttemptTimeoutSeconds = 20L;
        
        public S3Config() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getBucket() {
            return null;
        }
        
        public final void setBucket(@org.jetbrains.annotations.Nullable
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
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lgov/cdc/dex/cloud/AWSConfig$SQSConfig;", "", "(Lgov/cdc/dex/cloud/AWSConfig;)V", "apiCallAttemptTimeoutSeconds", "", "getApiCallAttemptTimeoutSeconds", "()J", "setApiCallAttemptTimeoutSeconds", "(J)V", "apiCallTimeoutSeconds", "getApiCallTimeoutSeconds", "setApiCallTimeoutSeconds", "maxNumberOfMessages", "", "getMaxNumberOfMessages", "()I", "setMaxNumberOfMessages", "(I)V", "queueName", "", "getQueueName", "()Ljava/lang/String;", "setQueueName", "(Ljava/lang/String;)V", "waitTimeSeconds", "getWaitTimeSeconds", "setWaitTimeSeconds", "toString", "lib-cloud-proxy"})
    public final class SQSConfig {
        @org.jetbrains.annotations.Nullable
        private java.lang.String queueName;
        private long apiCallTimeoutSeconds = 60L;
        private long apiCallAttemptTimeoutSeconds = 20L;
        private int maxNumberOfMessages = 1;
        private int waitTimeSeconds = 5;
        
        public SQSConfig() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getQueueName() {
            return null;
        }
        
        public final void setQueueName(@org.jetbrains.annotations.Nullable
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
}