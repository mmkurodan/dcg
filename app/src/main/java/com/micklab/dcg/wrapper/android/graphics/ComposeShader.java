// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ComposeShader {
    private final android.graphics.ComposeShader real;

    public ComposeShader(android.graphics.ComposeShader real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ComposeShader wrap(android.graphics.ComposeShader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ComposeShader(real);
    }

    public android.graphics.ComposeShader unwrap() {
        return real;
    }

    public ComposeShader(com.micklab.dcg.wrapper.android.graphics.Shader arg0, com.micklab.dcg.wrapper.android.graphics.Shader arg1, com.micklab.dcg.wrapper.android.graphics.Xfermode arg2) {
        this(new android.graphics.ComposeShader(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public ComposeShader(com.micklab.dcg.wrapper.android.graphics.Shader arg0, com.micklab.dcg.wrapper.android.graphics.Shader arg1, com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg2) {
        this(new android.graphics.ComposeShader(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public ComposeShader(com.micklab.dcg.wrapper.android.graphics.Shader arg0, com.micklab.dcg.wrapper.android.graphics.Shader arg1, com.micklab.dcg.wrapper.android.graphics.BlendMode arg2) {
        this(new android.graphics.ComposeShader(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

}
