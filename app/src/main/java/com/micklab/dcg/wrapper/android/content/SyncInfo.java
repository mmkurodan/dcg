// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SyncInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SyncInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SyncInfo wrap(android.content.SyncInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SyncInfo(real, (__DcgwBridgeToken) null);
    }

    public android.content.SyncInfo getReal() {
        return (android.content.SyncInfo) real;
    }

    public android.content.SyncInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.content.SyncInfo) real).describeContents();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.SyncInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
