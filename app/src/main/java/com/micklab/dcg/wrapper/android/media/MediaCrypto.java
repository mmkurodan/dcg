// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCrypto {
    private final android.media.MediaCrypto real;

    public MediaCrypto(android.media.MediaCrypto real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCrypto wrap(android.media.MediaCrypto real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCrypto(real);
    }

    public android.media.MediaCrypto unwrap() {
        return real;
    }

    public MediaCrypto(java.util.UUID arg0, byte[] arg1) throws android.media.MediaCryptoException {
        this(new android.media.MediaCrypto(arg0, arg1));
    }

    public static boolean isCryptoSchemeSupported(java.util.UUID arg0) {
        return android.media.MediaCrypto.isCryptoSchemeSupported(arg0);
    }

    public void release() {
        real.release();
    }

    public boolean requiresSecureDecoderComponent(java.lang.String arg0) {
        return real.requiresSecureDecoderComponent(arg0);
    }

    public void setMediaDrmSession(byte[] arg0) throws android.media.MediaCryptoException {
        real.setMediaDrmSession(arg0);
    }

}
