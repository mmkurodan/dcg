// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Double3 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Double3(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Double3 wrap(android.renderscript.Double3 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Double3(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Double3 getReal() {
        return (android.renderscript.Double3) real;
    }

    public android.renderscript.Double3 unwrap() {
        return getReal();
    }

    public Double3() {
        this(new android.renderscript.Double3(), (__DcgwBridgeToken) null);
    }

    public Double3(double arg0, double arg1, double arg2) {
        this(new android.renderscript.Double3(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }


}
