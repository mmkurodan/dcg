// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class MaskFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MaskFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.MaskFilter wrap(android.graphics.MaskFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.MaskFilter(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.MaskFilter getReal() {
        return (android.graphics.MaskFilter) real;
    }

    public android.graphics.MaskFilter unwrap() {
        return getReal();
    }

    public MaskFilter() {
        this(new android.graphics.MaskFilter(), (__DcgwBridgeToken) null);
    }

}
