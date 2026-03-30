// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DecimalFormat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DecimalFormat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormat wrap(android.icu.text.DecimalFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DecimalFormat(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.DecimalFormat getReal() {
        return (android.icu.text.DecimalFormat) real;
    }

    public android.icu.text.DecimalFormat unwrap() {
        return getReal();
    }

    public DecimalFormat() {
        this(new android.icu.text.DecimalFormat(), (__DcgwBridgeToken) null);
    }

    public DecimalFormat(java.lang.String arg0) {
        this(new android.icu.text.DecimalFormat(arg0), (__DcgwBridgeToken) null);
    }

    public DecimalFormat(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols arg1) {
        this(new android.icu.text.DecimalFormat(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public DecimalFormat(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols arg1, com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo arg2, int arg3) {
        this(new android.icu.text.DecimalFormat(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3), (__DcgwBridgeToken) null);
    }

    public void applyLocalizedPattern(java.lang.String arg0) {
        ((android.icu.text.DecimalFormat) real).applyLocalizedPattern(arg0);
    }

    public void applyPattern(java.lang.String arg0) {
        ((android.icu.text.DecimalFormat) real).applyPattern(arg0);
    }

    public boolean areSignificantDigitsUsed() {
        return ((android.icu.text.DecimalFormat) real).areSignificantDigitsUsed();
    }

    public java.lang.Object clone() {
        return ((android.icu.text.DecimalFormat) real).clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.DecimalFormat) real).equals(arg0);
    }

    public java.lang.StringBuffer format(java.math.BigDecimal arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.DecimalFormat) real).format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.DecimalFormat) real).format(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public java.lang.StringBuffer format(com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.DecimalFormat) real).format(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public java.lang.StringBuffer format(double arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.DecimalFormat) real).format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(long arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.DecimalFormat) real).format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(java.math.BigInteger arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.DecimalFormat) real).format(arg0, arg1, arg2);
    }

    public java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object arg0) {
        return ((android.icu.text.DecimalFormat) real).formatToCharacterIterator(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.util.Currency getCurrency() {
        return com.micklab.dcg.wrapper.android.icu.util.Currency.wrap(((android.icu.text.DecimalFormat) real).getCurrency());
    }

    public com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo getCurrencyPluralInfo() {
        return com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo.wrap(((android.icu.text.DecimalFormat) real).getCurrencyPluralInfo());
    }

    public com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage getCurrencyUsage() {
        return com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage.wrap(((android.icu.text.DecimalFormat) real).getCurrencyUsage());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols getDecimalFormatSymbols() {
        return com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols.wrap(((android.icu.text.DecimalFormat) real).getDecimalFormatSymbols());
    }

    public int getFormatWidth() {
        return ((android.icu.text.DecimalFormat) real).getFormatWidth();
    }

    public int getGroupingSize() {
        return ((android.icu.text.DecimalFormat) real).getGroupingSize();
    }

    public java.math.MathContext getMathContext() {
        return ((android.icu.text.DecimalFormat) real).getMathContext();
    }

    public com.micklab.dcg.wrapper.android.icu.math.MathContext getMathContextICU() {
        return com.micklab.dcg.wrapper.android.icu.math.MathContext.wrap(((android.icu.text.DecimalFormat) real).getMathContextICU());
    }

    public int getMaximumFractionDigits() {
        return ((android.icu.text.DecimalFormat) real).getMaximumFractionDigits();
    }

    public int getMaximumIntegerDigits() {
        return ((android.icu.text.DecimalFormat) real).getMaximumIntegerDigits();
    }

    public int getMaximumSignificantDigits() {
        return ((android.icu.text.DecimalFormat) real).getMaximumSignificantDigits();
    }

    public byte getMinimumExponentDigits() {
        return ((android.icu.text.DecimalFormat) real).getMinimumExponentDigits();
    }

    public int getMinimumFractionDigits() {
        return ((android.icu.text.DecimalFormat) real).getMinimumFractionDigits();
    }

    public int getMinimumGroupingDigits() {
        return ((android.icu.text.DecimalFormat) real).getMinimumGroupingDigits();
    }

    public int getMinimumIntegerDigits() {
        return ((android.icu.text.DecimalFormat) real).getMinimumIntegerDigits();
    }

    public int getMinimumSignificantDigits() {
        return ((android.icu.text.DecimalFormat) real).getMinimumSignificantDigits();
    }

    public int getMultiplier() {
        return ((android.icu.text.DecimalFormat) real).getMultiplier();
    }

    public java.lang.String getNegativePrefix() {
        return ((android.icu.text.DecimalFormat) real).getNegativePrefix();
    }

    public java.lang.String getNegativeSuffix() {
        return ((android.icu.text.DecimalFormat) real).getNegativeSuffix();
    }

    public char getPadCharacter() {
        return ((android.icu.text.DecimalFormat) real).getPadCharacter();
    }

    public int getPadPosition() {
        return ((android.icu.text.DecimalFormat) real).getPadPosition();
    }

    public int getParseMaxDigits() {
        return ((android.icu.text.DecimalFormat) real).getParseMaxDigits();
    }

    public java.lang.String getPositivePrefix() {
        return ((android.icu.text.DecimalFormat) real).getPositivePrefix();
    }

    public java.lang.String getPositiveSuffix() {
        return ((android.icu.text.DecimalFormat) real).getPositiveSuffix();
    }

    public java.math.BigDecimal getRoundingIncrement() {
        return ((android.icu.text.DecimalFormat) real).getRoundingIncrement();
    }

    public int getRoundingMode() {
        return ((android.icu.text.DecimalFormat) real).getRoundingMode();
    }

    public int getSecondaryGroupingSize() {
        return ((android.icu.text.DecimalFormat) real).getSecondaryGroupingSize();
    }

    public int hashCode() {
        return ((android.icu.text.DecimalFormat) real).hashCode();
    }

    public boolean isDecimalPatternMatchRequired() {
        return ((android.icu.text.DecimalFormat) real).isDecimalPatternMatchRequired();
    }

    public boolean isDecimalSeparatorAlwaysShown() {
        return ((android.icu.text.DecimalFormat) real).isDecimalSeparatorAlwaysShown();
    }

    public boolean isExponentSignAlwaysShown() {
        return ((android.icu.text.DecimalFormat) real).isExponentSignAlwaysShown();
    }

    public boolean isGroupingUsed() {
        return ((android.icu.text.DecimalFormat) real).isGroupingUsed();
    }

    public boolean isParseBigDecimal() {
        return ((android.icu.text.DecimalFormat) real).isParseBigDecimal();
    }

    public boolean isParseCaseSensitive() {
        return ((android.icu.text.DecimalFormat) real).isParseCaseSensitive();
    }

    public boolean isParseIntegerOnly() {
        return ((android.icu.text.DecimalFormat) real).isParseIntegerOnly();
    }

    public boolean isParseNoExponent() {
        return ((android.icu.text.DecimalFormat) real).isParseNoExponent();
    }

    public boolean isParseStrict() {
        return ((android.icu.text.DecimalFormat) real).isParseStrict();
    }

    public boolean isScientificNotation() {
        return ((android.icu.text.DecimalFormat) real).isScientificNotation();
    }

    public boolean isSignAlwaysShown() {
        return ((android.icu.text.DecimalFormat) real).isSignAlwaysShown();
    }

    public java.lang.Number parse(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.DecimalFormat) real).parse(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount parseCurrency(java.lang.CharSequence arg0, java.text.ParsePosition arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount.wrap(((android.icu.text.DecimalFormat) real).parseCurrency(arg0, arg1));
    }

    public void setCurrency(com.micklab.dcg.wrapper.android.icu.util.Currency arg0) {
        ((android.icu.text.DecimalFormat) real).setCurrency(arg0 == null ? null : arg0.getReal());
    }

    public void setCurrencyPluralInfo(com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo arg0) {
        ((android.icu.text.DecimalFormat) real).setCurrencyPluralInfo(arg0 == null ? null : arg0.getReal());
    }

    public void setCurrencyUsage(com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage arg0) {
        ((android.icu.text.DecimalFormat) real).setCurrencyUsage(arg0 == null ? null : arg0.getReal());
    }

    public void setDecimalFormatSymbols(com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols arg0) {
        ((android.icu.text.DecimalFormat) real).setDecimalFormatSymbols(arg0 == null ? null : arg0.getReal());
    }

    public void setDecimalPatternMatchRequired(boolean arg0) {
        ((android.icu.text.DecimalFormat) real).setDecimalPatternMatchRequired(arg0);
    }

    public void setDecimalSeparatorAlwaysShown(boolean arg0) {
        ((android.icu.text.DecimalFormat) real).setDecimalSeparatorAlwaysShown(arg0);
    }

    public void setExponentSignAlwaysShown(boolean arg0) {
        ((android.icu.text.DecimalFormat) real).setExponentSignAlwaysShown(arg0);
    }

    public void setFormatWidth(int arg0) {
        ((android.icu.text.DecimalFormat) real).setFormatWidth(arg0);
    }

    public void setGroupingSize(int arg0) {
        ((android.icu.text.DecimalFormat) real).setGroupingSize(arg0);
    }

    public void setGroupingUsed(boolean arg0) {
        ((android.icu.text.DecimalFormat) real).setGroupingUsed(arg0);
    }

    public void setMathContext(java.math.MathContext arg0) {
        ((android.icu.text.DecimalFormat) real).setMathContext(arg0);
    }

    public void setMathContextICU(com.micklab.dcg.wrapper.android.icu.math.MathContext arg0) {
        ((android.icu.text.DecimalFormat) real).setMathContextICU(arg0 == null ? null : arg0.getReal());
    }

    public void setMaximumFractionDigits(int arg0) {
        ((android.icu.text.DecimalFormat) real).setMaximumFractionDigits(arg0);
    }

    public void setMaximumIntegerDigits(int arg0) {
        ((android.icu.text.DecimalFormat) real).setMaximumIntegerDigits(arg0);
    }

    public void setMaximumSignificantDigits(int arg0) {
        ((android.icu.text.DecimalFormat) real).setMaximumSignificantDigits(arg0);
    }

    public void setMinimumExponentDigits(byte arg0) {
        ((android.icu.text.DecimalFormat) real).setMinimumExponentDigits(arg0);
    }

    public void setMinimumFractionDigits(int arg0) {
        ((android.icu.text.DecimalFormat) real).setMinimumFractionDigits(arg0);
    }

    public void setMinimumGroupingDigits(int arg0) {
        ((android.icu.text.DecimalFormat) real).setMinimumGroupingDigits(arg0);
    }

    public void setMinimumIntegerDigits(int arg0) {
        ((android.icu.text.DecimalFormat) real).setMinimumIntegerDigits(arg0);
    }

    public void setMinimumSignificantDigits(int arg0) {
        ((android.icu.text.DecimalFormat) real).setMinimumSignificantDigits(arg0);
    }

    public void setMultiplier(int arg0) {
        ((android.icu.text.DecimalFormat) real).setMultiplier(arg0);
    }

    public void setNegativePrefix(java.lang.String arg0) {
        ((android.icu.text.DecimalFormat) real).setNegativePrefix(arg0);
    }

    public void setNegativeSuffix(java.lang.String arg0) {
        ((android.icu.text.DecimalFormat) real).setNegativeSuffix(arg0);
    }

    public void setPadCharacter(char arg0) {
        ((android.icu.text.DecimalFormat) real).setPadCharacter(arg0);
    }

    public void setPadPosition(int arg0) {
        ((android.icu.text.DecimalFormat) real).setPadPosition(arg0);
    }

    public void setParseBigDecimal(boolean arg0) {
        ((android.icu.text.DecimalFormat) real).setParseBigDecimal(arg0);
    }

    public void setParseCaseSensitive(boolean arg0) {
        ((android.icu.text.DecimalFormat) real).setParseCaseSensitive(arg0);
    }

    public void setParseIntegerOnly(boolean arg0) {
        ((android.icu.text.DecimalFormat) real).setParseIntegerOnly(arg0);
    }

    public void setParseMaxDigits(int arg0) {
        ((android.icu.text.DecimalFormat) real).setParseMaxDigits(arg0);
    }

    public void setParseNoExponent(boolean arg0) {
        ((android.icu.text.DecimalFormat) real).setParseNoExponent(arg0);
    }

    public void setParseStrict(boolean arg0) {
        ((android.icu.text.DecimalFormat) real).setParseStrict(arg0);
    }

    public void setPositivePrefix(java.lang.String arg0) {
        ((android.icu.text.DecimalFormat) real).setPositivePrefix(arg0);
    }

    public void setPositiveSuffix(java.lang.String arg0) {
        ((android.icu.text.DecimalFormat) real).setPositiveSuffix(arg0);
    }

    public void setRoundingIncrement(double arg0) {
        ((android.icu.text.DecimalFormat) real).setRoundingIncrement(arg0);
    }

    public void setRoundingIncrement(java.math.BigDecimal arg0) {
        ((android.icu.text.DecimalFormat) real).setRoundingIncrement(arg0);
    }

    public void setRoundingIncrement(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        ((android.icu.text.DecimalFormat) real).setRoundingIncrement(arg0 == null ? null : arg0.getReal());
    }

    public void setRoundingMode(int arg0) {
        ((android.icu.text.DecimalFormat) real).setRoundingMode(arg0);
    }

    public void setScientificNotation(boolean arg0) {
        ((android.icu.text.DecimalFormat) real).setScientificNotation(arg0);
    }

    public void setSecondaryGroupingSize(int arg0) {
        ((android.icu.text.DecimalFormat) real).setSecondaryGroupingSize(arg0);
    }

    public void setSignAlwaysShown(boolean arg0) {
        ((android.icu.text.DecimalFormat) real).setSignAlwaysShown(arg0);
    }

    public void setSignificantDigitsUsed(boolean arg0) {
        ((android.icu.text.DecimalFormat) real).setSignificantDigitsUsed(arg0);
    }

    public java.lang.String toLocalizedPattern() {
        return ((android.icu.text.DecimalFormat) real).toLocalizedPattern();
    }

    public java.lang.String toPattern() {
        return ((android.icu.text.DecimalFormat) real).toPattern();
    }

    public java.lang.String toString() {
        return ((android.icu.text.DecimalFormat) real).toString();
    }

    public static final int MINIMUM_GROUPING_DIGITS_AUTO = android.icu.text.DecimalFormat.MINIMUM_GROUPING_DIGITS_AUTO;
    public static final int MINIMUM_GROUPING_DIGITS_MIN2 = android.icu.text.DecimalFormat.MINIMUM_GROUPING_DIGITS_MIN2;
    public static final int PAD_AFTER_PREFIX = android.icu.text.DecimalFormat.PAD_AFTER_PREFIX;
    public static final int PAD_AFTER_SUFFIX = android.icu.text.DecimalFormat.PAD_AFTER_SUFFIX;
    public static final int PAD_BEFORE_PREFIX = android.icu.text.DecimalFormat.PAD_BEFORE_PREFIX;
    public static final int PAD_BEFORE_SUFFIX = android.icu.text.DecimalFormat.PAD_BEFORE_SUFFIX;

}
