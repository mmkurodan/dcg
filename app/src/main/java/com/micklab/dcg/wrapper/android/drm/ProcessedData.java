// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.drm;

public final class ProcessedData {
    private final android.drm.ProcessedData real;

    public ProcessedData(android.drm.ProcessedData real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.drm.ProcessedData wrap(android.drm.ProcessedData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.drm.ProcessedData(real);
    }

    public android.drm.ProcessedData unwrap() {
        return real;
    }

    public java.lang.String getAccountId() {
        return real.getAccountId();
    }

    public byte[] getData() {
        return real.getData();
    }

    public java.lang.String getSubscriptionId() {
        return real.getSubscriptionId();
    }

}
