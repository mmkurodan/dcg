// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app.usage;

public final class StorageStats {
    private final android.app.usage.StorageStats real;

    public StorageStats(android.app.usage.StorageStats real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.usage.StorageStats wrap(android.app.usage.StorageStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.usage.StorageStats(real);
    }

    public android.app.usage.StorageStats unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public long getAppBytes() {
        return real.getAppBytes();
    }

    public long getAppBytesByDataType(int arg0) {
        return real.getAppBytesByDataType(arg0);
    }

    public long getCacheBytes() {
        return real.getCacheBytes();
    }

    public long getDataBytes() {
        return real.getDataBytes();
    }

    public long getExternalCacheBytes() {
        return real.getExternalCacheBytes();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int APP_DATA_TYPE_LIB = android.app.usage.StorageStats.APP_DATA_TYPE_LIB;

}
