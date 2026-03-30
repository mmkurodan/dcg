// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class SubtitleData {
    private final android.media.SubtitleData real;

    public SubtitleData(android.media.SubtitleData real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.SubtitleData wrap(android.media.SubtitleData real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.SubtitleData(real);
    }

    public android.media.SubtitleData unwrap() {
        return real;
    }

    public SubtitleData(int arg0, long arg1, long arg2, byte[] arg3) {
        this(new android.media.SubtitleData(arg0, arg1, arg2, arg3));
    }

    public byte[] getData() {
        return real.getData();
    }

    public long getDurationUs() {
        return real.getDurationUs();
    }

    public long getStartTimeUs() {
        return real.getStartTimeUs();
    }

    public int getTrackIndex() {
        return real.getTrackIndex();
    }

}
