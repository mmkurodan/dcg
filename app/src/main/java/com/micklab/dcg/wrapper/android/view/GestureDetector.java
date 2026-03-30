// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class GestureDetector {
    private final android.view.GestureDetector real;

    public GestureDetector(android.view.GestureDetector real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.GestureDetector wrap(android.view.GestureDetector real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.GestureDetector(real);
    }

    public android.view.GestureDetector unwrap() {
        return real;
    }

    public GestureDetector(com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener arg0) {
        this(new android.view.GestureDetector(arg0 == null ? null : arg0.unwrap()));
    }

    public GestureDetector(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener arg1) {
        this(new android.view.GestureDetector(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public GestureDetector(com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        this(new android.view.GestureDetector(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public GestureDetector(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        this(new android.view.GestureDetector(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public GestureDetector(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener arg1, com.micklab.dcg.wrapper.android.os.Handler arg2, boolean arg3) {
        this(new android.view.GestureDetector(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public boolean isLongpressEnabled() {
        return real.isLongpressEnabled();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void setContextClickListener(com.micklab.dcg.wrapper.android.view.GestureDetector.OnContextClickListener arg0) {
        real.setContextClickListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setIsLongpressEnabled(boolean arg0) {
        real.setIsLongpressEnabled(arg0);
    }

    public void setOnDoubleTapListener(com.micklab.dcg.wrapper.android.view.GestureDetector.OnDoubleTapListener arg0) {
        real.setOnDoubleTapListener(arg0 == null ? null : arg0.unwrap());
    }

    public static final class OnContextClickListener {
        private final android.view.GestureDetector.OnContextClickListener real;

        public OnContextClickListener(android.view.GestureDetector.OnContextClickListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.GestureDetector.OnContextClickListener wrap(android.view.GestureDetector.OnContextClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.GestureDetector.OnContextClickListener(real);
        }

        public android.view.GestureDetector.OnContextClickListener unwrap() {
            return real;
        }

        public boolean onContextClick(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onContextClick(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnDoubleTapListener {
        private final android.view.GestureDetector.OnDoubleTapListener real;

        public OnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.GestureDetector.OnDoubleTapListener wrap(android.view.GestureDetector.OnDoubleTapListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.GestureDetector.OnDoubleTapListener(real);
        }

        public android.view.GestureDetector.OnDoubleTapListener unwrap() {
            return real;
        }

        public boolean onDoubleTap(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onDoubleTap(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onDoubleTapEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onDoubleTapEvent(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onSingleTapConfirmed(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onSingleTapConfirmed(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OnGestureListener {
        private final android.view.GestureDetector.OnGestureListener real;

        public OnGestureListener(android.view.GestureDetector.OnGestureListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener wrap(android.view.GestureDetector.OnGestureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener(real);
        }

        public android.view.GestureDetector.OnGestureListener unwrap() {
            return real;
        }

        public boolean onDown(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onDown(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onFling(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, float arg2, float arg3) {
            return real.onFling(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
        }

        public void onLongPress(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            real.onLongPress(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onScroll(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, float arg2, float arg3) {
            return real.onScroll(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
        }

        public void onShowPress(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            real.onShowPress(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onSingleTapUp(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onSingleTapUp(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class SimpleOnGestureListener {
        private final android.view.GestureDetector.SimpleOnGestureListener real;

        public SimpleOnGestureListener(android.view.GestureDetector.SimpleOnGestureListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.GestureDetector.SimpleOnGestureListener wrap(android.view.GestureDetector.SimpleOnGestureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.GestureDetector.SimpleOnGestureListener(real);
        }

        public android.view.GestureDetector.SimpleOnGestureListener unwrap() {
            return real;
        }

        public SimpleOnGestureListener() {
            this(new android.view.GestureDetector.SimpleOnGestureListener());
        }

        public boolean onContextClick(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onContextClick(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onDoubleTap(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onDoubleTap(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onDoubleTapEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onDoubleTapEvent(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onDown(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onDown(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onFling(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, float arg2, float arg3) {
            return real.onFling(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
        }

        public void onLongPress(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            real.onLongPress(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onScroll(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, float arg2, float arg3) {
            return real.onScroll(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
        }

        public void onShowPress(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            real.onShowPress(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onSingleTapConfirmed(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onSingleTapConfirmed(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onSingleTapUp(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onSingleTapUp(arg0 == null ? null : arg0.unwrap());
        }

    }
}
