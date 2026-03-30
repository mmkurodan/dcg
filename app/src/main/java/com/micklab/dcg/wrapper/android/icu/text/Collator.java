// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class Collator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Collator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Collator wrap(android.icu.text.Collator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Collator(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.Collator getReal() {
        return (android.icu.text.Collator) real;
    }

    public android.icu.text.Collator unwrap() {
        return getReal();
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return ((android.icu.text.Collator) real).clone();
    }

    public com.micklab.dcg.wrapper.android.icu.text.Collator cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(((android.icu.text.Collator) real).cloneAsThawed());
    }

    public int compare(java.lang.Object arg0, java.lang.Object arg1) {
        return ((android.icu.text.Collator) real).compare(arg0, arg1);
    }

    public int compare(java.lang.String arg0, java.lang.String arg1) {
        return ((android.icu.text.Collator) real).compare(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.icu.text.Collator) real).equals(arg0);
    }

    public boolean equals(java.lang.String arg0, java.lang.String arg1) {
        return ((android.icu.text.Collator) real).equals(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.icu.text.Collator freeze() {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(((android.icu.text.Collator) real).freeze());
    }

    public static java.util.Locale[] getAvailableLocales() {
        return android.icu.text.Collator.getAvailableLocales();
    }

    public static android.icu.util.ULocale[] getAvailableULocales() {
        return android.icu.text.Collator.getAvailableULocales();
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationKey getCollationKey(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationKey.wrap(((android.icu.text.Collator) real).getCollationKey(arg0));
    }

    public int getDecomposition() {
        return ((android.icu.text.Collator) real).getDecomposition();
    }

    public static java.lang.String getDisplayName(java.util.Locale arg0) {
        return android.icu.text.Collator.getDisplayName(arg0);
    }

    public static java.lang.String getDisplayName(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return android.icu.text.Collator.getDisplayName(arg0 == null ? null : arg0.getReal());
    }

    public static java.lang.String getDisplayName(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return android.icu.text.Collator.getDisplayName(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static java.lang.String getDisplayName(java.util.Locale arg0, java.util.Locale arg1) {
        return android.icu.text.Collator.getDisplayName(arg0, arg1);
    }

    public static int[] getEquivalentReorderCodes(int arg0) {
        return android.icu.text.Collator.getEquivalentReorderCodes(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale getFunctionalEquivalent(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.text.Collator.getFunctionalEquivalent(arg0, arg1 == null ? null : arg1.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale getFunctionalEquivalent(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1, boolean[] arg2) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.text.Collator.getFunctionalEquivalent(arg0, arg1 == null ? null : arg1.getReal(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Collator getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(android.icu.text.Collator.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Collator getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(android.icu.text.Collator.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Collator getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(android.icu.text.Collator.getInstance(arg0 == null ? null : arg0.getReal()));
    }

    public static java.lang.String[] getKeywordValues(java.lang.String arg0) {
        return android.icu.text.Collator.getKeywordValues(arg0);
    }

    public static java.lang.String[] getKeywordValuesForLocale(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1, boolean arg2) {
        return android.icu.text.Collator.getKeywordValuesForLocale(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public static java.lang.String[] getKeywords() {
        return android.icu.text.Collator.getKeywords();
    }

    public int getMaxVariable() {
        return ((android.icu.text.Collator) real).getMaxVariable();
    }

    public int[] getReorderCodes() {
        return ((android.icu.text.Collator) real).getReorderCodes();
    }

    public int getStrength() {
        return ((android.icu.text.Collator) real).getStrength();
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet getTailoredSet() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(((android.icu.text.Collator) real).getTailoredSet());
    }

    public com.micklab.dcg.wrapper.android.icu.util.VersionInfo getUCAVersion() {
        return com.micklab.dcg.wrapper.android.icu.util.VersionInfo.wrap(((android.icu.text.Collator) real).getUCAVersion());
    }

    public int getVariableTop() {
        return ((android.icu.text.Collator) real).getVariableTop();
    }

    public com.micklab.dcg.wrapper.android.icu.util.VersionInfo getVersion() {
        return com.micklab.dcg.wrapper.android.icu.util.VersionInfo.wrap(((android.icu.text.Collator) real).getVersion());
    }

    public int hashCode() {
        return ((android.icu.text.Collator) real).hashCode();
    }

    public boolean isFrozen() {
        return ((android.icu.text.Collator) real).isFrozen();
    }

    public void setDecomposition(int arg0) {
        ((android.icu.text.Collator) real).setDecomposition(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.Collator setMaxVariable(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(((android.icu.text.Collator) real).setMaxVariable(arg0));
    }

    public void setReorderCodes(int... arg0) {
        ((android.icu.text.Collator) real).setReorderCodes(arg0);
    }

    public void setStrength(int arg0) {
        ((android.icu.text.Collator) real).setStrength(arg0);
    }

    public static final int CANONICAL_DECOMPOSITION = android.icu.text.Collator.CANONICAL_DECOMPOSITION;
    public static final int FULL_DECOMPOSITION = android.icu.text.Collator.FULL_DECOMPOSITION;
    public static final int IDENTICAL = android.icu.text.Collator.IDENTICAL;
    public static final int NO_DECOMPOSITION = android.icu.text.Collator.NO_DECOMPOSITION;
    public static final int PRIMARY = android.icu.text.Collator.PRIMARY;
    public static final int QUATERNARY = android.icu.text.Collator.QUATERNARY;
    public static final int SECONDARY = android.icu.text.Collator.SECONDARY;
    public static final int TERTIARY = android.icu.text.Collator.TERTIARY;

    public static final class ReorderCodes {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ReorderCodes(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.Collator.ReorderCodes wrap(android.icu.text.Collator.ReorderCodes real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Collator.ReorderCodes(real, (__DcgwBridgeToken) null);
        }

        public android.icu.text.Collator.ReorderCodes getReal() {
            return (android.icu.text.Collator.ReorderCodes) real;
        }

        public android.icu.text.Collator.ReorderCodes unwrap() {
            return getReal();
        }

        public static final int CURRENCY = android.icu.text.Collator.ReorderCodes.CURRENCY;
        public static final int DEFAULT = android.icu.text.Collator.ReorderCodes.DEFAULT;
        public static final int DIGIT = android.icu.text.Collator.ReorderCodes.DIGIT;
        public static final int FIRST = android.icu.text.Collator.ReorderCodes.FIRST;
        public static final int NONE = android.icu.text.Collator.ReorderCodes.NONE;
        public static final int OTHERS = android.icu.text.Collator.ReorderCodes.OTHERS;
        public static final int PUNCTUATION = android.icu.text.Collator.ReorderCodes.PUNCTUATION;
        public static final int SPACE = android.icu.text.Collator.ReorderCodes.SPACE;
        public static final int SYMBOL = android.icu.text.Collator.ReorderCodes.SYMBOL;

    }
}
