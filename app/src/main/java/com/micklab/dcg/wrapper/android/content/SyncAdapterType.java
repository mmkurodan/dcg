// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncAdapterType {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SyncAdapterType(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncAdapterType wrap(android.content.SyncAdapterType real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncAdapterType(real, (__DcgwBridgeToken) null);
    }

    public android.content.SyncAdapterType getReal() {
        return (android.content.SyncAdapterType) real;
    }

    public android.content.SyncAdapterType unwrap() {
        return getReal();
    }

    public SyncAdapterType(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.content.SyncAdapterType(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public SyncAdapterType(java.lang.String arg0, java.lang.String arg1, boolean arg2, boolean arg3) {
        this(new android.content.SyncAdapterType(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public boolean allowParallelSyncs() {
        return ((android.content.SyncAdapterType) real).allowParallelSyncs();
    }

    public int describeContents() {
        return ((android.content.SyncAdapterType) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.content.SyncAdapterType) real).equals(arg0);
    }

    public java.lang.String getSettingsActivity() {
        return ((android.content.SyncAdapterType) real).getSettingsActivity();
    }

    public int hashCode() {
        return ((android.content.SyncAdapterType) real).hashCode();
    }

    public boolean isAlwaysSyncable() {
        return ((android.content.SyncAdapterType) real).isAlwaysSyncable();
    }

    public boolean isUserVisible() {
        return ((android.content.SyncAdapterType) real).isUserVisible();
    }

    public static com.micklab.dcg.wrapper.android.content.SyncAdapterType newKey(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.content.SyncAdapterType.wrap(android.content.SyncAdapterType.newKey(arg0, arg1));
    }

    public boolean supportsUploading() {
        return ((android.content.SyncAdapterType) real).supportsUploading();
    }

    public java.lang.String toString() {
        return ((android.content.SyncAdapterType) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.SyncAdapterType) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
