// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaSession2Service {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaSession2Service(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaSession2Service wrap(android.media.MediaSession2Service real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSession2Service(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaSession2Service getReal() {
        return (android.media.MediaSession2Service) real;
    }

    public android.media.MediaSession2Service unwrap() {
        return getReal();
    }

    public void addSession(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0) {
        ((android.media.MediaSession2Service) real).addSession(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.media.MediaSession2Service) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onCreate() {
        ((android.media.MediaSession2Service) real).onCreate();
    }

    public void onDestroy() {
        ((android.media.MediaSession2Service) real).onDestroy();
    }

    public com.micklab.dcg.wrapper.android.media.MediaSession2 onGetSession(com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaSession2.wrap(((android.media.MediaSession2Service) real).onGetSession(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.media.MediaSession2Service.MediaNotification onUpdateNotification(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaSession2Service.MediaNotification.wrap(((android.media.MediaSession2Service) real).onUpdateNotification(arg0 == null ? null : arg0.getReal()));
    }

    public void removeSession(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0) {
        ((android.media.MediaSession2Service) real).removeSession(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.media.MediaSession2Service.SERVICE_INTERFACE;

    public static final class MediaNotification {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MediaNotification(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaSession2Service.MediaNotification wrap(android.media.MediaSession2Service.MediaNotification real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSession2Service.MediaNotification(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaSession2Service.MediaNotification getReal() {
            return (android.media.MediaSession2Service.MediaNotification) real;
        }

        public android.media.MediaSession2Service.MediaNotification unwrap() {
            return getReal();
        }

        public MediaNotification(int arg0, com.micklab.dcg.wrapper.android.app.Notification arg1) {
            this(new android.media.MediaSession2Service.MediaNotification(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.app.Notification getNotification() {
            return com.micklab.dcg.wrapper.android.app.Notification.wrap(((android.media.MediaSession2Service.MediaNotification) real).getNotification());
        }

        public int getNotificationId() {
            return ((android.media.MediaSession2Service.MediaNotification) real).getNotificationId();
        }

    }
}
