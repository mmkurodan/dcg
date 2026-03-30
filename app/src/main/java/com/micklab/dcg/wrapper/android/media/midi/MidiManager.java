// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MidiManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiManager wrap(android.media.midi.MidiManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiManager(real, (__DcgwBridgeToken) null);
    }

    public android.media.midi.MidiManager getReal() {
        return (android.media.midi.MidiManager) real;
    }

    public android.media.midi.MidiManager unwrap() {
        return getReal();
    }

    public android.media.midi.MidiDeviceInfo[] getDevices() {
        return ((android.media.midi.MidiManager) real).getDevices();
    }

    public void openBluetoothDevice(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, com.micklab.dcg.wrapper.android.media.midi.MidiManager.OnDeviceOpenedListener arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        ((android.media.midi.MidiManager) real).openBluetoothDevice(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void openDevice(com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo arg0, com.micklab.dcg.wrapper.android.media.midi.MidiManager.OnDeviceOpenedListener arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        ((android.media.midi.MidiManager) real).openDevice(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void registerDeviceCallback(com.micklab.dcg.wrapper.android.media.midi.MidiManager.DeviceCallback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.midi.MidiManager) real).registerDeviceCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void registerDeviceCallback(int arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.media.midi.MidiManager.DeviceCallback arg2) {
        ((android.media.midi.MidiManager) real).registerDeviceCallback(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void unregisterDeviceCallback(com.micklab.dcg.wrapper.android.media.midi.MidiManager.DeviceCallback arg0) {
        ((android.media.midi.MidiManager) real).unregisterDeviceCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final int TRANSPORT_MIDI_BYTE_STREAM = android.media.midi.MidiManager.TRANSPORT_MIDI_BYTE_STREAM;
    public static final int TRANSPORT_UNIVERSAL_MIDI_PACKETS = android.media.midi.MidiManager.TRANSPORT_UNIVERSAL_MIDI_PACKETS;

    public static final class DeviceCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private DeviceCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.midi.MidiManager.DeviceCallback wrap(android.media.midi.MidiManager.DeviceCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiManager.DeviceCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.midi.MidiManager.DeviceCallback getReal() {
            return (android.media.midi.MidiManager.DeviceCallback) real;
        }

        public android.media.midi.MidiManager.DeviceCallback unwrap() {
            return getReal();
        }

        public DeviceCallback() {
            this(new android.media.midi.MidiManager.DeviceCallback(), (__DcgwBridgeToken) null);
        }

        public void onDeviceAdded(com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo arg0) {
            ((android.media.midi.MidiManager.DeviceCallback) real).onDeviceAdded(arg0 == null ? null : arg0.getReal());
        }

        public void onDeviceRemoved(com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo arg0) {
            ((android.media.midi.MidiManager.DeviceCallback) real).onDeviceRemoved(arg0 == null ? null : arg0.getReal());
        }

        public void onDeviceStatusChanged(com.micklab.dcg.wrapper.android.media.midi.MidiDeviceStatus arg0) {
            ((android.media.midi.MidiManager.DeviceCallback) real).onDeviceStatusChanged(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnDeviceOpenedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDeviceOpenedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.midi.MidiManager.OnDeviceOpenedListener wrap(android.media.midi.MidiManager.OnDeviceOpenedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiManager.OnDeviceOpenedListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.midi.MidiManager.OnDeviceOpenedListener getReal() {
            return (android.media.midi.MidiManager.OnDeviceOpenedListener) real;
        }

        public android.media.midi.MidiManager.OnDeviceOpenedListener unwrap() {
            return getReal();
        }

        public void onDeviceOpened(com.micklab.dcg.wrapper.android.media.midi.MidiDevice arg0) {
            ((android.media.midi.MidiManager.OnDeviceOpenedListener) real).onDeviceOpened(arg0 == null ? null : arg0.getReal());
        }

    }
}
