// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class LocaleManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LocaleManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.LocaleManager wrap(android.app.LocaleManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.LocaleManager(real, (__DcgwBridgeToken) null);
    }

    public android.app.LocaleManager getReal() {
        return (android.app.LocaleManager) real;
    }

    public android.app.LocaleManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getApplicationLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.app.LocaleManager) real).getApplicationLocales());
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getApplicationLocales(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.app.LocaleManager) real).getApplicationLocales(arg0));
    }

    public com.micklab.dcg.wrapper.android.app.LocaleConfig getOverrideLocaleConfig() {
        return com.micklab.dcg.wrapper.android.app.LocaleConfig.wrap(((android.app.LocaleManager) real).getOverrideLocaleConfig());
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getSystemLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(((android.app.LocaleManager) real).getSystemLocales());
    }

    public void setApplicationLocales(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        ((android.app.LocaleManager) real).setApplicationLocales(arg0 == null ? null : arg0.getReal());
    }

    public void setOverrideLocaleConfig(com.micklab.dcg.wrapper.android.app.LocaleConfig arg0) {
        ((android.app.LocaleManager) real).setOverrideLocaleConfig(arg0 == null ? null : arg0.getReal());
    }

}
