// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiOutputPort {
    private final android.media.midi.MidiOutputPort real;

    public MidiOutputPort(android.media.midi.MidiOutputPort real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiOutputPort wrap(android.media.midi.MidiOutputPort real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiOutputPort(real);
    }

    public android.media.midi.MidiOutputPort unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public int getPortNumber() {
        return real.getPortNumber();
    }

    public void onConnect(com.micklab.dcg.wrapper.android.media.midi.MidiReceiver arg0) {
        real.onConnect(arg0 == null ? null : arg0.unwrap());
    }

    public void onDisconnect(com.micklab.dcg.wrapper.android.media.midi.MidiReceiver arg0) {
        real.onDisconnect(arg0 == null ? null : arg0.unwrap());
    }

}
