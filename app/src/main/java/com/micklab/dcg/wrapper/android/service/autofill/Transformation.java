// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class Transformation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Transformation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Transformation wrap(android.service.autofill.Transformation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Transformation(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.Transformation getReal() {
        return (android.service.autofill.Transformation) real;
    }

    public android.service.autofill.Transformation unwrap() {
        return getReal();
    }

}
