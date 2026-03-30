// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class DrawFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DrawFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.DrawFilter wrap(android.graphics.DrawFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.DrawFilter(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.DrawFilter getReal() {
        return (android.graphics.DrawFilter) real;
    }

    public android.graphics.DrawFilter unwrap() {
        return getReal();
    }

    public DrawFilter() {
        this(new android.graphics.DrawFilter(), (__DcgwBridgeToken) null);
    }

}
