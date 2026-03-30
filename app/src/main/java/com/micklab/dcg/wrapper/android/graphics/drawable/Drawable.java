// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class Drawable {
    private final android.graphics.drawable.Drawable real;

    public Drawable(android.graphics.drawable.Drawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable wrap(android.graphics.drawable.Drawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Drawable(real);
    }

    public android.graphics.drawable.Drawable unwrap() {
        return real;
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        real.applyTheme(arg0);
    }

    public boolean canApplyTheme() {
        return real.canApplyTheme();
    }

    public void clearColorFilter() {
        real.clearColorFilter();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect copyBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.copyBounds());
    }

    public void copyBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.copyBounds(arg0 == null ? null : arg0.unwrap());
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromPath(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromPath(arg0));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromResourceStream(com.micklab.dcg.wrapper.android.content.res.Resources arg0, com.micklab.dcg.wrapper.android.util.TypedValue arg1, java.io.InputStream arg2, java.lang.String arg3) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromResourceStream(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromResourceStream(com.micklab.dcg.wrapper.android.content.res.Resources arg0, com.micklab.dcg.wrapper.android.util.TypedValue arg1, java.io.InputStream arg2, java.lang.String arg3, com.micklab.dcg.wrapper.android.graphics.BitmapFactory.Options arg4) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromResourceStream(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4 == null ? null : arg4.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromStream(java.io.InputStream arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromStream(arg0, arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromXml(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromXml(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromXml(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, android.content.res.Resources.Theme arg2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromXml(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromXmlInner(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromXmlInner(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable createFromXmlInner(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(android.graphics.drawable.Drawable.createFromXmlInner(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public int getAlpha() {
        return real.getAlpha();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getBounds());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.Callback getCallback() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.Callback.wrap(real.getCallback());
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

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getCurrent() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getCurrent());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getDirtyBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getDirtyBounds());
    }

    public void getHotspotBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getHotspotBounds(arg0 == null ? null : arg0.unwrap());
    }

    public int getIntrinsicHeight() {
        return real.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return real.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return real.getLayoutDirection();
    }

    public int getLevel() {
        return real.getLevel();
    }

    public int getMinimumHeight() {
        return real.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return real.getMinimumWidth();
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

    public boolean getPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.getPadding(arg0 == null ? null : arg0.unwrap());
    }

    public int[] getState() {
        return real.getState();
    }

    public com.micklab.dcg.wrapper.android.graphics.Region getTransparentRegion() {
        return com.micklab.dcg.wrapper.android.graphics.Region.wrap(real.getTransparentRegion());
    }

    public boolean hasFocusStateSpecified() {
        return real.hasFocusStateSpecified();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public void invalidateSelf() {
        real.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return real.isAutoMirrored();
    }

    public boolean isFilterBitmap() {
        return real.isFilterBitmap();
    }

    public boolean isProjected() {
        return real.isProjected();
    }

    public boolean isStateful() {
        return real.isStateful();
    }

    public boolean isVisible() {
        return real.isVisible();
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

    public static int resolveOpacity(int arg0, int arg1) {
        return android.graphics.drawable.Drawable.resolveOpacity(arg0, arg1);
    }

    public void scheduleSelf(java.lang.Runnable arg0, long arg1) {
        real.scheduleSelf(arg0, arg1);
    }

    public void setAlpha(int arg0) {
        real.setAlpha(arg0);
    }

    public void setAutoMirrored(boolean arg0) {
        real.setAutoMirrored(arg0);
    }

    public void setBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setBounds(arg0 == null ? null : arg0.unwrap());
    }

    public void setBounds(int arg0, int arg1, int arg2, int arg3) {
        real.setBounds(arg0, arg1, arg2, arg3);
    }

    public void setCallback(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.Callback arg0) {
        real.setCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setChangingConfigurations(int arg0) {
        real.setChangingConfigurations(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        real.setColorFilter(arg0 == null ? null : arg0.unwrap());
    }

    public void setColorFilter(int arg0, com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg1) {
        real.setColorFilter(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setDither(boolean arg0) {
        real.setDither(arg0);
    }

    public void setFilterBitmap(boolean arg0) {
        real.setFilterBitmap(arg0);
    }

    public void setHotspot(float arg0, float arg1) {
        real.setHotspot(arg0, arg1);
    }

    public void setHotspotBounds(int arg0, int arg1, int arg2, int arg3) {
        real.setHotspotBounds(arg0, arg1, arg2, arg3);
    }

    public boolean setLayoutDirection(int arg0) {
        return real.setLayoutDirection(arg0);
    }

    public boolean setLevel(int arg0) {
        return real.setLevel(arg0);
    }

    public boolean setState(int[] arg0) {
        return real.setState(arg0);
    }

    public void setTint(int arg0) {
        real.setTint(arg0);
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        real.setTintMode(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return real.setVisible(arg0, arg1);
    }

    public void unscheduleSelf(java.lang.Runnable arg0) {
        real.unscheduleSelf(arg0);
    }

    public static final class Callback {
        private final android.graphics.drawable.Drawable.Callback real;

        public Callback(android.graphics.drawable.Drawable.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.Callback wrap(android.graphics.drawable.Drawable.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.Callback(real);
        }

        public android.graphics.drawable.Drawable.Callback unwrap() {
            return real;
        }

        public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
            real.invalidateDrawable(arg0 == null ? null : arg0.unwrap());
        }

        public void scheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1, long arg2) {
            real.scheduleDrawable(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

        public void unscheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1) {
            real.unscheduleDrawable(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
    public static final class ConstantState {
        private final android.graphics.drawable.Drawable.ConstantState real;

        public ConstantState(android.graphics.drawable.Drawable.ConstantState real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState wrap(android.graphics.drawable.Drawable.ConstantState real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState(real);
        }

        public android.graphics.drawable.Drawable.ConstantState unwrap() {
            return real;
        }

        public boolean canApplyTheme() {
            return real.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return real.getChangingConfigurations();
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable newDrawable() {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.newDrawable());
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable newDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0) {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.newDrawable(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable newDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0, android.content.res.Resources.Theme arg1) {
            return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.newDrawable(arg0 == null ? null : arg0.unwrap(), arg1));
        }

    }
}
