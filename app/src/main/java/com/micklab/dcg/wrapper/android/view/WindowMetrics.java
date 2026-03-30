// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowMetrics {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WindowMetrics(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowMetrics wrap(android.view.WindowMetrics real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowMetrics(real, (__DcgwBridgeToken) null);
    }

    public android.view.WindowMetrics getReal() {
        return (android.view.WindowMetrics) real;
    }

    public android.view.WindowMetrics unwrap() {
        return getReal();
    }

    public WindowMetrics(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.view.WindowInsets arg1) {
        this(new android.view.WindowMetrics(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public WindowMetrics(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.view.WindowInsets arg1, float arg2) {
        this(new android.view.WindowMetrics(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.view.WindowMetrics) real).getBounds());
    }

    public float getDensity() {
        return ((android.view.WindowMetrics) real).getDensity();
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets getWindowInsets() {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(((android.view.WindowMetrics) real).getWindowInsets());
    }

    public java.lang.String toString() {
        return ((android.view.WindowMetrics) real).toString();
    }

}
