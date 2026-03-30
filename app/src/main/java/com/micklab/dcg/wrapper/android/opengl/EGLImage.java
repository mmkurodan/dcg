// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLImage {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EGLImage(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLImage wrap(android.opengl.EGLImage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLImage(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.EGLImage getReal() {
        return (android.opengl.EGLImage) real;
    }

    public android.opengl.EGLImage unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.opengl.EGLImage) real).equals(arg0);
    }

}
