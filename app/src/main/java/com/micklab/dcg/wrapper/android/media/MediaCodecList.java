// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCodecList {
    private final android.media.MediaCodecList real;

    public MediaCodecList(android.media.MediaCodecList real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCodecList wrap(android.media.MediaCodecList real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodecList(real);
    }

    public android.media.MediaCodecList unwrap() {
        return real;
    }

    public MediaCodecList(int arg0) {
        this(new android.media.MediaCodecList(arg0));
    }

    public java.lang.String findDecoderForFormat(com.micklab.dcg.wrapper.android.media.MediaFormat arg0) {
        return real.findDecoderForFormat(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String findEncoderForFormat(com.micklab.dcg.wrapper.android.media.MediaFormat arg0) {
        return real.findEncoderForFormat(arg0 == null ? null : arg0.unwrap());
    }

    public static int getCodecCount() {
        return android.media.MediaCodecList.getCodecCount();
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCodecInfo getCodecInfoAt(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaCodecInfo.wrap(android.media.MediaCodecList.getCodecInfoAt(arg0));
    }

    public android.media.MediaCodecInfo[] getCodecInfos() {
        return real.getCodecInfos();
    }

    public static final int ALL_CODECS = android.media.MediaCodecList.ALL_CODECS;
    public static final int REGULAR_CODECS = android.media.MediaCodecList.REGULAR_CODECS;

}
