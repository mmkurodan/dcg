// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class LocaleManager {
    private final android.app.LocaleManager real;

    public LocaleManager(android.app.LocaleManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.LocaleManager wrap(android.app.LocaleManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.LocaleManager(real);
    }

    public android.app.LocaleManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getApplicationLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getApplicationLocales());
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getApplicationLocales(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getApplicationLocales(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.LocaleConfig getOverrideLocaleConfig() {
        return com.micklab.dcg.wrapper.android.app.LocaleConfig.wrap(real.getOverrideLocaleConfig());
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getSystemLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getSystemLocales());
    }

    public void setApplicationLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        real.setApplicationLocales(arg0 == null ? null : arg0.unwrap());
    }

    public void setOverrideLocaleConfig(com.micklab.dcg.wrapper.android.app.LocaleConfig arg0) {
        real.setOverrideLocaleConfig(arg0 == null ? null : arg0.unwrap());
    }

}
