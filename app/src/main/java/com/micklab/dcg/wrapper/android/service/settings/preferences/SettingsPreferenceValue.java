// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.settings.preferences;

public final class SettingsPreferenceValue {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SettingsPreferenceValue(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue wrap(android.service.settings.preferences.SettingsPreferenceValue real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue(real, (__DcgwBridgeToken) null);
    }

    public android.service.settings.preferences.SettingsPreferenceValue getReal() {
        return (android.service.settings.preferences.SettingsPreferenceValue) real;
    }

    public android.service.settings.preferences.SettingsPreferenceValue unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.service.settings.preferences.SettingsPreferenceValue) real).describeContents();
    }

    public boolean getBooleanValue() {
        return ((android.service.settings.preferences.SettingsPreferenceValue) real).getBooleanValue();
    }

    public double getDoubleValue() {
        return ((android.service.settings.preferences.SettingsPreferenceValue) real).getDoubleValue();
    }

    public int getIntValue() {
        return ((android.service.settings.preferences.SettingsPreferenceValue) real).getIntValue();
    }

    public long getLongValue() {
        return ((android.service.settings.preferences.SettingsPreferenceValue) real).getLongValue();
    }

    public java.lang.String getStringValue() {
        return ((android.service.settings.preferences.SettingsPreferenceValue) real).getStringValue();
    }

    public int getType() {
        return ((android.service.settings.preferences.SettingsPreferenceValue) real).getType();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.service.settings.preferences.SettingsPreferenceValue) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TYPE_BOOLEAN = android.service.settings.preferences.SettingsPreferenceValue.TYPE_BOOLEAN;
    public static final int TYPE_DOUBLE = android.service.settings.preferences.SettingsPreferenceValue.TYPE_DOUBLE;
    public static final int TYPE_INT = android.service.settings.preferences.SettingsPreferenceValue.TYPE_INT;
    public static final int TYPE_LONG = android.service.settings.preferences.SettingsPreferenceValue.TYPE_LONG;
    public static final int TYPE_STRING = android.service.settings.preferences.SettingsPreferenceValue.TYPE_STRING;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.Builder wrap(android.service.settings.preferences.SettingsPreferenceValue.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.service.settings.preferences.SettingsPreferenceValue.Builder getReal() {
            return (android.service.settings.preferences.SettingsPreferenceValue.Builder) real;
        }

        public android.service.settings.preferences.SettingsPreferenceValue.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.service.settings.preferences.SettingsPreferenceValue.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue build() {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.wrap(((android.service.settings.preferences.SettingsPreferenceValue.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.Builder setBooleanValue(boolean arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceValue.Builder) real).setBooleanValue(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.Builder setDoubleValue(double arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceValue.Builder) real).setDoubleValue(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.Builder setIntValue(int arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceValue.Builder) real).setIntValue(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.Builder setLongValue(long arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceValue.Builder) real).setLongValue(arg0));
        }

        public com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.Builder setStringValue(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.service.settings.preferences.SettingsPreferenceValue.Builder.wrap(((android.service.settings.preferences.SettingsPreferenceValue.Builder) real).setStringValue(arg0));
        }

    }
}
