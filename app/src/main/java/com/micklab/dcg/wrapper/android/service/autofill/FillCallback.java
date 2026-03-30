// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class FillCallback {
    private final android.service.autofill.FillCallback real;

    public FillCallback(android.service.autofill.FillCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.FillCallback wrap(android.service.autofill.FillCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.FillCallback(real);
    }

    public android.service.autofill.FillCallback unwrap() {
        return real;
    }

    public void onFailure(java.lang.CharSequence arg0) {
        real.onFailure(arg0);
    }

    public void onSuccess(com.micklab.dcg.wrapper.android.service.autofill.FillResponse arg0) {
        real.onSuccess(arg0 == null ? null : arg0.unwrap());
    }

}
