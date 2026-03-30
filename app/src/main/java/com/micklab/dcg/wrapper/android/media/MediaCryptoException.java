// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCryptoException {
    private final android.media.MediaCryptoException real;

    public MediaCryptoException(android.media.MediaCryptoException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCryptoException wrap(android.media.MediaCryptoException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCryptoException(real);
    }

    public android.media.MediaCryptoException unwrap() {
        return real;
    }

    public MediaCryptoException(java.lang.String arg0) {
        this(new android.media.MediaCryptoException(arg0));
    }

    public int getErrorContext() {
        return real.getErrorContext();
    }

    public int getOemError() {
        return real.getOemError();
    }

    public int getVendorError() {
        return real.getVendorError();
    }

}
