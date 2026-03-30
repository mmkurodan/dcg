// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Short3 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Short3(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Short3 wrap(android.renderscript.Short3 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Short3(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Short3 getReal() {
        return (android.renderscript.Short3) real;
    }

    public android.renderscript.Short3 unwrap() {
        return getReal();
    }

    public Short3() {
        this(new android.renderscript.Short3(), (__DcgwBridgeToken) null);
    }

    public Short3(short arg0, short arg1, short arg2) {
        this(new android.renderscript.Short3(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }


}
