// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class AlphaAnimation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AlphaAnimation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.AlphaAnimation wrap(android.view.animation.AlphaAnimation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.AlphaAnimation(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.AlphaAnimation getReal() {
        return (android.view.animation.AlphaAnimation) real;
    }

    public android.view.animation.AlphaAnimation unwrap() {
        return getReal();
    }

    public AlphaAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.AlphaAnimation(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public AlphaAnimation(float arg0, float arg1) {
        this(new android.view.animation.AlphaAnimation(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public boolean willChangeBounds() {
        return ((android.view.animation.AlphaAnimation) real).willChangeBounds();
    }

    public boolean willChangeTransformationMatrix() {
        return ((android.view.animation.AlphaAnimation) real).willChangeTransformationMatrix();
    }

}
