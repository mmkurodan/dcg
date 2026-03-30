// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony.mbms;

public final class GroupCallCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GroupCallCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.mbms.GroupCallCallback wrap(android.telephony.mbms.GroupCallCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.mbms.GroupCallCallback(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.mbms.GroupCallCallback getReal() {
        return (android.telephony.mbms.GroupCallCallback) real;
    }

    public android.telephony.mbms.GroupCallCallback unwrap() {
        return getReal();
    }

    public void onBroadcastSignalStrengthUpdated(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.GroupCallCallback#onBroadcastSignalStrengthUpdated(int)");
    }

    public void onError(int arg0, java.lang.String arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.GroupCallCallback#onError(int,java.lang.String)");
    }

    public void onGroupCallStateChanged(int arg0, int arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.telephony.mbms.GroupCallCallback#onGroupCallStateChanged(int,int)");
    }


}
