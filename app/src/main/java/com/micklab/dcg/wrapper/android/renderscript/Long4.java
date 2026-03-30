// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Long4 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Long4(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Long4 wrap(android.renderscript.Long4 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Long4(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Long4 getReal() {
        return (android.renderscript.Long4) real;
    }

    public android.renderscript.Long4 unwrap() {
        return getReal();
    }

    public Long4() {
        this(new android.renderscript.Long4(), (__DcgwBridgeToken) null);
    }

    public Long4(long arg0, long arg1, long arg2, long arg3) {
        this(new android.renderscript.Long4(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }


}
