// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class GroupCall {
    private final android.telephony.mbms.GroupCall real;

    public GroupCall(android.telephony.mbms.GroupCall real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.GroupCall wrap(android.telephony.mbms.GroupCall real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.GroupCall(real);
    }

    public android.telephony.mbms.GroupCall unwrap() {
        return real;
    }

    public void close() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.GroupCall#close()");
    }

    public long getTmgi() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.GroupCall#getTmgi()");
    }


}
