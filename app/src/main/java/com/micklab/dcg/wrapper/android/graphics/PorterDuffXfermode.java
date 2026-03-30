// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PorterDuffXfermode {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PorterDuffXfermode(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PorterDuffXfermode wrap(android.graphics.PorterDuffXfermode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PorterDuffXfermode(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.PorterDuffXfermode getReal() {
        return (android.graphics.PorterDuffXfermode) real;
    }

    public android.graphics.PorterDuffXfermode unwrap() {
        return getReal();
    }

    public PorterDuffXfermode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        this(new android.graphics.PorterDuffXfermode(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

}
