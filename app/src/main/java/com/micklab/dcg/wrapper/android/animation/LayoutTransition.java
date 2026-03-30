// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class LayoutTransition {
    private final android.animation.LayoutTransition real;

    public LayoutTransition(android.animation.LayoutTransition real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.LayoutTransition wrap(android.animation.LayoutTransition real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.LayoutTransition(real);
    }

    public android.animation.LayoutTransition unwrap() {
        return real;
    }

    public LayoutTransition() {
        this(new android.animation.LayoutTransition());
    }

    public void addChild(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        real.addChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void addTransitionListener(com.micklab.dcg.wrapper.android.animation.LayoutTransition.TransitionListener arg0) {
        real.addTransitionListener(arg0 == null ? null : arg0.unwrap());
    }

    public void disableTransitionType(int arg0) {
        real.disableTransitionType(arg0);
    }

    public void enableTransitionType(int arg0) {
        real.enableTransitionType(arg0);
    }

    public com.micklab.dcg.wrapper.android.animation.Animator getAnimator(int arg0) {
        return com.micklab.dcg.wrapper.android.animation.Animator.wrap(real.getAnimator(arg0));
    }

    public long getDuration(int arg0) {
        return real.getDuration(arg0);
    }

    public com.micklab.dcg.wrapper.android.animation.TimeInterpolator getInterpolator(int arg0) {
        return com.micklab.dcg.wrapper.android.animation.TimeInterpolator.wrap(real.getInterpolator(arg0));
    }

    public long getStagger(int arg0) {
        return real.getStagger(arg0);
    }

    public long getStartDelay(int arg0) {
        return real.getStartDelay(arg0);
    }

    public void hideChild(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        real.hideChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void hideChild(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        real.hideChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public boolean isChangingLayout() {
        return real.isChangingLayout();
    }

    public boolean isRunning() {
        return real.isRunning();
    }

    public boolean isTransitionTypeEnabled(int arg0) {
        return real.isTransitionTypeEnabled(arg0);
    }

    public void removeChild(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        real.removeChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void removeTransitionListener(com.micklab.dcg.wrapper.android.animation.LayoutTransition.TransitionListener arg0) {
        real.removeTransitionListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setAnimateParentHierarchy(boolean arg0) {
        real.setAnimateParentHierarchy(arg0);
    }

    public void setAnimator(int arg0, com.micklab.dcg.wrapper.android.animation.Animator arg1) {
        real.setAnimator(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setDuration(long arg0) {
        real.setDuration(arg0);
    }

    public void setDuration(int arg0, long arg1) {
        real.setDuration(arg0, arg1);
    }

    public void setInterpolator(int arg0, com.micklab.dcg.wrapper.android.animation.TimeInterpolator arg1) {
        real.setInterpolator(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setStagger(int arg0, long arg1) {
        real.setStagger(arg0, arg1);
    }

    public void setStartDelay(int arg0, long arg1) {
        real.setStartDelay(arg0, arg1);
    }

    public void showChild(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
        real.showChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void showChild(com.micklab.dcg.wrapper.android.view.ViewGroup arg0, com.micklab.dcg.wrapper.android.view.View arg1, int arg2) {
        real.showChild(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static final int APPEARING = android.animation.LayoutTransition.APPEARING;
    public static final int CHANGE_APPEARING = android.animation.LayoutTransition.CHANGE_APPEARING;
    public static final int CHANGE_DISAPPEARING = android.animation.LayoutTransition.CHANGE_DISAPPEARING;
    public static final int CHANGING = android.animation.LayoutTransition.CHANGING;
    public static final int DISAPPEARING = android.animation.LayoutTransition.DISAPPEARING;

    public static final class TransitionListener {
        private final android.animation.LayoutTransition.TransitionListener real;

        public TransitionListener(android.animation.LayoutTransition.TransitionListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.animation.LayoutTransition.TransitionListener wrap(android.animation.LayoutTransition.TransitionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.animation.LayoutTransition.TransitionListener(real);
        }

        public android.animation.LayoutTransition.TransitionListener unwrap() {
            return real;
        }

        public void endTransition(com.micklab.dcg.wrapper.android.animation.LayoutTransition arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, com.micklab.dcg.wrapper.android.view.View arg2, int arg3) {
            real.endTransition(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3);
        }

        public void startTransition(com.micklab.dcg.wrapper.android.animation.LayoutTransition arg0, com.micklab.dcg.wrapper.android.view.ViewGroup arg1, com.micklab.dcg.wrapper.android.view.View arg2, int arg3) {
            real.startTransition(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3);
        }

    }
}
