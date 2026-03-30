// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiDevice {
    private final android.media.midi.MidiDevice real;

    public MidiDevice(android.media.midi.MidiDevice real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiDevice wrap(android.media.midi.MidiDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiDevice(real);
    }

    public android.media.midi.MidiDevice unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public android.media.midi.MidiDevice.MidiConnection connectPorts(com.micklab.dcg.wrapper.android.media.midi.MidiInputPort arg0, int arg1) {
        return real.connectPorts(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo getInfo() {
        return com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo.wrap(real.getInfo());
    }

    public com.micklab.dcg.wrapper.android.media.midi.MidiInputPort openInputPort(int arg0) {
        return com.micklab.dcg.wrapper.android.media.midi.MidiInputPort.wrap(real.openInputPort(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.midi.MidiOutputPort openOutputPort(int arg0) {
        return com.micklab.dcg.wrapper.android.media.midi.MidiOutputPort.wrap(real.openOutputPort(arg0));
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
