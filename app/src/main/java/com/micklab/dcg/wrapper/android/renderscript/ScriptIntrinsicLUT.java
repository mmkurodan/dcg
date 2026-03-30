// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicLUT {
    private final android.renderscript.ScriptIntrinsicLUT real;

    public ScriptIntrinsicLUT(android.renderscript.ScriptIntrinsicLUT real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicLUT wrap(android.renderscript.ScriptIntrinsicLUT real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicLUT(real);
    }

    public android.renderscript.ScriptIntrinsicLUT unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicLUT create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicLUT.wrap(android.renderscript.ScriptIntrinsicLUT.create(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void destroy() {
        real.destroy();
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

    public void setAlpha(int arg0, int arg1) {
        real.setAlpha(arg0, arg1);
    }

    public void setBlue(int arg0, int arg1) {
        real.setBlue(arg0, arg1);
    }

    public void setGreen(int arg0, int arg1) {
        real.setGreen(arg0, arg1);
    }

    public void setRed(int arg0, int arg1) {
        real.setRed(arg0, arg1);
    }

}
