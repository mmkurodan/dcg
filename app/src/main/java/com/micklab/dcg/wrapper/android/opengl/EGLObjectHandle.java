// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLObjectHandle {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EGLObjectHandle(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLObjectHandle wrap(android.opengl.EGLObjectHandle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLObjectHandle(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.EGLObjectHandle getReal() {
        return (android.opengl.EGLObjectHandle) real;
    }

    public android.opengl.EGLObjectHandle unwrap() {
        return getReal();
    }

    public int getHandle() {
        return ((android.opengl.EGLObjectHandle) real).getHandle();
    }

    public long getNativeHandle() {
        return ((android.opengl.EGLObjectHandle) real).getNativeHandle();
    }

    public int hashCode() {
        return ((android.opengl.EGLObjectHandle) real).hashCode();
    }

}
