// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PreferenceManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceManager wrap(android.preference.PreferenceManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceManager(real, (__DcgwBridgeToken) null);
    }

    public android.preference.PreferenceManager getReal() {
        return (android.preference.PreferenceManager) real;
    }

    public android.preference.PreferenceManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceScreen createPreferenceScreen(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.preference.PreferenceScreen.wrap(((android.preference.PreferenceManager) real).createPreferenceScreen(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.preference.Preference findPreference(java.lang.CharSequence arg0) {
        return com.micklab.dcg.wrapper.android.preference.Preference.wrap(((android.preference.PreferenceManager) real).findPreference(arg0));
    }

    public static com.micklab.dcg.wrapper.android.content.SharedPreferences getDefaultSharedPreferences(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.wrap(android.preference.PreferenceManager.getDefaultSharedPreferences(arg0 == null ? null : arg0.getReal()));
    }

    public static java.lang.String getDefaultSharedPreferencesName(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return android.preference.PreferenceManager.getDefaultSharedPreferencesName(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.preference.PreferenceDataStore getPreferenceDataStore() {
        return com.micklab.dcg.wrapper.android.preference.PreferenceDataStore.wrap(((android.preference.PreferenceManager) real).getPreferenceDataStore());
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences getSharedPreferences() {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.wrap(((android.preference.PreferenceManager) real).getSharedPreferences());
    }

    public int getSharedPreferencesMode() {
        return ((android.preference.PreferenceManager) real).getSharedPreferencesMode();
    }

    public java.lang.String getSharedPreferencesName() {
        return ((android.preference.PreferenceManager) real).getSharedPreferencesName();
    }

    public boolean isStorageDefault() {
        return ((android.preference.PreferenceManager) real).isStorageDefault();
    }

    public boolean isStorageDeviceProtected() {
        return ((android.preference.PreferenceManager) real).isStorageDeviceProtected();
    }

    public static void setDefaultValues(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, boolean arg2) {
        android.preference.PreferenceManager.setDefaultValues(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public static void setDefaultValues(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, int arg2, int arg3, boolean arg4) {
        android.preference.PreferenceManager.setDefaultValues(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4);
    }

    public void setPreferenceDataStore(com.micklab.dcg.wrapper.android.preference.PreferenceDataStore arg0) {
        ((android.preference.PreferenceManager) real).setPreferenceDataStore(arg0 == null ? null : arg0.getReal());
    }

    public void setSharedPreferencesMode(int arg0) {
        ((android.preference.PreferenceManager) real).setSharedPreferencesMode(arg0);
    }

    public void setSharedPreferencesName(java.lang.String arg0) {
        ((android.preference.PreferenceManager) real).setSharedPreferencesName(arg0);
    }

    public void setStorageDefault() {
        ((android.preference.PreferenceManager) real).setStorageDefault();
    }

    public void setStorageDeviceProtected() {
        ((android.preference.PreferenceManager) real).setStorageDeviceProtected();
    }

    public static final java.lang.String KEY_HAS_SET_DEFAULT_VALUES = android.preference.PreferenceManager.KEY_HAS_SET_DEFAULT_VALUES;
    public static final java.lang.String METADATA_KEY_PREFERENCES = android.preference.PreferenceManager.METADATA_KEY_PREFERENCES;

    public static final class OnActivityDestroyListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnActivityDestroyListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.PreferenceManager.OnActivityDestroyListener wrap(android.preference.PreferenceManager.OnActivityDestroyListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceManager.OnActivityDestroyListener(real, (__DcgwBridgeToken) null);
        }

        public android.preference.PreferenceManager.OnActivityDestroyListener getReal() {
            return (android.preference.PreferenceManager.OnActivityDestroyListener) real;
        }

        public android.preference.PreferenceManager.OnActivityDestroyListener unwrap() {
            return getReal();
        }

        public void onActivityDestroy() {
            ((android.preference.PreferenceManager.OnActivityDestroyListener) real).onActivityDestroy();
        }

    }
    public static final class OnActivityResultListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnActivityResultListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.PreferenceManager.OnActivityResultListener wrap(android.preference.PreferenceManager.OnActivityResultListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceManager.OnActivityResultListener(real, (__DcgwBridgeToken) null);
        }

        public android.preference.PreferenceManager.OnActivityResultListener getReal() {
            return (android.preference.PreferenceManager.OnActivityResultListener) real;
        }

        public android.preference.PreferenceManager.OnActivityResultListener unwrap() {
            return getReal();
        }

        public boolean onActivityResult(int arg0, int arg1, com.micklab.dcg.wrapper.android.content.Intent arg2) {
            return ((android.preference.PreferenceManager.OnActivityResultListener) real).onActivityResult(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

    }
    public static final class OnActivityStopListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnActivityStopListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.preference.PreferenceManager.OnActivityStopListener wrap(android.preference.PreferenceManager.OnActivityStopListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceManager.OnActivityStopListener(real, (__DcgwBridgeToken) null);
        }

        public android.preference.PreferenceManager.OnActivityStopListener getReal() {
            return (android.preference.PreferenceManager.OnActivityStopListener) real;
        }

        public android.preference.PreferenceManager.OnActivityStopListener unwrap() {
            return getReal();
        }

        public void onActivityStop() {
            ((android.preference.PreferenceManager.OnActivityStopListener) real).onActivityStop();
        }

    }
}
