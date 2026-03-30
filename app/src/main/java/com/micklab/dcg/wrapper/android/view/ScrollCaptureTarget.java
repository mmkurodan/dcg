// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ScrollCaptureTarget {
    private final android.view.ScrollCaptureTarget real;

    public ScrollCaptureTarget(android.view.ScrollCaptureTarget real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ScrollCaptureTarget wrap(android.view.ScrollCaptureTarget real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScrollCaptureTarget(real);
    }

    public android.view.ScrollCaptureTarget unwrap() {
        return real;
    }

    public ScrollCaptureTarget(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Point arg2, com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback arg3) {
        this(new android.view.ScrollCaptureTarget(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback getCallback() {
        return com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback.wrap(real.getCallback());
    }

    public com.micklab.dcg.wrapper.android.view.View getContainingView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getContainingView());
    }

    public int getHint() {
        return real.getHint();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getLocalVisibleRect() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getLocalVisibleRect());
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getPositionInWindow() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(real.getPositionInWindow());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getScrollBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getScrollBounds());
    }

    public void setScrollBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setScrollBounds(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void updatePositionInWindow() {
        real.updatePositionInWindow();
    }

}
