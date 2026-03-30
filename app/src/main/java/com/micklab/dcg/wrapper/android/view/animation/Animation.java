// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class Animation {
    private final android.view.animation.Animation real;

    public Animation(android.view.animation.Animation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.Animation wrap(android.view.animation.Animation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.Animation(real);
    }

    public android.view.animation.Animation unwrap() {
        return real;
    }

    public void cancel() {
        real.cancel();
    }

    public long computeDurationHint() {
        return real.computeDurationHint();
    }

    public int getBackdropColor() {
        return real.getBackdropColor();
    }

    public int getBackgroundColor() {
        return real.getBackgroundColor();
    }

    public boolean getDetachWallpaper() {
        return real.getDetachWallpaper();
    }

    public long getDuration() {
        return real.getDuration();
    }

    public boolean getFillAfter() {
        return real.getFillAfter();
    }

    public boolean getFillBefore() {
        return real.getFillBefore();
    }

    public com.micklab.dcg.wrapper.android.view.animation.Interpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.view.animation.Interpolator.wrap(real.getInterpolator());
    }

    public int getRepeatCount() {
        return real.getRepeatCount();
    }

    public int getRepeatMode() {
        return real.getRepeatMode();
    }

    public boolean getShowBackdrop() {
        return real.getShowBackdrop();
    }

    public long getStartOffset() {
        return real.getStartOffset();
    }

    public long getStartTime() {
        return real.getStartTime();
    }

    public boolean getTransformation(long arg0, com.micklab.dcg.wrapper.android.view.animation.Transformation arg1) {
        return real.getTransformation(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean getTransformation(long arg0, com.micklab.dcg.wrapper.android.view.animation.Transformation arg1, float arg2) {
        return real.getTransformation(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public int getZAdjustment() {
        return real.getZAdjustment();
    }

    public boolean hasEnded() {
        return real.hasEnded();
    }

    public boolean hasStarted() {
        return real.hasStarted();
    }

    public void initialize(int arg0, int arg1, int arg2, int arg3) {
        real.initialize(arg0, arg1, arg2, arg3);
    }

    public boolean isFillEnabled() {
        return real.isFillEnabled();
    }

    public boolean isInitialized() {
        return real.isInitialized();
    }

    public void reset() {
        real.reset();
    }

    public void restrictDuration(long arg0) {
        real.restrictDuration(arg0);
    }

    public void scaleCurrentDuration(float arg0) {
        real.scaleCurrentDuration(arg0);
    }

    public void setAnimationListener(com.micklab.dcg.wrapper.android.view.animation.Animation.AnimationListener arg0) {
        real.setAnimationListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setBackdropColor(int arg0) {
        real.setBackdropColor(arg0);
    }

    public void setBackgroundColor(int arg0) {
        real.setBackgroundColor(arg0);
    }

    public void setDetachWallpaper(boolean arg0) {
        real.setDetachWallpaper(arg0);
    }

    public void setDuration(long arg0) {
        real.setDuration(arg0);
    }

    public void setFillAfter(boolean arg0) {
        real.setFillAfter(arg0);
    }

    public void setFillBefore(boolean arg0) {
        real.setFillBefore(arg0);
    }

    public void setFillEnabled(boolean arg0) {
        real.setFillEnabled(arg0);
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.view.animation.Interpolator arg0) {
        real.setInterpolator(arg0 == null ? null : arg0.unwrap());
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        real.setInterpolator(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setRepeatCount(int arg0) {
        real.setRepeatCount(arg0);
    }

    public void setRepeatMode(int arg0) {
        real.setRepeatMode(arg0);
    }

    public void setShowBackdrop(boolean arg0) {
        real.setShowBackdrop(arg0);
    }

    public void setStartOffset(long arg0) {
        real.setStartOffset(arg0);
    }

    public void setStartTime(long arg0) {
        real.setStartTime(arg0);
    }

    public void setZAdjustment(int arg0) {
        real.setZAdjustment(arg0);
    }

    public void start() {
        real.start();
    }

    public void startNow() {
        real.startNow();
    }

    public boolean willChangeBounds() {
        return real.willChangeBounds();
    }

    public boolean willChangeTransformationMatrix() {
        return real.willChangeTransformationMatrix();
    }

    public static final int ABSOLUTE = android.view.animation.Animation.ABSOLUTE;
    public static final int INFINITE = android.view.animation.Animation.INFINITE;
    public static final int RELATIVE_TO_PARENT = android.view.animation.Animation.RELATIVE_TO_PARENT;
    public static final int RELATIVE_TO_SELF = android.view.animation.Animation.RELATIVE_TO_SELF;
    public static final int RESTART = android.view.animation.Animation.RESTART;
    public static final int REVERSE = android.view.animation.Animation.REVERSE;
    public static final int START_ON_FIRST_FRAME = android.view.animation.Animation.START_ON_FIRST_FRAME;
    public static final int ZORDER_BOTTOM = android.view.animation.Animation.ZORDER_BOTTOM;
    public static final int ZORDER_NORMAL = android.view.animation.Animation.ZORDER_NORMAL;
    public static final int ZORDER_TOP = android.view.animation.Animation.ZORDER_TOP;

    public static final class AnimationListener {
        private final android.view.animation.Animation.AnimationListener real;

        public AnimationListener(android.view.animation.Animation.AnimationListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.animation.Animation.AnimationListener wrap(android.view.animation.Animation.AnimationListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.Animation.AnimationListener(real);
        }

        public android.view.animation.Animation.AnimationListener unwrap() {
            return real;
        }

        public void onAnimationEnd(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
            real.onAnimationEnd(arg0 == null ? null : arg0.unwrap());
        }

        public void onAnimationRepeat(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
            real.onAnimationRepeat(arg0 == null ? null : arg0.unwrap());
        }

        public void onAnimationStart(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
            real.onAnimationStart(arg0 == null ? null : arg0.unwrap());
        }

    }
}
