// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallControlCallback {
    private final android.telecom.CallControlCallback real;

    public CallControlCallback(android.telecom.CallControlCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallControlCallback wrap(android.telecom.CallControlCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallControlCallback(real);
    }

    public android.telecom.CallControlCallback unwrap() {
        return real;
    }

}
