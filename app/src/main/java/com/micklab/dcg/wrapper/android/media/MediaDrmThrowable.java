// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaDrmThrowable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaDrmThrowable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaDrmThrowable wrap(android.media.MediaDrmThrowable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrmThrowable(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaDrmThrowable getReal() {
        return (android.media.MediaDrmThrowable) real;
    }

    public android.media.MediaDrmThrowable unwrap() {
        return getReal();
    }

    public int getErrorContext() {
        return ((android.media.MediaDrmThrowable) real).getErrorContext();
    }

    public int getOemError() {
        return ((android.media.MediaDrmThrowable) real).getOemError();
    }

    public int getVendorError() {
        return ((android.media.MediaDrmThrowable) real).getVendorError();
    }

}
