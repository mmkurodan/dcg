// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class DeadSystemException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DeadSystemException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.DeadSystemException wrap(android.os.DeadSystemException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.DeadSystemException(real, (__DcgwBridgeToken) null);
    }

    public android.os.DeadSystemException getReal() {
        return (android.os.DeadSystemException) real;
    }

    public android.os.DeadSystemException unwrap() {
        return getReal();
    }

    public DeadSystemException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.DeadSystemException#android.os.DeadSystemException()");
    }

}
