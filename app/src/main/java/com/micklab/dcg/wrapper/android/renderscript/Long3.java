// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class Long3 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Long3(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.Long3 wrap(android.renderscript.Long3 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.Long3(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.Long3 getReal() {
        return (android.renderscript.Long3) real;
    }

    public android.renderscript.Long3 unwrap() {
        return getReal();
    }

    public Long3() {
        this(new android.renderscript.Long3(), (__DcgwBridgeToken) null);
    }

    public Long3(long arg0, long arg1, long arg2) {
        this(new android.renderscript.Long3(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }


}
