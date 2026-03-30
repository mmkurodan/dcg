// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class AnimatedImageDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AnimatedImageDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.AnimatedImageDrawable wrap(android.graphics.drawable.AnimatedImageDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.AnimatedImageDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.AnimatedImageDrawable getReal() {
        return (android.graphics.drawable.AnimatedImageDrawable) real;
    }

    public android.graphics.drawable.AnimatedImageDrawable unwrap() {
        return getReal();
    }

    public AnimatedImageDrawable() {
        this(new android.graphics.drawable.AnimatedImageDrawable(), (__DcgwBridgeToken) null);
    }

    public void clearAnimationCallbacks() {
        ((android.graphics.drawable.AnimatedImageDrawable) real).clearAnimationCallbacks();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.AnimatedImageDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public int getAlpha() {
        return ((android.graphics.drawable.AnimatedImageDrawable) real).getAlpha();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(((android.graphics.drawable.AnimatedImageDrawable) real).getColorFilter());
    }

    public int getIntrinsicHeight() {
        return ((android.graphics.drawable.AnimatedImageDrawable) real).getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return ((android.graphics.drawable.AnimatedImageDrawable) real).getIntrinsicWidth();
    }

    public int getOpacity() {
        return ((android.graphics.drawable.AnimatedImageDrawable) real).getOpacity();
    }

    public int getRepeatCount() {
        return ((android.graphics.drawable.AnimatedImageDrawable) real).getRepeatCount();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.AnimatedImageDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public boolean isAutoMirrored() {
        return ((android.graphics.drawable.AnimatedImageDrawable) real).isAutoMirrored();
    }

    public boolean isRunning() {
        return ((android.graphics.drawable.AnimatedImageDrawable) real).isRunning();
    }

    public boolean onLayoutDirectionChanged(int arg0) {
        return ((android.graphics.drawable.AnimatedImageDrawable) real).onLayoutDirectionChanged(arg0);
    }

    public void registerAnimationCallback(com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback arg0) {
        ((android.graphics.drawable.AnimatedImageDrawable) real).registerAnimationCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setAlpha(int arg0) {
        ((android.graphics.drawable.AnimatedImageDrawable) real).setAlpha(arg0);
    }

    public void setAutoMirrored(boolean arg0) {
        ((android.graphics.drawable.AnimatedImageDrawable) real).setAutoMirrored(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        ((android.graphics.drawable.AnimatedImageDrawable) real).setColorFilter(arg0 == null ? null : arg0.getReal());
    }

    public void setRepeatCount(int arg0) {
        ((android.graphics.drawable.AnimatedImageDrawable) real).setRepeatCount(arg0);
    }

    public void start() {
        ((android.graphics.drawable.AnimatedImageDrawable) real).start();
    }

    public void stop() {
        ((android.graphics.drawable.AnimatedImageDrawable) real).stop();
    }

    public boolean unregisterAnimationCallback(com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback arg0) {
        return ((android.graphics.drawable.AnimatedImageDrawable) real).unregisterAnimationCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final int REPEAT_INFINITE = android.graphics.drawable.AnimatedImageDrawable.REPEAT_INFINITE;

}
