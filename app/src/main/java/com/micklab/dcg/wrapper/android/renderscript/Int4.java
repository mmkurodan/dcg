// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Int4 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Int4(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Int4 wrap(android.renderscript.Int4 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Int4(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Int4 getReal() {
        return (android.renderscript.Int4) real;
    }

    public android.renderscript.Int4 unwrap() {
        return getReal();
    }

    public Int4() {
        this(new android.renderscript.Int4(), (__DcgwBridgeToken) null);
    }

    public Int4(int arg0, int arg1, int arg2, int arg3) {
        this(new android.renderscript.Int4(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }


}
