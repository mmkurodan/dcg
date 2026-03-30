// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.credentials;

public final class CallingAppInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CallingAppInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo wrap(android.service.credentials.CallingAppInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.credentials.CallingAppInfo(real, (__DcgwBridgeToken) null);
    }

    public android.service.credentials.CallingAppInfo getReal() {
        return (android.service.credentials.CallingAppInfo) real;
    }

    public android.service.credentials.CallingAppInfo unwrap() {
        return getReal();
    }

    public CallingAppInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.pm.SigningInfo arg1) {
        this(new android.service.credentials.CallingAppInfo(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public CallingAppInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.content.pm.SigningInfo arg1, java.lang.String arg2) {
        this(new android.service.credentials.CallingAppInfo(arg0, arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.service.credentials.CallingAppInfo) real).describeContents();
    }

    public java.lang.String getOrigin() {
        return ((android.service.credentials.CallingAppInfo) real).getOrigin();
    }

    public java.lang.String getPackageName() {
        return ((android.service.credentials.CallingAppInfo) real).getPackageName();
    }

    public com.micklab.dcg.wrapper.android.content.pm.SigningInfo getSigningInfo() {
        return com.micklab.dcg.wrapper.android.content.pm.SigningInfo.wrap(((android.service.credentials.CallingAppInfo) real).getSigningInfo());
    }

    public java.lang.String toString() {
        return ((android.service.credentials.CallingAppInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.credentials.CallingAppInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
