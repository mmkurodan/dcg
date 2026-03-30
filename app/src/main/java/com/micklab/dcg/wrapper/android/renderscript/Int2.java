// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Int2 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Int2(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Int2 wrap(android.renderscript.Int2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Int2(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Int2 getReal() {
        return (android.renderscript.Int2) real;
    }

    public android.renderscript.Int2 unwrap() {
        return getReal();
    }

    public Int2() {
        this(new android.renderscript.Int2(), (__DcgwBridgeToken) null);
    }

    public Int2(int arg0, int arg1) {
        this(new android.renderscript.Int2(arg0, arg1), (__DcgwBridgeToken) null);
    }


}
