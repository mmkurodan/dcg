// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaController2 {
    private final android.media.MediaController2 real;

    public MediaController2(android.media.MediaController2 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaController2 wrap(android.media.MediaController2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaController2(real);
    }

    public android.media.MediaController2 unwrap() {
        return real;
    }

    public void cancelSessionCommand(java.lang.Object arg0) {
        real.cancelSessionCommand(arg0);
    }

    public void close() {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.media.Session2Token getConnectedToken() {
        return com.micklab.dcg.wrapper.android.media.Session2Token.wrap(real.getConnectedToken());
    }

    public boolean isPlaybackActive() {
        return real.isPlaybackActive();
    }

    public java.lang.Object sendSessionCommand(com.micklab.dcg.wrapper.android.media.Session2Command arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return real.sendSessionCommand(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static final class Builder {
        private final android.media.MediaController2.Builder real;

        public Builder(android.media.MediaController2.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaController2.Builder wrap(android.media.MediaController2.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaController2.Builder(real);
        }

        public android.media.MediaController2.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.media.Session2Token arg1) {
            this(new android.media.MediaController2.Builder(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaController2 build() {
            return com.micklab.dcg.wrapper.android.media.MediaController2.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.MediaController2.Builder setConnectionHints(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaController2.Builder.wrap(real.setConnectionHints(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaController2.Builder setControllerCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaController2.ControllerCallback arg1) {
            return com.micklab.dcg.wrapper.android.media.MediaController2.Builder.wrap(real.setControllerCallback(arg0, arg1 == null ? null : arg1.unwrap()));
        }

    }
    public static final class ControllerCallback {
        private final android.media.MediaController2.ControllerCallback real;

        public ControllerCallback(android.media.MediaController2.ControllerCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaController2.ControllerCallback wrap(android.media.MediaController2.ControllerCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaController2.ControllerCallback(real);
        }

        public android.media.MediaController2.ControllerCallback unwrap() {
            return real;
        }

        public void onCommandResult(com.micklab.dcg.wrapper.android.media.MediaController2 arg0, java.lang.Object arg1, com.micklab.dcg.wrapper.android.media.Session2Command arg2, com.micklab.dcg.wrapper.android.media.Session2Command.Result arg3) {
            real.onCommandResult(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
        }

        public void onConnected(com.micklab.dcg.wrapper.android.media.MediaController2 arg0, com.micklab.dcg.wrapper.android.media.Session2CommandGroup arg1) {
            real.onConnected(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onDisconnected(com.micklab.dcg.wrapper.android.media.MediaController2 arg0) {
            real.onDisconnected(arg0 == null ? null : arg0.unwrap());
        }

        public void onPlaybackActiveChanged(com.micklab.dcg.wrapper.android.media.MediaController2 arg0, boolean arg1) {
            real.onPlaybackActiveChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public com.micklab.dcg.wrapper.android.media.Session2Command.Result onSessionCommand(com.micklab.dcg.wrapper.android.media.MediaController2 arg0, com.micklab.dcg.wrapper.android.media.Session2Command arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            return com.micklab.dcg.wrapper.android.media.Session2Command.Result.wrap(real.onSessionCommand(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }

    }
}
