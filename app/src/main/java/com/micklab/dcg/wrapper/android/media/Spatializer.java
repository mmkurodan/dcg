// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class Spatializer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Spatializer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.Spatializer wrap(android.media.Spatializer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.Spatializer(real, (__DcgwBridgeToken) null);
    }

    public android.media.Spatializer getReal() {
        return (android.media.Spatializer) real;
    }

    public android.media.Spatializer unwrap() {
        return getReal();
    }

    public void addOnHeadTrackerAvailableListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.Spatializer.OnHeadTrackerAvailableListener arg1) {
        ((android.media.Spatializer) real).addOnHeadTrackerAvailableListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void addOnSpatializerStateChangedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.Spatializer.OnSpatializerStateChangedListener arg1) {
        ((android.media.Spatializer) real).addOnSpatializerStateChangedListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean canBeSpatialized(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0, com.micklab.dcg.wrapper.android.media.AudioFormat arg1) {
        return ((android.media.Spatializer) real).canBeSpatialized(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public int getImmersiveAudioLevel() {
        return ((android.media.Spatializer) real).getImmersiveAudioLevel();
    }

    public boolean isAvailable() {
        return ((android.media.Spatializer) real).isAvailable();
    }

    public boolean isEnabled() {
        return ((android.media.Spatializer) real).isEnabled();
    }

    public boolean isHeadTrackerAvailable() {
        return ((android.media.Spatializer) real).isHeadTrackerAvailable();
    }

    public void removeOnHeadTrackerAvailableListener(com.micklab.dcg.wrapper.android.media.Spatializer.OnHeadTrackerAvailableListener arg0) {
        ((android.media.Spatializer) real).removeOnHeadTrackerAvailableListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnSpatializerStateChangedListener(com.micklab.dcg.wrapper.android.media.Spatializer.OnSpatializerStateChangedListener arg0) {
        ((android.media.Spatializer) real).removeOnSpatializerStateChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public static final int SPATIALIZER_IMMERSIVE_LEVEL_MULTICHANNEL = android.media.Spatializer.SPATIALIZER_IMMERSIVE_LEVEL_MULTICHANNEL;
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_NONE = android.media.Spatializer.SPATIALIZER_IMMERSIVE_LEVEL_NONE;
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_OTHER = android.media.Spatializer.SPATIALIZER_IMMERSIVE_LEVEL_OTHER;

    public static final class OnHeadTrackerAvailableListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnHeadTrackerAvailableListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.Spatializer.OnHeadTrackerAvailableListener wrap(android.media.Spatializer.OnHeadTrackerAvailableListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.Spatializer.OnHeadTrackerAvailableListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.Spatializer.OnHeadTrackerAvailableListener getReal() {
            return (android.media.Spatializer.OnHeadTrackerAvailableListener) real;
        }

        public android.media.Spatializer.OnHeadTrackerAvailableListener unwrap() {
            return getReal();
        }

        public void onHeadTrackerAvailableChanged(com.micklab.dcg.wrapper.android.media.Spatializer arg0, boolean arg1) {
            ((android.media.Spatializer.OnHeadTrackerAvailableListener) real).onHeadTrackerAvailableChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
    public static final class OnSpatializerStateChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnSpatializerStateChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.Spatializer.OnSpatializerStateChangedListener wrap(android.media.Spatializer.OnSpatializerStateChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.Spatializer.OnSpatializerStateChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.Spatializer.OnSpatializerStateChangedListener getReal() {
            return (android.media.Spatializer.OnSpatializerStateChangedListener) real;
        }

        public android.media.Spatializer.OnSpatializerStateChangedListener unwrap() {
            return getReal();
        }

        public void onSpatializerAvailableChanged(com.micklab.dcg.wrapper.android.media.Spatializer arg0, boolean arg1) {
            ((android.media.Spatializer.OnSpatializerStateChangedListener) real).onSpatializerAvailableChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void onSpatializerEnabledChanged(com.micklab.dcg.wrapper.android.media.Spatializer arg0, boolean arg1) {
            ((android.media.Spatializer.OnSpatializerStateChangedListener) real).onSpatializerEnabledChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
}
