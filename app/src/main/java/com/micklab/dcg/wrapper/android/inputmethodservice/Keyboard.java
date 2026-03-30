// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.inputmethodservice;

public final class Keyboard {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Keyboard(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard wrap(android.inputmethodservice.Keyboard real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard(real, (__DcgwBridgeToken) null);
    }

    public android.inputmethodservice.Keyboard getReal() {
        return (android.inputmethodservice.Keyboard) real;
    }

    public android.inputmethodservice.Keyboard unwrap() {
        return getReal();
    }

    public Keyboard(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        this(new android.inputmethodservice.Keyboard(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public Keyboard(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2) {
        this(new android.inputmethodservice.Keyboard(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public Keyboard(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, java.lang.CharSequence arg2, int arg3, int arg4) {
        this(new android.inputmethodservice.Keyboard(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public Keyboard(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.inputmethodservice.Keyboard(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public int getHeight() {
        return ((android.inputmethodservice.Keyboard) real).getHeight();
    }

    public int getMinWidth() {
        return ((android.inputmethodservice.Keyboard) real).getMinWidth();
    }

    public int[] getNearestKeys(int arg0, int arg1) {
        return ((android.inputmethodservice.Keyboard) real).getNearestKeys(arg0, arg1);
    }

    public int getShiftKeyIndex() {
        return ((android.inputmethodservice.Keyboard) real).getShiftKeyIndex();
    }

    public boolean isShifted() {
        return ((android.inputmethodservice.Keyboard) real).isShifted();
    }

    public boolean setShifted(boolean arg0) {
        return ((android.inputmethodservice.Keyboard) real).setShifted(arg0);
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Key(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.Key wrap(android.inputmethodservice.Keyboard.Key real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.Key(real, (__DcgwBridgeToken) null);
        }

        public android.inputmethodservice.Keyboard.Key getReal() {
            return (android.inputmethodservice.Keyboard.Key) real;
        }

        public android.inputmethodservice.Keyboard.Key unwrap() {
            return getReal();
        }

        public Key(com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.Row arg0) {
            this(new android.inputmethodservice.Keyboard.Key(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Key(com.micklab.dcg.wrapper.android.content.res.Resources arg0, com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.Row arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.content.res.XmlResourceParser arg4) {
            this(new android.inputmethodservice.Keyboard.Key(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4 == null ? null : arg4.getReal()), (__DcgwBridgeToken) null);
        }

        public int[] getCurrentDrawableState() {
            return ((android.inputmethodservice.Keyboard.Key) real).getCurrentDrawableState();
        }

        public boolean isInside(int arg0, int arg1) {
            return ((android.inputmethodservice.Keyboard.Key) real).isInside(arg0, arg1);
        }

        public void onPressed() {
            ((android.inputmethodservice.Keyboard.Key) real).onPressed();
        }

        public void onReleased(boolean arg0) {
            ((android.inputmethodservice.Keyboard.Key) real).onReleased(arg0);
        }

        public int squaredDistanceFrom(int arg0, int arg1) {
            return ((android.inputmethodservice.Keyboard.Key) real).squaredDistanceFrom(arg0, arg1);
        }


    }
    public static final class Row {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Row(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.Row wrap(android.inputmethodservice.Keyboard.Row real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard.Row(real, (__DcgwBridgeToken) null);
        }

        public android.inputmethodservice.Keyboard.Row getReal() {
            return (android.inputmethodservice.Keyboard.Row) real;
        }

        public android.inputmethodservice.Keyboard.Row unwrap() {
            return getReal();
        }

        public Row(com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard arg0) {
            this(new android.inputmethodservice.Keyboard.Row(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public Row(com.micklab.dcg.wrapper.android.content.res.Resources arg0, com.micklab.dcg.wrapper.android.inputmethodservice.Keyboard arg1, com.micklab.dcg.wrapper.android.content.res.XmlResourceParser arg2) {
            this(new android.inputmethodservice.Keyboard.Row(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }


    }
}
