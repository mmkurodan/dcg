// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.text;

public final class UFormat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UFormat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.text.UFormat wrap(android.icu.text.UFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.text.UFormat(real, (__DcgwBridgeToken) null);
    }

    public android.icu.text.UFormat getReal() {
        return (android.icu.text.UFormat) real;
    }

    public android.icu.text.UFormat unwrap() {
        return getReal();
    }

}
