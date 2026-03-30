// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class Drawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Drawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable wrap(android.graphics.drawable.Drawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Drawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.Drawable getReal() {
        return (android.graphics.drawable.Drawable) real;
    }

    public android.graphics.drawable.Drawable unwrap() {
        return getReal();
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.Drawable) real).applyTheme(arg0);
    }

    public boolean canApplyTheme() {
        return ((android.graphics.drawable.Drawable) real).canApplyTheme();
    }

    public void clearColorFilter() {
        ((android.graphics.drawable.Drawable) real).clearColorFilter();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect copyBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.graphics.drawable.Drawable) real).copyBounds());
    }

    public void copyBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.graphics.drawable.Drawable) real).copyBounds(arg0 == null ? null : arg0.getReal());
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromPath(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromPath(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromResourceStream(com.micklab.dcg.wrapper.android.content.res.Resources arg0, com.micklab.dcg.wrapper.android.util.TypedValue arg1, java.io.InputStream arg2, java.lang.String arg3) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromResourceStream(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromResourceStream(com.micklab.dcg.wrapper.android.content.res.Resources arg0, com.micklab.dcg.wrapper.android.util.TypedValue arg1, java.io.InputStream arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg4) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromResourceStream(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4 == null ? null : arg4.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromStream(java.io.InputStream arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromStream(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromXml(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromXml(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromXml(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, android.content.res.Resources.Theme arg2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromXml(arg0 == null ? null : arg0.getReal(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromXmlInner(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromXmlInner(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromXmlInner(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromXmlInner(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3));
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.Drawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public int getAlpha() {
        return ((android.graphics.drawable.Drawable) real).getAlpha();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.graphics.drawable.Drawable) real).getBounds());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.Callback getCallback() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.Callback.wrap(((android.graphics.drawable.Drawable) real).getCallback());
    }

    public int getChangingConfigurations() {
        return ((android.graphics.drawable.Drawable) real).getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(((android.graphics.drawable.Drawable) real).getColorFilter());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(((android.graphics.drawable.Drawable) real).getConstantState());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getCurrent() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.Drawable) real).getCurrent());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getDirtyBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.graphics.drawable.Drawable) real).getDirtyBounds());
    }

    public void getHotspotBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.graphics.drawable.Drawable) real).getHotspotBounds(arg0 == null ? null : arg0.getReal());
    }

    public int getIntrinsicHeight() {
        return ((android.graphics.drawable.Drawable) real).getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return ((android.graphics.drawable.Drawable) real).getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return ((android.graphics.drawable.Drawable) real).getLayoutDirection();
    }

    public int getLevel() {
        return ((android.graphics.drawable.Drawable) real).getLevel();
    }

    public int getMinimumHeight() {
        return ((android.graphics.drawable.Drawable) real).getMinimumHeight();
    }

    public int getMinimumWidth() {
        return ((android.graphics.drawable.Drawable) real).getMinimumWidth();
    }

    public int getOpacity() {
        return ((android.graphics.drawable.Drawable) real).getOpacity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getOpticalInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.graphics.drawable.Drawable) real).getOpticalInsets());
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.Drawable) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

    public boolean getPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.drawable.Drawable) real).getPadding(arg0 == null ? null : arg0.getReal());
    }

    public int[] getState() {
        return ((android.graphics.drawable.Drawable) real).getState();
    }

    public com.micklab.dcg.wrapper.android.graphics.Region getTransparentRegion() {
        return com.micklab.dcg.wrapper.android.graphics.Region.wrap(((android.graphics.drawable.Drawable) real).getTransparentRegion());
    }

    public boolean hasFocusStateSpecified() {
        return ((android.graphics.drawable.Drawable) real).hasFocusStateSpecified();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.Drawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal());
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.Drawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public void invalidateSelf() {
        ((android.graphics.drawable.Drawable) real).invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return ((android.graphics.drawable.Drawable) real).isAutoMirrored();
    }

    public boolean isFilterBitmap() {
        return ((android.graphics.drawable.Drawable) real).isFilterBitmap();
    }

    public boolean isProjected() {
        return ((android.graphics.drawable.Drawable) real).isProjected();
    }

    public boolean isStateful() {
        return ((android.graphics.drawable.Drawable) real).isStateful();
    }

    public boolean isVisible() {
        return ((android.graphics.drawable.Drawable) real).isVisible();
    }

    public void jumpToCurrentState() {
        ((android.graphics.drawable.Drawable) real).jumpToCurrentState();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.Drawable) real).mutate());
    }

    public boolean onLayoutDirectionChanged(int arg0) {
        return ((android.graphics.drawable.Drawable) real).onLayoutDirectionChanged(arg0);
    }

    public static int resolveOpacity(int arg0, int arg1) {
        return android.graphics.drawable.Drawable.resolveOpacity(arg0, arg1);
    }

    public void scheduleSelf(java.lang.Runnable arg0, long arg1) {
        ((android.graphics.drawable.Drawable) real).scheduleSelf(arg0, arg1);
    }

    public void setAlpha(int arg0) {
        ((android.graphics.drawable.Drawable) real).setAlpha(arg0);
    }

    public void setAutoMirrored(boolean arg0) {
        ((android.graphics.drawable.Drawable) real).setAutoMirrored(arg0);
    }

    public void setBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.graphics.drawable.Drawable) real).setBounds(arg0 == null ? null : arg0.getReal());
    }

    public void setBounds(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.drawable.Drawable) real).setBounds(arg0, arg1, arg2, arg3);
    }

    public void setCallback(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.Callback arg0) {
        ((android.graphics.drawable.Drawable) real).setCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setChangingConfigurations(int arg0) {
        ((android.graphics.drawable.Drawable) real).setChangingConfigurations(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        ((android.graphics.drawable.Drawable) real).setColorFilter(arg0 == null ? null : arg0.getReal());
    }

    public void setColorFilter(int arg0, com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg1) {
        ((android.graphics.drawable.Drawable) real).setColorFilter(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setDither(boolean arg0) {
        ((android.graphics.drawable.Drawable) real).setDither(arg0);
    }

    public void setFilterBitmap(boolean arg0) {
        ((android.graphics.drawable.Drawable) real).setFilterBitmap(arg0);
    }

    public void setHotspot(float arg0, float arg1) {
        ((android.graphics.drawable.Drawable) real).setHotspot(arg0, arg1);
    }

    public void setHotspotBounds(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.drawable.Drawable) real).setHotspotBounds(arg0, arg1, arg2, arg3);
    }

    public boolean setLayoutDirection(int arg0) {
        return ((android.graphics.drawable.Drawable) real).setLayoutDirection(arg0);
    }

    public boolean setLevel(int arg0) {
        return ((android.graphics.drawable.Drawable) real).setLevel(arg0);
    }

    public boolean setState(int[] arg0) {
        return ((android.graphics.drawable.Drawable) real).setState(arg0);
    }

    public void setTint(int arg0) {
        ((android.graphics.drawable.Drawable) real).setTint(arg0);
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.graphics.drawable.Drawable) real).setTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.graphics.drawable.Drawable) real).setTintList(arg0 == null ? null : arg0.getReal());
    }

    public void setTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        ((android.graphics.drawable.Drawable) real).setTintMode(arg0 == null ? null : arg0.getReal());
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return ((android.graphics.drawable.Drawable) real).setVisible(arg0, arg1);
    }

    public void unscheduleSelf(java.lang.Runnable arg0) {
        ((android.graphics.drawable.Drawable) real).unscheduleSelf(arg0);
    }

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.Callback wrap(android.graphics.drawable.Drawable.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.drawable.Drawable.Callback getReal() {
            return (android.graphics.drawable.Drawable.Callback) real;
        }

        public android.graphics.drawable.Drawable.Callback unwrap() {
            return getReal();
        }

        public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            ((android.graphics.drawable.Drawable.Callback) real).invalidateDrawable(arg0 == null ? null : arg0.getReal());
        }

        public void scheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1, long arg2) {
            ((android.graphics.drawable.Drawable.Callback) real).scheduleDrawable(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

        public void unscheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1) {
            ((android.graphics.drawable.Drawable.Callback) real).unscheduleDrawable(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
    public static final class ConstantState {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private ConstantState(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState wrap(android.graphics.drawable.Drawable.ConstantState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.drawable.Drawable.ConstantState getReal() {
            return (android.graphics.drawable.Drawable.ConstantState) real;
        }

        public android.graphics.drawable.Drawable.ConstantState unwrap() {
            return getReal();
        }

        public boolean canApplyTheme() {
            return ((android.graphics.drawable.Drawable.ConstantState) real).canApplyTheme();
        }

        public int getChangingConfigurations() {
            return ((android.graphics.drawable.Drawable.ConstantState) real).getChangingConfigurations();
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable newDrawable() {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.Drawable.ConstantState) real).newDrawable());
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable newDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0) {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.Drawable.ConstantState) real).newDrawable(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable newDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0, android.content.res.Resources.Theme arg1) {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.Drawable.ConstantState) real).newDrawable(arg0 == null ? null : arg0.getReal(), arg1));
        }

    }
}
