// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class SettingInjectorService {
    private final android.location.SettingInjectorService real;

    public SettingInjectorService(android.location.SettingInjectorService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.SettingInjectorService wrap(android.location.SettingInjectorService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.SettingInjectorService(real);
    }

    public android.location.SettingInjectorService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onStart(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        real.onStart(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public int onStartCommand(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, int arg2) {
        return real.onStartCommand(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public static void refreshSettings(com.micklab.dcg.wrapper.android.content.Context arg0) {
        android.location.SettingInjectorService.refreshSettings(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String ACTION_INJECTED_SETTING_CHANGED = android.location.SettingInjectorService.ACTION_INJECTED_SETTING_CHANGED;
    public static final java.lang.String ACTION_SERVICE_INTENT = android.location.SettingInjectorService.ACTION_SERVICE_INTENT;
    public static final java.lang.String ATTRIBUTES_NAME = android.location.SettingInjectorService.ATTRIBUTES_NAME;
    public static final java.lang.String META_DATA_NAME = android.location.SettingInjectorService.META_DATA_NAME;

}
