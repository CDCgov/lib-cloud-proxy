package gov.cdc.dex.cloud.storage.aws;

import gov.cdc.dex.cloud.AWSConfig;
import gov.cdc.dex.cloud.Providers;
import gov.cdc.dex.cloud.storage.CloudFile;
import gov.cdc.dex.cloud.storage.CloudStorage;
import io.micrometer.core.instrument.MeterRegistry;
import io.micronaut.context.annotation.Requires;
import io.micronaut.http.MediaType;
import org.slf4j.LoggerFactory;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.CompletedPart;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.NoSuchKeyException;
import software.amazon.awssdk.services.s3.model.ObjectIdentifier;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0004"}, d2 = {"FILE_5MB", "", "VAR_BUCKET", "", "lib-cloud-proxy"})
public final class S3ProxyKt {
    private static final long FILE_5MB = 5242880L;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String VAR_BUCKET = "s3.bucket";
}