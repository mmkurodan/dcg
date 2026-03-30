// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class MbmsGroupCallSession {
    private final android.telephony.MbmsGroupCallSession real;

    public MbmsGroupCallSession(android.telephony.MbmsGroupCallSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.MbmsGroupCallSession wrap(android.telephony.MbmsGroupCallSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.MbmsGroupCallSession(real);
    }

    public android.telephony.MbmsGroupCallSession unwrap() {
        return real;
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsGroupCallSession#close()");
    }

    public static com.micklab.dcg.wrapper.android.telephony.MbmsGroupCallSession create(com.micklab.dcg.wrapper.android.content.Context arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.telephony.mbms.MbmsGroupCallSessionCallback arg2) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsGroupCallSession#create(android.content.Context,java.util.concurrent.Executor,android.telephony.mbms.MbmsGroupCallSessionCallback)");
    }

    public static com.micklab.dcg.wrapper.android.telephony.MbmsGroupCallSession create(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, java.util.concurrent.Executor arg2, com.micklab.dcg.wrapper.android.telephony.mbms.MbmsGroupCallSessionCallback arg3) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.MbmsGroupCallSession#create(android.content.Context,int,java.util.concurrent.Executor,android.telephony.mbms.MbmsGroupCallSessionCallback)");
    }

}
