// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class GesturePoint {
    private final android.gesture.GesturePoint real;

    public GesturePoint(android.gesture.GesturePoint real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.GesturePoint wrap(android.gesture.GesturePoint real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GesturePoint(real);
    }

    public android.gesture.GesturePoint unwrap() {
        return real;
    }

    public GesturePoint(float arg0, float arg1, long arg2) {
        this(new android.gesture.GesturePoint(arg0, arg1, arg2));
    }

    public java.lang.Object clone() {
        return real.clone();
    }


}
