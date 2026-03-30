// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Byte4 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Byte4(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Byte4 wrap(android.renderscript.Byte4 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Byte4(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Byte4 getReal() {
        return (android.renderscript.Byte4) real;
    }

    public android.renderscript.Byte4 unwrap() {
        return getReal();
    }

    public Byte4() {
        this(new android.renderscript.Byte4(), (__DcgwBridgeToken) null);
    }

    public Byte4(byte arg0, byte arg1, byte arg2, byte arg3) {
        this(new android.renderscript.Byte4(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }


}
