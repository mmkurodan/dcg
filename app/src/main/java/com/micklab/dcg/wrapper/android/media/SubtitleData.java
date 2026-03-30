// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class SubtitleData {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SubtitleData(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.SubtitleData wrap(android.media.SubtitleData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.SubtitleData(real, (__DcgwBridgeToken) null);
    }

    public android.media.SubtitleData getReal() {
        return (android.media.SubtitleData) real;
    }

    public android.media.SubtitleData unwrap() {
        return getReal();
    }

    public SubtitleData(int arg0, long arg1, long arg2, byte[] arg3) {
        this(new android.media.SubtitleData(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public byte[] getData() {
        return ((android.media.SubtitleData) real).getData();
    }

    public long getDurationUs() {
        return ((android.media.SubtitleData) real).getDurationUs();
    }

    public long getStartTimeUs() {
        return ((android.media.SubtitleData) real).getStartTimeUs();
    }

    public int getTrackIndex() {
        return ((android.media.SubtitleData) real).getTrackIndex();
    }

}
