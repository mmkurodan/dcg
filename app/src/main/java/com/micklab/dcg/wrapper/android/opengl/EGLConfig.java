// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EGLConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLConfig wrap(android.opengl.EGLConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLConfig(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.EGLConfig getReal() {
        return (android.opengl.EGLConfig) real;
    }

    public android.opengl.EGLConfig unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.opengl.EGLConfig) real).equals(arg0);
    }

}
