// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class DeadObjectException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeadObjectException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.DeadObjectException wrap(android.os.DeadObjectException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.DeadObjectException(real, (__DcgwBridgeToken) null);
    }

    public android.os.DeadObjectException getReal() {
        return (android.os.DeadObjectException) real;
    }

    public android.os.DeadObjectException unwrap() {
        return getReal();
    }

    public DeadObjectException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DeadObjectException#android.os.DeadObjectException()");
    }

    public DeadObjectException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DeadObjectException#android.os.DeadObjectException(java.lang.String)");
    }

}
