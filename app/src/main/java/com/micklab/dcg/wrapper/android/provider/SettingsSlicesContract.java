// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.provider;

public final class SettingsSlicesContract {
    private final android.provider.SettingsSlicesContract real;

    public SettingsSlicesContract(android.provider.SettingsSlicesContract real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.provider.SettingsSlicesContract wrap(android.provider.SettingsSlicesContract real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.provider.SettingsSlicesContract(real);
    }

    public android.provider.SettingsSlicesContract unwrap() {
        return real;
    }

    public static final java.lang.String AUTHORITY = android.provider.SettingsSlicesContract.AUTHORITY;
    public static final com.micklab.dcg.wrapper.android.net.Uri BASE_URI = com.micklab.dcg.wrapper.android.net.Uri.wrap(android.provider.SettingsSlicesContract.BASE_URI);
    public static final java.lang.String KEY_AIRPLANE_MODE = android.provider.SettingsSlicesContract.KEY_AIRPLANE_MODE;
    public static final java.lang.String KEY_BATTERY_SAVER = android.provider.SettingsSlicesContract.KEY_BATTERY_SAVER;
    public static final java.lang.String KEY_BLUETOOTH = android.provider.SettingsSlicesContract.KEY_BLUETOOTH;
    public static final java.lang.String KEY_LOCATION = android.provider.SettingsSlicesContract.KEY_LOCATION;
    public static final java.lang.String KEY_WIFI = android.provider.SettingsSlicesContract.KEY_WIFI;
    public static final java.lang.String PATH_SETTING_ACTION = android.provider.SettingsSlicesContract.PATH_SETTING_ACTION;
    public static final java.lang.String PATH_SETTING_INTENT = android.provider.SettingsSlicesContract.PATH_SETTING_INTENT;

}
