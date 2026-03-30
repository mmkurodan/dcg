// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiDeviceService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MidiDeviceService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiDeviceService wrap(android.media.midi.MidiDeviceService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiDeviceService(real, (__DcgwBridgeToken) null);
    }

    public android.media.midi.MidiDeviceService getReal() {
        return (android.media.midi.MidiDeviceService) real;
    }

    public android.media.midi.MidiDeviceService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo getDeviceInfo() {
        return com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo.wrap(((android.media.midi.MidiDeviceService) real).getDeviceInfo());
    }

    public android.media.midi.MidiReceiver[] getOutputPortReceivers() {
        return ((android.media.midi.MidiDeviceService) real).getOutputPortReceivers();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.media.midi.MidiDeviceService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onClose() {
        ((android.media.midi.MidiDeviceService) real).onClose();
    }

    public void onCreate() {
        ((android.media.midi.MidiDeviceService) real).onCreate();
    }

    public void onDeviceStatusChanged(com.micklab.dcg.wrapper.android.media.midi.MidiDeviceStatus arg0) {
        ((android.media.midi.MidiDeviceService) real).onDeviceStatusChanged(arg0 == null ? null : arg0.getReal());
    }

    public android.media.midi.MidiReceiver[] onGetInputPortReceivers() {
        return ((android.media.midi.MidiDeviceService) real).onGetInputPortReceivers();
    }

    public static final java.lang.String SERVICE_INTERFACE = android.media.midi.MidiDeviceService.SERVICE_INTERFACE;

}
