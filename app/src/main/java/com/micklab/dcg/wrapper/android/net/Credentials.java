// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class Credentials {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Credentials(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.Credentials wrap(android.net.Credentials real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.Credentials(real, (__DcgwBridgeToken) null);
    }

    public android.net.Credentials getReal() {
        return (android.net.Credentials) real;
    }

    public android.net.Credentials unwrap() {
        return getReal();
    }

    public Credentials(int arg0, int arg1, int arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Credentials#android.net.Credentials(int,int,int)");
    }

    public int getGid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Credentials#getGid()");
    }

    public int getPid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Credentials#getPid()");
    }

    public int getUid() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Credentials#getUid()");
    }

}
