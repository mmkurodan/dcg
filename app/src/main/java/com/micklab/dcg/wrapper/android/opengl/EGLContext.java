// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLContext {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EGLContext(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLContext wrap(android.opengl.EGLContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLContext(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.EGLContext getReal() {
        return (android.opengl.EGLContext) real;
    }

    public android.opengl.EGLContext unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.opengl.EGLContext) real).equals(arg0);
    }

}
