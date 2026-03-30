// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class LayoutAnimationController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LayoutAnimationController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController wrap(android.view.animation.LayoutAnimationController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.LayoutAnimationController getReal() {
        return (android.view.animation.LayoutAnimationController) real;
    }

    public android.view.animation.LayoutAnimationController unwrap() {
        return getReal();
    }

    public LayoutAnimationController(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        this(new android.view.animation.LayoutAnimationController(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public LayoutAnimationController(com.micklab.dcg.wrapper.android.view.animation.Animation arg0, float arg1) {
        this(new android.view.animation.LayoutAnimationController(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public LayoutAnimationController(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.LayoutAnimationController(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.view.animation.Animation getAnimation() {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(((android.view.animation.LayoutAnimationController) real).getAnimation());
    }

    public com.micklab.dcg.wrapper.android.view.animation.Animation getAnimationForView(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(((android.view.animation.LayoutAnimationController) real).getAnimationForView(arg0 == null ? null : arg0.getReal()));
    }

    public float getDelay() {
        return ((android.view.animation.LayoutAnimationController) real).getDelay();
    }

    public com.micklab.dcg.wrapper.android.view.animation.Interpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.view.animation.Interpolator.wrap(((android.view.animation.LayoutAnimationController) real).getInterpolator());
    }

    public int getOrder() {
        return ((android.view.animation.LayoutAnimationController) real).getOrder();
    }

    public boolean isDone() {
        return ((android.view.animation.LayoutAnimationController) real).isDone();
    }

    public void setAnimation(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        ((android.view.animation.LayoutAnimationController) real).setAnimation(arg0 == null ? null : arg0.getReal());
    }

    public void setAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        ((android.view.animation.LayoutAnimationController) real).setAnimation(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setDelay(float arg0) {
        ((android.view.animation.LayoutAnimationController) real).setDelay(arg0);
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.view.animation.Interpolator arg0) {
        ((android.view.animation.LayoutAnimationController) real).setInterpolator(arg0 == null ? null : arg0.getReal());
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        ((android.view.animation.LayoutAnimationController) real).setInterpolator(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setOrder(int arg0) {
        ((android.view.animation.LayoutAnimationController) real).setOrder(arg0);
    }

    public void start() {
        ((android.view.animation.LayoutAnimationController) real).start();
    }

    public boolean willOverlap() {
        return ((android.view.animation.LayoutAnimationController) real).willOverlap();
    }

    public static final int ORDER_NORMAL = android.view.animation.LayoutAnimationController.ORDER_NORMAL;
    public static final int ORDER_RANDOM = android.view.animation.LayoutAnimationController.ORDER_RANDOM;
    public static final int ORDER_REVERSE = android.view.animation.LayoutAnimationController.ORDER_REVERSE;

    public static final class AnimationParameters {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AnimationParameters(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController.AnimationParameters wrap(android.view.animation.LayoutAnimationController.AnimationParameters real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController.AnimationParameters(real, (__DcgwBridgeToken) null);
        }

        public android.view.animation.LayoutAnimationController.AnimationParameters getReal() {
            return (android.view.animation.LayoutAnimationController.AnimationParameters) real;
        }

        public android.view.animation.LayoutAnimationController.AnimationParameters unwrap() {
            return getReal();
        }

        public AnimationParameters() {
            this(new android.view.animation.LayoutAnimationController.AnimationParameters(), (__DcgwBridgeToken) null);
        }


    }
}
