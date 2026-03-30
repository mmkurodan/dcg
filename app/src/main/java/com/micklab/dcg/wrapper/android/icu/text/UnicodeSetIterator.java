// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class UnicodeSetIterator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UnicodeSetIterator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UnicodeSetIterator wrap(android.icu.text.UnicodeSetIterator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UnicodeSetIterator(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.UnicodeSetIterator getReal() {
        return (android.icu.text.UnicodeSetIterator) real;
    }

    public android.icu.text.UnicodeSetIterator unwrap() {
        return getReal();
    }

    public UnicodeSetIterator() {
        this(new android.icu.text.UnicodeSetIterator(), (__DcgwBridgeToken) null);
    }

    public UnicodeSetIterator(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        this(new android.icu.text.UnicodeSetIterator(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public java.lang.String getString() {
        return ((android.icu.text.UnicodeSetIterator) real).getString();
    }

    public boolean next() {
        return ((android.icu.text.UnicodeSetIterator) real).next();
    }

    public boolean nextRange() {
        return ((android.icu.text.UnicodeSetIterator) real).nextRange();
    }

    public void reset() {
        ((android.icu.text.UnicodeSetIterator) real).reset();
    }

    public void reset(com.micklab.dcg.wrapper.android.icu.text.UnicodeSet arg0) {
        ((android.icu.text.UnicodeSetIterator) real).reset(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.icu.text.UnicodeSetIterator skipToStrings() {
        return com.micklab.dcg.wrapper.android.icu.text.UnicodeSetIterator.wrap(((android.icu.text.UnicodeSetIterator) real).skipToStrings());
    }

    public static final int IS_STRING = android.icu.text.UnicodeSetIterator.IS_STRING;

}
