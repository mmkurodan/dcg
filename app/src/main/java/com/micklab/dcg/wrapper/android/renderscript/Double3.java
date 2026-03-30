// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Double3 {
    private final android.renderscript.Double3 real;

    public Double3(android.renderscript.Double3 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Double3 wrap(android.renderscript.Double3 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Double3(real);
    }

    public android.renderscript.Double3 unwrap() {
        return real;
    }

    public Double3() {
        this(new android.renderscript.Double3());
    }

    public Double3(double arg0, double arg1, double arg2) {
        this(new android.renderscript.Double3(arg0, arg1, arg2));
    }


}
