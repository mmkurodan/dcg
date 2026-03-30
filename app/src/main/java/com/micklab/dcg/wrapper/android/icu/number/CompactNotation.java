// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.number;

public final class CompactNotation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CompactNotation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.number.CompactNotation wrap(android.icu.number.CompactNotation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.number.CompactNotation(real, (__DcgwBridgeToken) null);
    }

    public android.icu.number.CompactNotation getReal() {
        return (android.icu.number.CompactNotation) real;
    }

    public android.icu.number.CompactNotation unwrap() {
        return getReal();
    }

}
