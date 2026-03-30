// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class Prediction {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Prediction(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.Prediction wrap(android.gesture.Prediction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.Prediction(real, (__DcgwBridgeToken) null);
    }

    public android.gesture.Prediction getReal() {
        return (android.gesture.Prediction) real;
    }

    public android.gesture.Prediction unwrap() {
        return getReal();
    }

    public java.lang.String toString() {
        return ((android.gesture.Prediction) real).toString();
    }


}
