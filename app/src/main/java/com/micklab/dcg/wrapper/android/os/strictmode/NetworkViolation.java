// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class NetworkViolation {
    private final android.os.strictmode.NetworkViolation real;

    public NetworkViolation(android.os.strictmode.NetworkViolation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.NetworkViolation wrap(android.os.strictmode.NetworkViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.NetworkViolation(real);
    }

    public android.os.strictmode.NetworkViolation unwrap() {
        return real;
    }

}
