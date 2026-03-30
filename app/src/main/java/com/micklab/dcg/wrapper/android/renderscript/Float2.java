// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Float2 {
    private final android.renderscript.Float2 real;

    public Float2(android.renderscript.Float2 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Float2 wrap(android.renderscript.Float2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Float2(real);
    }

    public android.renderscript.Float2 unwrap() {
        return real;
    }

    public Float2() {
        this(new android.renderscript.Float2());
    }

    public Float2(float arg0, float arg1) {
        this(new android.renderscript.Float2(arg0, arg1));
    }


}
