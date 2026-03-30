// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class RSRuntimeException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RSRuntimeException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RSRuntimeException wrap(android.renderscript.RSRuntimeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RSRuntimeException(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.RSRuntimeException getReal() {
        return (android.renderscript.RSRuntimeException) real;
    }

    public android.renderscript.RSRuntimeException unwrap() {
        return getReal();
    }

    public RSRuntimeException(java.lang.String arg0) {
        this(new android.renderscript.RSRuntimeException(arg0), (__DcgwBridgeToken) null);
    }

}
