// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaDrmException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaDrmException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaDrmException wrap(android.media.MediaDrmException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrmException(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaDrmException getReal() {
        return (android.media.MediaDrmException) real;
    }

    public android.media.MediaDrmException unwrap() {
        return getReal();
    }

    public MediaDrmException(java.lang.String arg0) {
        this(new android.media.MediaDrmException(arg0), (__DcgwBridgeToken) null);
    }

    public int getErrorContext() {
        return ((android.media.MediaDrmException) real).getErrorContext();
    }

    public int getOemError() {
        return ((android.media.MediaDrmException) real).getOemError();
    }

    public int getVendorError() {
        return ((android.media.MediaDrmException) real).getVendorError();
    }

}
