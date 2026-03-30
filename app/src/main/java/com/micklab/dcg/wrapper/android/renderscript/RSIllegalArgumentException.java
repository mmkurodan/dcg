// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class RSIllegalArgumentException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RSIllegalArgumentException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RSIllegalArgumentException wrap(android.renderscript.RSIllegalArgumentException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RSIllegalArgumentException(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.RSIllegalArgumentException getReal() {
        return (android.renderscript.RSIllegalArgumentException) real;
    }

    public android.renderscript.RSIllegalArgumentException unwrap() {
        return getReal();
    }

    public RSIllegalArgumentException(java.lang.String arg0) {
        this(new android.renderscript.RSIllegalArgumentException(arg0), (__DcgwBridgeToken) null);
    }

}
