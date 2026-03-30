// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaSession2Service {
    private final android.media.MediaSession2Service real;

    public MediaSession2Service(android.media.MediaSession2Service real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaSession2Service wrap(android.media.MediaSession2Service real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSession2Service(real);
    }

    public android.media.MediaSession2Service unwrap() {
        return real;
    }

    public void addSession(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0) {
        real.addSession(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onCreate() {
        real.onCreate();
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public com.micklab.dcg.wrapper.android.media.MediaSession2 onGetSession(com.micklab.dcg.wrapper.android.media.MediaSession2.ControllerInfo arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaSession2.wrap(real.onGetSession(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.media.MediaSession2Service.MediaNotification onUpdateNotification(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0) {
        return com.micklab.dcg.wrapper.android.media.MediaSession2Service.MediaNotification.wrap(real.onUpdateNotification(arg0 == null ? null : arg0.unwrap()));
    }

    public void removeSession(com.micklab.dcg.wrapper.android.media.MediaSession2 arg0) {
        real.removeSession(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.media.MediaSession2Service.SERVICE_INTERFACE;

    public static final class MediaNotification {
        private final android.media.MediaSession2Service.MediaNotification real;

        public MediaNotification(android.media.MediaSession2Service.MediaNotification real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaSession2Service.MediaNotification wrap(android.media.MediaSession2Service.MediaNotification real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSession2Service.MediaNotification(real);
        }

        public android.media.MediaSession2Service.MediaNotification unwrap() {
            return real;
        }

        public MediaNotification(int arg0, com.micklab.dcg.wrapper.android.app.Notification arg1) {
            this(new android.media.MediaSession2Service.MediaNotification(arg0, arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.app.Notification getNotification() {
            return com.micklab.dcg.wrapper.android.app.Notification.wrap(real.getNotification());
        }

        public int getNotificationId() {
            return real.getNotificationId();
        }

    }
}
