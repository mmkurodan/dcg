// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ScaleGestureDetector {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ScaleGestureDetector(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ScaleGestureDetector wrap(android.view.ScaleGestureDetector real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScaleGestureDetector(real, (__DcgwBridgeToken) null);
    }

    public android.view.ScaleGestureDetector getReal() {
        return (android.view.ScaleGestureDetector) real;
    }

    public android.view.ScaleGestureDetector unwrap() {
        return getReal();
    }

    public ScaleGestureDetector(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.ScaleGestureDetector.OnScaleGestureListener arg1) {
        this(new android.view.ScaleGestureDetector(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ScaleGestureDetector(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.ScaleGestureDetector.OnScaleGestureListener arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        this(new android.view.ScaleGestureDetector(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public float getCurrentSpan() {
        return ((android.view.ScaleGestureDetector) real).getCurrentSpan();
    }

    public float getCurrentSpanX() {
        return ((android.view.ScaleGestureDetector) real).getCurrentSpanX();
    }

    public float getCurrentSpanY() {
        return ((android.view.ScaleGestureDetector) real).getCurrentSpanY();
    }

    public long getEventTime() {
        return ((android.view.ScaleGestureDetector) real).getEventTime();
    }

    public float getFocusX() {
        return ((android.view.ScaleGestureDetector) real).getFocusX();
    }

    public float getFocusY() {
        return ((android.view.ScaleGestureDetector) real).getFocusY();
    }

    public float getPreviousSpan() {
        return ((android.view.ScaleGestureDetector) real).getPreviousSpan();
    }

    public float getPreviousSpanX() {
        return ((android.view.ScaleGestureDetector) real).getPreviousSpanX();
    }

    public float getPreviousSpanY() {
        return ((android.view.ScaleGestureDetector) real).getPreviousSpanY();
    }

    public float getScaleFactor() {
        return ((android.view.ScaleGestureDetector) real).getScaleFactor();
    }

    public long getTimeDelta() {
        return ((android.view.ScaleGestureDetector) real).getTimeDelta();
    }

    public boolean isInProgress() {
        return ((android.view.ScaleGestureDetector) real).isInProgress();
    }

    public boolean isQuickScaleEnabled() {
        return ((android.view.ScaleGestureDetector) real).isQuickScaleEnabled();
    }

    public boolean isStylusScaleEnabled() {
        return ((android.view.ScaleGestureDetector) real).isStylusScaleEnabled();
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.ScaleGestureDetector) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public void setQuickScaleEnabled(boolean arg0) {
        ((android.view.ScaleGestureDetector) real).setQuickScaleEnabled(arg0);
    }

    public void setStylusScaleEnabled(boolean arg0) {
        ((android.view.ScaleGestureDetector) real).setStylusScaleEnabled(arg0);
    }

    public static final class OnScaleGestureListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnScaleGestureListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ScaleGestureDetector.OnScaleGestureListener wrap(android.view.ScaleGestureDetector.OnScaleGestureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScaleGestureDetector.OnScaleGestureListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ScaleGestureDetector.OnScaleGestureListener getReal() {
            return (android.view.ScaleGestureDetector.OnScaleGestureListener) real;
        }

        public android.view.ScaleGestureDetector.OnScaleGestureListener unwrap() {
            return getReal();
        }

        public boolean onScale(com.micklab.dcg.wrapper.android.view.ScaleGestureDetector arg0) {
            return ((android.view.ScaleGestureDetector.OnScaleGestureListener) real).onScale(arg0 == null ? null : arg0.getReal());
        }

        public boolean onScaleBegin(com.micklab.dcg.wrapper.android.view.ScaleGestureDetector arg0) {
            return ((android.view.ScaleGestureDetector.OnScaleGestureListener) real).onScaleBegin(arg0 == null ? null : arg0.getReal());
        }

        public void onScaleEnd(com.micklab.dcg.wrapper.android.view.ScaleGestureDetector arg0) {
            ((android.view.ScaleGestureDetector.OnScaleGestureListener) real).onScaleEnd(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class SimpleOnScaleGestureListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SimpleOnScaleGestureListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ScaleGestureDetector.SimpleOnScaleGestureListener wrap(android.view.ScaleGestureDetector.SimpleOnScaleGestureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ScaleGestureDetector.SimpleOnScaleGestureListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ScaleGestureDetector.SimpleOnScaleGestureListener getReal() {
            return (android.view.ScaleGestureDetector.SimpleOnScaleGestureListener) real;
        }

        public android.view.ScaleGestureDetector.SimpleOnScaleGestureListener unwrap() {
            return getReal();
        }

        public SimpleOnScaleGestureListener() {
            this(new android.view.ScaleGestureDetector.SimpleOnScaleGestureListener(), (__DcgwBridgeToken) null);
        }

        public boolean onScale(com.micklab.dcg.wrapper.android.view.ScaleGestureDetector arg0) {
            return ((android.view.ScaleGestureDetector.SimpleOnScaleGestureListener) real).onScale(arg0 == null ? null : arg0.getReal());
        }

        public boolean onScaleBegin(com.micklab.dcg.wrapper.android.view.ScaleGestureDetector arg0) {
            return ((android.view.ScaleGestureDetector.SimpleOnScaleGestureListener) real).onScaleBegin(arg0 == null ? null : arg0.getReal());
        }

        public void onScaleEnd(com.micklab.dcg.wrapper.android.view.ScaleGestureDetector arg0) {
            ((android.view.ScaleGestureDetector.SimpleOnScaleGestureListener) real).onScaleEnd(arg0 == null ? null : arg0.getReal());
        }

    }
}
