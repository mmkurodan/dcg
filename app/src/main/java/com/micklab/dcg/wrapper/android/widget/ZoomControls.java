// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ZoomControls {
    private final android.widget.ZoomControls real;

    public ZoomControls(android.widget.ZoomControls real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ZoomControls wrap(android.widget.ZoomControls real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ZoomControls(real);
    }

    public android.widget.ZoomControls unwrap() {
        return real;
    }

    public ZoomControls(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ZoomControls(arg0 == null ? null : arg0.unwrap()));
    }

    public ZoomControls(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ZoomControls(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public boolean hasFocus() {
        return real.hasFocus();
    }

    public void hide() {
        real.hide();
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void setIsZoomInEnabled(boolean arg0) {
        real.setIsZoomInEnabled(arg0);
    }

    public void setIsZoomOutEnabled(boolean arg0) {
        real.setIsZoomOutEnabled(arg0);
    }

    public void setOnZoomInClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        real.setOnZoomInClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnZoomOutClickListener(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0) {
        real.setOnZoomOutClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setZoomSpeed(long arg0) {
        real.setZoomSpeed(arg0);
    }

    public void show() {
        real.show();
    }

}
