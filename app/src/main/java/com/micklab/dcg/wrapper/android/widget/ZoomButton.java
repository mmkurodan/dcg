// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ZoomButton {
    private final android.widget.ZoomButton real;

    public ZoomButton(android.widget.ZoomButton real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ZoomButton wrap(android.widget.ZoomButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ZoomButton(real);
    }

    public android.widget.ZoomButton unwrap() {
        return real;
    }

    public ZoomButton(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ZoomButton(arg0 == null ? null : arg0.unwrap()));
    }

    public ZoomButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ZoomButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ZoomButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ZoomButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public ZoomButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ZoomButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public boolean dispatchUnhandledMove(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        return real.dispatchUnhandledMove(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onLongClick(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.onLongClick(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setZoomSpeed(long arg0) {
        real.setZoomSpeed(arg0);
    }

}
