// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable.shapes;

public final class RoundRectShape {
    private final android.graphics.drawable.shapes.RoundRectShape real;

    public RoundRectShape(android.graphics.drawable.shapes.RoundRectShape real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RoundRectShape wrap(android.graphics.drawable.shapes.RoundRectShape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RoundRectShape(real);
    }

    public android.graphics.drawable.shapes.RoundRectShape unwrap() {
        return real;
    }

    public RoundRectShape(float[] arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1, float[] arg2) {
        this(new android.graphics.drawable.shapes.RoundRectShape(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RoundRectShape clone() throws java.lang.CloneNotSupportedException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RoundRectShape.wrap(real.clone());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        real.draw(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        real.getOutline(arg0 == null ? null : arg0.unwrap());
    }

    public int hashCode() {
        return real.hashCode();
    }

}
