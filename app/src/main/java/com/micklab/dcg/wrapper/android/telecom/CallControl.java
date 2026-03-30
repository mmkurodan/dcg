// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallControl {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CallControl(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallControl wrap(android.telecom.CallControl real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallControl(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.CallControl getReal() {
        return (android.telecom.CallControl) real;
    }

    public android.telecom.CallControl unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getCallId() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(((android.telecom.CallControl) real).getCallId());
    }

    public void sendEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.telecom.CallControl) real).sendEvent(arg0, arg1 == null ? null : arg1.getReal());
    }

}
