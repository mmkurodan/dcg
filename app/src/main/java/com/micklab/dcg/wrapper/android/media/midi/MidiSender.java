// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiSender {
    private final android.media.midi.MidiSender real;

    public MidiSender(android.media.midi.MidiSender real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiSender wrap(android.media.midi.MidiSender real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiSender(real);
    }

    public android.media.midi.MidiSender unwrap() {
        return real;
    }

    public void connect(com.micklab.dcg.wrapper.android.media.midi.MidiReceiver arg0) {
        real.connect(arg0 == null ? null : arg0.unwrap());
    }

    public void disconnect(com.micklab.dcg.wrapper.android.media.midi.MidiReceiver arg0) {
        real.disconnect(arg0 == null ? null : arg0.unwrap());
    }

    public void onConnect(com.micklab.dcg.wrapper.android.media.midi.MidiReceiver arg0) {
        real.onConnect(arg0 == null ? null : arg0.unwrap());
    }

    public void onDisconnect(com.micklab.dcg.wrapper.android.media.midi.MidiReceiver arg0) {
        real.onDisconnect(arg0 == null ? null : arg0.unwrap());
    }

}
