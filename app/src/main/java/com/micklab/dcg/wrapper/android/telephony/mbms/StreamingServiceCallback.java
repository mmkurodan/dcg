// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class StreamingServiceCallback {
    private final android.telephony.mbms.StreamingServiceCallback real;

    public StreamingServiceCallback(android.telephony.mbms.StreamingServiceCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.StreamingServiceCallback wrap(android.telephony.mbms.StreamingServiceCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.StreamingServiceCallback(real);
    }

    public android.telephony.mbms.StreamingServiceCallback unwrap() {
        return real;
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
