// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Float3 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Float3(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Float3 wrap(android.renderscript.Float3 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Float3(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Float3 getReal() {
        return (android.renderscript.Float3) real;
    }

    public android.renderscript.Float3 unwrap() {
        return getReal();
    }

    public Float3() {
        this(new android.renderscript.Float3(), (__DcgwBridgeToken) null);
    }

    public Float3(float arg0, float arg1, float arg2) {
        this(new android.renderscript.Float3(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }


}
