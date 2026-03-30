// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PathEffect {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PathEffect(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PathEffect wrap(android.graphics.PathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PathEffect(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.PathEffect getReal() {
        return (android.graphics.PathEffect) real;
    }

    public android.graphics.PathEffect unwrap() {
        return getReal();
    }

    public PathEffect() {
        this(new android.graphics.PathEffect(), (__DcgwBridgeToken) null);
    }

}
