// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class StreamingServiceCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StreamingServiceCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.StreamingServiceCallback wrap(android.telephony.mbms.StreamingServiceCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.StreamingServiceCallback(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.mbms.StreamingServiceCallback getReal() {
        return (android.telephony.mbms.StreamingServiceCallback) real;
    }

    public android.telephony.mbms.StreamingServiceCallback unwrap() {
        return getReal();
    }

    public StreamingServiceCallback() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.StreamingServiceCallback#android.telephony.mbms.StreamingServiceCallback()");
    }

    public void onBroadcastSignalStrengthUpdated(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.StreamingServiceCallback#onBroadcastSignalStrengthUpdated(int)");
    }

    public void onError(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.StreamingServiceCallback#onError(int,java.lang.String)");
    }

    public void onMediaDescriptionUpdated() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.StreamingServiceCallback#onMediaDescriptionUpdated()");
    }

    public void onStreamMethodUpdated(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.StreamingServiceCallback#onStreamMethodUpdated(int)");
    }

    public void onStreamStateUpdated(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.StreamingServiceCallback#onStreamStateUpdated(int,int)");
    }


}
