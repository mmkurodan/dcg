// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class Transition {
    private final android.transition.Transition real;

    public Transition(android.transition.Transition real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.Transition wrap(android.transition.Transition real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Transition(real);
    }

    public android.transition.Transition unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.transition.Transition addListener(com.micklab.dcg.wrapper.android.transition.Transition.TransitionListener arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.addListener(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition addTarget(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.addTarget(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition addTarget(int arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.addTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition addTarget(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.addTarget(arg0));
    }

    public boolean canRemoveViews() {
        return real.canRemoveViews();
    }

    public void captureEndValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        real.captureEndValues(arg0 == null ? null : arg0.unwrap());
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        real.captureStartValues(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition clone() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.clone());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator createAnimator(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.createAnimator(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeChildren(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.excludeChildren(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeChildren(int arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.excludeChildren(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeTarget(int arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.excludeTarget(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeTarget(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.excludeTarget(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeTarget(java.lang.String arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.excludeTarget(arg0, arg1));
    }

    public long getDuration() {
        return real.getDuration();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getEpicenter() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getEpicenter());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition.EpicenterCallback getEpicenterCallback() {
        return com.micklab.dcg.wrapper.android.transition.Transition.EpicenterCallback.wrap(real.getEpicenterCallback());
    }

    public com.micklab.dcg.wrapper.android.animation.TimeInterpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.animation.TimeInterpolator.wrap(real.getInterpolator());
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public com.micklab.dcg.wrapper.android.transition.PathMotion getPathMotion() {
        return com.micklab.dcg.wrapper.android.transition.PathMotion.wrap(real.getPathMotion());
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionPropagation getPropagation() {
        return com.micklab.dcg.wrapper.android.transition.TransitionPropagation.wrap(real.getPropagation());
    }

    public long getStartDelay() {
        return real.getStartDelay();
    }

    public java.lang.String[] getTransitionProperties() {
        return real.getTransitionProperties();
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionValues getTransitionValues(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.TransitionValues.wrap(real.getTransitionValues(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public boolean isTransitionRequired(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1) {
        return real.isTransitionRequired(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition removeListener(com.micklab.dcg.wrapper.android.transition.Transition.TransitionListener arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.removeListener(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition removeTarget(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.removeTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition removeTarget(int arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.removeTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition removeTarget(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.removeTarget(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition setDuration(long arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.setDuration(arg0));
    }

    public void setEpicenterCallback(com.micklab.dcg.wrapper.android.transition.Transition.EpicenterCallback arg0) {
        real.setEpicenterCallback(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition setInterpolator(com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.setInterpolator(arg0 == null ? null : arg0.unwrap()));
    }

    public void setMatchOrder(int... arg0) {
        real.setMatchOrder(arg0);
    }

    public void setPathMotion(com.micklab.dcg.wrapper.android.transition.PathMotion arg0) {
        real.setPathMotion(arg0 == null ? null : arg0.unwrap());
    }

    public void setPropagation(com.micklab.dcg.wrapper.android.transition.TransitionPropagation arg0) {
        real.setPropagation(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition setStartDelay(long arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(real.setStartDelay(arg0));
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int MATCH_ID = android.transition.Transition.MATCH_ID;
    public static final int MATCH_INSTANCE = android.transition.Transition.MATCH_INSTANCE;
    public static final int MATCH_ITEM_ID = android.transition.Transition.MATCH_ITEM_ID;
    public static final int MATCH_NAME = android.transition.Transition.MATCH_NAME;

    public static final class EpicenterCallback {
        private final android.transition.Transition.EpicenterCallback real;

        public EpicenterCallback(android.transition.Transition.EpicenterCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.transition.Transition.EpicenterCallback wrap(android.transition.Transition.EpicenterCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Transition.EpicenterCallback(real);
        }

        public android.transition.Transition.EpicenterCallback unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.graphics.Rect onGetEpicenter(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.onGetEpicenter(arg0 == null ? null : arg0.unwrap()));
        }

    }
    public static final class TransitionListener {
        private final android.transition.Transition.TransitionListener real;

        public TransitionListener(android.transition.Transition.TransitionListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.transition.Transition.TransitionListener wrap(android.transition.Transition.TransitionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Transition.TransitionListener(real);
        }

        public android.transition.Transition.TransitionListener unwrap() {
            return real;
        }

        public void onTransitionCancel(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
            real.onTransitionCancel(arg0 == null ? null : arg0.unwrap());
        }

        public void onTransitionEnd(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
            real.onTransitionEnd(arg0 == null ? null : arg0.unwrap());
        }

        public void onTransitionPause(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
            real.onTransitionPause(arg0 == null ? null : arg0.unwrap());
        }

        public void onTransitionResume(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
            real.onTransitionResume(arg0 == null ? null : arg0.unwrap());
        }

        public void onTransitionStart(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
            real.onTransitionStart(arg0 == null ? null : arg0.unwrap());
        }

    }
}
