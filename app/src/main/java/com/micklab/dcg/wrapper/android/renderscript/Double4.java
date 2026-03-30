// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Double4 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Double4(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Double4 wrap(android.renderscript.Double4 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Double4(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Double4 getReal() {
        return (android.renderscript.Double4) real;
    }

    public android.renderscript.Double4 unwrap() {
        return getReal();
    }

    public Double4() {
        this(new android.renderscript.Double4(), (__DcgwBridgeToken) null);
    }

    public Double4(double arg0, double arg1, double arg2, double arg3) {
        this(new android.renderscript.Double4(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }


}
