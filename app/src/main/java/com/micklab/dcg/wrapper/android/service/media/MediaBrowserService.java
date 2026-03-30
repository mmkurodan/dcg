// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.media;

public final class MediaBrowserService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaBrowserService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.media.MediaBrowserService wrap(android.service.media.MediaBrowserService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.media.MediaBrowserService(real, (__DcgwBridgeToken) null);
    }

    public android.service.media.MediaBrowserService getReal() {
        return (android.service.media.MediaBrowserService) real;
    }

    public android.service.media.MediaBrowserService unwrap() {
        return getReal();
    }

    public void dump(java.io.FileDescriptor arg0, java.io.PrintWriter arg1, java.lang.String[] arg2) {
        ((android.service.media.MediaBrowserService) real).dump(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getBrowserRootHints() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.media.MediaBrowserService) real).getBrowserRootHints());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo.wrap(((android.service.media.MediaBrowserService) real).getCurrentBrowserInfo());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSession.Token getSessionToken() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSession.Token.wrap(((android.service.media.MediaBrowserService) real).getSessionToken());
    }

    public void notifyChildrenChanged(java.lang.String arg0) {
        ((android.service.media.MediaBrowserService) real).notifyChildrenChanged(arg0);
    }

    public void notifyChildrenChanged(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.service.media.MediaBrowserService) real).notifyChildrenChanged(arg0, arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.media.MediaBrowserService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onCreate() {
        ((android.service.media.MediaBrowserService) real).onCreate();
    }

    public com.micklab.dcg.wrapper.android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.service.media.MediaBrowserService.BrowserRoot.wrap(((android.service.media.MediaBrowserService) real).onGetRoot(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public void setSessionToken(com.micklab.dcg.wrapper.android.media.session.MediaSession.Token arg0) {
        ((android.service.media.MediaBrowserService) real).setSessionToken(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.service.media.MediaBrowserService.SERVICE_INTERFACE;

    public static final class BrowserRoot {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BrowserRoot(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.media.MediaBrowserService.BrowserRoot wrap(android.service.media.MediaBrowserService.BrowserRoot real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.media.MediaBrowserService.BrowserRoot(real, (__DcgwBridgeToken) null);
        }

        public android.service.media.MediaBrowserService.BrowserRoot getReal() {
            return (android.service.media.MediaBrowserService.BrowserRoot) real;
        }

        public android.service.media.MediaBrowserService.BrowserRoot unwrap() {
            return getReal();
        }

        public BrowserRoot(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            this(new android.service.media.MediaBrowserService.BrowserRoot(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.service.media.MediaBrowserService.BrowserRoot) real).getExtras());
        }

        public java.lang.String getRootId() {
            return ((android.service.media.MediaBrowserService.BrowserRoot) real).getRootId();
        }

        public static final java.lang.String EXTRA_OFFLINE = android.service.media.MediaBrowserService.BrowserRoot.EXTRA_OFFLINE;
        public static final java.lang.String EXTRA_RECENT = android.service.media.MediaBrowserService.BrowserRoot.EXTRA_RECENT;
        public static final java.lang.String EXTRA_SUGGESTED = android.service.media.MediaBrowserService.BrowserRoot.EXTRA_SUGGESTED;

    }
}
