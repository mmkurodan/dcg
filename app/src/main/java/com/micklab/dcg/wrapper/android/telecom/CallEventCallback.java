// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telecom;

public final class CallEventCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CallEventCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telecom.CallEventCallback wrap(android.telecom.CallEventCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telecom.CallEventCallback(real, (__DcgwBridgeToken) null);
    }

    public android.telecom.CallEventCallback getReal() {
        return (android.telecom.CallEventCallback) real;
    }

    public android.telecom.CallEventCallback unwrap() {
        return getReal();
    }

    public void onCallEndpointChanged(com.micklab.dcg.wrapper.android.telecom.CallEndpoint arg0) {
        ((android.telecom.CallEventCallback) real).onCallEndpointChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onCallStreamingFailed(int arg0) {
        ((android.telecom.CallEventCallback) real).onCallStreamingFailed(arg0);
    }

    public void onEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.telecom.CallEventCallback) real).onEvent(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onMuteStateChanged(boolean arg0) {
        ((android.telecom.CallEventCallback) real).onMuteStateChanged(arg0);
    }

    public void onVideoStateChanged(int arg0) {
        ((android.telecom.CallEventCallback) real).onVideoStateChanged(arg0);
    }

}
