// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaTimestamp {
    private final android.media.MediaTimestamp real;

    public MediaTimestamp(android.media.MediaTimestamp real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaTimestamp wrap(android.media.MediaTimestamp real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaTimestamp(real);
    }

    public android.media.MediaTimestamp unwrap() {
        return real;
    }

    public MediaTimestamp(long arg0, long arg1, float arg2) {
        this(new android.media.MediaTimestamp(arg0, arg1, arg2));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getAnchorMediaTimeUs() {
        return real.getAnchorMediaTimeUs();
    }

    public long getAnchorSystemNanoTime() {
        return real.getAnchorSystemNanoTime();
    }

    public long getAnchorSytemNanoTime() {
        return real.getAnchorSytemNanoTime();
    }

    public float getMediaClockRate() {
        return real.getMediaClockRate();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final com.micklab.dcg.wrapper.android.media.MediaTimestamp TIMESTAMP_UNKNOWN = com.micklab.dcg.wrapper.android.media.MediaTimestamp.wrap(android.media.MediaTimestamp.TIMESTAMP_UNKNOWN);

}
