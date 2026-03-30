// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.location;

public final class SettingInjectorService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SettingInjectorService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.location.SettingInjectorService wrap(android.location.SettingInjectorService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.location.SettingInjectorService(real, (__DcgwBridgeToken) null);
    }

    public android.location.SettingInjectorService getReal() {
        return (android.location.SettingInjectorService) real;
    }

    public android.location.SettingInjectorService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.location.SettingInjectorService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onStart(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1) {
        ((android.location.SettingInjectorService) real).onStart(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public int onStartCommand(com.micklab.dcg.wrapper.android.content.Intent arg0, int arg1, int arg2) {
        return ((android.location.SettingInjectorService) real).onStartCommand(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public static void refreshSettings(com.micklab.dcg.wrapper.android.content.Context arg0) {
        android.location.SettingInjectorService.refreshSettings(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String ACTION_INJECTED_SETTING_CHANGED = android.location.SettingInjectorService.ACTION_INJECTED_SETTING_CHANGED;
    public static final java.lang.String ACTION_SERVICE_INTENT = android.location.SettingInjectorService.ACTION_SERVICE_INTENT;
    public static final java.lang.String ATTRIBUTES_NAME = android.location.SettingInjectorService.ATTRIBUTES_NAME;
    public static final java.lang.String META_DATA_NAME = android.location.SettingInjectorService.META_DATA_NAME;

}
