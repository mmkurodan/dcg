// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class SaveCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SaveCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.SaveCallback wrap(android.service.autofill.SaveCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.SaveCallback(real, (__DcgwBridgeToken) null);
    }

    public android.service.autofill.SaveCallback getReal() {
        return (android.service.autofill.SaveCallback) real;
    }

    public android.service.autofill.SaveCallback unwrap() {
        return getReal();
    }

    public void onFailure(java.lang.CharSequence arg0) {
        ((android.service.autofill.SaveCallback) real).onFailure(arg0);
    }

    public void onSuccess() {
        ((android.service.autofill.SaveCallback) real).onSuccess();
    }

    public void onSuccess(com.micklab.dcg.wrapper.android.content.IntentSender arg0) {
        ((android.service.autofill.SaveCallback) real).onSuccess(arg0 == null ? null : arg0.getReal());
    }

}
