// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaMuxer {
    private final android.media.MediaMuxer real;

    public MediaMuxer(android.media.MediaMuxer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaMuxer wrap(android.media.MediaMuxer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaMuxer(real);
    }

    public android.media.MediaMuxer unwrap() {
        return real;
    }

    public MediaMuxer(java.lang.String arg0, int arg1) throws java.io.IOException {
        this(new android.media.MediaMuxer(arg0, arg1));
    }

    public MediaMuxer(java.io.FileDescriptor arg0, int arg1) throws java.io.IOException {
        this(new android.media.MediaMuxer(arg0, arg1));
    }

    public int addTrack(com.micklab.dcg.wrapper.android.media.MediaFormat arg0) {
        return real.addTrack(arg0 == null ? null : arg0.unwrap());
    }

    public void release() {
        real.release();
    }

    public void setLocation(float arg0, float arg1) {
        real.setLocation(arg0, arg1);
    }

    public void setOrientationHint(int arg0) {
        real.setOrientationHint(arg0);
    }

    public void start() {
        real.start();
    }

    public void stop() {
        real.stop();
    }

    public void writeSampleData(int arg0, java.nio.ByteBuffer arg1, com.micklab.dcg.wrapper.android.media.MediaCodec.BufferInfo arg2) {
        real.writeSampleData(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public static final class OutputFormat {
        private final android.media.MediaMuxer.OutputFormat real;

        public OutputFormat(android.media.MediaMuxer.OutputFormat real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaMuxer.OutputFormat wrap(android.media.MediaMuxer.OutputFormat real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaMuxer.OutputFormat(real);
        }

        public android.media.MediaMuxer.OutputFormat unwrap() {
            return real;
        }

        public static final int MUXER_OUTPUT_3GPP = android.media.MediaMuxer.OutputFormat.MUXER_OUTPUT_3GPP;
        public static final int MUXER_OUTPUT_HEIF = android.media.MediaMuxer.OutputFormat.MUXER_OUTPUT_HEIF;
        public static final int MUXER_OUTPUT_MPEG_4 = android.media.MediaMuxer.OutputFormat.MUXER_OUTPUT_MPEG_4;
        public static final int MUXER_OUTPUT_OGG = android.media.MediaMuxer.OutputFormat.MUXER_OUTPUT_OGG;
        public static final int MUXER_OUTPUT_WEBM = android.media.MediaMuxer.OutputFormat.MUXER_OUTPUT_WEBM;

    }
}
