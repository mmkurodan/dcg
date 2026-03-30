// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class InstanceCountViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InstanceCountViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.InstanceCountViolation wrap(android.os.strictmode.InstanceCountViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.InstanceCountViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.InstanceCountViolation getReal() {
        return (android.os.strictmode.InstanceCountViolation) real;
    }

    public android.os.strictmode.InstanceCountViolation unwrap() {
        return getReal();
    }

    public long getNumberOfInstances() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.strictmode.InstanceCountViolation#getNumberOfInstances()");
    }

}
