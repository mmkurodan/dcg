// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.animation;

public final class Transformation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Transformation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.animation.Transformation wrap(android.view.animation.Transformation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.animation.Transformation(real, (__DcgwBridgeToken) null);
    }

    public android.view.animation.Transformation getReal() {
        return (android.view.animation.Transformation) real;
    }

    public android.view.animation.Transformation unwrap() {
        return getReal();
    }

    public Transformation() {
        this(new android.view.animation.Transformation(), (__DcgwBridgeToken) null);
    }

    public void clear() {
        ((android.view.animation.Transformation) real).clear();
    }

    public void compose(com.micklab.dcg.wrapper.android.view.animation.Transformation arg0) {
        ((android.view.animation.Transformation) real).compose(arg0 == null ? null : arg0.getReal());
    }

    public float getAlpha() {
        return ((android.view.animation.Transformation) real).getAlpha();
    }

    public com.micklab.dcg.wrapper.android.graphics.Matrix getMatrix() {
        return com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(((android.view.animation.Transformation) real).getMatrix());
    }

    public int getTransformationType() {
        return ((android.view.animation.Transformation) real).getTransformationType();
    }

    public void set(com.micklab.dcg.wrapper.android.view.animation.Transformation arg0) {
        ((android.view.animation.Transformation) real).set(arg0 == null ? null : arg0.getReal());
    }

    public void setAlpha(float arg0) {
        ((android.view.animation.Transformation) real).setAlpha(arg0);
    }

    public void setTransformationType(int arg0) {
        ((android.view.animation.Transformation) real).setTransformationType(arg0);
    }

    public java.lang.String toShortString() {
        return ((android.view.animation.Transformation) real).toShortString();
    }

    public java.lang.String toString() {
        return ((android.view.animation.Transformation) real).toString();
    }

    public static final int TYPE_ALPHA = android.view.animation.Transformation.TYPE_ALPHA;
    public static final int TYPE_BOTH = android.view.animation.Transformation.TYPE_BOTH;
    public static final int TYPE_IDENTITY = android.view.animation.Transformation.TYPE_IDENTITY;
    public static final int TYPE_MATRIX = android.view.animation.Transformation.TYPE_MATRIX;

}
