// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable.shapes;

public final class OvalShape {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OvalShape(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.shapes.OvalShape wrap(android.graphics.drawable.shapes.OvalShape real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.shapes.OvalShape(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.shapes.OvalShape getReal() {
        return (android.graphics.drawable.shapes.OvalShape) real;
    }

    public android.graphics.drawable.shapes.OvalShape unwrap() {
        return getReal();
    }

    public OvalShape() {
        this(new android.graphics.drawable.shapes.OvalShape(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.shapes.OvalShape clone() throws java.lang.CloneNotSupportedException {
        return com.micklab.dcg.wrapper.android.graphics.drawable.shapes.OvalShape.wrap(((android.graphics.drawable.shapes.OvalShape) real).clone());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0, com.micklab.dcg.wrapper.android.graphics.Paint arg1) {
        ((android.graphics.drawable.shapes.OvalShape) real).draw(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.shapes.OvalShape) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

}
