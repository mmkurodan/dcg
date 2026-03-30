// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLSync {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EGLSync(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLSync wrap(android.opengl.EGLSync real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLSync(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.EGLSync getReal() {
        return (android.opengl.EGLSync) real;
    }

    public android.opengl.EGLSync unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.opengl.EGLSync) real).equals(arg0);
    }

}
