// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.display;

public final class VirtualDisplay {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VirtualDisplay(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay wrap(android.hardware.display.VirtualDisplay real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.display.VirtualDisplay getReal() {
        return (android.hardware.display.VirtualDisplay) real;
    }

    public android.hardware.display.VirtualDisplay unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.Display getDisplay() {
        return com.micklab.dcg.wrapper.android.view.Display.wrap(((android.hardware.display.VirtualDisplay) real).getDisplay());
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(((android.hardware.display.VirtualDisplay) real).getSurface());
    }

    public void release() {
        ((android.hardware.display.VirtualDisplay) real).release();
    }

    public void resize(int arg0, int arg1, int arg2) {
        ((android.hardware.display.VirtualDisplay) real).resize(arg0, arg1, arg2);
    }

    public void setRotation(int arg0) {
        ((android.hardware.display.VirtualDisplay) real).setRotation(arg0);
    }

    public void setSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        ((android.hardware.display.VirtualDisplay) real).setSurface(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.hardware.display.VirtualDisplay) real).toString();
    }

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.Callback wrap(android.hardware.display.VirtualDisplay.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.hardware.display.VirtualDisplay.Callback getReal() {
            return (android.hardware.display.VirtualDisplay.Callback) real;
        }

        public android.hardware.display.VirtualDisplay.Callback unwrap() {
            return getReal();
        }

        public void onPaused() {
            ((android.hardware.display.VirtualDisplay.Callback) real).onPaused();
        }

        public void onResumed() {
            ((android.hardware.display.VirtualDisplay.Callback) real).onResumed();
        }

        public void onStopped() {
            ((android.hardware.display.VirtualDisplay.Callback) real).onStopped();
        }

    }
}
