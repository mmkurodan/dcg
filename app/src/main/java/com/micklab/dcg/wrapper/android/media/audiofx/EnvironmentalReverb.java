// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class EnvironmentalReverb {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EnvironmentalReverb(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb wrap(android.media.audiofx.EnvironmentalReverb real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb(real, (__DcgwBridgeToken) null);
    }

    public android.media.audiofx.EnvironmentalReverb getReal() {
        return (android.media.audiofx.EnvironmentalReverb) real;
    }

    public android.media.audiofx.EnvironmentalReverb unwrap() {
        return getReal();
    }

    public EnvironmentalReverb(int arg0, int arg1) throws java.lang.IllegalArgumentException, java.lang.RuntimeException, java.lang.UnsupportedOperationException {
        this(new android.media.audiofx.EnvironmentalReverb(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public short getDecayHFRatio() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.EnvironmentalReverb) real).getDecayHFRatio();
    }

    public int getDecayTime() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.EnvironmentalReverb) real).getDecayTime();
    }

    public short getDensity() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.EnvironmentalReverb) real).getDensity();
    }

    public short getDiffusion() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.EnvironmentalReverb) real).getDiffusion();
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.Settings getProperties() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.Settings.wrap(((android.media.audiofx.EnvironmentalReverb) real).getProperties());
    }

    public int getReflectionsDelay() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.audiofx.EnvironmentalReverb#getReflectionsDelay()");
    }

    public short getReflectionsLevel() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.audiofx.EnvironmentalReverb#getReflectionsLevel()");
    }

    public int getReverbDelay() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.EnvironmentalReverb) real).getReverbDelay();
    }

    public short getReverbLevel() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.EnvironmentalReverb) real).getReverbLevel();
    }

    public short getRoomHFLevel() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.EnvironmentalReverb) real).getRoomHFLevel();
    }

    public short getRoomLevel() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.EnvironmentalReverb) real).getRoomLevel();
    }

    public void setDecayHFRatio(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.EnvironmentalReverb) real).setDecayHFRatio(arg0);
    }

    public void setDecayTime(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.EnvironmentalReverb) real).setDecayTime(arg0);
    }

    public void setDensity(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.EnvironmentalReverb) real).setDensity(arg0);
    }

    public void setDiffusion(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.EnvironmentalReverb) real).setDiffusion(arg0);
    }

    public void setParameterListener(com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener arg0) {
        ((android.media.audiofx.EnvironmentalReverb) real).setParameterListener(arg0 == null ? null : arg0.getReal());
    }

    public void setProperties(com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.Settings arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.EnvironmentalReverb) real).setProperties(arg0 == null ? null : arg0.getReal());
    }

    public void setReflectionsDelay(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.audiofx.EnvironmentalReverb#setReflectionsDelay(int)");
    }

    public void setReflectionsLevel(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.audiofx.EnvironmentalReverb#setReflectionsLevel(short)");
    }

    public void setReverbDelay(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.EnvironmentalReverb) real).setReverbDelay(arg0);
    }

    public void setReverbLevel(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.EnvironmentalReverb) real).setReverbLevel(arg0);
    }

    public void setRoomHFLevel(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.EnvironmentalReverb) real).setRoomHFLevel(arg0);
    }

    public void setRoomLevel(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.EnvironmentalReverb) real).setRoomLevel(arg0);
    }

    public static final int PARAM_DECAY_HF_RATIO = android.media.audiofx.EnvironmentalReverb.PARAM_DECAY_HF_RATIO;
    public static final int PARAM_DECAY_TIME = android.media.audiofx.EnvironmentalReverb.PARAM_DECAY_TIME;
    public static final int PARAM_DENSITY = android.media.audiofx.EnvironmentalReverb.PARAM_DENSITY;
    public static final int PARAM_DIFFUSION = android.media.audiofx.EnvironmentalReverb.PARAM_DIFFUSION;
    public static final int PARAM_REVERB_DELAY = android.media.audiofx.EnvironmentalReverb.PARAM_REVERB_DELAY;
    public static final int PARAM_REVERB_LEVEL = android.media.audiofx.EnvironmentalReverb.PARAM_REVERB_LEVEL;
    public static final int PARAM_ROOM_HF_LEVEL = android.media.audiofx.EnvironmentalReverb.PARAM_ROOM_HF_LEVEL;
    public static final int PARAM_ROOM_LEVEL = android.media.audiofx.EnvironmentalReverb.PARAM_ROOM_LEVEL;

    public static final class OnParameterChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnParameterChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener wrap(android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener getReal() {
            return (android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener) real;
        }

        public android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener unwrap() {
            return getReal();
        }

        public void onParameterChange(com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb arg0, int arg1, int arg2, int arg3) {
            ((android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener) real).onParameterChange(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
        }

    }
    public static final class Settings {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Settings(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.Settings wrap(android.media.audiofx.EnvironmentalReverb.Settings real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.Settings(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.EnvironmentalReverb.Settings getReal() {
            return (android.media.audiofx.EnvironmentalReverb.Settings) real;
        }

        public android.media.audiofx.EnvironmentalReverb.Settings unwrap() {
            return getReal();
        }

        public Settings() {
            this(new android.media.audiofx.EnvironmentalReverb.Settings(), (__DcgwBridgeToken) null);
        }

        public Settings(java.lang.String arg0) {
            this(new android.media.audiofx.EnvironmentalReverb.Settings(arg0), (__DcgwBridgeToken) null);
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.EnvironmentalReverb.Settings) real).toString();
        }


    }
}
