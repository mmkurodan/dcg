// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Byte4 {
    private final android.renderscript.Byte4 real;

    public Byte4(android.renderscript.Byte4 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Byte4 wrap(android.renderscript.Byte4 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Byte4(real);
    }

    public android.renderscript.Byte4 unwrap() {
        return real;
    }

    public Byte4() {
        this(new android.renderscript.Byte4());
    }

    public Byte4(byte arg0, byte arg1, byte arg2, byte arg3) {
        this(new android.renderscript.Byte4(arg0, arg1, arg2, arg3));
    }


}
