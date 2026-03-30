// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class EmbossMaskFilter {
    private final android.graphics.EmbossMaskFilter real;

    public EmbossMaskFilter(android.graphics.EmbossMaskFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.EmbossMaskFilter wrap(android.graphics.EmbossMaskFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.EmbossMaskFilter(real);
    }

    public android.graphics.EmbossMaskFilter unwrap() {
        return real;
    }

    public EmbossMaskFilter(float[] arg0, float arg1, float arg2, float arg3) {
        this(new android.graphics.EmbossMaskFilter(arg0, arg1, arg2, arg3));
    }

}
