// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaDrmResetException {
    private final android.media.MediaDrmResetException real;

    public MediaDrmResetException(android.media.MediaDrmResetException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaDrmResetException wrap(android.media.MediaDrmResetException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrmResetException(real);
    }

    public android.media.MediaDrmResetException unwrap() {
        return real;
    }

    public MediaDrmResetException(java.lang.String arg0) {
        this(new android.media.MediaDrmResetException(arg0));
    }

}
