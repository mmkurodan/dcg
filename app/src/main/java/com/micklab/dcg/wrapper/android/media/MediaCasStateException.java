// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCasStateException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaCasStateException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCasStateException wrap(android.media.MediaCasStateException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCasStateException(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaCasStateException getReal() {
        return (android.media.MediaCasStateException) real;
    }

    public android.media.MediaCasStateException unwrap() {
        return getReal();
    }

    public java.lang.String getDiagnosticInfo() {
        return ((android.media.MediaCasStateException) real).getDiagnosticInfo();
    }

}
