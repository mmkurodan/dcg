// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class Currency {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Currency(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Currency wrap(android.icu.util.Currency real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.Currency(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.Currency getReal() {
        return (android.icu.util.Currency) real;
    }

    public android.icu.util.Currency unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Currency fromJavaCurrency(java.util.Currency arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.Currency.wrap(android.icu.util.Currency.fromJavaCurrency(arg0));
    }

    public static java.lang.String[] getAvailableCurrencyCodes(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, java.util.Date arg1) {
        return android.icu.util.Currency.getAvailableCurrencyCodes(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static java.lang.String[] getAvailableCurrencyCodes(java.util.Locale arg0, java.util.Date arg1) {
        return android.icu.util.Currency.getAvailableCurrencyCodes(arg0, arg1);
    }

    public static java.util.Locale[] getAvailableLocales() {
        return android.icu.util.Currency.getAvailableLocales();
    }

    public static android.icu.util.ULocale[] getAvailableULocales() {
        return android.icu.util.Currency.getAvailableULocales();
    }

    public java.lang.String getCurrencyCode() {
        return ((android.icu.util.Currency) real).getCurrencyCode();
    }

    public int getDefaultFractionDigits() {
        return ((android.icu.util.Currency) real).getDefaultFractionDigits();
    }

    public int getDefaultFractionDigits(com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage arg0) {
        return ((android.icu.util.Currency) real).getDefaultFractionDigits(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String getDisplayName() {
        return ((android.icu.util.Currency) real).getDisplayName();
    }

    public java.lang.String getDisplayName(java.util.Locale arg0) {
        return ((android.icu.util.Currency) real).getDisplayName(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Currency getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.Currency.wrap(android.icu.util.Currency.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Currency getInstance(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.Currency.wrap(android.icu.util.Currency.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Currency getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.util.Currency.wrap(android.icu.util.Currency.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static java.lang.String[] getKeywordValuesForLocale(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1, boolean arg2) {
        return android.icu.util.Currency.getKeywordValuesForLocale(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public java.lang.String getName(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, int arg1, boolean[] arg2) {
        return ((android.icu.util.Currency) real).getName(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public java.lang.String getName(java.util.Locale arg0, int arg1, boolean[] arg2) {
        return ((android.icu.util.Currency) real).getName(arg0, arg1, arg2);
    }

    public java.lang.String getName(java.util.Locale arg0, int arg1, java.lang.String arg2, boolean[] arg3) {
        return ((android.icu.util.Currency) real).getName(arg0, arg1, arg2, arg3);
    }

    public java.lang.String getName(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, int arg1, java.lang.String arg2, boolean[] arg3) {
        return ((android.icu.util.Currency) real).getName(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public int getNumericCode() {
        return ((android.icu.util.Currency) real).getNumericCode();
    }

    public double getRoundingIncrement() {
        return ((android.icu.util.Currency) real).getRoundingIncrement();
    }

    public double getRoundingIncrement(com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage arg0) {
        return ((android.icu.util.Currency) real).getRoundingIncrement(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String getSymbol() {
        return ((android.icu.util.Currency) real).getSymbol();
    }

    public java.lang.String getSymbol(java.util.Locale arg0) {
        return ((android.icu.util.Currency) real).getSymbol(arg0);
    }

    public java.lang.String getSymbol(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return ((android.icu.util.Currency) real).getSymbol(arg0 == null ? null : arg0.getReal());
    }

    public static boolean isAvailable(java.lang.String arg0, java.util.Date arg1, java.util.Date arg2) {
        return android.icu.util.Currency.isAvailable(arg0, arg1, arg2);
    }

    public java.util.Currency toJavaCurrency() {
        return ((android.icu.util.Currency) real).toJavaCurrency();
    }

    public java.lang.String toString() {
        return ((android.icu.util.Currency) real).toString();
    }

    public static final int FORMAL_SYMBOL_NAME = android.icu.util.Currency.FORMAL_SYMBOL_NAME;
    public static final int LONG_NAME = android.icu.util.Currency.LONG_NAME;
    public static final int NARROW_SYMBOL_NAME = android.icu.util.Currency.NARROW_SYMBOL_NAME;
    public static final int PLURAL_LONG_NAME = android.icu.util.Currency.PLURAL_LONG_NAME;
    public static final int SYMBOL_NAME = android.icu.util.Currency.SYMBOL_NAME;
    public static final int VARIANT_SYMBOL_NAME = android.icu.util.Currency.VARIANT_SYMBOL_NAME;

    public static final class CurrencyUsage {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CurrencyUsage(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage wrap(android.icu.util.Currency.CurrencyUsage real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage(real, (__DcgwBridgeToken) null);
        }

        public android.icu.util.Currency.CurrencyUsage getReal() {
            return (android.icu.util.Currency.CurrencyUsage) real;
        }

        public android.icu.util.Currency.CurrencyUsage unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage.wrap(android.icu.util.Currency.CurrencyUsage.valueOf(arg0));
        }

        public static android.icu.util.Currency.CurrencyUsage[] values() {
            return android.icu.util.Currency.CurrencyUsage.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage CASH = com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage.wrap(android.icu.util.Currency.CurrencyUsage.CASH);
        public static final com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage STANDARD = com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage.wrap(android.icu.util.Currency.CurrencyUsage.STANDARD);

    }
}
