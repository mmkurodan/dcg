// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class BidirectionalTypeConverter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BidirectionalTypeConverter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.BidirectionalTypeConverter wrap(android.animation.BidirectionalTypeConverter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.BidirectionalTypeConverter(real, (__DcgwBridgeToken) null);
    }

    public android.animation.BidirectionalTypeConverter getReal() {
        return (android.animation.BidirectionalTypeConverter) real;
    }

    public android.animation.BidirectionalTypeConverter unwrap() {
        return getReal();
    }

    public java.lang.Object convertBack(java.lang.Object arg0) {
        return ((android.animation.BidirectionalTypeConverter) real).convertBack(arg0);
    }

}
