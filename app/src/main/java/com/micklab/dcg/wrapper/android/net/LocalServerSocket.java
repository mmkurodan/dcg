// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class LocalServerSocket {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocalServerSocket(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.LocalServerSocket wrap(android.net.LocalServerSocket real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.LocalServerSocket(real, (__DcgwBridgeToken) null);
    }

    public android.net.LocalServerSocket getReal() {
        return (android.net.LocalServerSocket) real;
    }

    public android.net.LocalServerSocket unwrap() {
        return getReal();
    }

    public LocalServerSocket(java.io.FileDescriptor arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalServerSocket#android.net.LocalServerSocket(java.io.FileDescriptor)");
    }

    public LocalServerSocket(java.lang.String arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalServerSocket#android.net.LocalServerSocket(java.lang.String)");
    }

    public com.micklab.dcg.wrapper.android.net.LocalSocket accept() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalServerSocket#accept()");
    }

    public void close() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalServerSocket#close()");
    }

    public java.io.FileDescriptor getFileDescriptor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalServerSocket#getFileDescriptor()");
    }

    public com.micklab.dcg.wrapper.android.net.LocalSocketAddress getLocalSocketAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalServerSocket#getLocalSocketAddress()");
    }

}
