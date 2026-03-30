// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallEventCallback {
    private final android.telecom.CallEventCallback real;

    public CallEventCallback(android.telecom.CallEventCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallEventCallback wrap(android.telecom.CallEventCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallEventCallback(real);
    }

    public android.telecom.CallEventCallback unwrap() {
        return real;
    }

    public void onCallEndpointChanged(com.micklab.dcg.wrapper.android.telecom.CallEndpoint arg0) {
        real.onCallEndpointChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onCallStreamingFailed(int arg0) {
        real.onCallStreamingFailed(arg0);
    }

    public void onEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.onEvent(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onMuteStateChanged(boolean arg0) {
        real.onMuteStateChanged(arg0);
    }

    public void onVideoStateChanged(int arg0) {
        real.onVideoStateChanged(arg0);
    }

}
