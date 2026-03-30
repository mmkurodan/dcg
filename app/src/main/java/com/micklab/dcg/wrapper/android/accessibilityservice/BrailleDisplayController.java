// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class BrailleDisplayController {
    private final android.accessibilityservice.BrailleDisplayController real;

    public BrailleDisplayController(android.accessibilityservice.BrailleDisplayController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController wrap(android.accessibilityservice.BrailleDisplayController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController(real);
    }

    public android.accessibilityservice.BrailleDisplayController unwrap() {
        return real;
    }

    public void connect(com.micklab.dcg.wrapper.android.hardware.usb.UsbDevice arg0, com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback arg1) {
        real.connect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void connect(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback arg1) {
        real.connect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void connect(com.micklab.dcg.wrapper.android.hardware.usb.UsbDevice arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback arg2) {
        real.connect(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void connect(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback arg2) {
        real.connect(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void disconnect() {
        real.disconnect();
    }

    public boolean isConnected() {
        return real.isConnected();
    }

    public void write(byte[] arg0) throws java.io.IOException {
        real.write(arg0);
    }

    public static final class BrailleDisplayCallback {
        private final android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback real;

        public BrailleDisplayCallback(android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback wrap(android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback(real);
        }

        public android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback unwrap() {
            return real;
        }

        public void onConnected(byte[] arg0) {
            real.onConnected(arg0);
        }

        public void onConnectionFailed(int arg0) {
            real.onConnectionFailed(arg0);
        }

        public void onDisconnected() {
            real.onDisconnected();
        }

        public void onInput(byte[] arg0) {
            real.onInput(arg0);
        }

        public static final int FLAG_ERROR_BRAILLE_DISPLAY_NOT_FOUND = android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback.FLAG_ERROR_BRAILLE_DISPLAY_NOT_FOUND;
        public static final int FLAG_ERROR_CANNOT_ACCESS = android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback.FLAG_ERROR_CANNOT_ACCESS;

    }
}
