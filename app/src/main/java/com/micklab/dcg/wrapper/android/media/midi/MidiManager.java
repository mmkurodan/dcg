// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiManager {
    private final android.media.midi.MidiManager real;

    public MidiManager(android.media.midi.MidiManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiManager wrap(android.media.midi.MidiManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiManager(real);
    }

    public android.media.midi.MidiManager unwrap() {
        return real;
    }

    public android.media.midi.MidiDeviceInfo[] getDevices() {
        return real.getDevices();
    }

    public void openBluetoothDevice(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, com.micklab.dcg.wrapper.android.media.midi.MidiManager.OnDeviceOpenedListener arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        real.openBluetoothDevice(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void openDevice(com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo arg0, com.micklab.dcg.wrapper.android.media.midi.MidiManager.OnDeviceOpenedListener arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        real.openDevice(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void registerDeviceCallback(com.micklab.dcg.wrapper.android.media.midi.MidiManager.DeviceCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerDeviceCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void registerDeviceCallback(int arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.media.midi.MidiManager.DeviceCallback arg2) {
        real.registerDeviceCallback(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void unregisterDeviceCallback(com.micklab.dcg.wrapper.android.media.midi.MidiManager.DeviceCallback arg0) {
        real.unregisterDeviceCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final int TRANSPORT_MIDI_BYTE_STREAM = android.media.midi.MidiManager.TRANSPORT_MIDI_BYTE_STREAM;
    public static final int TRANSPORT_UNIVERSAL_MIDI_PACKETS = android.media.midi.MidiManager.TRANSPORT_UNIVERSAL_MIDI_PACKETS;

    public static final class DeviceCallback {
        private final android.media.midi.MidiManager.DeviceCallback real;

        public DeviceCallback(android.media.midi.MidiManager.DeviceCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.midi.MidiManager.DeviceCallback wrap(android.media.midi.MidiManager.DeviceCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiManager.DeviceCallback(real);
        }

        public android.media.midi.MidiManager.DeviceCallback unwrap() {
            return real;
        }

        public DeviceCallback() {
            this(new android.media.midi.MidiManager.DeviceCallback());
        }

        public void onDeviceAdded(com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo arg0) {
            real.onDeviceAdded(arg0 == null ? null : arg0.unwrap());
        }

        public void onDeviceRemoved(com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo arg0) {
            real.onDeviceRemoved(arg0 == null ? null : arg0.unwrap());
        }

        public void onDeviceStatusChanged(com.micklab.dcg.wrapper.android.media.midi.MidiDeviceStatus arg0) {
            real.onDeviceStatusChanged(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnDeviceOpenedListener {
        private final android.media.midi.MidiManager.OnDeviceOpenedListener real;

        public OnDeviceOpenedListener(android.media.midi.MidiManager.OnDeviceOpenedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.midi.MidiManager.OnDeviceOpenedListener wrap(android.media.midi.MidiManager.OnDeviceOpenedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiManager.OnDeviceOpenedListener(real);
        }

        public android.media.midi.MidiManager.OnDeviceOpenedListener unwrap() {
            return real;
        }

        public void onDeviceOpened(com.micklab.dcg.wrapper.android.media.midi.MidiDevice arg0) {
            real.onDeviceOpened(arg0 == null ? null : arg0.unwrap());
        }

    }
}
