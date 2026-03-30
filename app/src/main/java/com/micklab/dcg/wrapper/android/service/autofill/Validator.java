// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class Validator {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Validator(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Validator wrap(android.service.autofill.Validator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Validator(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.Validator getReal() {
        return (android.service.autofill.Validator) real;
    }

    public android.service.autofill.Validator unwrap() {
        return getReal();
    }

}
