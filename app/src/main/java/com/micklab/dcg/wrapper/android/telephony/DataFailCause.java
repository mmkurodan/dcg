// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class DataFailCause {
    private final android.telephony.DataFailCause real;

    public DataFailCause(android.telephony.DataFailCause real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.DataFailCause wrap(android.telephony.DataFailCause real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.DataFailCause(real);
    }

    public android.telephony.DataFailCause unwrap() {
        return real;
    }


}
