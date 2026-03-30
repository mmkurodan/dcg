// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class GesturePoint {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GesturePoint(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.GesturePoint wrap(android.gesture.GesturePoint real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GesturePoint(real, (__DcgwBridgeToken) null);
    }

    public android.gesture.GesturePoint getReal() {
        return (android.gesture.GesturePoint) real;
    }

    public android.gesture.GesturePoint unwrap() {
        return getReal();
    }

    public GesturePoint(float arg0, float arg1, long arg2) {
        this(new android.gesture.GesturePoint(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public java.lang.Object clone() {
        return ((android.gesture.GesturePoint) real).clone();
    }


}
