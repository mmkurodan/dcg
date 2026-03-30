// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class UnicodeSetIterator {
    private final android.icu.text.UnicodeSetIterator real;

    public UnicodeSetIterator(android.icu.text.UnicodeSetIterator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSetIterator wrap(android.icu.text.UnicodeSetIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSetIterator(real);
    }

    public android.icu.text.UnicodeSetIterator unwrap() {
        return real;
    }

    public UnicodeSetIterator() {
        this(new android.icu.text.UnicodeSetIterator());
    }

    public UnicodeSetIterator(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        this(new android.icu.text.UnicodeSetIterator(arg0 == null ? null : arg0.unwrap()));
    }

    public java.lang.String getString() {
        return real.getString();
    }

    public boolean next() {
        return real.next();
    }

    public boolean nextRange() {
        return real.nextRange();
    }

    public void reset() {
        real.reset();
    }

    public void reset(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        real.reset(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSetIterator skipToStrings() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSetIterator.wrap(real.skipToStrings());
    }

    public static final int IS_STRING = android.icu.text.UnicodeSetIterator.IS_STRING;

}
