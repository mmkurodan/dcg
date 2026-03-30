// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicConvolve5x5 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScriptIntrinsicConvolve5x5(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicConvolve5x5 wrap(android.renderscript.ScriptIntrinsicConvolve5x5 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicConvolve5x5(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.ScriptIntrinsicConvolve5x5 getReal() {
        return (android.renderscript.ScriptIntrinsicConvolve5x5) real;
    }

    public android.renderscript.ScriptIntrinsicConvolve5x5 unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicConvolve5x5 create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicConvolve5x5.wrap(android.renderscript.ScriptIntrinsicConvolve5x5.create(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        ((android.renderscript.ScriptIntrinsicConvolve5x5) real).forEach(arg0 == null ? null : arg0.getReal());
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions arg1) {
        ((android.renderscript.ScriptIntrinsicConvolve5x5) real).forEach(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.FieldID getFieldID_Input() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.FieldID.wrap(((android.renderscript.ScriptIntrinsicConvolve5x5) real).getFieldID_Input());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.KernelID getKernelID() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.KernelID.wrap(((android.renderscript.ScriptIntrinsicConvolve5x5) real).getKernelID());
    }

    public void setCoefficients(float[] arg0) {
        ((android.renderscript.ScriptIntrinsicConvolve5x5) real).setCoefficients(arg0);
    }

    public void setInput(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        ((android.renderscript.ScriptIntrinsicConvolve5x5) real).setInput(arg0 == null ? null : arg0.getReal());
    }

}
