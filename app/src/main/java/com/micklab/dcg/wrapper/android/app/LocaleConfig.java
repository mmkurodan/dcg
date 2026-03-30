// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class LocaleConfig {
    private final android.app.LocaleConfig real;

    public LocaleConfig(android.app.LocaleConfig real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.LocaleConfig wrap(android.app.LocaleConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.LocaleConfig(real);
    }

    public android.app.LocaleConfig unwrap() {
        return real;
    }

    public LocaleConfig(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.app.LocaleConfig(arg0 == null ? null : arg0.unwrap()));
    }

    public LocaleConfig(com.micklab.dcg.wrapper.android.os.LocaleList arg0) {
        this(new android.app.LocaleConfig(arg0 == null ? null : arg0.unwrap()));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public static com.micklab.dcg.wrapper.android.app.LocaleConfig fromContextIgnoringOverride(com.micklab.dcg.wrapper.android.content.Context arg0) {
        return com.micklab.dcg.wrapper.android.app.LocaleConfig.wrap(android.app.LocaleConfig.fromContextIgnoringOverride(arg0 == null ? null : arg0.unwrap()));
    }

    public java.util.Locale getDefaultLocale() {
        return real.getDefaultLocale();
    }

    public int getStatus() {
        return real.getStatus();
    }

    public com.micklab.dcg.wrapper.android.os.LocaleList getSupportedLocales() {
        return com.micklab.dcg.wrapper.android.os.LocaleList.wrap(real.getSupportedLocales());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int STATUS_NOT_SPECIFIED = android.app.LocaleConfig.STATUS_NOT_SPECIFIED;
    public static final int STATUS_PARSING_FAILED = android.app.LocaleConfig.STATUS_PARSING_FAILED;
    public static final int STATUS_SUCCESS = android.app.LocaleConfig.STATUS_SUCCESS;
    public static final java.lang.String TAG_LOCALE = android.app.LocaleConfig.TAG_LOCALE;
    public static final java.lang.String TAG_LOCALE_CONFIG = android.app.LocaleConfig.TAG_LOCALE_CONFIG;

}
