// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class GradientDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GradientDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable wrap(android.graphics.drawable.GradientDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.GradientDrawable getReal() {
        return (android.graphics.drawable.GradientDrawable) real;
    }

    public android.graphics.drawable.GradientDrawable unwrap() {
        return getReal();
    }

    public GradientDrawable() {
        this(new android.graphics.drawable.GradientDrawable(), (__DcgwBridgeToken) null);
    }

    public GradientDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation arg0, int[] arg1) {
        this(new android.graphics.drawable.GradientDrawable(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public void applyTheme(com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.GradientDrawable) real).applyTheme(arg0 == null ? null : arg0.getReal());
    }

    public boolean canApplyTheme() {
        return ((android.graphics.drawable.GradientDrawable) real).canApplyTheme();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.GradientDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public int getAlpha() {
        return ((android.graphics.drawable.GradientDrawable) real).getAlpha();
    }

    public int getChangingConfigurations() {
        return ((android.graphics.drawable.GradientDrawable) real).getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getColor() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.graphics.drawable.GradientDrawable) real).getColor());
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(((android.graphics.drawable.GradientDrawable) real).getColorFilter());
    }

    public int[] getColors() {
        return ((android.graphics.drawable.GradientDrawable) real).getColors();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(((android.graphics.drawable.GradientDrawable) real).getConstantState());
    }

    public float[] getCornerRadii() {
        return ((android.graphics.drawable.GradientDrawable) real).getCornerRadii();
    }

    public float getCornerRadius() {
        return ((android.graphics.drawable.GradientDrawable) real).getCornerRadius();
    }

    public float getGradientCenterX() {
        return ((android.graphics.drawable.GradientDrawable) real).getGradientCenterX();
    }

    public float getGradientCenterY() {
        return ((android.graphics.drawable.GradientDrawable) real).getGradientCenterY();
    }

    public float getGradientRadius() {
        return ((android.graphics.drawable.GradientDrawable) real).getGradientRadius();
    }

    public int getGradientType() {
        return ((android.graphics.drawable.GradientDrawable) real).getGradientType();
    }

    public int getInnerRadius() {
        return ((android.graphics.drawable.GradientDrawable) real).getInnerRadius();
    }

    public float getInnerRadiusRatio() {
        return ((android.graphics.drawable.GradientDrawable) real).getInnerRadiusRatio();
    }

    public int getIntrinsicHeight() {
        return ((android.graphics.drawable.GradientDrawable) real).getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return ((android.graphics.drawable.GradientDrawable) real).getIntrinsicWidth();
    }

    public int getOpacity() {
        return ((android.graphics.drawable.GradientDrawable) real).getOpacity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getOpticalInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.graphics.drawable.GradientDrawable) real).getOpticalInsets());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation getOrientation() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation.wrap(((android.graphics.drawable.GradientDrawable) real).getOrientation());
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.GradientDrawable) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

    public boolean getPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.drawable.GradientDrawable) real).getPadding(arg0 == null ? null : arg0.getReal());
    }

    public int getShape() {
        return ((android.graphics.drawable.GradientDrawable) real).getShape();
    }

    public int getThickness() {
        return ((android.graphics.drawable.GradientDrawable) real).getThickness();
    }

    public float getThicknessRatio() {
        return ((android.graphics.drawable.GradientDrawable) real).getThicknessRatio();
    }

    public boolean getUseLevel() {
        return ((android.graphics.drawable.GradientDrawable) real).getUseLevel();
    }

    public boolean hasFocusStateSpecified() {
        return ((android.graphics.drawable.GradientDrawable) real).hasFocusStateSpecified();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.GradientDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public boolean isStateful() {
        return ((android.graphics.drawable.GradientDrawable) real).isStateful();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.GradientDrawable) real).mutate());
    }

    public void setAlpha(int arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setAlpha(arg0);
    }

    public void setColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setColor(arg0 == null ? null : arg0.getReal());
    }

    public void setColor(int arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setColor(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setColorFilter(arg0 == null ? null : arg0.getReal());
    }

    public void setColors(int[] arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setColors(arg0);
    }

    public void setColors(int[] arg0, float[] arg1) {
        ((android.graphics.drawable.GradientDrawable) real).setColors(arg0, arg1);
    }

    public void setCornerRadii(float[] arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setCornerRadii(arg0);
    }

    public void setCornerRadius(float arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setCornerRadius(arg0);
    }

    public void setDither(boolean arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setDither(arg0);
    }

    public void setGradientCenter(float arg0, float arg1) {
        ((android.graphics.drawable.GradientDrawable) real).setGradientCenter(arg0, arg1);
    }

    public void setGradientRadius(float arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setGradientRadius(arg0);
    }

    public void setGradientType(int arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setGradientType(arg0);
    }

    public void setInnerRadius(int arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setInnerRadius(arg0);
    }

    public void setInnerRadiusRatio(float arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setInnerRadiusRatio(arg0);
    }

    public void setOrientation(com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setOrientation(arg0 == null ? null : arg0.getReal());
    }

    public void setPadding(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.drawable.GradientDrawable) real).setPadding(arg0, arg1, arg2, arg3);
    }

    public void setShape(int arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setShape(arg0);
    }

    public void setSize(int arg0, int arg1) {
        ((android.graphics.drawable.GradientDrawable) real).setSize(arg0, arg1);
    }

    public void setStroke(int arg0, int arg1) {
        ((android.graphics.drawable.GradientDrawable) real).setStroke(arg0, arg1);
    }

    public void setStroke(int arg0, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg1) {
        ((android.graphics.drawable.GradientDrawable) real).setStroke(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setStroke(int arg0, int arg1, float arg2, float arg3) {
        ((android.graphics.drawable.GradientDrawable) real).setStroke(arg0, arg1, arg2, arg3);
    }

    public void setStroke(int arg0, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg1, float arg2, float arg3) {
        ((android.graphics.drawable.GradientDrawable) real).setStroke(arg0, arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public void setThickness(int arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setThickness(arg0);
    }

    public void setThicknessRatio(float arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setThicknessRatio(arg0);
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setTintList(arg0 == null ? null : arg0.getReal());
    }

    public void setUseLevel(boolean arg0) {
        ((android.graphics.drawable.GradientDrawable) real).setUseLevel(arg0);
    }

    public static final int LINE = android.graphics.drawable.GradientDrawable.LINE;
    public static final int LINEAR_GRADIENT = android.graphics.drawable.GradientDrawable.LINEAR_GRADIENT;
    public static final int OVAL = android.graphics.drawable.GradientDrawable.OVAL;
    public static final int RADIAL_GRADIENT = android.graphics.drawable.GradientDrawable.RADIAL_GRADIENT;
    public static final int RECTANGLE = android.graphics.drawable.GradientDrawable.RECTANGLE;
    public static final int RING = android.graphics.drawable.GradientDrawable.RING;
    public static final int SWEEP_GRADIENT = android.graphics.drawable.GradientDrawable.SWEEP_GRADIENT;

    public static final class Orientation {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Orientation(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation wrap(android.graphics.drawable.GradientDrawable.Orientation real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.drawable.GradientDrawable.Orientation getReal() {
            return (android.graphics.drawable.GradientDrawable.Orientation) real;
        }

        public android.graphics.drawable.GradientDrawable.Orientation unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation.wrap(android.graphics.drawable.GradientDrawable.Orientation.valueOf(arg0));
        }

        public static android.graphics.drawable.GradientDrawable.Orientation[] values() {
            return android.graphics.drawable.GradientDrawable.Orientation.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation BL_TR = com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation.wrap(android.graphics.drawable.GradientDrawable.Orientation.BL_TR);
        public static final com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation BOTTOM_TOP = com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation.wrap(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP);
        public static final com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation BR_TL = com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation.wrap(android.graphics.drawable.GradientDrawable.Orientation.BR_TL);
        public static final com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation LEFT_RIGHT = com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation.wrap(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
        public static final com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation RIGHT_LEFT = com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation.wrap(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT);
        public static final com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation TL_BR = com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation.wrap(android.graphics.drawable.GradientDrawable.Orientation.TL_BR);
        public static final com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation TOP_BOTTOM = com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation.wrap(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM);
        public static final com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation TR_BL = com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation.wrap(android.graphics.drawable.GradientDrawable.Orientation.TR_BL);

    }
}
