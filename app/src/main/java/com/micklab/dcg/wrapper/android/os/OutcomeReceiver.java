// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os;

public final class OutcomeReceiver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OutcomeReceiver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.OutcomeReceiver wrap(android.os.OutcomeReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.OutcomeReceiver(real, (__DcgwBridgeToken) null);
    }

    public android.os.OutcomeReceiver getReal() {
        return (android.os.OutcomeReceiver) real;
    }

    public android.os.OutcomeReceiver unwrap() {
        return getReal();
    }

    public void onError(java.lang.Throwable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.OutcomeReceiver#onError(java.lang.Throwable)");
    }

    public void onResult(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.os.OutcomeReceiver#onResult(java.lang.Object)");
    }

}
