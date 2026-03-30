// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class GestureDetector {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GestureDetector(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.GestureDetector wrap(android.view.GestureDetector real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.GestureDetector(real, (__DcgwBridgeToken) null);
    }

    public android.view.GestureDetector getReal() {
        return (android.view.GestureDetector) real;
    }

    public android.view.GestureDetector unwrap() {
        return getReal();
    }

    public GestureDetector(com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener arg0) {
        this(new android.view.GestureDetector(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public GestureDetector(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener arg1) {
        this(new android.view.GestureDetector(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public GestureDetector(com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        this(new android.view.GestureDetector(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public GestureDetector(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener arg1, com.micklab.dcg.wrapper.android.os.Handler arg2) {
        this(new android.view.GestureDetector(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public GestureDetector(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener arg1, com.micklab.dcg.wrapper.android.os.Handler arg2, boolean arg3) {
        this(new android.view.GestureDetector(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal(), arg3), (__DcgwBridgeToken) null);
    }

    public boolean isLongpressEnabled() {
        return ((android.view.GestureDetector) real).isLongpressEnabled();
    }

    public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.GestureDetector) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.view.GestureDetector) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public void setContextClickListener(com.micklab.dcg.wrapper.android.view.GestureDetector.OnContextClickListener arg0) {
        ((android.view.GestureDetector) real).setContextClickListener(arg0 == null ? null : arg0.getReal());
    }

    public void setIsLongpressEnabled(boolean arg0) {
        ((android.view.GestureDetector) real).setIsLongpressEnabled(arg0);
    }

    public void setOnDoubleTapListener(com.micklab.dcg.wrapper.android.view.GestureDetector.OnDoubleTapListener arg0) {
        ((android.view.GestureDetector) real).setOnDoubleTapListener(arg0 == null ? null : arg0.getReal());
    }

    public static final class OnContextClickListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnContextClickListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.GestureDetector.OnContextClickListener wrap(android.view.GestureDetector.OnContextClickListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.GestureDetector.OnContextClickListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.GestureDetector.OnContextClickListener getReal() {
            return (android.view.GestureDetector.OnContextClickListener) real;
        }

        public android.view.GestureDetector.OnContextClickListener unwrap() {
            return getReal();
        }

        public boolean onContextClick(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.GestureDetector.OnContextClickListener) real).onContextClick(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnDoubleTapListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDoubleTapListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.GestureDetector.OnDoubleTapListener wrap(android.view.GestureDetector.OnDoubleTapListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.GestureDetector.OnDoubleTapListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.GestureDetector.OnDoubleTapListener getReal() {
            return (android.view.GestureDetector.OnDoubleTapListener) real;
        }

        public android.view.GestureDetector.OnDoubleTapListener unwrap() {
            return getReal();
        }

        public boolean onDoubleTap(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.GestureDetector.OnDoubleTapListener) real).onDoubleTap(arg0 == null ? null : arg0.getReal());
        }

        public boolean onDoubleTapEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.GestureDetector.OnDoubleTapListener) real).onDoubleTapEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean onSingleTapConfirmed(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.GestureDetector.OnDoubleTapListener) real).onSingleTapConfirmed(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OnGestureListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnGestureListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener wrap(android.view.GestureDetector.OnGestureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.GestureDetector.OnGestureListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.GestureDetector.OnGestureListener getReal() {
            return (android.view.GestureDetector.OnGestureListener) real;
        }

        public android.view.GestureDetector.OnGestureListener unwrap() {
            return getReal();
        }

        public boolean onDown(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.GestureDetector.OnGestureListener) real).onDown(arg0 == null ? null : arg0.getReal());
        }

        public boolean onFling(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, float arg2, float arg3) {
            return ((android.view.GestureDetector.OnGestureListener) real).onFling(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
        }

        public void onLongPress(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            ((android.view.GestureDetector.OnGestureListener) real).onLongPress(arg0 == null ? null : arg0.getReal());
        }

        public boolean onScroll(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, float arg2, float arg3) {
            return ((android.view.GestureDetector.OnGestureListener) real).onScroll(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
        }

        public void onShowPress(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            ((android.view.GestureDetector.OnGestureListener) real).onShowPress(arg0 == null ? null : arg0.getReal());
        }

        public boolean onSingleTapUp(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.GestureDetector.OnGestureListener) real).onSingleTapUp(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class SimpleOnGestureListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SimpleOnGestureListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.GestureDetector.SimpleOnGestureListener wrap(android.view.GestureDetector.SimpleOnGestureListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.GestureDetector.SimpleOnGestureListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.GestureDetector.SimpleOnGestureListener getReal() {
            return (android.view.GestureDetector.SimpleOnGestureListener) real;
        }

        public android.view.GestureDetector.SimpleOnGestureListener unwrap() {
            return getReal();
        }

        public SimpleOnGestureListener() {
            this(new android.view.GestureDetector.SimpleOnGestureListener(), (__DcgwBridgeToken) null);
        }

        public boolean onContextClick(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.GestureDetector.SimpleOnGestureListener) real).onContextClick(arg0 == null ? null : arg0.getReal());
        }

        public boolean onDoubleTap(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.GestureDetector.SimpleOnGestureListener) real).onDoubleTap(arg0 == null ? null : arg0.getReal());
        }

        public boolean onDoubleTapEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.GestureDetector.SimpleOnGestureListener) real).onDoubleTapEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean onDown(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.GestureDetector.SimpleOnGestureListener) real).onDown(arg0 == null ? null : arg0.getReal());
        }

        public boolean onFling(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, float arg2, float arg3) {
            return ((android.view.GestureDetector.SimpleOnGestureListener) real).onFling(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
        }

        public void onLongPress(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            ((android.view.GestureDetector.SimpleOnGestureListener) real).onLongPress(arg0 == null ? null : arg0.getReal());
        }

        public boolean onScroll(com.micklab.dcg.wrapper.android.view.MotionEvent arg0, com.micklab.dcg.wrapper.android.view.MotionEvent arg1, float arg2, float arg3) {
            return ((android.view.GestureDetector.SimpleOnGestureListener) real).onScroll(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
        }

        public void onShowPress(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            ((android.view.GestureDetector.SimpleOnGestureListener) real).onShowPress(arg0 == null ? null : arg0.getReal());
        }

        public boolean onSingleTapConfirmed(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.GestureDetector.SimpleOnGestureListener) real).onSingleTapConfirmed(arg0 == null ? null : arg0.getReal());
        }

        public boolean onSingleTapUp(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.view.GestureDetector.SimpleOnGestureListener) real).onSingleTapUp(arg0 == null ? null : arg0.getReal());
        }

    }
}
