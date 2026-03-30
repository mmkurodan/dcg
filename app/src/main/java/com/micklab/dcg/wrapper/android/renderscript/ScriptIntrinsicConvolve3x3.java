// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicConvolve3x3 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScriptIntrinsicConvolve3x3(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicConvolve3x3 wrap(android.renderscript.ScriptIntrinsicConvolve3x3 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicConvolve3x3(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.ScriptIntrinsicConvolve3x3 getReal() {
        return (android.renderscript.ScriptIntrinsicConvolve3x3) real;
    }

    public android.renderscript.ScriptIntrinsicConvolve3x3 unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicConvolve3x3 create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicConvolve3x3.wrap(android.renderscript.ScriptIntrinsicConvolve3x3.create(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        ((android.renderscript.ScriptIntrinsicConvolve3x3) real).forEach(arg0 == null ? null : arg0.getReal());
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions arg1) {
        ((android.renderscript.ScriptIntrinsicConvolve3x3) real).forEach(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.FieldID getFieldID_Input() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.FieldID.wrap(((android.renderscript.ScriptIntrinsicConvolve3x3) real).getFieldID_Input());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.KernelID getKernelID() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.KernelID.wrap(((android.renderscript.ScriptIntrinsicConvolve3x3) real).getKernelID());
    }

    public void setCoefficients(float[] arg0) {
        ((android.renderscript.ScriptIntrinsicConvolve3x3) real).setCoefficients(arg0);
    }

    public void setInput(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        ((android.renderscript.ScriptIntrinsicConvolve3x3) real).setInput(arg0 == null ? null : arg0.getReal());
    }

}
