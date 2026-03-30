// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class InstanceCountViolation {
    private final android.os.strictmode.InstanceCountViolation real;

    public InstanceCountViolation(android.os.strictmode.InstanceCountViolation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.InstanceCountViolation wrap(android.os.strictmode.InstanceCountViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.InstanceCountViolation(real);
    }

    public android.os.strictmode.InstanceCountViolation unwrap() {
        return real;
    }

    public long getNumberOfInstances() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.strictmode.InstanceCountViolation#getNumberOfInstances()");
    }

}
