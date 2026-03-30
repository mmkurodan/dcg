// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class PresetReverb {
    private final android.media.audiofx.PresetReverb real;

    public PresetReverb(android.media.audiofx.PresetReverb real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb wrap(android.media.audiofx.PresetReverb real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb(real);
    }

    public android.media.audiofx.PresetReverb unwrap() {
        return real;
    }

    public PresetReverb(int arg0, int arg1) throws java.lang.IllegalArgumentException, java.lang.RuntimeException, java.lang.UnsupportedOperationException {
        this(new android.media.audiofx.PresetReverb(arg0, arg1));
    }

    public short getPreset() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getPreset();
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.Settings getProperties() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.Settings.wrap(real.getProperties());
    }

    public void setParameterListener(com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.OnParameterChangeListener arg0) {
        real.setParameterListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setPreset(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setPreset(arg0);
    }

    public void setProperties(com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.Settings arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setProperties(arg0 == null ? null : arg0.unwrap());
    }

    public static final int PARAM_PRESET = android.media.audiofx.PresetReverb.PARAM_PRESET;
    public static final short PRESET_LARGEHALL = android.media.audiofx.PresetReverb.PRESET_LARGEHALL;
    public static final short PRESET_LARGEROOM = android.media.audiofx.PresetReverb.PRESET_LARGEROOM;
    public static final short PRESET_MEDIUMHALL = android.media.audiofx.PresetReverb.PRESET_MEDIUMHALL;
    public static final short PRESET_MEDIUMROOM = android.media.audiofx.PresetReverb.PRESET_MEDIUMROOM;
    public static final short PRESET_NONE = android.media.audiofx.PresetReverb.PRESET_NONE;
    public static final short PRESET_PLATE = android.media.audiofx.PresetReverb.PRESET_PLATE;
    public static final short PRESET_SMALLROOM = android.media.audiofx.PresetReverb.PRESET_SMALLROOM;

    public static final class OnParameterChangeListener {
        private final android.media.audiofx.PresetReverb.OnParameterChangeListener real;

        public OnParameterChangeListener(android.media.audiofx.PresetReverb.OnParameterChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.OnParameterChangeListener wrap(android.media.audiofx.PresetReverb.OnParameterChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.OnParameterChangeListener(real);
        }

        public android.media.audiofx.PresetReverb.OnParameterChangeListener unwrap() {
            return real;
        }

        public void onParameterChange(com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb arg0, int arg1, int arg2, short arg3) {
            real.onParameterChange(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
        }

    }
    public static final class Settings {
        private final android.media.audiofx.PresetReverb.Settings real;

        public Settings(android.media.audiofx.PresetReverb.Settings real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.Settings wrap(android.media.audiofx.PresetReverb.Settings real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.Settings(real);
        }

        public android.media.audiofx.PresetReverb.Settings unwrap() {
            return real;
        }

        public Settings() {
            this(new android.media.audiofx.PresetReverb.Settings());
        }

        public Settings(java.lang.String arg0) {
            this(new android.media.audiofx.PresetReverb.Settings(arg0));
        }

        public java.lang.String toString() {
            return real.toString();
        }


    }
}
