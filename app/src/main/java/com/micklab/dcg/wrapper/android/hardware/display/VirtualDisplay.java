// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.display;

public final class VirtualDisplay {
    private final android.hardware.display.VirtualDisplay real;

    public VirtualDisplay(android.hardware.display.VirtualDisplay real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay wrap(android.hardware.display.VirtualDisplay real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay(real);
    }

    public android.hardware.display.VirtualDisplay unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.Display getDisplay() {
        return com.micklab.dcg.wrapper.android.view.Display.wrap(real.getDisplay());
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(real.getSurface());
    }

    public void release() {
        real.release();
    }

    public void resize(int arg0, int arg1, int arg2) {
        real.resize(arg0, arg1, arg2);
    }

    public void setSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        real.setSurface(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final class Callback {
        private final android.hardware.display.VirtualDisplay.Callback real;

        public Callback(android.hardware.display.VirtualDisplay.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.Callback wrap(android.hardware.display.VirtualDisplay.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.Callback(real);
        }

        public android.hardware.display.VirtualDisplay.Callback unwrap() {
            return real;
        }

        public void onPaused() {
            real.onPaused();
        }

        public void onResumed() {
            real.onResumed();
        }

        public void onStopped() {
            real.onStopped();
        }

    }
}
