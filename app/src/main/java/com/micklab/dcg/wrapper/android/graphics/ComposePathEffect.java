// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ComposePathEffect {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ComposePathEffect(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ComposePathEffect wrap(android.graphics.ComposePathEffect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ComposePathEffect(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.ComposePathEffect getReal() {
        return (android.graphics.ComposePathEffect) real;
    }

    public android.graphics.ComposePathEffect unwrap() {
        return getReal();
    }

    public ComposePathEffect(com.micklab.dcg.wrapper.android.graphics.PathEffect arg0, com.micklab.dcg.wrapper.android.graphics.PathEffect arg1) {
        this(new android.graphics.ComposePathEffect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

}
