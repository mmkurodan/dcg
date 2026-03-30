// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaParser {
    private final android.media.MediaParser real;

    public MediaParser(android.media.MediaParser real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaParser wrap(android.media.MediaParser real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaParser(real);
    }

    public android.media.MediaParser unwrap() {
        return real;
    }

    public boolean advance(com.micklab.dcg.wrapper.android.media.MediaParser.SeekableInputReader arg0) throws java.io.IOException {
        return real.advance(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.media.MediaParser create(com.micklab.dcg.wrapper.android.media.MediaParser.OutputConsumer arg0, java.lang.String... arg1) {
        return com.micklab.dcg.wrapper.android.media.MediaParser.wrap(android.media.MediaParser.create(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaParser createByName(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.MediaParser.OutputConsumer arg1) {
        return com.micklab.dcg.wrapper.android.media.MediaParser.wrap(android.media.MediaParser.createByName(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getLogSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(real.getLogSessionId());
    }

    public java.lang.String getParserName() {
        return real.getParserName();
    }

    public void release() {
        real.release();
    }

    public void seek(com.micklab.dcg.wrapper.android.media.MediaParser.SeekPoint arg0) {
        real.seek(arg0 == null ? null : arg0.unwrap());
    }

    public void setLogSessionId(com.micklab.dcg.wrapper.android.media.metrics.LogSessionId arg0) {
        real.setLogSessionId(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.media.MediaParser setParameter(java.lang.String arg0, java.lang.Object arg1) {
        return com.micklab.dcg.wrapper.android.media.MediaParser.wrap(real.setParameter(arg0, arg1));
    }

    public boolean supportsParameter(java.lang.String arg0) {
        return real.supportsParameter(arg0);
    }

    public static final java.lang.String PARAMETER_ADTS_ENABLE_CBR_SEEKING = android.media.MediaParser.PARAMETER_ADTS_ENABLE_CBR_SEEKING;
    public static final java.lang.String PARAMETER_AMR_ENABLE_CBR_SEEKING = android.media.MediaParser.PARAMETER_AMR_ENABLE_CBR_SEEKING;
    public static final java.lang.String PARAMETER_FLAC_DISABLE_ID3 = android.media.MediaParser.PARAMETER_FLAC_DISABLE_ID3;
    public static final java.lang.String PARAMETER_MATROSKA_DISABLE_CUES_SEEKING = android.media.MediaParser.PARAMETER_MATROSKA_DISABLE_CUES_SEEKING;
    public static final java.lang.String PARAMETER_MP3_DISABLE_ID3 = android.media.MediaParser.PARAMETER_MP3_DISABLE_ID3;
    public static final java.lang.String PARAMETER_MP3_ENABLE_CBR_SEEKING = android.media.MediaParser.PARAMETER_MP3_ENABLE_CBR_SEEKING;
    public static final java.lang.String PARAMETER_MP3_ENABLE_INDEX_SEEKING = android.media.MediaParser.PARAMETER_MP3_ENABLE_INDEX_SEEKING;
    public static final java.lang.String PARAMETER_MP4_IGNORE_EDIT_LISTS = android.media.MediaParser.PARAMETER_MP4_IGNORE_EDIT_LISTS;
    public static final java.lang.String PARAMETER_MP4_IGNORE_TFDT_BOX = android.media.MediaParser.PARAMETER_MP4_IGNORE_TFDT_BOX;
    public static final java.lang.String PARAMETER_MP4_TREAT_VIDEO_FRAMES_AS_KEYFRAMES = android.media.MediaParser.PARAMETER_MP4_TREAT_VIDEO_FRAMES_AS_KEYFRAMES;
    public static final java.lang.String PARAMETER_TS_ALLOW_NON_IDR_AVC_KEYFRAMES = android.media.MediaParser.PARAMETER_TS_ALLOW_NON_IDR_AVC_KEYFRAMES;
    public static final java.lang.String PARAMETER_TS_DETECT_ACCESS_UNITS = android.media.MediaParser.PARAMETER_TS_DETECT_ACCESS_UNITS;
    public static final java.lang.String PARAMETER_TS_ENABLE_HDMV_DTS_AUDIO_STREAMS = android.media.MediaParser.PARAMETER_TS_ENABLE_HDMV_DTS_AUDIO_STREAMS;
    public static final java.lang.String PARAMETER_TS_IGNORE_AAC_STREAM = android.media.MediaParser.PARAMETER_TS_IGNORE_AAC_STREAM;
    public static final java.lang.String PARAMETER_TS_IGNORE_AVC_STREAM = android.media.MediaParser.PARAMETER_TS_IGNORE_AVC_STREAM;
    public static final java.lang.String PARAMETER_TS_IGNORE_SPLICE_INFO_STREAM = android.media.MediaParser.PARAMETER_TS_IGNORE_SPLICE_INFO_STREAM;
    public static final java.lang.String PARAMETER_TS_MODE = android.media.MediaParser.PARAMETER_TS_MODE;
    public static final java.lang.String PARSER_NAME_AC3 = android.media.MediaParser.PARSER_NAME_AC3;
    public static final java.lang.String PARSER_NAME_AC4 = android.media.MediaParser.PARSER_NAME_AC4;
    public static final java.lang.String PARSER_NAME_ADTS = android.media.MediaParser.PARSER_NAME_ADTS;
    public static final java.lang.String PARSER_NAME_AMR = android.media.MediaParser.PARSER_NAME_AMR;
    public static final java.lang.String PARSER_NAME_FLAC = android.media.MediaParser.PARSER_NAME_FLAC;
    public static final java.lang.String PARSER_NAME_FLV = android.media.MediaParser.PARSER_NAME_FLV;
    public static final java.lang.String PARSER_NAME_FMP4 = android.media.MediaParser.PARSER_NAME_FMP4;
    public static final java.lang.String PARSER_NAME_MATROSKA = android.media.MediaParser.PARSER_NAME_MATROSKA;
    public static final java.lang.String PARSER_NAME_MP3 = android.media.MediaParser.PARSER_NAME_MP3;
    public static final java.lang.String PARSER_NAME_MP4 = android.media.MediaParser.PARSER_NAME_MP4;
    public static final java.lang.String PARSER_NAME_OGG = android.media.MediaParser.PARSER_NAME_OGG;
    public static final java.lang.String PARSER_NAME_PS = android.media.MediaParser.PARSER_NAME_PS;
    public static final java.lang.String PARSER_NAME_TS = android.media.MediaParser.PARSER_NAME_TS;
    public static final java.lang.String PARSER_NAME_UNKNOWN = android.media.MediaParser.PARSER_NAME_UNKNOWN;
    public static final java.lang.String PARSER_NAME_WAV = android.media.MediaParser.PARSER_NAME_WAV;
    public static final int SAMPLE_FLAG_DECODE_ONLY = android.media.MediaParser.SAMPLE_FLAG_DECODE_ONLY;
    public static final int SAMPLE_FLAG_ENCRYPTED = android.media.MediaParser.SAMPLE_FLAG_ENCRYPTED;
    public static final int SAMPLE_FLAG_HAS_SUPPLEMENTAL_DATA = android.media.MediaParser.SAMPLE_FLAG_HAS_SUPPLEMENTAL_DATA;
    public static final int SAMPLE_FLAG_KEY_FRAME = android.media.MediaParser.SAMPLE_FLAG_KEY_FRAME;
    public static final int SAMPLE_FLAG_LAST_SAMPLE = android.media.MediaParser.SAMPLE_FLAG_LAST_SAMPLE;

    public static final class InputReader {
        private final android.media.MediaParser.InputReader real;

        public InputReader(android.media.MediaParser.InputReader real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaParser.InputReader wrap(android.media.MediaParser.InputReader real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaParser.InputReader(real);
        }

        public android.media.MediaParser.InputReader unwrap() {
            return real;
        }

        public long getLength() {
            return real.getLength();
        }

        public long getPosition() {
            return real.getPosition();
        }

        public int read(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
            return real.read(arg0, arg1, arg2);
        }

    }
    public static final class OutputConsumer {
        private final android.media.MediaParser.OutputConsumer real;

        public OutputConsumer(android.media.MediaParser.OutputConsumer real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaParser.OutputConsumer wrap(android.media.MediaParser.OutputConsumer real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaParser.OutputConsumer(real);
        }

        public android.media.MediaParser.OutputConsumer unwrap() {
            return real;
        }

        public void onSampleCompleted(int arg0, long arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.media.MediaCodec.CryptoInfo arg5) {
            real.onSampleCompleted(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap());
        }

        public void onSampleDataFound(int arg0, com.micklab.dcg.wrapper.android.media.MediaParser.InputReader arg1) throws java.io.IOException {
            real.onSampleDataFound(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onSeekMapFound(com.micklab.dcg.wrapper.android.media.MediaParser.SeekMap arg0) {
            real.onSeekMapFound(arg0 == null ? null : arg0.unwrap());
        }

        public void onTrackCountFound(int arg0) {
            real.onTrackCountFound(arg0);
        }

        public void onTrackDataFound(int arg0, com.micklab.dcg.wrapper.android.media.MediaParser.TrackData arg1) {
            real.onTrackDataFound(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class ParsingException {
        private final android.media.MediaParser.ParsingException real;

        public ParsingException(android.media.MediaParser.ParsingException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaParser.ParsingException wrap(android.media.MediaParser.ParsingException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaParser.ParsingException(real);
        }

        public android.media.MediaParser.ParsingException unwrap() {
            return real;
        }

    }
    public static final class SeekMap {
        private final android.media.MediaParser.SeekMap real;

        public SeekMap(android.media.MediaParser.SeekMap real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaParser.SeekMap wrap(android.media.MediaParser.SeekMap real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaParser.SeekMap(real);
        }

        public android.media.MediaParser.SeekMap unwrap() {
            return real;
        }

        public long getDurationMicros() {
            return real.getDurationMicros();
        }

        public boolean isSeekable() {
            return real.isSeekable();
        }

        public static final int UNKNOWN_DURATION = android.media.MediaParser.SeekMap.UNKNOWN_DURATION;

    }
    public static final class SeekPoint {
        private final android.media.MediaParser.SeekPoint real;

        public SeekPoint(android.media.MediaParser.SeekPoint real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaParser.SeekPoint wrap(android.media.MediaParser.SeekPoint real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaParser.SeekPoint(real);
        }

        public android.media.MediaParser.SeekPoint unwrap() {
            return real;
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public static final com.micklab.dcg.wrapper.android.media.MediaParser.SeekPoint START = com.micklab.dcg.wrapper.android.media.MediaParser.SeekPoint.wrap(android.media.MediaParser.SeekPoint.START);

    }
    public static final class SeekableInputReader {
        private final android.media.MediaParser.SeekableInputReader real;

        public SeekableInputReader(android.media.MediaParser.SeekableInputReader real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaParser.SeekableInputReader wrap(android.media.MediaParser.SeekableInputReader real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaParser.SeekableInputReader(real);
        }

        public android.media.MediaParser.SeekableInputReader unwrap() {
            return real;
        }

        public void seekToPosition(long arg0) {
            real.seekToPosition(arg0);
        }

    }
    public static final class TrackData {
        private final android.media.MediaParser.TrackData real;

        public TrackData(android.media.MediaParser.TrackData real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaParser.TrackData wrap(android.media.MediaParser.TrackData real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaParser.TrackData(real);
        }

        public android.media.MediaParser.TrackData unwrap() {
            return real;
        }


    }
    public static final class UnrecognizedInputFormatException {
        private final android.media.MediaParser.UnrecognizedInputFormatException real;

        public UnrecognizedInputFormatException(android.media.MediaParser.UnrecognizedInputFormatException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaParser.UnrecognizedInputFormatException wrap(android.media.MediaParser.UnrecognizedInputFormatException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaParser.UnrecognizedInputFormatException(real);
        }

        public android.media.MediaParser.UnrecognizedInputFormatException unwrap() {
            return real;
        }

    }
}
