// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable.shapes;

public final class PathShape {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PathShape(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.shapes.PathShape wrap(android.graphics.drawable.shapes.PathShape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.shapes.PathShape(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.shapes.PathShape getReal() {
        return (android.graphics.drawable.shapes.PathShape) real;
    }

    public android.graphics.drawable.shapes.PathShape unwrap() {
        return getReal();
    }

    public PathShape(com.micklab.dcg.wrapper.android.graphics.Path arg0, float arg1, float arg2) {
        this(new android.graphics.drawable.shapes.PathShape(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.shapes.PathShape clone() throws java.lang.CloneNotSupportedException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.shapes.PathShape.wrap(((android.graphics.drawable.shapes.PathShape) real).clone());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.graphics.drawable.shapes.PathShape) real).draw(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.drawable.shapes.PathShape) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.graphics.drawable.shapes.PathShape) real).hashCode();
    }

}
