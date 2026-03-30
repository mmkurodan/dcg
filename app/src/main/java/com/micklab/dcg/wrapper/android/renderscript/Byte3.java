// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Byte3 {
    private final android.renderscript.Byte3 real;

    public Byte3(android.renderscript.Byte3 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Byte3 wrap(android.renderscript.Byte3 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Byte3(real);
    }

    public android.renderscript.Byte3 unwrap() {
        return real;
    }

    public Byte3() {
        this(new android.renderscript.Byte3());
    }

    public Byte3(byte arg0, byte arg1, byte arg2) {
        this(new android.renderscript.Byte3(arg0, arg1, arg2));
    }


}
