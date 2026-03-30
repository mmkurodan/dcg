// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiSender {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MidiSender(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiSender wrap(android.media.midi.MidiSender real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiSender(real, (__DcgwBridgeToken) null);
    }

    public android.media.midi.MidiSender getReal() {
        return (android.media.midi.MidiSender) real;
    }

    public android.media.midi.MidiSender unwrap() {
        return getReal();
    }

    public void connect(com.micklab.dcg.wrapper.android.media.midi.MidiReceiver arg0) {
        ((android.media.midi.MidiSender) real).connect(arg0 == null ? null : arg0.getReal());
    }

    public void disconnect(com.micklab.dcg.wrapper.android.media.midi.MidiReceiver arg0) {
        ((android.media.midi.MidiSender) real).disconnect(arg0 == null ? null : arg0.getReal());
    }

    public void onConnect(com.micklab.dcg.wrapper.android.media.midi.MidiReceiver arg0) {
        ((android.media.midi.MidiSender) real).onConnect(arg0 == null ? null : arg0.getReal());
    }

    public void onDisconnect(com.micklab.dcg.wrapper.android.media.midi.MidiReceiver arg0) {
        ((android.media.midi.MidiSender) real).onDisconnect(arg0 == null ? null : arg0.getReal());
    }

}
