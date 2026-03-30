// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget.inline;

public final class InlineContentView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InlineContentView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.inline.InlineContentView wrap(android.widget.inline.InlineContentView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.inline.InlineContentView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.inline.InlineContentView getReal() {
        return (android.widget.inline.InlineContentView) real;
    }

    public android.widget.inline.InlineContentView unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.view.SurfaceControl getSurfaceControl() {
        return com.micklab.dcg.wrapper.android.view.SurfaceControl.wrap(((android.widget.inline.InlineContentView) real).getSurfaceControl());
    }

    public boolean isZOrderedOnTop() {
        return ((android.widget.inline.InlineContentView) real).isZOrderedOnTop();
    }

    public void onLayout(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.widget.inline.InlineContentView) real).onLayout(arg0, arg1, arg2, arg3, arg4);
    }

    public void setClipBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.widget.inline.InlineContentView) real).setClipBounds(arg0 == null ? null : arg0.getReal());
    }

    public void setSurfaceControlCallback(com.micklab.dcg.wrapper.android.widget.inline.InlineContentView.SurfaceControlCallback arg0) {
        ((android.widget.inline.InlineContentView) real).setSurfaceControlCallback(arg0 == null ? null : arg0.getReal());
    }

    public boolean setZOrderedOnTop(boolean arg0) {
        return ((android.widget.inline.InlineContentView) real).setZOrderedOnTop(arg0);
    }

    public static final class SurfaceControlCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SurfaceControlCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.inline.InlineContentView.SurfaceControlCallback wrap(android.widget.inline.InlineContentView.SurfaceControlCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.inline.InlineContentView.SurfaceControlCallback(real, (__DcgwBridgeToken) null);
        }

        public android.widget.inline.InlineContentView.SurfaceControlCallback getReal() {
            return (android.widget.inline.InlineContentView.SurfaceControlCallback) real;
        }

        public android.widget.inline.InlineContentView.SurfaceControlCallback unwrap() {
            return getReal();
        }

        public void onCreated(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
            ((android.widget.inline.InlineContentView.SurfaceControlCallback) real).onCreated(arg0 == null ? null : arg0.getReal());
        }

        public void onDestroyed(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
            ((android.widget.inline.InlineContentView.SurfaceControlCallback) real).onDestroyed(arg0 == null ? null : arg0.getReal());
        }

    }
}
