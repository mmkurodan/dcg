// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.animation;

public final class BidirectionalTypeConverter {
    private final android.animation.BidirectionalTypeConverter real;

    public BidirectionalTypeConverter(android.animation.BidirectionalTypeConverter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.animation.BidirectionalTypeConverter wrap(android.animation.BidirectionalTypeConverter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.animation.BidirectionalTypeConverter(real);
    }

    public android.animation.BidirectionalTypeConverter unwrap() {
        return real;
    }

    public java.lang.Object convertBack(java.lang.Object arg0) {
        return real.convertBack(arg0);
    }

}
