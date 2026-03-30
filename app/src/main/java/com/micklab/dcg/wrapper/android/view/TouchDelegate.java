// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class TouchDelegate {
    private final android.view.TouchDelegate real;

    public TouchDelegate(android.view.TouchDelegate real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.TouchDelegate wrap(android.view.TouchDelegate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.TouchDelegate(real);
    }

    public android.view.TouchDelegate unwrap() {
        return real;
    }

    public TouchDelegate(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        this(new android.view.TouchDelegate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo.wrap(real.getTouchDelegateInfo());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTouchExplorationHoverEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchExplorationHoverEvent(arg0 == null ? null : arg0.unwrap());
    }

    public static final int ABOVE = android.view.TouchDelegate.ABOVE;
    public static final int BELOW = android.view.TouchDelegate.BELOW;
    public static final int TO_LEFT = android.view.TouchDelegate.TO_LEFT;
    public static final int TO_RIGHT = android.view.TouchDelegate.TO_RIGHT;

}
