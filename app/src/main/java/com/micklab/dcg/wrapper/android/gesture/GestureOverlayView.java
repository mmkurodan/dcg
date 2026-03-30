// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class GestureOverlayView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GestureOverlayView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureOverlayView wrap(android.gesture.GestureOverlayView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureOverlayView(real, (__DcgwBridgeToken) null);
    }

    public android.gesture.GestureOverlayView getReal() {
        return (android.gesture.GestureOverlayView) real;
    }

    public android.gesture.GestureOverlayView unwrap() {
        return getReal();
    }

    public GestureOverlayView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.gesture.GestureOverlayView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public GestureOverlayView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.gesture.GestureOverlayView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public GestureOverlayView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.gesture.GestureOverlayView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public GestureOverlayView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.gesture.GestureOverlayView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void addOnGestureListener(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGestureListener arg0) {
        ((android.gesture.GestureOverlayView) real).addOnGestureListener(arg0 == null ? null : arg0.getReal());
    }

    public void addOnGesturePerformedListener(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturePerformedListener arg0) {
        ((android.gesture.GestureOverlayView) real).addOnGesturePerformedListener(arg0 == null ? null : arg0.getReal());
    }

    public void addOnGesturingListener(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturingListener arg0) {
        ((android.gesture.GestureOverlayView) real).addOnGesturingListener(arg0 == null ? null : arg0.getReal());
    }

    public void cancelClearAnimation() {
        ((android.gesture.GestureOverlayView) real).cancelClearAnimation();
    }

    public void cancelGesture() {
        ((android.gesture.GestureOverlayView) real).cancelGesture();
    }

    public void clear(boolean arg0) {
        ((android.gesture.GestureOverlayView) real).clear(arg0);
    }

    public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.gesture.GestureOverlayView) real).dispatchTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.gesture.GestureOverlayView) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public long getFadeOffset() {
        return ((android.gesture.GestureOverlayView) real).getFadeOffset();
    }

    public com.micklab.dcg.wrapper.android.gesture.Gesture getGesture() {
        return com.micklab.dcg.wrapper.android.gesture.Gesture.wrap(((android.gesture.GestureOverlayView) real).getGesture());
    }

    public int getGestureColor() {
        return ((android.gesture.GestureOverlayView) real).getGestureColor();
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getGesturePath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.gesture.GestureOverlayView) real).getGesturePath());
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getGesturePath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(((android.gesture.GestureOverlayView) real).getGesturePath(arg0 == null ? null : arg0.getReal()));
    }

    public float getGestureStrokeAngleThreshold() {
        return ((android.gesture.GestureOverlayView) real).getGestureStrokeAngleThreshold();
    }

    public float getGestureStrokeLengthThreshold() {
        return ((android.gesture.GestureOverlayView) real).getGestureStrokeLengthThreshold();
    }

    public float getGestureStrokeSquarenessTreshold() {
        return ((android.gesture.GestureOverlayView) real).getGestureStrokeSquarenessTreshold();
    }

    public int getGestureStrokeType() {
        return ((android.gesture.GestureOverlayView) real).getGestureStrokeType();
    }

    public float getGestureStrokeWidth() {
        return ((android.gesture.GestureOverlayView) real).getGestureStrokeWidth();
    }

    public int getOrientation() {
        return ((android.gesture.GestureOverlayView) real).getOrientation();
    }

    public int getUncertainGestureColor() {
        return ((android.gesture.GestureOverlayView) real).getUncertainGestureColor();
    }

    public boolean isEventsInterceptionEnabled() {
        return ((android.gesture.GestureOverlayView) real).isEventsInterceptionEnabled();
    }

    public boolean isFadeEnabled() {
        return ((android.gesture.GestureOverlayView) real).isFadeEnabled();
    }

    public boolean isGestureVisible() {
        return ((android.gesture.GestureOverlayView) real).isGestureVisible();
    }

    public boolean isGesturing() {
        return ((android.gesture.GestureOverlayView) real).isGesturing();
    }

    public void removeAllOnGestureListeners() {
        ((android.gesture.GestureOverlayView) real).removeAllOnGestureListeners();
    }

    public void removeAllOnGesturePerformedListeners() {
        ((android.gesture.GestureOverlayView) real).removeAllOnGesturePerformedListeners();
    }

    public void removeAllOnGesturingListeners() {
        ((android.gesture.GestureOverlayView) real).removeAllOnGesturingListeners();
    }

    public void removeOnGestureListener(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGestureListener arg0) {
        ((android.gesture.GestureOverlayView) real).removeOnGestureListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnGesturePerformedListener(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturePerformedListener arg0) {
        ((android.gesture.GestureOverlayView) real).removeOnGesturePerformedListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnGesturingListener(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturingListener arg0) {
        ((android.gesture.GestureOverlayView) real).removeOnGesturingListener(arg0 == null ? null : arg0.getReal());
    }

    public void setEventsInterceptionEnabled(boolean arg0) {
        ((android.gesture.GestureOverlayView) real).setEventsInterceptionEnabled(arg0);
    }

    public void setFadeEnabled(boolean arg0) {
        ((android.gesture.GestureOverlayView) real).setFadeEnabled(arg0);
    }

    public void setFadeOffset(long arg0) {
        ((android.gesture.GestureOverlayView) real).setFadeOffset(arg0);
    }

    public void setGesture(com.micklab.dcg.wrapper.android.gesture.Gesture arg0) {
        ((android.gesture.GestureOverlayView) real).setGesture(arg0 == null ? null : arg0.getReal());
    }

    public void setGestureColor(int arg0) {
        ((android.gesture.GestureOverlayView) real).setGestureColor(arg0);
    }

    public void setGestureStrokeAngleThreshold(float arg0) {
        ((android.gesture.GestureOverlayView) real).setGestureStrokeAngleThreshold(arg0);
    }

    public void setGestureStrokeLengthThreshold(float arg0) {
        ((android.gesture.GestureOverlayView) real).setGestureStrokeLengthThreshold(arg0);
    }

    public void setGestureStrokeSquarenessTreshold(float arg0) {
        ((android.gesture.GestureOverlayView) real).setGestureStrokeSquarenessTreshold(arg0);
    }

    public void setGestureStrokeType(int arg0) {
        ((android.gesture.GestureOverlayView) real).setGestureStrokeType(arg0);
    }

    public void setGestureStrokeWidth(float arg0) {
        ((android.gesture.GestureOverlayView) real).setGestureStrokeWidth(arg0);
    }

    public void setGestureVisible(boolean arg0) {
        ((android.gesture.GestureOverlayView) real).setGestureVisible(arg0);
    }

    public void setOrientation(int arg0) {
        ((android.gesture.GestureOverlayView) real).setOrientation(arg0);
    }

    public void setUncertainGestureColor(int arg0) {
        ((android.gesture.GestureOverlayView) real).setUncertainGestureColor(arg0);
    }

    public static final int GESTURE_STROKE_TYPE_MULTIPLE = android.gesture.GestureOverlayView.GESTURE_STROKE_TYPE_MULTIPLE;
    public static final int GESTURE_STROKE_TYPE_SINGLE = android.gesture.GestureOverlayView.GESTURE_STROKE_TYPE_SINGLE;
    public static final int ORIENTATION_HORIZONTAL = android.gesture.GestureOverlayView.ORIENTATION_HORIZONTAL;
    public static final int ORIENTATION_VERTICAL = android.gesture.GestureOverlayView.ORIENTATION_VERTICAL;

    public static final class OnGestureListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnGestureListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGestureListener wrap(android.gesture.GestureOverlayView.OnGestureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGestureListener(real, (__DcgwBridgeToken) null);
        }

        public android.gesture.GestureOverlayView.OnGestureListener getReal() {
            return (android.gesture.GestureOverlayView.OnGestureListener) real;
        }

        public android.gesture.GestureOverlayView.OnGestureListener unwrap() {
            return getReal();
        }

        public void onGesture(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            ((android.gesture.GestureOverlayView.OnGestureListener) real).onGesture(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onGestureCancelled(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            ((android.gesture.GestureOverlayView.OnGestureListener) real).onGestureCancelled(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onGestureEnded(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            ((android.gesture.GestureOverlayView.OnGestureListener) real).onGestureEnded(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onGestureStarted(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            ((android.gesture.GestureOverlayView.OnGestureListener) real).onGestureStarted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnGesturePerformedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnGesturePerformedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturePerformedListener wrap(android.gesture.GestureOverlayView.OnGesturePerformedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturePerformedListener(real, (__DcgwBridgeToken) null);
        }

        public android.gesture.GestureOverlayView.OnGesturePerformedListener getReal() {
            return (android.gesture.GestureOverlayView.OnGesturePerformedListener) real;
        }

        public android.gesture.GestureOverlayView.OnGesturePerformedListener unwrap() {
            return getReal();
        }

        public void onGesturePerformed(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0, com.micklab.dcg.wrapper.android.gesture.Gesture arg1) {
            ((android.gesture.GestureOverlayView.OnGesturePerformedListener) real).onGesturePerformed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnGesturingListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnGesturingListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturingListener wrap(android.gesture.GestureOverlayView.OnGesturingListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturingListener(real, (__DcgwBridgeToken) null);
        }

        public android.gesture.GestureOverlayView.OnGesturingListener getReal() {
            return (android.gesture.GestureOverlayView.OnGesturingListener) real;
        }

        public android.gesture.GestureOverlayView.OnGesturingListener unwrap() {
            return getReal();
        }

        public void onGesturingEnded(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0) {
            ((android.gesture.GestureOverlayView.OnGesturingListener) real).onGesturingEnded(arg0 == null ? null : arg0.getReal());
        }

        public void onGesturingStarted(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0) {
            ((android.gesture.GestureOverlayView.OnGesturingListener) real).onGesturingStarted(arg0 == null ? null : arg0.getReal());
        }

    }
}
