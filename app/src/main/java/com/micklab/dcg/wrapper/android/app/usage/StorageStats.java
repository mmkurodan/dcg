// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class StorageStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StorageStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.StorageStats wrap(android.app.usage.StorageStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.StorageStats(real, (__DcgwBridgeToken) null);
    }

    public android.app.usage.StorageStats getReal() {
        return (android.app.usage.StorageStats) real;
    }

    public android.app.usage.StorageStats unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.app.usage.StorageStats) real).describeContents();
    }

    public long getAppBytes() {
        return ((android.app.usage.StorageStats) real).getAppBytes();
    }

    public long getAppBytesByDataType(int arg0) {
        return ((android.app.usage.StorageStats) real).getAppBytesByDataType(arg0);
    }

    public long getCacheBytes() {
        return ((android.app.usage.StorageStats) real).getCacheBytes();
    }

    public long getDataBytes() {
        return ((android.app.usage.StorageStats) real).getDataBytes();
    }

    public long getExternalCacheBytes() {
        return ((android.app.usage.StorageStats) real).getExternalCacheBytes();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.app.usage.StorageStats) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int APP_DATA_TYPE_LIB = android.app.usage.StorageStats.APP_DATA_TYPE_LIB;

}
