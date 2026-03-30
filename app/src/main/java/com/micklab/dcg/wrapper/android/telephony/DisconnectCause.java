// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class DisconnectCause {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DisconnectCause(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.DisconnectCause wrap(android.telephony.DisconnectCause real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.DisconnectCause(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.DisconnectCause getReal() {
        return (android.telephony.DisconnectCause) real;
    }

    public android.telephony.DisconnectCause unwrap() {
        return getReal();
    }


}
