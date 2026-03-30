// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class SimpleNotation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SimpleNotation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.SimpleNotation wrap(android.icu.number.SimpleNotation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.SimpleNotation(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.SimpleNotation getReal() {
        return (android.icu.number.SimpleNotation) real;
    }

    public android.icu.number.SimpleNotation unwrap() {
        return getReal();
    }

}
