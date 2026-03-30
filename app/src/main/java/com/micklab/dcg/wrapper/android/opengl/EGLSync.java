// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLSync {
    private final android.opengl.EGLSync real;

    public EGLSync(android.opengl.EGLSync real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLSync wrap(android.opengl.EGLSync real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLSync(real);
    }

    public android.opengl.EGLSync unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

}
