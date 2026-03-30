// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiOutputPort {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MidiOutputPort(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiOutputPort wrap(android.media.midi.MidiOutputPort real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiOutputPort(real, (__DcgwBridgeToken) null);
    }

    public android.media.midi.MidiOutputPort getReal() {
        return (android.media.midi.MidiOutputPort) real;
    }

    public android.media.midi.MidiOutputPort unwrap() {
        return getReal();
    }

    public void close() throws java.io.IOException {
        ((android.media.midi.MidiOutputPort) real).close();
    }

    public int getPortNumber() {
        return ((android.media.midi.MidiOutputPort) real).getPortNumber();
    }

    public void onConnect(com.micklab.dcg.wrapper.android.media.midi.MidiReceiver arg0) {
        ((android.media.midi.MidiOutputPort) real).onConnect(arg0 == null ? null : arg0.getReal());
    }

    public void onDisconnect(com.micklab.dcg.wrapper.android.media.midi.MidiReceiver arg0) {
        ((android.media.midi.MidiOutputPort) real).onDisconnect(arg0 == null ? null : arg0.getReal());
    }

}
