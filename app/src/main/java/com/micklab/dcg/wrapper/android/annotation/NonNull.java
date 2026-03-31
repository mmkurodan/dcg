// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.annotation;

public final class NonNull {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NonNull(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.annotation.NonNull wrap(java.lang.Object real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.annotation.NonNull(real, (__DcgwBridgeToken) null);
    }

    public java.lang.Object getReal() {
        return real;
    }

    public java.lang.Object unwrap() {
        return getReal();
    }
}
