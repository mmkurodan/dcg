// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Short2 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Short2(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Short2 wrap(android.renderscript.Short2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Short2(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Short2 getReal() {
        return (android.renderscript.Short2) real;
    }

    public android.renderscript.Short2 unwrap() {
        return getReal();
    }

    public Short2() {
        this(new android.renderscript.Short2(), (__DcgwBridgeToken) null);
    }

    public Short2(short arg0, short arg1) {
        this(new android.renderscript.Short2(arg0, arg1), (__DcgwBridgeToken) null);
    }


}
