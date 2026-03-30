// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class ServiceConnectionLeakedViolation {
    private final android.os.strictmode.ServiceConnectionLeakedViolation real;

    public ServiceConnectionLeakedViolation(android.os.strictmode.ServiceConnectionLeakedViolation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.ServiceConnectionLeakedViolation wrap(android.os.strictmode.ServiceConnectionLeakedViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.ServiceConnectionLeakedViolation(real);
    }

    public android.os.strictmode.ServiceConnectionLeakedViolation unwrap() {
        return real;
    }

}
