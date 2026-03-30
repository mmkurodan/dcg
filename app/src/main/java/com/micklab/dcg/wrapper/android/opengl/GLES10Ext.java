// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLES10Ext {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GLES10Ext(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLES10Ext wrap(android.opengl.GLES10Ext real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLES10Ext(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.GLES10Ext getReal() {
        return (android.opengl.GLES10Ext) real;
    }

    public android.opengl.GLES10Ext unwrap() {
        return getReal();
    }

    public GLES10Ext() {
        this(new android.opengl.GLES10Ext(), (__DcgwBridgeToken) null);
    }

    public static int glQueryMatrixxOES(java.nio.IntBuffer arg0, java.nio.IntBuffer arg1) {
        return android.opengl.GLES10Ext.glQueryMatrixxOES(arg0, arg1);
    }

    public static int glQueryMatrixxOES(int[] arg0, int arg1, int[] arg2, int arg3) {
        return android.opengl.GLES10Ext.glQueryMatrixxOES(arg0, arg1, arg2, arg3);
    }

}
