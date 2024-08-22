package gov.cdc.dex.cloud.storage;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.util.*;
import javax.inject.Inject;

@io.micronaut.test.extensions.junit5.annotation.MicronautTest
@org.junit.jupiter.api.Tag(value = "UnitTest")
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\f\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\nH\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lgov/cdc/dex/cloud/storage/CloudStorageProxyTest;", "", "()V", "cloudStorage", "Lgov/cdc/dex/cloud/storage/CloudStorage;", "getCloudStorage", "()Lgov/cdc/dex/cloud/storage/CloudStorage;", "setCloudStorage", "(Lgov/cdc/dex/cloud/storage/CloudStorage;)V", "listFolders", "", "testListFilesInFolder", "testUploadFileNoMetadata", "testUploadFileWithMetadata", "lib-cloud-proxy_test"})
public final class CloudStorageProxyTest {
    @javax.inject.Inject
    public gov.cdc.dex.cloud.storage.CloudStorage cloudStorage;
    
    public CloudStorageProxyTest() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final gov.cdc.dex.cloud.storage.CloudStorage getCloudStorage() {
        return null;
    }
    
    public final void setCloudStorage(@org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.storage.CloudStorage p0) {
    }
    
    @org.junit.jupiter.api.Test
    public final void listFolders() {
    }
    
    @org.junit.jupiter.api.Test
    public final void testListFilesInFolder() {
    }
    
    @org.junit.jupiter.api.Test
    public final void testUploadFileNoMetadata() {
    }
    
    @org.junit.jupiter.api.Test
    public final void testUploadFileWithMetadata() {
    }
}