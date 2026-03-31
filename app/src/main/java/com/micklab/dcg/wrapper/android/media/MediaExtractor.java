// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaExtractor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaExtractor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaExtractor wrap(android.media.MediaExtractor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaExtractor(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaExtractor getReal() {
        return (android.media.MediaExtractor) real;
    }

    public android.media.MediaExtractor unwrap() {
        return getReal();
    }

    public MediaExtractor() {
        this(new android.media.MediaExtractor(), (__DcgwBridgeToken) null);
    }

    public boolean advance() {
        return ((android.media.MediaExtractor) real).advance();
    }

    public long getCachedDuration() {
        return ((android.media.MediaExtractor) real).getCachedDuration();
    }

    public com.micklab.dcg.wrapper.android.media.MediaExtractor.CasInfo getCasInfo(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaExtractor.CasInfo.wrap(((android.media.MediaExtractor) real).getCasInfo(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.DrmInitData getDrmInitData() {
        return com.micklab.dcg.wrapper.android.media.DrmInitData.wrap(((android.media.MediaExtractor) real).getDrmInitData());
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getLogSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(((android.media.MediaExtractor) real).getLogSessionId());
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getMetrics() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.media.MediaExtractor) real).getMetrics());
    }

    public boolean getSampleCryptoInfo(com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo arg0) {
        return ((android.media.MediaExtractor) real).getSampleCryptoInfo(arg0 == null ? null : arg0.getReal());
    }

    public int getSampleFlags() {
        return ((android.media.MediaExtractor) real).getSampleFlags();
    }

    public long getSampleSize() {
        return ((android.media.MediaExtractor) real).getSampleSize();
    }

    public long getSampleTime() {
        return ((android.media.MediaExtractor) real).getSampleTime();
    }

    public int getSampleTrackIndex() {
        return ((android.media.MediaExtractor) real).getSampleTrackIndex();
    }

    public int getTrackCount() {
        return ((android.media.MediaExtractor) real).getTrackCount();
    }

    public com.micklab.dcg.wrapper.android.media.MediaFormat getTrackFormat(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(((android.media.MediaExtractor) real).getTrackFormat(arg0));
    }

    public boolean hasCacheReachedEndOfStream() {
        return ((android.media.MediaExtractor) real).hasCacheReachedEndOfStream();
    }

    public int readSampleData(java.nio.ByteBuffer arg0, int arg1) {
        return ((android.media.MediaExtractor) real).readSampleData(arg0, arg1);
    }

    public void release() {
        ((android.media.MediaExtractor) real).release();
    }

    public void seekTo(long arg0, int arg1) {
        ((android.media.MediaExtractor) real).seekTo(arg0, arg1);
    }

    public void selectTrack(int arg0) {
        ((android.media.MediaExtractor) real).selectTrack(arg0);
    }

    public void setDataSource(java.io.FileDescriptor arg0) throws java.io.IOException {
        ((android.media.MediaExtractor) real).setDataSource(arg0);
    }

    public void setDataSource(java.lang.String arg0) throws java.io.IOException {
        ((android.media.MediaExtractor) real).setDataSource(arg0);
    }

    public void setDataSource(com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor arg0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        ((android.media.MediaExtractor) real).setDataSource(arg0 == null ? null : arg0.getReal());
    }

    public void setDataSource(com.micklab.dcg.wrapper.android.media.MediaDataSource arg0) throws java.io.IOException {
        ((android.media.MediaExtractor) real).setDataSource(arg0 == null ? null : arg0.getReal());
    }

    public void setDataSource(java.io.FileDescriptor arg0, long arg1, long arg2) throws java.io.IOException {
        ((android.media.MediaExtractor) real).setDataSource(arg0, arg1, arg2);
    }

    public void setLogSessionId(com.micklab.dcg.wrapper.android.media.metrics.LogSessionId arg0) {
        ((android.media.MediaExtractor) real).setLogSessionId(arg0 == null ? null : arg0.getReal());
    }

    public void setMediaCas(com.micklab.dcg.wrapper.android.media.MediaCas arg0) {
        ((android.media.MediaExtractor) real).setMediaCas(arg0 == null ? null : arg0.getReal());
    }

    public void unselectTrack(int arg0) {
        ((android.media.MediaExtractor) real).unselectTrack(arg0);
    }

    public static final int SAMPLE_FLAG_ENCRYPTED = android.media.MediaExtractor.SAMPLE_FLAG_ENCRYPTED;
    public static final int SAMPLE_FLAG_PARTIAL_FRAME = android.media.MediaExtractor.SAMPLE_FLAG_PARTIAL_FRAME;
    public static final int SAMPLE_FLAG_SYNC = android.media.MediaExtractor.SAMPLE_FLAG_SYNC;
    public static final int SEEK_TO_CLOSEST_SYNC = android.media.MediaExtractor.SEEK_TO_CLOSEST_SYNC;
    public static final int SEEK_TO_NEXT_SYNC = android.media.MediaExtractor.SEEK_TO_NEXT_SYNC;
    public static final int SEEK_TO_PREVIOUS_SYNC = android.media.MediaExtractor.SEEK_TO_PREVIOUS_SYNC;

    public static final class CasInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CasInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaExtractor.CasInfo wrap(android.media.MediaExtractor.CasInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaExtractor.CasInfo(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaExtractor.CasInfo getReal() {
            return (android.media.MediaExtractor.CasInfo) real;
        }

        public android.media.MediaExtractor.CasInfo unwrap() {
            return getReal();
        }

        public byte[] getPrivateData() {
            return ((android.media.MediaExtractor.CasInfo) real).getPrivateData();
        }

        public com.micklab.dcg.wrapper.android.media.MediaCas.Session getSession() {
            return com.micklab.dcg.wrapper.android.media.MediaCas.Session.wrap(((android.media.MediaExtractor.CasInfo) real).getSession());
        }

        public int getSystemId() {
            return ((android.media.MediaExtractor.CasInfo) real).getSystemId();
        }

    }
    public static final class MetricsConstants {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MetricsConstants(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaExtractor.MetricsConstants wrap(android.media.MediaExtractor.MetricsConstants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaExtractor.MetricsConstants(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaExtractor.MetricsConstants getReal() {
            return (android.media.MediaExtractor.MetricsConstants) real;
        }

        public android.media.MediaExtractor.MetricsConstants unwrap() {
            return getReal();
        }

        public static final java.lang.String FORMAT = android.media.MediaExtractor.MetricsConstants.FORMAT;
        public static final java.lang.String MIME_TYPE = android.media.MediaExtractor.MetricsConstants.MIME_TYPE;
        public static final java.lang.String TRACKS = android.media.MediaExtractor.MetricsConstants.TRACKS;

    }
}
