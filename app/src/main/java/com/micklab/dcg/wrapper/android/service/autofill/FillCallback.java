// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class FillCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FillCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.FillCallback wrap(android.service.autofill.FillCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FillCallback(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.FillCallback getReal() {
        return (android.service.autofill.FillCallback) real;
    }

    public android.service.autofill.FillCallback unwrap() {
        return getReal();
    }

    public void onFailure(java.lang.CharSequence arg0) {
        ((android.service.autofill.FillCallback) real).onFailure(arg0);
    }

    public void onSuccess(com.micklab.dcg.wrapper.android.service.autofill.FillResponse arg0) {
        ((android.service.autofill.FillCallback) real).onSuccess(arg0 == null ? null : arg0.getReal());
    }

}
