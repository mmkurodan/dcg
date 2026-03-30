// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceDataStore {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PreferenceDataStore(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceDataStore wrap(android.preference.PreferenceDataStore real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceDataStore(real, (__DcgwBridgeToken) null);
    }

    public android.preference.PreferenceDataStore getReal() {
        return (android.preference.PreferenceDataStore) real;
    }

    public android.preference.PreferenceDataStore unwrap() {
        return getReal();
    }

    public boolean getBoolean(java.lang.String arg0, boolean arg1) {
        return ((android.preference.PreferenceDataStore) real).getBoolean(arg0, arg1);
    }

    public float getFloat(java.lang.String arg0, float arg1) {
        return ((android.preference.PreferenceDataStore) real).getFloat(arg0, arg1);
    }

    public int getInt(java.lang.String arg0, int arg1) {
        return ((android.preference.PreferenceDataStore) real).getInt(arg0, arg1);
    }

    public long getLong(java.lang.String arg0, long arg1) {
        return ((android.preference.PreferenceDataStore) real).getLong(arg0, arg1);
    }

    public java.lang.String getString(java.lang.String arg0, java.lang.String arg1) {
        return ((android.preference.PreferenceDataStore) real).getString(arg0, arg1);
    }

    public void putBoolean(java.lang.String arg0, boolean arg1) {
        ((android.preference.PreferenceDataStore) real).putBoolean(arg0, arg1);
    }

    public void putFloat(java.lang.String arg0, float arg1) {
        ((android.preference.PreferenceDataStore) real).putFloat(arg0, arg1);
    }

    public void putInt(java.lang.String arg0, int arg1) {
        ((android.preference.PreferenceDataStore) real).putInt(arg0, arg1);
    }

    public void putLong(java.lang.String arg0, long arg1) {
        ((android.preference.PreferenceDataStore) real).putLong(arg0, arg1);
    }

    public void putString(java.lang.String arg0, java.lang.String arg1) {
        ((android.preference.PreferenceDataStore) real).putString(arg0, arg1);
    }

}
