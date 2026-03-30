// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PaintFlagsDrawFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PaintFlagsDrawFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PaintFlagsDrawFilter wrap(android.graphics.PaintFlagsDrawFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PaintFlagsDrawFilter(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.PaintFlagsDrawFilter getReal() {
        return (android.graphics.PaintFlagsDrawFilter) real;
    }

    public android.graphics.PaintFlagsDrawFilter unwrap() {
        return getReal();
    }

    public PaintFlagsDrawFilter(int arg0, int arg1) {
        this(new android.graphics.PaintFlagsDrawFilter(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
