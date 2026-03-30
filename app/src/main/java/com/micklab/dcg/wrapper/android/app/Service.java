// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Service {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Service(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Service wrap(android.app.Service real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Service(real, (__DcgwBridgeToken) null);
    }

    public android.app.Service getReal() {
        return (android.app.Service) real;
    }

    public android.app.Service unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.app.Application getApplication() {
        return com.micklab.dcg.wrapper.android.app.Application.wrap(((android.app.Service) real).getApplication());
    }

    public int getForegroundServiceType() {
        return ((android.app.Service) real).getForegroundServiceType();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.app.Service) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.app.Service) real).onConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onCreate() {
        ((android.app.Service) real).onCreate();
    }

    public void onDestroy() {
        ((android.app.Service) real).onDestroy();
    }

    public void onLowMemory() {
        ((android.app.Service) real).onLowMemory();
    }

    public void onRebind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.app.Service) real).onRebind(arg0 == null ? null : arg0.getReal());
    }

    public void onStart(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        ((android.app.Service) real).onStart(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int onStartCommand(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, int arg2) {
        return ((android.app.Service) real).onStartCommand(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onTaskRemoved(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        ((android.app.Service) real).onTaskRemoved(arg0 == null ? null : arg0.getReal());
    }

    public void onTimeout(int arg0) {
        ((android.app.Service) real).onTimeout(arg0);
    }

    public void onTimeout(int arg0, int arg1) {
        ((android.app.Service) real).onTimeout(arg0, arg1);
    }

    public void onTrimMemory(int arg0) {
        ((android.app.Service) real).onTrimMemory(arg0);
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return ((android.app.Service) real).onUnbind(arg0 == null ? null : arg0.getReal());
    }

    public void startForeground(int arg0, com.micklab.dcg.wrapper.android.app.Notification arg1) {
        ((android.app.Service) real).startForeground(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void startForeground(int arg0, com.micklab.dcg.wrapper.android.app.Notification arg1, int arg2) {
        ((android.app.Service) real).startForeground(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void stopForeground(int arg0) {
        ((android.app.Service) real).stopForeground(arg0);
    }

    public void stopForeground(boolean arg0) {
        ((android.app.Service) real).stopForeground(arg0);
    }

    public void stopSelf() {
        ((android.app.Service) real).stopSelf();
    }

    public void stopSelf(int arg0) {
        ((android.app.Service) real).stopSelf(arg0);
    }

    public boolean stopSelfResult(int arg0) {
        return ((android.app.Service) real).stopSelfResult(arg0);
    }

    public static final int START_CONTINUATION_MASK = android.app.Service.START_CONTINUATION_MASK;
    public static final int START_FLAG_REDELIVERY = android.app.Service.START_FLAG_REDELIVERY;
    public static final int START_FLAG_RETRY = android.app.Service.START_FLAG_RETRY;
    public static final int START_NOT_STICKY = android.app.Service.START_NOT_STICKY;
    public static final int START_REDELIVER_INTENT = android.app.Service.START_REDELIVER_INTENT;
    public static final int START_STICKY = android.app.Service.START_STICKY;
    public static final int START_STICKY_COMPATIBILITY = android.app.Service.START_STICKY_COMPATIBILITY;
    public static final int STOP_FOREGROUND_DETACH = android.app.Service.STOP_FOREGROUND_DETACH;
    public static final int STOP_FOREGROUND_LEGACY = android.app.Service.STOP_FOREGROUND_LEGACY;
    public static final int STOP_FOREGROUND_REMOVE = android.app.Service.STOP_FOREGROUND_REMOVE;

}
