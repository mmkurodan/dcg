// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaExtractor {
    private final android.media.MediaExtractor real;

    public MediaExtractor(android.media.MediaExtractor real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaExtractor wrap(android.media.MediaExtractor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaExtractor(real);
    }

    public android.media.MediaExtractor unwrap() {
        return real;
    }

    public MediaExtractor() {
        this(new android.media.MediaExtractor());
    }

    public boolean advance() {
        return real.advance();
    }

    public long getCachedDuration() {
        return real.getCachedDuration();
    }

    public com.micklab.dcg.wrapper.android.media.MediaExtractor.CasInfo getCasInfo(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaExtractor.CasInfo.wrap(real.getCasInfo(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.DrmInitData getDrmInitData() {
        return com.micklab.dcg.wrapper.android.media.DrmInitData.wrap(real.getDrmInitData());
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getLogSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(real.getLogSessionId());
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getMetrics() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(real.getMetrics());
    }

    public boolean getSampleCryptoInfo(com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo arg0) {
        return real.getSampleCryptoInfo(arg0 == null ? null : arg0.unwrap());
    }

    public int getSampleFlags() {
        return real.getSampleFlags();
    }

    public long getSampleSize() {
        return real.getSampleSize();
    }

    public long getSampleTime() {
        return real.getSampleTime();
    }

    public int getSampleTrackIndex() {
        return real.getSampleTrackIndex();
    }

    public int getTrackCount() {
        return real.getTrackCount();
    }

    public com.micklab.dcg.wrapper.android.media.MediaFormat getTrackFormat(int arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(real.getTrackFormat(arg0));
    }

    public boolean hasCacheReachedEndOfStream() {
        return real.hasCacheReachedEndOfStream();
    }

    public int readSampleData(java.nio.ByteBuffer arg0, int arg1) {
        return real.readSampleData(arg0, arg1);
    }

    public void release() {
        real.release();
    }

    public void seekTo(long arg0, int arg1) {
        real.seekTo(arg0, arg1);
    }

    public void selectTrack(int arg0) {
        real.selectTrack(arg0);
    }

    public void setDataSource(com.micklab.dcg.wrapper.android.media.MediaDataSource arg0) throws java.io.IOException {
        real.setDataSource(arg0 == null ? null : arg0.unwrap());
    }

    public void setDataSource(com.micklab.dcg.wrapper.android.content.res.AssetFileDescriptor arg0) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        real.setDataSource(arg0 == null ? null : arg0.unwrap());
    }

    public void setDataSource(java.io.FileDescriptor arg0) throws java.io.IOException {
        real.setDataSource(arg0);
    }

    public void setDataSource(java.lang.String arg0) throws java.io.IOException {
        real.setDataSource(arg0);
    }

    public void setDataSource(java.io.FileDescriptor arg0, long arg1, long arg2) throws java.io.IOException {
        real.setDataSource(arg0, arg1, arg2);
    }

    public void setLogSessionId(com.micklab.dcg.wrapper.android.media.metrics.LogSessionId arg0) {
        real.setLogSessionId(arg0 == null ? null : arg0.unwrap());
    }

    public void setMediaCas(com.micklab.dcg.wrapper.android.media.MediaCas arg0) {
        real.setMediaCas(arg0 == null ? null : arg0.unwrap());
    }

    public void unselectTrack(int arg0) {
        real.unselectTrack(arg0);
    }

    public static final int SAMPLE_FLAG_ENCRYPTED = android.media.MediaExtractor.SAMPLE_FLAG_ENCRYPTED;
    public static final int SAMPLE_FLAG_PARTIAL_FRAME = android.media.MediaExtractor.SAMPLE_FLAG_PARTIAL_FRAME;
    public static final int SAMPLE_FLAG_SYNC = android.media.MediaExtractor.SAMPLE_FLAG_SYNC;
    public static final int SEEK_TO_CLOSEST_SYNC = android.media.MediaExtractor.SEEK_TO_CLOSEST_SYNC;
    public static final int SEEK_TO_NEXT_SYNC = android.media.MediaExtractor.SEEK_TO_NEXT_SYNC;
    public static final int SEEK_TO_PREVIOUS_SYNC = android.media.MediaExtractor.SEEK_TO_PREVIOUS_SYNC;

    public static final class CasInfo {
        private final android.media.MediaExtractor.CasInfo real;

        public CasInfo(android.media.MediaExtractor.CasInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaExtractor.CasInfo wrap(android.media.MediaExtractor.CasInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaExtractor.CasInfo(real);
        }

        public android.media.MediaExtractor.CasInfo unwrap() {
            return real;
        }

        public byte[] getPrivateData() {
            return real.getPrivateData();
        }

        public android.media.MediaCas.Session getSession() {
            return real.getSession();
        }

        public int getSystemId() {
            return real.getSystemId();
        }

    }
    public static final class MetricsConstants {
        private final android.media.MediaExtractor.MetricsConstants real;

        public MetricsConstants(android.media.MediaExtractor.MetricsConstants real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaExtractor.MetricsConstants wrap(android.media.MediaExtractor.MetricsConstants real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaExtractor.MetricsConstants(real);
        }

        public android.media.MediaExtractor.MetricsConstants unwrap() {
            return real;
        }

        public static final java.lang.String FORMAT = android.media.MediaExtractor.MetricsConstants.FORMAT;
        public static final java.lang.String MIME_TYPE = android.media.MediaExtractor.MetricsConstants.MIME_TYPE;
        public static final java.lang.String TRACKS = android.media.MediaExtractor.MetricsConstants.TRACKS;

    }
}
