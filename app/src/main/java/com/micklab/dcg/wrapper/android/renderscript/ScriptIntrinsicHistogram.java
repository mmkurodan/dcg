// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicHistogram {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScriptIntrinsicHistogram(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicHistogram wrap(android.renderscript.ScriptIntrinsicHistogram real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicHistogram(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.ScriptIntrinsicHistogram getReal() {
        return (android.renderscript.ScriptIntrinsicHistogram) real;
    }

    public android.renderscript.ScriptIntrinsicHistogram unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicHistogram create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicHistogram.wrap(android.renderscript.ScriptIntrinsicHistogram.create(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        ((android.renderscript.ScriptIntrinsicHistogram) real).forEach(arg0 == null ? null : arg0.getReal());
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions arg1) {
        ((android.renderscript.ScriptIntrinsicHistogram) real).forEach(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void forEach_Dot(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        ((android.renderscript.ScriptIntrinsicHistogram) real).forEach_Dot(arg0 == null ? null : arg0.getReal());
    }

    public void forEach_Dot(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions arg1) {
        ((android.renderscript.ScriptIntrinsicHistogram) real).forEach_Dot(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.FieldID getFieldID_Input() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.FieldID.wrap(((android.renderscript.ScriptIntrinsicHistogram) real).getFieldID_Input());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.KernelID getKernelID_Separate() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.KernelID.wrap(((android.renderscript.ScriptIntrinsicHistogram) real).getKernelID_Separate());
    }

    public void setDotCoefficients(float arg0, float arg1, float arg2, float arg3) {
        ((android.renderscript.ScriptIntrinsicHistogram) real).setDotCoefficients(arg0, arg1, arg2, arg3);
    }

    public void setOutput(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        ((android.renderscript.ScriptIntrinsicHistogram) real).setOutput(arg0 == null ? null : arg0.getReal());
    }

}
