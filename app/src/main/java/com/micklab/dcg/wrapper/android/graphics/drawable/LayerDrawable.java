// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class LayerDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LayerDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.LayerDrawable wrap(android.graphics.drawable.LayerDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.LayerDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.LayerDrawable getReal() {
        return (android.graphics.drawable.LayerDrawable) real;
    }

    public android.graphics.drawable.LayerDrawable unwrap() {
        return getReal();
    }

    public LayerDrawable(android.graphics.drawable.Drawable[] arg0) {
        this(new android.graphics.drawable.LayerDrawable(arg0), (__DcgwBridgeToken) null);
    }

    public int addLayer(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).addLayer(arg0 == null ? null : arg0.getReal());
    }

    public void applyTheme(com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.LayerDrawable) real).applyTheme(arg0 == null ? null : arg0.getReal());
    }

    public boolean canApplyTheme() {
        return ((android.graphics.drawable.LayerDrawable) real).canApplyTheme();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.LayerDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable findDrawableByLayerId(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.LayerDrawable) real).findDrawableByLayerId(arg0));
    }

    public int findIndexByLayerId(int arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).findIndexByLayerId(arg0);
    }

    public int getAlpha() {
        return ((android.graphics.drawable.LayerDrawable) real).getAlpha();
    }

    public int getBottomPadding() {
        return ((android.graphics.drawable.LayerDrawable) real).getBottomPadding();
    }

    public int getChangingConfigurations() {
        return ((android.graphics.drawable.LayerDrawable) real).getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(((android.graphics.drawable.LayerDrawable) real).getConstantState());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.LayerDrawable) real).getDrawable(arg0));
    }

    public int getEndPadding() {
        return ((android.graphics.drawable.LayerDrawable) real).getEndPadding();
    }

    public void getHotspotBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.graphics.drawable.LayerDrawable) real).getHotspotBounds(arg0 == null ? null : arg0.getReal());
    }

    public int getId(int arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).getId(arg0);
    }

    public int getIntrinsicHeight() {
        return ((android.graphics.drawable.LayerDrawable) real).getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return ((android.graphics.drawable.LayerDrawable) real).getIntrinsicWidth();
    }

    public int getLayerGravity(int arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).getLayerGravity(arg0);
    }

    public int getLayerHeight(int arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).getLayerHeight(arg0);
    }

    public int getLayerInsetBottom(int arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).getLayerInsetBottom(arg0);
    }

    public int getLayerInsetEnd(int arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).getLayerInsetEnd(arg0);
    }

    public int getLayerInsetLeft(int arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).getLayerInsetLeft(arg0);
    }

    public int getLayerInsetRight(int arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).getLayerInsetRight(arg0);
    }

    public int getLayerInsetStart(int arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).getLayerInsetStart(arg0);
    }

    public int getLayerInsetTop(int arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).getLayerInsetTop(arg0);
    }

    public int getLayerWidth(int arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).getLayerWidth(arg0);
    }

    public int getLeftPadding() {
        return ((android.graphics.drawable.LayerDrawable) real).getLeftPadding();
    }

    public int getNumberOfLayers() {
        return ((android.graphics.drawable.LayerDrawable) real).getNumberOfLayers();
    }

    public int getOpacity() {
        return ((android.graphics.drawable.LayerDrawable) real).getOpacity();
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.LayerDrawable) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

    public boolean getPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).getPadding(arg0 == null ? null : arg0.getReal());
    }

    public int getPaddingMode() {
        return ((android.graphics.drawable.LayerDrawable) real).getPaddingMode();
    }

    public int getRightPadding() {
        return ((android.graphics.drawable.LayerDrawable) real).getRightPadding();
    }

    public int getStartPadding() {
        return ((android.graphics.drawable.LayerDrawable) real).getStartPadding();
    }

    public int getTopPadding() {
        return ((android.graphics.drawable.LayerDrawable) real).getTopPadding();
    }

    public boolean hasFocusStateSpecified() {
        return ((android.graphics.drawable.LayerDrawable) real).hasFocusStateSpecified();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.LayerDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.graphics.drawable.LayerDrawable) real).invalidateDrawable(arg0 == null ? null : arg0.getReal());
    }

    public boolean isAutoMirrored() {
        return ((android.graphics.drawable.LayerDrawable) real).isAutoMirrored();
    }

    public boolean isProjected() {
        return ((android.graphics.drawable.LayerDrawable) real).isProjected();
    }

    public boolean isStateful() {
        return ((android.graphics.drawable.LayerDrawable) real).isStateful();
    }

    public void jumpToCurrentState() {
        ((android.graphics.drawable.LayerDrawable) real).jumpToCurrentState();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.LayerDrawable) real).mutate());
    }

    public boolean onLayoutDirectionChanged(int arg0) {
        return ((android.graphics.drawable.LayerDrawable) real).onLayoutDirectionChanged(arg0);
    }

    public void scheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1, long arg2) {
        ((android.graphics.drawable.LayerDrawable) real).scheduleDrawable(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void setAlpha(int arg0) {
        ((android.graphics.drawable.LayerDrawable) real).setAlpha(arg0);
    }

    public void setAutoMirrored(boolean arg0) {
        ((android.graphics.drawable.LayerDrawable) real).setAutoMirrored(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        ((android.graphics.drawable.LayerDrawable) real).setColorFilter(arg0 == null ? null : arg0.getReal());
    }

    public void setDither(boolean arg0) {
        ((android.graphics.drawable.LayerDrawable) real).setDither(arg0);
    }

    public void setDrawable(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        ((android.graphics.drawable.LayerDrawable) real).setDrawable(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean setDrawableByLayerId(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        return ((android.graphics.drawable.LayerDrawable) real).setDrawableByLayerId(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setHotspot(float arg0, float arg1) {
        ((android.graphics.drawable.LayerDrawable) real).setHotspot(arg0, arg1);
    }

    public void setHotspotBounds(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.drawable.LayerDrawable) real).setHotspotBounds(arg0, arg1, arg2, arg3);
    }

    public void setId(int arg0, int arg1) {
        ((android.graphics.drawable.LayerDrawable) real).setId(arg0, arg1);
    }

    public void setLayerGravity(int arg0, int arg1) {
        ((android.graphics.drawable.LayerDrawable) real).setLayerGravity(arg0, arg1);
    }

    public void setLayerHeight(int arg0, int arg1) {
        ((android.graphics.drawable.LayerDrawable) real).setLayerHeight(arg0, arg1);
    }

    public void setLayerInset(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.graphics.drawable.LayerDrawable) real).setLayerInset(arg0, arg1, arg2, arg3, arg4);
    }

    public void setLayerInsetBottom(int arg0, int arg1) {
        ((android.graphics.drawable.LayerDrawable) real).setLayerInsetBottom(arg0, arg1);
    }

    public void setLayerInsetEnd(int arg0, int arg1) {
        ((android.graphics.drawable.LayerDrawable) real).setLayerInsetEnd(arg0, arg1);
    }

    public void setLayerInsetLeft(int arg0, int arg1) {
        ((android.graphics.drawable.LayerDrawable) real).setLayerInsetLeft(arg0, arg1);
    }

    public void setLayerInsetRelative(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.graphics.drawable.LayerDrawable) real).setLayerInsetRelative(arg0, arg1, arg2, arg3, arg4);
    }

    public void setLayerInsetRight(int arg0, int arg1) {
        ((android.graphics.drawable.LayerDrawable) real).setLayerInsetRight(arg0, arg1);
    }

    public void setLayerInsetStart(int arg0, int arg1) {
        ((android.graphics.drawable.LayerDrawable) real).setLayerInsetStart(arg0, arg1);
    }

    public void setLayerInsetTop(int arg0, int arg1) {
        ((android.graphics.drawable.LayerDrawable) real).setLayerInsetTop(arg0, arg1);
    }

    public void setLayerSize(int arg0, int arg1, int arg2) {
        ((android.graphics.drawable.LayerDrawable) real).setLayerSize(arg0, arg1, arg2);
    }

    public void setLayerWidth(int arg0, int arg1) {
        ((android.graphics.drawable.LayerDrawable) real).setLayerWidth(arg0, arg1);
    }

    public void setOpacity(int arg0) {
        ((android.graphics.drawable.LayerDrawable) real).setOpacity(arg0);
    }

    public void setPadding(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.drawable.LayerDrawable) real).setPadding(arg0, arg1, arg2, arg3);
    }

    public void setPaddingMode(int arg0) {
        ((android.graphics.drawable.LayerDrawable) real).setPaddingMode(arg0);
    }

    public void setPaddingRelative(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.drawable.LayerDrawable) real).setPaddingRelative(arg0, arg1, arg2, arg3);
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.graphics.drawable.LayerDrawable) real).setTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.graphics.drawable.LayerDrawable) real).setTintList(arg0 == null ? null : arg0.getReal());
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return ((android.graphics.drawable.LayerDrawable) real).setVisible(arg0, arg1);
    }

    public void unscheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1) {
        ((android.graphics.drawable.LayerDrawable) real).unscheduleDrawable(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int INSET_UNDEFINED = android.graphics.drawable.LayerDrawable.INSET_UNDEFINED;
    public static final int PADDING_MODE_NEST = android.graphics.drawable.LayerDrawable.PADDING_MODE_NEST;
    public static final int PADDING_MODE_STACK = android.graphics.drawable.LayerDrawable.PADDING_MODE_STACK;

}
