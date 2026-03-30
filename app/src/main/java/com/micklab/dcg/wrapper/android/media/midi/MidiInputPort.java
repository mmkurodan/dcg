// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiInputPort {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MidiInputPort(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiInputPort wrap(android.media.midi.MidiInputPort real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiInputPort(real, (__DcgwBridgeToken) null);
    }

    public android.media.midi.MidiInputPort getReal() {
        return (android.media.midi.MidiInputPort) real;
    }

    public android.media.midi.MidiInputPort unwrap() {
        return getReal();
    }

    public void close() throws java.io.IOException {
        ((android.media.midi.MidiInputPort) real).close();
    }

    public int getPortNumber() {
        return ((android.media.midi.MidiInputPort) real).getPortNumber();
    }

    public void onFlush() throws java.io.IOException {
        ((android.media.midi.MidiInputPort) real).onFlush();
    }

    public void onSend(byte[] arg0, int arg1, int arg2, long arg3) throws java.io.IOException {
        ((android.media.midi.MidiInputPort) real).onSend(arg0, arg1, arg2, arg3);
    }

}
