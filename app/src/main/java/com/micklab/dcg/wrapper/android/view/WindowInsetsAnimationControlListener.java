// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowInsetsAnimationControlListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WindowInsetsAnimationControlListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationControlListener wrap(android.view.WindowInsetsAnimationControlListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationControlListener(real, (__DcgwBridgeToken) null);
    }

    public android.view.WindowInsetsAnimationControlListener getReal() {
        return (android.view.WindowInsetsAnimationControlListener) real;
    }

    public android.view.WindowInsetsAnimationControlListener unwrap() {
        return getReal();
    }

    public void onCancelled(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationController arg0) {
        ((android.view.WindowInsetsAnimationControlListener) real).onCancelled(arg0 == null ? null : arg0.getReal());
    }

    public void onFinished(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationController arg0) {
        ((android.view.WindowInsetsAnimationControlListener) real).onFinished(arg0 == null ? null : arg0.getReal());
    }

    public void onReady(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationController arg0, int arg1) {
        ((android.view.WindowInsetsAnimationControlListener) real).onReady(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
