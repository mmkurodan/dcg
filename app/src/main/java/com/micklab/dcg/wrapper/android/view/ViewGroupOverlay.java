// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewGroupOverlay {
    private final android.view.ViewGroupOverlay real;

    public ViewGroupOverlay(android.view.ViewGroupOverlay real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewGroupOverlay wrap(android.view.ViewGroupOverlay real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewGroupOverlay(real);
    }

    public android.view.ViewGroupOverlay unwrap() {
        return real;
    }

    public void add(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.add(arg0 == null ? null : arg0.unwrap());
    }

    public void remove(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.remove(arg0 == null ? null : arg0.unwrap());
    }

}
