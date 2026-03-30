// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class WindowInsetsAnimation {
    private final android.view.WindowInsetsAnimation real;

    public WindowInsetsAnimation(android.view.WindowInsetsAnimation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation wrap(android.view.WindowInsetsAnimation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation(real);
    }

    public android.view.WindowInsetsAnimation unwrap() {
        return real;
    }

    public WindowInsetsAnimation(int arg0, com.micklab.dcg.wrapper.android.view.animation.Interpolator arg1, long arg2) {
        this(new android.view.WindowInsetsAnimation(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public float getAlpha() {
        return real.getAlpha();
    }

    public long getDurationMillis() {
        return real.getDurationMillis();
    }

    public float getFraction() {
        return real.getFraction();
    }

    public float getInterpolatedFraction() {
        return real.getInterpolatedFraction();
    }

    public com.micklab.dcg.wrapper.android.view.animation.Interpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.view.animation.Interpolator.wrap(real.getInterpolator());
    }

    public int getTypeMask() {
        return real.getTypeMask();
    }

    public void setAlpha(float arg0) {
        real.setAlpha(arg0);
    }

    public void setFraction(float arg0) {
        real.setFraction(arg0);
    }

    public static final class Bounds {
        private final android.view.WindowInsetsAnimation.Bounds real;

        public Bounds(android.view.WindowInsetsAnimation.Bounds real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds wrap(android.view.WindowInsetsAnimation.Bounds real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds(real);
        }

        public android.view.WindowInsetsAnimation.Bounds unwrap() {
            return real;
        }

        public Bounds(com.micklab.dcg.wrapper.android.graphics.Insets arg0, com.micklab.dcg.wrapper.android.graphics.Insets arg1) {
            this(new android.view.WindowInsetsAnimation.Bounds(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.graphics.Insets getLowerBound() {
            return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getLowerBound());
        }

        public com.micklab.dcg.wrapper.android.graphics.Insets getUpperBound() {
            return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getUpperBound());
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds inset(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
            return com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds.wrap(real.inset(arg0 == null ? null : arg0.unwrap()));
        }

        public java.lang.String toString() {
            return real.toString();
        }

    }
    public static final class Callback {
        private final android.view.WindowInsetsAnimation.Callback real;

        public Callback(android.view.WindowInsetsAnimation.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Callback wrap(android.view.WindowInsetsAnimation.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Callback(real);
        }

        public android.view.WindowInsetsAnimation.Callback unwrap() {
            return real;
        }

        public int getDispatchMode() {
            return real.getDispatchMode();
        }

        public void onEnd(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0) {
            real.onEnd(arg0 == null ? null : arg0.unwrap());
        }

        public void onPrepare(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0) {
            real.onPrepare(arg0 == null ? null : arg0.unwrap());
        }

        public com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds onStart(com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation arg0, com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds arg1) {
            return com.micklab.dcg.wrapper.android.view.WindowInsetsAnimation.Bounds.wrap(real.onStart(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = android.view.WindowInsetsAnimation.Callback.DISPATCH_MODE_CONTINUE_ON_SUBTREE;
        public static final int DISPATCH_MODE_STOP = android.view.WindowInsetsAnimation.Callback.DISPATCH_MODE_STOP;

    }
}
