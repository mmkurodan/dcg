// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class MotionPredictor {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MotionPredictor(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.MotionPredictor wrap(android.view.MotionPredictor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.MotionPredictor(real, (__DcgwBridgeToken) null);
    }

    public android.view.MotionPredictor getReal() {
        return (android.view.MotionPredictor) real;
    }

    public android.view.MotionPredictor unwrap() {
        return getReal();
    }

    public MotionPredictor(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.view.MotionPredictor(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean isPredictionAvailable(int arg0, int arg1) {
        return ((android.view.MotionPredictor) real).isPredictionAvailable(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.MotionEvent predict(long arg0) {
        return com.micklab.dcg.wrapper.android.view.MotionEvent.wrap(((android.view.MotionPredictor) real).predict(arg0));
    }

    public void record(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        ((android.view.MotionPredictor) real).record(arg0 == null ? null : arg0.getReal());
    }

}
