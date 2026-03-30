// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class IntentService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IntentService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.IntentService wrap(android.app.IntentService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.IntentService(real, (__DcgwBridgeToken) null);
    }

    public android.app.IntentService getReal() {
        return (android.app.IntentService) real;
    }

    public android.app.IntentService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.app.IntentService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onCreate() {
        ((android.app.IntentService) real).onCreate();
    }

    public void onDestroy() {
        ((android.app.IntentService) real).onDestroy();
    }

    public void onStart(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        ((android.app.IntentService) real).onStart(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int onStartCommand(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, int arg2) {
        return ((android.app.IntentService) real).onStartCommand(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void setIntentRedelivery(boolean arg0) {
        ((android.app.IntentService) real).setIntentRedelivery(arg0);
    }

}
