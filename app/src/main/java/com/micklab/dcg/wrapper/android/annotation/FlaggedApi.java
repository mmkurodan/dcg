// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.annotation;

public final class FlaggedApi {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FlaggedApi(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.annotation.FlaggedApi wrap(java.lang.Object real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.annotation.FlaggedApi(real, (__DcgwBridgeToken) null);
    }

    public java.lang.Object getReal() {
        return real;
    }

    public java.lang.Object unwrap() {
        return getReal();
    }
}
