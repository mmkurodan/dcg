// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioFocusRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioFocusRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioFocusRequest wrap(android.media.AudioFocusRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioFocusRequest(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioFocusRequest getReal() {
        return (android.media.AudioFocusRequest) real;
    }

    public android.media.AudioFocusRequest unwrap() {
        return getReal();
    }

    public boolean acceptsDelayedFocusGain() {
        return ((android.media.AudioFocusRequest) real).acceptsDelayedFocusGain();
    }

    public com.micklab.dcg.wrapper.android.media.AudioAttributes getAudioAttributes() {
        return com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(((android.media.AudioFocusRequest) real).getAudioAttributes());
    }

    public int getFocusGain() {
        return ((android.media.AudioFocusRequest) real).getFocusGain();
    }

    public boolean willPauseWhenDucked() {
        return ((android.media.AudioFocusRequest) real).willPauseWhenDucked();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder wrap(android.media.AudioFocusRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioFocusRequest.Builder getReal() {
            return (android.media.AudioFocusRequest.Builder) real;
        }

        public android.media.AudioFocusRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.media.AudioFocusRequest arg0) {
            this(new android.media.AudioFocusRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Builder(int arg0) {
            this(new android.media.AudioFocusRequest.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest build() {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.wrap(((android.media.AudioFocusRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setAcceptsDelayedFocusGain(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(((android.media.AudioFocusRequest.Builder) real).setAcceptsDelayedFocusGain(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(((android.media.AudioFocusRequest.Builder) real).setAudioAttributes(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setFocusGain(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(((android.media.AudioFocusRequest.Builder) real).setFocusGain(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setForceDucking(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(((android.media.AudioFocusRequest.Builder) real).setForceDucking(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setOnAudioFocusChangeListener(com.micklab.dcg.wrapper.android.media.AudioManager.OnAudioFocusChangeListener arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(((android.media.AudioFocusRequest.Builder) real).setOnAudioFocusChangeListener(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setOnAudioFocusChangeListener(com.micklab.dcg.wrapper.android.media.AudioManager.OnAudioFocusChangeListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(((android.media.AudioFocusRequest.Builder) real).setOnAudioFocusChangeListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setWillPauseWhenDucked(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(((android.media.AudioFocusRequest.Builder) real).setWillPauseWhenDucked(arg0));
        }

    }
}
