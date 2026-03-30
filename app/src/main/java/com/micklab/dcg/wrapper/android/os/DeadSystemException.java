// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class DeadSystemException {
    private final android.os.DeadSystemException real;

    public DeadSystemException(android.os.DeadSystemException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.DeadSystemException wrap(android.os.DeadSystemException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.DeadSystemException(real);
    }

    public android.os.DeadSystemException unwrap() {
        return real;
    }

    public DeadSystemException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DeadSystemException#android.os.DeadSystemException()");
    }

}
