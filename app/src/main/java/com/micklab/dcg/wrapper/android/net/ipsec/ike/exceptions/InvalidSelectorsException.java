// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class InvalidSelectorsException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InvalidSelectorsException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.InvalidSelectorsException wrap(android.net.ipsec.ike.exceptions.InvalidSelectorsException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.InvalidSelectorsException(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.exceptions.InvalidSelectorsException getReal() {
        return (android.net.ipsec.ike.exceptions.InvalidSelectorsException) real;
    }

    public android.net.ipsec.ike.exceptions.InvalidSelectorsException unwrap() {
        return getReal();
    }

    public InvalidSelectorsException(int arg0, byte[] arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.InvalidSelectorsException#android.net.ipsec.ike.exceptions.InvalidSelectorsException(int,[B)");
    }

    public byte[] getIpSecPacketInfo() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.InvalidSelectorsException#getIpSecPacketInfo()");
    }

    public int getIpSecSpi() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.InvalidSelectorsException#getIpSecSpi()");
    }

}
