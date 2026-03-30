// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.rtp;

public final class AudioStream {
    private final android.net.rtp.AudioStream real;

    public AudioStream(android.net.rtp.AudioStream real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.rtp.AudioStream wrap(android.net.rtp.AudioStream real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.rtp.AudioStream(real);
    }

    public android.net.rtp.AudioStream unwrap() {
        return real;
    }

    public AudioStream(java.net.InetAddress arg0) throws java.net.SocketException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioStream#android.net.rtp.AudioStream(java.net.InetAddress)");
    }

    public com.micklab.dcg.wrapper.android.net.rtp.AudioCodec getCodec() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioStream#getCodec()");
    }

    public int getDtmfType() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioStream#getDtmfType()");
    }

    public com.micklab.dcg.wrapper.android.net.rtp.AudioGroup getGroup() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioStream#getGroup()");
    }

    public boolean isBusy() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioStream#isBusy()");
    }

    public void join(com.micklab.dcg.wrapper.android.net.rtp.AudioGroup arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioStream#join(android.net.rtp.AudioGroup)");
    }

    public void setCodec(com.micklab.dcg.wrapper.android.net.rtp.AudioCodec arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioStream#setCodec(android.net.rtp.AudioCodec)");
    }

    public void setDtmfType(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioStream#setDtmfType(int)");
    }

}
