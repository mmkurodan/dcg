// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ScaleGestureDetector {
    private final android.view.ScaleGestureDetector real;

    public ScaleGestureDetector(android.view.ScaleGestureDetector real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ScaleGestureDetector wrap(android.view.ScaleGestureDetector real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScaleGestureDetector(real);
    }

    public android.view.ScaleGestureDetector unwrap() {
        return real;
    }

    public ScaleGestureDetector(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.ScaleGestureDetector.OnScaleGestureListener arg1) {
        this(new android.view.ScaleGestureDetector(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ScaleGestureDetector(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.ScaleGestureDetector.OnScaleGestureListener arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        this(new android.view.ScaleGestureDetector(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public float getCurrentSpan() {
        return real.getCurrentSpan();
    }

    public float getCurrentSpanX() {
        return real.getCurrentSpanX();
    }

    public float getCurrentSpanY() {
        return real.getCurrentSpanY();
    }

    public long getEventTime() {
        return real.getEventTime();
    }

    public float getFocusX() {
        return real.getFocusX();
    }

    public float getFocusY() {
        return real.getFocusY();
    }

    public float getPreviousSpan() {
        return real.getPreviousSpan();
    }

    public float getPreviousSpanX() {
        return real.getPreviousSpanX();
    }

    public float getPreviousSpanY() {
        return real.getPreviousSpanY();
    }

    public float getScaleFactor() {
        return real.getScaleFactor();
    }

    public long getTimeDelta() {
        return real.getTimeDelta();
    }

    public boolean isInProgress() {
        return real.isInProgress();
    }

    public boolean isQuickScaleEnabled() {
        return real.isQuickScaleEnabled();
    }

    public boolean isStylusScaleEnabled() {
        return real.isStylusScaleEnabled();
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void setQuickScaleEnabled(boolean arg0) {
        real.setQuickScaleEnabled(arg0);
    }

    public void setStylusScaleEnabled(boolean arg0) {
        real.setStylusScaleEnabled(arg0);
    }

    public static final class OnScaleGestureListener {
        private final android.view.ScaleGestureDetector.OnScaleGestureListener real;

        public OnScaleGestureListener(android.view.ScaleGestureDetector.OnScaleGestureListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ScaleGestureDetector.OnScaleGestureListener wrap(android.view.ScaleGestureDetector.OnScaleGestureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScaleGestureDetector.OnScaleGestureListener(real);
        }

        public android.view.ScaleGestureDetector.OnScaleGestureListener unwrap() {
            return real;
        }

        public boolean onScale(com.micklab.dcg.wrapper.android.view.ScaleGestureDetector arg0) {
            return real.onScale(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onScaleBegin(com.micklab.dcg.wrapper.android.view.ScaleGestureDetector arg0) {
            return real.onScaleBegin(arg0 == null ? null : arg0.unwrap());
        }

        public void onScaleEnd(com.micklab.dcg.wrapper.android.view.ScaleGestureDetector arg0) {
            real.onScaleEnd(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class SimpleOnScaleGestureListener {
        private final android.view.ScaleGestureDetector.SimpleOnScaleGestureListener real;

        public SimpleOnScaleGestureListener(android.view.ScaleGestureDetector.SimpleOnScaleGestureListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ScaleGestureDetector.SimpleOnScaleGestureListener wrap(android.view.ScaleGestureDetector.SimpleOnScaleGestureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScaleGestureDetector.SimpleOnScaleGestureListener(real);
        }

        public android.view.ScaleGestureDetector.SimpleOnScaleGestureListener unwrap() {
            return real;
        }

        public SimpleOnScaleGestureListener() {
            this(new android.view.ScaleGestureDetector.SimpleOnScaleGestureListener());
        }

        public boolean onScale(com.micklab.dcg.wrapper.android.view.ScaleGestureDetector arg0) {
            return real.onScale(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onScaleBegin(com.micklab.dcg.wrapper.android.view.ScaleGestureDetector arg0) {
            return real.onScaleBegin(arg0 == null ? null : arg0.unwrap());
        }

        public void onScaleEnd(com.micklab.dcg.wrapper.android.view.ScaleGestureDetector arg0) {
            real.onScaleEnd(arg0 == null ? null : arg0.unwrap());
        }

    }
}
