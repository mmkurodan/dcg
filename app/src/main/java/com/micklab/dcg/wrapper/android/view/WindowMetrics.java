// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowMetrics {
    private final android.view.WindowMetrics real;

    public WindowMetrics(android.view.WindowMetrics real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowMetrics wrap(android.view.WindowMetrics real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowMetrics(real);
    }

    public android.view.WindowMetrics unwrap() {
        return real;
    }

    public WindowMetrics(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.view.WindowInsets arg1) {
        this(new android.view.WindowMetrics(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public WindowMetrics(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.view.WindowInsets arg1, float arg2) {
        this(new android.view.WindowMetrics(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getBounds());
    }

    public float getDensity() {
        return real.getDensity();
    }

    public com.micklab.dcg.wrapper.android.view.WindowInsets getWindowInsets() {
        return com.micklab.dcg.wrapper.android.view.WindowInsets.wrap(real.getWindowInsets());
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
