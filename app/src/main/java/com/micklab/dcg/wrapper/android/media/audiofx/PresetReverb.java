// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class PresetReverb {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PresetReverb(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb wrap(android.media.audiofx.PresetReverb real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb(real, (__DcgwBridgeToken) null);
    }

    public android.media.audiofx.PresetReverb getReal() {
        return (android.media.audiofx.PresetReverb) real;
    }

    public android.media.audiofx.PresetReverb unwrap() {
        return getReal();
    }

    public PresetReverb(int arg0, int arg1) throws java.lang.IllegalArgumentException, java.lang.RuntimeException, java.lang.UnsupportedOperationException {
        this(new android.media.audiofx.PresetReverb(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public short getPreset() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return ((android.media.audiofx.PresetReverb) real).getPreset();
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.Settings getProperties() throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        return com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.Settings.wrap(((android.media.audiofx.PresetReverb) real).getProperties());
    }

    public void setParameterListener(com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.OnParameterChangeListener arg0) {
        ((android.media.audiofx.PresetReverb) real).setParameterListener(arg0 == null ? null : arg0.getReal());
    }

    public void setPreset(short arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.PresetReverb) real).setPreset(arg0);
    }

    public void setProperties(com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.Settings arg0) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException, java.lang.UnsupportedOperationException {
        ((android.media.audiofx.PresetReverb) real).setProperties(arg0 == null ? null : arg0.getReal());
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnParameterChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.OnParameterChangeListener wrap(android.media.audiofx.PresetReverb.OnParameterChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.OnParameterChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.PresetReverb.OnParameterChangeListener getReal() {
            return (android.media.audiofx.PresetReverb.OnParameterChangeListener) real;
        }

        public android.media.audiofx.PresetReverb.OnParameterChangeListener unwrap() {
            return getReal();
        }

        public void onParameterChange(com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb arg0, int arg1, int arg2, short arg3) {
            ((android.media.audiofx.PresetReverb.OnParameterChangeListener) real).onParameterChange(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
        }

    }
    public static final class Settings {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Settings(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.Settings wrap(android.media.audiofx.PresetReverb.Settings real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.PresetReverb.Settings(real, (__DcgwBridgeToken) null);
        }

        public android.media.audiofx.PresetReverb.Settings getReal() {
            return (android.media.audiofx.PresetReverb.Settings) real;
        }

        public android.media.audiofx.PresetReverb.Settings unwrap() {
            return getReal();
        }

        public Settings() {
            this(new android.media.audiofx.PresetReverb.Settings(), (__DcgwBridgeToken) null);
        }

        public Settings(java.lang.String arg0) {
            this(new android.media.audiofx.PresetReverb.Settings(arg0), (__DcgwBridgeToken) null);
        }

        public java.lang.String toString() {
            return ((android.media.audiofx.PresetReverb.Settings) real).toString();
        }


    }
}
