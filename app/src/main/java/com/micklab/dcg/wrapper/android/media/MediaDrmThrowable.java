// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaDrmThrowable {
    private final android.media.MediaDrmThrowable real;

    public MediaDrmThrowable(android.media.MediaDrmThrowable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaDrmThrowable wrap(android.media.MediaDrmThrowable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaDrmThrowable(real);
    }

    public android.media.MediaDrmThrowable unwrap() {
        return real;
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
