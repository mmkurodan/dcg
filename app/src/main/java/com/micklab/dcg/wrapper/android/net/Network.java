// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class Network {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Network(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.Network wrap(android.net.Network real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.Network(real, (__DcgwBridgeToken) null);
    }

    public android.net.Network getReal() {
        return (android.net.Network) real;
    }

    public android.net.Network unwrap() {
        return getReal();
    }

    public void bindSocket(java.io.FileDescriptor arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#bindSocket(java.io.FileDescriptor)");
    }

    public void bindSocket(java.net.DatagramSocket arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#bindSocket(java.net.DatagramSocket)");
    }

    public void bindSocket(java.net.Socket arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#bindSocket(java.net.Socket)");
    }

    public int describeContents() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#describeContents()");
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#equals(java.lang.Object)");
    }

    public static com.micklab.dcg.wrapper.android.net.Network fromNetworkHandle(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#fromNetworkHandle(long)");
    }

    public java.net.InetAddress[] getAllByName(java.lang.String arg0) throws java.net.UnknownHostException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#getAllByName(java.lang.String)");
    }

    public java.net.InetAddress getByName(java.lang.String arg0) throws java.net.UnknownHostException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#getByName(java.lang.String)");
    }

    public long getNetworkHandle() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#getNetworkHandle()");
    }

    public javax.net.SocketFactory getSocketFactory() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#getSocketFactory()");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#hashCode()");
    }

    public java.net.URLConnection openConnection(java.net.URL arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#openConnection(java.net.URL)");
    }

    public java.net.URLConnection openConnection(java.net.URL arg0, java.net.Proxy arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#openConnection(java.net.URL,java.net.Proxy)");
    }

    public java.lang.String toString() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#toString()");
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Network#writeToParcel(android.os.Parcel,int)");
    }


}
