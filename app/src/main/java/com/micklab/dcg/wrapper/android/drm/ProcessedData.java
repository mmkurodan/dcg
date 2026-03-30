// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class ProcessedData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ProcessedData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.ProcessedData wrap(android.drm.ProcessedData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.ProcessedData(real, (__DcgwBridgeToken) null);
    }

    public android.drm.ProcessedData getReal() {
        return (android.drm.ProcessedData) real;
    }

    public android.drm.ProcessedData unwrap() {
        return getReal();
    }

    public java.lang.String getAccountId() {
        return ((android.drm.ProcessedData) real).getAccountId();
    }

    public byte[] getData() {
        return ((android.drm.ProcessedData) real).getData();
    }

    public java.lang.String getSubscriptionId() {
        return ((android.drm.ProcessedData) real).getSubscriptionId();
    }

}
