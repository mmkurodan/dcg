// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Double2 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Double2(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Double2 wrap(android.renderscript.Double2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Double2(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Double2 getReal() {
        return (android.renderscript.Double2) real;
    }

    public android.renderscript.Double2 unwrap() {
        return getReal();
    }

    public Double2() {
        this(new android.renderscript.Double2(), (__DcgwBridgeToken) null);
    }

    public Double2(double arg0, double arg1) {
        this(new android.renderscript.Double2(arg0, arg1), (__DcgwBridgeToken) null);
    }


}
