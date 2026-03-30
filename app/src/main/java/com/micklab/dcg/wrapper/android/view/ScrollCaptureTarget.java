// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ScrollCaptureTarget {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScrollCaptureTarget(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ScrollCaptureTarget wrap(android.view.ScrollCaptureTarget real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScrollCaptureTarget(real, (__DcgwBridgeToken) null);
    }

    public android.view.ScrollCaptureTarget getReal() {
        return (android.view.ScrollCaptureTarget) real;
    }

    public android.view.ScrollCaptureTarget unwrap() {
        return getReal();
    }

    public ScrollCaptureTarget(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Point arg2, com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback arg3) {
        this(new android.view.ScrollCaptureTarget(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback getCallback() {
        return com.micklab.dcg.wrapper.android.view.ScrollCaptureCallback.wrap(((android.view.ScrollCaptureTarget) real).getCallback());
    }

    public com.micklab.dcg.wrapper.android.view.View getContainingView() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.view.ScrollCaptureTarget) real).getContainingView());
    }

    public int getHint() {
        return ((android.view.ScrollCaptureTarget) real).getHint();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getLocalVisibleRect() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.view.ScrollCaptureTarget) real).getLocalVisibleRect());
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getPositionInWindow() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(((android.view.ScrollCaptureTarget) real).getPositionInWindow());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getScrollBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.view.ScrollCaptureTarget) real).getScrollBounds());
    }

    public void setScrollBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.ScrollCaptureTarget) real).setScrollBounds(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.view.ScrollCaptureTarget) real).toString();
    }

    public void updatePositionInWindow() {
        ((android.view.ScrollCaptureTarget) real).updatePositionInWindow();
    }

}
