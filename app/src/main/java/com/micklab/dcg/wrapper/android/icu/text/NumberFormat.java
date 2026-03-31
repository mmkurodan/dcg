// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class NumberFormat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NumberFormat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat wrap(android.icu.text.NumberFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.NumberFormat(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.NumberFormat getReal() {
        return (android.icu.text.NumberFormat) real;
    }

    public android.icu.text.NumberFormat unwrap() {
        return getReal();
    }

    public java.lang.Object clone() {
        return ((android.icu.text.NumberFormat) real).clone();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.NumberFormat) real).equals(arg0);
    }

    public java.lang.String format(java.math.BigInteger arg0) {
        return ((android.icu.text.NumberFormat) real).format(arg0);
    }

    public java.lang.String format(java.math.BigDecimal arg0) {
        return ((android.icu.text.NumberFormat) real).format(arg0);
    }

    public java.lang.String format(long arg0) {
        return ((android.icu.text.NumberFormat) real).format(arg0);
    }

    public java.lang.String format(com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount arg0) {
        return ((android.icu.text.NumberFormat) real).format(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String format(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0) {
        return ((android.icu.text.NumberFormat) real).format(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String format(double arg0) {
        return ((android.icu.text.NumberFormat) real).format(arg0);
    }

    public java.lang.StringBuffer format(java.math.BigDecimal arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.NumberFormat) real).format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(java.math.BigInteger arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.NumberFormat) real).format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(long arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.NumberFormat) real).format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.NumberFormat) real).format(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public java.lang.StringBuffer format(com.micklab.dcg.wrapper.android.icu.math.BigDecimal arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.NumberFormat) real).format(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public java.lang.StringBuffer format(java.lang.Object arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.NumberFormat) real).format(arg0, arg1, arg2);
    }

    public java.lang.StringBuffer format(double arg0, java.lang.StringBuffer arg1, java.text.FieldPosition arg2) {
        return ((android.icu.text.NumberFormat) real).format(arg0, arg1, arg2);
    }

    public static java.util.Locale[] getAvailableLocales() {
        return android.icu.text.NumberFormat.getAvailableLocales();
    }

    public com.micklab.dcg.wrapper.android.icu.text.DisplayContext getContext(com.micklab.dcg.wrapper.android.icu.text.DisplayContext.Type arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.DisplayContext.wrap(((android.icu.text.NumberFormat) real).getContext(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.icu.util.Currency getCurrency() {
        return com.micklab.dcg.wrapper.android.icu.util.Currency.wrap(((android.icu.text.NumberFormat) real).getCurrency());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getCurrencyInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getCurrencyInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getCurrencyInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getCurrencyInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getCurrencyInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getCurrencyInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getInstance(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getInstance(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getInstance(java.util.Locale arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getInstance(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getIntegerInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getIntegerInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getIntegerInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getIntegerInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getIntegerInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getIntegerInstance(arg0 == null ? null : arg0.getReal()));
    }

    public int getMaximumFractionDigits() {
        return ((android.icu.text.NumberFormat) real).getMaximumFractionDigits();
    }

    public int getMaximumIntegerDigits() {
        return ((android.icu.text.NumberFormat) real).getMaximumIntegerDigits();
    }

    public int getMinimumFractionDigits() {
        return ((android.icu.text.NumberFormat) real).getMinimumFractionDigits();
    }

    public int getMinimumIntegerDigits() {
        return ((android.icu.text.NumberFormat) real).getMinimumIntegerDigits();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getNumberInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getNumberInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getNumberInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getNumberInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getNumberInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getNumberInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getPercentInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getPercentInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getPercentInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getPercentInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getPercentInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getPercentInstance(arg0));
    }

    public int getRoundingMode() {
        return ((android.icu.text.NumberFormat) real).getRoundingMode();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getScientificInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getScientificInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getScientificInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getScientificInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat getScientificInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.NumberFormat.wrap(android.icu.text.NumberFormat.getScientificInstance(arg0 == null ? null : arg0.getReal()));
    }

    public int hashCode() {
        return ((android.icu.text.NumberFormat) real).hashCode();
    }

    public boolean isGroupingUsed() {
        return ((android.icu.text.NumberFormat) real).isGroupingUsed();
    }

    public boolean isParseIntegerOnly() {
        return ((android.icu.text.NumberFormat) real).isParseIntegerOnly();
    }

    public boolean isParseStrict() {
        return ((android.icu.text.NumberFormat) real).isParseStrict();
    }

    public java.lang.Number parse(java.lang.String arg0) throws java.text.ParseException {
        return ((android.icu.text.NumberFormat) real).parse(arg0);
    }

    public java.lang.Number parse(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.NumberFormat) real).parse(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount parseCurrency(java.lang.CharSequence arg0, java.text.ParsePosition arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.CurrencyAmount.wrap(((android.icu.text.NumberFormat) real).parseCurrency(arg0, arg1));
    }

    public java.lang.Object parseObject(java.lang.String arg0, java.text.ParsePosition arg1) {
        return ((android.icu.text.NumberFormat) real).parseObject(arg0, arg1);
    }

    public void setContext(com.micklab.dcg.wrapper.android.icu.text.DisplayContext arg0) {
        ((android.icu.text.NumberFormat) real).setContext(arg0 == null ? null : arg0.getReal());
    }

    public void setCurrency(com.micklab.dcg.wrapper.android.icu.util.Currency arg0) {
        ((android.icu.text.NumberFormat) real).setCurrency(arg0 == null ? null : arg0.getReal());
    }

    public void setGroupingUsed(boolean arg0) {
        ((android.icu.text.NumberFormat) real).setGroupingUsed(arg0);
    }

    public void setMaximumFractionDigits(int arg0) {
        ((android.icu.text.NumberFormat) real).setMaximumFractionDigits(arg0);
    }

    public void setMaximumIntegerDigits(int arg0) {
        ((android.icu.text.NumberFormat) real).setMaximumIntegerDigits(arg0);
    }

    public void setMinimumFractionDigits(int arg0) {
        ((android.icu.text.NumberFormat) real).setMinimumFractionDigits(arg0);
    }

    public void setMinimumIntegerDigits(int arg0) {
        ((android.icu.text.NumberFormat) real).setMinimumIntegerDigits(arg0);
    }

    public void setParseIntegerOnly(boolean arg0) {
        ((android.icu.text.NumberFormat) real).setParseIntegerOnly(arg0);
    }

    public void setParseStrict(boolean arg0) {
        ((android.icu.text.NumberFormat) real).setParseStrict(arg0);
    }

    public void setRoundingMode(int arg0) {
        ((android.icu.text.NumberFormat) real).setRoundingMode(arg0);
    }

    public static final int ACCOUNTINGCURRENCYSTYLE = android.icu.text.NumberFormat.ACCOUNTINGCURRENCYSTYLE;
    public static final int CASHCURRENCYSTYLE = android.icu.text.NumberFormat.CASHCURRENCYSTYLE;
    public static final int CURRENCYSTYLE = android.icu.text.NumberFormat.CURRENCYSTYLE;
    public static final int FRACTION_FIELD = android.icu.text.NumberFormat.FRACTION_FIELD;
    public static final int INTEGERSTYLE = android.icu.text.NumberFormat.INTEGERSTYLE;
    public static final int INTEGER_FIELD = android.icu.text.NumberFormat.INTEGER_FIELD;
    public static final int ISOCURRENCYSTYLE = android.icu.text.NumberFormat.ISOCURRENCYSTYLE;
    public static final int NUMBERSTYLE = android.icu.text.NumberFormat.NUMBERSTYLE;
    public static final int PERCENTSTYLE = android.icu.text.NumberFormat.PERCENTSTYLE;
    public static final int PLURALCURRENCYSTYLE = android.icu.text.NumberFormat.PLURALCURRENCYSTYLE;
    public static final int SCIENTIFICSTYLE = android.icu.text.NumberFormat.SCIENTIFICSTYLE;
    public static final int STANDARDCURRENCYSTYLE = android.icu.text.NumberFormat.STANDARDCURRENCYSTYLE;

    public static final class Field {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Field(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field wrap(android.icu.text.NumberFormat.Field real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.NumberFormat.Field getReal() {
            return (android.icu.text.NumberFormat.Field) real;
        }

        public android.icu.text.NumberFormat.Field unwrap() {
            return getReal();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field APPROXIMATELY_SIGN = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.APPROXIMATELY_SIGN);
        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field COMPACT = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.COMPACT);
        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field CURRENCY = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.CURRENCY);
        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field DECIMAL_SEPARATOR = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.DECIMAL_SEPARATOR);
        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field EXPONENT = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.EXPONENT);
        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field EXPONENT_SIGN = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.EXPONENT_SIGN);
        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field EXPONENT_SYMBOL = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.EXPONENT_SYMBOL);
        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field FRACTION = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.FRACTION);
        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field GROUPING_SEPARATOR = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.GROUPING_SEPARATOR);
        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field INTEGER = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.INTEGER);
        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field MEASURE_UNIT = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.MEASURE_UNIT);
        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field PERCENT = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.PERCENT);
        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field PERMILLE = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.PERMILLE);
        public static final com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field SIGN = com.micklab.dcg.wrapper.android.icu.text.NumberFormat.Field.wrap(android.icu.text.NumberFormat.Field.SIGN);

    }
}
