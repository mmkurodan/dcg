// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable.shapes;

public final class Shape {
    private final android.graphics.drawable.shapes.Shape real;

    public Shape(android.graphics.drawable.shapes.Shape real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.shapes.Shape wrap(android.graphics.drawable.shapes.Shape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.shapes.Shape(real);
    }

    public android.graphics.drawable.shapes.Shape unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.shapes.Shape clone() throws java.lang.CloneNotSupportedException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.shapes.Shape.wrap(real.clone());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        real.draw(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public float getHeight() {
        return real.getHeight();
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        real.getOutline(arg0 == null ? null : arg0.unwrap());
    }

    public float getWidth() {
        return real.getWidth();
    }

    public boolean hasAlpha() {
        return real.hasAlpha();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void resize(float arg0, float arg1) {
        real.resize(arg0, arg1);
    }

}
