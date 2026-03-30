// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class LayerDrawable {
    private final android.graphics.drawable.LayerDrawable real;

    public LayerDrawable(android.graphics.drawable.LayerDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.LayerDrawable wrap(android.graphics.drawable.LayerDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.LayerDrawable(real);
    }

    public android.graphics.drawable.LayerDrawable unwrap() {
        return real;
    }

    public LayerDrawable(android.graphics.drawable.Drawable[] arg0) {
        this(new android.graphics.drawable.LayerDrawable(arg0));
    }

    public int addLayer(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        return real.addLayer(arg0 == null ? null : arg0.unwrap());
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        real.applyTheme(arg0);
    }

    public boolean canApplyTheme() {
        return real.canApplyTheme();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable findDrawableByLayerId(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.findDrawableByLayerId(arg0));
    }

    public int findIndexByLayerId(int arg0) {
        return real.findIndexByLayerId(arg0);
    }

    public int getAlpha() {
        return real.getAlpha();
    }

    public int getBottomPadding() {
        return real.getBottomPadding();
    }

    public int getChangingConfigurations() {
        return real.getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(real.getConstantState());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable(int arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getDrawable(arg0));
    }

    public int getEndPadding() {
        return real.getEndPadding();
    }

    public void getHotspotBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getHotspotBounds(arg0 == null ? null : arg0.unwrap());
    }

    public int getId(int arg0) {
        return real.getId(arg0);
    }

    public int getIntrinsicHeight() {
        return real.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return real.getIntrinsicWidth();
    }

    public int getLayerGravity(int arg0) {
        return real.getLayerGravity(arg0);
    }

    public int getLayerHeight(int arg0) {
        return real.getLayerHeight(arg0);
    }

    public int getLayerInsetBottom(int arg0) {
        return real.getLayerInsetBottom(arg0);
    }

    public int getLayerInsetEnd(int arg0) {
        return real.getLayerInsetEnd(arg0);
    }

    public int getLayerInsetLeft(int arg0) {
        return real.getLayerInsetLeft(arg0);
    }

    public int getLayerInsetRight(int arg0) {
        return real.getLayerInsetRight(arg0);
    }

    public int getLayerInsetStart(int arg0) {
        return real.getLayerInsetStart(arg0);
    }

    public int getLayerInsetTop(int arg0) {
        return real.getLayerInsetTop(arg0);
    }

    public int getLayerWidth(int arg0) {
        return real.getLayerWidth(arg0);
    }

    public int getLeftPadding() {
        return real.getLeftPadding();
    }

    public int getNumberOfLayers() {
        return real.getNumberOfLayers();
    }

    public int getOpacity() {
        return real.getOpacity();
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        real.getOutline(arg0 == null ? null : arg0.unwrap());
    }

    public boolean getPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.getPadding(arg0 == null ? null : arg0.unwrap());
    }

    public int getPaddingMode() {
        return real.getPaddingMode();
    }

    public int getRightPadding() {
        return real.getRightPadding();
    }

    public int getStartPadding() {
        return real.getStartPadding();
    }

    public int getTopPadding() {
        return real.getTopPadding();
    }

    public boolean hasFocusStateSpecified() {
        return real.hasFocusStateSpecified();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.invalidateDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isAutoMirrored() {
        return real.isAutoMirrored();
    }

    public boolean isProjected() {
        return real.isProjected();
    }

    public boolean isStateful() {
        return real.isStateful();
    }

    public void jumpToCurrentState() {
        real.jumpToCurrentState();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.mutate());
    }

    public boolean onLayoutDirectionChanged(int arg0) {
        return real.onLayoutDirectionChanged(arg0);
    }

    public void scheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1, long arg2) {
        real.scheduleDrawable(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
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

    public void setDither(boolean arg0) {
        real.setDither(arg0);
    }

    public void setDrawable(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        real.setDrawable(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean setDrawableByLayerId(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        return real.setDrawableByLayerId(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setHotspot(float arg0, float arg1) {
        real.setHotspot(arg0, arg1);
    }

    public void setHotspotBounds(int arg0, int arg1, int arg2, int arg3) {
        real.setHotspotBounds(arg0, arg1, arg2, arg3);
    }

    public void setId(int arg0, int arg1) {
        real.setId(arg0, arg1);
    }

    public void setLayerGravity(int arg0, int arg1) {
        real.setLayerGravity(arg0, arg1);
    }

    public void setLayerHeight(int arg0, int arg1) {
        real.setLayerHeight(arg0, arg1);
    }

    public void setLayerInset(int arg0, int arg1, int arg2, int arg3, int arg4) {
        real.setLayerInset(arg0, arg1, arg2, arg3, arg4);
    }

    public void setLayerInsetBottom(int arg0, int arg1) {
        real.setLayerInsetBottom(arg0, arg1);
    }

    public void setLayerInsetEnd(int arg0, int arg1) {
        real.setLayerInsetEnd(arg0, arg1);
    }

    public void setLayerInsetLeft(int arg0, int arg1) {
        real.setLayerInsetLeft(arg0, arg1);
    }

    public void setLayerInsetRelative(int arg0, int arg1, int arg2, int arg3, int arg4) {
        real.setLayerInsetRelative(arg0, arg1, arg2, arg3, arg4);
    }

    public void setLayerInsetRight(int arg0, int arg1) {
        real.setLayerInsetRight(arg0, arg1);
    }

    public void setLayerInsetStart(int arg0, int arg1) {
        real.setLayerInsetStart(arg0, arg1);
    }

    public void setLayerInsetTop(int arg0, int arg1) {
        real.setLayerInsetTop(arg0, arg1);
    }

    public void setLayerSize(int arg0, int arg1, int arg2) {
        real.setLayerSize(arg0, arg1, arg2);
    }

    public void setLayerWidth(int arg0, int arg1) {
        real.setLayerWidth(arg0, arg1);
    }

    public void setOpacity(int arg0) {
        real.setOpacity(arg0);
    }

    public void setPadding(int arg0, int arg1, int arg2, int arg3) {
        real.setPadding(arg0, arg1, arg2, arg3);
    }

    public void setPaddingMode(int arg0) {
        real.setPaddingMode(arg0);
    }

    public void setPaddingRelative(int arg0, int arg1, int arg2, int arg3) {
        real.setPaddingRelative(arg0, arg1, arg2, arg3);
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

    public void unscheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1) {
        real.unscheduleDrawable(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int INSET_UNDEFINED = android.graphics.drawable.LayerDrawable.INSET_UNDEFINED;
    public static final int PADDING_MODE_NEST = android.graphics.drawable.LayerDrawable.PADDING_MODE_NEST;
    public static final int PADDING_MODE_STACK = android.graphics.drawable.LayerDrawable.PADDING_MODE_STACK;

}
