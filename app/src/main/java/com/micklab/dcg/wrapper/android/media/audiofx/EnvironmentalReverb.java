// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class EnvironmentalReverb {
    private final android.media.audiofx.EnvironmentalReverb real;

    public EnvironmentalReverb(android.media.audiofx.EnvironmentalReverb real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb wrap(android.media.audiofx.EnvironmentalReverb real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb(real);
    }

    public android.media.audiofx.EnvironmentalReverb unwrap() {
        return real;
    }

    public EnvironmentalReverb(int arg0, int arg1) throws java.lang.IllegalArgumentException, java.lang.RuntimeException, java.lang.UnsupportedOperationException {
        this(new android.media.audiofx.EnvironmentalReverb(arg0, arg1));
    }

    public short getDecayHFRatio() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getDecayHFRatio();
    }

    public int getDecayTime() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getDecayTime();
    }

    public short getDensity() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getDensity();
    }

    public short getDiffusion() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getDiffusion();
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.Settings getProperties() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.Settings.wrap(real.getProperties());
    }

    public int getReflectionsDelay() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.audiofx.EnvironmentalReverb#getReflectionsDelay()");
    }

    public short getReflectionsLevel() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.audiofx.EnvironmentalReverb#getReflectionsLevel()");
    }

    public int getReverbDelay() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getReverbDelay();
    }

    public short getReverbLevel() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getReverbLevel();
    }

    public short getRoomHFLevel() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getRoomHFLevel();
    }

    public short getRoomLevel() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getRoomLevel();
    }

    public void setDecayHFRatio(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setDecayHFRatio(arg0);
    }

    public void setDecayTime(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setDecayTime(arg0);
    }

    public void setDensity(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setDensity(arg0);
    }

    public void setDiffusion(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setDiffusion(arg0);
    }

    public void setParameterListener(com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener arg0) {
        real.setParameterListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setProperties(com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.Settings arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setProperties(arg0 == null ? null : arg0.unwrap());
    }

    public void setReflectionsDelay(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.audiofx.EnvironmentalReverb#setReflectionsDelay(int)");
    }

    public void setReflectionsLevel(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.audiofx.EnvironmentalReverb#setReflectionsLevel(short)");
    }

    public void setReverbDelay(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setReverbDelay(arg0);
    }

    public void setReverbLevel(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setReverbLevel(arg0);
    }

    public void setRoomHFLevel(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setRoomHFLevel(arg0);
    }

    public void setRoomLevel(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setRoomLevel(arg0);
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
        private final android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener real;

        public OnParameterChangeListener(android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener wrap(android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener(real);
        }

        public android.media.audiofx.EnvironmentalReverb.OnParameterChangeListener unwrap() {
            return real;
        }

        public void onParameterChange(com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb arg0, int arg1, int arg2, int arg3) {
            real.onParameterChange(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

    }
    public static final class Settings {
        private final android.media.audiofx.EnvironmentalReverb.Settings real;

        public Settings(android.media.audiofx.EnvironmentalReverb.Settings real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.Settings wrap(android.media.audiofx.EnvironmentalReverb.Settings real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.EnvironmentalReverb.Settings(real);
        }

        public android.media.audiofx.EnvironmentalReverb.Settings unwrap() {
            return real;
        }

        public Settings() {
            this(new android.media.audiofx.EnvironmentalReverb.Settings());
        }

        public Settings(java.lang.String arg0) {
            this(new android.media.audiofx.EnvironmentalReverb.Settings(arg0));
        }

        public java.lang.String toString() {
            return real.toString();
        }


    }
}
