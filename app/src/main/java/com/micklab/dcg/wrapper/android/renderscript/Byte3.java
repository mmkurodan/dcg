// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Byte3 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Byte3(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Byte3 wrap(android.renderscript.Byte3 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Byte3(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Byte3 getReal() {
        return (android.renderscript.Byte3) real;
    }

    public android.renderscript.Byte3 unwrap() {
        return getReal();
    }

    public Byte3() {
        this(new android.renderscript.Byte3(), (__DcgwBridgeToken) null);
    }

    public Byte3(byte arg0, byte arg1, byte arg2) {
        this(new android.renderscript.Byte3(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }


}
