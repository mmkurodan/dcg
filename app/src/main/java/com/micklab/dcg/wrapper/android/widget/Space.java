// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Space {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Space(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Space wrap(android.widget.Space real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Space(real, (__DcgwBridgeToken) null);
    }

    public android.widget.Space getReal() {
        return (android.widget.Space) real;
    }

    public android.widget.Space unwrap() {
        return getReal();
    }

    public Space(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.Space(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Space(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.Space(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public Space(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.Space(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public Space(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.Space(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.widget.Space) real).draw(arg0 == null ? null : arg0.getReal());
    }

}
