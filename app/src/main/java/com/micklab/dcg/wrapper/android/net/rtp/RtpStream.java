// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.rtp;

public final class RtpStream {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RtpStream(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.rtp.RtpStream wrap(android.net.rtp.RtpStream real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.rtp.RtpStream(real, (__DcgwBridgeToken) null);
    }

    public android.net.rtp.RtpStream getReal() {
        return (android.net.rtp.RtpStream) real;
    }

    public android.net.rtp.RtpStream unwrap() {
        return getReal();
    }

    public void associate(java.net.InetAddress arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.RtpStream#associate(java.net.InetAddress,int)");
    }

    public java.net.InetAddress getLocalAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.RtpStream#getLocalAddress()");
    }

    public int getLocalPort() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.RtpStream#getLocalPort()");
    }

    public int getMode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.RtpStream#getMode()");
    }

    public java.net.InetAddress getRemoteAddress() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.RtpStream#getRemoteAddress()");
    }

    public int getRemotePort() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.RtpStream#getRemotePort()");
    }

    public boolean isBusy() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.RtpStream#isBusy()");
    }

    public void release() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.RtpStream#release()");
    }

    public void setMode(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.RtpStream#setMode(int)");
    }


}
