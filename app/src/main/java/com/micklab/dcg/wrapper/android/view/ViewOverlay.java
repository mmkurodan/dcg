// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewOverlay {
    private final android.view.ViewOverlay real;

    public ViewOverlay(android.view.ViewOverlay real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewOverlay wrap(android.view.ViewOverlay real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewOverlay(real);
    }

    public android.view.ViewOverlay unwrap() {
        return real;
    }

    public void add(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.add(arg0 == null ? null : arg0.unwrap());
    }

    public void clear() {
        real.clear();
    }

    public void remove(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.remove(arg0 == null ? null : arg0.unwrap());
    }

}
