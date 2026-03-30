// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable.shapes;

public final class RectShape {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RectShape(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RectShape wrap(android.graphics.drawable.shapes.RectShape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RectShape(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.shapes.RectShape getReal() {
        return (android.graphics.drawable.shapes.RectShape) real;
    }

    public android.graphics.drawable.shapes.RectShape unwrap() {
        return getReal();
    }

    public RectShape() {
        this(new android.graphics.drawable.shapes.RectShape(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RectShape clone() throws java.lang.CloneNotSupportedException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RectShape.wrap(((android.graphics.drawable.shapes.RectShape) real).clone());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.graphics.drawable.shapes.RectShape) real).draw(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.drawable.shapes.RectShape) real).equals(arg0);
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.shapes.RectShape) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

    public int hashCode() {
        return ((android.graphics.drawable.shapes.RectShape) real).hashCode();
    }

}
