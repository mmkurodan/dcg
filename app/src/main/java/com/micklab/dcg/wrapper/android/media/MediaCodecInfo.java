// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaCodecInfo {
    private final android.media.MediaCodecInfo real;

    public MediaCodecInfo(android.media.MediaCodecInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaCodecInfo wrap(android.media.MediaCodecInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodecInfo(real);
    }

    public android.media.MediaCodecInfo unwrap() {
        return real;
    }

    public java.lang.String getCanonicalName() {
        return real.getCanonicalName();
    }

    public com.micklab.dcg.wrapper.android.media.MediaCodecInfo.CodecCapabilities getCapabilitiesForType(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaCodecInfo.CodecCapabilities.wrap(real.getCapabilitiesForType(arg0));
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public java.lang.String[] getSupportedTypes() {
        return real.getSupportedTypes();
    }

    public boolean isAlias() {
        return real.isAlias();
    }

    public boolean isEncoder() {
        return real.isEncoder();
    }

    public boolean isHardwareAccelerated() {
        return real.isHardwareAccelerated();
    }

    public boolean isSoftwareOnly() {
        return real.isSoftwareOnly();
    }

    public boolean isVendor() {
        return real.isVendor();
    }

    public static final class AudioCapabilities {
        private final android.media.MediaCodecInfo.AudioCapabilities real;

        public AudioCapabilities(android.media.MediaCodecInfo.AudioCapabilities real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodecInfo.AudioCapabilities wrap(android.media.MediaCodecInfo.AudioCapabilities real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodecInfo.AudioCapabilities(real);
        }

        public android.media.MediaCodecInfo.AudioCapabilities unwrap() {
            return real;
        }

        public int getMaxInputChannelCount() {
            return real.getMaxInputChannelCount();
        }

        public int getMinInputChannelCount() {
            return real.getMinInputChannelCount();
        }

        public int[] getSupportedSampleRates() {
            return real.getSupportedSampleRates();
        }

        public boolean isSampleRateSupported(int arg0) {
            return real.isSampleRateSupported(arg0);
        }

    }
    public static final class CodecCapabilities {
        private final android.media.MediaCodecInfo.CodecCapabilities real;

        public CodecCapabilities(android.media.MediaCodecInfo.CodecCapabilities real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodecInfo.CodecCapabilities wrap(android.media.MediaCodecInfo.CodecCapabilities real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodecInfo.CodecCapabilities(real);
        }

        public android.media.MediaCodecInfo.CodecCapabilities unwrap() {
            return real;
        }

        public CodecCapabilities() {
            this(new android.media.MediaCodecInfo.CodecCapabilities());
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodecInfo.CodecCapabilities createFromProfileLevel(java.lang.String arg0, int arg1, int arg2) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaCodecInfo$CodecCapabilities#createFromProfileLevel(java.lang.String,int,int)");
        }

        public com.micklab.dcg.wrapper.android.media.MediaCodecInfo.AudioCapabilities getAudioCapabilities() {
            return com.micklab.dcg.wrapper.android.media.MediaCodecInfo.AudioCapabilities.wrap(real.getAudioCapabilities());
        }

        public com.micklab.dcg.wrapper.android.media.MediaFormat getDefaultFormat() {
            return com.micklab.dcg.wrapper.android.media.MediaFormat.wrap(real.getDefaultFormat());
        }

        public com.micklab.dcg.wrapper.android.media.MediaCodecInfo.EncoderCapabilities getEncoderCapabilities() {
            return com.micklab.dcg.wrapper.android.media.MediaCodecInfo.EncoderCapabilities.wrap(real.getEncoderCapabilities());
        }

        public int getMaxSupportedInstances() {
            return real.getMaxSupportedInstances();
        }

        public java.lang.String getMimeType() {
            return real.getMimeType();
        }

        public com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities getVideoCapabilities() {
            return com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.wrap(real.getVideoCapabilities());
        }

        public boolean isFeatureRequired(java.lang.String arg0) {
            return real.isFeatureRequired(arg0);
        }

        public boolean isFeatureSupported(java.lang.String arg0) {
            return real.isFeatureSupported(arg0);
        }

        public boolean isFormatSupported(com.micklab.dcg.wrapper.android.media.MediaFormat arg0) {
            return real.isFormatSupported(arg0 == null ? null : arg0.unwrap());
        }

        public static final int COLOR_Format12bitRGB444 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format12bitRGB444;
        public static final int COLOR_Format16bitARGB1555 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format16bitARGB1555;
        public static final int COLOR_Format16bitARGB4444 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format16bitARGB4444;
        public static final int COLOR_Format16bitBGR565 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format16bitBGR565;
        public static final int COLOR_Format16bitRGB565 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format16bitRGB565;
        public static final int COLOR_Format18BitBGR666 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format18BitBGR666;
        public static final int COLOR_Format18bitARGB1665 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format18bitARGB1665;
        public static final int COLOR_Format18bitRGB666 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format18bitRGB666;
        public static final int COLOR_Format19bitARGB1666 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format19bitARGB1666;
        public static final int COLOR_Format24BitABGR6666 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format24BitABGR6666;
        public static final int COLOR_Format24BitARGB6666 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format24BitARGB6666;
        public static final int COLOR_Format24bitARGB1887 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format24bitARGB1887;
        public static final int COLOR_Format24bitBGR888 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format24bitBGR888;
        public static final int COLOR_Format24bitRGB888 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format24bitRGB888;
        public static final int COLOR_Format25bitARGB1888 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format25bitARGB1888;
        public static final int COLOR_Format32bitABGR2101010 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format32bitABGR2101010;
        public static final int COLOR_Format32bitABGR8888 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format32bitABGR8888;
        public static final int COLOR_Format32bitARGB8888 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format32bitARGB8888;
        public static final int COLOR_Format32bitBGRA8888 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format32bitBGRA8888;
        public static final int COLOR_Format64bitABGRFloat = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format64bitABGRFloat;
        public static final int COLOR_Format8bitRGB332 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_Format8bitRGB332;
        public static final int COLOR_FormatCbYCrY = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatCbYCrY;
        public static final int COLOR_FormatCrYCbY = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatCrYCbY;
        public static final int COLOR_FormatL16 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatL16;
        public static final int COLOR_FormatL2 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatL2;
        public static final int COLOR_FormatL24 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatL24;
        public static final int COLOR_FormatL32 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatL32;
        public static final int COLOR_FormatL4 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatL4;
        public static final int COLOR_FormatL8 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatL8;
        public static final int COLOR_FormatMonochrome = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatMonochrome;
        public static final int COLOR_FormatRGBAFlexible = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatRGBAFlexible;
        public static final int COLOR_FormatRGBFlexible = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatRGBFlexible;
        public static final int COLOR_FormatRawBayer10bit = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatRawBayer10bit;
        public static final int COLOR_FormatRawBayer8bit = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatRawBayer8bit;
        public static final int COLOR_FormatRawBayer8bitcompressed = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatRawBayer8bitcompressed;
        public static final int COLOR_FormatSurface = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatSurface;
        public static final int COLOR_FormatYCbYCr = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYCbYCr;
        public static final int COLOR_FormatYCrYCb = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYCrYCb;
        public static final int COLOR_FormatYUV411PackedPlanar = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV411PackedPlanar;
        public static final int COLOR_FormatYUV411Planar = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV411Planar;
        public static final int COLOR_FormatYUV420Flexible = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420Flexible;
        public static final int COLOR_FormatYUV420PackedPlanar = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420PackedPlanar;
        public static final int COLOR_FormatYUV420PackedSemiPlanar = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420PackedSemiPlanar;
        public static final int COLOR_FormatYUV420Planar = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420Planar;
        public static final int COLOR_FormatYUV420SemiPlanar = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV420SemiPlanar;
        public static final int COLOR_FormatYUV422Flexible = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV422Flexible;
        public static final int COLOR_FormatYUV422PackedPlanar = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV422PackedPlanar;
        public static final int COLOR_FormatYUV422PackedSemiPlanar = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV422PackedSemiPlanar;
        public static final int COLOR_FormatYUV422Planar = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV422Planar;
        public static final int COLOR_FormatYUV422SemiPlanar = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV422SemiPlanar;
        public static final int COLOR_FormatYUV444Flexible = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV444Flexible;
        public static final int COLOR_FormatYUV444Interleaved = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUV444Interleaved;
        public static final int COLOR_FormatYUVP010 = android.media.MediaCodecInfo.CodecCapabilities.COLOR_FormatYUVP010;
        public static final int COLOR_QCOM_FormatYUV420SemiPlanar = android.media.MediaCodecInfo.CodecCapabilities.COLOR_QCOM_FormatYUV420SemiPlanar;
        public static final int COLOR_TI_FormatYUV420PackedSemiPlanar = android.media.MediaCodecInfo.CodecCapabilities.COLOR_TI_FormatYUV420PackedSemiPlanar;
        public static final java.lang.String FEATURE_AdaptivePlayback = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_AdaptivePlayback;
        public static final java.lang.String FEATURE_DetachedSurface = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_DetachedSurface;
        public static final java.lang.String FEATURE_DynamicColorAspects = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_DynamicColorAspects;
        public static final java.lang.String FEATURE_DynamicTimestamp = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_DynamicTimestamp;
        public static final java.lang.String FEATURE_EncodingStatistics = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_EncodingStatistics;
        public static final java.lang.String FEATURE_FrameParsing = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_FrameParsing;
        public static final java.lang.String FEATURE_HdrEditing = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_HdrEditing;
        public static final java.lang.String FEATURE_HlgEditing = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_HlgEditing;
        public static final java.lang.String FEATURE_IntraRefresh = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_IntraRefresh;
        public static final java.lang.String FEATURE_LowLatency = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_LowLatency;
        public static final java.lang.String FEATURE_MultipleFrames = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_MultipleFrames;
        public static final java.lang.String FEATURE_PartialFrame = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_PartialFrame;
        public static final java.lang.String FEATURE_QpBounds = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_QpBounds;
        public static final java.lang.String FEATURE_Roi = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_Roi;
        public static final java.lang.String FEATURE_SecurePlayback = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_SecurePlayback;
        public static final java.lang.String FEATURE_TunneledPlayback = android.media.MediaCodecInfo.CodecCapabilities.FEATURE_TunneledPlayback;

    }
    public static final class CodecProfileLevel {
        private final android.media.MediaCodecInfo.CodecProfileLevel real;

        public CodecProfileLevel(android.media.MediaCodecInfo.CodecProfileLevel real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodecInfo.CodecProfileLevel wrap(android.media.MediaCodecInfo.CodecProfileLevel real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodecInfo.CodecProfileLevel(real);
        }

        public android.media.MediaCodecInfo.CodecProfileLevel unwrap() {
            return real;
        }

        public CodecProfileLevel() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.MediaCodecInfo$CodecProfileLevel#android.media.MediaCodecInfo$CodecProfileLevel()");
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }

        public static final int AACObjectELD = android.media.MediaCodecInfo.CodecProfileLevel.AACObjectELD;
        public static final int AACObjectERLC = android.media.MediaCodecInfo.CodecProfileLevel.AACObjectERLC;
        public static final int AACObjectERScalable = android.media.MediaCodecInfo.CodecProfileLevel.AACObjectERScalable;
        public static final int AACObjectHE = android.media.MediaCodecInfo.CodecProfileLevel.AACObjectHE;
        public static final int AACObjectHE_PS = android.media.MediaCodecInfo.CodecProfileLevel.AACObjectHE_PS;
        public static final int AACObjectLC = android.media.MediaCodecInfo.CodecProfileLevel.AACObjectLC;
        public static final int AACObjectLD = android.media.MediaCodecInfo.CodecProfileLevel.AACObjectLD;
        public static final int AACObjectLTP = android.media.MediaCodecInfo.CodecProfileLevel.AACObjectLTP;
        public static final int AACObjectMain = android.media.MediaCodecInfo.CodecProfileLevel.AACObjectMain;
        public static final int AACObjectSSR = android.media.MediaCodecInfo.CodecProfileLevel.AACObjectSSR;
        public static final int AACObjectScalable = android.media.MediaCodecInfo.CodecProfileLevel.AACObjectScalable;
        public static final int AACObjectXHE = android.media.MediaCodecInfo.CodecProfileLevel.AACObjectXHE;
        public static final int AC4Level0 = android.media.MediaCodecInfo.CodecProfileLevel.AC4Level0;
        public static final int AC4Level1 = android.media.MediaCodecInfo.CodecProfileLevel.AC4Level1;
        public static final int AC4Level2 = android.media.MediaCodecInfo.CodecProfileLevel.AC4Level2;
        public static final int AC4Level3 = android.media.MediaCodecInfo.CodecProfileLevel.AC4Level3;
        public static final int AC4Level4 = android.media.MediaCodecInfo.CodecProfileLevel.AC4Level4;
        public static final int AV1Level2 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level2;
        public static final int AV1Level21 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level21;
        public static final int AV1Level22 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level22;
        public static final int AV1Level23 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level23;
        public static final int AV1Level3 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level3;
        public static final int AV1Level31 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level31;
        public static final int AV1Level32 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level32;
        public static final int AV1Level33 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level33;
        public static final int AV1Level4 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level4;
        public static final int AV1Level41 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level41;
        public static final int AV1Level42 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level42;
        public static final int AV1Level43 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level43;
        public static final int AV1Level5 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level5;
        public static final int AV1Level51 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level51;
        public static final int AV1Level52 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level52;
        public static final int AV1Level53 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level53;
        public static final int AV1Level6 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level6;
        public static final int AV1Level61 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level61;
        public static final int AV1Level62 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level62;
        public static final int AV1Level63 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level63;
        public static final int AV1Level7 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level7;
        public static final int AV1Level71 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level71;
        public static final int AV1Level72 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level72;
        public static final int AV1Level73 = android.media.MediaCodecInfo.CodecProfileLevel.AV1Level73;
        public static final int AVCLevel1 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel1;
        public static final int AVCLevel11 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel11;
        public static final int AVCLevel12 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel12;
        public static final int AVCLevel13 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel13;
        public static final int AVCLevel1b = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel1b;
        public static final int AVCLevel2 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel2;
        public static final int AVCLevel21 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel21;
        public static final int AVCLevel22 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel22;
        public static final int AVCLevel3 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel3;
        public static final int AVCLevel31 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel31;
        public static final int AVCLevel32 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel32;
        public static final int AVCLevel4 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel4;
        public static final int AVCLevel41 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel41;
        public static final int AVCLevel42 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel42;
        public static final int AVCLevel5 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel5;
        public static final int AVCLevel51 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel51;
        public static final int AVCLevel52 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel52;
        public static final int AVCLevel6 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel6;
        public static final int AVCLevel61 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel61;
        public static final int AVCLevel62 = android.media.MediaCodecInfo.CodecProfileLevel.AVCLevel62;
        public static final int DolbyVisionLevel8k30 = android.media.MediaCodecInfo.CodecProfileLevel.DolbyVisionLevel8k30;
        public static final int DolbyVisionLevel8k60 = android.media.MediaCodecInfo.CodecProfileLevel.DolbyVisionLevel8k60;
        public static final int DolbyVisionLevelFhd24 = android.media.MediaCodecInfo.CodecProfileLevel.DolbyVisionLevelFhd24;
        public static final int DolbyVisionLevelFhd30 = android.media.MediaCodecInfo.CodecProfileLevel.DolbyVisionLevelFhd30;
        public static final int DolbyVisionLevelFhd60 = android.media.MediaCodecInfo.CodecProfileLevel.DolbyVisionLevelFhd60;
        public static final int DolbyVisionLevelHd24 = android.media.MediaCodecInfo.CodecProfileLevel.DolbyVisionLevelHd24;
        public static final int DolbyVisionLevelHd30 = android.media.MediaCodecInfo.CodecProfileLevel.DolbyVisionLevelHd30;
        public static final int DolbyVisionLevelUhd120 = android.media.MediaCodecInfo.CodecProfileLevel.DolbyVisionLevelUhd120;
        public static final int DolbyVisionLevelUhd24 = android.media.MediaCodecInfo.CodecProfileLevel.DolbyVisionLevelUhd24;
        public static final int DolbyVisionLevelUhd30 = android.media.MediaCodecInfo.CodecProfileLevel.DolbyVisionLevelUhd30;
        public static final int DolbyVisionLevelUhd48 = android.media.MediaCodecInfo.CodecProfileLevel.DolbyVisionLevelUhd48;
        public static final int DolbyVisionLevelUhd60 = android.media.MediaCodecInfo.CodecProfileLevel.DolbyVisionLevelUhd60;
        public static final int H263Level10 = android.media.MediaCodecInfo.CodecProfileLevel.H263Level10;
        public static final int H263Level20 = android.media.MediaCodecInfo.CodecProfileLevel.H263Level20;
        public static final int H263Level30 = android.media.MediaCodecInfo.CodecProfileLevel.H263Level30;
        public static final int H263Level40 = android.media.MediaCodecInfo.CodecProfileLevel.H263Level40;
        public static final int H263Level45 = android.media.MediaCodecInfo.CodecProfileLevel.H263Level45;
        public static final int H263Level50 = android.media.MediaCodecInfo.CodecProfileLevel.H263Level50;
        public static final int H263Level60 = android.media.MediaCodecInfo.CodecProfileLevel.H263Level60;
        public static final int H263Level70 = android.media.MediaCodecInfo.CodecProfileLevel.H263Level70;
        public static final int HEVCHighTierLevel1 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCHighTierLevel1;
        public static final int HEVCHighTierLevel2 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCHighTierLevel2;
        public static final int HEVCHighTierLevel21 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCHighTierLevel21;
        public static final int HEVCHighTierLevel3 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCHighTierLevel3;
        public static final int HEVCHighTierLevel31 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCHighTierLevel31;
        public static final int HEVCHighTierLevel4 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCHighTierLevel4;
        public static final int HEVCHighTierLevel41 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCHighTierLevel41;
        public static final int HEVCHighTierLevel5 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCHighTierLevel5;
        public static final int HEVCHighTierLevel51 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCHighTierLevel51;
        public static final int HEVCHighTierLevel52 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCHighTierLevel52;
        public static final int HEVCHighTierLevel6 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCHighTierLevel6;
        public static final int HEVCHighTierLevel61 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCHighTierLevel61;
        public static final int HEVCHighTierLevel62 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCHighTierLevel62;
        public static final int HEVCMainTierLevel1 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCMainTierLevel1;
        public static final int HEVCMainTierLevel2 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCMainTierLevel2;
        public static final int HEVCMainTierLevel21 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCMainTierLevel21;
        public static final int HEVCMainTierLevel3 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCMainTierLevel3;
        public static final int HEVCMainTierLevel31 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCMainTierLevel31;
        public static final int HEVCMainTierLevel4 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCMainTierLevel4;
        public static final int HEVCMainTierLevel41 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCMainTierLevel41;
        public static final int HEVCMainTierLevel5 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCMainTierLevel5;
        public static final int HEVCMainTierLevel51 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCMainTierLevel51;
        public static final int HEVCMainTierLevel52 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCMainTierLevel52;
        public static final int HEVCMainTierLevel6 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCMainTierLevel6;
        public static final int HEVCMainTierLevel61 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCMainTierLevel61;
        public static final int HEVCMainTierLevel62 = android.media.MediaCodecInfo.CodecProfileLevel.HEVCMainTierLevel62;
        public static final int MPEG2LevelH14 = android.media.MediaCodecInfo.CodecProfileLevel.MPEG2LevelH14;
        public static final int MPEG2LevelHL = android.media.MediaCodecInfo.CodecProfileLevel.MPEG2LevelHL;
        public static final int MPEG2LevelHP = android.media.MediaCodecInfo.CodecProfileLevel.MPEG2LevelHP;
        public static final int MPEG2LevelLL = android.media.MediaCodecInfo.CodecProfileLevel.MPEG2LevelLL;
        public static final int MPEG2LevelML = android.media.MediaCodecInfo.CodecProfileLevel.MPEG2LevelML;
        public static final int MPEG4Level0 = android.media.MediaCodecInfo.CodecProfileLevel.MPEG4Level0;
        public static final int MPEG4Level0b = android.media.MediaCodecInfo.CodecProfileLevel.MPEG4Level0b;
        public static final int MPEG4Level1 = android.media.MediaCodecInfo.CodecProfileLevel.MPEG4Level1;
        public static final int MPEG4Level2 = android.media.MediaCodecInfo.CodecProfileLevel.MPEG4Level2;
        public static final int MPEG4Level3 = android.media.MediaCodecInfo.CodecProfileLevel.MPEG4Level3;
        public static final int MPEG4Level3b = android.media.MediaCodecInfo.CodecProfileLevel.MPEG4Level3b;
        public static final int MPEG4Level4 = android.media.MediaCodecInfo.CodecProfileLevel.MPEG4Level4;
        public static final int MPEG4Level4a = android.media.MediaCodecInfo.CodecProfileLevel.MPEG4Level4a;
        public static final int MPEG4Level5 = android.media.MediaCodecInfo.CodecProfileLevel.MPEG4Level5;
        public static final int MPEG4Level6 = android.media.MediaCodecInfo.CodecProfileLevel.MPEG4Level6;
        public static final int VP8Level_Version0 = android.media.MediaCodecInfo.CodecProfileLevel.VP8Level_Version0;
        public static final int VP8Level_Version1 = android.media.MediaCodecInfo.CodecProfileLevel.VP8Level_Version1;
        public static final int VP8Level_Version2 = android.media.MediaCodecInfo.CodecProfileLevel.VP8Level_Version2;
        public static final int VP8Level_Version3 = android.media.MediaCodecInfo.CodecProfileLevel.VP8Level_Version3;
        public static final int VP9Level1 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level1;
        public static final int VP9Level11 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level11;
        public static final int VP9Level2 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level2;
        public static final int VP9Level21 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level21;
        public static final int VP9Level3 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level3;
        public static final int VP9Level31 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level31;
        public static final int VP9Level4 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level4;
        public static final int VP9Level41 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level41;
        public static final int VP9Level5 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level5;
        public static final int VP9Level51 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level51;
        public static final int VP9Level52 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level52;
        public static final int VP9Level6 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level6;
        public static final int VP9Level61 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level61;
        public static final int VP9Level62 = android.media.MediaCodecInfo.CodecProfileLevel.VP9Level62;

    }
    public static final class EncoderCapabilities {
        private final android.media.MediaCodecInfo.EncoderCapabilities real;

        public EncoderCapabilities(android.media.MediaCodecInfo.EncoderCapabilities real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodecInfo.EncoderCapabilities wrap(android.media.MediaCodecInfo.EncoderCapabilities real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodecInfo.EncoderCapabilities(real);
        }

        public android.media.MediaCodecInfo.EncoderCapabilities unwrap() {
            return real;
        }

        public boolean isBitrateModeSupported(int arg0) {
            return real.isBitrateModeSupported(arg0);
        }

        public static final int BITRATE_MODE_CBR = android.media.MediaCodecInfo.EncoderCapabilities.BITRATE_MODE_CBR;
        public static final int BITRATE_MODE_CBR_FD = android.media.MediaCodecInfo.EncoderCapabilities.BITRATE_MODE_CBR_FD;
        public static final int BITRATE_MODE_CQ = android.media.MediaCodecInfo.EncoderCapabilities.BITRATE_MODE_CQ;
        public static final int BITRATE_MODE_VBR = android.media.MediaCodecInfo.EncoderCapabilities.BITRATE_MODE_VBR;

    }
    public static final class VideoCapabilities {
        private final android.media.MediaCodecInfo.VideoCapabilities real;

        public VideoCapabilities(android.media.MediaCodecInfo.VideoCapabilities real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities wrap(android.media.MediaCodecInfo.VideoCapabilities real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities(real);
        }

        public android.media.MediaCodecInfo.VideoCapabilities unwrap() {
            return real;
        }

        public boolean areSizeAndRateSupported(int arg0, int arg1, double arg2) {
            return real.areSizeAndRateSupported(arg0, arg1, arg2);
        }

        public int getHeightAlignment() {
            return real.getHeightAlignment();
        }

        public int getWidthAlignment() {
            return real.getWidthAlignment();
        }

        public boolean isSizeSupported(int arg0, int arg1) {
            return real.isSizeSupported(arg0, arg1);
        }

        public static final class PerformancePoint {
            private final android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint real;

            public PerformancePoint(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(real);
            }

            public android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint unwrap() {
                return real;
            }

            public PerformancePoint(int arg0, int arg1, int arg2) {
                this(new android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint(arg0, arg1, arg2));
            }

            public boolean covers(com.micklab.dcg.wrapper.android.media.MediaFormat arg0) {
                return real.covers(arg0 == null ? null : arg0.unwrap());
            }

            public boolean covers(com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint arg0) {
                return real.covers(arg0 == null ? null : arg0.unwrap());
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

            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_100 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.FHD_100);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_120 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.FHD_120);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_200 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.FHD_200);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_24 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.FHD_24);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_240 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.FHD_240);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_25 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.FHD_25);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_30 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.FHD_30);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_50 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.FHD_50);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint FHD_60 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.FHD_60);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_100 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.HD_100);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_120 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.HD_120);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_200 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.HD_200);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_24 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.HD_24);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_240 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.HD_240);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_25 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.HD_25);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_30 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.HD_30);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_50 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.HD_50);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint HD_60 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.HD_60);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint SD_24 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.SD_24);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint SD_25 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.SD_25);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint SD_30 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.SD_30);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint SD_48 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.SD_48);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint SD_50 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.SD_50);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint SD_60 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.SD_60);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_100 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.UHD_100);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_120 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.UHD_120);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_200 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.UHD_200);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_24 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.UHD_24);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_240 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.UHD_240);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_25 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.UHD_25);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_30 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.UHD_30);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_50 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.UHD_50);
            public static final com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint UHD_60 = com.micklab.dcg.wrapper.android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.wrap(android.media.MediaCodecInfo.VideoCapabilities.PerformancePoint.UHD_60);

        }
    }
}
