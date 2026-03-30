// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class Sanitizer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Sanitizer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Sanitizer wrap(android.service.autofill.Sanitizer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Sanitizer(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.Sanitizer getReal() {
        return (android.service.autofill.Sanitizer) real;
    }

    public android.service.autofill.Sanitizer unwrap() {
        return getReal();
    }

}
