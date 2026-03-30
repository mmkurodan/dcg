// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class SyncFence {
    private final android.hardware.SyncFence real;

    public SyncFence(android.hardware.SyncFence real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.SyncFence wrap(android.hardware.SyncFence real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.SyncFence(real);
    }

    public android.hardware.SyncFence unwrap() {
        return real;
    }

    public SyncFence(com.micklab.dcg.wrapper.android.hardware.SyncFence arg0) {
        this(new android.hardware.SyncFence(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean await(java.time.Duration arg0) {
        return real.await(arg0);
    }

    public boolean awaitForever() {
        return real.awaitForever();
    }

    public void close() {
        real.close();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getSignalTime() {
        return real.getSignalTime();
    }

    public boolean isValid() {
        return real.isValid();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final long SIGNAL_TIME_INVALID = android.hardware.SyncFence.SIGNAL_TIME_INVALID;
    public static final long SIGNAL_TIME_PENDING = android.hardware.SyncFence.SIGNAL_TIME_PENDING;

}
