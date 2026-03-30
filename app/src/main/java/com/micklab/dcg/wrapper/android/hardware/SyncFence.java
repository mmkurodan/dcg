// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SyncFence {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SyncFence(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SyncFence wrap(android.hardware.SyncFence real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SyncFence(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.SyncFence getReal() {
        return (android.hardware.SyncFence) real;
    }

    public android.hardware.SyncFence unwrap() {
        return getReal();
    }

    public SyncFence(com.micklab.dcg.wrapper.android.hardware.SyncFence arg0) {
        this(new android.hardware.SyncFence(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean await(java.time.Duration arg0) {
        return ((android.hardware.SyncFence) real).await(arg0);
    }

    public boolean awaitForever() {
        return ((android.hardware.SyncFence) real).awaitForever();
    }

    public void close() {
        ((android.hardware.SyncFence) real).close();
    }

    public int describeContents() {
        return ((android.hardware.SyncFence) real).describeContents();
    }

    public long getSignalTime() {
        return ((android.hardware.SyncFence) real).getSignalTime();
    }

    public boolean isValid() {
        return ((android.hardware.SyncFence) real).isValid();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.SyncFence) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final long SIGNAL_TIME_INVALID = android.hardware.SyncFence.SIGNAL_TIME_INVALID;
    public static final long SIGNAL_TIME_PENDING = android.hardware.SyncFence.SIGNAL_TIME_PENDING;

}
