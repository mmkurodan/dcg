// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class OnBackAnimationCallback {
    private final android.window.OnBackAnimationCallback real;

    public OnBackAnimationCallback(android.window.OnBackAnimationCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.OnBackAnimationCallback wrap(android.window.OnBackAnimationCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.OnBackAnimationCallback(real);
    }

    public android.window.OnBackAnimationCallback unwrap() {
        return real;
    }

    public void onBackCancelled() {
        real.onBackCancelled();
    }

    public void onBackProgressed(com.micklab.dcg.wrapper.android.window.BackEvent arg0) {
        real.onBackProgressed(arg0 == null ? null : arg0.unwrap());
    }

    public void onBackStarted(com.micklab.dcg.wrapper.android.window.BackEvent arg0) {
        real.onBackStarted(arg0 == null ? null : arg0.unwrap());
    }

}
