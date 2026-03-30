// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.lang;

public final class UCharacterCategory {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UCharacterCategory(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.lang.UCharacterCategory wrap(android.icu.lang.UCharacterCategory real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.lang.UCharacterCategory(real, (__DcgwBridgeToken) null);
    }

    public android.icu.lang.UCharacterCategory getReal() {
        return (android.icu.lang.UCharacterCategory) real;
    }

    public android.icu.lang.UCharacterCategory unwrap() {
        return getReal();
    }

    public static java.lang.String toString(int arg0) {
        return android.icu.lang.UCharacterCategory.toString(arg0);
    }

}
