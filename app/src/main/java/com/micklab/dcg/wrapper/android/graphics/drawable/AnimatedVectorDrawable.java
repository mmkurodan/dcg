// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class AnimatedVectorDrawable {
    private final android.graphics.drawable.AnimatedVectorDrawable real;

    public AnimatedVectorDrawable(android.graphics.drawable.AnimatedVectorDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.AnimatedVectorDrawable wrap(android.graphics.drawable.AnimatedVectorDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.AnimatedVectorDrawable(real);
    }

    public android.graphics.drawable.AnimatedVectorDrawable unwrap() {
        return real;
    }

    public AnimatedVectorDrawable() {
        this(new android.graphics.drawable.AnimatedVectorDrawable());
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        real.applyTheme(arg0);
    }

    public boolean canApplyTheme() {
        return real.canApplyTheme();
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

    public int getChangingConfigurations() {
        return real.getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(real.getColorFilter());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(real.getConstantState());
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

    public com.micklab.dcg.wrapper.android.graphics.Insets getOpticalInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getOpticalInsets());
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        real.getOutline(arg0 == null ? null : arg0.unwrap());
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public boolean isRunning() {
        return real.isRunning();
    }

    public boolean isStateful() {
        return real.isStateful();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.mutate());
    }

    public boolean onLayoutDirectionChanged(int arg0) {
        return real.onLayoutDirectionChanged(arg0);
    }

    public void registerAnimationCallback(com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback arg0) {
        real.registerAnimationCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void reset() {
        real.reset();
    }

    public void setAlpha(int arg0) {
        real.setAlpha(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        real.setColorFilter(arg0 == null ? null : arg0.unwrap());
    }

    public void setHotspot(float arg0, float arg1) {
        real.setHotspot(arg0, arg1);
    }

    public void setHotspotBounds(int arg0, int arg1, int arg2, int arg3) {
        real.setHotspotBounds(arg0, arg1, arg2, arg3);
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setTintList(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return real.setVisible(arg0, arg1);
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

}
