// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiDeviceStatus {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MidiDeviceStatus(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiDeviceStatus wrap(android.media.midi.MidiDeviceStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiDeviceStatus(real, (__DcgwBridgeToken) null);
    }

    public android.media.midi.MidiDeviceStatus getReal() {
        return (android.media.midi.MidiDeviceStatus) real;
    }

    public android.media.midi.MidiDeviceStatus unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.midi.MidiDeviceStatus) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo getDeviceInfo() {
        return com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo.wrap(((android.media.midi.MidiDeviceStatus) real).getDeviceInfo());
    }

    public int getOutputPortOpenCount(int arg0) {
        return ((android.media.midi.MidiDeviceStatus) real).getOutputPortOpenCount(arg0);
    }

    public boolean isInputPortOpen(int arg0) {
        return ((android.media.midi.MidiDeviceStatus) real).isInputPortOpen(arg0);
    }

    public java.lang.String toString() {
        return ((android.media.midi.MidiDeviceStatus) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.midi.MidiDeviceStatus) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
