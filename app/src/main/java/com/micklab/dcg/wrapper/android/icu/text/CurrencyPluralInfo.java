// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class CurrencyPluralInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CurrencyPluralInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo wrap(android.icu.text.CurrencyPluralInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.CurrencyPluralInfo getReal() {
        return (android.icu.text.CurrencyPluralInfo) real;
    }

    public android.icu.text.CurrencyPluralInfo unwrap() {
        return getReal();
    }

    public CurrencyPluralInfo() {
        this(new android.icu.text.CurrencyPluralInfo(), (__DcgwBridgeToken) null);
    }

    public CurrencyPluralInfo(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.text.CurrencyPluralInfo(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public CurrencyPluralInfo(java.util.Locale arg0) {
        this(new android.icu.text.CurrencyPluralInfo(arg0), (__DcgwBridgeToken) null);
    }

    public java.lang.Object clone() {
        return ((android.icu.text.CurrencyPluralInfo) real).clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.CurrencyPluralInfo) real).equals(arg0);
    }

    public java.lang.String getCurrencyPluralPattern(java.lang.String arg0) {
        return ((android.icu.text.CurrencyPluralInfo) real).getCurrencyPluralPattern(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo.wrap(android.icu.text.CurrencyPluralInfo.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo.wrap(android.icu.text.CurrencyPluralInfo.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo.wrap(android.icu.text.CurrencyPluralInfo.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getLocale() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(((android.icu.text.CurrencyPluralInfo) real).getLocale());
    }

    public com.micklab.dcg.wrapper.android.icu.text.PluralRules getPluralRules() {
        return com.micklab.dcg.wrapper.android.icu.text.PluralRules.wrap(((android.icu.text.CurrencyPluralInfo) real).getPluralRules());
    }

    public int hashCode() {
        return ((android.icu.text.CurrencyPluralInfo) real).hashCode();
    }

    public void setCurrencyPluralPattern(java.lang.String arg0, java.lang.String arg1) {
        ((android.icu.text.CurrencyPluralInfo) real).setCurrencyPluralPattern(arg0, arg1);
    }

    public void setLocale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        ((android.icu.text.CurrencyPluralInfo) real).setLocale(arg0 == null ? null : arg0.getReal());
    }

    public void setPluralRules(java.lang.String arg0) {
        ((android.icu.text.CurrencyPluralInfo) real).setPluralRules(arg0);
    }

}
