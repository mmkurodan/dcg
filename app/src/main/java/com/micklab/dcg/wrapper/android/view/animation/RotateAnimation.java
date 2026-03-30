// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class RotateAnimation {
    private final android.view.animation.RotateAnimation real;

    public RotateAnimation(android.view.animation.RotateAnimation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.RotateAnimation wrap(android.view.animation.RotateAnimation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.RotateAnimation(real);
    }

    public android.view.animation.RotateAnimation unwrap() {
        return real;
    }

    public RotateAnimation(float arg0, float arg1) {
        this(new android.view.animation.RotateAnimation(arg0, arg1));
    }

    public RotateAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.RotateAnimation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public RotateAnimation(float arg0, float arg1, float arg2, float arg3) {
        this(new android.view.animation.RotateAnimation(arg0, arg1, arg2, arg3));
    }

    public RotateAnimation(float arg0, float arg1, int arg2, float arg3, int arg4, float arg5) {
        this(new android.view.animation.RotateAnimation(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public void initialize(int arg0, int arg1, int arg2, int arg3) {
        real.initialize(arg0, arg1, arg2, arg3);
    }

}
