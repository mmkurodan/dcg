// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.media;

public final class MediaBrowserService {
    private final android.service.media.MediaBrowserService real;

    public MediaBrowserService(android.service.media.MediaBrowserService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.media.MediaBrowserService wrap(android.service.media.MediaBrowserService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.media.MediaBrowserService(real);
    }

    public android.service.media.MediaBrowserService unwrap() {
        return real;
    }

    public void dump(java.io.FileDescriptor arg0, java.io.PrintWriter arg1, java.lang.String[] arg2) {
        real.dump(arg0, arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getBrowserRootHints() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getBrowserRootHints());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo.wrap(real.getCurrentBrowserInfo());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSession.Token getSessionToken() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSession.Token.wrap(real.getSessionToken());
    }

    public void notifyChildrenChanged(java.lang.String arg0) {
        real.notifyChildrenChanged(arg0);
    }

    public void notifyChildrenChanged(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.notifyChildrenChanged(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onCreate() {
        real.onCreate();
    }

    public com.micklab.dcg.wrapper.android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        return com.micklab.dcg.wrapper.android.service.media.MediaBrowserService.BrowserRoot.wrap(real.onGetRoot(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public void setSessionToken(com.micklab.dcg.wrapper.android.media.session.MediaSession.Token arg0) {
        real.setSessionToken(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.service.media.MediaBrowserService.SERVICE_INTERFACE;

    public static final class BrowserRoot {
        private final android.service.media.MediaBrowserService.BrowserRoot real;

        public BrowserRoot(android.service.media.MediaBrowserService.BrowserRoot real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.media.MediaBrowserService.BrowserRoot wrap(android.service.media.MediaBrowserService.BrowserRoot real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.media.MediaBrowserService.BrowserRoot(real);
        }

        public android.service.media.MediaBrowserService.BrowserRoot unwrap() {
            return real;
        }

        public BrowserRoot(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            this(new android.service.media.MediaBrowserService.BrowserRoot(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
        }

        public java.lang.String getRootId() {
            return real.getRootId();
        }

        public static final java.lang.String EXTRA_OFFLINE = android.service.media.MediaBrowserService.BrowserRoot.EXTRA_OFFLINE;
        public static final java.lang.String EXTRA_RECENT = android.service.media.MediaBrowserService.BrowserRoot.EXTRA_RECENT;
        public static final java.lang.String EXTRA_SUGGESTED = android.service.media.MediaBrowserService.BrowserRoot.EXTRA_SUGGESTED;

    }
}
