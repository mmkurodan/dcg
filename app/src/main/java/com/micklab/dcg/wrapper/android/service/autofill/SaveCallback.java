// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class SaveCallback {
    private final android.service.autofill.SaveCallback real;

    public SaveCallback(android.service.autofill.SaveCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.SaveCallback wrap(android.service.autofill.SaveCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.SaveCallback(real);
    }

    public android.service.autofill.SaveCallback unwrap() {
        return real;
    }

    public void onFailure(java.lang.CharSequence arg0) {
        real.onFailure(arg0);
    }

    public void onSuccess() {
        real.onSuccess();
    }

    public void onSuccess(com.micklab.dcg.wrapper.android.content.IntentSender arg0) {
        real.onSuccess(arg0 == null ? null : arg0.unwrap());
    }

}
