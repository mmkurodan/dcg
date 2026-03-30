// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class TimedMetaData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimedMetaData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.TimedMetaData wrap(android.media.TimedMetaData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.TimedMetaData(real, (__DcgwBridgeToken) null);
    }

    public android.media.TimedMetaData getReal() {
        return (android.media.TimedMetaData) real;
    }

    public android.media.TimedMetaData unwrap() {
        return getReal();
    }

    public TimedMetaData(long arg0, byte[] arg1) {
        this(new android.media.TimedMetaData(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public byte[] getMetaData() {
        return ((android.media.TimedMetaData) real).getMetaData();
    }

    public long getTimestamp() {
        return ((android.media.TimedMetaData) real).getTimestamp();
    }

}
