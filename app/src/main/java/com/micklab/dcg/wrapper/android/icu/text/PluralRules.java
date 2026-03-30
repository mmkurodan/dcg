// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class PluralRules {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PluralRules(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.PluralRules wrap(android.icu.text.PluralRules real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.PluralRules(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.PluralRules getReal() {
        return (android.icu.text.PluralRules) real;
    }

    public android.icu.text.PluralRules unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.PluralRules createRules(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.PluralRules.wrap(android.icu.text.PluralRules.createRules(arg0));
    }

    public boolean equals(com.micklab.dcg.wrapper.android.icu.text.PluralRules arg0) {
        return ((android.icu.text.PluralRules) real).equals(arg0 == null ? null : arg0.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.PluralRules) real).equals(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.text.PluralRules forLocale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.PluralRules.wrap(android.icu.text.PluralRules.forLocale(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.PluralRules forLocale(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.PluralRules.wrap(android.icu.text.PluralRules.forLocale(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.PluralRules forLocale(java.util.Locale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.PluralRules.wrap(android.icu.text.PluralRules.forLocale(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.PluralRules forLocale(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType arg1) {
        return com.micklab.dcg.wrapper.android.icu.text.PluralRules.wrap(android.icu.text.PluralRules.forLocale(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public double getUniqueKeywordValue(java.lang.String arg0) {
        return ((android.icu.text.PluralRules) real).getUniqueKeywordValue(arg0);
    }

    public int hashCode() {
        return ((android.icu.text.PluralRules) real).hashCode();
    }

    public static com.micklab.dcg.wrapper.android.icu.text.PluralRules parseDescription(java.lang.String arg0) throws java.text.ParseException {
        return com.micklab.dcg.wrapper.android.icu.text.PluralRules.wrap(android.icu.text.PluralRules.parseDescription(arg0));
    }

    public java.lang.String select(com.micklab.dcg.wrapper.android.icu.number.FormattedNumber arg0) {
        return ((android.icu.text.PluralRules) real).select(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String select(com.micklab.dcg.wrapper.android.icu.number.FormattedNumberRange arg0) {
        return ((android.icu.text.PluralRules) real).select(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String select(double arg0) {
        return ((android.icu.text.PluralRules) real).select(arg0);
    }

    public java.lang.String toString() {
        return ((android.icu.text.PluralRules) real).toString();
    }

    public static final com.micklab.dcg.wrapper.android.icu.text.PluralRules DEFAULT = com.micklab.dcg.wrapper.android.icu.text.PluralRules.wrap(android.icu.text.PluralRules.DEFAULT);
    public static final java.lang.String KEYWORD_FEW = android.icu.text.PluralRules.KEYWORD_FEW;
    public static final java.lang.String KEYWORD_MANY = android.icu.text.PluralRules.KEYWORD_MANY;
    public static final java.lang.String KEYWORD_ONE = android.icu.text.PluralRules.KEYWORD_ONE;
    public static final java.lang.String KEYWORD_OTHER = android.icu.text.PluralRules.KEYWORD_OTHER;
    public static final java.lang.String KEYWORD_TWO = android.icu.text.PluralRules.KEYWORD_TWO;
    public static final java.lang.String KEYWORD_ZERO = android.icu.text.PluralRules.KEYWORD_ZERO;
    public static final double NO_UNIQUE_VALUE = android.icu.text.PluralRules.NO_UNIQUE_VALUE;

    public static final class PluralType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PluralType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType wrap(android.icu.text.PluralRules.PluralType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.PluralRules.PluralType getReal() {
            return (android.icu.text.PluralRules.PluralType) real;
        }

        public android.icu.text.PluralRules.PluralType unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType.wrap(android.icu.text.PluralRules.PluralType.valueOf(arg0));
        }

        public static android.icu.text.PluralRules.PluralType[] values() {
            return android.icu.text.PluralRules.PluralType.values();
        }

        public static final com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType CARDINAL = com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType.wrap(android.icu.text.PluralRules.PluralType.CARDINAL);
        public static final com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType ORDINAL = com.micklab.dcg.wrapper.android.icu.text.PluralRules.PluralType.wrap(android.icu.text.PluralRules.PluralType.ORDINAL);

    }
}
