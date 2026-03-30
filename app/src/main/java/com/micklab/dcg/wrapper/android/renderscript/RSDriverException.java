// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class RSDriverException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RSDriverException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RSDriverException wrap(android.renderscript.RSDriverException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RSDriverException(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.RSDriverException getReal() {
        return (android.renderscript.RSDriverException) real;
    }

    public android.renderscript.RSDriverException unwrap() {
        return getReal();
    }

    public RSDriverException(java.lang.String arg0) {
        this(new android.renderscript.RSDriverException(arg0), (__DcgwBridgeToken) null);
    }

}
