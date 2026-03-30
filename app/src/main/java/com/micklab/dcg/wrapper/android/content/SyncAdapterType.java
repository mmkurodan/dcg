// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncAdapterType {
    private final android.content.SyncAdapterType real;

    public SyncAdapterType(android.content.SyncAdapterType real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncAdapterType wrap(android.content.SyncAdapterType real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncAdapterType(real);
    }

    public android.content.SyncAdapterType unwrap() {
        return real;
    }

    public SyncAdapterType(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.content.SyncAdapterType(arg0 == null ? null : arg0.unwrap()));
    }

    public SyncAdapterType(java.lang.String arg0, java.lang.String arg1, boolean arg2, boolean arg3) {
        this(new android.content.SyncAdapterType(arg0, arg1, arg2, arg3));
    }

    public boolean allowParallelSyncs() {
        return real.allowParallelSyncs();
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getSettingsActivity() {
        return real.getSettingsActivity();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isAlwaysSyncable() {
        return real.isAlwaysSyncable();
    }

    public boolean isUserVisible() {
        return real.isUserVisible();
    }

    public static com.micklab.dcg.wrapper.android.content.SyncAdapterType newKey(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.SyncAdapterType.wrap(android.content.SyncAdapterType.newKey(arg0, arg1));
    }

    public boolean supportsUploading() {
        return real.supportsUploading();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
