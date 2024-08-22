package gov.cdc.dex.cloud.storage.azure;

import com.azure.core.http.rest.PagedResponse;
import com.azure.core.util.BinaryData;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.models.BlobItem;
import com.azure.storage.blob.models.BlobProperties;
import com.azure.storage.blob.models.ListBlobsOptions;
import gov.cdc.dex.cloud.AzureConfig;
import gov.cdc.dex.cloud.Providers;
import gov.cdc.dex.cloud.storage.CloudFile;
import gov.cdc.dex.cloud.storage.CloudStorage;
import io.micrometer.core.instrument.MeterRegistry;
import io.micronaut.context.annotation.Requires;
import org.slf4j.LoggerFactory;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.*;
import javax.inject.Singleton;

@javax.inject.Singleton
@io.micronaut.context.annotation.Requires(property = "azure.blob")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J,\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020\u000fH\u0016J \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0!2\u0006\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u000fH\u0016J(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0!2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u000fH\u0016J2\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0!2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010%\u001a\u00020&H\u0002J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000f0!H\u0016J\u0016\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000f0!2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010(\u001a\u00020)H\u0016J>\u0010*\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u0006\u00100\u001a\u00020\u000fH\u0016JF\u0010*\u001a\u00020+2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u0006\u00100\u001a\u00020\u000fH\u0016J>\u0010*\u001a\u00020+2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u0006\u00100\u001a\u00020\u000fH\u0016J6\u0010*\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00182\u0006\u00100\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lgov/cdc/dex/cloud/storage/azure/BlobProxy;", "Lgov/cdc/dex/cloud/storage/CloudStorage;", "azureConfig", "Lgov/cdc/dex/cloud/AzureConfig;", "meterRegistry", "Lio/micrometer/core/instrument/MeterRegistry;", "(Lgov/cdc/dex/cloud/AzureConfig;Lio/micrometer/core/instrument/MeterRegistry;)V", "blobServiceClient", "Lcom/azure/storage/blob/BlobServiceClient;", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "deleteFile", "", "fileName", "", "bucket", "getDefaultBucket", "getFile", "Lgov/cdc/dex/cloud/storage/CloudFile;", "getFileContent", "getFileContentAsInputStream", "Ljava/io/InputStream;", "getMetadata", "", "urlDecode", "", "getProperties", "Lcom/azure/storage/blob/models/BlobProperties;", "container", "key", "healthCheck", "list", "", "maxNumber", "prefix", "listByType", "blobListType", "Lgov/cdc/dex/cloud/storage/azure/BlobListType;", "listFolders", "provider", "Lgov/cdc/dex/cloud/Providers;", "saveFile", "", "content", "size", "", "metadata", "contentType", "lib-cloud-proxy"})
public final class BlobProxy implements gov.cdc.dex.cloud.storage.CloudStorage {
    @org.jetbrains.annotations.NotNull
    private final gov.cdc.dex.cloud.AzureConfig azureConfig = null;
    @org.jetbrains.annotations.Nullable
    private final io.micrometer.core.instrument.MeterRegistry meterRegistry = null;
    private final org.slf4j.Logger logger = null;
    @org.jetbrains.annotations.NotNull
    private final com.azure.storage.blob.BlobServiceClient blobServiceClient = null;
    
    public BlobProxy(@org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.AzureConfig azureConfig, @org.jetbrains.annotations.Nullable
    io.micrometer.core.instrument.MeterRegistry meterRegistry) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public gov.cdc.dex.cloud.Providers provider() {
        return null;
    }
    
    /**
     * This was introduced to be able to provide a 'silent' call to the aws s3 api
     */
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String healthCheck() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getDefaultBucket() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.String> list(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, int maxNumber, @org.jetbrains.annotations.Nullable
    java.lang.String prefix) {
        return null;
    }
    
    private final java.util.List<java.lang.String> listByType(java.lang.String bucket, int maxNumber, java.lang.String prefix, gov.cdc.dex.cloud.storage.azure.BlobListType blobListType) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.String> list(int maxNumber, @org.jetbrains.annotations.Nullable
    java.lang.String prefix) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.String> listFolders(@org.jetbrains.annotations.NotNull
    java.lang.String bucket) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.String> listFolders() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getFileContent(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public gov.cdc.dex.cloud.storage.CloudFile getFile(@org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getFileContent(@org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.io.InputStream getFileContentAsInputStream(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.io.InputStream getFileContentAsInputStream(@org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.Map<java.lang.String, java.lang.String> getMetadata(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName, boolean urlDecode) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.util.Map<java.lang.String, java.lang.String> getMetadata(@org.jetbrains.annotations.NotNull
    java.lang.String fileName, boolean urlDecode) {
        return null;
    }
    
    @java.lang.Override
    public void saveFile(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull
    java.lang.String contentType) {
    }
    
    @java.lang.Override
    public void saveFile(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    java.io.InputStream content, long size, @org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull
    java.lang.String contentType) {
    }
    
    @java.lang.Override
    public void saveFile(@org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull
    java.lang.String contentType) {
    }
    
    @java.lang.Override
    public void saveFile(@org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    java.io.InputStream content, long size, @org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull
    java.lang.String contentType) {
    }
    
    @java.lang.Override
    public int deleteFile(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return 0;
    }
    
    @java.lang.Override
    public int deleteFile(@org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return 0;
    }
    
    private final com.azure.storage.blob.models.BlobProperties getProperties(java.lang.String container, java.lang.String key) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public gov.cdc.dex.cloud.storage.CloudFile getFile(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName) {
        return null;
    }
}