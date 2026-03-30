// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowInsetsAnimation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WindowInsetsAnimation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation wrap(android.view.WindowInsetsAnimation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation(real, (__DcgwBridgeToken) null);
    }

    public android.view.WindowInsetsAnimation getReal() {
        return (android.view.WindowInsetsAnimation) real;
    }

    public android.view.WindowInsetsAnimation unwrap() {
        return getReal();
    }

    public WindowInsetsAnimation(int arg0, com.micklab.dcg.wrapper.android.view.animation.Interpolator arg1, long arg2) {
        this(new android.view.WindowInsetsAnimation(arg0, arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public float getAlpha() {
        return ((android.view.WindowInsetsAnimation) real).getAlpha();
    }

    public long getDurationMillis() {
        return ((android.view.WindowInsetsAnimation) real).getDurationMillis();
    }

    public float getFraction() {
        return ((android.view.WindowInsetsAnimation) real).getFraction();
    }

    public float getInterpolatedFraction() {
        return ((android.view.WindowInsetsAnimation) real).getInterpolatedFraction();
    }

    public com.micklab.dcg.wrapper.android.view.animation.Interpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.view.animation.Interpolator.wrap(((android.view.WindowInsetsAnimation) real).getInterpolator());
    }

    public int getTypeMask() {
        return ((android.view.WindowInsetsAnimation) real).getTypeMask();
    }

    public void setAlpha(float arg0) {
        ((android.view.WindowInsetsAnimation) real).setAlpha(arg0);
    }

    public void setFraction(float arg0) {
        ((android.view.WindowInsetsAnimation) real).setFraction(arg0);
    }

    public static final class Bounds {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Bounds(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds wrap(android.view.WindowInsetsAnimation.Bounds real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds(real, (__DcgwBridgeToken) null);
        }

        public android.view.WindowInsetsAnimation.Bounds getReal() {
            return (android.view.WindowInsetsAnimation.Bounds) real;
        }

        public android.view.WindowInsetsAnimation.Bounds unwrap() {
            return getReal();
        }

        public Bounds(com.micklab.dcg.wrapper.android.graphics.Insets arg0, com.micklab.dcg.wrapper.android.graphics.Insets arg1) {
            this(new android.view.WindowInsetsAnimation.Bounds(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.graphics.Insets getLowerBound() {
            return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.view.WindowInsetsAnimation.Bounds) real).getLowerBound());
        }

        public com.micklab.dcg.wrapper.android.graphics.Insets getUpperBound() {
            return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.view.WindowInsetsAnimation.Bounds) real).getUpperBound());
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds inset(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds.wrap(((android.view.WindowInsetsAnimation.Bounds) real).inset(arg0 == null ? null : arg0.getReal()));
        }

        public java.lang.String toString() {
            return ((android.view.WindowInsetsAnimation.Bounds) real).toString();
        }

    }
    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Callback wrap(android.view.WindowInsetsAnimation.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.view.WindowInsetsAnimation.Callback getReal() {
            return (android.view.WindowInsetsAnimation.Callback) real;
        }

        public android.view.WindowInsetsAnimation.Callback unwrap() {
            return getReal();
        }

        public int getDispatchMode() {
            return ((android.view.WindowInsetsAnimation.Callback) real).getDispatchMode();
        }

        public void onEnd(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0) {
            ((android.view.WindowInsetsAnimation.Callback) real).onEnd(arg0 == null ? null : arg0.getReal());
        }

        public void onPrepare(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0) {
            ((android.view.WindowInsetsAnimation.Callback) real).onPrepare(arg0 == null ? null : arg0.getReal());
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds onStart(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0, com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds arg1) {
            return com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds.wrap(((android.view.WindowInsetsAnimation.Callback) real).onStart(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = android.view.WindowInsetsAnimation.Callback.DISPATCH_MODE_CONTINUE_ON_SUBTREE;
        public static final int DISPATCH_MODE_STOP = android.view.WindowInsetsAnimation.Callback.DISPATCH_MODE_STOP;

    }
}
