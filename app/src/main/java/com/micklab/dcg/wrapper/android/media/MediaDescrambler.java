// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaDescrambler {
    private final android.media.MediaDescrambler real;

    public MediaDescrambler(android.media.MediaDescrambler real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaDescrambler wrap(android.media.MediaDescrambler real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDescrambler(real);
    }

    public android.media.MediaDescrambler unwrap() {
        return real;
    }

    public MediaDescrambler(int arg0) throws android.media.MediaCasException.UnsupportedCasException {
        this(new android.media.MediaDescrambler(arg0));
    }

    public void close() {
        real.close();
    }

    public int descramble(java.nio.ByteBuffer arg0, java.nio.ByteBuffer arg1, com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo arg2) {
        return real.descramble(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public boolean requiresSecureDecoderComponent(java.lang.String arg0) {
        return real.requiresSecureDecoderComponent(arg0);
    }

    public void setMediaCasSession(android.media.MediaCas.Session arg0) {
        real.setMediaCasSession(arg0);
    }

    public static final byte SCRAMBLE_CONTROL_EVEN_KEY = android.media.MediaDescrambler.SCRAMBLE_CONTROL_EVEN_KEY;
    public static final byte SCRAMBLE_CONTROL_ODD_KEY = android.media.MediaDescrambler.SCRAMBLE_CONTROL_ODD_KEY;
    public static final byte SCRAMBLE_CONTROL_RESERVED = android.media.MediaDescrambler.SCRAMBLE_CONTROL_RESERVED;
    public static final byte SCRAMBLE_CONTROL_UNSCRAMBLED = android.media.MediaDescrambler.SCRAMBLE_CONTROL_UNSCRAMBLED;
    public static final byte SCRAMBLE_FLAG_PES_HEADER = android.media.MediaDescrambler.SCRAMBLE_FLAG_PES_HEADER;

}
