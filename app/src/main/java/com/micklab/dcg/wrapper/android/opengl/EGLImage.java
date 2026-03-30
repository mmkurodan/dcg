// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLImage {
    private final android.opengl.EGLImage real;

    public EGLImage(android.opengl.EGLImage real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLImage wrap(android.opengl.EGLImage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLImage(real);
    }

    public android.opengl.EGLImage unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

}
