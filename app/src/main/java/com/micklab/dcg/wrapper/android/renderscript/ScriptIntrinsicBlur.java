// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsicBlur {
    private final android.renderscript.ScriptIntrinsicBlur real;

    public ScriptIntrinsicBlur(android.renderscript.ScriptIntrinsicBlur real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBlur wrap(android.renderscript.ScriptIntrinsicBlur real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBlur(real);
    }

    public android.renderscript.ScriptIntrinsicBlur unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBlur create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsicBlur.wrap(android.renderscript.ScriptIntrinsicBlur.create(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        real.forEach(arg0 == null ? null : arg0.unwrap());
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions arg1) {
        real.forEach(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.FieldID getFieldID_Input() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.FieldID.wrap(real.getFieldID_Input());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.KernelID getKernelID() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.KernelID.wrap(real.getKernelID());
    }

    public void setInput(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        real.setInput(arg0 == null ? null : arg0.unwrap());
    }

    public void setRadius(float arg0) {
        real.setRadius(arg0);
    }

}
