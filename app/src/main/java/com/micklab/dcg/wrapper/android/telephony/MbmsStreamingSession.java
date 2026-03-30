// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class MbmsStreamingSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MbmsStreamingSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.MbmsStreamingSession wrap(android.telephony.MbmsStreamingSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.MbmsStreamingSession(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.MbmsStreamingSession getReal() {
        return (android.telephony.MbmsStreamingSession) real;
    }

    public android.telephony.MbmsStreamingSession unwrap() {
        return getReal();
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
