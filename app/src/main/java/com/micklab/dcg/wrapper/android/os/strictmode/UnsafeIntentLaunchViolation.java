// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class UnsafeIntentLaunchViolation {
    private final android.os.strictmode.UnsafeIntentLaunchViolation real;

    public UnsafeIntentLaunchViolation(android.os.strictmode.UnsafeIntentLaunchViolation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.UnsafeIntentLaunchViolation wrap(android.os.strictmode.UnsafeIntentLaunchViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.UnsafeIntentLaunchViolation(real);
    }

    public android.os.strictmode.UnsafeIntentLaunchViolation unwrap() {
        return real;
    }

    public UnsafeIntentLaunchViolation(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.strictmode.UnsafeIntentLaunchViolation#android.os.strictmode.UnsafeIntentLaunchViolation(android.content.Intent)");
    }

    public com.micklab.dcg.wrapper.android.content.Intent getIntent() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.strictmode.UnsafeIntentLaunchViolation#getIntent()");
    }

}
