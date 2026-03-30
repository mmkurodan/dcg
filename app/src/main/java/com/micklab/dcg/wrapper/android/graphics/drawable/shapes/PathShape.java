// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable.shapes;

public final class PathShape {
    private final android.graphics.drawable.shapes.PathShape real;

    public PathShape(android.graphics.drawable.shapes.PathShape real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.shapes.PathShape wrap(android.graphics.drawable.shapes.PathShape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.shapes.PathShape(real);
    }

    public android.graphics.drawable.shapes.PathShape unwrap() {
        return real;
    }

    public PathShape(com.micklab.dcg.wrapper.android.graphics.Path arg0, float arg1, float arg2) {
        this(new android.graphics.drawable.shapes.PathShape(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.shapes.PathShape clone() throws java.lang.CloneNotSupportedException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.shapes.PathShape.wrap(real.clone());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        real.draw(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

}
