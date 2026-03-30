// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.cardemulation;

public final class PollingFrame {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PollingFrame(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.cardemulation.PollingFrame wrap(android.nfc.cardemulation.PollingFrame real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.cardemulation.PollingFrame(real, (__DcgwBridgeToken) null);
    }

    public android.nfc.cardemulation.PollingFrame getReal() {
        return (android.nfc.cardemulation.PollingFrame) real;
    }

    public android.nfc.cardemulation.PollingFrame unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.nfc.cardemulation.PollingFrame) real).describeContents();
    }

    public byte[] getData() {
        return ((android.nfc.cardemulation.PollingFrame) real).getData();
    }

    public long getTimestamp() {
        return ((android.nfc.cardemulation.PollingFrame) real).getTimestamp();
    }

    public boolean getTriggeredAutoTransact() {
        return ((android.nfc.cardemulation.PollingFrame) real).getTriggeredAutoTransact();
    }

    public int getType() {
        return ((android.nfc.cardemulation.PollingFrame) real).getType();
    }

    public int getVendorSpecificGain() {
        return ((android.nfc.cardemulation.PollingFrame) real).getVendorSpecificGain();
    }

    public java.lang.String toString() {
        return ((android.nfc.cardemulation.PollingFrame) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.nfc.cardemulation.PollingFrame) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int POLLING_LOOP_TYPE_A = android.nfc.cardemulation.PollingFrame.POLLING_LOOP_TYPE_A;
    public static final int POLLING_LOOP_TYPE_B = android.nfc.cardemulation.PollingFrame.POLLING_LOOP_TYPE_B;
    public static final int POLLING_LOOP_TYPE_F = android.nfc.cardemulation.PollingFrame.POLLING_LOOP_TYPE_F;
    public static final int POLLING_LOOP_TYPE_OFF = android.nfc.cardemulation.PollingFrame.POLLING_LOOP_TYPE_OFF;
    public static final int POLLING_LOOP_TYPE_ON = android.nfc.cardemulation.PollingFrame.POLLING_LOOP_TYPE_ON;
    public static final int POLLING_LOOP_TYPE_UNKNOWN = android.nfc.cardemulation.PollingFrame.POLLING_LOOP_TYPE_UNKNOWN;

}
