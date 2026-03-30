// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaTimestamp {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaTimestamp(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaTimestamp wrap(android.media.MediaTimestamp real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaTimestamp(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaTimestamp getReal() {
        return (android.media.MediaTimestamp) real;
    }

    public android.media.MediaTimestamp unwrap() {
        return getReal();
    }

    public MediaTimestamp(long arg0, long arg1, float arg2) {
        this(new android.media.MediaTimestamp(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.MediaTimestamp) real).equals(arg0);
    }

    public long getAnchorMediaTimeUs() {
        return ((android.media.MediaTimestamp) real).getAnchorMediaTimeUs();
    }

    public long getAnchorSystemNanoTime() {
        return ((android.media.MediaTimestamp) real).getAnchorSystemNanoTime();
    }

    public long getAnchorSytemNanoTime() {
        return ((android.media.MediaTimestamp) real).getAnchorSytemNanoTime();
    }

    public float getMediaClockRate() {
        return ((android.media.MediaTimestamp) real).getMediaClockRate();
    }

    public java.lang.String toString() {
        return ((android.media.MediaTimestamp) real).toString();
    }

    public static final com.micklab.dcg.wrapper.android.media.MediaTimestamp TIMESTAMP_UNKNOWN = com.micklab.dcg.wrapper.android.media.MediaTimestamp.wrap(android.media.MediaTimestamp.TIMESTAMP_UNKNOWN);

}
