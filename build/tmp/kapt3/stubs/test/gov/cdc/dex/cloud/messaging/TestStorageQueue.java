package gov.cdc.dex.cloud.messaging;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lgov/cdc/dex/cloud/messaging/TestStorageQueue;", "", "()V", "messaging", "Lgov/cdc/dex/cloud/messaging/CloudMessaging;", "getMessaging", "()Lgov/cdc/dex/cloud/messaging/CloudMessaging;", "setMessaging", "(Lgov/cdc/dex/cloud/messaging/CloudMessaging;)V", "receiveMessages", "", "lib-cloud-proxy_test"})
public final class TestStorageQueue {
    @javax.inject.Inject
    public gov.cdc.dex.cloud.messaging.CloudMessaging messaging;
    
    public TestStorageQueue() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final gov.cdc.dex.cloud.messaging.CloudMessaging getMessaging() {
        return null;
    }
    
    public final void setMessaging(@org.jetbrains.annotations.NotNull
    gov.cdc.dex.cloud.messaging.CloudMessaging p0) {
    }
    
    public final void receiveMessages() {
    }
}