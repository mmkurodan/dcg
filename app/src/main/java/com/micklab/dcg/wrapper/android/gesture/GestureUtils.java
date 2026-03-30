// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class GestureUtils {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GestureUtils(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureUtils wrap(android.gesture.GestureUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureUtils(real, (__DcgwBridgeToken) null);
    }

    public android.gesture.GestureUtils getReal() {
        return (android.gesture.GestureUtils) real;
    }

    public android.gesture.GestureUtils unwrap() {
        return getReal();
    }

    public static com.micklab.dcg.wrapper.android.gesture.OrientedBoundingBox computeOrientedBoundingBox(float[] arg0) {
        return com.micklab.dcg.wrapper.android.gesture.OrientedBoundingBox.wrap(android.gesture.GestureUtils.computeOrientedBoundingBox(arg0));
    }

    public static float[] spatialSampling(com.micklab.dcg.wrapper.android.gesture.Gesture arg0, int arg1) {
        return android.gesture.GestureUtils.spatialSampling(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static float[] spatialSampling(com.micklab.dcg.wrapper.android.gesture.Gesture arg0, int arg1, boolean arg2) {
        return android.gesture.GestureUtils.spatialSampling(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public static float[] temporalSampling(com.micklab.dcg.wrapper.android.gesture.GestureStroke arg0, int arg1) {
        return android.gesture.GestureUtils.temporalSampling(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
