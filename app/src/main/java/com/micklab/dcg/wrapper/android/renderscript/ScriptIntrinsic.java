// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptIntrinsic {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScriptIntrinsic(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsic wrap(android.renderscript.ScriptIntrinsic real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptIntrinsic(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.ScriptIntrinsic getReal() {
        return (android.renderscript.ScriptIntrinsic) real;
    }

    public android.renderscript.ScriptIntrinsic unwrap() {
        return getReal();
    }

}
