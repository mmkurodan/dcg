// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class FormattedValue {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FormattedValue(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.FormattedValue wrap(android.icu.text.FormattedValue real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.FormattedValue(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.FormattedValue getReal() {
        return (android.icu.text.FormattedValue) real;
    }

    public android.icu.text.FormattedValue unwrap() {
        return getReal();
    }

    public boolean nextPosition(com.micklab.dcg.wrapper.android.icu.text.ConstrainedFieldPosition arg0) {
        return ((android.icu.text.FormattedValue) real).nextPosition(arg0 == null ? null : arg0.getReal());
    }

    public java.text.AttributedCharacterIterator toCharacterIterator() {
        return ((android.icu.text.FormattedValue) real).toCharacterIterator();
    }

    public java.lang.String toString() {
        return ((android.icu.text.FormattedValue) real).toString();
    }

}
