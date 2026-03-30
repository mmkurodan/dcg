// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Xfermode {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Xfermode(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Xfermode wrap(android.graphics.Xfermode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Xfermode(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Xfermode getReal() {
        return (android.graphics.Xfermode) real;
    }

    public android.graphics.Xfermode unwrap() {
        return getReal();
    }

    public Xfermode() {
        this(new android.graphics.Xfermode(), (__DcgwBridgeToken) null);
    }

}
