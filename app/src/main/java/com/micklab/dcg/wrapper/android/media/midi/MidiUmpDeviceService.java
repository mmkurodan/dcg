// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiUmpDeviceService {
    private final android.media.midi.MidiUmpDeviceService real;

    public MidiUmpDeviceService(android.media.midi.MidiUmpDeviceService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiUmpDeviceService wrap(android.media.midi.MidiUmpDeviceService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiUmpDeviceService(real);
    }

    public android.media.midi.MidiUmpDeviceService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo getDeviceInfo() {
        return com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo.wrap(real.getDeviceInfo());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onClose() {
        real.onClose();
    }

    public void onCreate() {
        real.onCreate();
    }

    public void onDeviceStatusChanged(com.micklab.dcg.wrapper.android.media.midi.MidiDeviceStatus arg0) {
        real.onDeviceStatusChanged(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String SERVICE_INTERFACE = android.media.midi.MidiUmpDeviceService.SERVICE_INTERFACE;

}
