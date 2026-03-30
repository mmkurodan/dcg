// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SlidingDrawer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SlidingDrawer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SlidingDrawer wrap(android.widget.SlidingDrawer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SlidingDrawer(real, (__DcgwBridgeToken) null);
    }

    public android.widget.SlidingDrawer getReal() {
        return (android.widget.SlidingDrawer) real;
    }

    public android.widget.SlidingDrawer unwrap() {
        return getReal();
    }

    public SlidingDrawer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.SlidingDrawer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public SlidingDrawer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.SlidingDrawer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public SlidingDrawer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.SlidingDrawer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void animateClose() {
        ((android.widget.SlidingDrawer) real).animateClose();
    }

    public void animateOpen() {
        ((android.widget.SlidingDrawer) real).animateOpen();
    }

    public void animateToggle() {
        ((android.widget.SlidingDrawer) real).animateToggle();
    }

    public void close() {
        ((android.widget.SlidingDrawer) real).close();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.SlidingDrawer) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.View getContent() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.SlidingDrawer) real).getContent());
    }

    public com.micklab.dcg.wrapper.android.view.View getHandle() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(((android.widget.SlidingDrawer) real).getHandle());
    }

    public boolean isMoving() {
        return ((android.widget.SlidingDrawer) real).isMoving();
    }

    public boolean isOpened() {
        return ((android.widget.SlidingDrawer) real).isOpened();
    }

    public void lock() {
        ((android.widget.SlidingDrawer) real).lock();
    }

    public boolean onInterceptTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.SlidingDrawer) real).onInterceptTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.SlidingDrawer) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public void open() {
        ((android.widget.SlidingDrawer) real).open();
    }

    public void setOnDrawerCloseListener(com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerCloseListener arg0) {
        ((android.widget.SlidingDrawer) real).setOnDrawerCloseListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnDrawerOpenListener(com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerOpenListener arg0) {
        ((android.widget.SlidingDrawer) real).setOnDrawerOpenListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnDrawerScrollListener(com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerScrollListener arg0) {
        ((android.widget.SlidingDrawer) real).setOnDrawerScrollListener(arg0 == null ? null : arg0.getReal());
    }

    public void toggle() {
        ((android.widget.SlidingDrawer) real).toggle();
    }

    public void unlock() {
        ((android.widget.SlidingDrawer) real).unlock();
    }

    public static final int ORIENTATION_HORIZONTAL = android.widget.SlidingDrawer.ORIENTATION_HORIZONTAL;
    public static final int ORIENTATION_VERTICAL = android.widget.SlidingDrawer.ORIENTATION_VERTICAL;

    public static final class OnDrawerCloseListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDrawerCloseListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerCloseListener wrap(android.widget.SlidingDrawer.OnDrawerCloseListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerCloseListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.SlidingDrawer.OnDrawerCloseListener getReal() {
            return (android.widget.SlidingDrawer.OnDrawerCloseListener) real;
        }

        public android.widget.SlidingDrawer.OnDrawerCloseListener unwrap() {
            return getReal();
        }

        public void onDrawerClosed() {
            ((android.widget.SlidingDrawer.OnDrawerCloseListener) real).onDrawerClosed();
        }

    }
    public static final class OnDrawerOpenListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDrawerOpenListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerOpenListener wrap(android.widget.SlidingDrawer.OnDrawerOpenListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerOpenListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.SlidingDrawer.OnDrawerOpenListener getReal() {
            return (android.widget.SlidingDrawer.OnDrawerOpenListener) real;
        }

        public android.widget.SlidingDrawer.OnDrawerOpenListener unwrap() {
            return getReal();
        }

        public void onDrawerOpened() {
            ((android.widget.SlidingDrawer.OnDrawerOpenListener) real).onDrawerOpened();
        }

    }
    public static final class OnDrawerScrollListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDrawerScrollListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerScrollListener wrap(android.widget.SlidingDrawer.OnDrawerScrollListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerScrollListener(real, (__DcgwBridgeToken) null);
        }

        public android.widget.SlidingDrawer.OnDrawerScrollListener getReal() {
            return (android.widget.SlidingDrawer.OnDrawerScrollListener) real;
        }

        public android.widget.SlidingDrawer.OnDrawerScrollListener unwrap() {
            return getReal();
        }

        public void onScrollEnded() {
            ((android.widget.SlidingDrawer.OnDrawerScrollListener) real).onScrollEnded();
        }

        public void onScrollStarted() {
            ((android.widget.SlidingDrawer.OnDrawerScrollListener) real).onScrollStarted();
        }

    }
}
