// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class EmbossMaskFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EmbossMaskFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.EmbossMaskFilter wrap(android.graphics.EmbossMaskFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.EmbossMaskFilter(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.EmbossMaskFilter getReal() {
        return (android.graphics.EmbossMaskFilter) real;
    }

    public android.graphics.EmbossMaskFilter unwrap() {
        return getReal();
    }

    public EmbossMaskFilter(float[] arg0, float arg1, float arg2, float arg3) {
        this(new android.graphics.EmbossMaskFilter(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

}
