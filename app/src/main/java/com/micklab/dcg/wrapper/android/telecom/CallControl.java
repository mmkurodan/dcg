// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallControl {
    private final android.telecom.CallControl real;

    public CallControl(android.telecom.CallControl real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallControl wrap(android.telecom.CallControl real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallControl(real);
    }

    public android.telecom.CallControl unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.ParcelUuid getCallId() {
        return com.micklab.dcg.wrapper.android.os.ParcelUuid.wrap(real.getCallId());
    }

    public void sendEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.sendEvent(arg0, arg1 == null ? null : arg1.unwrap());
    }

}
