// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class GradientDrawable {
    private final android.graphics.drawable.GradientDrawable real;

    public GradientDrawable(android.graphics.drawable.GradientDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable wrap(android.graphics.drawable.GradientDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable(real);
    }

    public android.graphics.drawable.GradientDrawable unwrap() {
        return real;
    }

    public GradientDrawable() {
        this(new android.graphics.drawable.GradientDrawable());
    }

    public GradientDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation arg0, int[] arg1) {
        this(new android.graphics.drawable.GradientDrawable(arg0 == null ? null : arg0.unwrap(), arg1));
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

    public int getAlpha() {
        return real.getAlpha();
    }

    public int getChangingConfigurations() {
        return real.getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getColor() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getColor());
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(real.getColorFilter());
    }

    public int[] getColors() {
        return real.getColors();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(real.getConstantState());
    }

    public float[] getCornerRadii() {
        return real.getCornerRadii();
    }

    public float getCornerRadius() {
        return real.getCornerRadius();
    }

    public float getGradientCenterX() {
        return real.getGradientCenterX();
    }

    public float getGradientCenterY() {
        return real.getGradientCenterY();
    }

    public float getGradientRadius() {
        return real.getGradientRadius();
    }

    public int getGradientType() {
        return real.getGradientType();
    }

    public int getInnerRadius() {
        return real.getInnerRadius();
    }

    public float getInnerRadiusRatio() {
        return real.getInnerRadiusRatio();
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

    public com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation getOrientation() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation.wrap(real.getOrientation());
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        real.getOutline(arg0 == null ? null : arg0.unwrap());
    }

    public boolean getPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.getPadding(arg0 == null ? null : arg0.unwrap());
    }

    public int getShape() {
        return real.getShape();
    }

    public int getThickness() {
        return real.getThickness();
    }

    public float getThicknessRatio() {
        return real.getThicknessRatio();
    }

    public boolean getUseLevel() {
        return real.getUseLevel();
    }

    public boolean hasFocusStateSpecified() {
        return real.hasFocusStateSpecified();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public boolean isStateful() {
        return real.isStateful();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.mutate());
    }

    public void setAlpha(int arg0) {
        real.setAlpha(arg0);
    }

    public void setColor(int arg0) {
        real.setColor(arg0);
    }

    public void setColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setColor(arg0 == null ? null : arg0.unwrap());
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        real.setColorFilter(arg0 == null ? null : arg0.unwrap());
    }

    public void setColors(int[] arg0) {
        real.setColors(arg0);
    }

    public void setColors(int[] arg0, float[] arg1) {
        real.setColors(arg0, arg1);
    }

    public void setCornerRadii(float[] arg0) {
        real.setCornerRadii(arg0);
    }

    public void setCornerRadius(float arg0) {
        real.setCornerRadius(arg0);
    }

    public void setDither(boolean arg0) {
        real.setDither(arg0);
    }

    public void setGradientCenter(float arg0, float arg1) {
        real.setGradientCenter(arg0, arg1);
    }

    public void setGradientRadius(float arg0) {
        real.setGradientRadius(arg0);
    }

    public void setGradientType(int arg0) {
        real.setGradientType(arg0);
    }

    public void setInnerRadius(int arg0) {
        real.setInnerRadius(arg0);
    }

    public void setInnerRadiusRatio(float arg0) {
        real.setInnerRadiusRatio(arg0);
    }

    public void setOrientation(com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation arg0) {
        real.setOrientation(arg0 == null ? null : arg0.unwrap());
    }

    public void setPadding(int arg0, int arg1, int arg2, int arg3) {
        real.setPadding(arg0, arg1, arg2, arg3);
    }

    public void setShape(int arg0) {
        real.setShape(arg0);
    }

    public void setSize(int arg0, int arg1) {
        real.setSize(arg0, arg1);
    }

    public void setStroke(int arg0, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg1) {
        real.setStroke(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setStroke(int arg0, int arg1) {
        real.setStroke(arg0, arg1);
    }

    public void setStroke(int arg0, com.micklab.dcg.wrapper.android.content.res.ColorStateList arg1, float arg2, float arg3) {
        real.setStroke(arg0, arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public void setStroke(int arg0, int arg1, float arg2, float arg3) {
        real.setStroke(arg0, arg1, arg2, arg3);
    }

    public void setThickness(int arg0) {
        real.setThickness(arg0);
    }

    public void setThicknessRatio(float arg0) {
        real.setThicknessRatio(arg0);
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setUseLevel(boolean arg0) {
        real.setUseLevel(arg0);
    }

    public static final int LINE = android.graphics.drawable.GradientDrawable.LINE;
    public static final int LINEAR_GRADIENT = android.graphics.drawable.GradientDrawable.LINEAR_GRADIENT;
    public static final int OVAL = android.graphics.drawable.GradientDrawable.OVAL;
    public static final int RADIAL_GRADIENT = android.graphics.drawable.GradientDrawable.RADIAL_GRADIENT;
    public static final int RECTANGLE = android.graphics.drawable.GradientDrawable.RECTANGLE;
    public static final int RING = android.graphics.drawable.GradientDrawable.RING;
    public static final int SWEEP_GRADIENT = android.graphics.drawable.GradientDrawable.SWEEP_GRADIENT;

    public static final class Orientation {
        private final android.graphics.drawable.GradientDrawable.Orientation real;

        public Orientation(android.graphics.drawable.GradientDrawable.Orientation real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation wrap(android.graphics.drawable.GradientDrawable.Orientation real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.GradientDrawable.Orientation(real);
        }

        public android.graphics.drawable.GradientDrawable.Orientation unwrap() {
            return real;
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
