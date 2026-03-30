// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class LayoutTransition {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LayoutTransition(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.LayoutTransition wrap(android.animation.LayoutTransition real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.LayoutTransition(real, (__DcgwBridgeToken) null);
    }

    public android.animation.LayoutTransition getReal() {
        return (android.animation.LayoutTransition) real;
    }

    public android.animation.LayoutTransition unwrap() {
        return getReal();
    }

    public LayoutTransition() {
        this(new android.animation.LayoutTransition(), (__DcgwBridgeToken) null);
    }

    public void addChild(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.animation.LayoutTransition) real).addChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void addTransitionListener(com.micklab.dcg.wrapper.android.animation.LayoutTransition.TransitionListener arg0) {
        ((android.animation.LayoutTransition) real).addTransitionListener(arg0 == null ? null : arg0.getReal());
    }

    public void disableTransitionType(int arg0) {
        ((android.animation.LayoutTransition) real).disableTransitionType(arg0);
    }

    public void enableTransitionType(int arg0) {
        ((android.animation.LayoutTransition) real).enableTransitionType(arg0);
    }

    public com.micklab.dcg.wrapper.android.animation.Animator getAnimator(int arg0) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(((android.animation.LayoutTransition) real).getAnimator(arg0));
    }

    public long getDuration(int arg0) {
        return ((android.animation.LayoutTransition) real).getDuration(arg0);
    }

    public com.micklab.dcg.wrapper.android.animation.TimeInterpolator getInterpolator(int arg0) {
        return com.micklab.dcg.wrapper.android.animation.TimeInterpolator.wrap(((android.animation.LayoutTransition) real).getInterpolator(arg0));
    }

    public long getStagger(int arg0) {
        return ((android.animation.LayoutTransition) real).getStagger(arg0);
    }

    public long getStartDelay(int arg0) {
        return ((android.animation.LayoutTransition) real).getStartDelay(arg0);
    }

    public void hideChild(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.animation.LayoutTransition) real).hideChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void hideChild(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        ((android.animation.LayoutTransition) real).hideChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean isChangingLayout() {
        return ((android.animation.LayoutTransition) real).isChangingLayout();
    }

    public boolean isRunning() {
        return ((android.animation.LayoutTransition) real).isRunning();
    }

    public boolean isTransitionTypeEnabled(int arg0) {
        return ((android.animation.LayoutTransition) real).isTransitionTypeEnabled(arg0);
    }

    public void removeChild(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.animation.LayoutTransition) real).removeChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void removeTransitionListener(com.micklab.dcg.wrapper.android.animation.LayoutTransition.TransitionListener arg0) {
        ((android.animation.LayoutTransition) real).removeTransitionListener(arg0 == null ? null : arg0.getReal());
    }

    public void setAnimateParentHierarchy(boolean arg0) {
        ((android.animation.LayoutTransition) real).setAnimateParentHierarchy(arg0);
    }

    public void setAnimator(int arg0, com.micklab.dcg.wrapper.android.animation.Animator arg1) {
        ((android.animation.LayoutTransition) real).setAnimator(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setDuration(long arg0) {
        ((android.animation.LayoutTransition) real).setDuration(arg0);
    }

    public void setDuration(int arg0, long arg1) {
        ((android.animation.LayoutTransition) real).setDuration(arg0, arg1);
    }

    public void setInterpolator(int arg0, com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg1) {
        ((android.animation.LayoutTransition) real).setInterpolator(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setStagger(int arg0, long arg1) {
        ((android.animation.LayoutTransition) real).setStagger(arg0, arg1);
    }

    public void setStartDelay(int arg0, long arg1) {
        ((android.animation.LayoutTransition) real).setStartDelay(arg0, arg1);
    }

    public void showChild(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        ((android.animation.LayoutTransition) real).showChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void showChild(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        ((android.animation.LayoutTransition) real).showChild(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public static final int APPEARING = android.animation.LayoutTransition.APPEARING;
    public static final int CHANGE_APPEARING = android.animation.LayoutTransition.CHANGE_APPEARING;
    public static final int CHANGE_DISAPPEARING = android.animation.LayoutTransition.CHANGE_DISAPPEARING;
    public static final int CHANGING = android.animation.LayoutTransition.CHANGING;
    public static final int DISAPPEARING = android.animation.LayoutTransition.DISAPPEARING;

    public static final class TransitionListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TransitionListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.animation.LayoutTransition.TransitionListener wrap(android.animation.LayoutTransition.TransitionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.animation.LayoutTransition.TransitionListener(real, (__DcgwBridgeToken) null);
        }

        public android.animation.LayoutTransition.TransitionListener getReal() {
            return (android.animation.LayoutTransition.TransitionListener) real;
        }

        public android.animation.LayoutTransition.TransitionListener unwrap() {
            return getReal();
        }

        public void endTransition(com.micklab.dcg.wrapper.android.animation.LayoutTransition arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, com.micklab.dcg.wrapper.android.view.View arg2, int arg3) {
            ((android.animation.LayoutTransition.TransitionListener) real).endTransition(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
        }

        public void startTransition(com.micklab.dcg.wrapper.android.animation.LayoutTransition arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, com.micklab.dcg.wrapper.android.view.View arg2, int arg3) {
            ((android.animation.LayoutTransition.TransitionListener) real).startTransition(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3);
        }

    }
}
