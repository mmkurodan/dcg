// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Short3 {
    private final android.renderscript.Short3 real;

    public Short3(android.renderscript.Short3 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Short3 wrap(android.renderscript.Short3 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Short3(real);
    }

    public android.renderscript.Short3 unwrap() {
        return real;
    }

    public Short3() {
        this(new android.renderscript.Short3());
    }

    public Short3(short arg0, short arg1, short arg2) {
        this(new android.renderscript.Short3(arg0, arg1, arg2));
    }


}
