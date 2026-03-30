// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicColorMatrix {
    private final android.renderscript.ScriptIntrinsicColorMatrix real;

    public ScriptIntrinsicColorMatrix(android.renderscript.ScriptIntrinsicColorMatrix real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicColorMatrix wrap(android.renderscript.ScriptIntrinsicColorMatrix real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicColorMatrix(real);
    }

    public android.renderscript.ScriptIntrinsicColorMatrix unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicColorMatrix create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicColorMatrix.wrap(android.renderscript.ScriptIntrinsicColorMatrix.create(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicColorMatrix create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicColorMatrix.wrap(android.renderscript.ScriptIntrinsicColorMatrix.create(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1) {
        real.forEach(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions arg2) {
        real.forEach(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.KernelID getKernelID() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.KernelID.wrap(real.getKernelID());
    }

    public void setAdd(com.micklab.dcg.wrapper.android.renderscript.Float4 arg0) {
        real.setAdd(arg0 == null ? null : arg0.unwrap());
    }

    public void setAdd(float arg0, float arg1, float arg2, float arg3) {
        real.setAdd(arg0, arg1, arg2, arg3);
    }

    public void setColorMatrix(com.micklab.dcg.wrapper.android.renderscript.Matrix4f arg0) {
        real.setColorMatrix(arg0 == null ? null : arg0.unwrap());
    }

    public void setColorMatrix(com.micklab.dcg.wrapper.android.renderscript.Matrix3f arg0) {
        real.setColorMatrix(arg0 == null ? null : arg0.unwrap());
    }

    public void setGreyscale() {
        real.setGreyscale();
    }

    public void setRGBtoYUV() {
        real.setRGBtoYUV();
    }

    public void setYUVtoRGB() {
        real.setYUVtoRGB();
    }

}
