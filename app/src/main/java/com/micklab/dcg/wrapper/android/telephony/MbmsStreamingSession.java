// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class MbmsStreamingSession {
    private final android.telephony.MbmsStreamingSession real;

    public MbmsStreamingSession(android.telephony.MbmsStreamingSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.MbmsStreamingSession wrap(android.telephony.MbmsStreamingSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.MbmsStreamingSession(real);
    }

    public android.telephony.MbmsStreamingSession unwrap() {
        return real;
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsStreamingSession#close()");
    }

    public static com.micklab.dcg.wrapper.android.telephony.MbmsStreamingSession create(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.telephony.mbms.MbmsStreamingSessionCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsStreamingSession#create(android.content.Context,java.util.concurrent.Executor,android.telephony.mbms.MbmsStreamingSessionCallback)");
    }

    public static com.micklab.dcg.wrapper.android.telephony.MbmsStreamingSession create(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.concurrent.Executor arg1, int arg2, com.micklab.dcg.wrapper.android.telephony.mbms.MbmsStreamingSessionCallback arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsStreamingSession#create(android.content.Context,java.util.concurrent.Executor,int,android.telephony.mbms.MbmsStreamingSessionCallback)");
    }

    public com.micklab.dcg.wrapper.android.telephony.mbms.StreamingService startStreaming(com.micklab.dcg.wrapper.android.telephony.mbms.StreamingServiceInfo arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.telephony.mbms.StreamingServiceCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsStreamingSession#startStreaming(android.telephony.mbms.StreamingServiceInfo,java.util.concurrent.Executor,android.telephony.mbms.StreamingServiceCallback)");
    }

}
