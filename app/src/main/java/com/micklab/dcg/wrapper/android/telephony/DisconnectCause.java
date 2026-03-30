// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.telephony;

public final class DisconnectCause {
    private final android.telephony.DisconnectCause real;

    public DisconnectCause(android.telephony.DisconnectCause real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.telephony.DisconnectCause wrap(android.telephony.DisconnectCause real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.telephony.DisconnectCause(real);
    }

    public android.telephony.DisconnectCause unwrap() {
        return real;
    }


}
