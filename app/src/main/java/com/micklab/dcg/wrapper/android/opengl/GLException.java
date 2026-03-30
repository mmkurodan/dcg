// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GLException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLException wrap(android.opengl.GLException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLException(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.GLException getReal() {
        return (android.opengl.GLException) real;
    }

    public android.opengl.GLException unwrap() {
        return getReal();
    }

    public GLException(int arg0) {
        this(new android.opengl.GLException(arg0), (__DcgwBridgeToken) null);
    }

    public GLException(int arg0, java.lang.String arg1) {
        this(new android.opengl.GLException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
