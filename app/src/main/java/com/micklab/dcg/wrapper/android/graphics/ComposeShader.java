// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ComposeShader {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ComposeShader(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ComposeShader wrap(android.graphics.ComposeShader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ComposeShader(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.ComposeShader getReal() {
        return (android.graphics.ComposeShader) real;
    }

    public android.graphics.ComposeShader unwrap() {
        return getReal();
    }

    public ComposeShader(com.micklab.dcg.wrapper.android.graphics.Shader arg0, com.micklab.dcg.wrapper.android.graphics.Shader arg1, com.micklab.dcg.wrapper.android.graphics.BlendMode arg2) {
        this(new android.graphics.ComposeShader(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public ComposeShader(com.micklab.dcg.wrapper.android.graphics.Shader arg0, com.micklab.dcg.wrapper.android.graphics.Shader arg1, com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg2) {
        this(new android.graphics.ComposeShader(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public ComposeShader(com.micklab.dcg.wrapper.android.graphics.Shader arg0, com.micklab.dcg.wrapper.android.graphics.Shader arg1, com.micklab.dcg.wrapper.android.graphics.Xfermode arg2) {
        this(new android.graphics.ComposeShader(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

}
