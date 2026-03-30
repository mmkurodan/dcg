// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class TranslateAnimation {
    private final android.view.animation.TranslateAnimation real;

    public TranslateAnimation(android.view.animation.TranslateAnimation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.TranslateAnimation wrap(android.view.animation.TranslateAnimation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.TranslateAnimation(real);
    }

    public android.view.animation.TranslateAnimation unwrap() {
        return real;
    }

    public TranslateAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.TranslateAnimation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public TranslateAnimation(float arg0, float arg1, float arg2, float arg3) {
        this(new android.view.animation.TranslateAnimation(arg0, arg1, arg2, arg3));
    }

    public TranslateAnimation(int arg0, float arg1, int arg2, float arg3, int arg4, float arg5, int arg6, float arg7) {
        this(new android.view.animation.TranslateAnimation(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7));
    }

    public void initialize(int arg0, int arg1, int arg2, int arg3) {
        real.initialize(arg0, arg1, arg2, arg3);
    }

}
