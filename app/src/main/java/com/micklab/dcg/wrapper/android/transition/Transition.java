// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.transition;

public final class Transition {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Transition(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.transition.Transition wrap(android.transition.Transition real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Transition(real, (__DcgwBridgeToken) null);
    }

    public android.transition.Transition getReal() {
        return (android.transition.Transition) real;
    }

    public android.transition.Transition unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.transition.Transition addListener(com.micklab.dcg.wrapper.android.transition.Transition.TransitionListener arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).addListener(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition addTarget(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).addTarget(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition addTarget(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).addTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition addTarget(int arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).addTarget(arg0));
    }

    public boolean canRemoveViews() {
        return ((android.transition.Transition) real).canRemoveViews();
    }

    public void captureEndValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.Transition) real).captureEndValues(arg0 == null ? null : arg0.getReal());
    }

    public void captureStartValues(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0) {
        ((android.transition.Transition) real).captureStartValues(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition clone() {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).clone());
    }

    public com.micklab.dcg.wrapper.android.animation.Animator createAnimator(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1, com.micklab.dcg.wrapper.android.transition.TransitionValues arg2) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.transition.Transition) real).createAnimator(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeChildren(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).excludeChildren(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeChildren(int arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).excludeChildren(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeTarget(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).excludeTarget(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeTarget(java.lang.String arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).excludeTarget(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition excludeTarget(int arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).excludeTarget(arg0, arg1));
    }

    public long getDuration() {
        return ((android.transition.Transition) real).getDuration();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getEpicenter() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.transition.Transition) real).getEpicenter());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition.EpicenterCallback getEpicenterCallback() {
        return com.micklab.dcg.wrapper.android.transition.Transition.EpicenterCallback.wrap(((android.transition.Transition) real).getEpicenterCallback());
    }

    public com.micklab.dcg.wrapper.android.animation.TimeInterpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.animation.TimeInterpolator.wrap(((android.transition.Transition) real).getInterpolator());
    }

    public java.lang.String getName() {
        return ((android.transition.Transition) real).getName();
    }

    public com.micklab.dcg.wrapper.android.transition.PathMotion getPathMotion() {
        return com.micklab.dcg.wrapper.android.transition.PathMotion.wrap(((android.transition.Transition) real).getPathMotion());
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionPropagation getPropagation() {
        return com.micklab.dcg.wrapper.android.transition.TransitionPropagation.wrap(((android.transition.Transition) real).getPropagation());
    }

    public long getStartDelay() {
        return ((android.transition.Transition) real).getStartDelay();
    }

    public java.lang.String[] getTransitionProperties() {
        return ((android.transition.Transition) real).getTransitionProperties();
    }

    public com.micklab.dcg.wrapper.android.transition.TransitionValues getTransitionValues(com.micklab.dcg.wrapper.android.view.View arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.transition.TransitionValues.wrap(((android.transition.Transition) real).getTransitionValues(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public boolean isTransitionRequired(com.micklab.dcg.wrapper.android.transition.TransitionValues arg0, com.micklab.dcg.wrapper.android.transition.TransitionValues arg1) {
        return ((android.transition.Transition) real).isTransitionRequired(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition removeListener(com.micklab.dcg.wrapper.android.transition.Transition.TransitionListener arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).removeListener(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition removeTarget(int arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).removeTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition removeTarget(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).removeTarget(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition removeTarget(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).removeTarget(arg0));
    }

    public com.micklab.dcg.wrapper.android.transition.Transition setDuration(long arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).setDuration(arg0));
    }

    public void setEpicenterCallback(com.micklab.dcg.wrapper.android.transition.Transition.EpicenterCallback arg0) {
        ((android.transition.Transition) real).setEpicenterCallback(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition setInterpolator(com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).setInterpolator(arg0 == null ? null : arg0.getReal()));
    }

    public void setMatchOrder(int... arg0) {
        ((android.transition.Transition) real).setMatchOrder(arg0);
    }

    public void setPathMotion(com.micklab.dcg.wrapper.android.transition.PathMotion arg0) {
        ((android.transition.Transition) real).setPathMotion(arg0 == null ? null : arg0.getReal());
    }

    public void setPropagation(com.micklab.dcg.wrapper.android.transition.TransitionPropagation arg0) {
        ((android.transition.Transition) real).setPropagation(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.transition.Transition setStartDelay(long arg0) {
        return com.micklab.dcg.wrapper.android.transition.Transition.wrap(((android.transition.Transition) real).setStartDelay(arg0));
    }

    public java.lang.String toString() {
        return ((android.transition.Transition) real).toString();
    }

    public static final int MATCH_ID = android.transition.Transition.MATCH_ID;
    public static final int MATCH_INSTANCE = android.transition.Transition.MATCH_INSTANCE;
    public static final int MATCH_ITEM_ID = android.transition.Transition.MATCH_ITEM_ID;
    public static final int MATCH_NAME = android.transition.Transition.MATCH_NAME;

    public static final class EpicenterCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private EpicenterCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.transition.Transition.EpicenterCallback wrap(android.transition.Transition.EpicenterCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Transition.EpicenterCallback(real, (__DcgwBridgeToken) null);
        }

        public android.transition.Transition.EpicenterCallback getReal() {
            return (android.transition.Transition.EpicenterCallback) real;
        }

        public android.transition.Transition.EpicenterCallback unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.graphics.Rect onGetEpicenter(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.transition.Transition.EpicenterCallback) real).onGetEpicenter(arg0 == null ? null : arg0.getReal()));
        }

    }
    public static final class TransitionListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TransitionListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.transition.Transition.TransitionListener wrap(android.transition.Transition.TransitionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.transition.Transition.TransitionListener(real, (__DcgwBridgeToken) null);
        }

        public android.transition.Transition.TransitionListener getReal() {
            return (android.transition.Transition.TransitionListener) real;
        }

        public android.transition.Transition.TransitionListener unwrap() {
            return getReal();
        }

        public void onTransitionCancel(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
            ((android.transition.Transition.TransitionListener) real).onTransitionCancel(arg0 == null ? null : arg0.getReal());
        }

        public void onTransitionEnd(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
            ((android.transition.Transition.TransitionListener) real).onTransitionEnd(arg0 == null ? null : arg0.getReal());
        }

        public void onTransitionPause(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
            ((android.transition.Transition.TransitionListener) real).onTransitionPause(arg0 == null ? null : arg0.getReal());
        }

        public void onTransitionResume(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
            ((android.transition.Transition.TransitionListener) real).onTransitionResume(arg0 == null ? null : arg0.getReal());
        }

        public void onTransitionStart(com.micklab.dcg.wrapper.android.transition.Transition arg0) {
            ((android.transition.Transition.TransitionListener) real).onTransitionStart(arg0 == null ? null : arg0.getReal());
        }

    }
}
