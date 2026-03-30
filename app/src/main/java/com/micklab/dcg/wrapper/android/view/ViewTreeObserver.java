// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class ViewTreeObserver {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewTreeObserver(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver wrap(android.view.ViewTreeObserver real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver(real, (__DcgwBridgeToken) null);
    }

    public android.view.ViewTreeObserver getReal() {
        return (android.view.ViewTreeObserver) real;
    }

    public android.view.ViewTreeObserver unwrap() {
        return getReal();
    }

    public void addOnDrawListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnDrawListener arg0) {
        ((android.view.ViewTreeObserver) real).addOnDrawListener(arg0 == null ? null : arg0.getReal());
    }

    public void addOnGlobalFocusChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalFocusChangeListener arg0) {
        ((android.view.ViewTreeObserver) real).addOnGlobalFocusChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void addOnGlobalLayoutListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalLayoutListener arg0) {
        ((android.view.ViewTreeObserver) real).addOnGlobalLayoutListener(arg0 == null ? null : arg0.getReal());
    }

    public void addOnPreDrawListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnPreDrawListener arg0) {
        ((android.view.ViewTreeObserver) real).addOnPreDrawListener(arg0 == null ? null : arg0.getReal());
    }

    public void addOnScrollChangedListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnScrollChangedListener arg0) {
        ((android.view.ViewTreeObserver) real).addOnScrollChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void addOnTouchModeChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnTouchModeChangeListener arg0) {
        ((android.view.ViewTreeObserver) real).addOnTouchModeChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void addOnWindowAttachListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowAttachListener arg0) {
        ((android.view.ViewTreeObserver) real).addOnWindowAttachListener(arg0 == null ? null : arg0.getReal());
    }

    public void addOnWindowFocusChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowFocusChangeListener arg0) {
        ((android.view.ViewTreeObserver) real).addOnWindowFocusChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void addOnWindowVisibilityChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowVisibilityChangeListener arg0) {
        ((android.view.ViewTreeObserver) real).addOnWindowVisibilityChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchOnDraw() {
        ((android.view.ViewTreeObserver) real).dispatchOnDraw();
    }

    public void dispatchOnGlobalLayout() {
        ((android.view.ViewTreeObserver) real).dispatchOnGlobalLayout();
    }

    public boolean dispatchOnPreDraw() {
        return ((android.view.ViewTreeObserver) real).dispatchOnPreDraw();
    }

    public boolean isAlive() {
        return ((android.view.ViewTreeObserver) real).isAlive();
    }

    public void registerFrameCommitCallback(java.lang.Runnable arg0) {
        ((android.view.ViewTreeObserver) real).registerFrameCommitCallback(arg0);
    }

    public void removeGlobalOnLayoutListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalLayoutListener arg0) {
        ((android.view.ViewTreeObserver) real).removeGlobalOnLayoutListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnDrawListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnDrawListener arg0) {
        ((android.view.ViewTreeObserver) real).removeOnDrawListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnGlobalFocusChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalFocusChangeListener arg0) {
        ((android.view.ViewTreeObserver) real).removeOnGlobalFocusChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnGlobalLayoutListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalLayoutListener arg0) {
        ((android.view.ViewTreeObserver) real).removeOnGlobalLayoutListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnPreDrawListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnPreDrawListener arg0) {
        ((android.view.ViewTreeObserver) real).removeOnPreDrawListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnScrollChangedListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnScrollChangedListener arg0) {
        ((android.view.ViewTreeObserver) real).removeOnScrollChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnTouchModeChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnTouchModeChangeListener arg0) {
        ((android.view.ViewTreeObserver) real).removeOnTouchModeChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnWindowAttachListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowAttachListener arg0) {
        ((android.view.ViewTreeObserver) real).removeOnWindowAttachListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnWindowFocusChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowFocusChangeListener arg0) {
        ((android.view.ViewTreeObserver) real).removeOnWindowFocusChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public void removeOnWindowVisibilityChangeListener(com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowVisibilityChangeListener arg0) {
        ((android.view.ViewTreeObserver) real).removeOnWindowVisibilityChangeListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean unregisterFrameCommitCallback(java.lang.Runnable arg0) {
        return ((android.view.ViewTreeObserver) real).unregisterFrameCommitCallback(arg0);
    }

    public static final class OnDrawListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnDrawListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnDrawListener wrap(android.view.ViewTreeObserver.OnDrawListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnDrawListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewTreeObserver.OnDrawListener getReal() {
            return (android.view.ViewTreeObserver.OnDrawListener) real;
        }

        public android.view.ViewTreeObserver.OnDrawListener unwrap() {
            return getReal();
        }

        public void onDraw() {
            ((android.view.ViewTreeObserver.OnDrawListener) real).onDraw();
        }

    }
    public static final class OnGlobalFocusChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnGlobalFocusChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalFocusChangeListener wrap(android.view.ViewTreeObserver.OnGlobalFocusChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalFocusChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewTreeObserver.OnGlobalFocusChangeListener getReal() {
            return (android.view.ViewTreeObserver.OnGlobalFocusChangeListener) real;
        }

        public android.view.ViewTreeObserver.OnGlobalFocusChangeListener unwrap() {
            return getReal();
        }

        public void onGlobalFocusChanged(com.micklab.dcg.wrapper.android.view.View arg0, com.micklab.dcg.wrapper.android.view.View arg1) {
            ((android.view.ViewTreeObserver.OnGlobalFocusChangeListener) real).onGlobalFocusChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class OnGlobalLayoutListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnGlobalLayoutListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalLayoutListener wrap(android.view.ViewTreeObserver.OnGlobalLayoutListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnGlobalLayoutListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewTreeObserver.OnGlobalLayoutListener getReal() {
            return (android.view.ViewTreeObserver.OnGlobalLayoutListener) real;
        }

        public android.view.ViewTreeObserver.OnGlobalLayoutListener unwrap() {
            return getReal();
        }

        public void onGlobalLayout() {
            ((android.view.ViewTreeObserver.OnGlobalLayoutListener) real).onGlobalLayout();
        }

    }
    public static final class OnPreDrawListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnPreDrawListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnPreDrawListener wrap(android.view.ViewTreeObserver.OnPreDrawListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnPreDrawListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewTreeObserver.OnPreDrawListener getReal() {
            return (android.view.ViewTreeObserver.OnPreDrawListener) real;
        }

        public android.view.ViewTreeObserver.OnPreDrawListener unwrap() {
            return getReal();
        }

        public boolean onPreDraw() {
            return ((android.view.ViewTreeObserver.OnPreDrawListener) real).onPreDraw();
        }

    }
    public static final class OnScrollChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnScrollChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnScrollChangedListener wrap(android.view.ViewTreeObserver.OnScrollChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnScrollChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewTreeObserver.OnScrollChangedListener getReal() {
            return (android.view.ViewTreeObserver.OnScrollChangedListener) real;
        }

        public android.view.ViewTreeObserver.OnScrollChangedListener unwrap() {
            return getReal();
        }

        public void onScrollChanged() {
            ((android.view.ViewTreeObserver.OnScrollChangedListener) real).onScrollChanged();
        }

    }
    public static final class OnTouchModeChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnTouchModeChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnTouchModeChangeListener wrap(android.view.ViewTreeObserver.OnTouchModeChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnTouchModeChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewTreeObserver.OnTouchModeChangeListener getReal() {
            return (android.view.ViewTreeObserver.OnTouchModeChangeListener) real;
        }

        public android.view.ViewTreeObserver.OnTouchModeChangeListener unwrap() {
            return getReal();
        }

        public void onTouchModeChanged(boolean arg0) {
            ((android.view.ViewTreeObserver.OnTouchModeChangeListener) real).onTouchModeChanged(arg0);
        }

    }
    public static final class OnWindowAttachListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnWindowAttachListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowAttachListener wrap(android.view.ViewTreeObserver.OnWindowAttachListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowAttachListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewTreeObserver.OnWindowAttachListener getReal() {
            return (android.view.ViewTreeObserver.OnWindowAttachListener) real;
        }

        public android.view.ViewTreeObserver.OnWindowAttachListener unwrap() {
            return getReal();
        }

        public void onWindowAttached() {
            ((android.view.ViewTreeObserver.OnWindowAttachListener) real).onWindowAttached();
        }

        public void onWindowDetached() {
            ((android.view.ViewTreeObserver.OnWindowAttachListener) real).onWindowDetached();
        }

    }
    public static final class OnWindowFocusChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnWindowFocusChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowFocusChangeListener wrap(android.view.ViewTreeObserver.OnWindowFocusChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowFocusChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewTreeObserver.OnWindowFocusChangeListener getReal() {
            return (android.view.ViewTreeObserver.OnWindowFocusChangeListener) real;
        }

        public android.view.ViewTreeObserver.OnWindowFocusChangeListener unwrap() {
            return getReal();
        }

        public void onWindowFocusChanged(boolean arg0) {
            ((android.view.ViewTreeObserver.OnWindowFocusChangeListener) real).onWindowFocusChanged(arg0);
        }

    }
    public static final class OnWindowVisibilityChangeListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnWindowVisibilityChangeListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowVisibilityChangeListener wrap(android.view.ViewTreeObserver.OnWindowVisibilityChangeListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.ViewTreeObserver.OnWindowVisibilityChangeListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.ViewTreeObserver.OnWindowVisibilityChangeListener getReal() {
            return (android.view.ViewTreeObserver.OnWindowVisibilityChangeListener) real;
        }

        public android.view.ViewTreeObserver.OnWindowVisibilityChangeListener unwrap() {
            return getReal();
        }

        public void onWindowVisibilityChanged(int arg0) {
            ((android.view.ViewTreeObserver.OnWindowVisibilityChangeListener) real).onWindowVisibilityChanged(arg0);
        }

    }
}
