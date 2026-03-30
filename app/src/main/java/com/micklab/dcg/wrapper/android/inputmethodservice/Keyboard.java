// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.inputmethodservice;

public final class Keyboard {
    private final android.inputmethodservice.Keyboard real;

    public Keyboard(android.inputmethodservice.Keyboard real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard wrap(android.inputmethodservice.Keyboard real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard(real);
    }

    public android.inputmethodservice.Keyboard unwrap() {
        return real;
    }

    public Keyboard(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.inputmethodservice.Keyboard(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public Keyboard(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        this(new android.inputmethodservice.Keyboard(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public Keyboard(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, java.lang.CharSequence arg2, int arg3, int arg4) {
        this(new android.inputmethodservice.Keyboard(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public Keyboard(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.inputmethodservice.Keyboard(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int getMinWidth() {
        return real.getMinWidth();
    }

    public int[] getNearestKeys(int arg0, int arg1) {
        return real.getNearestKeys(arg0, arg1);
    }

    public int getShiftKeyIndex() {
        return real.getShiftKeyIndex();
    }

    public boolean isShifted() {
        return real.isShifted();
    }

    public boolean setShifted(boolean arg0) {
        return real.setShifted(arg0);
    }

    public static final int EDGE_BOTTOM = android.inputmethodservice.Keyboard.EDGE_BOTTOM;
    public static final int EDGE_LEFT = android.inputmethodservice.Keyboard.EDGE_LEFT;
    public static final int EDGE_RIGHT = android.inputmethodservice.Keyboard.EDGE_RIGHT;
    public static final int EDGE_TOP = android.inputmethodservice.Keyboard.EDGE_TOP;
    public static final int KEYCODE_ALT = android.inputmethodservice.Keyboard.KEYCODE_ALT;
    public static final int KEYCODE_CANCEL = android.inputmethodservice.Keyboard.KEYCODE_CANCEL;
    public static final int KEYCODE_DELETE = android.inputmethodservice.Keyboard.KEYCODE_DELETE;
    public static final int KEYCODE_DONE = android.inputmethodservice.Keyboard.KEYCODE_DONE;
    public static final int KEYCODE_MODE_CHANGE = android.inputmethodservice.Keyboard.KEYCODE_MODE_CHANGE;
    public static final int KEYCODE_SHIFT = android.inputmethodservice.Keyboard.KEYCODE_SHIFT;

    public static final class Key {
        private final android.inputmethodservice.Keyboard.Key real;

        public Key(android.inputmethodservice.Keyboard.Key real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.Key wrap(android.inputmethodservice.Keyboard.Key real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.Key(real);
        }

        public android.inputmethodservice.Keyboard.Key unwrap() {
            return real;
        }

        public Key(com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.Row arg0) {
            this(new android.inputmethodservice.Keyboard.Key(arg0 == null ? null : arg0.unwrap()));
        }

        public Key(com.micklab.dcg.wrapper.android.content.res.Resources arg0, com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.Row arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.content.res.XmlResourceParser arg4) {
            this(new android.inputmethodservice.Keyboard.Key(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4 == null ? null : arg4.unwrap()));
        }

        public int[] getCurrentDrawableState() {
            return real.getCurrentDrawableState();
        }

        public boolean isInside(int arg0, int arg1) {
            return real.isInside(arg0, arg1);
        }

        public void onPressed() {
            real.onPressed();
        }

        public void onReleased(boolean arg0) {
            real.onReleased(arg0);
        }

        public int squaredDistanceFrom(int arg0, int arg1) {
            return real.squaredDistanceFrom(arg0, arg1);
        }


    }
    public static final class Row {
        private final android.inputmethodservice.Keyboard.Row real;

        public Row(android.inputmethodservice.Keyboard.Row real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.Row wrap(android.inputmethodservice.Keyboard.Row real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.Row(real);
        }

        public android.inputmethodservice.Keyboard.Row unwrap() {
            return real;
        }

        public Row(com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard arg0) {
            this(new android.inputmethodservice.Keyboard.Row(arg0 == null ? null : arg0.unwrap()));
        }

        public Row(com.micklab.dcg.wrapper.android.content.res.Resources arg0, com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard arg1, com.micklab.dcg.wrapper.android.content.res.XmlResourceParser arg2) {
            this(new android.inputmethodservice.Keyboard.Row(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
        }


    }
}
