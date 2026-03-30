// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallControlCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CallControlCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallControlCallback wrap(android.telecom.CallControlCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallControlCallback(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.CallControlCallback getReal() {
        return (android.telecom.CallControlCallback) real;
    }

    public android.telecom.CallControlCallback unwrap() {
        return getReal();
    }

}
