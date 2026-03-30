// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicBlur {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScriptIntrinsicBlur(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBlur wrap(android.renderscript.ScriptIntrinsicBlur real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBlur(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.ScriptIntrinsicBlur getReal() {
        return (android.renderscript.ScriptIntrinsicBlur) real;
    }

    public android.renderscript.ScriptIntrinsicBlur unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBlur create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBlur.wrap(android.renderscript.ScriptIntrinsicBlur.create(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        ((android.renderscript.ScriptIntrinsicBlur) real).forEach(arg0 == null ? null : arg0.getReal());
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions arg1) {
        ((android.renderscript.ScriptIntrinsicBlur) real).forEach(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.FieldID getFieldID_Input() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.FieldID.wrap(((android.renderscript.ScriptIntrinsicBlur) real).getFieldID_Input());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.KernelID getKernelID() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.KernelID.wrap(((android.renderscript.ScriptIntrinsicBlur) real).getKernelID());
    }

    public void setInput(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        ((android.renderscript.ScriptIntrinsicBlur) real).setInput(arg0 == null ? null : arg0.getReal());
    }

    public void setRadius(float arg0) {
        ((android.renderscript.ScriptIntrinsicBlur) real).setRadius(arg0);
    }

}
