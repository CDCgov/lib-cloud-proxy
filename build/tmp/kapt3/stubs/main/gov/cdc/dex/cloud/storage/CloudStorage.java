package gov.cdc.dex.cloud.storage;

import gov.cdc.dex.cloud.ProviderMeta;
import io.micronaut.http.MediaType;
import java.io.InputStream;

/**
 * @Created - 9/18/20
 * @Author Marcelo Caldas mcq1@cdc.gov
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&J.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0005H&J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005H&J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0006\u001a\u00020\u0005H&JB\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u0005H&JJ\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u0005H&JB\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u0005H&J:\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u0005H&\u00a8\u0006\u001e"}, d2 = {"Lgov/cdc/dex/cloud/storage/CloudStorage;", "Lgov/cdc/dex/cloud/ProviderMeta;", "deleteFile", "", "fileName", "", "bucket", "getDefaultBucket", "getFile", "Lgov/cdc/dex/cloud/storage/CloudFile;", "getFileContent", "getFileContentAsInputStream", "Ljava/io/InputStream;", "getMetadata", "", "urlDecode", "", "healthCheck", "list", "", "maxNumber", "prefix", "listFolders", "saveFile", "", "content", "size", "", "metadata", "contentType", "lib-cloud-proxy"})
public abstract interface CloudStorage extends gov.cdc.dex.cloud.ProviderMeta {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.lang.String> list(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, int maxNumber, @org.jetbrains.annotations.Nullable
    java.lang.String prefix);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.lang.String> list(int maxNumber, @org.jetbrains.annotations.Nullable
    java.lang.String prefix);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.lang.String> listFolders(@org.jetbrains.annotations.NotNull
    java.lang.String bucket);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<java.lang.String> listFolders();
    
    @org.jetbrains.annotations.NotNull
    public abstract gov.cdc.dex.cloud.storage.CloudFile getFile(@org.jetbrains.annotations.NotNull
    java.lang.String fileName);
    
    @org.jetbrains.annotations.NotNull
    public abstract gov.cdc.dex.cloud.storage.CloudFile getFile(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getFileContent(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getFileContent(@org.jetbrains.annotations.NotNull
    java.lang.String fileName);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.io.InputStream getFileContentAsInputStream(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.io.InputStream getFileContentAsInputStream(@org.jetbrains.annotations.NotNull
    java.lang.String fileName);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Map<java.lang.String, java.lang.String> getMetadata(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName, boolean urlDecode);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.Map<java.lang.String, java.lang.String> getMetadata(@org.jetbrains.annotations.NotNull
    java.lang.String fileName, boolean urlDecode);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getDefaultBucket();
    
    public abstract void saveFile(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull
    java.lang.String contentType);
    
    public abstract void saveFile(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    java.io.InputStream content, long size, @org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull
    java.lang.String contentType);
    
    public abstract void saveFile(@org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull
    java.lang.String contentType);
    
    public abstract void saveFile(@org.jetbrains.annotations.NotNull
    java.lang.String fileName, @org.jetbrains.annotations.NotNull
    java.io.InputStream content, long size, @org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, java.lang.String> metadata, @org.jetbrains.annotations.NotNull
    java.lang.String contentType);
    
    public abstract int deleteFile(@org.jetbrains.annotations.NotNull
    java.lang.String bucket, @org.jetbrains.annotations.NotNull
    java.lang.String fileName);
    
    public abstract int deleteFile(@org.jetbrains.annotations.NotNull
    java.lang.String fileName);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String healthCheck();
    
    /**
     * @Created - 9/18/20
     * @Author Marcelo Caldas mcq1@cdc.gov
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull
        public static gov.cdc.dex.cloud.storage.CloudFile getFile(@org.jetbrains.annotations.NotNull
        gov.cdc.dex.cloud.storage.CloudStorage $this, @org.jetbrains.annotations.NotNull
        java.lang.String bucket, @org.jetbrains.annotations.NotNull
        java.lang.String fileName) {
            return null;
        }
    }
}