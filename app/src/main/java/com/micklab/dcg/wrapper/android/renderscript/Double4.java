// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Double4 {
    private final android.renderscript.Double4 real;

    public Double4(android.renderscript.Double4 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Double4 wrap(android.renderscript.Double4 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Double4(real);
    }

    public android.renderscript.Double4 unwrap() {
        return real;
    }

    public Double4() {
        this(new android.renderscript.Double4());
    }

    public Double4(double arg0, double arg1, double arg2, double arg3) {
        this(new android.renderscript.Double4(arg0, arg1, arg2, arg3));
    }


}
