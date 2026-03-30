// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class CustomViolation {
    private final android.os.strictmode.CustomViolation real;

    public CustomViolation(android.os.strictmode.CustomViolation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.CustomViolation wrap(android.os.strictmode.CustomViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.CustomViolation(real);
    }

    public android.os.strictmode.CustomViolation unwrap() {
        return real;
    }

}
