// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accessibilityservice;

public final class BrailleDisplayController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BrailleDisplayController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController wrap(android.accessibilityservice.BrailleDisplayController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController(real, (__DcgwBridgeToken) null);
    }

    public android.accessibilityservice.BrailleDisplayController getReal() {
        return (android.accessibilityservice.BrailleDisplayController) real;
    }

    public android.accessibilityservice.BrailleDisplayController unwrap() {
        return getReal();
    }

    public void connect(com.micklab.dcg.wrapper.android.hardware.usb.UsbDevice arg0, com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback arg1) {
        ((android.accessibilityservice.BrailleDisplayController) real).connect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void connect(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback arg1) {
        ((android.accessibilityservice.BrailleDisplayController) real).connect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void connect(com.micklab.dcg.wrapper.android.hardware.usb.UsbDevice arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback arg2) {
        ((android.accessibilityservice.BrailleDisplayController) real).connect(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void connect(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback arg2) {
        ((android.accessibilityservice.BrailleDisplayController) real).connect(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void disconnect() {
        ((android.accessibilityservice.BrailleDisplayController) real).disconnect();
    }

    public boolean isConnected() {
        return ((android.accessibilityservice.BrailleDisplayController) real).isConnected();
    }

    public void write(byte[] arg0) throws java.io.IOException {
        ((android.accessibilityservice.BrailleDisplayController) real).write(arg0);
    }

    public static final class BrailleDisplayCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BrailleDisplayCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback wrap(android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback(real, (__DcgwBridgeToken) null);
        }

        public android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback getReal() {
            return (android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback) real;
        }

        public android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback unwrap() {
            return getReal();
        }

        public void onConnected(byte[] arg0) {
            ((android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback) real).onConnected(arg0);
        }

        public void onConnectionFailed(int arg0) {
            ((android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback) real).onConnectionFailed(arg0);
        }

        public void onDisconnected() {
            ((android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback) real).onDisconnected();
        }

        public void onInput(byte[] arg0) {
            ((android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback) real).onInput(arg0);
        }

        public static final int FLAG_ERROR_BRAILLE_DISPLAY_NOT_FOUND = android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback.FLAG_ERROR_BRAILLE_DISPLAY_NOT_FOUND;
        public static final int FLAG_ERROR_CANNOT_ACCESS = android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback.FLAG_ERROR_CANNOT_ACCESS;

    }
}
