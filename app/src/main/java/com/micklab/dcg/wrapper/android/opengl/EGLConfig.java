// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLConfig {
    private final android.opengl.EGLConfig real;

    public EGLConfig(android.opengl.EGLConfig real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLConfig wrap(android.opengl.EGLConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLConfig(real);
    }

    public android.opengl.EGLConfig unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

}
