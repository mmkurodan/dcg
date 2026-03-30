// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.app;

public final class ForegroundServiceTypeException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ForegroundServiceTypeException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.app.ForegroundServiceTypeException wrap(android.app.ForegroundServiceTypeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.app.ForegroundServiceTypeException(real, (__DcgwBridgeToken) null);
    }

    public android.app.ForegroundServiceTypeException getReal() {
        return (android.app.ForegroundServiceTypeException) real;
    }

    public android.app.ForegroundServiceTypeException unwrap() {
        return getReal();
    }

}
