// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class Equalizer {
    private final android.media.audiofx.Equalizer real;

    public Equalizer(android.media.audiofx.Equalizer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.Equalizer wrap(android.media.audiofx.Equalizer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.Equalizer(real);
    }

    public android.media.audiofx.Equalizer unwrap() {
        return real;
    }

    public Equalizer(int arg0, int arg1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.RuntimeException, java.lang.UnsupportedOperationException {
        this(new android.media.audiofx.Equalizer(arg0, arg1));
    }

    public short getBand(int arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getBand(arg0);
    }

    public int[] getBandFreqRange(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getBandFreqRange(arg0);
    }

    public short getBandLevel(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getBandLevel(arg0);
    }

    public short[] getBandLevelRange() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getBandLevelRange();
    }

    public int getCenterFreq(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getCenterFreq(arg0);
    }

    public short getCurrentPreset() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getCurrentPreset();
    }

    public short getNumberOfBands() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getNumberOfBands();
    }

    public short getNumberOfPresets() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return real.getNumberOfPresets();
    }

    public java.lang.String getPresetName(short arg0) {
        return real.getPresetName(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.Equalizer.Settings getProperties() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return com.micklab.dcg.wrapper.android.media.audiofx.Equalizer.Settings.wrap(real.getProperties());
    }

    public void setBandLevel(short arg0, short arg1) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setBandLevel(arg0, arg1);
    }

    public void setParameterListener(com.micklab.dcg.wrapper.android.media.audiofx.Equalizer.OnParameterChangeListener arg0) {
        real.setParameterListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setProperties(com.micklab.dcg.wrapper.android.media.audiofx.Equalizer.Settings arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.setProperties(arg0 == null ? null : arg0.unwrap());
    }

    public void usePreset(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        real.usePreset(arg0);
    }

    public static final int PARAM_BAND_FREQ_RANGE = android.media.audiofx.Equalizer.PARAM_BAND_FREQ_RANGE;
    public static final int PARAM_BAND_LEVEL = android.media.audiofx.Equalizer.PARAM_BAND_LEVEL;
    public static final int PARAM_CENTER_FREQ = android.media.audiofx.Equalizer.PARAM_CENTER_FREQ;
    public static final int PARAM_CURRENT_PRESET = android.media.audiofx.Equalizer.PARAM_CURRENT_PRESET;
    public static final int PARAM_GET_BAND = android.media.audiofx.Equalizer.PARAM_GET_BAND;
    public static final int PARAM_GET_NUM_OF_PRESETS = android.media.audiofx.Equalizer.PARAM_GET_NUM_OF_PRESETS;
    public static final int PARAM_GET_PRESET_NAME = android.media.audiofx.Equalizer.PARAM_GET_PRESET_NAME;
    public static final int PARAM_LEVEL_RANGE = android.media.audiofx.Equalizer.PARAM_LEVEL_RANGE;
    public static final int PARAM_NUM_BANDS = android.media.audiofx.Equalizer.PARAM_NUM_BANDS;
    public static final int PARAM_STRING_SIZE_MAX = android.media.audiofx.Equalizer.PARAM_STRING_SIZE_MAX;

    public static final class OnParameterChangeListener {
        private final android.media.audiofx.Equalizer.OnParameterChangeListener real;

        public OnParameterChangeListener(android.media.audiofx.Equalizer.OnParameterChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.Equalizer.OnParameterChangeListener wrap(android.media.audiofx.Equalizer.OnParameterChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.Equalizer.OnParameterChangeListener(real);
        }

        public android.media.audiofx.Equalizer.OnParameterChangeListener unwrap() {
            return real;
        }

        public void onParameterChange(com.micklab.dcg.wrapper.android.media.audiofx.Equalizer arg0, int arg1, int arg2, int arg3, int arg4) {
            real.onParameterChange(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
        }

    }
    public static final class Settings {
        private final android.media.audiofx.Equalizer.Settings real;

        public Settings(android.media.audiofx.Equalizer.Settings real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.Equalizer.Settings wrap(android.media.audiofx.Equalizer.Settings real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.Equalizer.Settings(real);
        }

        public android.media.audiofx.Equalizer.Settings unwrap() {
            return real;
        }

        public Settings() {
            this(new android.media.audiofx.Equalizer.Settings());
        }

        public Settings(java.lang.String arg0) {
            this(new android.media.audiofx.Equalizer.Settings(arg0));
        }

        public java.lang.String toString() {
            return real.toString();
        }


    }
}
