// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.renderscript;

public final class ScriptC {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScriptC(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.renderscript.ScriptC wrap(android.renderscript.ScriptC real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.renderscript.ScriptC(real, (__DcgwBridgeToken) null);
    }

    public android.renderscript.ScriptC getReal() {
        return (android.renderscript.ScriptC) real;
    }

    public android.renderscript.ScriptC unwrap() {
        return getReal();
    }

}
