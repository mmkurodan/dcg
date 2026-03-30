// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.lang;

public final class UCharacterCategory {
    private final android.icu.lang.UCharacterCategory real;

    public UCharacterCategory(android.icu.lang.UCharacterCategory real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.lang.UCharacterCategory wrap(android.icu.lang.UCharacterCategory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.lang.UCharacterCategory(real);
    }

    public android.icu.lang.UCharacterCategory unwrap() {
        return real;
    }

    public static java.lang.String toString(int arg0) {
        return android.icu.lang.UCharacterCategory.toString(arg0);
    }

}
