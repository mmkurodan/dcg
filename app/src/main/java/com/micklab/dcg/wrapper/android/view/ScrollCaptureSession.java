// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ScrollCaptureSession {
    private final android.view.ScrollCaptureSession real;

    public ScrollCaptureSession(android.view.ScrollCaptureSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ScrollCaptureSession wrap(android.view.ScrollCaptureSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScrollCaptureSession(real);
    }

    public android.view.ScrollCaptureSession unwrap() {
        return real;
    }

    public ScrollCaptureSession(com.micklab.dcg.wrapper.android.view.Surface arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1, com.micklab.dcg.wrapper.android.graphics.Point arg2) {
        this(new android.view.ScrollCaptureSession(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getPositionInWindow() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(real.getPositionInWindow());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getScrollBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getScrollBounds());
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(real.getSurface());
    }

}
