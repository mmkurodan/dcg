// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaSession2 {
    private final android.media.MediaSession2 real;

    public MediaSession2(android.media.MediaSession2 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaSession2 wrap(android.media.MediaSession2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSession2(real);
    }

    public android.media.MediaSession2 unwrap() {
        return real;
    }

    public void broadcastSessionCommand(com.micklab.dcg.wrapper.android.media.Session2Command arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.broadcastSessionCommand(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void cancelSessionCommand(com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg0, java.lang.Object arg1) {
        real.cancelSessionCommand(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void close() {
        real.close();
    }

    public java.lang.String getId() {
        return real.getId();
    }

    public com.micklab.dcg.wrapper.android.media.Session2Token getToken() {
        return com.micklab.dcg.wrapper.android.media.Session2Token.wrap(real.getToken());
    }

    public boolean isPlaybackActive() {
        return real.isPlaybackActive();
    }

    public java.lang.Object sendSessionCommand(com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg0, com.micklab.dcg.wrapper.android.media.Session2Command arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return real.sendSessionCommand(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void setPlaybackActive(boolean arg0) {
        real.setPlaybackActive(arg0);
    }

    public static final class Builder {
        private final android.media.MediaSession2.Builder real;

        public Builder(android.media.MediaSession2.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaSession2.Builder wrap(android.media.MediaSession2.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSession2.Builder(real);
        }

        public android.media.MediaSession2.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.content.Context arg0) {
            this(new android.media.MediaSession2.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaSession2 build() {
            return com.micklab.dcg.wrapper.android.media.MediaSession2.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.MediaSession2.Builder setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaSession2.Builder.wrap(real.setExtras(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaSession2.Builder setId(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaSession2.Builder.wrap(real.setId(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.MediaSession2.Builder setSessionActivity(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
            return com.micklab.dcg.wrapper.android.media.MediaSession2.Builder.wrap(real.setSessionActivity(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.MediaSession2.Builder setSessionCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.MediaSession2.SessionCallback arg1) {
            return com.micklab.dcg.wrapper.android.media.MediaSession2.Builder.wrap(real.setSessionCallback(arg0, arg1 == null ? null : arg1.unwrap()));
        }

    }
    public static final class ControllerInfo {
        private final android.media.MediaSession2.ControllerInfo real;

        public ControllerInfo(android.media.MediaSession2.ControllerInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo wrap(android.media.MediaSession2.ControllerInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo(real);
        }

        public android.media.MediaSession2.ControllerInfo unwrap() {
            return real;
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getConnectionHints() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getConnectionHints());
        }

        public java.lang.String getPackageName() {
            return real.getPackageName();
        }

        public com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo getRemoteUserInfo() {
            return com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo.wrap(real.getRemoteUserInfo());
        }

        public int getUid() {
            return real.getUid();
        }

        public int hashCode() {
            return real.hashCode();
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class SessionCallback {
        private final android.media.MediaSession2.SessionCallback real;

        public SessionCallback(android.media.MediaSession2.SessionCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaSession2.SessionCallback wrap(android.media.MediaSession2.SessionCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSession2.SessionCallback(real);
        }

        public android.media.MediaSession2.SessionCallback unwrap() {
            return real;
        }

        public void onCommandResult(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0, com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg1, java.lang.Object arg2, com.micklab.dcg.wrapper.android.media.Session2Command arg3, com.micklab.dcg.wrapper.android.media.Session2Command.Result arg4) {
            real.onCommandResult(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
        }

        public com.micklab.dcg.wrapper.android.media.Session2CommandGroup onConnect(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0, com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg1) {
            return com.micklab.dcg.wrapper.android.media.Session2CommandGroup.wrap(real.onConnect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public void onDisconnected(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0, com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg1) {
            real.onDisconnected(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onPostConnect(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0, com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg1) {
            real.onPostConnect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public com.micklab.dcg.wrapper.android.media.Session2Command.Result onSessionCommand(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0, com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg1, com.micklab.dcg.wrapper.android.media.Session2Command arg2, com.micklab.dcg.wrapper.android.os.Bundle arg3) {
            return com.micklab.dcg.wrapper.android.media.Session2Command.Result.wrap(real.onSessionCommand(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
        }

    }
}
