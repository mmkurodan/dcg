// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicYuvToRGB {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScriptIntrinsicYuvToRGB(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicYuvToRGB wrap(android.renderscript.ScriptIntrinsicYuvToRGB real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicYuvToRGB(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.ScriptIntrinsicYuvToRGB getReal() {
        return (android.renderscript.ScriptIntrinsicYuvToRGB) real;
    }

    public android.renderscript.ScriptIntrinsicYuvToRGB unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicYuvToRGB create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicYuvToRGB.wrap(android.renderscript.ScriptIntrinsicYuvToRGB.create(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        ((android.renderscript.ScriptIntrinsicYuvToRGB) real).forEach(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.FieldID getFieldID_Input() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.FieldID.wrap(((android.renderscript.ScriptIntrinsicYuvToRGB) real).getFieldID_Input());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.KernelID getKernelID() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.KernelID.wrap(((android.renderscript.ScriptIntrinsicYuvToRGB) real).getKernelID());
    }

    public void setInput(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        ((android.renderscript.ScriptIntrinsicYuvToRGB) real).setInput(arg0 == null ? null : arg0.getReal());
    }

}
