// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceManager {
    private final android.preference.PreferenceManager real;

    public PreferenceManager(android.preference.PreferenceManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceManager wrap(android.preference.PreferenceManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceManager(real);
    }

    public android.preference.PreferenceManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceScreen createPreferenceScreen(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.preference.PreferenceScreen.wrap(real.createPreferenceScreen(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.preference.Preference findPreference(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.preference.Preference.wrap(real.findPreference(arg0));
    }

    public static com.micklab.dcg.wrapper.android.content.SharedPreferences getDefaultSharedPreferences(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.wrap(android.preference.PreferenceManager.getDefaultSharedPreferences(arg0 == null ? null : arg0.unwrap()));
    }

    public static java.lang.String getDefaultSharedPreferencesName(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.preference.PreferenceManager.getDefaultSharedPreferencesName(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceDataStore getPreferenceDataStore() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceDataStore.wrap(real.getPreferenceDataStore());
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences getSharedPreferences() {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.wrap(real.getSharedPreferences());
    }

    public int getSharedPreferencesMode() {
        return real.getSharedPreferencesMode();
    }

    public java.lang.String getSharedPreferencesName() {
        return real.getSharedPreferencesName();
    }

    public boolean isStorageDefault() {
        return real.isStorageDefault();
    }

    public boolean isStorageDeviceProtected() {
        return real.isStorageDeviceProtected();
    }

    public static void setDefaultValues(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, boolean arg2) {
        android.preference.PreferenceManager.setDefaultValues(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public static void setDefaultValues(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, int arg2, int arg3, boolean arg4) {
        android.preference.PreferenceManager.setDefaultValues(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public void setPreferenceDataStore(com.micklab.dcg.wrapper.android.preference.PreferenceDataStore arg0) {
        real.setPreferenceDataStore(arg0 == null ? null : arg0.unwrap());
    }

    public void setSharedPreferencesMode(int arg0) {
        real.setSharedPreferencesMode(arg0);
    }

    public void setSharedPreferencesName(java.lang.String arg0) {
        real.setSharedPreferencesName(arg0);
    }

    public void setStorageDefault() {
        real.setStorageDefault();
    }

    public void setStorageDeviceProtected() {
        real.setStorageDeviceProtected();
    }

    public static final java.lang.String KEY_HAS_SET_DEFAULT_VALUES = android.preference.PreferenceManager.KEY_HAS_SET_DEFAULT_VALUES;
    public static final java.lang.String METADATA_KEY_PREFERENCES = android.preference.PreferenceManager.METADATA_KEY_PREFERENCES;

    public static final class OnActivityDestroyListener {
        private final android.preference.PreferenceManager.OnActivityDestroyListener real;

        public OnActivityDestroyListener(android.preference.PreferenceManager.OnActivityDestroyListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.PreferenceManager.OnActivityDestroyListener wrap(android.preference.PreferenceManager.OnActivityDestroyListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceManager.OnActivityDestroyListener(real);
        }

        public android.preference.PreferenceManager.OnActivityDestroyListener unwrap() {
            return real;
        }

        public void onActivityDestroy() {
            real.onActivityDestroy();
        }

    }
    public static final class OnActivityResultListener {
        private final android.preference.PreferenceManager.OnActivityResultListener real;

        public OnActivityResultListener(android.preference.PreferenceManager.OnActivityResultListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.PreferenceManager.OnActivityResultListener wrap(android.preference.PreferenceManager.OnActivityResultListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceManager.OnActivityResultListener(real);
        }

        public android.preference.PreferenceManager.OnActivityResultListener unwrap() {
            return real;
        }

        public boolean onActivityResult(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
            return real.onActivityResult(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

    }
    public static final class OnActivityStopListener {
        private final android.preference.PreferenceManager.OnActivityStopListener real;

        public OnActivityStopListener(android.preference.PreferenceManager.OnActivityStopListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.PreferenceManager.OnActivityStopListener wrap(android.preference.PreferenceManager.OnActivityStopListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceManager.OnActivityStopListener(real);
        }

        public android.preference.PreferenceManager.OnActivityStopListener unwrap() {
            return real;
        }

        public void onActivityStop() {
            real.onActivityStop();
        }

    }
}
