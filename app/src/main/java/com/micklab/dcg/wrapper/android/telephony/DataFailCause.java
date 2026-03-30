// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class DataFailCause {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DataFailCause(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.DataFailCause wrap(android.telephony.DataFailCause real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.DataFailCause(real, (__DcgwBridgeToken) null);
    }

    public android.telephony.DataFailCause getReal() {
        return (android.telephony.DataFailCause) real;
    }

    public android.telephony.DataFailCause unwrap() {
        return getReal();
    }


}
