// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncStats {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SyncStats(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncStats wrap(android.content.SyncStats real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncStats(real, (__DcgwBridgeToken) null);
    }

    public android.content.SyncStats getReal() {
        return (android.content.SyncStats) real;
    }

    public android.content.SyncStats unwrap() {
        return getReal();
    }

    public SyncStats() {
        this(new android.content.SyncStats(), (__DcgwBridgeToken) null);
    }

    public SyncStats(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        this(new android.content.SyncStats(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void clear() {
        ((android.content.SyncStats) real).clear();
    }

    public int describeContents() {
        return ((android.content.SyncStats) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.content.SyncStats) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.SyncStats) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
