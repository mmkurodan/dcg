// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCrypto {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaCrypto(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCrypto wrap(android.media.MediaCrypto real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCrypto(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaCrypto getReal() {
        return (android.media.MediaCrypto) real;
    }

    public android.media.MediaCrypto unwrap() {
        return getReal();
    }

    public MediaCrypto(java.util.UUID arg0, byte[] arg1) throws android.media.MediaCryptoException {
        this(new android.media.MediaCrypto(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public static boolean isCryptoSchemeSupported(java.util.UUID arg0) {
        return android.media.MediaCrypto.isCryptoSchemeSupported(arg0);
    }

    public void release() {
        ((android.media.MediaCrypto) real).release();
    }

    public boolean requiresSecureDecoderComponent(java.lang.String arg0) {
        return ((android.media.MediaCrypto) real).requiresSecureDecoderComponent(arg0);
    }

    public void setMediaDrmSession(byte[] arg0) throws android.media.MediaCryptoException {
        ((android.media.MediaCrypto) real).setMediaDrmSession(arg0);
    }

}
