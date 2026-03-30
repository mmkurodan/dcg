// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioFocusRequest {
    private final android.media.AudioFocusRequest real;

    public AudioFocusRequest(android.media.AudioFocusRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioFocusRequest wrap(android.media.AudioFocusRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioFocusRequest(real);
    }

    public android.media.AudioFocusRequest unwrap() {
        return real;
    }

    public boolean acceptsDelayedFocusGain() {
        return real.acceptsDelayedFocusGain();
    }

    public com.micklab.dcg.wrapper.android.media.AudioAttributes getAudioAttributes() {
        return com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(real.getAudioAttributes());
    }

    public int getFocusGain() {
        return real.getFocusGain();
    }

    public boolean willPauseWhenDucked() {
        return real.willPauseWhenDucked();
    }

    public static final class Builder {
        private final android.media.AudioFocusRequest.Builder real;

        public Builder(android.media.AudioFocusRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder wrap(android.media.AudioFocusRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder(real);
        }

        public android.media.AudioFocusRequest.Builder unwrap() {
            return real;
        }

        public Builder(int arg0) {
            this(new android.media.AudioFocusRequest.Builder(arg0));
        }

        public Builder(com.micklab.dcg.wrapper.android.media.AudioFocusRequest arg0) {
            this(new android.media.AudioFocusRequest.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest build() {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setAcceptsDelayedFocusGain(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(real.setAcceptsDelayedFocusGain(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(real.setAudioAttributes(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setFocusGain(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(real.setFocusGain(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setForceDucking(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(real.setForceDucking(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setOnAudioFocusChangeListener(com.micklab.dcg.wrapper.android.media.AudioManager.OnAudioFocusChangeListener arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(real.setOnAudioFocusChangeListener(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setOnAudioFocusChangeListener(com.micklab.dcg.wrapper.android.media.AudioManager.OnAudioFocusChangeListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(real.setOnAudioFocusChangeListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder setWillPauseWhenDucked(boolean arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFocusRequest.Builder.wrap(real.setWillPauseWhenDucked(arg0));
        }

    }
}
