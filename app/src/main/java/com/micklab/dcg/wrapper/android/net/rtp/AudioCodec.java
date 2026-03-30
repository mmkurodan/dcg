// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.rtp;

public final class AudioCodec {
    private final android.net.rtp.AudioCodec real;

    public AudioCodec(android.net.rtp.AudioCodec real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.rtp.AudioCodec wrap(android.net.rtp.AudioCodec real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.rtp.AudioCodec(real);
    }

    public android.net.rtp.AudioCodec unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.net.rtp.AudioCodec getCodec(int arg0, java.lang.String arg1, java.lang.String arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioCodec#getCodec(int,java.lang.String,java.lang.String)");
    }

    public static android.net.rtp.AudioCodec[] getCodecs() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.rtp.AudioCodec#getCodecs()");
    }


}
