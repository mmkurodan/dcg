// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.autofill;

public final class Sanitizer {
    private final android.service.autofill.Sanitizer real;

    public Sanitizer(android.service.autofill.Sanitizer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.autofill.Sanitizer wrap(android.service.autofill.Sanitizer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.autofill.Sanitizer(real);
    }

    public android.service.autofill.Sanitizer unwrap() {
        return real;
    }

}
