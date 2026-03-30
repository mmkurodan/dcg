// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.content;

public final class SharedPreferences {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SharedPreferences(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.content.SharedPreferences wrap(android.content.SharedPreferences real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.content.SharedPreferences(real, (__DcgwBridgeToken) null);
    }

    public android.content.SharedPreferences getReal() {
        return (android.content.SharedPreferences) real;
    }

    public android.content.SharedPreferences unwrap() {
        return getReal();
    }

    public boolean contains(java.lang.String arg0) {
        return ((android.content.SharedPreferences) real).contains(arg0);
    }

    public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor edit() {
        return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(((android.content.SharedPreferences) real).edit());
    }

    public boolean getBoolean(java.lang.String arg0, boolean arg1) {
        return ((android.content.SharedPreferences) real).getBoolean(arg0, arg1);
    }

    public float getFloat(java.lang.String arg0, float arg1) {
        return ((android.content.SharedPreferences) real).getFloat(arg0, arg1);
    }

    public int getInt(java.lang.String arg0, int arg1) {
        return ((android.content.SharedPreferences) real).getInt(arg0, arg1);
    }

    public long getLong(java.lang.String arg0, long arg1) {
        return ((android.content.SharedPreferences) real).getLong(arg0, arg1);
    }

    public java.lang.String getString(java.lang.String arg0, java.lang.String arg1) {
        return ((android.content.SharedPreferences) real).getString(arg0, arg1);
    }

    public void registerOnSharedPreferenceChangeListener(com.micklab.dcg.wrapper.android.content.SharedPreferences.OnSharedPreferenceChangeListener arg0) {
        ((android.content.SharedPreferences) real).registerOnSharedPreferenceChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void unregisterOnSharedPreferenceChangeListener(com.micklab.dcg.wrapper.android.content.SharedPreferences.OnSharedPreferenceChangeListener arg0) {
        ((android.content.SharedPreferences) real).unregisterOnSharedPreferenceChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public static final class Editor {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Editor(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor wrap(android.content.SharedPreferences.Editor real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor(real, (__DcgwBridgeToken) null);
        }

        public android.content.SharedPreferences.Editor getReal() {
            return (android.content.SharedPreferences.Editor) real;
        }

        public android.content.SharedPreferences.Editor unwrap() {
            return getReal();
        }

        public void apply() {
            ((android.content.SharedPreferences.Editor) real).apply();
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor clear() {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(((android.content.SharedPreferences.Editor) real).clear());
        }

        public boolean commit() {
            return ((android.content.SharedPreferences.Editor) real).commit();
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor putBoolean(java.lang.String arg0, boolean arg1) {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(((android.content.SharedPreferences.Editor) real).putBoolean(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor putFloat(java.lang.String arg0, float arg1) {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(((android.content.SharedPreferences.Editor) real).putFloat(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor putInt(java.lang.String arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(((android.content.SharedPreferences.Editor) real).putInt(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor putLong(java.lang.String arg0, long arg1) {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(((android.content.SharedPreferences.Editor) real).putLong(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor putString(java.lang.String arg0, java.lang.String arg1) {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(((android.content.SharedPreferences.Editor) real).putString(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor remove(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.content.SharedPreferences.Editor.wrap(((android.content.SharedPreferences.Editor) real).remove(arg0));
        }

    }
    public static final class OnSharedPreferenceChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnSharedPreferenceChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.content.SharedPreferences.OnSharedPreferenceChangeListener wrap(android.content.SharedPreferences.OnSharedPreferenceChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.content.SharedPreferences.OnSharedPreferenceChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.content.SharedPreferences.OnSharedPreferenceChangeListener getReal() {
            return (android.content.SharedPreferences.OnSharedPreferenceChangeListener) real;
        }

        public android.content.SharedPreferences.OnSharedPreferenceChangeListener unwrap() {
            return getReal();
        }

        public void onSharedPreferenceChanged(com.micklab.dcg.wrapper.android.content.SharedPreferences arg0, java.lang.String arg1) {
            ((android.content.SharedPreferences.OnSharedPreferenceChangeListener) real).onSharedPreferenceChanged(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
}
