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

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"VAR_CONTAINER", "", "lib-cloud-proxy"})
public final class BlobProxyKt {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String VAR_CONTAINER = "blob.container";
}