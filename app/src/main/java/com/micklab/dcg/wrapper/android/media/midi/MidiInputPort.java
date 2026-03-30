// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiInputPort {
    private final android.media.midi.MidiInputPort real;

    public MidiInputPort(android.media.midi.MidiInputPort real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiInputPort wrap(android.media.midi.MidiInputPort real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiInputPort(real);
    }

    public android.media.midi.MidiInputPort unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public int getPortNumber() {
        return real.getPortNumber();
    }

    public void onFlush() throws java.io.IOException {
        real.onFlush();
    }

    public void onSend(byte[] arg0, int arg1, int arg2, long arg3) throws java.io.IOException {
        real.onSend(arg0, arg1, arg2, arg3);
    }

}
