// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.system;

public final class SystemCleaner {
    private final android.system.SystemCleaner real;

    public SystemCleaner(android.system.SystemCleaner real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.system.SystemCleaner wrap(android.system.SystemCleaner real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.system.SystemCleaner(real);
    }

    public android.system.SystemCleaner unwrap() {
        return real;
    }

    public static java.lang.ref.Cleaner cleaner() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.system.SystemCleaner#cleaner()");
    }

}
