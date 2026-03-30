// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class Service {
    private final android.app.Service real;

    public Service(android.app.Service real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.Service wrap(android.app.Service real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.Service(real);
    }

    public android.app.Service unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.app.Application getApplication() {
        return com.micklab.dcg.wrapper.android.app.Application.wrap(real.getApplication());
    }

    public int getForegroundServiceType() {
        return real.getForegroundServiceType();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.onConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onCreate() {
        real.onCreate();
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public void onLowMemory() {
        real.onLowMemory();
    }

    public void onRebind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.onRebind(arg0 == null ? null : arg0.unwrap());
    }

    public void onStart(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        real.onStart(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public int onStartCommand(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, int arg2) {
        return real.onStartCommand(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void onTaskRemoved(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        real.onTaskRemoved(arg0 == null ? null : arg0.unwrap());
    }

    public void onTimeout(int arg0) {
        real.onTimeout(arg0);
    }

    public void onTimeout(int arg0, int arg1) {
        real.onTimeout(arg0, arg1);
    }

    public void onTrimMemory(int arg0) {
        real.onTrimMemory(arg0);
    }

    public boolean onUnbind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return real.onUnbind(arg0 == null ? null : arg0.unwrap());
    }

    public void startForeground(int arg0, com.micklab.dcg.wrapper.android.app.Notification arg1) {
        real.startForeground(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void startForeground(int arg0, com.micklab.dcg.wrapper.android.app.Notification arg1, int arg2) {
        real.startForeground(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void stopForeground(int arg0) {
        real.stopForeground(arg0);
    }

    public void stopForeground(boolean arg0) {
        real.stopForeground(arg0);
    }

    public void stopSelf() {
        real.stopSelf();
    }

    public void stopSelf(int arg0) {
        real.stopSelf(arg0);
    }

    public boolean stopSelfResult(int arg0) {
        return real.stopSelfResult(arg0);
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
