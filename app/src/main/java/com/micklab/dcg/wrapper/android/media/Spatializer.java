// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class Spatializer {
    private final android.media.Spatializer real;

    public Spatializer(android.media.Spatializer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.Spatializer wrap(android.media.Spatializer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.Spatializer(real);
    }

    public android.media.Spatializer unwrap() {
        return real;
    }

    public void addOnHeadTrackerAvailableListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.Spatializer.OnHeadTrackerAvailableListener arg1) {
        real.addOnHeadTrackerAvailableListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void addOnSpatializerStateChangedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.Spatializer.OnSpatializerStateChangedListener arg1) {
        real.addOnSpatializerStateChangedListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean canBeSpatialized(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0, com.micklab.dcg.wrapper.android.media.AudioFormat arg1) {
        return real.canBeSpatialized(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public int getImmersiveAudioLevel() {
        return real.getImmersiveAudioLevel();
    }

    public boolean isAvailable() {
        return real.isAvailable();
    }

    public boolean isEnabled() {
        return real.isEnabled();
    }

    public boolean isHeadTrackerAvailable() {
        return real.isHeadTrackerAvailable();
    }

    public void removeOnHeadTrackerAvailableListener(com.micklab.dcg.wrapper.android.media.Spatializer.OnHeadTrackerAvailableListener arg0) {
        real.removeOnHeadTrackerAvailableListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnSpatializerStateChangedListener(com.micklab.dcg.wrapper.android.media.Spatializer.OnSpatializerStateChangedListener arg0) {
        real.removeOnSpatializerStateChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final int SPATIALIZER_IMMERSIVE_LEVEL_MULTICHANNEL = android.media.Spatializer.SPATIALIZER_IMMERSIVE_LEVEL_MULTICHANNEL;
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_NONE = android.media.Spatializer.SPATIALIZER_IMMERSIVE_LEVEL_NONE;
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_OTHER = android.media.Spatializer.SPATIALIZER_IMMERSIVE_LEVEL_OTHER;

    public static final class OnHeadTrackerAvailableListener {
        private final android.media.Spatializer.OnHeadTrackerAvailableListener real;

        public OnHeadTrackerAvailableListener(android.media.Spatializer.OnHeadTrackerAvailableListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.Spatializer.OnHeadTrackerAvailableListener wrap(android.media.Spatializer.OnHeadTrackerAvailableListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.Spatializer.OnHeadTrackerAvailableListener(real);
        }

        public android.media.Spatializer.OnHeadTrackerAvailableListener unwrap() {
            return real;
        }

        public void onHeadTrackerAvailableChanged(com.micklab.dcg.wrapper.android.media.Spatializer arg0, boolean arg1) {
            real.onHeadTrackerAvailableChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
    public static final class OnSpatializerStateChangedListener {
        private final android.media.Spatializer.OnSpatializerStateChangedListener real;

        public OnSpatializerStateChangedListener(android.media.Spatializer.OnSpatializerStateChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.Spatializer.OnSpatializerStateChangedListener wrap(android.media.Spatializer.OnSpatializerStateChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.Spatializer.OnSpatializerStateChangedListener(real);
        }

        public android.media.Spatializer.OnSpatializerStateChangedListener unwrap() {
            return real;
        }

        public void onSpatializerAvailableChanged(com.micklab.dcg.wrapper.android.media.Spatializer arg0, boolean arg1) {
            real.onSpatializerAvailableChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void onSpatializerEnabledChanged(com.micklab.dcg.wrapper.android.media.Spatializer arg0, boolean arg1) {
            real.onSpatializerEnabledChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
}
