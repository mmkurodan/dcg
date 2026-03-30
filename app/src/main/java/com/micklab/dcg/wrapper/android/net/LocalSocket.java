// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class LocalSocket {
    private final android.net.LocalSocket real;

    public LocalSocket(android.net.LocalSocket real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.LocalSocket wrap(android.net.LocalSocket real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.LocalSocket(real);
    }

    public android.net.LocalSocket unwrap() {
        return real;
    }

    public LocalSocket() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#android.net.LocalSocket()");
    }

    public LocalSocket(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#android.net.LocalSocket(int)");
    }

    public void bind(com.micklab.dcg.wrapper.android.net.LocalSocketAddress arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#bind(android.net.LocalSocketAddress)");
    }

    public void close() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#close()");
    }

    public void connect(com.micklab.dcg.wrapper.android.net.LocalSocketAddress arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#connect(android.net.LocalSocketAddress)");
    }

    public void connect(com.micklab.dcg.wrapper.android.net.LocalSocketAddress arg0, int arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#connect(android.net.LocalSocketAddress,int)");
    }

    public java.io.FileDescriptor[] getAncillaryFileDescriptors() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#getAncillaryFileDescriptors()");
    }

    public java.io.FileDescriptor getFileDescriptor() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#getFileDescriptor()");
    }

    public java.io.InputStream getInputStream() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#getInputStream()");
    }

    public com.micklab.dcg.wrapper.android.net.LocalSocketAddress getLocalSocketAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#getLocalSocketAddress()");
    }

    public java.io.OutputStream getOutputStream() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#getOutputStream()");
    }

    public com.micklab.dcg.wrapper.android.net.Credentials getPeerCredentials() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#getPeerCredentials()");
    }

    public int getReceiveBufferSize() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#getReceiveBufferSize()");
    }

    public com.micklab.dcg.wrapper.android.net.LocalSocketAddress getRemoteSocketAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#getRemoteSocketAddress()");
    }

    public int getSendBufferSize() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#getSendBufferSize()");
    }

    public int getSoTimeout() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#getSoTimeout()");
    }

    public boolean isBound() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#isBound()");
    }

    public boolean isClosed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#isClosed()");
    }

    public boolean isConnected() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#isConnected()");
    }

    public boolean isInputShutdown() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#isInputShutdown()");
    }

    public boolean isOutputShutdown() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#isOutputShutdown()");
    }

    public void setFileDescriptorsForSend(java.io.FileDescriptor[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#setFileDescriptorsForSend([Ljava.io.FileDescriptor;)");
    }

    public void setReceiveBufferSize(int arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#setReceiveBufferSize(int)");
    }

    public void setSendBufferSize(int arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#setSendBufferSize(int)");
    }

    public void setSoTimeout(int arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#setSoTimeout(int)");
    }

    public void shutdownInput() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#shutdownInput()");
    }

    public void shutdownOutput() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#shutdownOutput()");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.LocalSocket#toString()");
    }


}
