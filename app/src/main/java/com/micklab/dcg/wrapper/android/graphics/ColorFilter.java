// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ColorFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ColorFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ColorFilter wrap(android.graphics.ColorFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ColorFilter(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.ColorFilter getReal() {
        return (android.graphics.ColorFilter) real;
    }

    public android.graphics.ColorFilter unwrap() {
        return getReal();
    }

    public ColorFilter() {
        this(new android.graphics.ColorFilter(), (__DcgwBridgeToken) null);
    }

}
