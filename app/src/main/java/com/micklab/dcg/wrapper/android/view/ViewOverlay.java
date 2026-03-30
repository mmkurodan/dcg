// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewOverlay {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewOverlay(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewOverlay wrap(android.view.ViewOverlay real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewOverlay(real, (__DcgwBridgeToken) null);
    }

    public android.view.ViewOverlay getReal() {
        return (android.view.ViewOverlay) real;
    }

    public android.view.ViewOverlay unwrap() {
        return getReal();
    }

    public void add(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.ViewOverlay) real).add(arg0 == null ? null : arg0.getReal());
    }

    public void clear() {
        ((android.view.ViewOverlay) real).clear();
    }

    public void remove(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.view.ViewOverlay) real).remove(arg0 == null ? null : arg0.getReal());
    }

}
