// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLContext {
    private final android.opengl.EGLContext real;

    public EGLContext(android.opengl.EGLContext real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLContext wrap(android.opengl.EGLContext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLContext(real);
    }

    public android.opengl.EGLContext unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

}
