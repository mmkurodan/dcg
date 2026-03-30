// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class LayoutAnimationController {
    private final android.view.animation.LayoutAnimationController real;

    public LayoutAnimationController(android.view.animation.LayoutAnimationController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController wrap(android.view.animation.LayoutAnimationController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController(real);
    }

    public android.view.animation.LayoutAnimationController unwrap() {
        return real;
    }

    public LayoutAnimationController(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        this(new android.view.animation.LayoutAnimationController(arg0 == null ? null : arg0.unwrap()));
    }

    public LayoutAnimationController(com.micklab.dcg.wrapper.android.view.animation.Animation arg0, float arg1) {
        this(new android.view.animation.LayoutAnimationController(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public LayoutAnimationController(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.view.animation.LayoutAnimationController(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.view.animation.Animation getAnimation() {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(real.getAnimation());
    }

    public com.micklab.dcg.wrapper.android.view.animation.Animation getAnimationForView(com.micklab.dcg.wrapper.android.view.View arg0) {
        return com.micklab.dcg.wrapper.android.view.animation.Animation.wrap(real.getAnimationForView(arg0 == null ? null : arg0.unwrap()));
    }

    public float getDelay() {
        return real.getDelay();
    }

    public com.micklab.dcg.wrapper.android.view.animation.Interpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.view.animation.Interpolator.wrap(real.getInterpolator());
    }

    public int getOrder() {
        return real.getOrder();
    }

    public boolean isDone() {
        return real.isDone();
    }

    public void setAnimation(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
        real.setAnimation(arg0 == null ? null : arg0.unwrap());
    }

    public void setAnimation(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        real.setAnimation(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setDelay(float arg0) {
        real.setDelay(arg0);
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.view.animation.Interpolator arg0) {
        real.setInterpolator(arg0 == null ? null : arg0.unwrap());
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        real.setInterpolator(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setOrder(int arg0) {
        real.setOrder(arg0);
    }

    public void start() {
        real.start();
    }

    public boolean willOverlap() {
        return real.willOverlap();
    }

    public static final int ORDER_NORMAL = android.view.animation.LayoutAnimationController.ORDER_NORMAL;
    public static final int ORDER_RANDOM = android.view.animation.LayoutAnimationController.ORDER_RANDOM;
    public static final int ORDER_REVERSE = android.view.animation.LayoutAnimationController.ORDER_REVERSE;

    public static final class AnimationParameters {
        private final android.view.animation.LayoutAnimationController.AnimationParameters real;

        public AnimationParameters(android.view.animation.LayoutAnimationController.AnimationParameters real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController.AnimationParameters wrap(android.view.animation.LayoutAnimationController.AnimationParameters real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.LayoutAnimationController.AnimationParameters(real);
        }

        public android.view.animation.LayoutAnimationController.AnimationParameters unwrap() {
            return real;
        }

        public AnimationParameters() {
            this(new android.view.animation.LayoutAnimationController.AnimationParameters());
        }


    }
}
