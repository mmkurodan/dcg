// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ZoomControls {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ZoomControls(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ZoomControls wrap(android.widget.ZoomControls real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ZoomControls(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ZoomControls getReal() {
        return (android.widget.ZoomControls) real;
    }

    public android.widget.ZoomControls unwrap() {
        return getReal();
    }

    public ZoomControls(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ZoomControls(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ZoomControls(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ZoomControls(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.ZoomControls) real).getAccessibilityClassName();
    }

    public boolean hasFocus() {
        return ((android.widget.ZoomControls) real).hasFocus();
    }

    public void hide() {
        ((android.widget.ZoomControls) real).hide();
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.ZoomControls) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public void setIsZoomInEnabled(boolean arg0) {
        ((android.widget.ZoomControls) real).setIsZoomInEnabled(arg0);
    }

    public void setIsZoomOutEnabled(boolean arg0) {
        ((android.widget.ZoomControls) real).setIsZoomOutEnabled(arg0);
    }

    public void setOnZoomInClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        ((android.widget.ZoomControls) real).setOnZoomInClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnZoomOutClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        ((android.widget.ZoomControls) real).setOnZoomOutClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setZoomSpeed(long arg0) {
        ((android.widget.ZoomControls) real).setZoomSpeed(arg0);
    }

    public void show() {
        ((android.widget.ZoomControls) real).show();
    }

}
