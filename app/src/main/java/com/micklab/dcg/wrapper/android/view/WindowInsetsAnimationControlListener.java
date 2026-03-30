// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowInsetsAnimationControlListener {
    private final android.view.WindowInsetsAnimationControlListener real;

    public WindowInsetsAnimationControlListener(android.view.WindowInsetsAnimationControlListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationControlListener wrap(android.view.WindowInsetsAnimationControlListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationControlListener(real);
    }

    public android.view.WindowInsetsAnimationControlListener unwrap() {
        return real;
    }

    public void onCancelled(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationController arg0) {
        real.onCancelled(arg0 == null ? null : arg0.unwrap());
    }

    public void onFinished(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationController arg0) {
        real.onFinished(arg0 == null ? null : arg0.unwrap());
    }

    public void onReady(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimationController arg0, int arg1) {
        real.onReady(arg0 == null ? null : arg0.unwrap(), arg1);
    }

}
