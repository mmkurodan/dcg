// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsic3DLUT {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScriptIntrinsic3DLUT(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsic3DLUT wrap(android.renderscript.ScriptIntrinsic3DLUT real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsic3DLUT(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.ScriptIntrinsic3DLUT getReal() {
        return (android.renderscript.ScriptIntrinsic3DLUT) real;
    }

    public android.renderscript.ScriptIntrinsic3DLUT unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsic3DLUT create(com.micklab.dcg.wrapper.android.renderscript.RenderScript arg0, com.micklab.dcg.wrapper.android.renderscript.Element arg1) {
        return com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsic3DLUT.wrap(android.renderscript.ScriptIntrinsic3DLUT.create(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1) {
        ((android.renderscript.ScriptIntrinsic3DLUT) real).forEach(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void forEach(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0, com.micklab.dcg.wrapper.android.renderscript.Allocation arg1, com.micklab.dcg.wrapper.android.renderscript.Script.LaunchOptions arg2) {
        ((android.renderscript.ScriptIntrinsic3DLUT) real).forEach(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public com.micklab.dcg.wrapper.android.renderscript.Script.KernelID getKernelID() {
        return com.micklab.dcg.wrapper.android.renderscript.Script.KernelID.wrap(((android.renderscript.ScriptIntrinsic3DLUT) real).getKernelID());
    }

    public void setLUT(com.micklab.dcg.wrapper.android.renderscript.Allocation arg0) {
        ((android.renderscript.ScriptIntrinsic3DLUT) real).setLUT(arg0 == null ? null : arg0.getReal());
    }

}
