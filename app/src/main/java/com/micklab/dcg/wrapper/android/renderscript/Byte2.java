// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Byte2 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Byte2(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Byte2 wrap(android.renderscript.Byte2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Byte2(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Byte2 getReal() {
        return (android.renderscript.Byte2) real;
    }

    public android.renderscript.Byte2 unwrap() {
        return getReal();
    }

    public Byte2() {
        this(new android.renderscript.Byte2(), (__DcgwBridgeToken) null);
    }

    public Byte2(byte arg0, byte arg1) {
        this(new android.renderscript.Byte2(arg0, arg1), (__DcgwBridgeToken) null);
    }


}
