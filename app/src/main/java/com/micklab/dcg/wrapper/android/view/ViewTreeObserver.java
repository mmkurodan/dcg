// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewTreeObserver {
    private final android.view.ViewTreeObserver real;

    public ViewTreeObserver(android.view.ViewTreeObserver real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver wrap(android.view.ViewTreeObserver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver(real);
    }

    public android.view.ViewTreeObserver unwrap() {
        return real;
    }

    public void addOnDrawListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnDrawListener arg0) {
        real.addOnDrawListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnGlobalFocusChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalFocusChangeListener arg0) {
        real.addOnGlobalFocusChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnGlobalLayoutListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalLayoutListener arg0) {
        real.addOnGlobalLayoutListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnPreDrawListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnPreDrawListener arg0) {
        real.addOnPreDrawListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnScrollChangedListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnScrollChangedListener arg0) {
        real.addOnScrollChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnTouchModeChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnTouchModeChangeListener arg0) {
        real.addOnTouchModeChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnWindowAttachListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowAttachListener arg0) {
        real.addOnWindowAttachListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnWindowFocusChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowFocusChangeListener arg0) {
        real.addOnWindowFocusChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void addOnWindowVisibilityChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowVisibilityChangeListener arg0) {
        real.addOnWindowVisibilityChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchOnDraw() {
        real.dispatchOnDraw();
    }

    public void dispatchOnGlobalLayout() {
        real.dispatchOnGlobalLayout();
    }

    public boolean dispatchOnPreDraw() {
        return real.dispatchOnPreDraw();
    }

    public boolean isAlive() {
        return real.isAlive();
    }

    public void registerFrameCommitCallback(java.lang.Runnable arg0) {
        real.registerFrameCommitCallback(arg0);
    }

    public void removeGlobalOnLayoutListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalLayoutListener arg0) {
        real.removeGlobalOnLayoutListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnDrawListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnDrawListener arg0) {
        real.removeOnDrawListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnGlobalFocusChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalFocusChangeListener arg0) {
        real.removeOnGlobalFocusChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnGlobalLayoutListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalLayoutListener arg0) {
        real.removeOnGlobalLayoutListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnPreDrawListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnPreDrawListener arg0) {
        real.removeOnPreDrawListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnScrollChangedListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnScrollChangedListener arg0) {
        real.removeOnScrollChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnTouchModeChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnTouchModeChangeListener arg0) {
        real.removeOnTouchModeChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnWindowAttachListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowAttachListener arg0) {
        real.removeOnWindowAttachListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnWindowFocusChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowFocusChangeListener arg0) {
        real.removeOnWindowFocusChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public void removeOnWindowVisibilityChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowVisibilityChangeListener arg0) {
        real.removeOnWindowVisibilityChangeListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean unregisterFrameCommitCallback(java.lang.Runnable arg0) {
        return real.unregisterFrameCommitCallback(arg0);
    }

    public static final class OnDrawListener {
        private final android.view.ViewTreeObserver.OnDrawListener real;

        public OnDrawListener(android.view.ViewTreeObserver.OnDrawListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnDrawListener wrap(android.view.ViewTreeObserver.OnDrawListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnDrawListener(real);
        }

        public android.view.ViewTreeObserver.OnDrawListener unwrap() {
            return real;
        }

        public void onDraw() {
            real.onDraw();
        }

    }
    public static final class OnGlobalFocusChangeListener {
        private final android.view.ViewTreeObserver.OnGlobalFocusChangeListener real;

        public OnGlobalFocusChangeListener(android.view.ViewTreeObserver.OnGlobalFocusChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalFocusChangeListener wrap(android.view.ViewTreeObserver.OnGlobalFocusChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalFocusChangeListener(real);
        }

        public android.view.ViewTreeObserver.OnGlobalFocusChangeListener unwrap() {
            return real;
        }

        public void onGlobalFocusChanged(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
            real.onGlobalFocusChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class OnGlobalLayoutListener {
        private final android.view.ViewTreeObserver.OnGlobalLayoutListener real;

        public OnGlobalLayoutListener(android.view.ViewTreeObserver.OnGlobalLayoutListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalLayoutListener wrap(android.view.ViewTreeObserver.OnGlobalLayoutListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalLayoutListener(real);
        }

        public android.view.ViewTreeObserver.OnGlobalLayoutListener unwrap() {
            return real;
        }

        public void onGlobalLayout() {
            real.onGlobalLayout();
        }

    }
    public static final class OnPreDrawListener {
        private final android.view.ViewTreeObserver.OnPreDrawListener real;

        public OnPreDrawListener(android.view.ViewTreeObserver.OnPreDrawListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnPreDrawListener wrap(android.view.ViewTreeObserver.OnPreDrawListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnPreDrawListener(real);
        }

        public android.view.ViewTreeObserver.OnPreDrawListener unwrap() {
            return real;
        }

        public boolean onPreDraw() {
            return real.onPreDraw();
        }

    }
    public static final class OnScrollChangedListener {
        private final android.view.ViewTreeObserver.OnScrollChangedListener real;

        public OnScrollChangedListener(android.view.ViewTreeObserver.OnScrollChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnScrollChangedListener wrap(android.view.ViewTreeObserver.OnScrollChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnScrollChangedListener(real);
        }

        public android.view.ViewTreeObserver.OnScrollChangedListener unwrap() {
            return real;
        }

        public void onScrollChanged() {
            real.onScrollChanged();
        }

    }
    public static final class OnTouchModeChangeListener {
        private final android.view.ViewTreeObserver.OnTouchModeChangeListener real;

        public OnTouchModeChangeListener(android.view.ViewTreeObserver.OnTouchModeChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnTouchModeChangeListener wrap(android.view.ViewTreeObserver.OnTouchModeChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnTouchModeChangeListener(real);
        }

        public android.view.ViewTreeObserver.OnTouchModeChangeListener unwrap() {
            return real;
        }

        public void onTouchModeChanged(boolean arg0) {
            real.onTouchModeChanged(arg0);
        }

    }
    public static final class OnWindowAttachListener {
        private final android.view.ViewTreeObserver.OnWindowAttachListener real;

        public OnWindowAttachListener(android.view.ViewTreeObserver.OnWindowAttachListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowAttachListener wrap(android.view.ViewTreeObserver.OnWindowAttachListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowAttachListener(real);
        }

        public android.view.ViewTreeObserver.OnWindowAttachListener unwrap() {
            return real;
        }

        public void onWindowAttached() {
            real.onWindowAttached();
        }

        public void onWindowDetached() {
            real.onWindowDetached();
        }

    }
    public static final class OnWindowFocusChangeListener {
        private final android.view.ViewTreeObserver.OnWindowFocusChangeListener real;

        public OnWindowFocusChangeListener(android.view.ViewTreeObserver.OnWindowFocusChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowFocusChangeListener wrap(android.view.ViewTreeObserver.OnWindowFocusChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowFocusChangeListener(real);
        }

        public android.view.ViewTreeObserver.OnWindowFocusChangeListener unwrap() {
            return real;
        }

        public void onWindowFocusChanged(boolean arg0) {
            real.onWindowFocusChanged(arg0);
        }

    }
    public static final class OnWindowVisibilityChangeListener {
        private final android.view.ViewTreeObserver.OnWindowVisibilityChangeListener real;

        public OnWindowVisibilityChangeListener(android.view.ViewTreeObserver.OnWindowVisibilityChangeListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowVisibilityChangeListener wrap(android.view.ViewTreeObserver.OnWindowVisibilityChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowVisibilityChangeListener(real);
        }

        public android.view.ViewTreeObserver.OnWindowVisibilityChangeListener unwrap() {
            return real;
        }

        public void onWindowVisibilityChanged(int arg0) {
            real.onWindowVisibilityChanged(arg0);
        }

    }
}
