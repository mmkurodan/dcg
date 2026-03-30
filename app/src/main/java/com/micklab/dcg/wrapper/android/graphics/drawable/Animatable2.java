// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class Animatable2 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Animatable2(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2 wrap(android.graphics.drawable.Animatable2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.Animatable2 getReal() {
        return (android.graphics.drawable.Animatable2) real;
    }

    public android.graphics.drawable.Animatable2 unwrap() {
        return getReal();
    }

    public void clearAnimationCallbacks() {
        ((android.graphics.drawable.Animatable2) real).clearAnimationCallbacks();
    }

    public void registerAnimationCallback(com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback arg0) {
        ((android.graphics.drawable.Animatable2) real).registerAnimationCallback(arg0 == null ? null : arg0.getReal());
    }

    public boolean unregisterAnimationCallback(com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback arg0) {
        return ((android.graphics.drawable.Animatable2) real).unregisterAnimationCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final class AnimationCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AnimationCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback wrap(android.graphics.drawable.Animatable2.AnimationCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.drawable.Animatable2.AnimationCallback getReal() {
            return (android.graphics.drawable.Animatable2.AnimationCallback) real;
        }

        public android.graphics.drawable.Animatable2.AnimationCallback unwrap() {
            return getReal();
        }

        public void onAnimationEnd(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            ((android.graphics.drawable.Animatable2.AnimationCallback) real).onAnimationEnd(arg0 == null ? null : arg0.getReal());
        }

        public void onAnimationStart(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            ((android.graphics.drawable.Animatable2.AnimationCallback) real).onAnimationStart(arg0 == null ? null : arg0.getReal());
        }

    }
}
