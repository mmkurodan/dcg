// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable.shapes;

public final class Shape {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Shape(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.shapes.Shape wrap(android.graphics.drawable.shapes.Shape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.shapes.Shape(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.shapes.Shape getReal() {
        return (android.graphics.drawable.shapes.Shape) real;
    }

    public android.graphics.drawable.shapes.Shape unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.shapes.Shape clone() throws java.lang.CloneNotSupportedException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.shapes.Shape.wrap(((android.graphics.drawable.shapes.Shape) real).clone());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.graphics.drawable.shapes.Shape) real).draw(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.drawable.shapes.Shape) real).equals(arg0);
    }

    public float getHeight() {
        return ((android.graphics.drawable.shapes.Shape) real).getHeight();
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.shapes.Shape) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

    public float getWidth() {
        return ((android.graphics.drawable.shapes.Shape) real).getWidth();
    }

    public boolean hasAlpha() {
        return ((android.graphics.drawable.shapes.Shape) real).hasAlpha();
    }

    public int hashCode() {
        return ((android.graphics.drawable.shapes.Shape) real).hashCode();
    }

    public void resize(float arg0, float arg1) {
        ((android.graphics.drawable.shapes.Shape) real).resize(arg0, arg1);
    }

}
