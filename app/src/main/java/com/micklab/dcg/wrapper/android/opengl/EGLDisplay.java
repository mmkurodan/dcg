// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLDisplay {
    private final android.opengl.EGLDisplay real;

    public EGLDisplay(android.opengl.EGLDisplay real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLDisplay wrap(android.opengl.EGLDisplay real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLDisplay(real);
    }

    public android.opengl.EGLDisplay unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

}
