// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaController2 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaController2(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaController2 wrap(android.media.MediaController2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaController2(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaController2 getReal() {
        return (android.media.MediaController2) real;
    }

    public android.media.MediaController2 unwrap() {
        return getReal();
    }

    public void cancelSessionCommand(java.lang.Object arg0) {
        ((android.media.MediaController2) real).cancelSessionCommand(arg0);
    }

    public void close() {
        ((android.media.MediaController2) real).close();
    }

    public com.micklab.dcg.wrapper.android.media.Session2Token getConnectedToken() {
        return com.micklab.dcg.wrapper.android.media.Session2Token.wrap(((android.media.MediaController2) real).getConnectedToken());
    }

    public boolean isPlaybackActive() {
        return ((android.media.MediaController2) real).isPlaybackActive();
    }

    public java.lang.Object sendSessionCommand(com.micklab.dcg.wrapper.android.media.Session2Command arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        return ((android.media.MediaController2) real).sendSessionCommand(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaController2.Builder wrap(android.media.MediaController2.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaController2.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaController2.Builder getReal() {
            return (android.media.MediaController2.Builder) real;
        }

        public android.media.MediaController2.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.media.Session2Token arg1) {
            this(new android.media.MediaController2.Builder(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.MediaController2 build() {
            return com.micklab.dcg.wrapper.android.media.MediaController2.wrap(((android.media.MediaController2.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.MediaController2.Builder setConnectionHints(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaController2.Builder.wrap(((android.media.MediaController2.Builder) real).setConnectionHints(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaController2.Builder setControllerCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaController2.ControllerCallback arg1) {
            return com.micklab.dcg.wrapper.android.media.MediaController2.Builder.wrap(((android.media.MediaController2.Builder) real).setControllerCallback(arg0, arg1 == null ? null : arg1.getReal()));
        }

    }
    public static final class ControllerCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ControllerCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaController2.ControllerCallback wrap(android.media.MediaController2.ControllerCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaController2.ControllerCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaController2.ControllerCallback getReal() {
            return (android.media.MediaController2.ControllerCallback) real;
        }

        public android.media.MediaController2.ControllerCallback unwrap() {
            return getReal();
        }

        public void onCommandResult(com.micklab.dcg.wrapper.android.media.MediaController2 arg0, java.lang.Object arg1, com.micklab.dcg.wrapper.android.media.Session2Command arg2, com.micklab.dcg.wrapper.android.media.Session2Command.Result arg3) {
            ((android.media.MediaController2.ControllerCallback) real).onCommandResult(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
        }

        public void onConnected(com.micklab.dcg.wrapper.android.media.MediaController2 arg0, com.micklab.dcg.wrapper.android.media.Session2CommandGroup arg1) {
            ((android.media.MediaController2.ControllerCallback) real).onConnected(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onDisconnected(com.micklab.dcg.wrapper.android.media.MediaController2 arg0) {
            ((android.media.MediaController2.ControllerCallback) real).onDisconnected(arg0 == null ? null : arg0.getReal());
        }

        public void onPlaybackActiveChanged(com.micklab.dcg.wrapper.android.media.MediaController2 arg0, boolean arg1) {
            ((android.media.MediaController2.ControllerCallback) real).onPlaybackActiveChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public com.micklab.dcg.wrapper.android.media.Session2Command.Result onSessionCommand(com.micklab.dcg.wrapper.android.media.MediaController2 arg0, com.micklab.dcg.wrapper.android.media.Session2Command arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            return com.micklab.dcg.wrapper.android.media.Session2Command.Result.wrap(((android.media.MediaController2.ControllerCallback) real).onSessionCommand(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
        }

    }
}
