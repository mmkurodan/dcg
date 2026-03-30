// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class ScaleAnimation {
    private final android.view.animation.ScaleAnimation real;

    public ScaleAnimation(android.view.animation.ScaleAnimation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.ScaleAnimation wrap(android.view.animation.ScaleAnimation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.ScaleAnimation(real);
    }

    public android.view.animation.ScaleAnimation unwrap() {
        return real;
    }

    public ScaleAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.ScaleAnimation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ScaleAnimation(float arg0, float arg1, float arg2, float arg3) {
        this(new android.view.animation.ScaleAnimation(arg0, arg1, arg2, arg3));
    }

    public ScaleAnimation(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this(new android.view.animation.ScaleAnimation(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public ScaleAnimation(float arg0, float arg1, float arg2, float arg3, int arg4, float arg5, int arg6, float arg7) {
        this(new android.view.animation.ScaleAnimation(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7));
    }

    public void initialize(int arg0, int arg1, int arg2, int arg3) {
        real.initialize(arg0, arg1, arg2, arg3);
    }

}
