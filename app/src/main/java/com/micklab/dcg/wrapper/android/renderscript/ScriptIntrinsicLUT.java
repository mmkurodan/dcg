// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicLUT {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScriptIntrinsicLUT(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicLUT wrap(android.renderscript.ScriptIntrinsicLUT real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicLUT(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.ScriptIntrinsicLUT getReal() {
        return (android.renderscript.ScriptIntrinsicLUT) real;
    }

    public android.renderscript.ScriptIntrinsicLUT unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicLUT create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicLUT.wrap(android.renderscript.ScriptIntrinsicLUT.create(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void destroy() {
        ((android.renderscript.ScriptIntrinsicLUT) real).destroy();
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1) {
        ((android.renderscript.ScriptIntrinsicLUT) real).forEach(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions arg2) {
        ((android.renderscript.ScriptIntrinsicLUT) real).forEach(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.KernelID getKernelID() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.KernelID.wrap(((android.renderscript.ScriptIntrinsicLUT) real).getKernelID());
    }

    public void setAlpha(int arg0, int arg1) {
        ((android.renderscript.ScriptIntrinsicLUT) real).setAlpha(arg0, arg1);
    }

    public void setBlue(int arg0, int arg1) {
        ((android.renderscript.ScriptIntrinsicLUT) real).setBlue(arg0, arg1);
    }

    public void setGreen(int arg0, int arg1) {
        ((android.renderscript.ScriptIntrinsicLUT) real).setGreen(arg0, arg1);
    }

    public void setRed(int arg0, int arg1) {
        ((android.renderscript.ScriptIntrinsicLUT) real).setRed(arg0, arg1);
    }

}
