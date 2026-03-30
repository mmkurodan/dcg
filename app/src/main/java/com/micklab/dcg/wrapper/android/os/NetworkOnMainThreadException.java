// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class NetworkOnMainThreadException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NetworkOnMainThreadException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.NetworkOnMainThreadException wrap(android.os.NetworkOnMainThreadException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.NetworkOnMainThreadException(real, (__DcgwBridgeToken) null);
    }

    public android.os.NetworkOnMainThreadException getReal() {
        return (android.os.NetworkOnMainThreadException) real;
    }

    public android.os.NetworkOnMainThreadException unwrap() {
        return getReal();
    }

    public NetworkOnMainThreadException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.NetworkOnMainThreadException#android.os.NetworkOnMainThreadException()");
    }

}
