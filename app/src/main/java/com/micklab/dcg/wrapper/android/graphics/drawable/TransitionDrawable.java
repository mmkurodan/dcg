// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class TransitionDrawable {
    private final android.graphics.drawable.TransitionDrawable real;

    public TransitionDrawable(android.graphics.drawable.TransitionDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.TransitionDrawable wrap(android.graphics.drawable.TransitionDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.TransitionDrawable(real);
    }

    public android.graphics.drawable.TransitionDrawable unwrap() {
        return real;
    }

    public TransitionDrawable(android.graphics.drawable.Drawable[] arg0) {
        this(new android.graphics.drawable.TransitionDrawable(arg0));
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isCrossFadeEnabled() {
        return real.isCrossFadeEnabled();
    }

    public void resetTransition() {
        real.resetTransition();
    }

    public void reverseTransition(int arg0) {
        real.reverseTransition(arg0);
    }

    public void setCrossFadeEnabled(boolean arg0) {
        real.setCrossFadeEnabled(arg0);
    }

    public void startTransition(int arg0) {
        real.startTransition(arg0);
    }

}
