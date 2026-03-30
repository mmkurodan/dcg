// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable.shapes;

public final class ArcShape {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ArcShape(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.shapes.ArcShape wrap(android.graphics.drawable.shapes.ArcShape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.shapes.ArcShape(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.shapes.ArcShape getReal() {
        return (android.graphics.drawable.shapes.ArcShape) real;
    }

    public android.graphics.drawable.shapes.ArcShape unwrap() {
        return getReal();
    }

    public ArcShape(float arg0, float arg1) {
        this(new android.graphics.drawable.shapes.ArcShape(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.shapes.ArcShape clone() throws java.lang.CloneNotSupportedException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.shapes.ArcShape.wrap(((android.graphics.drawable.shapes.ArcShape) real).clone());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.graphics.drawable.shapes.ArcShape) real).draw(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.drawable.shapes.ArcShape) real).equals(arg0);
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.shapes.ArcShape) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

    public float getStartAngle() {
        return ((android.graphics.drawable.shapes.ArcShape) real).getStartAngle();
    }

    public float getSweepAngle() {
        return ((android.graphics.drawable.shapes.ArcShape) real).getSweepAngle();
    }

    public int hashCode() {
        return ((android.graphics.drawable.shapes.ArcShape) real).hashCode();
    }

}
