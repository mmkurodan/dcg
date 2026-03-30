// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class LeakedClosableViolation {
    private final android.os.strictmode.LeakedClosableViolation real;

    public LeakedClosableViolation(android.os.strictmode.LeakedClosableViolation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.LeakedClosableViolation wrap(android.os.strictmode.LeakedClosableViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.LeakedClosableViolation(real);
    }

    public android.os.strictmode.LeakedClosableViolation unwrap() {
        return real;
    }

}
