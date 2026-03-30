// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class AlphaAnimation {
    private final android.view.animation.AlphaAnimation real;

    public AlphaAnimation(android.view.animation.AlphaAnimation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.AlphaAnimation wrap(android.view.animation.AlphaAnimation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.AlphaAnimation(real);
    }

    public android.view.animation.AlphaAnimation unwrap() {
        return real;
    }

    public AlphaAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.AlphaAnimation(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public AlphaAnimation(float arg0, float arg1) {
        this(new android.view.animation.AlphaAnimation(arg0, arg1));
    }

    public boolean willChangeBounds() {
        return real.willChangeBounds();
    }

    public boolean willChangeTransformationMatrix() {
        return real.willChangeTransformationMatrix();
    }

}
