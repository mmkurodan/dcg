// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content.res;

public final class ObbInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ObbInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.res.ObbInfo wrap(android.content.res.ObbInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.res.ObbInfo(real, (__DcgwBridgeToken) null);
    }

    public android.content.res.ObbInfo getReal() {
        return (android.content.res.ObbInfo) real;
    }

    public android.content.res.ObbInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.content.res.ObbInfo) real).describeContents();
    }

    public java.lang.String toString() {
        return ((android.content.res.ObbInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.content.res.ObbInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int OBB_OVERLAY = android.content.res.ObbInfo.OBB_OVERLAY;

}
