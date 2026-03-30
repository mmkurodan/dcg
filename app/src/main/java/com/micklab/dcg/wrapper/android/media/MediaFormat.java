// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaFormat {
    private final android.media.MediaFormat real;

    public MediaFormat(android.media.MediaFormat real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaFormat wrap(android.media.MediaFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaFormat(real);
    }

    public android.media.MediaFormat unwrap() {
        return real;
    }

    public MediaFormat() {
        this(new android.media.MediaFormat());
    }

    public MediaFormat(com.micklab.dcg.wrapper.android.media.MediaFormat arg0) {
        this(new android.media.MediaFormat(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean containsFeature(java.lang.String arg0) {
        return real.containsFeature(arg0);
    }

    public boolean containsKey(java.lang.String arg0) {
        return real.containsKey(arg0);
    }

    public static com.micklab.dcg.wrapper.android.media.MediaFormat createAudioFormat(java.lang.String arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(android.media.MediaFormat.createAudioFormat(arg0, arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaFormat createSubtitleFormat(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(android.media.MediaFormat.createSubtitleFormat(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.media.MediaFormat createVideoFormat(java.lang.String arg0, int arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(android.media.MediaFormat.createVideoFormat(arg0, arg1, arg2));
    }

    public java.nio.ByteBuffer getByteBuffer(java.lang.String arg0) {
        return real.getByteBuffer(arg0);
    }

    public java.nio.ByteBuffer getByteBuffer(java.lang.String arg0, java.nio.ByteBuffer arg1) {
        return real.getByteBuffer(arg0, arg1);
    }

    public boolean getFeatureEnabled(java.lang.String arg0) {
        return real.getFeatureEnabled(arg0);
    }

    public float getFloat(java.lang.String arg0) {
        return real.getFloat(arg0);
    }

    public float getFloat(java.lang.String arg0, float arg1) {
        return real.getFloat(arg0, arg1);
    }

    public int getInteger(java.lang.String arg0) {
        return real.getInteger(arg0);
    }

    public int getInteger(java.lang.String arg0, int arg1) {
        return real.getInteger(arg0, arg1);
    }

    public long getLong(java.lang.String arg0) {
        return real.getLong(arg0);
    }

    public long getLong(java.lang.String arg0, long arg1) {
        return real.getLong(arg0, arg1);
    }

    public java.lang.Number getNumber(java.lang.String arg0) {
        return real.getNumber(arg0);
    }

    public java.lang.Number getNumber(java.lang.String arg0, java.lang.Number arg1) {
        return real.getNumber(arg0, arg1);
    }

    public java.lang.String getString(java.lang.String arg0) {
        return real.getString(arg0);
    }

    public java.lang.String getString(java.lang.String arg0, java.lang.String arg1) {
        return real.getString(arg0, arg1);
    }

    public int getValueTypeForKey(java.lang.String arg0) {
        return real.getValueTypeForKey(arg0);
    }

    public void removeFeature(java.lang.String arg0) {
        real.removeFeature(arg0);
    }

    public void removeKey(java.lang.String arg0) {
        real.removeKey(arg0);
    }

    public void setByteBuffer(java.lang.String arg0, java.nio.ByteBuffer arg1) {
        real.setByteBuffer(arg0, arg1);
    }

    public void setFeatureEnabled(java.lang.String arg0, boolean arg1) {
        real.setFeatureEnabled(arg0, arg1);
    }

    public void setFloat(java.lang.String arg0, float arg1) {
        real.setFloat(arg0, arg1);
    }

    public void setInteger(java.lang.String arg0, int arg1) {
        real.setInteger(arg0, arg1);
    }

    public void setLong(java.lang.String arg0, long arg1) {
        real.setLong(arg0, arg1);
    }

    public void setString(java.lang.String arg0, java.lang.String arg1) {
        real.setString(arg0, arg1);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int COLOR_RANGE_FULL = android.media.MediaFormat.COLOR_RANGE_FULL;
    public static final int COLOR_RANGE_LIMITED = android.media.MediaFormat.COLOR_RANGE_LIMITED;
    public static final int COLOR_STANDARD_BT2020 = android.media.MediaFormat.COLOR_STANDARD_BT2020;
    public static final int COLOR_STANDARD_BT601_NTSC = android.media.MediaFormat.COLOR_STANDARD_BT601_NTSC;
    public static final int COLOR_STANDARD_BT601_PAL = android.media.MediaFormat.COLOR_STANDARD_BT601_PAL;
    public static final int COLOR_STANDARD_BT709 = android.media.MediaFormat.COLOR_STANDARD_BT709;
    public static final int COLOR_TRANSFER_HLG = android.media.MediaFormat.COLOR_TRANSFER_HLG;
    public static final int COLOR_TRANSFER_LINEAR = android.media.MediaFormat.COLOR_TRANSFER_LINEAR;
    public static final int COLOR_TRANSFER_SDR_VIDEO = android.media.MediaFormat.COLOR_TRANSFER_SDR_VIDEO;
    public static final int COLOR_TRANSFER_ST2084 = android.media.MediaFormat.COLOR_TRANSFER_ST2084;
    public static final java.lang.String KEY_AAC_DRC_ALBUM_MODE = android.media.MediaFormat.KEY_AAC_DRC_ALBUM_MODE;
    public static final java.lang.String KEY_AAC_DRC_ATTENUATION_FACTOR = android.media.MediaFormat.KEY_AAC_DRC_ATTENUATION_FACTOR;
    public static final java.lang.String KEY_AAC_DRC_BOOST_FACTOR = android.media.MediaFormat.KEY_AAC_DRC_BOOST_FACTOR;
    public static final java.lang.String KEY_AAC_DRC_EFFECT_TYPE = android.media.MediaFormat.KEY_AAC_DRC_EFFECT_TYPE;
    public static final java.lang.String KEY_AAC_DRC_HEAVY_COMPRESSION = android.media.MediaFormat.KEY_AAC_DRC_HEAVY_COMPRESSION;
    public static final java.lang.String KEY_AAC_DRC_OUTPUT_LOUDNESS = android.media.MediaFormat.KEY_AAC_DRC_OUTPUT_LOUDNESS;
    public static final java.lang.String KEY_AAC_DRC_TARGET_REFERENCE_LEVEL = android.media.MediaFormat.KEY_AAC_DRC_TARGET_REFERENCE_LEVEL;
    public static final java.lang.String KEY_AAC_ENCODED_TARGET_LEVEL = android.media.MediaFormat.KEY_AAC_ENCODED_TARGET_LEVEL;
    public static final java.lang.String KEY_AAC_MAX_OUTPUT_CHANNEL_COUNT = android.media.MediaFormat.KEY_AAC_MAX_OUTPUT_CHANNEL_COUNT;
    public static final java.lang.String KEY_AAC_SBR_MODE = android.media.MediaFormat.KEY_AAC_SBR_MODE;
    public static final java.lang.String KEY_ALLOW_FRAME_DROP = android.media.MediaFormat.KEY_ALLOW_FRAME_DROP;
    public static final java.lang.String KEY_AUDIO_SESSION_ID = android.media.MediaFormat.KEY_AUDIO_SESSION_ID;
    public static final java.lang.String KEY_BITRATE_MODE = android.media.MediaFormat.KEY_BITRATE_MODE;
    public static final java.lang.String KEY_BIT_RATE = android.media.MediaFormat.KEY_BIT_RATE;
    public static final java.lang.String KEY_BUFFER_BATCH_MAX_OUTPUT_SIZE = android.media.MediaFormat.KEY_BUFFER_BATCH_MAX_OUTPUT_SIZE;
    public static final java.lang.String KEY_BUFFER_BATCH_THRESHOLD_OUTPUT_SIZE = android.media.MediaFormat.KEY_BUFFER_BATCH_THRESHOLD_OUTPUT_SIZE;
    public static final java.lang.String KEY_CAPTION_SERVICE_NUMBER = android.media.MediaFormat.KEY_CAPTION_SERVICE_NUMBER;
    public static final java.lang.String KEY_CAPTURE_RATE = android.media.MediaFormat.KEY_CAPTURE_RATE;
    public static final java.lang.String KEY_CHANNEL_COUNT = android.media.MediaFormat.KEY_CHANNEL_COUNT;
    public static final java.lang.String KEY_CHANNEL_MASK = android.media.MediaFormat.KEY_CHANNEL_MASK;
    public static final java.lang.String KEY_CODECS_STRING = android.media.MediaFormat.KEY_CODECS_STRING;
    public static final java.lang.String KEY_COLOR_FORMAT = android.media.MediaFormat.KEY_COLOR_FORMAT;
    public static final java.lang.String KEY_COLOR_RANGE = android.media.MediaFormat.KEY_COLOR_RANGE;
    public static final java.lang.String KEY_COLOR_STANDARD = android.media.MediaFormat.KEY_COLOR_STANDARD;
    public static final java.lang.String KEY_COLOR_TRANSFER = android.media.MediaFormat.KEY_COLOR_TRANSFER;
    public static final java.lang.String KEY_COLOR_TRANSFER_REQUEST = android.media.MediaFormat.KEY_COLOR_TRANSFER_REQUEST;
    public static final java.lang.String KEY_COMPLEXITY = android.media.MediaFormat.KEY_COMPLEXITY;
    public static final java.lang.String KEY_CREATE_INPUT_SURFACE_SUSPENDED = android.media.MediaFormat.KEY_CREATE_INPUT_SURFACE_SUSPENDED;
    public static final java.lang.String KEY_CROP_BOTTOM = android.media.MediaFormat.KEY_CROP_BOTTOM;
    public static final java.lang.String KEY_CROP_LEFT = android.media.MediaFormat.KEY_CROP_LEFT;
    public static final java.lang.String KEY_CROP_RIGHT = android.media.MediaFormat.KEY_CROP_RIGHT;
    public static final java.lang.String KEY_CROP_TOP = android.media.MediaFormat.KEY_CROP_TOP;
    public static final java.lang.String KEY_DURATION = android.media.MediaFormat.KEY_DURATION;
    public static final java.lang.String KEY_ENCODER_DELAY = android.media.MediaFormat.KEY_ENCODER_DELAY;
    public static final java.lang.String KEY_ENCODER_PADDING = android.media.MediaFormat.KEY_ENCODER_PADDING;
    public static final java.lang.String KEY_FLAC_COMPRESSION_LEVEL = android.media.MediaFormat.KEY_FLAC_COMPRESSION_LEVEL;
    public static final java.lang.String KEY_FRAME_RATE = android.media.MediaFormat.KEY_FRAME_RATE;
    public static final java.lang.String KEY_GRID_COLUMNS = android.media.MediaFormat.KEY_GRID_COLUMNS;
    public static final java.lang.String KEY_GRID_ROWS = android.media.MediaFormat.KEY_GRID_ROWS;
    public static final java.lang.String KEY_HAPTIC_CHANNEL_COUNT = android.media.MediaFormat.KEY_HAPTIC_CHANNEL_COUNT;
    public static final java.lang.String KEY_HARDWARE_AV_SYNC_ID = android.media.MediaFormat.KEY_HARDWARE_AV_SYNC_ID;
    public static final java.lang.String KEY_HDR10_PLUS_INFO = android.media.MediaFormat.KEY_HDR10_PLUS_INFO;
    public static final java.lang.String KEY_HDR_STATIC_INFO = android.media.MediaFormat.KEY_HDR_STATIC_INFO;
    public static final java.lang.String KEY_HEIGHT = android.media.MediaFormat.KEY_HEIGHT;
    public static final java.lang.String KEY_IMPORTANCE = android.media.MediaFormat.KEY_IMPORTANCE;
    public static final java.lang.String KEY_INTRA_REFRESH_PERIOD = android.media.MediaFormat.KEY_INTRA_REFRESH_PERIOD;
    public static final java.lang.String KEY_IS_ADTS = android.media.MediaFormat.KEY_IS_ADTS;
    public static final java.lang.String KEY_IS_AUTOSELECT = android.media.MediaFormat.KEY_IS_AUTOSELECT;
    public static final java.lang.String KEY_IS_DEFAULT = android.media.MediaFormat.KEY_IS_DEFAULT;
    public static final java.lang.String KEY_IS_FORCED_SUBTITLE = android.media.MediaFormat.KEY_IS_FORCED_SUBTITLE;
    public static final java.lang.String KEY_I_FRAME_INTERVAL = android.media.MediaFormat.KEY_I_FRAME_INTERVAL;
    public static final java.lang.String KEY_LANGUAGE = android.media.MediaFormat.KEY_LANGUAGE;
    public static final java.lang.String KEY_LATENCY = android.media.MediaFormat.KEY_LATENCY;
    public static final java.lang.String KEY_LEVEL = android.media.MediaFormat.KEY_LEVEL;
    public static final java.lang.String KEY_LOW_LATENCY = android.media.MediaFormat.KEY_LOW_LATENCY;
    public static final java.lang.String KEY_MAX_B_FRAMES = android.media.MediaFormat.KEY_MAX_B_FRAMES;
    public static final java.lang.String KEY_MAX_FPS_TO_ENCODER = android.media.MediaFormat.KEY_MAX_FPS_TO_ENCODER;
    public static final java.lang.String KEY_MAX_HEIGHT = android.media.MediaFormat.KEY_MAX_HEIGHT;
    public static final java.lang.String KEY_MAX_INPUT_SIZE = android.media.MediaFormat.KEY_MAX_INPUT_SIZE;
    public static final java.lang.String KEY_MAX_OUTPUT_CHANNEL_COUNT = android.media.MediaFormat.KEY_MAX_OUTPUT_CHANNEL_COUNT;
    public static final java.lang.String KEY_MAX_PTS_GAP_TO_ENCODER = android.media.MediaFormat.KEY_MAX_PTS_GAP_TO_ENCODER;
    public static final java.lang.String KEY_MAX_WIDTH = android.media.MediaFormat.KEY_MAX_WIDTH;
    public static final java.lang.String KEY_MIME = android.media.MediaFormat.KEY_MIME;
    public static final java.lang.String KEY_MPEGH_COMPATIBLE_SETS = android.media.MediaFormat.KEY_MPEGH_COMPATIBLE_SETS;
    public static final java.lang.String KEY_MPEGH_REFERENCE_CHANNEL_LAYOUT = android.media.MediaFormat.KEY_MPEGH_REFERENCE_CHANNEL_LAYOUT;
    public static final java.lang.String KEY_OPERATING_RATE = android.media.MediaFormat.KEY_OPERATING_RATE;
    public static final java.lang.String KEY_OUTPUT_REORDER_DEPTH = android.media.MediaFormat.KEY_OUTPUT_REORDER_DEPTH;
    public static final java.lang.String KEY_PCM_ENCODING = android.media.MediaFormat.KEY_PCM_ENCODING;
    public static final java.lang.String KEY_PICTURE_TYPE = android.media.MediaFormat.KEY_PICTURE_TYPE;
    public static final java.lang.String KEY_PIXEL_ASPECT_RATIO_HEIGHT = android.media.MediaFormat.KEY_PIXEL_ASPECT_RATIO_HEIGHT;
    public static final java.lang.String KEY_PIXEL_ASPECT_RATIO_WIDTH = android.media.MediaFormat.KEY_PIXEL_ASPECT_RATIO_WIDTH;
    public static final java.lang.String KEY_PREPEND_HEADER_TO_SYNC_FRAMES = android.media.MediaFormat.KEY_PREPEND_HEADER_TO_SYNC_FRAMES;
    public static final java.lang.String KEY_PRIORITY = android.media.MediaFormat.KEY_PRIORITY;
    public static final java.lang.String KEY_PUSH_BLANK_BUFFERS_ON_STOP = android.media.MediaFormat.KEY_PUSH_BLANK_BUFFERS_ON_STOP;
    public static final java.lang.String KEY_QUALITY = android.media.MediaFormat.KEY_QUALITY;
    public static final java.lang.String KEY_REPEAT_PREVIOUS_FRAME_AFTER = android.media.MediaFormat.KEY_REPEAT_PREVIOUS_FRAME_AFTER;
    public static final java.lang.String KEY_ROTATION = android.media.MediaFormat.KEY_ROTATION;
    public static final java.lang.String KEY_SAMPLE_RATE = android.media.MediaFormat.KEY_SAMPLE_RATE;
    public static final java.lang.String KEY_SLICE_HEIGHT = android.media.MediaFormat.KEY_SLICE_HEIGHT;
    public static final java.lang.String KEY_SLOW_MOTION_MARKERS = android.media.MediaFormat.KEY_SLOW_MOTION_MARKERS;
    public static final java.lang.String KEY_STRIDE = android.media.MediaFormat.KEY_STRIDE;
    public static final java.lang.String KEY_TEMPORAL_LAYERING = android.media.MediaFormat.KEY_TEMPORAL_LAYERING;
    public static final java.lang.String KEY_TILE_HEIGHT = android.media.MediaFormat.KEY_TILE_HEIGHT;
    public static final java.lang.String KEY_TILE_WIDTH = android.media.MediaFormat.KEY_TILE_WIDTH;
    public static final java.lang.String KEY_TRACK_ID = android.media.MediaFormat.KEY_TRACK_ID;
    public static final java.lang.String KEY_VIDEO_ENCODING_STATISTICS_LEVEL = android.media.MediaFormat.KEY_VIDEO_ENCODING_STATISTICS_LEVEL;
    public static final java.lang.String KEY_VIDEO_QP_AVERAGE = android.media.MediaFormat.KEY_VIDEO_QP_AVERAGE;
    public static final java.lang.String KEY_VIDEO_QP_B_MAX = android.media.MediaFormat.KEY_VIDEO_QP_B_MAX;
    public static final java.lang.String KEY_VIDEO_QP_B_MIN = android.media.MediaFormat.KEY_VIDEO_QP_B_MIN;
    public static final java.lang.String KEY_VIDEO_QP_I_MAX = android.media.MediaFormat.KEY_VIDEO_QP_I_MAX;
    public static final java.lang.String KEY_VIDEO_QP_I_MIN = android.media.MediaFormat.KEY_VIDEO_QP_I_MIN;
    public static final java.lang.String KEY_VIDEO_QP_MAX = android.media.MediaFormat.KEY_VIDEO_QP_MAX;
    public static final java.lang.String KEY_VIDEO_QP_MIN = android.media.MediaFormat.KEY_VIDEO_QP_MIN;
    public static final java.lang.String KEY_VIDEO_QP_P_MAX = android.media.MediaFormat.KEY_VIDEO_QP_P_MAX;
    public static final java.lang.String KEY_VIDEO_QP_P_MIN = android.media.MediaFormat.KEY_VIDEO_QP_P_MIN;
    public static final java.lang.String KEY_WIDTH = android.media.MediaFormat.KEY_WIDTH;
    public static final java.lang.String LOG_SESSION_ID = android.media.MediaFormat.LOG_SESSION_ID;
    public static final java.lang.String MIMETYPE_AUDIO_AAC = android.media.MediaFormat.MIMETYPE_AUDIO_AAC;
    public static final java.lang.String MIMETYPE_AUDIO_AAC_ELD = android.media.MediaFormat.MIMETYPE_AUDIO_AAC_ELD;
    public static final java.lang.String MIMETYPE_AUDIO_AAC_HE_V1 = android.media.MediaFormat.MIMETYPE_AUDIO_AAC_HE_V1;
    public static final java.lang.String MIMETYPE_AUDIO_AAC_HE_V2 = android.media.MediaFormat.MIMETYPE_AUDIO_AAC_HE_V2;
    public static final java.lang.String MIMETYPE_AUDIO_AAC_LC = android.media.MediaFormat.MIMETYPE_AUDIO_AAC_LC;
    public static final java.lang.String MIMETYPE_AUDIO_AAC_XHE = android.media.MediaFormat.MIMETYPE_AUDIO_AAC_XHE;
    public static final java.lang.String MIMETYPE_AUDIO_AC3 = android.media.MediaFormat.MIMETYPE_AUDIO_AC3;
    public static final java.lang.String MIMETYPE_AUDIO_AC4 = android.media.MediaFormat.MIMETYPE_AUDIO_AC4;
    public static final java.lang.String MIMETYPE_AUDIO_AMR_NB = android.media.MediaFormat.MIMETYPE_AUDIO_AMR_NB;
    public static final java.lang.String MIMETYPE_AUDIO_AMR_WB = android.media.MediaFormat.MIMETYPE_AUDIO_AMR_WB;
    public static final java.lang.String MIMETYPE_AUDIO_DOLBY_MAT = android.media.MediaFormat.MIMETYPE_AUDIO_DOLBY_MAT;
    public static final java.lang.String MIMETYPE_AUDIO_DOLBY_TRUEHD = android.media.MediaFormat.MIMETYPE_AUDIO_DOLBY_TRUEHD;
    public static final java.lang.String MIMETYPE_AUDIO_DRA = android.media.MediaFormat.MIMETYPE_AUDIO_DRA;
    public static final java.lang.String MIMETYPE_AUDIO_DTS = android.media.MediaFormat.MIMETYPE_AUDIO_DTS;
    public static final java.lang.String MIMETYPE_AUDIO_DTS_HD = android.media.MediaFormat.MIMETYPE_AUDIO_DTS_HD;
    public static final java.lang.String MIMETYPE_AUDIO_DTS_UHD = android.media.MediaFormat.MIMETYPE_AUDIO_DTS_UHD;
    public static final java.lang.String MIMETYPE_AUDIO_EAC3 = android.media.MediaFormat.MIMETYPE_AUDIO_EAC3;
    public static final java.lang.String MIMETYPE_AUDIO_EAC3_JOC = android.media.MediaFormat.MIMETYPE_AUDIO_EAC3_JOC;
    public static final java.lang.String MIMETYPE_AUDIO_FLAC = android.media.MediaFormat.MIMETYPE_AUDIO_FLAC;
    public static final java.lang.String MIMETYPE_AUDIO_G711_ALAW = android.media.MediaFormat.MIMETYPE_AUDIO_G711_ALAW;
    public static final java.lang.String MIMETYPE_AUDIO_G711_MLAW = android.media.MediaFormat.MIMETYPE_AUDIO_G711_MLAW;
    public static final java.lang.String MIMETYPE_AUDIO_IEC61937 = android.media.MediaFormat.MIMETYPE_AUDIO_IEC61937;
    public static final java.lang.String MIMETYPE_AUDIO_MPEG = android.media.MediaFormat.MIMETYPE_AUDIO_MPEG;
    public static final java.lang.String MIMETYPE_AUDIO_MPEGH_BL_L3 = android.media.MediaFormat.MIMETYPE_AUDIO_MPEGH_BL_L3;
    public static final java.lang.String MIMETYPE_AUDIO_MPEGH_BL_L4 = android.media.MediaFormat.MIMETYPE_AUDIO_MPEGH_BL_L4;
    public static final java.lang.String MIMETYPE_AUDIO_MPEGH_LC_L3 = android.media.MediaFormat.MIMETYPE_AUDIO_MPEGH_LC_L3;
    public static final java.lang.String MIMETYPE_AUDIO_MPEGH_LC_L4 = android.media.MediaFormat.MIMETYPE_AUDIO_MPEGH_LC_L4;
    public static final java.lang.String MIMETYPE_AUDIO_MPEGH_MHA1 = android.media.MediaFormat.MIMETYPE_AUDIO_MPEGH_MHA1;
    public static final java.lang.String MIMETYPE_AUDIO_MPEGH_MHM1 = android.media.MediaFormat.MIMETYPE_AUDIO_MPEGH_MHM1;
    public static final java.lang.String MIMETYPE_AUDIO_MSGSM = android.media.MediaFormat.MIMETYPE_AUDIO_MSGSM;
    public static final java.lang.String MIMETYPE_AUDIO_OPUS = android.media.MediaFormat.MIMETYPE_AUDIO_OPUS;
    public static final java.lang.String MIMETYPE_AUDIO_QCELP = android.media.MediaFormat.MIMETYPE_AUDIO_QCELP;
    public static final java.lang.String MIMETYPE_AUDIO_RAW = android.media.MediaFormat.MIMETYPE_AUDIO_RAW;
    public static final java.lang.String MIMETYPE_AUDIO_SCRAMBLED = android.media.MediaFormat.MIMETYPE_AUDIO_SCRAMBLED;
    public static final java.lang.String MIMETYPE_AUDIO_VORBIS = android.media.MediaFormat.MIMETYPE_AUDIO_VORBIS;
    public static final java.lang.String MIMETYPE_IMAGE_ANDROID_HEIC = android.media.MediaFormat.MIMETYPE_IMAGE_ANDROID_HEIC;
    public static final java.lang.String MIMETYPE_IMAGE_AVIF = android.media.MediaFormat.MIMETYPE_IMAGE_AVIF;
    public static final java.lang.String MIMETYPE_TEXT_CEA_608 = android.media.MediaFormat.MIMETYPE_TEXT_CEA_608;
    public static final java.lang.String MIMETYPE_TEXT_CEA_708 = android.media.MediaFormat.MIMETYPE_TEXT_CEA_708;
    public static final java.lang.String MIMETYPE_TEXT_SUBRIP = android.media.MediaFormat.MIMETYPE_TEXT_SUBRIP;
    public static final java.lang.String MIMETYPE_TEXT_VTT = android.media.MediaFormat.MIMETYPE_TEXT_VTT;
    public static final java.lang.String MIMETYPE_VIDEO_AV1 = android.media.MediaFormat.MIMETYPE_VIDEO_AV1;
    public static final java.lang.String MIMETYPE_VIDEO_AVC = android.media.MediaFormat.MIMETYPE_VIDEO_AVC;
    public static final java.lang.String MIMETYPE_VIDEO_DOLBY_VISION = android.media.MediaFormat.MIMETYPE_VIDEO_DOLBY_VISION;
    public static final java.lang.String MIMETYPE_VIDEO_H263 = android.media.MediaFormat.MIMETYPE_VIDEO_H263;
    public static final java.lang.String MIMETYPE_VIDEO_HEVC = android.media.MediaFormat.MIMETYPE_VIDEO_HEVC;
    public static final java.lang.String MIMETYPE_VIDEO_MPEG2 = android.media.MediaFormat.MIMETYPE_VIDEO_MPEG2;
    public static final java.lang.String MIMETYPE_VIDEO_MPEG4 = android.media.MediaFormat.MIMETYPE_VIDEO_MPEG4;
    public static final java.lang.String MIMETYPE_VIDEO_RAW = android.media.MediaFormat.MIMETYPE_VIDEO_RAW;
    public static final java.lang.String MIMETYPE_VIDEO_SCRAMBLED = android.media.MediaFormat.MIMETYPE_VIDEO_SCRAMBLED;
    public static final java.lang.String MIMETYPE_VIDEO_VP8 = android.media.MediaFormat.MIMETYPE_VIDEO_VP8;
    public static final java.lang.String MIMETYPE_VIDEO_VP9 = android.media.MediaFormat.MIMETYPE_VIDEO_VP9;
    public static final int PICTURE_TYPE_B = android.media.MediaFormat.PICTURE_TYPE_B;
    public static final int PICTURE_TYPE_I = android.media.MediaFormat.PICTURE_TYPE_I;
    public static final int PICTURE_TYPE_P = android.media.MediaFormat.PICTURE_TYPE_P;
    public static final int PICTURE_TYPE_UNKNOWN = android.media.MediaFormat.PICTURE_TYPE_UNKNOWN;
    public static final int TYPE_BYTE_BUFFER = android.media.MediaFormat.TYPE_BYTE_BUFFER;
    public static final int TYPE_FLOAT = android.media.MediaFormat.TYPE_FLOAT;
    public static final int TYPE_INTEGER = android.media.MediaFormat.TYPE_INTEGER;
    public static final int TYPE_LONG = android.media.MediaFormat.TYPE_LONG;
    public static final int TYPE_NULL = android.media.MediaFormat.TYPE_NULL;
    public static final int TYPE_STRING = android.media.MediaFormat.TYPE_STRING;
    public static final int VIDEO_ENCODING_STATISTICS_LEVEL_1 = android.media.MediaFormat.VIDEO_ENCODING_STATISTICS_LEVEL_1;
    public static final int VIDEO_ENCODING_STATISTICS_LEVEL_NONE = android.media.MediaFormat.VIDEO_ENCODING_STATISTICS_LEVEL_NONE;

    public static final class QpOffsetRect {
        private final android.media.MediaFormat.QpOffsetRect real;

        public QpOffsetRect(android.media.MediaFormat.QpOffsetRect real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaFormat.QpOffsetRect wrap(android.media.MediaFormat.QpOffsetRect real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaFormat.QpOffsetRect(real);
        }

        public android.media.MediaFormat.QpOffsetRect unwrap() {
            return real;
        }

        public QpOffsetRect(com.micklab.dcg.wrapper.android.graphics.Rect arg0, int arg1) {
            this(new android.media.MediaFormat.QpOffsetRect(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public java.lang.String flattenToString() {
            return real.flattenToString();
        }

        public void set(com.micklab.dcg.wrapper.android.graphics.Rect arg0, int arg1) {
            real.set(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
}
