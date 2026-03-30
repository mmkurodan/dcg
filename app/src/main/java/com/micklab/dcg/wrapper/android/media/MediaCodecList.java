// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCodecList {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaCodecList(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCodecList wrap(android.media.MediaCodecList real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodecList(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaCodecList getReal() {
        return (android.media.MediaCodecList) real;
    }

    public android.media.MediaCodecList unwrap() {
        return getReal();
    }

    public MediaCodecList(int arg0) {
        this(new android.media.MediaCodecList(arg0), (__DcgwBridgeToken) null);
    }

    public java.lang.String findDecoderForFormat(com.micklab.dcg.wrapper.android.media.MediaFormat arg0) {
        return ((android.media.MediaCodecList) real).findDecoderForFormat(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String findEncoderForFormat(com.micklab.dcg.wrapper.android.media.MediaFormat arg0) {
        return ((android.media.MediaCodecList) real).findEncoderForFormat(arg0 == null ? null : arg0.getReal());
    }

    public static int getCodecCount() {
        return android.media.MediaCodecList.getCodecCount();
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCodecInfo getCodecInfoAt(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaCodecInfo.wrap(android.media.MediaCodecList.getCodecInfoAt(arg0));
    }

    public android.media.MediaCodecInfo[] getCodecInfos() {
        return ((android.media.MediaCodecList) real).getCodecInfos();
    }

    public static final int ALL_CODECS = android.media.MediaCodecList.ALL_CODECS;
    public static final int REGULAR_CODECS = android.media.MediaCodecList.REGULAR_CODECS;

}
