// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCryptoException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaCryptoException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCryptoException wrap(android.media.MediaCryptoException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCryptoException(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaCryptoException getReal() {
        return (android.media.MediaCryptoException) real;
    }

    public android.media.MediaCryptoException unwrap() {
        return getReal();
    }

    public MediaCryptoException(java.lang.String arg0) {
        this(new android.media.MediaCryptoException(arg0), (__DcgwBridgeToken) null);
    }

    public int getErrorContext() {
        return ((android.media.MediaCryptoException) real).getErrorContext();
    }

    public int getOemError() {
        return ((android.media.MediaCryptoException) real).getOemError();
    }

    public int getVendorError() {
        return ((android.media.MediaCryptoException) real).getVendorError();
    }

}
