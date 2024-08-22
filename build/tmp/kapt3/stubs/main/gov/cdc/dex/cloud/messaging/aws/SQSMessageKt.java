package gov.cdc.dex.cloud.messaging.aws;

import com.jayway.jsonpath.JsonPath;
import gov.cdc.dex.cloud.messaging.CloudMessage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"}, d2 = {"SQS_KEY_PATH", "", "lib-cloud-proxy"})
public final class SQSMessageKt {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SQS_KEY_PATH = "$[\'Records\'][0][\'s3\'][\'object\'][\'key\']";
}