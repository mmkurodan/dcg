// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class FloatMath {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FloatMath(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.FloatMath wrap(android.util.FloatMath real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.FloatMath(real, (__DcgwBridgeToken) null);
    }

    public android.util.FloatMath getReal() {
        return (android.util.FloatMath) real;
    }

    public android.util.FloatMath unwrap() {
        return getReal();
    }

}
