// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class GroupCall {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GroupCall(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.GroupCall wrap(android.telephony.mbms.GroupCall real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.GroupCall(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.mbms.GroupCall getReal() {
        return (android.telephony.mbms.GroupCall) real;
    }

    public android.telephony.mbms.GroupCall unwrap() {
        return getReal();
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.GroupCall#close()");
    }

    public long getTmgi() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.GroupCall#getTmgi()");
    }


}
