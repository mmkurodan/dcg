// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class GatewayInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GatewayInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.GatewayInfo wrap(android.telecom.GatewayInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.GatewayInfo(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.GatewayInfo getReal() {
        return (android.telecom.GatewayInfo) real;
    }

    public android.telecom.GatewayInfo unwrap() {
        return getReal();
    }

    public GatewayInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
        this(new android.telecom.GatewayInfo(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.telecom.GatewayInfo) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getGatewayAddress() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.telecom.GatewayInfo) real).getGatewayAddress());
    }

    public java.lang.String getGatewayProviderPackageName() {
        return ((android.telecom.GatewayInfo) real).getGatewayProviderPackageName();
    }

    public com.micklab.dcg.wrapper.android.net.Uri getOriginalAddress() {
        return com.micklab.dcg.wrapper.android.net.Uri.wrap(((android.telecom.GatewayInfo) real).getOriginalAddress());
    }

    public boolean isEmpty() {
        return ((android.telecom.GatewayInfo) real).isEmpty();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.telecom.GatewayInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
