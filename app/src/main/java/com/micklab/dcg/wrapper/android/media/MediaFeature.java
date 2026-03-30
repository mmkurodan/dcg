// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaFeature {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaFeature(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaFeature wrap(android.media.MediaFeature real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaFeature(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaFeature getReal() {
        return (android.media.MediaFeature) real;
    }

    public android.media.MediaFeature unwrap() {
        return getReal();
    }

    public MediaFeature() {
        this(new android.media.MediaFeature(), (__DcgwBridgeToken) null);
    }

    public static final class HdrType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private HdrType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaFeature.HdrType wrap(android.media.MediaFeature.HdrType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaFeature.HdrType(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaFeature.HdrType getReal() {
            return (android.media.MediaFeature.HdrType) real;
        }

        public android.media.MediaFeature.HdrType unwrap() {
            return getReal();
        }

        public static final java.lang.String DOLBY_VISION = android.media.MediaFeature.HdrType.DOLBY_VISION;
        public static final java.lang.String HDR10 = android.media.MediaFeature.HdrType.HDR10;
        public static final java.lang.String HDR10_PLUS = android.media.MediaFeature.HdrType.HDR10_PLUS;
        public static final java.lang.String HLG = android.media.MediaFeature.HdrType.HLG;

    }
}
