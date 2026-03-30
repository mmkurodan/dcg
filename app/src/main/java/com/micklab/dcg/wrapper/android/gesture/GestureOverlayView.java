// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.gesture;

public final class GestureOverlayView {
    private final android.gesture.GestureOverlayView real;

    public GestureOverlayView(android.gesture.GestureOverlayView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.gesture.GestureOverlayView wrap(android.gesture.GestureOverlayView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureOverlayView(real);
    }

    public android.gesture.GestureOverlayView unwrap() {
        return real;
    }

    public GestureOverlayView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.gesture.GestureOverlayView(arg0 == null ? null : arg0.unwrap()));
    }

    public GestureOverlayView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.gesture.GestureOverlayView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public GestureOverlayView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.gesture.GestureOverlayView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public GestureOverlayView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.gesture.GestureOverlayView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void addOnGestureListener(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGestureListener arg0) {
        real.addOnGestureListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnGesturePerformedListener(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturePerformedListener arg0) {
        real.addOnGesturePerformedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnGesturingListener(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturingListener arg0) {
        real.addOnGesturingListener(arg0 == null ? null : arg0.unwrap());
    }

    public void cancelClearAnimation() {
        real.cancelClearAnimation();
    }

    public void cancelGesture() {
        real.cancelGesture();
    }

    public void clear(boolean arg0) {
        real.clear(arg0);
    }

    public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.dispatchTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public long getFadeOffset() {
        return real.getFadeOffset();
    }

    public com.micklab.dcg.wrapper.android.gesture.Gesture getGesture() {
        return com.micklab.dcg.wrapper.android.gesture.Gesture.wrap(real.getGesture());
    }

    public int getGestureColor() {
        return real.getGestureColor();
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getGesturePath() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.getGesturePath());
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getGesturePath(com.micklab.dcg.wrapper.android.graphics.Path arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.getGesturePath(arg0 == null ? null : arg0.unwrap()));
    }

    public float getGestureStrokeAngleThreshold() {
        return real.getGestureStrokeAngleThreshold();
    }

    public float getGestureStrokeLengthThreshold() {
        return real.getGestureStrokeLengthThreshold();
    }

    public float getGestureStrokeSquarenessTreshold() {
        return real.getGestureStrokeSquarenessTreshold();
    }

    public int getGestureStrokeType() {
        return real.getGestureStrokeType();
    }

    public float getGestureStrokeWidth() {
        return real.getGestureStrokeWidth();
    }

    public int getOrientation() {
        return real.getOrientation();
    }

    public int getUncertainGestureColor() {
        return real.getUncertainGestureColor();
    }

    public boolean isEventsInterceptionEnabled() {
        return real.isEventsInterceptionEnabled();
    }

    public boolean isFadeEnabled() {
        return real.isFadeEnabled();
    }

    public boolean isGestureVisible() {
        return real.isGestureVisible();
    }

    public boolean isGesturing() {
        return real.isGesturing();
    }

    public void removeAllOnGestureListeners() {
        real.removeAllOnGestureListeners();
    }

    public void removeAllOnGesturePerformedListeners() {
        real.removeAllOnGesturePerformedListeners();
    }

    public void removeAllOnGesturingListeners() {
        real.removeAllOnGesturingListeners();
    }

    public void removeOnGestureListener(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGestureListener arg0) {
        real.removeOnGestureListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnGesturePerformedListener(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturePerformedListener arg0) {
        real.removeOnGesturePerformedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnGesturingListener(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturingListener arg0) {
        real.removeOnGesturingListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setEventsInterceptionEnabled(boolean arg0) {
        real.setEventsInterceptionEnabled(arg0);
    }

    public void setFadeEnabled(boolean arg0) {
        real.setFadeEnabled(arg0);
    }

    public void setFadeOffset(long arg0) {
        real.setFadeOffset(arg0);
    }

    public void setGesture(com.micklab.dcg.wrapper.android.gesture.Gesture arg0) {
        real.setGesture(arg0 == null ? null : arg0.unwrap());
    }

    public void setGestureColor(int arg0) {
        real.setGestureColor(arg0);
    }

    public void setGestureStrokeAngleThreshold(float arg0) {
        real.setGestureStrokeAngleThreshold(arg0);
    }

    public void setGestureStrokeLengthThreshold(float arg0) {
        real.setGestureStrokeLengthThreshold(arg0);
    }

    public void setGestureStrokeSquarenessTreshold(float arg0) {
        real.setGestureStrokeSquarenessTreshold(arg0);
    }

    public void setGestureStrokeType(int arg0) {
        real.setGestureStrokeType(arg0);
    }

    public void setGestureStrokeWidth(float arg0) {
        real.setGestureStrokeWidth(arg0);
    }

    public void setGestureVisible(boolean arg0) {
        real.setGestureVisible(arg0);
    }

    public void setOrientation(int arg0) {
        real.setOrientation(arg0);
    }

    public void setUncertainGestureColor(int arg0) {
        real.setUncertainGestureColor(arg0);
    }

    public static final int GESTURE_STROKE_TYPE_MULTIPLE = android.gesture.GestureOverlayView.GESTURE_STROKE_TYPE_MULTIPLE;
    public static final int GESTURE_STROKE_TYPE_SINGLE = android.gesture.GestureOverlayView.GESTURE_STROKE_TYPE_SINGLE;
    public static final int ORIENTATION_HORIZONTAL = android.gesture.GestureOverlayView.ORIENTATION_HORIZONTAL;
    public static final int ORIENTATION_VERTICAL = android.gesture.GestureOverlayView.ORIENTATION_VERTICAL;

    public static final class OnGestureListener {
        private final android.gesture.GestureOverlayView.OnGestureListener real;

        public OnGestureListener(android.gesture.GestureOverlayView.OnGestureListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGestureListener wrap(android.gesture.GestureOverlayView.OnGestureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGestureListener(real);
        }

        public android.gesture.GestureOverlayView.OnGestureListener unwrap() {
            return real;
        }

        public void onGesture(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            real.onGesture(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onGestureCancelled(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            real.onGestureCancelled(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onGestureEnded(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            real.onGestureEnded(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onGestureStarted(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1) {
            real.onGestureStarted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnGesturePerformedListener {
        private final android.gesture.GestureOverlayView.OnGesturePerformedListener real;

        public OnGesturePerformedListener(android.gesture.GestureOverlayView.OnGesturePerformedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturePerformedListener wrap(android.gesture.GestureOverlayView.OnGesturePerformedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturePerformedListener(real);
        }

        public android.gesture.GestureOverlayView.OnGesturePerformedListener unwrap() {
            return real;
        }

        public void onGesturePerformed(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0, com.micklab.dcg.wrapper.android.gesture.Gesture arg1) {
            real.onGesturePerformed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnGesturingListener {
        private final android.gesture.GestureOverlayView.OnGesturingListener real;

        public OnGesturingListener(android.gesture.GestureOverlayView.OnGesturingListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturingListener wrap(android.gesture.GestureOverlayView.OnGesturingListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.gesture.GestureOverlayView.OnGesturingListener(real);
        }

        public android.gesture.GestureOverlayView.OnGesturingListener unwrap() {
            return real;
        }

        public void onGesturingEnded(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0) {
            real.onGesturingEnded(arg0 == null ? null : arg0.unwrap());
        }

        public void onGesturingStarted(com.micklab.dcg.wrapper.android.gesture.GestureOverlayView arg0) {
            real.onGesturingStarted(arg0 == null ? null : arg0.unwrap());
        }

    }
}
