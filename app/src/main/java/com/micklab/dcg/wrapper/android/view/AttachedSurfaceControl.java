// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class AttachedSurfaceControl {
    private final android.view.AttachedSurfaceControl real;

    public AttachedSurfaceControl(android.view.AttachedSurfaceControl real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl wrap(android.view.AttachedSurfaceControl real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl(real);
    }

    public android.view.AttachedSurfaceControl unwrap() {
        return real;
    }

    public void addOnBufferTransformHintChangedListener(com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener arg0) {
        real.addOnBufferTransformHintChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public boolean applyTransactionOnDraw(com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction arg0) {
        return real.applyTransactionOnDraw(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction buildReparentTransaction(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
        return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(real.buildReparentTransaction(arg0 == null ? null : arg0.unwrap()));
    }

    public int getBufferTransformHint() {
        return real.getBufferTransformHint();
    }

    public com.micklab.dcg.wrapper.android.window.InputTransferToken getInputTransferToken() {
        return com.micklab.dcg.wrapper.android.window.InputTransferToken.wrap(real.getInputTransferToken());
    }

    public void removeOnBufferTransformHintChangedListener(com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener arg0) {
        real.removeOnBufferTransformHintChangedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setChildBoundingInsets(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.setChildBoundingInsets(arg0 == null ? null : arg0.unwrap());
    }

    public void setTouchableRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        real.setTouchableRegion(arg0 == null ? null : arg0.unwrap());
    }

    public static final class OnBufferTransformHintChangedListener {
        private final android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener real;

        public OnBufferTransformHintChangedListener(android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener wrap(android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener(real);
        }

        public android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener unwrap() {
            return real;
        }

        public void onBufferTransformHintChanged(int arg0) {
            real.onBufferTransformHintChanged(arg0);
        }

    }
}
