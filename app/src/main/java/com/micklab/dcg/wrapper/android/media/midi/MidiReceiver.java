// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiReceiver {
    private final android.media.midi.MidiReceiver real;

    public MidiReceiver(android.media.midi.MidiReceiver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiReceiver wrap(android.media.midi.MidiReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiReceiver(real);
    }

    public android.media.midi.MidiReceiver unwrap() {
        return real;
    }

    public void flush() throws java.io.IOException {
        real.flush();
    }

    public int getMaxMessageSize() {
        return real.getMaxMessageSize();
    }

    public void onFlush() throws java.io.IOException {
        real.onFlush();
    }

    public void onSend(byte[] arg0, int arg1, int arg2, long arg3) throws java.io.IOException {
        real.onSend(arg0, arg1, arg2, arg3);
    }

    public void send(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
        real.send(arg0, arg1, arg2);
    }

    public void send(byte[] arg0, int arg1, int arg2, long arg3) throws java.io.IOException {
        real.send(arg0, arg1, arg2, arg3);
    }

}
