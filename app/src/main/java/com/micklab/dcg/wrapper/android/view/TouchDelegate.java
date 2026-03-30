// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class TouchDelegate {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TouchDelegate(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.TouchDelegate wrap(android.view.TouchDelegate real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.TouchDelegate(real, (__DcgwBridgeToken) null);
    }

    public android.view.TouchDelegate getReal() {
        return (android.view.TouchDelegate) real;
    }

    public android.view.TouchDelegate unwrap() {
        return getReal();
    }

    public TouchDelegate(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        this(new android.view.TouchDelegate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        return com.micklab.dcg.wrapper.android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo.wrap(((android.view.TouchDelegate) real).getTouchDelegateInfo());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.TouchDelegate) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTouchExplorationHoverEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.TouchDelegate) real).onTouchExplorationHoverEvent(arg0 == null ? null : arg0.getReal());
    }

    public static final int ABOVE = android.view.TouchDelegate.ABOVE;
    public static final int BELOW = android.view.TouchDelegate.BELOW;
    public static final int TO_LEFT = android.view.TouchDelegate.TO_LEFT;
    public static final int TO_RIGHT = android.view.TouchDelegate.TO_RIGHT;

}
