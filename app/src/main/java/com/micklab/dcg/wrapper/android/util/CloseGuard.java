// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class CloseGuard {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CloseGuard(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.CloseGuard wrap(android.util.CloseGuard real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.CloseGuard(real, (__DcgwBridgeToken) null);
    }

    public android.util.CloseGuard getReal() {
        return (android.util.CloseGuard) real;
    }

    public android.util.CloseGuard unwrap() {
        return getReal();
    }

    public CloseGuard() {
        this(new android.util.CloseGuard(), (__DcgwBridgeToken) null);
    }

    public void close() {
        ((android.util.CloseGuard) real).close();
    }

    public void open(java.lang.String arg0) {
        ((android.util.CloseGuard) real).open(arg0);
    }

    public void warnIfOpen() {
        ((android.util.CloseGuard) real).warnIfOpen();
    }

}
