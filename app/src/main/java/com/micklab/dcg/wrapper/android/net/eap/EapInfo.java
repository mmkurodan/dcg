// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.eap;

public final class EapInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EapInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.eap.EapInfo wrap(android.net.eap.EapInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.eap.EapInfo(real, (__DcgwBridgeToken) null);
    }

    public android.net.eap.EapInfo getReal() {
        return (android.net.eap.EapInfo) real;
    }

    public android.net.eap.EapInfo unwrap() {
        return getReal();
    }

    public int getEapMethodType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.eap.EapInfo#getEapMethodType()");
    }

}
