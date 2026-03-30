// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicColorMatrix {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScriptIntrinsicColorMatrix(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicColorMatrix wrap(android.renderscript.ScriptIntrinsicColorMatrix real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicColorMatrix(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.ScriptIntrinsicColorMatrix getReal() {
        return (android.renderscript.ScriptIntrinsicColorMatrix) real;
    }

    public android.renderscript.ScriptIntrinsicColorMatrix unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicColorMatrix create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicColorMatrix.wrap(android.renderscript.ScriptIntrinsicColorMatrix.create(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicColorMatrix create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicColorMatrix.wrap(android.renderscript.ScriptIntrinsicColorMatrix.create(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1) {
        ((android.renderscript.ScriptIntrinsicColorMatrix) real).forEach(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions arg2) {
        ((android.renderscript.ScriptIntrinsicColorMatrix) real).forEach(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.KernelID getKernelID() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.KernelID.wrap(((android.renderscript.ScriptIntrinsicColorMatrix) real).getKernelID());
    }

    public void setAdd(com.micklab.dcg.wrapper.android.renderscript.Float4 arg0) {
        ((android.renderscript.ScriptIntrinsicColorMatrix) real).setAdd(arg0 == null ? null : arg0.getReal());
    }

    public void setAdd(float arg0, float arg1, float arg2, float arg3) {
        ((android.renderscript.ScriptIntrinsicColorMatrix) real).setAdd(arg0, arg1, arg2, arg3);
    }

    public void setColorMatrix(com.micklab.dcg.wrapper.android.renderscript.Matrix4f arg0) {
        ((android.renderscript.ScriptIntrinsicColorMatrix) real).setColorMatrix(arg0 == null ? null : arg0.getReal());
    }

    public void setColorMatrix(com.micklab.dcg.wrapper.android.renderscript.Matrix3f arg0) {
        ((android.renderscript.ScriptIntrinsicColorMatrix) real).setColorMatrix(arg0 == null ? null : arg0.getReal());
    }

    public void setGreyscale() {
        ((android.renderscript.ScriptIntrinsicColorMatrix) real).setGreyscale();
    }

    public void setRGBtoYUV() {
        ((android.renderscript.ScriptIntrinsicColorMatrix) real).setRGBtoYUV();
    }

    public void setYUVtoRGB() {
        ((android.renderscript.ScriptIntrinsicColorMatrix) real).setYUVtoRGB();
    }

}
