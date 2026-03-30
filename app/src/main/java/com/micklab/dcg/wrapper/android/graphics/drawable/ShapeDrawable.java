// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class ShapeDrawable {
    private final android.graphics.drawable.ShapeDrawable real;

    public ShapeDrawable(android.graphics.drawable.ShapeDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.ShapeDrawable wrap(android.graphics.drawable.ShapeDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.ShapeDrawable(real);
    }

    public android.graphics.drawable.ShapeDrawable unwrap() {
        return real;
    }

    public ShapeDrawable() {
        this(new android.graphics.drawable.ShapeDrawable());
    }

    public ShapeDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.shapes.Shape arg0) {
        this(new android.graphics.drawable.ShapeDrawable(arg0 == null ? null : arg0.unwrap()));
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        real.applyTheme(arg0);
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

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        real.getOutline(arg0 == null ? null : arg0.unwrap());
    }

    public boolean getPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.getPadding(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint getPaint() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.wrap(real.getPaint());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.ShapeDrawable.ShaderFactory getShaderFactory() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.ShapeDrawable.ShaderFactory.wrap(real.getShaderFactory());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.shapes.Shape getShape() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.shapes.Shape.wrap(real.getShape());
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

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        real.setColorFilter(arg0 == null ? null : arg0.unwrap());
    }

    public void setDither(boolean arg0) {
        real.setDither(arg0);
    }

    public void setIntrinsicHeight(int arg0) {
        real.setIntrinsicHeight(arg0);
    }

    public void setIntrinsicWidth(int arg0) {
        real.setIntrinsicWidth(arg0);
    }

    public void setPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setPadding(arg0 == null ? null : arg0.unwrap());
    }

    public void setPadding(int arg0, int arg1, int arg2, int arg3) {
        real.setPadding(arg0, arg1, arg2, arg3);
    }

    public void setShaderFactory(com.micklab.dcg.wrapper.android.graphics.drawable.ShapeDrawable.ShaderFactory arg0) {
        real.setShaderFactory(arg0 == null ? null : arg0.unwrap());
    }

    public void setShape(com.micklab.dcg.wrapper.android.graphics.drawable.shapes.Shape arg0) {
        real.setShape(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setTintList(arg0 == null ? null : arg0.unwrap());
    }

    public static final class ShaderFactory {
        private final android.graphics.drawable.ShapeDrawable.ShaderFactory real;

        public ShaderFactory(android.graphics.drawable.ShapeDrawable.ShaderFactory real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.drawable.ShapeDrawable.ShaderFactory wrap(android.graphics.drawable.ShapeDrawable.ShaderFactory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.ShapeDrawable.ShaderFactory(real);
        }

        public android.graphics.drawable.ShapeDrawable.ShaderFactory unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.graphics.Shader resize(int arg0, int arg1) {
            return com.micklab.dcg.wrapper.android.graphics.Shader.wrap(real.resize(arg0, arg1));
        }

    }
}
