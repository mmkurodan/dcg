// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewOutlineProvider {
    private final android.view.ViewOutlineProvider real;

    public ViewOutlineProvider(android.view.ViewOutlineProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewOutlineProvider wrap(android.view.ViewOutlineProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewOutlineProvider(real);
    }

    public android.view.ViewOutlineProvider unwrap() {
        return real;
    }

    public void getOutline(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Outline arg1) {
        real.getOutline(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static final com.micklab.dcg.wrapper.android.view.ViewOutlineProvider BACKGROUND = com.micklab.dcg.wrapper.android.view.ViewOutlineProvider.wrap(android.view.ViewOutlineProvider.BACKGROUND);
    public static final com.micklab.dcg.wrapper.android.view.ViewOutlineProvider BOUNDS = com.micklab.dcg.wrapper.android.view.ViewOutlineProvider.wrap(android.view.ViewOutlineProvider.BOUNDS);
    public static final com.micklab.dcg.wrapper.android.view.ViewOutlineProvider PADDED_BOUNDS = com.micklab.dcg.wrapper.android.view.ViewOutlineProvider.wrap(android.view.ViewOutlineProvider.PADDED_BOUNDS);

}
