// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.settings.preferences;

public final class SettingsPreferenceServiceClient {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SettingsPreferenceServiceClient(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceServiceClient wrap(android.service.settings.preferences.SettingsPreferenceServiceClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceServiceClient(real, (__DcgwBridgeToken) null);
    }

    public android.service.settings.preferences.SettingsPreferenceServiceClient getReal() {
        return (android.service.settings.preferences.SettingsPreferenceServiceClient) real;
    }

    public android.service.settings.preferences.SettingsPreferenceServiceClient unwrap() {
        return getReal();
    }

    public SettingsPreferenceServiceClient(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.os.OutcomeReceiver arg3) {
        this(new android.service.settings.preferences.SettingsPreferenceServiceClient(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public void close() {
        ((android.service.settings.preferences.SettingsPreferenceServiceClient) real).close();
    }

}
