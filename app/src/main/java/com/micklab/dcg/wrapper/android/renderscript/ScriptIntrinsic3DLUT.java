// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsic3DLUT {
    private final android.renderscript.ScriptIntrinsic3DLUT real;

    public ScriptIntrinsic3DLUT(android.renderscript.ScriptIntrinsic3DLUT real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsic3DLUT wrap(android.renderscript.ScriptIntrinsic3DLUT real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsic3DLUT(real);
    }

    public android.renderscript.ScriptIntrinsic3DLUT unwrap() {
        return real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsic3DLUT create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsic3DLUT.wrap(android.renderscript.ScriptIntrinsic3DLUT.create(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
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

    public void setLUT(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        real.setLUT(arg0 == null ? null : arg0.unwrap());
    }

}
