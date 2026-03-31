// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.settings.preferences;

public final class SettingsPreferenceService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SettingsPreferenceService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceService wrap(android.service.settings.preferences.SettingsPreferenceService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceService(real, (__DcgwBridgeToken) null);
    }

    public android.service.settings.preferences.SettingsPreferenceService getReal() {
        return (android.service.settings.preferences.SettingsPreferenceService) real;
    }

    public android.service.settings.preferences.SettingsPreferenceService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.settings.preferences.SettingsPreferenceService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public static final java.lang.String ACTION_PREFERENCE_SERVICE = android.service.settings.preferences.SettingsPreferenceService.ACTION_PREFERENCE_SERVICE;

}
