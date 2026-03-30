// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewGroupOverlay {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewGroupOverlay(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewGroupOverlay wrap(android.view.ViewGroupOverlay real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewGroupOverlay(real, (__DcgwBridgeToken) null);
    }

    public android.view.ViewGroupOverlay getReal() {
        return (android.view.ViewGroupOverlay) real;
    }

    public android.view.ViewGroupOverlay unwrap() {
        return getReal();
    }

    public void add(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroupOverlay) real).add(arg0 == null ? null : arg0.getReal());
    }

    public void remove(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewGroupOverlay) real).remove(arg0 == null ? null : arg0.getReal());
    }

}
