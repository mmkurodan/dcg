// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.midi;

public final class MidiDeviceInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MidiDeviceInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo wrap(android.media.midi.MidiDeviceInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo(real, (__DcgwBridgeToken) null);
    }

    public android.media.midi.MidiDeviceInfo getReal() {
        return (android.media.midi.MidiDeviceInfo) real;
    }

    public android.media.midi.MidiDeviceInfo unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.midi.MidiDeviceInfo) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.midi.MidiDeviceInfo) real).equals(arg0);
    }

    public int getDefaultProtocol() {
        return ((android.media.midi.MidiDeviceInfo) real).getDefaultProtocol();
    }

    public int getId() {
        return ((android.media.midi.MidiDeviceInfo) real).getId();
    }

    public int getInputPortCount() {
        return ((android.media.midi.MidiDeviceInfo) real).getInputPortCount();
    }

    public int getOutputPortCount() {
        return ((android.media.midi.MidiDeviceInfo) real).getOutputPortCount();
    }

    public android.media.midi.MidiDeviceInfo.PortInfo[] getPorts() {
        return ((android.media.midi.MidiDeviceInfo) real).getPorts();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getProperties() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.midi.MidiDeviceInfo) real).getProperties());
    }

    public int getType() {
        return ((android.media.midi.MidiDeviceInfo) real).getType();
    }

    public int hashCode() {
        return ((android.media.midi.MidiDeviceInfo) real).hashCode();
    }

    public boolean isPrivate() {
        return ((android.media.midi.MidiDeviceInfo) real).isPrivate();
    }

    public java.lang.String toString() {
        return ((android.media.midi.MidiDeviceInfo) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.midi.MidiDeviceInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String PROPERTY_BLUETOOTH_DEVICE = android.media.midi.MidiDeviceInfo.PROPERTY_BLUETOOTH_DEVICE;
    public static final java.lang.String PROPERTY_MANUFACTURER = android.media.midi.MidiDeviceInfo.PROPERTY_MANUFACTURER;
    public static final java.lang.String PROPERTY_NAME = android.media.midi.MidiDeviceInfo.PROPERTY_NAME;
    public static final java.lang.String PROPERTY_PRODUCT = android.media.midi.MidiDeviceInfo.PROPERTY_PRODUCT;
    public static final java.lang.String PROPERTY_SERIAL_NUMBER = android.media.midi.MidiDeviceInfo.PROPERTY_SERIAL_NUMBER;
    public static final java.lang.String PROPERTY_USB_DEVICE = android.media.midi.MidiDeviceInfo.PROPERTY_USB_DEVICE;
    public static final java.lang.String PROPERTY_VERSION = android.media.midi.MidiDeviceInfo.PROPERTY_VERSION;
    public static final int PROTOCOL_UMP_MIDI_1_0_UP_TO_128_BITS = android.media.midi.MidiDeviceInfo.PROTOCOL_UMP_MIDI_1_0_UP_TO_128_BITS;
    public static final int PROTOCOL_UMP_MIDI_1_0_UP_TO_128_BITS_AND_JRTS = android.media.midi.MidiDeviceInfo.PROTOCOL_UMP_MIDI_1_0_UP_TO_128_BITS_AND_JRTS;
    public static final int PROTOCOL_UMP_MIDI_1_0_UP_TO_64_BITS = android.media.midi.MidiDeviceInfo.PROTOCOL_UMP_MIDI_1_0_UP_TO_64_BITS;
    public static final int PROTOCOL_UMP_MIDI_1_0_UP_TO_64_BITS_AND_JRTS = android.media.midi.MidiDeviceInfo.PROTOCOL_UMP_MIDI_1_0_UP_TO_64_BITS_AND_JRTS;
    public static final int PROTOCOL_UMP_MIDI_2_0 = android.media.midi.MidiDeviceInfo.PROTOCOL_UMP_MIDI_2_0;
    public static final int PROTOCOL_UMP_MIDI_2_0_AND_JRTS = android.media.midi.MidiDeviceInfo.PROTOCOL_UMP_MIDI_2_0_AND_JRTS;
    public static final int PROTOCOL_UMP_USE_MIDI_CI = android.media.midi.MidiDeviceInfo.PROTOCOL_UMP_USE_MIDI_CI;
    public static final int PROTOCOL_UNKNOWN = android.media.midi.MidiDeviceInfo.PROTOCOL_UNKNOWN;
    public static final int TYPE_BLUETOOTH = android.media.midi.MidiDeviceInfo.TYPE_BLUETOOTH;
    public static final int TYPE_USB = android.media.midi.MidiDeviceInfo.TYPE_USB;
    public static final int TYPE_VIRTUAL = android.media.midi.MidiDeviceInfo.TYPE_VIRTUAL;

    public static final class PortInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PortInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo.PortInfo wrap(android.media.midi.MidiDeviceInfo.PortInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.midi.MidiDeviceInfo.PortInfo(real, (__DcgwBridgeToken) null);
        }

        public android.media.midi.MidiDeviceInfo.PortInfo getReal() {
            return (android.media.midi.MidiDeviceInfo.PortInfo) real;
        }

        public android.media.midi.MidiDeviceInfo.PortInfo unwrap() {
            return getReal();
        }

        public java.lang.String getName() {
            return ((android.media.midi.MidiDeviceInfo.PortInfo) real).getName();
        }

        public int getPortNumber() {
            return ((android.media.midi.MidiDeviceInfo.PortInfo) real).getPortNumber();
        }

        public int getType() {
            return ((android.media.midi.MidiDeviceInfo.PortInfo) real).getType();
        }

        public static final int TYPE_INPUT = android.media.midi.MidiDeviceInfo.PortInfo.TYPE_INPUT;
        public static final int TYPE_OUTPUT = android.media.midi.MidiDeviceInfo.PortInfo.TYPE_OUTPUT;

    }
}
