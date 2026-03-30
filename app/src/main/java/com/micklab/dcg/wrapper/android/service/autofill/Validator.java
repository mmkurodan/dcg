// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class Validator {
    private final android.service.autofill.Validator real;

    public Validator(android.service.autofill.Validator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Validator wrap(android.service.autofill.Validator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Validator(real);
    }

    public android.service.autofill.Validator unwrap() {
        return real;
    }

}
