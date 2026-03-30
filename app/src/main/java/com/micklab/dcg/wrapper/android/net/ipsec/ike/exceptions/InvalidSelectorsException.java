// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class InvalidSelectorsException {
    private final android.net.ipsec.ike.exceptions.InvalidSelectorsException real;

    public InvalidSelectorsException(android.net.ipsec.ike.exceptions.InvalidSelectorsException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.InvalidSelectorsException wrap(android.net.ipsec.ike.exceptions.InvalidSelectorsException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.InvalidSelectorsException(real);
    }

    public android.net.ipsec.ike.exceptions.InvalidSelectorsException unwrap() {
        return real;
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
