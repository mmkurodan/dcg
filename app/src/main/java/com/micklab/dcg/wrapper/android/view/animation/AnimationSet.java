// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class AnimationSet {
    private final android.view.animation.AnimationSet real;

    public AnimationSet(android.view.animation.AnimationSet real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.AnimationSet wrap(android.view.animation.AnimationSet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.AnimationSet(real);
    }

    public android.view.animation.AnimationSet unwrap() {
        return real;
    }

    public AnimationSet(boolean arg0) {
        this(new android.view.animation.AnimationSet(arg0));
    }

    public AnimationSet(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.AnimationSet(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void addAnimation(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        real.addAnimation(arg0 == null ? null : arg0.unwrap());
    }

    public long computeDurationHint() {
        return real.computeDurationHint();
    }

    public long getDuration() {
        return real.getDuration();
    }

    public long getStartTime() {
        return real.getStartTime();
    }

    public boolean getTransformation(long arg0, com.micklab.dcg.wrapper.android.view.animation.Transformation arg1) {
        return real.getTransformation(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void initialize(int arg0, int arg1, int arg2, int arg3) {
        real.initialize(arg0, arg1, arg2, arg3);
    }

    public void reset() {
        real.reset();
    }

    public void restrictDuration(long arg0) {
        real.restrictDuration(arg0);
    }

    public void scaleCurrentDuration(float arg0) {
        real.scaleCurrentDuration(arg0);
    }

    public void setDuration(long arg0) {
        real.setDuration(arg0);
    }

    public void setFillAfter(boolean arg0) {
        real.setFillAfter(arg0);
    }

    public void setFillBefore(boolean arg0) {
        real.setFillBefore(arg0);
    }

    public void setRepeatMode(int arg0) {
        real.setRepeatMode(arg0);
    }

    public void setStartOffset(long arg0) {
        real.setStartOffset(arg0);
    }

    public void setStartTime(long arg0) {
        real.setStartTime(arg0);
    }

    public boolean willChangeBounds() {
        return real.willChangeBounds();
    }

    public boolean willChangeTransformationMatrix() {
        return real.willChangeTransformationMatrix();
    }

}
