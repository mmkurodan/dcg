// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.eap;

public final class EapInfo {
    private final android.net.eap.EapInfo real;

    public EapInfo(android.net.eap.EapInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.eap.EapInfo wrap(android.net.eap.EapInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.eap.EapInfo(real);
    }

    public android.net.eap.EapInfo unwrap() {
        return real;
    }

    public int getEapMethodType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.eap.EapInfo#getEapMethodType()");
    }

}
