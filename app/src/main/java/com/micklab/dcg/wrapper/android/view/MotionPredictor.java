// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class MotionPredictor {
    private final android.view.MotionPredictor real;

    public MotionPredictor(android.view.MotionPredictor real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.MotionPredictor wrap(android.view.MotionPredictor real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.MotionPredictor(real);
    }

    public android.view.MotionPredictor unwrap() {
        return real;
    }

    public MotionPredictor(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.view.MotionPredictor(arg0 == null ? null : arg0.unwrap()));
    }

    public boolean isPredictionAvailable(int arg0, int arg1) {
        return real.isPredictionAvailable(arg0, arg1);
    }

    public com.micklab.dcg.wrapper.android.view.MotionEvent predict(long arg0) {
        return com.micklab.dcg.wrapper.android.view.MotionEvent.wrap(real.predict(arg0));
    }

    public void record(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        real.record(arg0 == null ? null : arg0.unwrap());
    }

}
