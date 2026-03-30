// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaMuxer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaMuxer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaMuxer wrap(android.media.MediaMuxer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaMuxer(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaMuxer getReal() {
        return (android.media.MediaMuxer) real;
    }

    public android.media.MediaMuxer unwrap() {
        return getReal();
    }

    public MediaMuxer(java.lang.String arg0, int arg1) throws java.io.IOException {
        this(new android.media.MediaMuxer(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public MediaMuxer(java.io.FileDescriptor arg0, int arg1) throws java.io.IOException {
        this(new android.media.MediaMuxer(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int addTrack(com.micklab.dcg.wrapper.android.media.MediaFormat arg0) {
        return ((android.media.MediaMuxer) real).addTrack(arg0 == null ? null : arg0.getReal());
    }

    public void release() {
        ((android.media.MediaMuxer) real).release();
    }

    public void setLocation(float arg0, float arg1) {
        ((android.media.MediaMuxer) real).setLocation(arg0, arg1);
    }

    public void setOrientationHint(int arg0) {
        ((android.media.MediaMuxer) real).setOrientationHint(arg0);
    }

    public void start() {
        ((android.media.MediaMuxer) real).start();
    }

    public void stop() {
        ((android.media.MediaMuxer) real).stop();
    }

    public void writeSampleData(int arg0, java.nio.ByteBuffer arg1, com.micklab.dcg.wrapper.android.media.MediaCodec.BufferInfo arg2) {
        ((android.media.MediaMuxer) real).writeSampleData(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public static final class OutputFormat {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OutputFormat(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaMuxer.OutputFormat wrap(android.media.MediaMuxer.OutputFormat real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaMuxer.OutputFormat(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaMuxer.OutputFormat getReal() {
            return (android.media.MediaMuxer.OutputFormat) real;
        }

        public android.media.MediaMuxer.OutputFormat unwrap() {
            return getReal();
        }

        public static final int MUXER_OUTPUT_3GPP = android.media.MediaMuxer.OutputFormat.MUXER_OUTPUT_3GPP;
        public static final int MUXER_OUTPUT_HEIF = android.media.MediaMuxer.OutputFormat.MUXER_OUTPUT_HEIF;
        public static final int MUXER_OUTPUT_MPEG_4 = android.media.MediaMuxer.OutputFormat.MUXER_OUTPUT_MPEG_4;
        public static final int MUXER_OUTPUT_OGG = android.media.MediaMuxer.OutputFormat.MUXER_OUTPUT_OGG;
        public static final int MUXER_OUTPUT_WEBM = android.media.MediaMuxer.OutputFormat.MUXER_OUTPUT_WEBM;

    }
}
