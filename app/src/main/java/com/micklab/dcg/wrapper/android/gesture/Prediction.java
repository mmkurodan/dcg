// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class Prediction {
    private final android.gesture.Prediction real;

    public Prediction(android.gesture.Prediction real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.Prediction wrap(android.gesture.Prediction real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.Prediction(real);
    }

    public android.gesture.Prediction unwrap() {
        return real;
    }

    public java.lang.String toString() {
        return real.toString();
    }


}
