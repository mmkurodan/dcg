// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiUmpDeviceService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MidiUmpDeviceService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiUmpDeviceService wrap(android.media.midi.MidiUmpDeviceService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiUmpDeviceService(real, (__DcgwBridgeToken) null);
    }

    public android.media.midi.MidiUmpDeviceService getReal() {
        return (android.media.midi.MidiUmpDeviceService) real;
    }

    public android.media.midi.MidiUmpDeviceService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo getDeviceInfo() {
        return com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo.wrap(((android.media.midi.MidiUmpDeviceService) real).getDeviceInfo());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.media.midi.MidiUmpDeviceService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onClose() {
        ((android.media.midi.MidiUmpDeviceService) real).onClose();
    }

    public void onCreate() {
        ((android.media.midi.MidiUmpDeviceService) real).onCreate();
    }

    public void onDeviceStatusChanged(com.micklab.dcg.wrapper.android.media.midi.MidiDeviceStatus arg0) {
        ((android.media.midi.MidiUmpDeviceService) real).onDeviceStatusChanged(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.media.midi.MidiUmpDeviceService.SERVICE_INTERFACE;

}
