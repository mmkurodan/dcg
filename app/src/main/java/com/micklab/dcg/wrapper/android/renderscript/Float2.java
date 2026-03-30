// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Float2 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Float2(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Float2 wrap(android.renderscript.Float2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Float2(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Float2 getReal() {
        return (android.renderscript.Float2) real;
    }

    public android.renderscript.Float2 unwrap() {
        return getReal();
    }

    public Float2() {
        this(new android.renderscript.Float2(), (__DcgwBridgeToken) null);
    }

    public Float2(float arg0, float arg1) {
        this(new android.renderscript.Float2(arg0, arg1), (__DcgwBridgeToken) null);
    }


}
