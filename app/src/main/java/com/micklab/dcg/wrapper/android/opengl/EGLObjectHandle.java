// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLObjectHandle {
    private final android.opengl.EGLObjectHandle real;

    public EGLObjectHandle(android.opengl.EGLObjectHandle real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLObjectHandle wrap(android.opengl.EGLObjectHandle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLObjectHandle(real);
    }

    public android.opengl.EGLObjectHandle unwrap() {
        return real;
    }

    public int getHandle() {
        return real.getHandle();
    }

    public long getNativeHandle() {
        return real.getNativeHandle();
    }

    public int hashCode() {
        return real.hashCode();
    }

}
