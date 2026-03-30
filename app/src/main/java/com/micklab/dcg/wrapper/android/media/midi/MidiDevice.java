// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiDevice {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MidiDevice(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiDevice wrap(android.media.midi.MidiDevice real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiDevice(real, (__DcgwBridgeToken) null);
    }

    public android.media.midi.MidiDevice getReal() {
        return (android.media.midi.MidiDevice) real;
    }

    public android.media.midi.MidiDevice unwrap() {
        return getReal();
    }

    public void close() throws java.io.IOException {
        ((android.media.midi.MidiDevice) real).close();
    }

    public android.media.midi.MidiDevice.MidiConnection connectPorts(com.micklab.dcg.wrapper.android.media.midi.MidiInputPort arg0, int arg1) {
        return ((android.media.midi.MidiDevice) real).connectPorts(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo getInfo() {
        return com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo.wrap(((android.media.midi.MidiDevice) real).getInfo());
    }

    public com.micklab.dcg.wrapper.android.media.midi.MidiInputPort openInputPort(int arg0) {
        return com.micklab.dcg.wrapper.android.media.midi.MidiInputPort.wrap(((android.media.midi.MidiDevice) real).openInputPort(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.midi.MidiOutputPort openOutputPort(int arg0) {
        return com.micklab.dcg.wrapper.android.media.midi.MidiOutputPort.wrap(((android.media.midi.MidiDevice) real).openOutputPort(arg0));
    }

    public java.lang.String toString() {
        return ((android.media.midi.MidiDevice) real).toString();
    }

}
