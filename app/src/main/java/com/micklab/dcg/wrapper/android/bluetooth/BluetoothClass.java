// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothClass {
    private final android.bluetooth.BluetoothClass real;

    public BluetoothClass(android.bluetooth.BluetoothClass real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothClass wrap(android.bluetooth.BluetoothClass real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothClass(real);
    }

    public android.bluetooth.BluetoothClass unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean doesClassMatch(int arg0) {
        return real.doesClassMatch(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getDeviceClass() {
        return real.getDeviceClass();
    }

    public int getMajorDeviceClass() {
        return real.getMajorDeviceClass();
    }

    public boolean hasService(int arg0) {
        return real.hasService(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


    public static final class Device {
        private final android.bluetooth.BluetoothClass.Device real;

        public Device(android.bluetooth.BluetoothClass.Device real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothClass.Device wrap(android.bluetooth.BluetoothClass.Device real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothClass.Device(real);
        }

        public android.bluetooth.BluetoothClass.Device unwrap() {
            return real;
        }

        public Device() {
            this(new android.bluetooth.BluetoothClass.Device());
        }

        public static final int AUDIO_VIDEO_CAMCORDER = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_CAMCORDER;
        public static final int AUDIO_VIDEO_CAR_AUDIO = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_CAR_AUDIO;
        public static final int AUDIO_VIDEO_HANDSFREE = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_HANDSFREE;
        public static final int AUDIO_VIDEO_HEADPHONES = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_HEADPHONES;
        public static final int AUDIO_VIDEO_HIFI_AUDIO = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_HIFI_AUDIO;
        public static final int AUDIO_VIDEO_LOUDSPEAKER = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_LOUDSPEAKER;
        public static final int AUDIO_VIDEO_MICROPHONE = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_MICROPHONE;
        public static final int AUDIO_VIDEO_PORTABLE_AUDIO = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_PORTABLE_AUDIO;
        public static final int AUDIO_VIDEO_SET_TOP_BOX = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_SET_TOP_BOX;
        public static final int AUDIO_VIDEO_UNCATEGORIZED = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_UNCATEGORIZED;
        public static final int AUDIO_VIDEO_VCR = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_VCR;
        public static final int AUDIO_VIDEO_VIDEO_CAMERA = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_VIDEO_CAMERA;
        public static final int AUDIO_VIDEO_VIDEO_CONFERENCING = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_VIDEO_CONFERENCING;
        public static final int AUDIO_VIDEO_VIDEO_DISPLAY_AND_LOUDSPEAKER = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_VIDEO_DISPLAY_AND_LOUDSPEAKER;
        public static final int AUDIO_VIDEO_VIDEO_GAMING_TOY = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_VIDEO_GAMING_TOY;
        public static final int AUDIO_VIDEO_VIDEO_MONITOR = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_VIDEO_MONITOR;
        public static final int AUDIO_VIDEO_WEARABLE_HEADSET = android.bluetooth.BluetoothClass.Device.AUDIO_VIDEO_WEARABLE_HEADSET;
        public static final int COMPUTER_DESKTOP = android.bluetooth.BluetoothClass.Device.COMPUTER_DESKTOP;
        public static final int COMPUTER_HANDHELD_PC_PDA = android.bluetooth.BluetoothClass.Device.COMPUTER_HANDHELD_PC_PDA;
        public static final int COMPUTER_LAPTOP = android.bluetooth.BluetoothClass.Device.COMPUTER_LAPTOP;
        public static final int COMPUTER_PALM_SIZE_PC_PDA = android.bluetooth.BluetoothClass.Device.COMPUTER_PALM_SIZE_PC_PDA;
        public static final int COMPUTER_SERVER = android.bluetooth.BluetoothClass.Device.COMPUTER_SERVER;
        public static final int COMPUTER_UNCATEGORIZED = android.bluetooth.BluetoothClass.Device.COMPUTER_UNCATEGORIZED;
        public static final int COMPUTER_WEARABLE = android.bluetooth.BluetoothClass.Device.COMPUTER_WEARABLE;
        public static final int HEALTH_BLOOD_PRESSURE = android.bluetooth.BluetoothClass.Device.HEALTH_BLOOD_PRESSURE;
        public static final int HEALTH_DATA_DISPLAY = android.bluetooth.BluetoothClass.Device.HEALTH_DATA_DISPLAY;
        public static final int HEALTH_GLUCOSE = android.bluetooth.BluetoothClass.Device.HEALTH_GLUCOSE;
        public static final int HEALTH_PULSE_OXIMETER = android.bluetooth.BluetoothClass.Device.HEALTH_PULSE_OXIMETER;
        public static final int HEALTH_PULSE_RATE = android.bluetooth.BluetoothClass.Device.HEALTH_PULSE_RATE;
        public static final int HEALTH_THERMOMETER = android.bluetooth.BluetoothClass.Device.HEALTH_THERMOMETER;
        public static final int HEALTH_UNCATEGORIZED = android.bluetooth.BluetoothClass.Device.HEALTH_UNCATEGORIZED;
        public static final int HEALTH_WEIGHING = android.bluetooth.BluetoothClass.Device.HEALTH_WEIGHING;
        public static final int PERIPHERAL_KEYBOARD = android.bluetooth.BluetoothClass.Device.PERIPHERAL_KEYBOARD;
        public static final int PERIPHERAL_KEYBOARD_POINTING = android.bluetooth.BluetoothClass.Device.PERIPHERAL_KEYBOARD_POINTING;
        public static final int PERIPHERAL_NON_KEYBOARD_NON_POINTING = android.bluetooth.BluetoothClass.Device.PERIPHERAL_NON_KEYBOARD_NON_POINTING;
        public static final int PERIPHERAL_POINTING = android.bluetooth.BluetoothClass.Device.PERIPHERAL_POINTING;
        public static final int PHONE_CELLULAR = android.bluetooth.BluetoothClass.Device.PHONE_CELLULAR;
        public static final int PHONE_CORDLESS = android.bluetooth.BluetoothClass.Device.PHONE_CORDLESS;
        public static final int PHONE_ISDN = android.bluetooth.BluetoothClass.Device.PHONE_ISDN;
        public static final int PHONE_MODEM_OR_GATEWAY = android.bluetooth.BluetoothClass.Device.PHONE_MODEM_OR_GATEWAY;
        public static final int PHONE_SMART = android.bluetooth.BluetoothClass.Device.PHONE_SMART;
        public static final int PHONE_UNCATEGORIZED = android.bluetooth.BluetoothClass.Device.PHONE_UNCATEGORIZED;
        public static final int TOY_CONTROLLER = android.bluetooth.BluetoothClass.Device.TOY_CONTROLLER;
        public static final int TOY_DOLL_ACTION_FIGURE = android.bluetooth.BluetoothClass.Device.TOY_DOLL_ACTION_FIGURE;
        public static final int TOY_GAME = android.bluetooth.BluetoothClass.Device.TOY_GAME;
        public static final int TOY_ROBOT = android.bluetooth.BluetoothClass.Device.TOY_ROBOT;
        public static final int TOY_UNCATEGORIZED = android.bluetooth.BluetoothClass.Device.TOY_UNCATEGORIZED;
        public static final int TOY_VEHICLE = android.bluetooth.BluetoothClass.Device.TOY_VEHICLE;
        public static final int WEARABLE_GLASSES = android.bluetooth.BluetoothClass.Device.WEARABLE_GLASSES;
        public static final int WEARABLE_HELMET = android.bluetooth.BluetoothClass.Device.WEARABLE_HELMET;
        public static final int WEARABLE_JACKET = android.bluetooth.BluetoothClass.Device.WEARABLE_JACKET;
        public static final int WEARABLE_PAGER = android.bluetooth.BluetoothClass.Device.WEARABLE_PAGER;
        public static final int WEARABLE_UNCATEGORIZED = android.bluetooth.BluetoothClass.Device.WEARABLE_UNCATEGORIZED;
        public static final int WEARABLE_WRIST_WATCH = android.bluetooth.BluetoothClass.Device.WEARABLE_WRIST_WATCH;

        public static final class Major {
            private final android.bluetooth.BluetoothClass.Device.Major real;

            public Major(android.bluetooth.BluetoothClass.Device.Major real) {
                this.real = real;
            }

            public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothClass.Device.Major wrap(android.bluetooth.BluetoothClass.Device.Major real) {
                return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothClass.Device.Major(real);
            }

            public android.bluetooth.BluetoothClass.Device.Major unwrap() {
                return real;
            }

            public Major() {
                this(new android.bluetooth.BluetoothClass.Device.Major());
            }

            public static final int AUDIO_VIDEO = android.bluetooth.BluetoothClass.Device.Major.AUDIO_VIDEO;
            public static final int COMPUTER = android.bluetooth.BluetoothClass.Device.Major.COMPUTER;
            public static final int HEALTH = android.bluetooth.BluetoothClass.Device.Major.HEALTH;
            public static final int IMAGING = android.bluetooth.BluetoothClass.Device.Major.IMAGING;
            public static final int MISC = android.bluetooth.BluetoothClass.Device.Major.MISC;
            public static final int PERIPHERAL = android.bluetooth.BluetoothClass.Device.Major.PERIPHERAL;
            public static final int PHONE = android.bluetooth.BluetoothClass.Device.Major.PHONE;
            public static final int TOY = android.bluetooth.BluetoothClass.Device.Major.TOY;
            public static final int UNCATEGORIZED = android.bluetooth.BluetoothClass.Device.Major.UNCATEGORIZED;
            public static final int WEARABLE = android.bluetooth.BluetoothClass.Device.Major.WEARABLE;

        }
    }
    public static final class Service {
        private final android.bluetooth.BluetoothClass.Service real;

        public Service(android.bluetooth.BluetoothClass.Service real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothClass.Service wrap(android.bluetooth.BluetoothClass.Service real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothClass.Service(real);
        }

        public android.bluetooth.BluetoothClass.Service unwrap() {
            return real;
        }

        public Service() {
            this(new android.bluetooth.BluetoothClass.Service());
        }

        public static final int AUDIO = android.bluetooth.BluetoothClass.Service.AUDIO;
        public static final int CAPTURE = android.bluetooth.BluetoothClass.Service.CAPTURE;
        public static final int INFORMATION = android.bluetooth.BluetoothClass.Service.INFORMATION;
        public static final int LE_AUDIO = android.bluetooth.BluetoothClass.Service.LE_AUDIO;
        public static final int LIMITED_DISCOVERABILITY = android.bluetooth.BluetoothClass.Service.LIMITED_DISCOVERABILITY;
        public static final int OBJECT_TRANSFER = android.bluetooth.BluetoothClass.Service.OBJECT_TRANSFER;
        public static final int POSITIONING = android.bluetooth.BluetoothClass.Service.POSITIONING;
        public static final int RENDER = android.bluetooth.BluetoothClass.Service.RENDER;
        public static final int TELEPHONY = android.bluetooth.BluetoothClass.Service.TELEPHONY;

    }
}
