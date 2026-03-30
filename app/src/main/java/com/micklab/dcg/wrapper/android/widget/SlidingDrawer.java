// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class SlidingDrawer {
    private final android.widget.SlidingDrawer real;

    public SlidingDrawer(android.widget.SlidingDrawer real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.SlidingDrawer wrap(android.widget.SlidingDrawer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SlidingDrawer(real);
    }

    public android.widget.SlidingDrawer unwrap() {
        return real;
    }

    public SlidingDrawer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.SlidingDrawer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public SlidingDrawer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.SlidingDrawer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public SlidingDrawer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.SlidingDrawer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void animateClose() {
        real.animateClose();
    }

    public void animateOpen() {
        real.animateOpen();
    }

    public void animateToggle() {
        real.animateToggle();
    }

    public void close() {
        real.close();
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.view.View getContent() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getContent());
    }

    public com.micklab.dcg.wrapper.android.view.View getHandle() {
        return com.micklab.dcg.wrapper.android.view.View.wrap(real.getHandle());
    }

    public boolean isMoving() {
        return real.isMoving();
    }

    public boolean isOpened() {
        return real.isOpened();
    }

    public void lock() {
        real.lock();
    }

    public boolean onInterceptTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onInterceptTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void open() {
        real.open();
    }

    public void setOnDrawerCloseListener(com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerCloseListener arg0) {
        real.setOnDrawerCloseListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnDrawerOpenListener(com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerOpenListener arg0) {
        real.setOnDrawerOpenListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnDrawerScrollListener(com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerScrollListener arg0) {
        real.setOnDrawerScrollListener(arg0 == null ? null : arg0.unwrap());
    }

    public void toggle() {
        real.toggle();
    }

    public void unlock() {
        real.unlock();
    }

    public static final int ORIENTATION_HORIZONTAL = android.widget.SlidingDrawer.ORIENTATION_HORIZONTAL;
    public static final int ORIENTATION_VERTICAL = android.widget.SlidingDrawer.ORIENTATION_VERTICAL;

    public static final class OnDrawerCloseListener {
        private final android.widget.SlidingDrawer.OnDrawerCloseListener real;

        public OnDrawerCloseListener(android.widget.SlidingDrawer.OnDrawerCloseListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerCloseListener wrap(android.widget.SlidingDrawer.OnDrawerCloseListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerCloseListener(real);
        }

        public android.widget.SlidingDrawer.OnDrawerCloseListener unwrap() {
            return real;
        }

        public void onDrawerClosed() {
            real.onDrawerClosed();
        }

    }
    public static final class OnDrawerOpenListener {
        private final android.widget.SlidingDrawer.OnDrawerOpenListener real;

        public OnDrawerOpenListener(android.widget.SlidingDrawer.OnDrawerOpenListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerOpenListener wrap(android.widget.SlidingDrawer.OnDrawerOpenListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerOpenListener(real);
        }

        public android.widget.SlidingDrawer.OnDrawerOpenListener unwrap() {
            return real;
        }

        public void onDrawerOpened() {
            real.onDrawerOpened();
        }

    }
    public static final class OnDrawerScrollListener {
        private final android.widget.SlidingDrawer.OnDrawerScrollListener real;

        public OnDrawerScrollListener(android.widget.SlidingDrawer.OnDrawerScrollListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerScrollListener wrap(android.widget.SlidingDrawer.OnDrawerScrollListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.SlidingDrawer.OnDrawerScrollListener(real);
        }

        public android.widget.SlidingDrawer.OnDrawerScrollListener unwrap() {
            return real;
        }

        public void onScrollEnded() {
            real.onScrollEnded();
        }

        public void onScrollStarted() {
            real.onScrollStarted();
        }

    }
}
