// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLSurface {
    private final android.opengl.EGLSurface real;

    public EGLSurface(android.opengl.EGLSurface real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLSurface wrap(android.opengl.EGLSurface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLSurface(real);
    }

    public android.opengl.EGLSurface unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

}
