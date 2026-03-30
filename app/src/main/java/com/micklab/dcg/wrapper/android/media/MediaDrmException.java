// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaDrmException {
    private final android.media.MediaDrmException real;

    public MediaDrmException(android.media.MediaDrmException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaDrmException wrap(android.media.MediaDrmException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrmException(real);
    }

    public android.media.MediaDrmException unwrap() {
        return real;
    }

    public MediaDrmException(java.lang.String arg0) {
        this(new android.media.MediaDrmException(arg0));
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
