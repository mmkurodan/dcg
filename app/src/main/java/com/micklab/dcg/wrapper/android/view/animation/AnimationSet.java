// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class AnimationSet {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AnimationSet(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.AnimationSet wrap(android.view.animation.AnimationSet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.AnimationSet(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.AnimationSet getReal() {
        return (android.view.animation.AnimationSet) real;
    }

    public android.view.animation.AnimationSet unwrap() {
        return getReal();
    }

    public AnimationSet(boolean arg0) {
        this(new android.view.animation.AnimationSet(arg0), (__DcgwBridgeToken) null);
    }

    public AnimationSet(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.AnimationSet(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void addAnimation(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        ((android.view.animation.AnimationSet) real).addAnimation(arg0 == null ? null : arg0.getReal());
    }

    public long computeDurationHint() {
        return ((android.view.animation.AnimationSet) real).computeDurationHint();
    }

    public long getDuration() {
        return ((android.view.animation.AnimationSet) real).getDuration();
    }

    public long getStartTime() {
        return ((android.view.animation.AnimationSet) real).getStartTime();
    }

    public boolean getTransformation(long arg0, com.micklab.dcg.wrapper.android.view.animation.Transformation arg1) {
        return ((android.view.animation.AnimationSet) real).getTransformation(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void initialize(int arg0, int arg1, int arg2, int arg3) {
        ((android.view.animation.AnimationSet) real).initialize(arg0, arg1, arg2, arg3);
    }

    public void reset() {
        ((android.view.animation.AnimationSet) real).reset();
    }

    public void restrictDuration(long arg0) {
        ((android.view.animation.AnimationSet) real).restrictDuration(arg0);
    }

    public void scaleCurrentDuration(float arg0) {
        ((android.view.animation.AnimationSet) real).scaleCurrentDuration(arg0);
    }

    public void setDuration(long arg0) {
        ((android.view.animation.AnimationSet) real).setDuration(arg0);
    }

    public void setFillAfter(boolean arg0) {
        ((android.view.animation.AnimationSet) real).setFillAfter(arg0);
    }

    public void setFillBefore(boolean arg0) {
        ((android.view.animation.AnimationSet) real).setFillBefore(arg0);
    }

    public void setRepeatMode(int arg0) {
        ((android.view.animation.AnimationSet) real).setRepeatMode(arg0);
    }

    public void setStartOffset(long arg0) {
        ((android.view.animation.AnimationSet) real).setStartOffset(arg0);
    }

    public void setStartTime(long arg0) {
        ((android.view.animation.AnimationSet) real).setStartTime(arg0);
    }

    public boolean willChangeBounds() {
        return ((android.view.animation.AnimationSet) real).willChangeBounds();
    }

    public boolean willChangeTransformationMatrix() {
        return ((android.view.animation.AnimationSet) real).willChangeTransformationMatrix();
    }

}
