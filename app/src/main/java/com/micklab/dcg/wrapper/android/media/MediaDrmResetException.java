// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaDrmResetException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaDrmResetException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaDrmResetException wrap(android.media.MediaDrmResetException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrmResetException(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaDrmResetException getReal() {
        return (android.media.MediaDrmResetException) real;
    }

    public android.media.MediaDrmResetException unwrap() {
        return getReal();
    }

    public MediaDrmResetException(java.lang.String arg0) {
        this(new android.media.MediaDrmResetException(arg0), (__DcgwBridgeToken) null);
    }

}
