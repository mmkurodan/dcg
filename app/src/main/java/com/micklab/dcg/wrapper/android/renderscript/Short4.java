// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Short4 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Short4(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Short4 wrap(android.renderscript.Short4 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Short4(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Short4 getReal() {
        return (android.renderscript.Short4) real;
    }

    public android.renderscript.Short4 unwrap() {
        return getReal();
    }

    public Short4() {
        this(new android.renderscript.Short4(), (__DcgwBridgeToken) null);
    }

    public Short4(short arg0, short arg1, short arg2, short arg3) {
        this(new android.renderscript.Short4(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }


}
