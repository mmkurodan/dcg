// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class Transformation {
    private final android.view.animation.Transformation real;

    public Transformation(android.view.animation.Transformation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.Transformation wrap(android.view.animation.Transformation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.Transformation(real);
    }

    public android.view.animation.Transformation unwrap() {
        return real;
    }

    public Transformation() {
        this(new android.view.animation.Transformation());
    }

    public void clear() {
        real.clear();
    }

    public void compose(com.micklab.dcg.wrapper.android.view.animation.Transformation arg0) {
        real.compose(arg0 == null ? null : arg0.unwrap());
    }

    public float getAlpha() {
        return real.getAlpha();
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix getMatrix() {
        return com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(real.getMatrix());
    }

    public int getTransformationType() {
        return real.getTransformationType();
    }

    public void set(com.micklab.dcg.wrapper.android.view.animation.Transformation arg0) {
        real.set(arg0 == null ? null : arg0.unwrap());
    }

    public void setAlpha(float arg0) {
        real.setAlpha(arg0);
    }

    public void setTransformationType(int arg0) {
        real.setTransformationType(arg0);
    }

    public java.lang.String toShortString() {
        return real.toShortString();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int TYPE_ALPHA = android.view.animation.Transformation.TYPE_ALPHA;
    public static final int TYPE_BOTH = android.view.animation.Transformation.TYPE_BOTH;
    public static final int TYPE_IDENTITY = android.view.animation.Transformation.TYPE_IDENTITY;
    public static final int TYPE_MATRIX = android.view.animation.Transformation.TYPE_MATRIX;

}
