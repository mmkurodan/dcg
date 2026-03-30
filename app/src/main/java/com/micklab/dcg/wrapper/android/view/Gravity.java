// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class Gravity {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Gravity(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.Gravity wrap(android.view.Gravity real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.Gravity(real, (__DcgwBridgeToken) null);
    }

    public android.view.Gravity getReal() {
        return (android.view.Gravity) real;
    }

    public android.view.Gravity unwrap() {
        return getReal();
    }

    public Gravity() {
        this(new android.view.Gravity(), (__DcgwBridgeToken) null);
    }

    public static void apply(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3, com.micklab.dcg.wrapper.android.graphics.Rect arg4) {
        android.view.Gravity.apply(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
    }

    public static void apply(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3, com.micklab.dcg.wrapper.android.graphics.Rect arg4, int arg5) {
        android.view.Gravity.apply(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5);
    }

    public static void apply(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3, int arg4, int arg5, com.micklab.dcg.wrapper.android.graphics.Rect arg6) {
        android.view.Gravity.apply(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal());
    }

    public static void apply(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3, int arg4, int arg5, com.micklab.dcg.wrapper.android.graphics.Rect arg6, int arg7) {
        android.view.Gravity.apply(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6 == null ? null : arg6.getReal(), arg7);
    }

    public static void applyDisplay(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2) {
        android.view.Gravity.applyDisplay(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public static void applyDisplay(int arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, int arg3) {
        android.view.Gravity.applyDisplay(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
    }

    public static int getAbsoluteGravity(int arg0, int arg1) {
        return android.view.Gravity.getAbsoluteGravity(arg0, arg1);
    }

    public static boolean isHorizontal(int arg0) {
        return android.view.Gravity.isHorizontal(arg0);
    }

    public static boolean isVertical(int arg0) {
        return android.view.Gravity.isVertical(arg0);
    }

    public static final int AXIS_CLIP = android.view.Gravity.AXIS_CLIP;
    public static final int AXIS_PULL_AFTER = android.view.Gravity.AXIS_PULL_AFTER;
    public static final int AXIS_PULL_BEFORE = android.view.Gravity.AXIS_PULL_BEFORE;
    public static final int AXIS_SPECIFIED = android.view.Gravity.AXIS_SPECIFIED;
    public static final int AXIS_X_SHIFT = android.view.Gravity.AXIS_X_SHIFT;
    public static final int AXIS_Y_SHIFT = android.view.Gravity.AXIS_Y_SHIFT;
    public static final int BOTTOM = android.view.Gravity.BOTTOM;
    public static final int CENTER = android.view.Gravity.CENTER;
    public static final int CENTER_HORIZONTAL = android.view.Gravity.CENTER_HORIZONTAL;
    public static final int CENTER_VERTICAL = android.view.Gravity.CENTER_VERTICAL;
    public static final int CLIP_HORIZONTAL = android.view.Gravity.CLIP_HORIZONTAL;
    public static final int CLIP_VERTICAL = android.view.Gravity.CLIP_VERTICAL;
    public static final int DISPLAY_CLIP_HORIZONTAL = android.view.Gravity.DISPLAY_CLIP_HORIZONTAL;
    public static final int DISPLAY_CLIP_VERTICAL = android.view.Gravity.DISPLAY_CLIP_VERTICAL;
    public static final int END = android.view.Gravity.END;
    public static final int FILL = android.view.Gravity.FILL;
    public static final int FILL_HORIZONTAL = android.view.Gravity.FILL_HORIZONTAL;
    public static final int FILL_VERTICAL = android.view.Gravity.FILL_VERTICAL;
    public static final int HORIZONTAL_GRAVITY_MASK = android.view.Gravity.HORIZONTAL_GRAVITY_MASK;
    public static final int LEFT = android.view.Gravity.LEFT;
    public static final int NO_GRAVITY = android.view.Gravity.NO_GRAVITY;
    public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = android.view.Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK;
    public static final int RELATIVE_LAYOUT_DIRECTION = android.view.Gravity.RELATIVE_LAYOUT_DIRECTION;
    public static final int RIGHT = android.view.Gravity.RIGHT;
    public static final int START = android.view.Gravity.START;
    public static final int TOP = android.view.Gravity.TOP;
    public static final int VERTICAL_GRAVITY_MASK = android.view.Gravity.VERTICAL_GRAVITY_MASK;

}
