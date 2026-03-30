// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class Collator {
    private final android.icu.text.Collator real;

    public Collator(android.icu.text.Collator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Collator wrap(android.icu.text.Collator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Collator(real);
    }

    public android.icu.text.Collator unwrap() {
        return real;
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return real.clone();
    }

    public com.micklab.dcg.wrapper.android.icu.text.Collator cloneAsThawed() {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(real.cloneAsThawed());
    }

    public int compare(java.lang.Object arg0, java.lang.Object arg1) {
        return real.compare(arg0, arg1);
    }

    public int compare(java.lang.String arg0, java.lang.String arg1) {
        return real.compare(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public boolean equals(java.lang.String arg0, java.lang.String arg1) {
        return real.equals(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.icu.text.Collator freeze() {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(real.freeze());
    }

    public static java.util.Locale[] getAvailableLocales() {
        return android.icu.text.Collator.getAvailableLocales();
    }

    public static android.icu.util.ULocale[] getAvailableULocales() {
        return android.icu.text.Collator.getAvailableULocales();
    }

    public com.micklab.dcg.wrapper.android.icu.text.CollationKey getCollationKey(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.CollationKey.wrap(real.getCollationKey(arg0));
    }

    public int getDecomposition() {
        return real.getDecomposition();
    }

    public static java.lang.String getDisplayName(java.util.Locale arg0) {
        return android.icu.text.Collator.getDisplayName(arg0);
    }

    public static java.lang.String getDisplayName(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return android.icu.text.Collator.getDisplayName(arg0 == null ? null : arg0.unwrap());
    }

    public static java.lang.String getDisplayName(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return android.icu.text.Collator.getDisplayName(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static java.lang.String getDisplayName(java.util.Locale arg0, java.util.Locale arg1) {
        return android.icu.text.Collator.getDisplayName(arg0, arg1);
    }

    public static int[] getEquivalentReorderCodes(int arg0) {
        return android.icu.text.Collator.getEquivalentReorderCodes(arg0);
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale getFunctionalEquivalent(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.text.Collator.getFunctionalEquivalent(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ULocale getFunctionalEquivalent(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1, boolean[] arg2) {
        return com.micklab.dcg.wrapper.android.icu.util.ULocale.wrap(android.icu.text.Collator.getFunctionalEquivalent(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Collator getInstance() {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(android.icu.text.Collator.getInstance());
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Collator getInstance(java.util.Locale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(android.icu.text.Collator.getInstance(arg0));
    }

    public static com.micklab.dcg.wrapper.android.icu.text.Collator getInstance(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(android.icu.text.Collator.getInstance(arg0 == null ? null : arg0.unwrap()));
    }

    public static java.lang.String[] getKeywordValues(java.lang.String arg0) {
        return android.icu.text.Collator.getKeywordValues(arg0);
    }

    public static java.lang.String[] getKeywordValuesForLocale(java.lang.String arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1, boolean arg2) {
        return android.icu.text.Collator.getKeywordValuesForLocale(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static java.lang.String[] getKeywords() {
        return android.icu.text.Collator.getKeywords();
    }

    public int getMaxVariable() {
        return real.getMaxVariable();
    }

    public int[] getReorderCodes() {
        return real.getReorderCodes();
    }

    public int getStrength() {
        return real.getStrength();
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSet getTailoredSet() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSet.wrap(real.getTailoredSet());
    }

    public com.micklab.dcg.wrapper.android.icu.util.VersionInfo getUCAVersion() {
        return com.micklab.dcg.wrapper.android.icu.util.VersionInfo.wrap(real.getUCAVersion());
    }

    public int getVariableTop() {
        return real.getVariableTop();
    }

    public com.micklab.dcg.wrapper.android.icu.util.VersionInfo getVersion() {
        return com.micklab.dcg.wrapper.android.icu.util.VersionInfo.wrap(real.getVersion());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isFrozen() {
        return real.isFrozen();
    }

    public void setDecomposition(int arg0) {
        real.setDecomposition(arg0);
    }

    public com.micklab.dcg.wrapper.android.icu.text.Collator setMaxVariable(int arg0) {
        return com.micklab.dcg.wrapper.android.icu.text.Collator.wrap(real.setMaxVariable(arg0));
    }

    public void setReorderCodes(int... arg0) {
        real.setReorderCodes(arg0);
    }

    public void setStrength(int arg0) {
        real.setStrength(arg0);
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
        private final android.icu.text.Collator.ReorderCodes real;

        public ReorderCodes(android.icu.text.Collator.ReorderCodes real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.icu.text.Collator.ReorderCodes wrap(android.icu.text.Collator.ReorderCodes real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.Collator.ReorderCodes(real);
        }

        public android.icu.text.Collator.ReorderCodes unwrap() {
            return real;
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
