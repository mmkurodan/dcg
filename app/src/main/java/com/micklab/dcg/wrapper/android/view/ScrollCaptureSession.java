// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ScrollCaptureSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScrollCaptureSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ScrollCaptureSession wrap(android.view.ScrollCaptureSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScrollCaptureSession(real, (__DcgwBridgeToken) null);
    }

    public android.view.ScrollCaptureSession getReal() {
        return (android.view.ScrollCaptureSession) real;
    }

    public android.view.ScrollCaptureSession unwrap() {
        return getReal();
    }

    public ScrollCaptureSession(com.micklab.dcg.wrapper.android.view.Surface arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Point arg2) {
        this(new android.view.ScrollCaptureSession(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getPositionInWindow() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(((android.view.ScrollCaptureSession) real).getPositionInWindow());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getScrollBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.view.ScrollCaptureSession) real).getScrollBounds());
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(((android.view.ScrollCaptureSession) real).getSurface());
    }

}
