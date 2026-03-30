// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.session;

public final class MediaSessionManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaSessionManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.session.MediaSessionManager wrap(android.media.session.MediaSessionManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSessionManager(real, (__DcgwBridgeToken) null);
    }

    public android.media.session.MediaSessionManager getReal() {
        return (android.media.session.MediaSessionManager) real;
    }

    public android.media.session.MediaSessionManager unwrap() {
        return getReal();
    }

    public void addOnActiveSessionsChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnActiveSessionsChangedListener arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        ((android.media.session.MediaSessionManager) real).addOnActiveSessionsChangedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addOnActiveSessionsChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnActiveSessionsChangedListener arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        ((android.media.session.MediaSessionManager) real).addOnActiveSessionsChangedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void addOnMediaKeyEventSessionChangedListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener arg1) {
        ((android.media.session.MediaSessionManager) real).addOnMediaKeyEventSessionChangedListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void addOnSession2TokensChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnSession2TokensChangedListener arg0) {
        ((android.media.session.MediaSessionManager) real).addOnSession2TokensChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void addOnSession2TokensChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnSession2TokensChangedListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.session.MediaSessionManager) real).addOnSession2TokensChangedListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSession.Token getMediaKeyEventSession() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSession.Token.wrap(((android.media.session.MediaSessionManager) real).getMediaKeyEventSession());
    }

    public java.lang.String getMediaKeyEventSessionPackageName() {
        return ((android.media.session.MediaSessionManager) real).getMediaKeyEventSessionPackageName();
    }

    public boolean isTrustedForMediaControl(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo arg0) {
        return ((android.media.session.MediaSessionManager) real).isTrustedForMediaControl(arg0 == null ? null : arg0.getReal());
    }

    public void notifySession2Created(com.micklab.dcg.wrapper.android.media.Session2Token arg0) {
        ((android.media.session.MediaSessionManager) real).notifySession2Created(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnActiveSessionsChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnActiveSessionsChangedListener arg0) {
        ((android.media.session.MediaSessionManager) real).removeOnActiveSessionsChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnMediaKeyEventSessionChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener arg0) {
        ((android.media.session.MediaSessionManager) real).removeOnMediaKeyEventSessionChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnSession2TokensChangedListener(com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnSession2TokensChangedListener arg0) {
        ((android.media.session.MediaSessionManager) real).removeOnSession2TokensChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public static final class OnActiveSessionsChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnActiveSessionsChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnActiveSessionsChangedListener wrap(android.media.session.MediaSessionManager.OnActiveSessionsChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnActiveSessionsChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.session.MediaSessionManager.OnActiveSessionsChangedListener getReal() {
            return (android.media.session.MediaSessionManager.OnActiveSessionsChangedListener) real;
        }

        public android.media.session.MediaSessionManager.OnActiveSessionsChangedListener unwrap() {
            return getReal();
        }

    }
    public static final class OnMediaKeyEventSessionChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnMediaKeyEventSessionChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener wrap(android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener getReal() {
            return (android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener) real;
        }

        public android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener unwrap() {
            return getReal();
        }

        public void onMediaKeyEventSessionChanged(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.session.MediaSession.Token arg1) {
            ((android.media.session.MediaSessionManager.OnMediaKeyEventSessionChangedListener) real).onMediaKeyEventSessionChanged(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnSession2TokensChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnSession2TokensChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnSession2TokensChangedListener wrap(android.media.session.MediaSessionManager.OnSession2TokensChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.OnSession2TokensChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.session.MediaSessionManager.OnSession2TokensChangedListener getReal() {
            return (android.media.session.MediaSessionManager.OnSession2TokensChangedListener) real;
        }

        public android.media.session.MediaSessionManager.OnSession2TokensChangedListener unwrap() {
            return getReal();
        }

    }
    public static final class RemoteUserInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RemoteUserInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo wrap(android.media.session.MediaSessionManager.RemoteUserInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo(real, (__DcgwBridgeToken) null);
        }

        public android.media.session.MediaSessionManager.RemoteUserInfo getReal() {
            return (android.media.session.MediaSessionManager.RemoteUserInfo) real;
        }

        public android.media.session.MediaSessionManager.RemoteUserInfo unwrap() {
            return getReal();
        }

        public RemoteUserInfo(java.lang.String arg0, int arg1, int arg2) {
            this(new android.media.session.MediaSessionManager.RemoteUserInfo(arg0, arg1, arg2), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.media.session.MediaSessionManager.RemoteUserInfo) real).equals(arg0);
        }

        public java.lang.String getPackageName() {
            return ((android.media.session.MediaSessionManager.RemoteUserInfo) real).getPackageName();
        }

        public int getPid() {
            return ((android.media.session.MediaSessionManager.RemoteUserInfo) real).getPid();
        }

        public int getUid() {
            return ((android.media.session.MediaSessionManager.RemoteUserInfo) real).getUid();
        }

        public int hashCode() {
            return ((android.media.session.MediaSessionManager.RemoteUserInfo) real).hashCode();
        }

    }
}
