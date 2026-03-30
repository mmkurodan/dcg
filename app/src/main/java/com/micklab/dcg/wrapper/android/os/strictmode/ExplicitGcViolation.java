// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class ExplicitGcViolation {
    private final android.os.strictmode.ExplicitGcViolation real;

    public ExplicitGcViolation(android.os.strictmode.ExplicitGcViolation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.ExplicitGcViolation wrap(android.os.strictmode.ExplicitGcViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.ExplicitGcViolation(real);
    }

    public android.os.strictmode.ExplicitGcViolation unwrap() {
        return real;
    }

}
