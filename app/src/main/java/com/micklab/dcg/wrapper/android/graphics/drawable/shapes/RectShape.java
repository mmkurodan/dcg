// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable.shapes;

public final class RectShape {
    private final android.graphics.drawable.shapes.RectShape real;

    public RectShape(android.graphics.drawable.shapes.RectShape real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RectShape wrap(android.graphics.drawable.shapes.RectShape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RectShape(real);
    }

    public android.graphics.drawable.shapes.RectShape unwrap() {
        return real;
    }

    public RectShape() {
        this(new android.graphics.drawable.shapes.RectShape());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RectShape clone() throws java.lang.CloneNotSupportedException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.shapes.RectShape.wrap(real.clone());
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
