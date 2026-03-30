// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class AitInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AitInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.AitInfo wrap(android.media.tv.AitInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.AitInfo(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.AitInfo getReal() {
        return (android.media.tv.AitInfo) real;
    }

    public android.media.tv.AitInfo unwrap() {
        return getReal();
    }

    public AitInfo(int arg0, int arg1) {
        this(new android.media.tv.AitInfo(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.tv.AitInfo) real).describeContents();
    }

    public int getType() {
        return ((android.media.tv.AitInfo) real).getType();
    }

    public int getVersion() {
        return ((android.media.tv.AitInfo) real).getVersion();
    }

    public java.lang.String toString() {
        return ((android.media.tv.AitInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.tv.AitInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
