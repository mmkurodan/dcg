// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewPropertyAnimator {
    private final android.view.ViewPropertyAnimator real;

    public ViewPropertyAnimator(android.view.ViewPropertyAnimator real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator wrap(android.view.ViewPropertyAnimator real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator(real);
    }

    public android.view.ViewPropertyAnimator unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator alpha(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.alpha(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator alphaBy(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.alphaBy(arg0));
    }

    public void cancel() {
        real.cancel();
    }

    public long getDuration() {
        return real.getDuration();
    }

    public com.micklab.dcg.wrapper.android.animation.TimeInterpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.animation.TimeInterpolator.wrap(real.getInterpolator());
    }

    public long getStartDelay() {
        return real.getStartDelay();
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator rotation(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.rotation(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator rotationBy(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.rotationBy(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator rotationX(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.rotationX(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator rotationXBy(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.rotationXBy(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator rotationY(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.rotationY(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator rotationYBy(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.rotationYBy(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator scaleX(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.scaleX(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator scaleXBy(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.scaleXBy(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator scaleY(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.scaleY(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator scaleYBy(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.scaleYBy(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator setDuration(long arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.setDuration(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator setInterpolator(com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.setInterpolator(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator setListener(com.micklab.dcg.wrapper.android.animation.Animator.AnimatorListener arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.setListener(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator setStartDelay(long arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.setStartDelay(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator setUpdateListener(com.micklab.dcg.wrapper.android.animation.ValueAnimator.AnimatorUpdateListener arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.setUpdateListener(arg0 == null ? null : arg0.unwrap()));
    }

    public void start() {
        real.start();
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator translationX(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.translationX(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator translationXBy(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.translationXBy(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator translationY(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.translationY(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator translationYBy(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.translationYBy(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator translationZ(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.translationZ(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator translationZBy(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.translationZBy(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator withEndAction(java.lang.Runnable arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.withEndAction(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator withLayer() {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.withLayer());
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator withStartAction(java.lang.Runnable arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.withStartAction(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator x(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.x(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator xBy(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.xBy(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator y(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.y(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator yBy(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.yBy(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator z(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.z(arg0));
    }

    public com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator zBy(float arg0) {
        return com.micklab.dcg.wrapper.android.view.ViewPropertyAnimator.wrap(real.zBy(arg0));
    }

}
