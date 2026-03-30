// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class OnClickAction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OnClickAction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.OnClickAction wrap(android.service.autofill.OnClickAction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.OnClickAction(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.OnClickAction getReal() {
        return (android.service.autofill.OnClickAction) real;
    }

    public android.service.autofill.OnClickAction unwrap() {
        return getReal();
    }

}
