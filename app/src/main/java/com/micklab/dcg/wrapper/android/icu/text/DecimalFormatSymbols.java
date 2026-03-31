// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DecimalFormatSymbols {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DecimalFormatSymbols(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols wrap(android.icu.text.DecimalFormatSymbols real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.DecimalFormatSymbols getReal() {
        return (android.icu.text.DecimalFormatSymbols) real;
    }

    public android.icu.text.DecimalFormatSymbols unwrap() {
        return getReal();
    }

    public DecimalFormatSymbols() {
        this(new android.icu.text.DecimalFormatSymbols(), (__DcgwBridgeToken) null);
    }

    public DecimalFormatSymbols(java.util.Locale arg0) {
        this(new android.icu.text.DecimalFormatSymbols(arg0), (__DcgwBridgeToken) null);
    }

    public DecimalFormatSymbols(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.text.DecimalFormatSymbols(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public java.lang.Object clone() {
        return ((android.icu.text.DecimalFormatSymbols) real).clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.DecimalFormatSymbols) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols forNumberingSystem(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.NumberingSystem arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols.wrap(android.icu.text.DecimalFormatSymbols.forNumberingSystem(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols forNumberingSystem(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.NumberingSystem arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols.wrap(android.icu.text.DecimalFormatSymbols.forNumberingSystem(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static java.util.Locale[] getAvailableLocales() {
        return android.icu.text.DecimalFormatSymbols.getAvailableLocales();
    }

    public static android.icu.util.ULocale[] getAvailableULocales() {
        return android.icu.text.DecimalFormatSymbols.getAvailableULocales();
    }

    public com.micklab.dcg.wrapper.android.icu.util.Currency getCurrency() {
        return com.micklab.dcg.wrapper.android.icu.util.Currency.wrap(((android.icu.text.DecimalFormatSymbols) real).getCurrency());
    }

    public java.lang.String getCurrencySymbol() {
        return ((android.icu.text.DecimalFormatSymbols) real).getCurrencySymbol();
    }

    public char getDecimalSeparator() {
        return ((android.icu.text.DecimalFormatSymbols) real).getDecimalSeparator();
    }

    public java.lang.String getDecimalSeparatorString() {
        return ((android.icu.text.DecimalFormatSymbols) real).getDecimalSeparatorString();
    }

    public char getDigit() {
        return ((android.icu.text.DecimalFormatSymbols) real).getDigit();
    }

    public java.lang.String[] getDigitStrings() {
        return ((android.icu.text.DecimalFormatSymbols) real).getDigitStrings();
    }

    public char[] getDigits() {
        return ((android.icu.text.DecimalFormatSymbols) real).getDigits();
    }

    public java.lang.String getExponentMultiplicationSign() {
        return ((android.icu.text.DecimalFormatSymbols) real).getExponentMultiplicationSign();
    }

    public java.lang.String getExponentSeparator() {
        return ((android.icu.text.DecimalFormatSymbols) real).getExponentSeparator();
    }

    public char getGroupingSeparator() {
        return ((android.icu.text.DecimalFormatSymbols) real).getGroupingSeparator();
    }

    public java.lang.String getGroupingSeparatorString() {
        return ((android.icu.text.DecimalFormatSymbols) real).getGroupingSeparatorString();
    }

    public java.lang.String getInfinity() {
        return ((android.icu.text.DecimalFormatSymbols) real).getInfinity();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols.wrap(android.icu.text.DecimalFormatSymbols.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols.wrap(android.icu.text.DecimalFormatSymbols.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols.wrap(android.icu.text.DecimalFormatSymbols.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public java.lang.String getInternationalCurrencySymbol() {
        return ((android.icu.text.DecimalFormatSymbols) real).getInternationalCurrencySymbol();
    }

    public java.util.Locale getLocale() {
        return ((android.icu.text.DecimalFormatSymbols) real).getLocale();
    }

    public char getMinusSign() {
        return ((android.icu.text.DecimalFormatSymbols) real).getMinusSign();
    }

    public java.lang.String getMinusSignString() {
        return ((android.icu.text.DecimalFormatSymbols) real).getMinusSignString();
    }

    public char getMonetaryDecimalSeparator() {
        return ((android.icu.text.DecimalFormatSymbols) real).getMonetaryDecimalSeparator();
    }

    public java.lang.String getMonetaryDecimalSeparatorString() {
        return ((android.icu.text.DecimalFormatSymbols) real).getMonetaryDecimalSeparatorString();
    }

    public char getMonetaryGroupingSeparator() {
        return ((android.icu.text.DecimalFormatSymbols) real).getMonetaryGroupingSeparator();
    }

    public java.lang.String getMonetaryGroupingSeparatorString() {
        return ((android.icu.text.DecimalFormatSymbols) real).getMonetaryGroupingSeparatorString();
    }

    public java.lang.String getNaN() {
        return ((android.icu.text.DecimalFormatSymbols) real).getNaN();
    }

    public char getPadEscape() {
        return ((android.icu.text.DecimalFormatSymbols) real).getPadEscape();
    }

    public java.lang.String getPatternForCurrencySpacing(int arg0, boolean arg1) {
        return ((android.icu.text.DecimalFormatSymbols) real).getPatternForCurrencySpacing(arg0, arg1);
    }

    public char getPatternSeparator() {
        return ((android.icu.text.DecimalFormatSymbols) real).getPatternSeparator();
    }

    public char getPerMill() {
        return ((android.icu.text.DecimalFormatSymbols) real).getPerMill();
    }

    public java.lang.String getPerMillString() {
        return ((android.icu.text.DecimalFormatSymbols) real).getPerMillString();
    }

    public char getPercent() {
        return ((android.icu.text.DecimalFormatSymbols) real).getPercent();
    }

    public java.lang.String getPercentString() {
        return ((android.icu.text.DecimalFormatSymbols) real).getPercentString();
    }

    public char getPlusSign() {
        return ((android.icu.text.DecimalFormatSymbols) real).getPlusSign();
    }

    public java.lang.String getPlusSignString() {
        return ((android.icu.text.DecimalFormatSymbols) real).getPlusSignString();
    }

    public char getSignificantDigit() {
        return ((android.icu.text.DecimalFormatSymbols) real).getSignificantDigit();
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getULocale() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(((android.icu.text.DecimalFormatSymbols) real).getULocale());
    }

    public char getZeroDigit() {
        return ((android.icu.text.DecimalFormatSymbols) real).getZeroDigit();
    }

    public int hashCode() {
        return ((android.icu.text.DecimalFormatSymbols) real).hashCode();
    }

    public void setCurrency(com.micklab.dcg.wrapper.android.icu.util.Currency arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setCurrency(arg0 == null ? null : arg0.getReal());
    }

    public void setCurrencySymbol(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setCurrencySymbol(arg0);
    }

    public void setDecimalSeparator(char arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setDecimalSeparator(arg0);
    }

    public void setDecimalSeparatorString(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setDecimalSeparatorString(arg0);
    }

    public void setDigit(char arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setDigit(arg0);
    }

    public void setDigitStrings(java.lang.String[] arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setDigitStrings(arg0);
    }

    public void setExponentMultiplicationSign(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setExponentMultiplicationSign(arg0);
    }

    public void setExponentSeparator(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setExponentSeparator(arg0);
    }

    public void setGroupingSeparator(char arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setGroupingSeparator(arg0);
    }

    public void setGroupingSeparatorString(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setGroupingSeparatorString(arg0);
    }

    public void setInfinity(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setInfinity(arg0);
    }

    public void setInternationalCurrencySymbol(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setInternationalCurrencySymbol(arg0);
    }

    public void setMinusSign(char arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setMinusSign(arg0);
    }

    public void setMinusSignString(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setMinusSignString(arg0);
    }

    public void setMonetaryDecimalSeparator(char arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setMonetaryDecimalSeparator(arg0);
    }

    public void setMonetaryDecimalSeparatorString(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setMonetaryDecimalSeparatorString(arg0);
    }

    public void setMonetaryGroupingSeparator(char arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setMonetaryGroupingSeparator(arg0);
    }

    public void setMonetaryGroupingSeparatorString(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setMonetaryGroupingSeparatorString(arg0);
    }

    public void setNaN(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setNaN(arg0);
    }

    public void setPadEscape(char arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setPadEscape(arg0);
    }

    public void setPatternForCurrencySpacing(int arg0, boolean arg1, java.lang.String arg2) {
        ((android.icu.text.DecimalFormatSymbols) real).setPatternForCurrencySpacing(arg0, arg1, arg2);
    }

    public void setPatternSeparator(char arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setPatternSeparator(arg0);
    }

    public void setPerMill(char arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setPerMill(arg0);
    }

    public void setPerMillString(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setPerMillString(arg0);
    }

    public void setPercent(char arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setPercent(arg0);
    }

    public void setPercentString(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setPercentString(arg0);
    }

    public void setPlusSign(char arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setPlusSign(arg0);
    }

    public void setPlusSignString(java.lang.String arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setPlusSignString(arg0);
    }

    public void setSignificantDigit(char arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setSignificantDigit(arg0);
    }

    public void setZeroDigit(char arg0) {
        ((android.icu.text.DecimalFormatSymbols) real).setZeroDigit(arg0);
    }

    public static final int CURRENCY_SPC_CURRENCY_MATCH = android.icu.text.DecimalFormatSymbols.CURRENCY_SPC_CURRENCY_MATCH;
    public static final int CURRENCY_SPC_INSERT = android.icu.text.DecimalFormatSymbols.CURRENCY_SPC_INSERT;
    public static final int CURRENCY_SPC_SURROUNDING_MATCH = android.icu.text.DecimalFormatSymbols.CURRENCY_SPC_SURROUNDING_MATCH;

}
