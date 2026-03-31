// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class SSLCertificateSocketFactory {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SSLCertificateSocketFactory(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.SSLCertificateSocketFactory wrap(android.net.SSLCertificateSocketFactory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.SSLCertificateSocketFactory(real, (__DcgwBridgeToken) null);
    }

    public android.net.SSLCertificateSocketFactory getReal() {
        return (android.net.SSLCertificateSocketFactory) real;
    }

    public android.net.SSLCertificateSocketFactory unwrap() {
        return getReal();
    }

    public SSLCertificateSocketFactory(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#android.net.SSLCertificateSocketFactory(int)");
    }

    public java.net.Socket createSocket() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#createSocket()");
    }

    public java.net.Socket createSocket(java.lang.String arg0, int arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#createSocket(java.lang.String,int)");
    }

    public java.net.Socket createSocket(java.net.InetAddress arg0, int arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#createSocket(java.net.InetAddress,int)");
    }

    public java.net.Socket createSocket(java.net.Socket arg0, java.lang.String arg1, int arg2, boolean arg3) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#createSocket(java.net.Socket,java.lang.String,int,boolean)");
    }

    public java.net.Socket createSocket(java.net.InetAddress arg0, int arg1, java.net.InetAddress arg2, int arg3) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#createSocket(java.net.InetAddress,int,java.net.InetAddress,int)");
    }

    public java.net.Socket createSocket(java.lang.String arg0, int arg1, java.net.InetAddress arg2, int arg3) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#createSocket(java.lang.String,int,java.net.InetAddress,int)");
    }

    public static javax.net.SocketFactory getDefault(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#getDefault(int)");
    }

    public static javax.net.ssl.SSLSocketFactory getDefault(int arg0, com.micklab.dcg.wrapper.android.net.SSLSessionCache arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#getDefault(int,android.net.SSLSessionCache)");
    }

    public java.lang.String[] getDefaultCipherSuites() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#getDefaultCipherSuites()");
    }

    public static javax.net.ssl.SSLSocketFactory getInsecure(int arg0, com.micklab.dcg.wrapper.android.net.SSLSessionCache arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#getInsecure(int,android.net.SSLSessionCache)");
    }

    public byte[] getNpnSelectedProtocol(java.net.Socket arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#getNpnSelectedProtocol(java.net.Socket)");
    }

    public java.lang.String[] getSupportedCipherSuites() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#getSupportedCipherSuites()");
    }

    public void setHostname(java.net.Socket arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#setHostname(java.net.Socket,java.lang.String)");
    }

    public void setKeyManagers(javax.net.ssl.KeyManager[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#setKeyManagers([Ljavax.net.ssl.KeyManager;)");
    }

    public void setNpnProtocols(byte[][] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#setNpnProtocols([[B)");
    }

    public void setTrustManagers(javax.net.ssl.TrustManager[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#setTrustManagers([Ljavax.net.ssl.TrustManager;)");
    }

    public void setUseSessionTickets(java.net.Socket arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLCertificateSocketFactory#setUseSessionTickets(java.net.Socket,boolean)");
    }

}
