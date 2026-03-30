// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class Animatable2 {
    private final android.graphics.drawable.Animatable2 real;

    public Animatable2(android.graphics.drawable.Animatable2 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2 wrap(android.graphics.drawable.Animatable2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2(real);
    }

    public android.graphics.drawable.Animatable2 unwrap() {
        return real;
    }

    public void clearAnimationCallbacks() {
        real.clearAnimationCallbacks();
    }

    public void registerAnimationCallback(com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback arg0) {
        real.registerAnimationCallback(arg0 == null ? null : arg0.unwrap());
    }

    public boolean unregisterAnimationCallback(com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback arg0) {
        return real.unregisterAnimationCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final class AnimationCallback {
        private final android.graphics.drawable.Animatable2.AnimationCallback real;

        public AnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback wrap(android.graphics.drawable.Animatable2.AnimationCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback(real);
        }

        public android.graphics.drawable.Animatable2.AnimationCallback unwrap() {
            return real;
        }

        public void onAnimationEnd(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            real.onAnimationEnd(arg0 == null ? null : arg0.unwrap());
        }

        public void onAnimationStart(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            real.onAnimationStart(arg0 == null ? null : arg0.unwrap());
        }

    }
}
