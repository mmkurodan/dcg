// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class Output {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Output(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.Output wrap(android.icu.util.Output real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.Output(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.Output getReal() {
        return (android.icu.util.Output) real;
    }

    public android.icu.util.Output unwrap() {
        return getReal();
    }

    public Output() {
        this(new android.icu.util.Output(), (__DcgwBridgeToken) null);
    }

    public Output(java.lang.Object arg0) {
        this(new android.icu.util.Output(arg0), (__DcgwBridgeToken) null);
    }

    public java.lang.String toString() {
        return ((android.icu.util.Output) real).toString();
    }


}
