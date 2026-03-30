// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiDeviceStatus {
    private final android.media.midi.MidiDeviceStatus real;

    public MidiDeviceStatus(android.media.midi.MidiDeviceStatus real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiDeviceStatus wrap(android.media.midi.MidiDeviceStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiDeviceStatus(real);
    }

    public android.media.midi.MidiDeviceStatus unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo getDeviceInfo() {
        return com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo.wrap(real.getDeviceInfo());
    }

    public int getOutputPortOpenCount(int arg0) {
        return real.getOutputPortOpenCount(arg0);
    }

    public boolean isInputPortOpen(int arg0) {
        return real.isInputPortOpen(arg0);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
