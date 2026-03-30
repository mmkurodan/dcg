// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class StringSearch {
    private final android.icu.text.StringSearch real;

    public StringSearch(android.icu.text.StringSearch real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.StringSearch wrap(android.icu.text.StringSearch real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.StringSearch(real);
    }

    public android.icu.text.StringSearch unwrap() {
        return real;
    }

    public StringSearch(java.lang.String arg0, java.lang.String arg1) {
        this(new android.icu.text.StringSearch(arg0, arg1));
    }

    public StringSearch(java.lang.String arg0, java.text.CharacterIterator arg1, com.micklab.dcg.wrapper.android.icu.util.ULocale arg2) {
        this(new android.icu.text.StringSearch(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public StringSearch(java.lang.String arg0, java.text.CharacterIterator arg1, java.util.Locale arg2) {
        this(new android.icu.text.StringSearch(arg0, arg1, arg2));
    }

    public StringSearch(java.lang.String arg0, java.text.CharacterIterator arg1, com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator arg2) {
        this(new android.icu.text.StringSearch(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public StringSearch(java.lang.String arg0, java.text.CharacterIterator arg1, com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator arg2, com.micklab.dcg.wrapper.android.icu.text.BreakIterator arg3) {
        this(new android.icu.text.StringSearch(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator getCollator() {
        return com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator.wrap(real.getCollator());
    }

    public int getIndex() {
        return real.getIndex();
    }

    public java.lang.String getPattern() {
        return real.getPattern();
    }

    public boolean isCanonical() {
        return real.isCanonical();
    }

    public void reset() {
        real.reset();
    }

    public void setCanonical(boolean arg0) {
        real.setCanonical(arg0);
    }

    public void setCollator(com.micklab.dcg.wrapper.android.icu.text.RuleBasedCollator arg0) {
        real.setCollator(arg0 == null ? null : arg0.unwrap());
    }

    public void setIndex(int arg0) {
        real.setIndex(arg0);
    }

    public void setPattern(java.lang.String arg0) {
        real.setPattern(arg0);
    }

    public void setTarget(java.text.CharacterIterator arg0) {
        real.setTarget(arg0);
    }

}
