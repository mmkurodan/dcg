// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class CurrencyPluralInfo {
    private final android.icu.text.CurrencyPluralInfo real;

    public CurrencyPluralInfo(android.icu.text.CurrencyPluralInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo wrap(android.icu.text.CurrencyPluralInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo(real);
    }

    public android.icu.text.CurrencyPluralInfo unwrap() {
        return real;
    }

    public CurrencyPluralInfo() {
        this(new android.icu.text.CurrencyPluralInfo());
    }

    public CurrencyPluralInfo(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.text.CurrencyPluralInfo(arg0 == null ? null : arg0.unwrap()));
    }

    public CurrencyPluralInfo(java.util.Locale arg0) {
        this(new android.icu.text.CurrencyPluralInfo(arg0));
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getCurrencyPluralPattern(java.lang.String arg0) {
        return real.getCurrencyPluralPattern(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo.wrap(android.icu.text.CurrencyPluralInfo.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo.wrap(android.icu.text.CurrencyPluralInfo.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo.wrap(android.icu.text.CurrencyPluralInfo.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getLocale() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(real.getLocale());
    }

    public com.micklab.dcg.wrapper.android.icu.text.PluralRules getPluralRules() {
        return com.micklab.dcg.wrapper.android.icu.text.PluralRules.wrap(real.getPluralRules());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void setCurrencyPluralPattern(java.lang.String arg0, java.lang.String arg1) {
        real.setCurrencyPluralPattern(arg0, arg1);
    }

    public void setLocale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        real.setLocale(arg0 == null ? null : arg0.unwrap());
    }

    public void setPluralRules(java.lang.String arg0) {
        real.setPluralRules(arg0);
    }

}
