// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ZoomButton {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ZoomButton(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ZoomButton wrap(android.widget.ZoomButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ZoomButton(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ZoomButton getReal() {
        return (android.widget.ZoomButton) real;
    }

    public android.widget.ZoomButton unwrap() {
        return getReal();
    }

    public ZoomButton(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ZoomButton(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ZoomButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ZoomButton(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ZoomButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ZoomButton(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public ZoomButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ZoomButton(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public boolean dispatchUnhandledMove(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return ((android.widget.ZoomButton) real).dispatchUnhandledMove(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.ZoomButton) real).getAccessibilityClassName();
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.ZoomButton) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onLongClick(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.widget.ZoomButton) real).onLongClick(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.ZoomButton) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public void setEnabled(boolean arg0) {
        ((android.widget.ZoomButton) real).setEnabled(arg0);
    }

    public void setZoomSpeed(long arg0) {
        ((android.widget.ZoomButton) real).setZoomSpeed(arg0);
    }

}
