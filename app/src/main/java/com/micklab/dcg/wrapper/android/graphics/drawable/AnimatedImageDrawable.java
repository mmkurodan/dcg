// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class AnimatedImageDrawable {
    private final android.graphics.drawable.AnimatedImageDrawable real;

    public AnimatedImageDrawable(android.graphics.drawable.AnimatedImageDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.AnimatedImageDrawable wrap(android.graphics.drawable.AnimatedImageDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.AnimatedImageDrawable(real);
    }

    public android.graphics.drawable.AnimatedImageDrawable unwrap() {
        return real;
    }

    public AnimatedImageDrawable() {
        this(new android.graphics.drawable.AnimatedImageDrawable());
    }

    public void clearAnimationCallbacks() {
        real.clearAnimationCallbacks();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public int getAlpha() {
        return real.getAlpha();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(real.getColorFilter());
    }

    public int getIntrinsicHeight() {
        return real.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return real.getIntrinsicWidth();
    }

    public int getOpacity() {
        return real.getOpacity();
    }

    public int getRepeatCount() {
        return real.getRepeatCount();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public boolean isAutoMirrored() {
        return real.isAutoMirrored();
    }

    public boolean isRunning() {
        return real.isRunning();
    }

    public boolean onLayoutDirectionChanged(int arg0) {
        return real.onLayoutDirectionChanged(arg0);
    }

    public void registerAnimationCallback(com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback arg0) {
        real.registerAnimationCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setAlpha(int arg0) {
        real.setAlpha(arg0);
    }

    public void setAutoMirrored(boolean arg0) {
        real.setAutoMirrored(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        real.setColorFilter(arg0 == null ? null : arg0.unwrap());
    }

    public void setRepeatCount(int arg0) {
        real.setRepeatCount(arg0);
    }

    public void start() {
        real.start();
    }

    public void stop() {
        real.stop();
    }

    public boolean unregisterAnimationCallback(com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback arg0) {
        return real.unregisterAnimationCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final int REPEAT_INFINITE = android.graphics.drawable.AnimatedImageDrawable.REPEAT_INFINITE;

}
