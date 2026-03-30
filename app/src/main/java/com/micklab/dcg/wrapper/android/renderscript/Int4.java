// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Int4 {
    private final android.renderscript.Int4 real;

    public Int4(android.renderscript.Int4 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Int4 wrap(android.renderscript.Int4 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Int4(real);
    }

    public android.renderscript.Int4 unwrap() {
        return real;
    }

    public Int4() {
        this(new android.renderscript.Int4());
    }

    public Int4(int arg0, int arg1, int arg2, int arg3) {
        this(new android.renderscript.Int4(arg0, arg1, arg2, arg3));
    }


}
