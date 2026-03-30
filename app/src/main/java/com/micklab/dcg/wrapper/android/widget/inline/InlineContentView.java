// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget.inline;

public final class InlineContentView {
    private final android.widget.inline.InlineContentView real;

    public InlineContentView(android.widget.inline.InlineContentView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.inline.InlineContentView wrap(android.widget.inline.InlineContentView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.inline.InlineContentView(real);
    }

    public android.widget.inline.InlineContentView unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.view.SurfaceControl getSurfaceControl() {
        return com.micklab.dcg.wrapper.android.view.SurfaceControl.wrap(real.getSurfaceControl());
    }

    public boolean isZOrderedOnTop() {
        return real.isZOrderedOnTop();
    }

    public void onLayout(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        real.onLayout(arg0, arg1, arg2, arg3, arg4);
    }

    public void setClipBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setClipBounds(arg0 == null ? null : arg0.unwrap());
    }

    public void setSurfaceControlCallback(com.micklab.dcg.wrapper.android.widget.inline.InlineContentView.SurfaceControlCallback arg0) {
        real.setSurfaceControlCallback(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setZOrderedOnTop(boolean arg0) {
        return real.setZOrderedOnTop(arg0);
    }

    public static final class SurfaceControlCallback {
        private final android.widget.inline.InlineContentView.SurfaceControlCallback real;

        public SurfaceControlCallback(android.widget.inline.InlineContentView.SurfaceControlCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.inline.InlineContentView.SurfaceControlCallback wrap(android.widget.inline.InlineContentView.SurfaceControlCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.inline.InlineContentView.SurfaceControlCallback(real);
        }

        public android.widget.inline.InlineContentView.SurfaceControlCallback unwrap() {
            return real;
        }

        public void onCreated(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
            real.onCreated(arg0 == null ? null : arg0.unwrap());
        }

        public void onDestroyed(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
            real.onDestroyed(arg0 == null ? null : arg0.unwrap());
        }

    }
}
