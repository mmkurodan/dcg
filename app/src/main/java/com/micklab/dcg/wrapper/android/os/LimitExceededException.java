// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class LimitExceededException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LimitExceededException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.LimitExceededException wrap(android.os.LimitExceededException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.LimitExceededException(real, (__DcgwBridgeToken) null);
    }

    public android.os.LimitExceededException getReal() {
        return (android.os.LimitExceededException) real;
    }

    public android.os.LimitExceededException unwrap() {
        return getReal();
    }

    public LimitExceededException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.LimitExceededException#android.os.LimitExceededException()");
    }

    public LimitExceededException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.LimitExceededException#android.os.LimitExceededException(java.lang.String)");
    }

}
