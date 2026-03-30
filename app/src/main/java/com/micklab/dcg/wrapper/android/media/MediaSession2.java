// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaSession2 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaSession2(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaSession2 wrap(android.media.MediaSession2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSession2(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaSession2 getReal() {
        return (android.media.MediaSession2) real;
    }

    public android.media.MediaSession2 unwrap() {
        return getReal();
    }

    public void broadcastSessionCommand(com.micklab.dcg.wrapper.android.media.Session2Command arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.media.MediaSession2) real).broadcastSessionCommand(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void cancelSessionCommand(com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg0, java.lang.Object arg1) {
        ((android.media.MediaSession2) real).cancelSessionCommand(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void close() {
        ((android.media.MediaSession2) real).close();
    }

    public java.lang.String getId() {
        return ((android.media.MediaSession2) real).getId();
    }

    public com.micklab.dcg.wrapper.android.media.Session2Token getToken() {
        return com.micklab.dcg.wrapper.android.media.Session2Token.wrap(((android.media.MediaSession2) real).getToken());
    }

    public boolean isPlaybackActive() {
        return ((android.media.MediaSession2) real).isPlaybackActive();
    }

    public java.lang.Object sendSessionCommand(com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg0, com.micklab.dcg.wrapper.android.media.Session2Command arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return ((android.media.MediaSession2) real).sendSessionCommand(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void setPlaybackActive(boolean arg0) {
        ((android.media.MediaSession2) real).setPlaybackActive(arg0);
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaSession2.Builder wrap(android.media.MediaSession2.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSession2.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaSession2.Builder getReal() {
            return (android.media.MediaSession2.Builder) real;
        }

        public android.media.MediaSession2.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.media.MediaSession2.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.MediaSession2 build() {
            return com.micklab.dcg.wrapper.android.media.MediaSession2.wrap(((android.media.MediaSession2.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.MediaSession2.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaSession2.Builder.wrap(((android.media.MediaSession2.Builder) real).setExtras(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaSession2.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaSession2.Builder.wrap(((android.media.MediaSession2.Builder) real).setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.MediaSession2.Builder setSessionActivity(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaSession2.Builder.wrap(((android.media.MediaSession2.Builder) real).setSessionActivity(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaSession2.Builder setSessionCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaSession2.SessionCallback arg1) {
            return com.micklab.dcg.wrapper.android.media.MediaSession2.Builder.wrap(((android.media.MediaSession2.Builder) real).setSessionCallback(arg0, arg1 == null ? null : arg1.getReal()));
        }

    }
    public static final class ControllerInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ControllerInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo wrap(android.media.MediaSession2.ControllerInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaSession2.ControllerInfo getReal() {
            return (android.media.MediaSession2.ControllerInfo) real;
        }

        public android.media.MediaSession2.ControllerInfo unwrap() {
            return getReal();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.media.MediaSession2.ControllerInfo) real).equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getConnectionHints() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.MediaSession2.ControllerInfo) real).getConnectionHints());
        }

        public java.lang.String getPackageName() {
            return ((android.media.MediaSession2.ControllerInfo) real).getPackageName();
        }

        public com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo getRemoteUserInfo() {
            return com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo.wrap(((android.media.MediaSession2.ControllerInfo) real).getRemoteUserInfo());
        }

        public int getUid() {
            return ((android.media.MediaSession2.ControllerInfo) real).getUid();
        }

        public int hashCode() {
            return ((android.media.MediaSession2.ControllerInfo) real).hashCode();
        }

        public java.lang.String toString() {
            return ((android.media.MediaSession2.ControllerInfo) real).toString();
        }

    }
    public static final class SessionCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SessionCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaSession2.SessionCallback wrap(android.media.MediaSession2.SessionCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSession2.SessionCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaSession2.SessionCallback getReal() {
            return (android.media.MediaSession2.SessionCallback) real;
        }

        public android.media.MediaSession2.SessionCallback unwrap() {
            return getReal();
        }

        public void onCommandResult(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0, com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg1, java.lang.Object arg2, com.micklab.dcg.wrapper.android.media.Session2Command arg3, com.micklab.dcg.wrapper.android.media.Session2Command.Result arg4) {
            ((android.media.MediaSession2.SessionCallback) real).onCommandResult(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
        }

        public com.micklab.dcg.wrapper.android.media.Session2CommandGroup onConnect(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0, com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg1) {
            return com.micklab.dcg.wrapper.android.media.Session2CommandGroup.wrap(((android.media.MediaSession2.SessionCallback) real).onConnect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public void onDisconnected(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0, com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg1) {
            ((android.media.MediaSession2.SessionCallback) real).onDisconnected(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onPostConnect(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0, com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg1) {
            ((android.media.MediaSession2.SessionCallback) real).onPostConnect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public com.micklab.dcg.wrapper.android.media.Session2Command.Result onSessionCommand(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0, com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg1, com.micklab.dcg.wrapper.android.media.Session2Command arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
            return com.micklab.dcg.wrapper.android.media.Session2Command.Result.wrap(((android.media.MediaSession2.SessionCallback) real).onSessionCommand(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()));
        }

    }
}
