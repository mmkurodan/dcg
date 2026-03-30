// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewManager wrap(android.view.ViewManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewManager(real, (__DcgwBridgeToken) null);
    }

    public android.view.ViewManager getReal() {
        return (android.view.ViewManager) real;
    }

    public android.view.ViewManager unwrap() {
        return getReal();
    }

    public void addView(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.view.ViewManager) real).addView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void removeView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.view.ViewManager) real).removeView(arg0 == null ? null : arg0.getReal());
    }

    public void updateViewLayout(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.ViewGroup.LayoutParams arg1) {
        ((android.view.ViewManager) real).updateViewLayout(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

}
