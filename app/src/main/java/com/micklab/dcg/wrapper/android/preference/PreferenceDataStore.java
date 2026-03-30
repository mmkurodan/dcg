// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.preference;

public final class PreferenceDataStore {
    private final android.preference.PreferenceDataStore real;

    public PreferenceDataStore(android.preference.PreferenceDataStore real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.preference.PreferenceDataStore wrap(android.preference.PreferenceDataStore real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.preference.PreferenceDataStore(real);
    }

    public android.preference.PreferenceDataStore unwrap() {
        return real;
    }

    public boolean getBoolean(java.lang.String arg0, boolean arg1) {
        return real.getBoolean(arg0, arg1);
    }

    public float getFloat(java.lang.String arg0, float arg1) {
        return real.getFloat(arg0, arg1);
    }

    public int getInt(java.lang.String arg0, int arg1) {
        return real.getInt(arg0, arg1);
    }

    public long getLong(java.lang.String arg0, long arg1) {
        return real.getLong(arg0, arg1);
    }

    public java.lang.String getString(java.lang.String arg0, java.lang.String arg1) {
        return real.getString(arg0, arg1);
    }

    public void putBoolean(java.lang.String arg0, boolean arg1) {
        real.putBoolean(arg0, arg1);
    }

    public void putFloat(java.lang.String arg0, float arg1) {
        real.putFloat(arg0, arg1);
    }

    public void putInt(java.lang.String arg0, int arg1) {
        real.putInt(arg0, arg1);
    }

    public void putLong(java.lang.String arg0, long arg1) {
        real.putLong(arg0, arg1);
    }

    public void putString(java.lang.String arg0, java.lang.String arg1) {
        real.putString(arg0, arg1);
    }

}
