// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class AttachedSurfaceControl {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AttachedSurfaceControl(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl wrap(android.view.AttachedSurfaceControl real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl(real, (__DcgwBridgeToken) null);
    }

    public android.view.AttachedSurfaceControl getReal() {
        return (android.view.AttachedSurfaceControl) real;
    }

    public android.view.AttachedSurfaceControl unwrap() {
        return getReal();
    }

    public void addOnBufferTransformHintChangedListener(com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener arg0) {
        ((android.view.AttachedSurfaceControl) real).addOnBufferTransformHintChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public boolean applyTransactionOnDraw(com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction arg0) {
        return ((android.view.AttachedSurfaceControl) real).applyTransactionOnDraw(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction buildReparentTransaction(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
        return com.micklab.dcg.wrapper.android.view.SurfaceControl.Transaction.wrap(((android.view.AttachedSurfaceControl) real).buildReparentTransaction(arg0 == null ? null : arg0.getReal()));
    }

    public int getBufferTransformHint() {
        return ((android.view.AttachedSurfaceControl) real).getBufferTransformHint();
    }

    public com.micklab.dcg.wrapper.android.window.InputTransferToken getInputTransferToken() {
        return com.micklab.dcg.wrapper.android.window.InputTransferToken.wrap(((android.view.AttachedSurfaceControl) real).getInputTransferToken());
    }

    public void removeOnBufferTransformHintChangedListener(com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener arg0) {
        ((android.view.AttachedSurfaceControl) real).removeOnBufferTransformHintChangedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setChildBoundingInsets(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.view.AttachedSurfaceControl) real).setChildBoundingInsets(arg0 == null ? null : arg0.getReal());
    }

    public void setTouchableRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        ((android.view.AttachedSurfaceControl) real).setTouchableRegion(arg0 == null ? null : arg0.getReal());
    }

    public static final class OnBufferTransformHintChangedListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnBufferTransformHintChangedListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener wrap(android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener(real, (__DcgwBridgeToken) null);
        }

        public android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener getReal() {
            return (android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener) real;
        }

        public android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener unwrap() {
            return getReal();
        }

        public void onBufferTransformHintChanged(int arg0) {
            ((android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener) real).onBufferTransformHintChanged(arg0);
        }

    }
}
