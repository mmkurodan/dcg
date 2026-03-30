// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable.shapes;

public final class ArcShape {
    private final android.graphics.drawable.shapes.ArcShape real;

    public ArcShape(android.graphics.drawable.shapes.ArcShape real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.shapes.ArcShape wrap(android.graphics.drawable.shapes.ArcShape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.shapes.ArcShape(real);
    }

    public android.graphics.drawable.shapes.ArcShape unwrap() {
        return real;
    }

    public ArcShape(float arg0, float arg1) {
        this(new android.graphics.drawable.shapes.ArcShape(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.shapes.ArcShape clone() throws java.lang.CloneNotSupportedException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.shapes.ArcShape.wrap(real.clone());
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

    public float getStartAngle() {
        return real.getStartAngle();
    }

    public float getSweepAngle() {
        return real.getSweepAngle();
    }

    public int hashCode() {
        return real.hashCode();
    }

}
