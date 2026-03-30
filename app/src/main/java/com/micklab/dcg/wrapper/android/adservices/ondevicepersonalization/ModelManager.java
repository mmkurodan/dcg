// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class ModelManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ModelManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ModelManager wrap(android.adservices.ondevicepersonalization.ModelManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ModelManager(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.ModelManager getReal() {
        return (android.adservices.ondevicepersonalization.ModelManager) real;
    }

    public android.adservices.ondevicepersonalization.ModelManager unwrap() {
        return getReal();
    }

}
