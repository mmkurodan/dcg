// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Long2 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Long2(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Long2 wrap(android.renderscript.Long2 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Long2(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Long2 getReal() {
        return (android.renderscript.Long2) real;
    }

    public android.renderscript.Long2 unwrap() {
        return getReal();
    }

    public Long2() {
        this(new android.renderscript.Long2(), (__DcgwBridgeToken) null);
    }

    public Long2(long arg0, long arg1) {
        this(new android.renderscript.Long2(arg0, arg1), (__DcgwBridgeToken) null);
    }


}
