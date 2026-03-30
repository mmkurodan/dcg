// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.lang;

public final class UCharacterDirection {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UCharacterDirection(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.lang.UCharacterDirection wrap(android.icu.lang.UCharacterDirection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.lang.UCharacterDirection(real, (__DcgwBridgeToken) null);
    }

    public android.icu.lang.UCharacterDirection getReal() {
        return (android.icu.lang.UCharacterDirection) real;
    }

    public android.icu.lang.UCharacterDirection unwrap() {
        return getReal();
    }

    public static java.lang.String toString(int arg0) {
        return android.icu.lang.UCharacterDirection.toString(arg0);
    }

}
