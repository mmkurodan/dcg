// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class GestureStroke {
    private final android.gesture.GestureStroke real;

    public GestureStroke(android.gesture.GestureStroke real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureStroke wrap(android.gesture.GestureStroke real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureStroke(real);
    }

    public android.gesture.GestureStroke unwrap() {
        return real;
    }

    public GestureStroke(java.util.ArrayList arg0) {
        this(new android.gesture.GestureStroke(arg0));
    }

    public void clearPath() {
        real.clearPath();
    }

    public java.lang.Object clone() {
        return real.clone();
    }

    public com.micklab.dcg.wrapper.android.gesture.OrientedBoundingBox computeOrientedBoundingBox() {
        return com.micklab.dcg.wrapper.android.gesture.OrientedBoundingBox.wrap(real.computeOrientedBoundingBox());
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getPath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.getPath());
    }

    public com.micklab.dcg.wrapper.android.graphics.Path toPath(float arg0, float arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.toPath(arg0, arg1, arg2));
    }


}
