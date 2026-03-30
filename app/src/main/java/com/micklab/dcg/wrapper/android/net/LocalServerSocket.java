// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class LocalServerSocket {
    private final android.net.LocalServerSocket real;

    public LocalServerSocket(android.net.LocalServerSocket real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.LocalServerSocket wrap(android.net.LocalServerSocket real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.LocalServerSocket(real);
    }

    public android.net.LocalServerSocket unwrap() {
        return real;
    }

    public LocalServerSocket(java.lang.String arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalServerSocket#android.net.LocalServerSocket(java.lang.String)");
    }

    public LocalServerSocket(java.io.FileDescriptor arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalServerSocket#android.net.LocalServerSocket(java.io.FileDescriptor)");
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
