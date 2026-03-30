// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiReceiver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MidiReceiver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiReceiver wrap(android.media.midi.MidiReceiver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiReceiver(real, (__DcgwBridgeToken) null);
    }

    public android.media.midi.MidiReceiver getReal() {
        return (android.media.midi.MidiReceiver) real;
    }

    public android.media.midi.MidiReceiver unwrap() {
        return getReal();
    }

    public void flush() throws java.io.IOException {
        ((android.media.midi.MidiReceiver) real).flush();
    }

    public int getMaxMessageSize() {
        return ((android.media.midi.MidiReceiver) real).getMaxMessageSize();
    }

    public void onFlush() throws java.io.IOException {
        ((android.media.midi.MidiReceiver) real).onFlush();
    }

    public void onSend(byte[] arg0, int arg1, int arg2, long arg3) throws java.io.IOException {
        ((android.media.midi.MidiReceiver) real).onSend(arg0, arg1, arg2, arg3);
    }

    public void send(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
        ((android.media.midi.MidiReceiver) real).send(arg0, arg1, arg2);
    }

    public void send(byte[] arg0, int arg1, int arg2, long arg3) throws java.io.IOException {
        ((android.media.midi.MidiReceiver) real).send(arg0, arg1, arg2, arg3);
    }

}
