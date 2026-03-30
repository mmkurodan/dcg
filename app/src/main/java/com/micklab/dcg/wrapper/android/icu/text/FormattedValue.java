// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class FormattedValue {
    private final android.icu.text.FormattedValue real;

    public FormattedValue(android.icu.text.FormattedValue real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.FormattedValue wrap(android.icu.text.FormattedValue real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.FormattedValue(real);
    }

    public android.icu.text.FormattedValue unwrap() {
        return real;
    }

    public boolean nextPosition(com.micklab.dcg.wrapper.android.icu.text.ConstrainedFieldPosition arg0) {
        return real.nextPosition(arg0 == null ? null : arg0.unwrap());
    }

    public java.text.AttributedCharacterIterator toCharacterIterator() {
        return real.toCharacterIterator();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
