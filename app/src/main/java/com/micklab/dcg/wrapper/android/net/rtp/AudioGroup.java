// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.rtp;

public final class AudioGroup {
    private final android.net.rtp.AudioGroup real;

    public AudioGroup(android.net.rtp.AudioGroup real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.rtp.AudioGroup wrap(android.net.rtp.AudioGroup real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.rtp.AudioGroup(real);
    }

    public android.net.rtp.AudioGroup unwrap() {
        return real;
    }

    public AudioGroup() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioGroup#android.net.rtp.AudioGroup()");
    }

    public AudioGroup(com.micklab.dcg.wrapper.android.content.Context arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioGroup#android.net.rtp.AudioGroup(android.content.Context)");
    }

    public void clear() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioGroup#clear()");
    }

    public int getMode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioGroup#getMode()");
    }

    public android.net.rtp.AudioStream[] getStreams() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioGroup#getStreams()");
    }

    public void sendDtmf(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioGroup#sendDtmf(int)");
    }

    public void setMode(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioGroup#setMode(int)");
    }


}
