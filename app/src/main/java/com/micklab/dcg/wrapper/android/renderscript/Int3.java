// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Int3 {
    private final android.renderscript.Int3 real;

    public Int3(android.renderscript.Int3 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Int3 wrap(android.renderscript.Int3 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Int3(real);
    }

    public android.renderscript.Int3 unwrap() {
        return real;
    }

    public Int3() {
        this(new android.renderscript.Int3());
    }

    public Int3(int arg0, int arg1, int arg2) {
        this(new android.renderscript.Int3(arg0, arg1, arg2));
    }


}
