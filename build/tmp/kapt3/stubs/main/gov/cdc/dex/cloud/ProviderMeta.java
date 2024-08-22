package gov.cdc.dex.cloud;

/**
 * Intended to provide access to any provider details (which provider, region, account, etc.)
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lgov/cdc/dex/cloud/ProviderMeta;", "", "provider", "Lgov/cdc/dex/cloud/Providers;", "lib-cloud-proxy"})
public abstract interface ProviderMeta {
    
    @org.jetbrains.annotations.NotNull
    public abstract gov.cdc.dex.cloud.Providers provider();
}