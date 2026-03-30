// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SharedPreferences {
    private final android.content.SharedPreferences real;

    public SharedPreferences(android.content.SharedPreferences real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SharedPreferences wrap(android.content.SharedPreferences real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SharedPreferences(real);
    }

    public android.content.SharedPreferences unwrap() {
        return real;
    }

    public boolean contains(java.lang.String arg0) {
        return real.contains(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor edit() {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(real.edit());
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

    public void registerOnSharedPreferenceChangeListener(com.micklab.dcg.wrapper.android.content.SharedPreferences.OnSharedPreferenceChangeListener arg0) {
        real.registerOnSharedPreferenceChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void unregisterOnSharedPreferenceChangeListener(com.micklab.dcg.wrapper.android.content.SharedPreferences.OnSharedPreferenceChangeListener arg0) {
        real.unregisterOnSharedPreferenceChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final class Editor {
        private final android.content.SharedPreferences.Editor real;

        public Editor(android.content.SharedPreferences.Editor real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor wrap(android.content.SharedPreferences.Editor real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor(real);
        }

        public android.content.SharedPreferences.Editor unwrap() {
            return real;
        }

        public void apply() {
            real.apply();
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor clear() {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(real.clear());
        }

        public boolean commit() {
            return real.commit();
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor putBoolean(java.lang.String arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(real.putBoolean(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor putFloat(java.lang.String arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(real.putFloat(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor putInt(java.lang.String arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(real.putInt(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor putLong(java.lang.String arg0, long arg1) {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(real.putLong(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor putString(java.lang.String arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(real.putString(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor remove(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(real.remove(arg0));
        }

    }
    public static final class OnSharedPreferenceChangeListener {
        private final android.content.SharedPreferences.OnSharedPreferenceChangeListener real;

        public OnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.SharedPreferences.OnSharedPreferenceChangeListener wrap(android.content.SharedPreferences.OnSharedPreferenceChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.SharedPreferences.OnSharedPreferenceChangeListener(real);
        }

        public android.content.SharedPreferences.OnSharedPreferenceChangeListener unwrap() {
            return real;
        }

        public void onSharedPreferenceChanged(com.micklab.dcg.wrapper.android.content.SharedPreferences arg0, java.lang.String arg1) {
            real.onSharedPreferenceChanged(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
}
