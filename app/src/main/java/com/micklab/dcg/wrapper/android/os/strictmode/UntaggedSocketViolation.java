// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class UntaggedSocketViolation {
    private final android.os.strictmode.UntaggedSocketViolation real;

    public UntaggedSocketViolation(android.os.strictmode.UntaggedSocketViolation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.UntaggedSocketViolation wrap(android.os.strictmode.UntaggedSocketViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.UntaggedSocketViolation(real);
    }

    public android.os.strictmode.UntaggedSocketViolation unwrap() {
        return real;
    }

}
