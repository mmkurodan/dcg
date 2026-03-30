// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.nfc.cardemulation;

public final class PollingFrame {
    private final android.nfc.cardemulation.PollingFrame real;

    public PollingFrame(android.nfc.cardemulation.PollingFrame real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.nfc.cardemulation.PollingFrame wrap(android.nfc.cardemulation.PollingFrame real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.nfc.cardemulation.PollingFrame(real);
    }

    public android.nfc.cardemulation.PollingFrame unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public byte[] getData() {
        return real.getData();
    }

    public long getTimestamp() {
        return real.getTimestamp();
    }

    public boolean getTriggeredAutoTransact() {
        return real.getTriggeredAutoTransact();
    }

    public int getType() {
        return real.getType();
    }

    public int getVendorSpecificGain() {
        return real.getVendorSpecificGain();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int POLLING_LOOP_TYPE_A = android.nfc.cardemulation.PollingFrame.POLLING_LOOP_TYPE_A;
    public static final int POLLING_LOOP_TYPE_B = android.nfc.cardemulation.PollingFrame.POLLING_LOOP_TYPE_B;
    public static final int POLLING_LOOP_TYPE_F = android.nfc.cardemulation.PollingFrame.POLLING_LOOP_TYPE_F;
    public static final int POLLING_LOOP_TYPE_OFF = android.nfc.cardemulation.PollingFrame.POLLING_LOOP_TYPE_OFF;
    public static final int POLLING_LOOP_TYPE_ON = android.nfc.cardemulation.PollingFrame.POLLING_LOOP_TYPE_ON;
    public static final int POLLING_LOOP_TYPE_UNKNOWN = android.nfc.cardemulation.PollingFrame.POLLING_LOOP_TYPE_UNKNOWN;

}
