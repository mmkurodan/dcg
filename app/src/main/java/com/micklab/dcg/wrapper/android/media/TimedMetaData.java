// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class TimedMetaData {
    private final android.media.TimedMetaData real;

    public TimedMetaData(android.media.TimedMetaData real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.TimedMetaData wrap(android.media.TimedMetaData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.TimedMetaData(real);
    }

    public android.media.TimedMetaData unwrap() {
        return real;
    }

    public TimedMetaData(long arg0, byte[] arg1) {
        this(new android.media.TimedMetaData(arg0, arg1));
    }

    public byte[] getMetaData() {
        return real.getMetaData();
    }

    public long getTimestamp() {
        return real.getTimestamp();
    }

}
