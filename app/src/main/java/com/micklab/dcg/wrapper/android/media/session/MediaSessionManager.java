// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.session;

public final class MediaSessionManager {
    private final android.media.session.MediaSessionManager real;

    public MediaSessionManager(android.media.session.MediaSessionManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.session.MediaSessionManager wrap(android.media.session.MediaSessionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSessionManager(real);
    }

    public android.media.session.MediaSessionManager unwrap() {
        return real;
    }

    public void addOnActiveSessionsChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnActiveSessionsChangedListener arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        real.addOnActiveSessionsChangedListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addOnActiveSessionsChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnActiveSessionsChangedListener arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        real.addOnActiveSessionsChangedListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void addOnMediaKeyEventSessionChangedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener arg1) {
        real.addOnMediaKeyEventSessionChangedListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void addOnSession2TokensChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnSession2TokensChangedListener arg0) {
        real.addOnSession2TokensChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnSession2TokensChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnSession2TokensChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.addOnSession2TokensChangedListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSession.Token getMediaKeyEventSession() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSession.Token.wrap(real.getMediaKeyEventSession());
    }

    public java.lang.String getMediaKeyEventSessionPackageName() {
        return real.getMediaKeyEventSessionPackageName();
    }

    public boolean isTrustedForMediaControl(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo arg0) {
        return real.isTrustedForMediaControl(arg0 == null ? null : arg0.unwrap());
    }

    public void notifySession2Created(com.micklab.dcg.wrapper.android.media.Session2Token arg0) {
        real.notifySession2Created(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnActiveSessionsChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnActiveSessionsChangedListener arg0) {
        real.removeOnActiveSessionsChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnMediaKeyEventSessionChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener arg0) {
        real.removeOnMediaKeyEventSessionChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnSession2TokensChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnSession2TokensChangedListener arg0) {
        real.removeOnSession2TokensChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final class OnActiveSessionsChangedListener {
        private final android.media.session.MediaSessionManager.OnActiveSessionsChangedListener real;

        public OnActiveSessionsChangedListener(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnActiveSessionsChangedListener wrap(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnActiveSessionsChangedListener(real);
        }

        public android.media.session.MediaSessionManager.OnActiveSessionsChangedListener unwrap() {
            return real;
        }

    }
    public static final class OnMediaKeyEventSessionChangedListener {
        private final android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener real;

        public OnMediaKeyEventSessionChangedListener(android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener wrap(android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener(real);
        }

        public android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener unwrap() {
            return real;
        }

        public void onMediaKeyEventSessionChanged(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.session.MediaSession.Token arg1) {
            real.onMediaKeyEventSessionChanged(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnSession2TokensChangedListener {
        private final android.media.session.MediaSessionManager.OnSession2TokensChangedListener real;

        public OnSession2TokensChangedListener(android.media.session.MediaSessionManager.OnSession2TokensChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnSession2TokensChangedListener wrap(android.media.session.MediaSessionManager.OnSession2TokensChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnSession2TokensChangedListener(real);
        }

        public android.media.session.MediaSessionManager.OnSession2TokensChangedListener unwrap() {
            return real;
        }

    }
    public static final class RemoteUserInfo {
        private final android.media.session.MediaSessionManager.RemoteUserInfo real;

        public RemoteUserInfo(android.media.session.MediaSessionManager.RemoteUserInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo wrap(android.media.session.MediaSessionManager.RemoteUserInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo(real);
        }

        public android.media.session.MediaSessionManager.RemoteUserInfo unwrap() {
            return real;
        }

        public RemoteUserInfo(java.lang.String arg0, int arg1, int arg2) {
            this(new android.media.session.MediaSessionManager.RemoteUserInfo(arg0, arg1, arg2));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public java.lang.String getPackageName() {
            return real.getPackageName();
        }

        public int getPid() {
            return real.getPid();
        }

        public int getUid() {
            return real.getUid();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
}
