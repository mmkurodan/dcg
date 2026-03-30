// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class AnimatorSet {
    private final android.animation.AnimatorSet real;

    public AnimatorSet(android.animation.AnimatorSet real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.AnimatorSet wrap(android.animation.AnimatorSet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.AnimatorSet(real);
    }

    public android.animation.AnimatorSet unwrap() {
        return real;
    }

    public AnimatorSet() {
        this(new android.animation.AnimatorSet());
    }

    public void cancel() {
        real.cancel();
    }

    public com.micklab.dcg.wrapper.android.animation.AnimatorSet clone() {
        return com.micklab.dcg.wrapper.android.animation.AnimatorSet.wrap(real.clone());
    }

    public void end() {
        real.end();
    }

    public long getCurrentPlayTime() {
        return real.getCurrentPlayTime();
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

    public long getTotalDuration() {
        return real.getTotalDuration();
    }

    public boolean isRunning() {
        return real.isRunning();
    }

    public boolean isStarted() {
        return real.isStarted();
    }

    public void pause() {
        real.pause();
    }

    public android.animation.AnimatorSet.Builder play(com.micklab.dcg.wrapper.android.animation.Animator arg0) {
        return real.play(arg0 == null ? null : arg0.unwrap());
    }

    public void playSequentially(android.animation.Animator... arg0) {
        real.playSequentially(arg0);
    }

    public void playTogether(android.animation.Animator... arg0) {
        real.playTogether(arg0);
    }

    public void resume() {
        real.resume();
    }

    public void reverse() {
        real.reverse();
    }

    public void setCurrentPlayTime(long arg0) {
        real.setCurrentPlayTime(arg0);
    }

    public com.micklab.dcg.wrapper.android.animation.AnimatorSet setDuration(long arg0) {
        return com.micklab.dcg.wrapper.android.animation.AnimatorSet.wrap(real.setDuration(arg0));
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg0) {
        real.setInterpolator(arg0 == null ? null : arg0.unwrap());
    }

    public void setStartDelay(long arg0) {
        real.setStartDelay(arg0);
    }

    public void setTarget(java.lang.Object arg0) {
        real.setTarget(arg0);
    }

    public void setupEndValues() {
        real.setupEndValues();
    }

    public void setupStartValues() {
        real.setupStartValues();
    }

    public void start() {
        real.start();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
