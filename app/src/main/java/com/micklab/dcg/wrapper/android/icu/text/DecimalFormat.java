// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class DecimalFormat {
    private final android.icu.text.DecimalFormat real;

    public DecimalFormat(android.icu.text.DecimalFormat real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.DecimalFormat wrap(android.icu.text.DecimalFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.DecimalFormat(real);
    }

    public android.icu.text.DecimalFormat unwrap() {
        return real;
    }

    public DecimalFormat() {
        this(new android.icu.text.DecimalFormat());
    }

    public DecimalFormat(java.lang.String arg0) {
        this(new android.icu.text.DecimalFormat(arg0));
    }

    public DecimalFormat(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols arg1) {
        this(new android.icu.text.DecimalFormat(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public DecimalFormat(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols arg1, com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo arg2, int arg3) {
        this(new android.icu.text.DecimalFormat(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public void applyLocalizedPattern(java.lang.String arg0) {
        real.applyLocalizedPattern(arg0);
    }

    public void applyPattern(java.lang.String arg0) {
        real.applyPattern(arg0);
    }

    public boolean areSignificantDigitsUsed() {
        return real.areSignificantDigitsUsed();
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.StringBuffer format(java.math.BigDecimal arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public java.lang.StringBuffer format(com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public java.lang.StringBuffer format(double arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(long arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(java.math.BigInteger arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return real.format(arg0, arg1, arg2);
    }

    public java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object arg0) {
        return real.formatToCharacterIterator(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.util.Currency getCurrency() {
        return com.micklab.dcg.wrapper.android.icu.util.Currency.wrap(real.getCurrency());
    }

    public com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo getCurrencyPluralInfo() {
        return com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo.wrap(real.getCurrencyPluralInfo());
    }

    public com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage getCurrencyUsage() {
        return com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage.wrap(real.getCurrencyUsage());
    }

    public com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols getDecimalFormatSymbols() {
        return com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols.wrap(real.getDecimalFormatSymbols());
    }

    public int getFormatWidth() {
        return real.getFormatWidth();
    }

    public int getGroupingSize() {
        return real.getGroupingSize();
    }

    public java.math.MathContext getMathContext() {
        return real.getMathContext();
    }

    public com.micklab.dcg.wrapper.android.icu.math.MathContext getMathContextICU() {
        return com.micklab.dcg.wrapper.android.icu.math.MathContext.wrap(real.getMathContextICU());
    }

    public int getMaximumFractionDigits() {
        return real.getMaximumFractionDigits();
    }

    public int getMaximumIntegerDigits() {
        return real.getMaximumIntegerDigits();
    }

    public int getMaximumSignificantDigits() {
        return real.getMaximumSignificantDigits();
    }

    public byte getMinimumExponentDigits() {
        return real.getMinimumExponentDigits();
    }

    public int getMinimumFractionDigits() {
        return real.getMinimumFractionDigits();
    }

    public int getMinimumGroupingDigits() {
        return real.getMinimumGroupingDigits();
    }

    public int getMinimumIntegerDigits() {
        return real.getMinimumIntegerDigits();
    }

    public int getMinimumSignificantDigits() {
        return real.getMinimumSignificantDigits();
    }

    public int getMultiplier() {
        return real.getMultiplier();
    }

    public java.lang.String getNegativePrefix() {
        return real.getNegativePrefix();
    }

    public java.lang.String getNegativeSuffix() {
        return real.getNegativeSuffix();
    }

    public char getPadCharacter() {
        return real.getPadCharacter();
    }

    public int getPadPosition() {
        return real.getPadPosition();
    }

    public int getParseMaxDigits() {
        return real.getParseMaxDigits();
    }

    public java.lang.String getPositivePrefix() {
        return real.getPositivePrefix();
    }

    public java.lang.String getPositiveSuffix() {
        return real.getPositiveSuffix();
    }

    public java.math.BigDecimal getRoundingIncrement() {
        return real.getRoundingIncrement();
    }

    public int getRoundingMode() {
        return real.getRoundingMode();
    }

    public int getSecondaryGroupingSize() {
        return real.getSecondaryGroupingSize();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isDecimalPatternMatchRequired() {
        return real.isDecimalPatternMatchRequired();
    }

    public boolean isDecimalSeparatorAlwaysShown() {
        return real.isDecimalSeparatorAlwaysShown();
    }

    public boolean isExponentSignAlwaysShown() {
        return real.isExponentSignAlwaysShown();
    }

    public boolean isGroupingUsed() {
        return real.isGroupingUsed();
    }

    public boolean isParseBigDecimal() {
        return real.isParseBigDecimal();
    }

    public boolean isParseCaseSensitive() {
        return real.isParseCaseSensitive();
    }

    public boolean isParseIntegerOnly() {
        return real.isParseIntegerOnly();
    }

    public boolean isParseNoExponent() {
        return real.isParseNoExponent();
    }

    public boolean isParseStrict() {
        return real.isParseStrict();
    }

    public boolean isScientificNotation() {
        return real.isScientificNotation();
    }

    public boolean isSignAlwaysShown() {
        return real.isSignAlwaysShown();
    }

    public java.lang.Number parse(java.lang.String arg0, java.text.ParsePosition arg1) {
        return real.parse(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount parseCurrency(java.lang.CharSequence arg0, java.text.ParsePosition arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount.wrap(real.parseCurrency(arg0, arg1));
    }

    public void setCurrency(com.micklab.dcg.wrapper.android.icu.util.Currency arg0) {
        real.setCurrency(arg0 == null ? null : arg0.unwrap());
    }

    public void setCurrencyPluralInfo(com.micklab.dcg.wrapper.android.icu.text.CurrencyPluralInfo arg0) {
        real.setCurrencyPluralInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void setCurrencyUsage(com.micklab.dcg.wrapper.android.icu.util.Currency.CurrencyUsage arg0) {
        real.setCurrencyUsage(arg0 == null ? null : arg0.unwrap());
    }

    public void setDecimalFormatSymbols(com.micklab.dcg.wrapper.android.icu.text.DecimalFormatSymbols arg0) {
        real.setDecimalFormatSymbols(arg0 == null ? null : arg0.unwrap());
    }

    public void setDecimalPatternMatchRequired(boolean arg0) {
        real.setDecimalPatternMatchRequired(arg0);
    }

    public void setDecimalSeparatorAlwaysShown(boolean arg0) {
        real.setDecimalSeparatorAlwaysShown(arg0);
    }

    public void setExponentSignAlwaysShown(boolean arg0) {
        real.setExponentSignAlwaysShown(arg0);
    }

    public void setFormatWidth(int arg0) {
        real.setFormatWidth(arg0);
    }

    public void setGroupingSize(int arg0) {
        real.setGroupingSize(arg0);
    }

    public void setGroupingUsed(boolean arg0) {
        real.setGroupingUsed(arg0);
    }

    public void setMathContext(java.math.MathContext arg0) {
        real.setMathContext(arg0);
    }

    public void setMathContextICU(com.micklab.dcg.wrapper.android.icu.math.MathContext arg0) {
        real.setMathContextICU(arg0 == null ? null : arg0.unwrap());
    }

    public void setMaximumFractionDigits(int arg0) {
        real.setMaximumFractionDigits(arg0);
    }

    public void setMaximumIntegerDigits(int arg0) {
        real.setMaximumIntegerDigits(arg0);
    }

    public void setMaximumSignificantDigits(int arg0) {
        real.setMaximumSignificantDigits(arg0);
    }

    public void setMinimumExponentDigits(byte arg0) {
        real.setMinimumExponentDigits(arg0);
    }

    public void setMinimumFractionDigits(int arg0) {
        real.setMinimumFractionDigits(arg0);
    }

    public void setMinimumGroupingDigits(int arg0) {
        real.setMinimumGroupingDigits(arg0);
    }

    public void setMinimumIntegerDigits(int arg0) {
        real.setMinimumIntegerDigits(arg0);
    }

    public void setMinimumSignificantDigits(int arg0) {
        real.setMinimumSignificantDigits(arg0);
    }

    public void setMultiplier(int arg0) {
        real.setMultiplier(arg0);
    }

    public void setNegativePrefix(java.lang.String arg0) {
        real.setNegativePrefix(arg0);
    }

    public void setNegativeSuffix(java.lang.String arg0) {
        real.setNegativeSuffix(arg0);
    }

    public void setPadCharacter(char arg0) {
        real.setPadCharacter(arg0);
    }

    public void setPadPosition(int arg0) {
        real.setPadPosition(arg0);
    }

    public void setParseBigDecimal(boolean arg0) {
        real.setParseBigDecimal(arg0);
    }

    public void setParseCaseSensitive(boolean arg0) {
        real.setParseCaseSensitive(arg0);
    }

    public void setParseIntegerOnly(boolean arg0) {
        real.setParseIntegerOnly(arg0);
    }

    public void setParseMaxDigits(int arg0) {
        real.setParseMaxDigits(arg0);
    }

    public void setParseNoExponent(boolean arg0) {
        real.setParseNoExponent(arg0);
    }

    public void setParseStrict(boolean arg0) {
        real.setParseStrict(arg0);
    }

    public void setPositivePrefix(java.lang.String arg0) {
        real.setPositivePrefix(arg0);
    }

    public void setPositiveSuffix(java.lang.String arg0) {
        real.setPositiveSuffix(arg0);
    }

    public void setRoundingIncrement(double arg0) {
        real.setRoundingIncrement(arg0);
    }

    public void setRoundingIncrement(java.math.BigDecimal arg0) {
        real.setRoundingIncrement(arg0);
    }

    public void setRoundingIncrement(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        real.setRoundingIncrement(arg0 == null ? null : arg0.unwrap());
    }

    public void setRoundingMode(int arg0) {
        real.setRoundingMode(arg0);
    }

    public void setScientificNotation(boolean arg0) {
        real.setScientificNotation(arg0);
    }

    public void setSecondaryGroupingSize(int arg0) {
        real.setSecondaryGroupingSize(arg0);
    }

    public void setSignAlwaysShown(boolean arg0) {
        real.setSignAlwaysShown(arg0);
    }

    public void setSignificantDigitsUsed(boolean arg0) {
        real.setSignificantDigitsUsed(arg0);
    }

    public java.lang.String toLocalizedPattern() {
        return real.toLocalizedPattern();
    }

    public java.lang.String toPattern() {
        return real.toPattern();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int MINIMUM_GROUPING_DIGITS_AUTO = android.icu.text.DecimalFormat.MINIMUM_GROUPING_DIGITS_AUTO;
    public static final int MINIMUM_GROUPING_DIGITS_MIN2 = android.icu.text.DecimalFormat.MINIMUM_GROUPING_DIGITS_MIN2;
    public static final int PAD_AFTER_PREFIX = android.icu.text.DecimalFormat.PAD_AFTER_PREFIX;
    public static final int PAD_AFTER_SUFFIX = android.icu.text.DecimalFormat.PAD_AFTER_SUFFIX;
    public static final int PAD_BEFORE_PREFIX = android.icu.text.DecimalFormat.PAD_BEFORE_PREFIX;
    public static final int PAD_BEFORE_SUFFIX = android.icu.text.DecimalFormat.PAD_BEFORE_SUFFIX;

}
