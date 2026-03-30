// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable.shapes;

public final class OvalShape {
    private final android.graphics.drawable.shapes.OvalShape real;

    public OvalShape(android.graphics.drawable.shapes.OvalShape real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.shapes.OvalShape wrap(android.graphics.drawable.shapes.OvalShape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.shapes.OvalShape(real);
    }

    public android.graphics.drawable.shapes.OvalShape unwrap() {
        return real;
    }

    public OvalShape() {
        this(new android.graphics.drawable.shapes.OvalShape());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.shapes.OvalShape clone() throws java.lang.CloneNotSupportedException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.shapes.OvalShape.wrap(real.clone());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        real.draw(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        real.getOutline(arg0 == null ? null : arg0.unwrap());
    }

}
