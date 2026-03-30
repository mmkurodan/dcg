// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class AnimatedVectorDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AnimatedVectorDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.AnimatedVectorDrawable wrap(android.graphics.drawable.AnimatedVectorDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.AnimatedVectorDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.AnimatedVectorDrawable getReal() {
        return (android.graphics.drawable.AnimatedVectorDrawable) real;
    }

    public android.graphics.drawable.AnimatedVectorDrawable unwrap() {
        return getReal();
    }

    public AnimatedVectorDrawable() {
        this(new android.graphics.drawable.AnimatedVectorDrawable(), (__DcgwBridgeToken) null);
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).applyTheme(arg0);
    }

    public boolean canApplyTheme() {
        return ((android.graphics.drawable.AnimatedVectorDrawable) real).canApplyTheme();
    }

    public void clearAnimationCallbacks() {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).clearAnimationCallbacks();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public int getAlpha() {
        return ((android.graphics.drawable.AnimatedVectorDrawable) real).getAlpha();
    }

    public int getChangingConfigurations() {
        return ((android.graphics.drawable.AnimatedVectorDrawable) real).getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(((android.graphics.drawable.AnimatedVectorDrawable) real).getColorFilter());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(((android.graphics.drawable.AnimatedVectorDrawable) real).getConstantState());
    }

    public int getIntrinsicHeight() {
        return ((android.graphics.drawable.AnimatedVectorDrawable) real).getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return ((android.graphics.drawable.AnimatedVectorDrawable) real).getIntrinsicWidth();
    }

    public int getOpacity() {
        return ((android.graphics.drawable.AnimatedVectorDrawable) real).getOpacity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getOpticalInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.graphics.drawable.AnimatedVectorDrawable) real).getOpticalInsets());
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public boolean isRunning() {
        return ((android.graphics.drawable.AnimatedVectorDrawable) real).isRunning();
    }

    public boolean isStateful() {
        return ((android.graphics.drawable.AnimatedVectorDrawable) real).isStateful();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.AnimatedVectorDrawable) real).mutate());
    }

    public boolean onLayoutDirectionChanged(int arg0) {
        return ((android.graphics.drawable.AnimatedVectorDrawable) real).onLayoutDirectionChanged(arg0);
    }

    public void registerAnimationCallback(com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback arg0) {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).registerAnimationCallback(arg0 == null ? null : arg0.getReal());
    }

    public void reset() {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).reset();
    }

    public void setAlpha(int arg0) {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).setAlpha(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).setColorFilter(arg0 == null ? null : arg0.getReal());
    }

    public void setHotspot(float arg0, float arg1) {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).setHotspot(arg0, arg1);
    }

    public void setHotspotBounds(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).setHotspotBounds(arg0, arg1, arg2, arg3);
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).setTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).setTintList(arg0 == null ? null : arg0.getReal());
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return ((android.graphics.drawable.AnimatedVectorDrawable) real).setVisible(arg0, arg1);
    }

    public void start() {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).start();
    }

    public void stop() {
        ((android.graphics.drawable.AnimatedVectorDrawable) real).stop();
    }

    public boolean unregisterAnimationCallback(com.micklab.dcg.wrapper.android.graphics.drawable.Animatable2.AnimationCallback arg0) {
        return ((android.graphics.drawable.AnimatedVectorDrawable) real).unregisterAnimationCallback(arg0 == null ? null : arg0.getReal());
    }

}
