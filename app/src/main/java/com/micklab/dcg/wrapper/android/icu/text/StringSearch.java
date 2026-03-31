// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class StringSearch {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StringSearch(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.StringSearch wrap(android.icu.text.StringSearch real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.StringSearch(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.StringSearch getReal() {
        return (android.icu.text.StringSearch) real;
    }

    public android.icu.text.StringSearch unwrap() {
        return getReal();
    }

    public StringSearch(java.lang.String arg0, java.lang.String arg1) {
        this(new android.icu.text.StringSearch(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public StringSearch(java.lang.String arg0, java.text.CharacterIterator arg1, java.util.Locale arg2) {
        this(new android.icu.text.StringSearch(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public StringSearch(java.lang.String arg0, java.text.CharacterIterator arg1, com.micklab.dcg.wrapper.android.icu.util.ULocale arg2) {
        this(new android.icu.text.StringSearch(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public StringSearch(java.lang.String arg0, java.text.CharacterIterator arg1, com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator arg2) {
        this(new android.icu.text.StringSearch(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public StringSearch(java.lang.String arg0, java.text.CharacterIterator arg1, com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator arg2, com.micklab.dcg.wrapper.android.icu.text.BreakIterator arg3) {
        this(new android.icu.text.StringSearch(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator getCollator() {
        return com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator.wrap(((android.icu.text.StringSearch) real).getCollator());
    }

    public int getIndex() {
        return ((android.icu.text.StringSearch) real).getIndex();
    }

    public java.lang.String getPattern() {
        return ((android.icu.text.StringSearch) real).getPattern();
    }

    public boolean isCanonical() {
        return ((android.icu.text.StringSearch) real).isCanonical();
    }

    public void reset() {
        ((android.icu.text.StringSearch) real).reset();
    }

    public void setCanonical(boolean arg0) {
        ((android.icu.text.StringSearch) real).setCanonical(arg0);
    }

    public void setCollator(com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator arg0) {
        ((android.icu.text.StringSearch) real).setCollator(arg0 == null ? null : arg0.getReal());
    }

    public void setIndex(int arg0) {
        ((android.icu.text.StringSearch) real).setIndex(arg0);
    }

    public void setPattern(java.lang.String arg0) {
        ((android.icu.text.StringSearch) real).setPattern(arg0);
    }

    public void setTarget(java.text.CharacterIterator arg0) {
        ((android.icu.text.StringSearch) real).setTarget(arg0);
    }

}
