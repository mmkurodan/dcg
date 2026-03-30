// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLException {
    private final android.opengl.GLException real;

    public GLException(android.opengl.GLException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLException wrap(android.opengl.GLException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLException(real);
    }

    public android.opengl.GLException unwrap() {
        return real;
    }

    public GLException(int arg0) {
        this(new android.opengl.GLException(arg0));
    }

    public GLException(int arg0, java.lang.String arg1) {
        this(new android.opengl.GLException(arg0, arg1));
    }

}
