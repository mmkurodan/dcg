// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLSurface {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EGLSurface(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLSurface wrap(android.opengl.EGLSurface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLSurface(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.EGLSurface getReal() {
        return (android.opengl.EGLSurface) real;
    }

    public android.opengl.EGLSurface unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.opengl.EGLSurface) real).equals(arg0);
    }

}
