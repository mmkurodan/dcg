// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class Validators {
    private final android.service.autofill.Validators real;

    public Validators(android.service.autofill.Validators real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Validators wrap(android.service.autofill.Validators real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Validators(real);
    }

    public android.service.autofill.Validators unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Validator and(android.service.autofill.Validator... arg0) {
        return com.micklab.dcg.wrapper.android.service.autofill.Validator.wrap(android.service.autofill.Validators.and(arg0));
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Validator not(com.micklab.dcg.wrapper.android.service.autofill.Validator arg0) {
        return com.micklab.dcg.wrapper.android.service.autofill.Validator.wrap(android.service.autofill.Validators.not(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Validator or(android.service.autofill.Validator... arg0) {
        return com.micklab.dcg.wrapper.android.service.autofill.Validator.wrap(android.service.autofill.Validators.or(arg0));
    }

}
