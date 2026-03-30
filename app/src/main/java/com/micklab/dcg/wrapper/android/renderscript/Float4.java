// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Float4 {
    private final android.renderscript.Float4 real;

    public Float4(android.renderscript.Float4 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Float4 wrap(android.renderscript.Float4 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Float4(real);
    }

    public android.renderscript.Float4 unwrap() {
        return real;
    }

    public Float4() {
        this(new android.renderscript.Float4());
    }

    public Float4(float arg0, float arg1, float arg2, float arg3) {
        this(new android.renderscript.Float4(arg0, arg1, arg2, arg3));
    }


}
