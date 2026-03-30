// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaFeature {
    private final android.media.MediaFeature real;

    public MediaFeature(android.media.MediaFeature real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaFeature wrap(android.media.MediaFeature real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaFeature(real);
    }

    public android.media.MediaFeature unwrap() {
        return real;
    }

    public MediaFeature() {
        this(new android.media.MediaFeature());
    }

    public static final class HdrType {
        private final android.media.MediaFeature.HdrType real;

        public HdrType(android.media.MediaFeature.HdrType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaFeature.HdrType wrap(android.media.MediaFeature.HdrType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaFeature.HdrType(real);
        }

        public android.media.MediaFeature.HdrType unwrap() {
            return real;
        }

        public static final java.lang.String DOLBY_VISION = android.media.MediaFeature.HdrType.DOLBY_VISION;
        public static final java.lang.String HDR10 = android.media.MediaFeature.HdrType.HDR10;
        public static final java.lang.String HDR10_PLUS = android.media.MediaFeature.HdrType.HDR10_PLUS;
        public static final java.lang.String HLG = android.media.MediaFeature.HdrType.HLG;

    }
}
