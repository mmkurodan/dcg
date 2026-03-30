// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicHistogram {
    private final android.renderscript.ScriptIntrinsicHistogram real;

    public ScriptIntrinsicHistogram(android.renderscript.ScriptIntrinsicHistogram real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicHistogram wrap(android.renderscript.ScriptIntrinsicHistogram real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicHistogram(real);
    }

    public android.renderscript.ScriptIntrinsicHistogram unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicHistogram create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicHistogram.wrap(android.renderscript.ScriptIntrinsicHistogram.create(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        real.forEach(arg0 == null ? null : arg0.unwrap());
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions arg1) {
        real.forEach(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void forEach_Dot(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        real.forEach_Dot(arg0 == null ? null : arg0.unwrap());
    }

    public void forEach_Dot(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions arg1) {
        real.forEach_Dot(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.FieldID getFieldID_Input() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.FieldID.wrap(real.getFieldID_Input());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.KernelID getKernelID_Separate() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.KernelID.wrap(real.getKernelID_Separate());
    }

    public void setDotCoefficients(float arg0, float arg1, float arg2, float arg3) {
        real.setDotCoefficients(arg0, arg1, arg2, arg3);
    }

    public void setOutput(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        real.setOutput(arg0 == null ? null : arg0.unwrap());
    }

}
