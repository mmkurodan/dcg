// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Float3 {
    private final android.renderscript.Float3 real;

    public Float3(android.renderscript.Float3 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Float3 wrap(android.renderscript.Float3 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Float3(real);
    }

    public android.renderscript.Float3 unwrap() {
        return real;
    }

    public Float3() {
        this(new android.renderscript.Float3());
    }

    public Float3(float arg0, float arg1, float arg2) {
        this(new android.renderscript.Float3(arg0, arg1, arg2));
    }


}
