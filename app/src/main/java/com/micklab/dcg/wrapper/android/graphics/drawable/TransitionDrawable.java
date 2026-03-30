// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class TransitionDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TransitionDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.TransitionDrawable wrap(android.graphics.drawable.TransitionDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.TransitionDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.TransitionDrawable getReal() {
        return (android.graphics.drawable.TransitionDrawable) real;
    }

    public android.graphics.drawable.TransitionDrawable unwrap() {
        return getReal();
    }

    public TransitionDrawable(android.graphics.drawable.Drawable[] arg0) {
        this(new android.graphics.drawable.TransitionDrawable(arg0), (__DcgwBridgeToken) null);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.TransitionDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public boolean isCrossFadeEnabled() {
        return ((android.graphics.drawable.TransitionDrawable) real).isCrossFadeEnabled();
    }

    public void resetTransition() {
        ((android.graphics.drawable.TransitionDrawable) real).resetTransition();
    }

    public void reverseTransition(int arg0) {
        ((android.graphics.drawable.TransitionDrawable) real).reverseTransition(arg0);
    }

    public void setCrossFadeEnabled(boolean arg0) {
        ((android.graphics.drawable.TransitionDrawable) real).setCrossFadeEnabled(arg0);
    }

    public void startTransition(int arg0) {
        ((android.graphics.drawable.TransitionDrawable) real).startTransition(arg0);
    }

}
