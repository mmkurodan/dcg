// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class OperationCanceledException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OperationCanceledException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.OperationCanceledException wrap(android.os.OperationCanceledException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.OperationCanceledException(real, (__DcgwBridgeToken) null);
    }

    public android.os.OperationCanceledException getReal() {
        return (android.os.OperationCanceledException) real;
    }

    public android.os.OperationCanceledException unwrap() {
        return getReal();
    }

    public OperationCanceledException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.OperationCanceledException#android.os.OperationCanceledException()");
    }

    public OperationCanceledException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.OperationCanceledException#android.os.OperationCanceledException(java.lang.String)");
    }

}
