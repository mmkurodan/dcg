// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DecimalFormatSymbols {
    private final android.icu.text.DecimalFormatSymbols real;

    public DecimalFormatSymbols(android.icu.text.DecimalFormatSymbols real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols wrap(android.icu.text.DecimalFormatSymbols real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols(real);
    }

    public android.icu.text.DecimalFormatSymbols unwrap() {
        return real;
    }

    public DecimalFormatSymbols() {
        this(new android.icu.text.DecimalFormatSymbols());
    }

    public DecimalFormatSymbols(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        this(new android.icu.text.DecimalFormatSymbols(arg0 == null ? null : arg0.unwrap()));
    }

    public DecimalFormatSymbols(java.util.Locale arg0) {
        this(new android.icu.text.DecimalFormatSymbols(arg0));
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols forNumberingSystem(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.NumberingSystem arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols.wrap(android.icu.text.DecimalFormatSymbols.forNumberingSystem(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols forNumberingSystem(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.NumberingSystem arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols.wrap(android.icu.text.DecimalFormatSymbols.forNumberingSystem(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static java.util.Locale[] getAvailableLocales() {
        return android.icu.text.DecimalFormatSymbols.getAvailableLocales();
    }

    public static android.icu.util.ULocale[] getAvailableULocales() {
        return android.icu.text.DecimalFormatSymbols.getAvailableULocales();
    }

    public com.micklab.dcg.wrapper.android.icu.util.Currency getCurrency() {
        return com.micklab.dcg.wrapper.android.icu.util.Currency.wrap(real.getCurrency());
    }

    public java.lang.String getCurrencySymbol() {
        return real.getCurrencySymbol();
    }

    public char getDecimalSeparator() {
        return real.getDecimalSeparator();
    }

    public java.lang.String getDecimalSeparatorString() {
        return real.getDecimalSeparatorString();
    }

    public char getDigit() {
        return real.getDigit();
    }

    public java.lang.String[] getDigitStrings() {
        return real.getDigitStrings();
    }

    public char[] getDigits() {
        return real.getDigits();
    }

    public java.lang.String getExponentMultiplicationSign() {
        return real.getExponentMultiplicationSign();
    }

    public java.lang.String getExponentSeparator() {
        return real.getExponentSeparator();
    }

    public char getGroupingSeparator() {
        return real.getGroupingSeparator();
    }

    public java.lang.String getGroupingSeparatorString() {
        return real.getGroupingSeparatorString();
    }

    public java.lang.String getInfinity() {
        return real.getInfinity();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols.wrap(android.icu.text.DecimalFormatSymbols.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols.wrap(android.icu.text.DecimalFormatSymbols.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols.wrap(android.icu.text.DecimalFormatSymbols.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String getInternationalCurrencySymbol() {
        return real.getInternationalCurrencySymbol();
    }

    public java.util.Locale getLocale() {
        return real.getLocale();
    }

    public char getMinusSign() {
        return real.getMinusSign();
    }

    public java.lang.String getMinusSignString() {
        return real.getMinusSignString();
    }

    public char getMonetaryDecimalSeparator() {
        return real.getMonetaryDecimalSeparator();
    }

    public java.lang.String getMonetaryDecimalSeparatorString() {
        return real.getMonetaryDecimalSeparatorString();
    }

    public char getMonetaryGroupingSeparator() {
        return real.getMonetaryGroupingSeparator();
    }

    public java.lang.String getMonetaryGroupingSeparatorString() {
        return real.getMonetaryGroupingSeparatorString();
    }

    public java.lang.String getNaN() {
        return real.getNaN();
    }

    public char getPadEscape() {
        return real.getPadEscape();
    }

    public java.lang.String getPatternForCurrencySpacing(int arg0, boolean arg1) {
        return real.getPatternForCurrencySpacing(arg0, arg1);
    }

    public char getPatternSeparator() {
        return real.getPatternSeparator();
    }

    public char getPerMill() {
        return real.getPerMill();
    }

    public java.lang.String getPerMillString() {
        return real.getPerMillString();
    }

    public char getPercent() {
        return real.getPercent();
    }

    public java.lang.String getPercentString() {
        return real.getPercentString();
    }

    public char getPlusSign() {
        return real.getPlusSign();
    }

    public java.lang.String getPlusSignString() {
        return real.getPlusSignString();
    }

    public char getSignificantDigit() {
        return real.getSignificantDigit();
    }

    public com.micklab.dcg.wrapper.android.icu.util.ULocale getULocale() {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(real.getULocale());
    }

    public char getZeroDigit() {
        return real.getZeroDigit();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void setCurrency(com.micklab.dcg.wrapper.android.icu.util.Currency arg0) {
        real.setCurrency(arg0 == null ? null : arg0.unwrap());
    }

    public void setCurrencySymbol(java.lang.String arg0) {
        real.setCurrencySymbol(arg0);
    }

    public void setDecimalSeparator(char arg0) {
        real.setDecimalSeparator(arg0);
    }

    public void setDecimalSeparatorString(java.lang.String arg0) {
        real.setDecimalSeparatorString(arg0);
    }

    public void setDigit(char arg0) {
        real.setDigit(arg0);
    }

    public void setDigitStrings(java.lang.String[] arg0) {
        real.setDigitStrings(arg0);
    }

    public void setExponentMultiplicationSign(java.lang.String arg0) {
        real.setExponentMultiplicationSign(arg0);
    }

    public void setExponentSeparator(java.lang.String arg0) {
        real.setExponentSeparator(arg0);
    }

    public void setGroupingSeparator(char arg0) {
        real.setGroupingSeparator(arg0);
    }

    public void setGroupingSeparatorString(java.lang.String arg0) {
        real.setGroupingSeparatorString(arg0);
    }

    public void setInfinity(java.lang.String arg0) {
        real.setInfinity(arg0);
    }

    public void setInternationalCurrencySymbol(java.lang.String arg0) {
        real.setInternationalCurrencySymbol(arg0);
    }

    public void setMinusSign(char arg0) {
        real.setMinusSign(arg0);
    }

    public void setMinusSignString(java.lang.String arg0) {
        real.setMinusSignString(arg0);
    }

    public void setMonetaryDecimalSeparator(char arg0) {
        real.setMonetaryDecimalSeparator(arg0);
    }

    public void setMonetaryDecimalSeparatorString(java.lang.String arg0) {
        real.setMonetaryDecimalSeparatorString(arg0);
    }

    public void setMonetaryGroupingSeparator(char arg0) {
        real.setMonetaryGroupingSeparator(arg0);
    }

    public void setMonetaryGroupingSeparatorString(java.lang.String arg0) {
        real.setMonetaryGroupingSeparatorString(arg0);
    }

    public void setNaN(java.lang.String arg0) {
        real.setNaN(arg0);
    }

    public void setPadEscape(char arg0) {
        real.setPadEscape(arg0);
    }

    public void setPatternForCurrencySpacing(int arg0, boolean arg1, java.lang.String arg2) {
        real.setPatternForCurrencySpacing(arg0, arg1, arg2);
    }

    public void setPatternSeparator(char arg0) {
        real.setPatternSeparator(arg0);
    }

    public void setPerMill(char arg0) {
        real.setPerMill(arg0);
    }

    public void setPerMillString(java.lang.String arg0) {
        real.setPerMillString(arg0);
    }

    public void setPercent(char arg0) {
        real.setPercent(arg0);
    }

    public void setPercentString(java.lang.String arg0) {
        real.setPercentString(arg0);
    }

    public void setPlusSign(char arg0) {
        real.setPlusSign(arg0);
    }

    public void setPlusSignString(java.lang.String arg0) {
        real.setPlusSignString(arg0);
    }

    public void setSignificantDigit(char arg0) {
        real.setSignificantDigit(arg0);
    }

    public void setZeroDigit(char arg0) {
        real.setZeroDigit(arg0);
    }

    public static final int CURRENCY_SPC_CURRENCY_MATCH = android.icu.text.DecimalFormatSymbols.CURRENCY_SPC_CURRENCY_MATCH;
    public static final int CURRENCY_SPC_INSERT = android.icu.text.DecimalFormatSymbols.CURRENCY_SPC_INSERT;
    public static final int CURRENCY_SPC_SURROUNDING_MATCH = android.icu.text.DecimalFormatSymbols.CURRENCY_SPC_SURROUNDING_MATCH;

}
