// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.adid;

public final class AdIdManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdIdManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.adid.AdIdManager wrap(android.adservices.adid.AdIdManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.adid.AdIdManager(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.adid.AdIdManager getReal() {
        return (android.adservices.adid.AdIdManager) real;
    }

    public android.adservices.adid.AdIdManager unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.adservices.adid.AdIdManager get(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.adservices.adid.AdIdManager.wrap(android.adservices.adid.AdIdManager.get(arg0 == null ? null : arg0.getReal()));
    }

}
