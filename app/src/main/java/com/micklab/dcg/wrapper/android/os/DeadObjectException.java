// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class DeadObjectException {
    private final android.os.DeadObjectException real;

    public DeadObjectException(android.os.DeadObjectException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.DeadObjectException wrap(android.os.DeadObjectException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.DeadObjectException(real);
    }

    public android.os.DeadObjectException unwrap() {
        return real;
    }

    public DeadObjectException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DeadObjectException#android.os.DeadObjectException()");
    }

    public DeadObjectException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DeadObjectException#android.os.DeadObjectException(java.lang.String)");
    }

}
