// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable.shapes;

public final class RoundRectShape {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RoundRectShape(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RoundRectShape wrap(android.graphics.drawable.shapes.RoundRectShape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RoundRectShape(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.shapes.RoundRectShape getReal() {
        return (android.graphics.drawable.shapes.RoundRectShape) real;
    }

    public android.graphics.drawable.shapes.RoundRectShape unwrap() {
        return getReal();
    }

    public RoundRectShape(float[] arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1, float[] arg2) {
        this(new android.graphics.drawable.shapes.RoundRectShape(arg0, arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RoundRectShape clone() throws java.lang.CloneNotSupportedException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RoundRectShape.wrap(((android.graphics.drawable.shapes.RoundRectShape) real).clone());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.graphics.drawable.shapes.RoundRectShape) real).draw(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.drawable.shapes.RoundRectShape) real).equals(arg0);
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.shapes.RoundRectShape) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

    public int hashCode() {
        return ((android.graphics.drawable.shapes.RoundRectShape) real).hashCode();
    }

}
