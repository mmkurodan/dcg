// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.system;

public final class ErrnoException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ErrnoException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.system.ErrnoException wrap(android.system.ErrnoException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.system.ErrnoException(real, (__DcgwBridgeToken) null);
    }

    public android.system.ErrnoException getReal() {
        return (android.system.ErrnoException) real;
    }

    public android.system.ErrnoException unwrap() {
        return getReal();
    }

    public ErrnoException(java.lang.String arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.ErrnoException#android.system.ErrnoException(java.lang.String,int)");
    }

    public ErrnoException(java.lang.String arg0, int arg1, java.lang.Throwable arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.ErrnoException#android.system.ErrnoException(java.lang.String,int,java.lang.Throwable)");
    }

    public java.lang.String getMessage() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.ErrnoException#getMessage()");
    }

    public java.io.IOException rethrowAsIOException() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.ErrnoException#rethrowAsIOException()");
    }

    public java.net.SocketException rethrowAsSocketException() throws java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.ErrnoException#rethrowAsSocketException()");
    }


}
