// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.system;

public final class SystemCleaner {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SystemCleaner(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.system.SystemCleaner wrap(android.system.SystemCleaner real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.system.SystemCleaner(real, (__DcgwBridgeToken) null);
    }

    public android.system.SystemCleaner getReal() {
        return (android.system.SystemCleaner) real;
    }

    public android.system.SystemCleaner unwrap() {
        return getReal();
    }

    public static java.lang.ref.Cleaner cleaner() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.SystemCleaner#cleaner()");
    }

}
