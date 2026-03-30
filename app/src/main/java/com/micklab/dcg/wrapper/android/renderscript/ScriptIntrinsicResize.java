// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicResize {
    private final android.renderscript.ScriptIntrinsicResize real;

    public ScriptIntrinsicResize(android.renderscript.ScriptIntrinsicResize real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicResize wrap(android.renderscript.ScriptIntrinsicResize real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicResize(real);
    }

    public android.renderscript.ScriptIntrinsicResize unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicResize create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicResize.wrap(android.renderscript.ScriptIntrinsicResize.create(arg0 == null ? null : arg0.unwrap()));
    }

    public void forEach_bicubic(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        real.forEach_bicubic(arg0 == null ? null : arg0.unwrap());
    }

    public void forEach_bicubic(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions arg1) {
        real.forEach_bicubic(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.FieldID getFieldID_Input() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.FieldID.wrap(real.getFieldID_Input());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.KernelID getKernelID_bicubic() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.KernelID.wrap(real.getKernelID_bicubic());
    }

    public void setInput(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        real.setInput(arg0 == null ? null : arg0.unwrap());
    }

}
