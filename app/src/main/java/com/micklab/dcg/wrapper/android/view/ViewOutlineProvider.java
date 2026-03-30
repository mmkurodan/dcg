// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewOutlineProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewOutlineProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewOutlineProvider wrap(android.view.ViewOutlineProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewOutlineProvider(real, (__DcgwBridgeToken) null);
    }

    public android.view.ViewOutlineProvider getReal() {
        return (android.view.ViewOutlineProvider) real;
    }

    public android.view.ViewOutlineProvider unwrap() {
        return getReal();
    }

    public void getOutline(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.graphics.Outline arg1) {
        ((android.view.ViewOutlineProvider) real).getOutline(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static final com.micklab.dcg.wrapper.android.view.ViewOutlineProvider BACKGROUND = com.micklab.dcg.wrapper.android.view.ViewOutlineProvider.wrap(android.view.ViewOutlineProvider.BACKGROUND);
    public static final com.micklab.dcg.wrapper.android.view.ViewOutlineProvider BOUNDS = com.micklab.dcg.wrapper.android.view.ViewOutlineProvider.wrap(android.view.ViewOutlineProvider.BOUNDS);
    public static final com.micklab.dcg.wrapper.android.view.ViewOutlineProvider PADDED_BOUNDS = com.micklab.dcg.wrapper.android.view.ViewOutlineProvider.wrap(android.view.ViewOutlineProvider.PADDED_BOUNDS);

}
