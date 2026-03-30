// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class GestureStroke {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GestureStroke(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureStroke wrap(android.gesture.GestureStroke real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureStroke(real, (__DcgwBridgeToken) null);
    }

    public android.gesture.GestureStroke getReal() {
        return (android.gesture.GestureStroke) real;
    }

    public android.gesture.GestureStroke unwrap() {
        return getReal();
    }

    public GestureStroke(java.util.ArrayList arg0) {
        this(new android.gesture.GestureStroke(arg0), (__DcgwBridgeToken) null);
    }

    public void clearPath() {
        ((android.gesture.GestureStroke) real).clearPath();
    }

    public java.lang.Object clone() {
        return ((android.gesture.GestureStroke) real).clone();
    }

    public com.micklab.dcg.wrapper.android.gesture.OrientedBoundingBox computeOrientedBoundingBox() {
        return com.micklab.dcg.wrapper.android.gesture.OrientedBoundingBox.wrap(((android.gesture.GestureStroke) real).computeOrientedBoundingBox());
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getPath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.gesture.GestureStroke) real).getPath());
    }

    public com.micklab.dcg.wrapper.android.graphics.Path toPath(float arg0, float arg1, int arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.gesture.GestureStroke) real).toPath(arg0, arg1, arg2));
    }


}
