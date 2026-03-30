// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class Animation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Animation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.Animation wrap(android.view.animation.Animation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.Animation(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.Animation getReal() {
        return (android.view.animation.Animation) real;
    }

    public android.view.animation.Animation unwrap() {
        return getReal();
    }

    public void cancel() {
        ((android.view.animation.Animation) real).cancel();
    }

    public long computeDurationHint() {
        return ((android.view.animation.Animation) real).computeDurationHint();
    }

    public int getBackdropColor() {
        return ((android.view.animation.Animation) real).getBackdropColor();
    }

    public int getBackgroundColor() {
        return ((android.view.animation.Animation) real).getBackgroundColor();
    }

    public boolean getDetachWallpaper() {
        return ((android.view.animation.Animation) real).getDetachWallpaper();
    }

    public long getDuration() {
        return ((android.view.animation.Animation) real).getDuration();
    }

    public boolean getFillAfter() {
        return ((android.view.animation.Animation) real).getFillAfter();
    }

    public boolean getFillBefore() {
        return ((android.view.animation.Animation) real).getFillBefore();
    }

    public com.micklab.dcg.wrapper.android.view.animation.Interpolator getInterpolator() {
        return com.micklab.dcg.wrapper.android.view.animation.Interpolator.wrap(((android.view.animation.Animation) real).getInterpolator());
    }

    public int getRepeatCount() {
        return ((android.view.animation.Animation) real).getRepeatCount();
    }

    public int getRepeatMode() {
        return ((android.view.animation.Animation) real).getRepeatMode();
    }

    public boolean getShowBackdrop() {
        return ((android.view.animation.Animation) real).getShowBackdrop();
    }

    public long getStartOffset() {
        return ((android.view.animation.Animation) real).getStartOffset();
    }

    public long getStartTime() {
        return ((android.view.animation.Animation) real).getStartTime();
    }

    public boolean getTransformation(long arg0, com.micklab.dcg.wrapper.android.view.animation.Transformation arg1) {
        return ((android.view.animation.Animation) real).getTransformation(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean getTransformation(long arg0, com.micklab.dcg.wrapper.android.view.animation.Transformation arg1, float arg2) {
        return ((android.view.animation.Animation) real).getTransformation(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public int getZAdjustment() {
        return ((android.view.animation.Animation) real).getZAdjustment();
    }

    public boolean hasEnded() {
        return ((android.view.animation.Animation) real).hasEnded();
    }

    public boolean hasStarted() {
        return ((android.view.animation.Animation) real).hasStarted();
    }

    public void initialize(int arg0, int arg1, int arg2, int arg3) {
        ((android.view.animation.Animation) real).initialize(arg0, arg1, arg2, arg3);
    }

    public boolean isFillEnabled() {
        return ((android.view.animation.Animation) real).isFillEnabled();
    }

    public boolean isInitialized() {
        return ((android.view.animation.Animation) real).isInitialized();
    }

    public void reset() {
        ((android.view.animation.Animation) real).reset();
    }

    public void restrictDuration(long arg0) {
        ((android.view.animation.Animation) real).restrictDuration(arg0);
    }

    public void scaleCurrentDuration(float arg0) {
        ((android.view.animation.Animation) real).scaleCurrentDuration(arg0);
    }

    public void setAnimationListener(com.micklab.dcg.wrapper.android.view.animation.Animation.AnimationListener arg0) {
        ((android.view.animation.Animation) real).setAnimationListener(arg0 == null ? null : arg0.getReal());
    }

    public void setBackdropColor(int arg0) {
        ((android.view.animation.Animation) real).setBackdropColor(arg0);
    }

    public void setBackgroundColor(int arg0) {
        ((android.view.animation.Animation) real).setBackgroundColor(arg0);
    }

    public void setDetachWallpaper(boolean arg0) {
        ((android.view.animation.Animation) real).setDetachWallpaper(arg0);
    }

    public void setDuration(long arg0) {
        ((android.view.animation.Animation) real).setDuration(arg0);
    }

    public void setFillAfter(boolean arg0) {
        ((android.view.animation.Animation) real).setFillAfter(arg0);
    }

    public void setFillBefore(boolean arg0) {
        ((android.view.animation.Animation) real).setFillBefore(arg0);
    }

    public void setFillEnabled(boolean arg0) {
        ((android.view.animation.Animation) real).setFillEnabled(arg0);
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.view.animation.Interpolator arg0) {
        ((android.view.animation.Animation) real).setInterpolator(arg0 == null ? null : arg0.getReal());
    }

    public void setInterpolator(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        ((android.view.animation.Animation) real).setInterpolator(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setRepeatCount(int arg0) {
        ((android.view.animation.Animation) real).setRepeatCount(arg0);
    }

    public void setRepeatMode(int arg0) {
        ((android.view.animation.Animation) real).setRepeatMode(arg0);
    }

    public void setShowBackdrop(boolean arg0) {
        ((android.view.animation.Animation) real).setShowBackdrop(arg0);
    }

    public void setStartOffset(long arg0) {
        ((android.view.animation.Animation) real).setStartOffset(arg0);
    }

    public void setStartTime(long arg0) {
        ((android.view.animation.Animation) real).setStartTime(arg0);
    }

    public void setZAdjustment(int arg0) {
        ((android.view.animation.Animation) real).setZAdjustment(arg0);
    }

    public void start() {
        ((android.view.animation.Animation) real).start();
    }

    public void startNow() {
        ((android.view.animation.Animation) real).startNow();
    }

    public boolean willChangeBounds() {
        return ((android.view.animation.Animation) real).willChangeBounds();
    }

    public boolean willChangeTransformationMatrix() {
        return ((android.view.animation.Animation) real).willChangeTransformationMatrix();
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
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AnimationListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.animation.Animation.AnimationListener wrap(android.view.animation.Animation.AnimationListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.Animation.AnimationListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.animation.Animation.AnimationListener getReal() {
            return (android.view.animation.Animation.AnimationListener) real;
        }

        public android.view.animation.Animation.AnimationListener unwrap() {
            return getReal();
        }

        public void onAnimationEnd(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
            ((android.view.animation.Animation.AnimationListener) real).onAnimationEnd(arg0 == null ? null : arg0.getReal());
        }

        public void onAnimationRepeat(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
            ((android.view.animation.Animation.AnimationListener) real).onAnimationRepeat(arg0 == null ? null : arg0.getReal());
        }

        public void onAnimationStart(com.micklab.dcg.wrapper.android.view.animation.Animation arg0) {
            ((android.view.animation.Animation.AnimationListener) real).onAnimationStart(arg0 == null ? null : arg0.getReal());
        }

    }
}
