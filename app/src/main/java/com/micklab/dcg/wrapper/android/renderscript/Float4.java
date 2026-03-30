// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Float4 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Float4(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Float4 wrap(android.renderscript.Float4 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Float4(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Float4 getReal() {
        return (android.renderscript.Float4) real;
    }

    public android.renderscript.Float4 unwrap() {
        return getReal();
    }

    public Float4() {
        this(new android.renderscript.Float4(), (__DcgwBridgeToken) null);
    }

    public Float4(float arg0, float arg1, float arg2, float arg3) {
        this(new android.renderscript.Float4(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }


}
