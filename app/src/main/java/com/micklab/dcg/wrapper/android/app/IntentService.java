// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class IntentService {
    private final android.app.IntentService real;

    public IntentService(android.app.IntentService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.IntentService wrap(android.app.IntentService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.IntentService(real);
    }

    public android.app.IntentService unwrap() {
        return real;
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

    public void onStart(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        real.onStart(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public int onStartCommand(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, int arg2) {
        return real.onStartCommand(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void setIntentRedelivery(boolean arg0) {
        real.setIntentRedelivery(arg0);
    }

}
