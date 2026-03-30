// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.audiofx;

public final class AudioEffect {
    private final android.media.audiofx.AudioEffect real;

    public AudioEffect(android.media.audiofx.AudioEffect real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect wrap(android.media.audiofx.AudioEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect(real);
    }

    public android.media.audiofx.AudioEffect unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect.Descriptor getDescriptor() throws java.lang.IllegalStateException {
        return com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect.Descriptor.wrap(real.getDescriptor());
    }

    public boolean getEnabled() throws java.lang.IllegalStateException {
        return real.getEnabled();
    }

    public int getId() throws java.lang.IllegalStateException {
        return real.getId();
    }

    public boolean hasControl() throws java.lang.IllegalStateException {
        return real.hasControl();
    }

    public static android.media.audiofx.AudioEffect.Descriptor[] queryEffects() {
        return android.media.audiofx.AudioEffect.queryEffects();
    }

    public void release() {
        real.release();
    }

    public void setControlStatusListener(com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect.OnControlStatusChangeListener arg0) {
        real.setControlStatusListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setEnableStatusListener(com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect.OnEnableStatusChangeListener arg0) {
        real.setEnableStatusListener(arg0 == null ? null : arg0.unwrap());
    }

    public int setEnabled(boolean arg0) throws java.lang.IllegalStateException {
        return real.setEnabled(arg0);
    }

    public static final java.lang.String ACTION_CLOSE_AUDIO_EFFECT_CONTROL_SESSION = android.media.audiofx.AudioEffect.ACTION_CLOSE_AUDIO_EFFECT_CONTROL_SESSION;
    public static final java.lang.String ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL = android.media.audiofx.AudioEffect.ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL;
    public static final java.lang.String ACTION_OPEN_AUDIO_EFFECT_CONTROL_SESSION = android.media.audiofx.AudioEffect.ACTION_OPEN_AUDIO_EFFECT_CONTROL_SESSION;
    public static final int ALREADY_EXISTS = android.media.audiofx.AudioEffect.ALREADY_EXISTS;
    public static final int CONTENT_TYPE_GAME = android.media.audiofx.AudioEffect.CONTENT_TYPE_GAME;
    public static final int CONTENT_TYPE_MOVIE = android.media.audiofx.AudioEffect.CONTENT_TYPE_MOVIE;
    public static final int CONTENT_TYPE_MUSIC = android.media.audiofx.AudioEffect.CONTENT_TYPE_MUSIC;
    public static final int CONTENT_TYPE_VOICE = android.media.audiofx.AudioEffect.CONTENT_TYPE_VOICE;
    public static final java.lang.String EFFECT_AUXILIARY = android.media.audiofx.AudioEffect.EFFECT_AUXILIARY;
    public static final java.lang.String EFFECT_INSERT = android.media.audiofx.AudioEffect.EFFECT_INSERT;
    public static final java.lang.String EFFECT_POST_PROCESSING = android.media.audiofx.AudioEffect.EFFECT_POST_PROCESSING;
    public static final java.lang.String EFFECT_PRE_PROCESSING = android.media.audiofx.AudioEffect.EFFECT_PRE_PROCESSING;
    public static final java.util.UUID EFFECT_TYPE_AEC = android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC;
    public static final java.util.UUID EFFECT_TYPE_AGC = android.media.audiofx.AudioEffect.EFFECT_TYPE_AGC;
    public static final java.util.UUID EFFECT_TYPE_BASS_BOOST = android.media.audiofx.AudioEffect.EFFECT_TYPE_BASS_BOOST;
    public static final java.util.UUID EFFECT_TYPE_DYNAMICS_PROCESSING = android.media.audiofx.AudioEffect.EFFECT_TYPE_DYNAMICS_PROCESSING;
    public static final java.util.UUID EFFECT_TYPE_ENV_REVERB = android.media.audiofx.AudioEffect.EFFECT_TYPE_ENV_REVERB;
    public static final java.util.UUID EFFECT_TYPE_EQUALIZER = android.media.audiofx.AudioEffect.EFFECT_TYPE_EQUALIZER;
    public static final java.util.UUID EFFECT_TYPE_HAPTIC_GENERATOR = android.media.audiofx.AudioEffect.EFFECT_TYPE_HAPTIC_GENERATOR;
    public static final java.util.UUID EFFECT_TYPE_LOUDNESS_ENHANCER = android.media.audiofx.AudioEffect.EFFECT_TYPE_LOUDNESS_ENHANCER;
    public static final java.util.UUID EFFECT_TYPE_NS = android.media.audiofx.AudioEffect.EFFECT_TYPE_NS;
    public static final java.util.UUID EFFECT_TYPE_PRESET_REVERB = android.media.audiofx.AudioEffect.EFFECT_TYPE_PRESET_REVERB;
    public static final java.util.UUID EFFECT_TYPE_VIRTUALIZER = android.media.audiofx.AudioEffect.EFFECT_TYPE_VIRTUALIZER;
    public static final int ERROR = android.media.audiofx.AudioEffect.ERROR;
    public static final int ERROR_BAD_VALUE = android.media.audiofx.AudioEffect.ERROR_BAD_VALUE;
    public static final int ERROR_DEAD_OBJECT = android.media.audiofx.AudioEffect.ERROR_DEAD_OBJECT;
    public static final int ERROR_INVALID_OPERATION = android.media.audiofx.AudioEffect.ERROR_INVALID_OPERATION;
    public static final int ERROR_NO_INIT = android.media.audiofx.AudioEffect.ERROR_NO_INIT;
    public static final int ERROR_NO_MEMORY = android.media.audiofx.AudioEffect.ERROR_NO_MEMORY;
    public static final java.lang.String EXTRA_AUDIO_SESSION = android.media.audiofx.AudioEffect.EXTRA_AUDIO_SESSION;
    public static final java.lang.String EXTRA_CONTENT_TYPE = android.media.audiofx.AudioEffect.EXTRA_CONTENT_TYPE;
    public static final java.lang.String EXTRA_PACKAGE_NAME = android.media.audiofx.AudioEffect.EXTRA_PACKAGE_NAME;
    public static final int SUCCESS = android.media.audiofx.AudioEffect.SUCCESS;

    public static final class Descriptor {
        private final android.media.audiofx.AudioEffect.Descriptor real;

        public Descriptor(android.media.audiofx.AudioEffect.Descriptor real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect.Descriptor wrap(android.media.audiofx.AudioEffect.Descriptor real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect.Descriptor(real);
        }

        public android.media.audiofx.AudioEffect.Descriptor unwrap() {
            return real;
        }

        public Descriptor() {
            this(new android.media.audiofx.AudioEffect.Descriptor());
        }

        public Descriptor(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) {
            this(new android.media.audiofx.AudioEffect.Descriptor(arg0, arg1, arg2, arg3, arg4));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }


    }
    public static final class OnControlStatusChangeListener {
        private final android.media.audiofx.AudioEffect.OnControlStatusChangeListener real;

        public OnControlStatusChangeListener(android.media.audiofx.AudioEffect.OnControlStatusChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect.OnControlStatusChangeListener wrap(android.media.audiofx.AudioEffect.OnControlStatusChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect.OnControlStatusChangeListener(real);
        }

        public android.media.audiofx.AudioEffect.OnControlStatusChangeListener unwrap() {
            return real;
        }

        public void onControlStatusChange(com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect arg0, boolean arg1) {
            real.onControlStatusChange(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
    public static final class OnEnableStatusChangeListener {
        private final android.media.audiofx.AudioEffect.OnEnableStatusChangeListener real;

        public OnEnableStatusChangeListener(android.media.audiofx.AudioEffect.OnEnableStatusChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect.OnEnableStatusChangeListener wrap(android.media.audiofx.AudioEffect.OnEnableStatusChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect.OnEnableStatusChangeListener(real);
        }

        public android.media.audiofx.AudioEffect.OnEnableStatusChangeListener unwrap() {
            return real;
        }

        public void onEnableStatusChange(com.micklab.dcg.wrapper.android.media.audiofx.AudioEffect arg0, boolean arg1) {
            real.onEnableStatusChange(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
}
