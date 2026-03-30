// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class ExternalStorageStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExternalStorageStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.ExternalStorageStats wrap(android.app.usage.ExternalStorageStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.ExternalStorageStats(real, (__DcgwBridgeToken) null);
    }

    public android.app.usage.ExternalStorageStats getReal() {
        return (android.app.usage.ExternalStorageStats) real;
    }

    public android.app.usage.ExternalStorageStats unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.usage.ExternalStorageStats) real).describeContents();
    }

    public long getAppBytes() {
        return ((android.app.usage.ExternalStorageStats) real).getAppBytes();
    }

    public long getAudioBytes() {
        return ((android.app.usage.ExternalStorageStats) real).getAudioBytes();
    }

    public long getImageBytes() {
        return ((android.app.usage.ExternalStorageStats) real).getImageBytes();
    }

    public long getTotalBytes() {
        return ((android.app.usage.ExternalStorageStats) real).getTotalBytes();
    }

    public long getVideoBytes() {
        return ((android.app.usage.ExternalStorageStats) real).getVideoBytes();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.usage.ExternalStorageStats) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
