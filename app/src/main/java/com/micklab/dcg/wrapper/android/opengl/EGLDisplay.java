// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLDisplay {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EGLDisplay(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLDisplay wrap(android.opengl.EGLDisplay real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLDisplay(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.EGLDisplay getReal() {
        return (android.opengl.EGLDisplay) real;
    }

    public android.opengl.EGLDisplay unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.opengl.EGLDisplay) real).equals(arg0);
    }

}
