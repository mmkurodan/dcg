// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Int3 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Int3(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Int3 wrap(android.renderscript.Int3 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Int3(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Int3 getReal() {
        return (android.renderscript.Int3) real;
    }

    public android.renderscript.Int3 unwrap() {
        return getReal();
    }

    public Int3() {
        this(new android.renderscript.Int3(), (__DcgwBridgeToken) null);
    }

    public Int3(int arg0, int arg1, int arg2) {
        this(new android.renderscript.Int3(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }


}
