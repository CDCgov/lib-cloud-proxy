package gov.cdc.dex.cloud.messaging.aws;

import com.jayway.jsonpath.JsonPath;
import gov.cdc.dex.cloud.messaging.CloudMessage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0003H\u0016\u00a8\u0006\t"}, d2 = {"Lgov/cdc/dex/cloud/messaging/aws/SQSMessage;", "Lgov/cdc/dex/cloud/messaging/CloudMessage;", "id", "", "recipientHandle", "body", "queue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "key", "lib-cloud-proxy"})
public final class SQSMessage extends gov.cdc.dex.cloud.messaging.CloudMessage {
    
    public SQSMessage(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    java.lang.String recipientHandle, @org.jetbrains.annotations.NotNull
    java.lang.String body, @org.jetbrains.annotations.NotNull
    java.lang.String queue) {
        super(null, null, null, null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String key() {
        return null;
    }
}