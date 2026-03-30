// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class RSInvalidStateException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RSInvalidStateException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.RSInvalidStateException wrap(android.renderscript.RSInvalidStateException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.RSInvalidStateException(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.RSInvalidStateException getReal() {
        return (android.renderscript.RSInvalidStateException) real;
    }

    public android.renderscript.RSInvalidStateException unwrap() {
        return getReal();
    }

    public RSInvalidStateException(java.lang.String arg0) {
        this(new android.renderscript.RSInvalidStateException(arg0), (__DcgwBridgeToken) null);
    }

}
