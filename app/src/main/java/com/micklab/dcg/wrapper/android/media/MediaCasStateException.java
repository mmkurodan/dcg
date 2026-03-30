// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCasStateException {
    private final android.media.MediaCasStateException real;

    public MediaCasStateException(android.media.MediaCasStateException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCasStateException wrap(android.media.MediaCasStateException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCasStateException(real);
    }

    public android.media.MediaCasStateException unwrap() {
        return real;
    }

    public java.lang.String getDiagnosticInfo() {
        return real.getDiagnosticInfo();
    }

}
